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
    private static final String[] EXPECTED_OUTPUTS = {
            "strided_slice_18", // vocals
            "strided_slice_38", // drums
            "strided_slice_48", // bass
            "strided_slice_28", // piano
            "strided_slice_58"  // other
    };

    @Test
    public void openFiveStemModelInvokesAndProducesAudio() throws Exception {
        Context context = ApplicationProvider.getApplicationContext();
        MappedByteBuffer model = mapAsset(context, "5stems.tflite");
        Log.e(TAG, "modelBytes=" + model.capacity());
        Assert.assertTrue("5stems.tflite unexpectedly small", model.capacity() > 1_000_000);

        Interpreter.Options options = new Interpreter.Options();
        options.setNumThreads(Math.max(1, Math.min(4, Runtime.getRuntime().availableProcessors())));

        try (Interpreter interpreter = new Interpreter(model, options)) {
            Assert.assertEquals("Spleeter must expose one waveform input", 1, interpreter.getInputTensorCount());
            Assert.assertEquals("Spleeter 5-stem must expose five outputs", 5, interpreter.getOutputTensorCount());

            Tensor inputTensor = interpreter.getInputTensor(0);
            Log.e(TAG, "input name=" + inputTensor.name() + " type=" + inputTensor.dataType()
                    + " shape=" + java.util.Arrays.toString(inputTensor.shape()));
            Assert.assertEquals(DataType.FLOAT32, inputTensor.dataType());

            for (int i = 0; i < interpreter.getOutputTensorCount(); i++) {
                Tensor t = interpreter.getOutputTensor(i);
                Log.e(TAG, "output[" + i + "] name=" + t.name() + " type=" + t.dataType()
                        + " shape=" + java.util.Arrays.toString(t.shape()));
                Assert.assertEquals(DataType.FLOAT32, t.dataType());
            }

            // Keep the runtime smoke test short enough for hosted ARM CI while
            // still long enough to exercise the Spleeter STFT/U-Net pipeline.
            final int frames = 44100 * 2;
            final int channels = 2;
            interpreter.resizeInput(0, new int[]{frames, channels}, false);
            interpreter.allocateTensors();

            ByteBuffer input = ByteBuffer.allocateDirect(frames * channels * 4).order(ByteOrder.nativeOrder());
            for (int i = 0; i < frames; i++) {
                float sample = (float) (0.22 * Math.sin(2.0 * Math.PI * 440.0 * i / 44100.0)
                        + 0.08 * Math.sin(2.0 * Math.PI * 220.0 * i / 44100.0));
                input.putFloat(sample);
                input.putFloat(sample * 0.9f);
            }
            input.rewind();

            Map<Integer, Object> outputs = new HashMap<>();
            ByteBuffer[] buffers = new ByteBuffer[5];
            for (int i = 0; i < 5; i++) {
                Tensor t = interpreter.getOutputTensor(i);
                int[] shape = t.shape();
                Log.e(TAG, "resized output[" + i + "] name=" + t.name()
                        + " shape=" + java.util.Arrays.toString(shape)
                        + " bytes=" + t.numBytes());
                int bytes = Math.max(frames * channels * 4, t.numBytes());
                buffers[i] = ByteBuffer.allocateDirect(bytes).order(ByteOrder.nativeOrder());
                outputs.put(i, buffers[i]);
            }

            long startNs = System.nanoTime();
            interpreter.runForMultipleInputsOutputs(new Object[]{input}, outputs);
            long elapsedMs = (System.nanoTime() - startNs) / 1_000_000L;
            Log.e(TAG, "invokeMs=" + elapsedMs);

            boolean anyDistinctStem = false;
            double firstEnergy = -1.0;
            for (int i = 0; i < buffers.length; i++) {
                ByteBuffer b = buffers[i];
                b.rewind();
                double energy = 0.0;
                double peak = 0.0;
                int finite = 0;
                int samples = Math.min(frames * channels, b.remaining() / 4);
                for (int s = 0; s < samples; s++) {
                    float v = b.getFloat();
                    Assert.assertTrue("output contains NaN/Inf at stem " + i, Float.isFinite(v));
                    energy += (double) v * v;
                    peak = Math.max(peak, Math.abs(v));
                    finite++;
                }
                double rms = finite == 0 ? 0.0 : Math.sqrt(energy / finite);
                Log.e(TAG, "stem[" + i + "] name=" + interpreter.getOutputTensor(i).name()
                        + " samples=" + finite + " rms=" + rms + " peak=" + peak);
                Assert.assertTrue("stem output is empty: " + i, finite > 0);
                Assert.assertTrue("stem output is all zero: " + i, peak > 1e-7);
                if (i == 0) firstEnergy = energy;
                else if (Math.abs(energy - firstEnergy) > Math.max(1e-9, firstEnergy * 1e-5)) anyDistinctStem = true;
            }
            Assert.assertTrue("all five outputs appear numerically identical", anyDistinctStem);

            StringBuilder names = new StringBuilder();
            for (int i = 0; i < 5; i++) {
                if (i > 0) names.append(',');
                names.append(interpreter.getOutputTensor(i).name());
            }
            Log.e(TAG, "outputNames=" + names);
            for (String expected : EXPECTED_OUTPUTS) {
                Assert.assertTrue("missing expected output tensor " + expected, names.toString().contains(expected));
            }
        }
    }

    private static MappedByteBuffer mapAsset(Context context, String name) throws Exception {
        try (AssetFileDescriptor afd = context.getAssets().openFd(name);
             FileInputStream input = new FileInputStream(afd.getFileDescriptor())) {
            FileChannel channel = input.getChannel();
            return channel.map(FileChannel.MapMode.READ_ONLY, afd.getStartOffset(), afd.getDeclaredLength());
        }
    }
}
