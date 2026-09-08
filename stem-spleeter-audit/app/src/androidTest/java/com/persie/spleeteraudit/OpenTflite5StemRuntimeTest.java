package com.persie.spleeteraudit;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.util.Log;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.tensorflow.lite.DataType;
import org.tensorflow.lite.Interpreter;
import org.tensorflow.lite.Tensor;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RunWith(AndroidJUnit4.class)
public class OpenTflite5StemRuntimeTest {
    private static final String TAG = "OpenSpleeterAudit";
    private static final int CHANNELS = 2;
    private static final int SAMPLE_RATE = 44100;
    private static final int PRODUCTION_FRAMES = SAMPLE_RATE * 8;
    private static final int OUTPUT_BYTES = PRODUCTION_FRAMES * CHANNELS * Float.BYTES;
    private static final String[] EXPECTED_OUTPUTS = {
            "strided_slice_18", // vocals
            "strided_slice_38", // drums
            "strided_slice_48", // bass
            "strided_slice_28", // piano
            "strided_slice_58"  // other
    };

    /**
     * Regression for the on-device 1% failure.
     *
     * This converted graph exposes dynamic output tensors. Even after resizeInput
     * and allocateTensors, TFLite reports each output as [1, 1] / 4 bytes until
     * invocation. Allocating output buffers from Tensor.numBytes() therefore
     * creates five 4-byte buffers and the first invoke cannot copy the waveform
     * outputs. Production must size output buffers from the known waveform
     * contract instead.
     */
    @Test
    public void dynamicOutputsRequireWaveformSizedBuffers() throws Exception {
        Context context = ApplicationProvider.getApplicationContext();
        MappedByteBuffer model = mapAsset(context, "5stems.tflite");
        Assert.assertEquals("unexpected 5stems.tflite size", 196_639_392, model.capacity());

        Interpreter.Options options = new Interpreter.Options()
                .setNumThreads(2)
                .setUseXNNPACK(true);

        try (Interpreter interpreter = new Interpreter(model, options)) {
            validateContract(interpreter);
            interpreter.resizeInput(0, new int[]{PRODUCTION_FRAMES, CHANNELS}, false);
            interpreter.allocateTensors();

            for (int slot = 0; slot < interpreter.getOutputTensorCount(); slot++) {
                Tensor tensor = interpreter.getOutputTensor(slot);
                Log.e(TAG, "pre-invoke output[" + slot + "] name=" + tensor.name()
                        + " shape=" + Arrays.toString(tensor.shape())
                        + " numBytes=" + tensor.numBytes()
                        + " requiredWaveformBytes=" + OUTPUT_BYTES);
                Assert.assertTrue(
                        "regression fixture no longer exposes dynamic placeholder output metadata",
                        tensor.numBytes() < OUTPUT_BYTES);
            }
        }
    }

    /** Exact production-sized invocation, repeated on one interpreter. */
    @Test
    public void productionEightSecondBuffersSurviveRepeatedInvocations() throws Exception {
        Context context = ApplicationProvider.getApplicationContext();
        MappedByteBuffer model = mapAsset(context, "5stems.tflite");
        Interpreter.Options options = new Interpreter.Options()
                .setNumThreads(2)
                .setUseXNNPACK(true);

        Runtime runtime = Runtime.getRuntime();
        Log.e(TAG, "production before maxMB=" + mb(runtime.maxMemory())
                + " usedMB=" + mb(runtime.totalMemory() - runtime.freeMemory()));

        try (Interpreter interpreter = new Interpreter(model, options)) {
            validateContract(interpreter);
            interpreter.resizeInput(0, new int[]{PRODUCTION_FRAMES, CHANNELS}, false);
            interpreter.allocateTensors();

            ByteBuffer input = ByteBuffer.allocateDirect(OUTPUT_BYTES).order(ByteOrder.nativeOrder());
            fillDeterministicAudio(input, PRODUCTION_FRAMES, 0);

            Map<Integer, Object> outputs = new HashMap<>();
            ByteBuffer[] buffers = new ByteBuffer[5];
            for (int slot = 0; slot < 5; slot++) {
                // Deliberately DO NOT use tensor.numBytes(): it is 4 before invoke.
                buffers[slot] = ByteBuffer.allocateDirect(OUTPUT_BYTES).order(ByteOrder.nativeOrder());
                outputs.put(slot, buffers[slot]);
            }

            for (int invocation = 0; invocation < 2; invocation++) {
                input.clear();
                fillDeterministicAudio(input, PRODUCTION_FRAMES, invocation * PRODUCTION_FRAMES);
                for (ByteBuffer output : buffers) output.clear();

                long startNs = System.nanoTime();
                interpreter.runForMultipleInputsOutputs(new Object[]{input}, outputs);
                long elapsedMs = (System.nanoTime() - startNs) / 1_000_000L;
                Log.e(TAG, "production invocation=" + invocation
                        + " invokeMs=" + elapsedMs
                        + " usedMB=" + mb(runtime.totalMemory() - runtime.freeMemory()));

                assertFiveRealOutputs(interpreter, buffers, PRODUCTION_FRAMES, invocation);
            }
        }
    }

    /**
     * A lower-duration mode remains executable for future low-memory fallback
     * decisions. XNNPACK stays enabled because that is the production runtime.
     */
    @Test
    public void twoSecondProductionRuntimeInvokes() throws Exception {
        runOneConfig("production-2s", SAMPLE_RATE * 2, 1, true);
    }

    private static void runOneConfig(String name, int frames, int threads, boolean xnnpack) throws Exception {
        Context context = ApplicationProvider.getApplicationContext();
        MappedByteBuffer model = mapAsset(context, "5stems.tflite");
        Interpreter.Options options = new Interpreter.Options()
                .setNumThreads(threads)
                .setUseXNNPACK(xnnpack);

        try (Interpreter interpreter = new Interpreter(model, options)) {
            validateContract(interpreter);
            interpreter.resizeInput(0, new int[]{frames, CHANNELS}, false);
            interpreter.allocateTensors();

            int bytes = frames * CHANNELS * Float.BYTES;
            ByteBuffer input = ByteBuffer.allocateDirect(bytes).order(ByteOrder.nativeOrder());
            fillDeterministicAudio(input, frames, 0);
            Map<Integer, Object> outputs = new HashMap<>();
            ByteBuffer[] buffers = new ByteBuffer[5];
            for (int slot = 0; slot < 5; slot++) {
                buffers[slot] = ByteBuffer.allocateDirect(bytes).order(ByteOrder.nativeOrder());
                outputs.put(slot, buffers[slot]);
            }

            long startNs = System.nanoTime();
            interpreter.runForMultipleInputsOutputs(new Object[]{input}, outputs);
            long elapsedMs = (System.nanoTime() - startNs) / 1_000_000L;
            Log.e(TAG, name + " invokeMs=" + elapsedMs);
            assertFiveRealOutputs(interpreter, buffers, frames, 0);
        }
    }

    private static void validateContract(Interpreter interpreter) {
        Assert.assertEquals(1, interpreter.getInputTensorCount());
        Assert.assertEquals(5, interpreter.getOutputTensorCount());
        Tensor input = interpreter.getInputTensor(0);
        Assert.assertEquals("waveform", input.name());
        Assert.assertEquals(DataType.FLOAT32, input.dataType());

        StringBuilder names = new StringBuilder();
        for (int slot = 0; slot < 5; slot++) {
            Tensor output = interpreter.getOutputTensor(slot);
            Assert.assertEquals(DataType.FLOAT32, output.dataType());
            if (slot > 0) names.append(',');
            names.append(output.name());
        }
        for (String expected : EXPECTED_OUTPUTS) {
            Assert.assertTrue("missing output " + expected, names.toString().contains(expected));
        }
    }

    private static void fillDeterministicAudio(ByteBuffer input, int frames, int frameOffset) {
        input.clear();
        for (int i = 0; i < frames; i++) {
            long n = (long) frameOffset + i;
            float left = (float) (0.22 * Math.sin(2.0 * Math.PI * 440.0 * n / SAMPLE_RATE)
                    + 0.08 * Math.sin(2.0 * Math.PI * 220.0 * n / SAMPLE_RATE));
            float right = (float) (0.19 * Math.sin(2.0 * Math.PI * 330.0 * n / SAMPLE_RATE)
                    + 0.06 * Math.sin(2.0 * Math.PI * 165.0 * n / SAMPLE_RATE));
            input.putFloat(left);
            input.putFloat(right);
        }
        input.rewind();
    }

    private static void assertFiveRealOutputs(
            Interpreter interpreter,
            ByteBuffer[] buffers,
            int frames,
            int invocation) {
        boolean anyDistinctStem = false;
        double firstEnergy = -1.0;
        for (int slot = 0; slot < buffers.length; slot++) {
            ByteBuffer buffer = buffers[slot].duplicate().order(ByteOrder.nativeOrder());
            double energy = 0.0;
            double peak = 0.0;
            int samples = frames * CHANNELS;
            for (int sample = 0; sample < samples; sample++) {
                float value = buffer.getFloat(sample * Float.BYTES);
                Assert.assertTrue("NaN/Inf in output " + slot, Float.isFinite(value));
                energy += (double) value * value;
                peak = Math.max(peak, Math.abs(value));
            }
            Log.e(TAG, "invocation=" + invocation
                    + " stem=" + interpreter.getOutputTensor(slot).name()
                    + " rms=" + Math.sqrt(energy / Math.max(1, samples))
                    + " peak=" + peak
                    + " postShape=" + Arrays.toString(interpreter.getOutputTensor(slot).shape()));
            Assert.assertTrue("empty stem output " + slot, peak > 1e-7);
            if (slot == 0) firstEnergy = energy;
            else if (Math.abs(energy - firstEnergy) > Math.max(1e-9, firstEnergy * 1e-5)) {
                anyDistinctStem = true;
            }
        }
        Assert.assertTrue("all five outputs appear identical", anyDistinctStem);
    }

    private static long mb(long bytes) {
        return bytes / (1024L * 1024L);
    }

    private static MappedByteBuffer mapAsset(Context context, String name) throws Exception {
        try (AssetFileDescriptor afd = context.getAssets().openFd(name);
             FileInputStream input = new FileInputStream(afd.getFileDescriptor())) {
            return input.getChannel().map(
                    FileChannel.MapMode.READ_ONLY,
                    afd.getStartOffset(),
                    afd.getDeclaredLength());
        }
    }
}
