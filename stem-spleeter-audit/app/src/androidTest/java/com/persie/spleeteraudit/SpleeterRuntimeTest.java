package com.persie.spleeteraudit;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.util.Log;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.ttv.spleeter.SpleeterSDK;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@RunWith(AndroidJUnit4.class)
public class SpleeterRuntimeTest {
    private static final String TAG = "SpleeterAudit";
    private static final String[] MODELS = {"data1.bin", "data2.bin", "data3.bin", "data4.bin"};
    private static final long[] MODEL_SIZES = {47185920L, 57671680L, 47185920L, 49559652L};

    @Test
    public void vendorReferenceAudioProducesFiveStems() throws Exception {
        Context context = ApplicationProvider.getApplicationContext();
        Log.e(TAG, "device abi=" + android.os.Build.SUPPORTED_ABIS[0]
                + " sdk=" + android.os.Build.VERSION.SDK_INT
                + " app=" + context.getPackageName());

        for (int i = 0; i < MODELS.length; i++) {
            try (AssetFileDescriptor afd = context.getAssets().openFd(MODELS[i])) {
                Log.e(TAG, "asset " + MODELS[i] + " length=" + afd.getLength());
                Assert.assertEquals("wrong model asset size " + MODELS[i], MODEL_SIZES[i], afd.getLength());
            }
        }

        File input = new File(context.getFilesDir(), "input.wav");
        copyAsset(context, "vendor_input.wav", input);
        Log.e(TAG, "input=" + input + " bytes=" + input.length());
        Assert.assertTrue("vendor input missing", input.isFile() && input.length() > 44);

        File out = new File(context.getFilesDir(), "out");
        deleteRecursively(out);
        Assert.assertTrue("could not create output dir", out.mkdirs() || out.isDirectory());

        SpleeterSDK sdk = SpleeterSDK.createInstance(context);
        Assert.assertNotNull("createInstance returned null", sdk);

        int createCode = sdk.create();
        Log.e(TAG, "createCode=" + createCode + " SDK_OK=" + SpleeterSDK.SDK_OK
                + " INIT=" + SpleeterSDK.SDK_INIT_ERROR
                + " APPID=" + SpleeterSDK.SDK_APPID_ERROR
                + " EXPIRED=" + SpleeterSDK.SDK_EXPIRED
                + " FILE=" + SpleeterSDK.SDK_FILE_ERROR
                + " PROC=" + SpleeterSDK.SDK_PROC_ERROR
                + " NOT_ACTIVATED=" + SpleeterSDK.SDK_NOT_ACTIVATED
                + " UNKNOWN=" + SpleeterSDK.SDK_UNKNOWN
                + " INVALID/WAVE=" + SpleeterSDK.SDK_INVALID_PARAM);
        Assert.assertEquals("native create failed; see SpleeterAudit log", SpleeterSDK.SDK_OK, createCode);

        int resetCode = sdk.stopProcess();
        Log.e(TAG, "stopBeforeProcess=" + resetCode);

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> processFuture = executor.submit(() -> sdk.process(input.getAbsolutePath(), out.getAbsolutePath()));
        int lastProgress = Integer.MIN_VALUE;
        int lastPlaySize = Integer.MIN_VALUE;
        long deadline = System.nanoTime() + TimeUnit.MINUTES.toNanos(8);
        try {
            while (!processFuture.isDone() && System.nanoTime() < deadline) {
                int progress = safeProgress(sdk);
                int playSize = safePlaySize(sdk);
                if (progress != lastProgress || playSize != lastPlaySize) {
                    lastProgress = progress;
                    lastPlaySize = playSize;
                    Log.e(TAG, "running progress=" + progress + " playSize=" + playSize);
                }
                Thread.sleep(250);
            }
            Assert.assertTrue("process did not return within 8 minutes", processFuture.isDone());

            int processCode = processFuture.get(5, TimeUnit.SECONDS);
            int progressAfter = safeProgress(sdk);
            int playSize = safePlaySize(sdk);
            Log.e(TAG, "processCode=" + processCode + " progressAfter=" + progressAfter + " playSize=" + playSize);
            Assert.assertEquals("native process failed; see SpleeterAudit log", SpleeterSDK.SDK_OK, processCode);
            Assert.assertTrue("playsize stayed zero after successful process", playSize > 0);

            int saveCode = sdk.saveAllStem(out.getAbsolutePath());
            Log.e(TAG, "saveAllStemCode=" + saveCode);
            Assert.assertEquals("saveAllStem failed", SpleeterSDK.SDK_OK, saveCode);

            long saveDeadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(30);
            List<File> wavs;
            do {
                wavs = findNonEmptyWavs(out);
                if (wavs.size() >= 5) break;
                Thread.sleep(250);
            } while (System.nanoTime() < saveDeadline);

            wavs = findNonEmptyWavs(out);
            for (File wav : wavs) {
                Log.e(TAG, "output " + wav.getAbsolutePath() + " bytes=" + wav.length());
            }
            Assert.assertEquals("expected exactly five non-empty stems", 5, wavs.size());
        } finally {
            processFuture.cancel(true);
            executor.shutdownNow();
            try {
                Log.e(TAG, "final stopCode=" + sdk.stopProcess());
            } catch (Throwable t) {
                Log.e(TAG, "final stop failed", t);
            }
            try {
                Log.e(TAG, "releaseCode=" + sdk.release());
            } catch (Throwable t) {
                Log.e(TAG, "release failed", t);
            }
        }
    }

    private static int safeProgress(SpleeterSDK sdk) {
        try { return sdk.progress(); } catch (Throwable t) { Log.e(TAG, "progress threw", t); return -999; }
    }

    private static int safePlaySize(SpleeterSDK sdk) {
        try { return sdk.playsize(); } catch (Throwable t) { Log.e(TAG, "playsize threw", t); return -999; }
    }

    private static void copyAsset(Context context, String name, File target) throws Exception {
        File parent = target.getParentFile();
        if (parent != null && !parent.exists()) Assert.assertTrue(parent.mkdirs());
        try (InputStream in = context.getAssets().open(name);
             FileOutputStream out = new FileOutputStream(target, false)) {
            byte[] buffer = new byte[64 * 1024];
            int read;
            while ((read = in.read(buffer)) != -1) out.write(buffer, 0, read);
        }
    }

    private static List<File> findNonEmptyWavs(File root) {
        List<File> result = new ArrayList<>();
        walk(root, result);
        return result;
    }

    private static void walk(File file, List<File> result) {
        if (file == null || !file.exists()) return;
        if (file.isFile()) {
            if (file.getName().toLowerCase().endsWith(".wav") && file.length() > 44) result.add(file);
            return;
        }
        File[] children = file.listFiles();
        if (children != null) for (File child : children) walk(child, result);
    }

    private static void deleteRecursively(File file) {
        if (file == null || !file.exists()) return;
        if (file.isDirectory()) {
            File[] children = file.listFiles();
            if (children != null) for (File child : children) deleteRecursively(child);
        }
        if (!file.delete()) Log.w(TAG, "could not delete " + file);
    }
}
