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
import java.util.HashMap;
import java.util.Map;

@RunWith(AndroidJUnit4.class)
public class OpenTflite5StemRuntimeTest {
    private static final String TAG = "OpenSpleeterAudit";
    private static final int CHANNELS = 2;
    private static final int SAMPLE_RATE = 44100;
    private static final String[] EXPECTED_OUTPUTS = {
            "strided_slice_18", // vocals
            "strided_slice_38", // drums
            "strided_slice_48", // bass
            "strided_slice_28", // piano
            "strided_slice_58"  // other
    };

    @Test
    public void compatibleFourSecondRuntimeInvokes() throws Exception {
        runConfig("compatible-4s", SAMPLE_RATE * 4, 2, false);
    }

    @Test
    public void lowMemoryTwoSecondRuntimeInvokes() throws Exception {
        runConfig("low-memory-2s", SAMPLE_RATE * 2, 1, false);
    }

    private static void runConfig(String name, int frames, int threads, boolean xnnpack) throws Exception {
        Context context = ApplicationProvider.getApplicationContext();
        MappedByteBuffer model = mapAsset(context, "5stems.tflite");
        Assert.assertEquals("unexpected 5stems.tflite size", 196_639_392, model.capacity());

        Interpreter.Options options = new Interpreter.Options();
        options.setNumThreads(threads);
        options.setUseXNNPACK(xnnpack);

        Runtime runtime = Runtime.getRuntime();
        Log.e(TAG, name + " before maxMB=" + mb(runtime.maxMemory())
                + " usedMB=" + mb(runtime.totalMemory() - runtime.freeMemory()));

        try (Interpreter interpreter = new Interpreter(model, options)) {
            Assert.assertEquals(1, interpreter.getInputTensorCount());
            Assert.assertEquals(5, interpreter.getOutputTensorCount());
            Tensor inputTensor = interpreter.getInputTensor(0);
            Assert.assertEquals("waveform", inputTensor.name());
            Assert.assertEquals(DataType.FLOAT32, inputTensor.dataType());

            interpreter.resizeInput(0, new int[]{frames, CHANNELS}, false);
            interpreter.allocateTensors();

            Log.e(TAG, name + " allocated input=" + java.util.Arrays.toString(interpreter.getInputTensor(0).shape())
                    + " usedMB=" + mb(runtime.totalMemory() - runtime.freeMemory()));

            ByteBuffer input = ByteBuffer.allocateDirect(frames * CHANNELS * 4).order(ByteOrder.nativeOrder());
            for (int i = 0; i < frames; i++) {
                float left = (float) (0.22 * Math.sin(2.0 * Math.PI * 440.0 * i / SAMPLE_RATE)
                        + 0.08 * Math.sin(2.0 * Math.PI * 220.0 * i / SAMPLE_RATE));
                float right = (float) (0.19 * Math.sin(2.0 * Math.PI * 330.0 * i / SAMPLE_RATE)
                        + 0.06 * Math.sin(2.0 * Math.PI * 165.0 * i / SAMPLE_RATE));
                input.putFloat(left);
                input.putFloat(right);
            }
            input.rewind();

            Map<Integer, Object> outputs = new HashMap<>();
            ByteBuffer[] buffers = new ByteBuffer[5];
            StringBuilder names = new StringBuilder();
            for (int i = 0; i < 5; i++) {
                Tensor tensor = interpreter.getOutputTensor(i);
                Assert.assertEquals(DataType.FLOAT32, tensor.dataType());
                if (i > 0) names.append(',');
                names.append(tensor.name());
                Log.e(TAG, name + " output[" + i + "] " + tensor.name()
                        + " shape=" + java.util.Arrays.toString(tensor.shape())
                        + " bytes=" + tensor.numBytes());
                Assert.assertTrue("output tensor too short", tensor.numBytes() >= frames * CHANNELS * 4);
                buffers[i] = ByteBuffer.allocateDirect(tensor.numBytes()).order(ByteOrder.nativeOrder());
                outputs.put(i, buffers[i]);
            }
            for (String expected : EXPECTED_OUTPUTS) {
                Assert.assertTrue("missing output " + expected, names.toString().contains(expected));
            }

            long startNs = System.nanoTime();
            interpreter.runForMultipleInputsOutputs(new Object[]{input}, outputs);
            long elapsedMs = (System.nanoTime() - startNs) / 1_000_000L;
            Log.e(TAG, name + " invokeMs=" + elapsedMs
                    + " usedMB=" + mb(runtime.totalMemory() - runtime.freeMemory()));

            boolean anyDistinctStem = false;
            double firstEnergy = -1.0;
            for (int i = 0; i < buffers.length; i++) {
                ByteBuffer buffer = buffers[i].duplicate().order(ByteOrder.nativeOrder());
                double energy = 0.0;
                double peak = 0.0;
                int samples = Math.min(frames * CHANNELS, buffer.capacity() / 4);
                for (int sample = 0; sample < samples; sample++) {
                    float value = buffer.getFloat(sample * 4);
                    Assert.assertTrue("NaN/Inf in output " + i, Float.isFinite(value));
                    energy += (double) value * value;
                    peak = Math.max(peak, Math.abs(value));
                }
                Log.e(TAG, name + " stem=" + interpreter.getOutputTensor(i).name()
                        + " rms=" + Math.sqrt(energy / Math.max(1, samples))
                        + " peak=" + peak);
                Assert.assertTrue("empty stem output " + i, peak > 1e-7);
                if (i == 0) firstEnergy = energy;
                else if (Math.abs(energy - firstEnergy) > Math.max(1e-9, firstEnergy * 1e-5)) anyDistinctStem = true;
            }
            Assert.assertTrue("all five outputs appear identical", anyDistinctStem);
        }
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
