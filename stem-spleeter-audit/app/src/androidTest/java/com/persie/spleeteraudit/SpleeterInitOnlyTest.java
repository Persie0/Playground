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

@RunWith(AndroidJUnit4.class)
public class SpleeterInitOnlyTest {
    private static final String TAG = "SpleeterInitAudit";
    private static final String[] MODELS = {"data1.bin", "data2.bin", "data3.bin", "data4.bin"};
    private static final long[] SIZES = {47185920L, 57671680L, 47185920L, 49559652L};

    @Test
    public void reportExactVendorCreateResult() throws Exception {
        Context context = ApplicationProvider.getApplicationContext();
        Log.e(TAG, "package=" + context.getPackageName()
                + " abis=" + java.util.Arrays.toString(android.os.Build.SUPPORTED_ABIS)
                + " sdk=" + android.os.Build.VERSION.SDK_INT);
        for (int i = 0; i < MODELS.length; i++) {
            try (AssetFileDescriptor afd = context.getAssets().openFd(MODELS[i])) {
                Log.e(TAG, "asset=" + MODELS[i] + " bytes=" + afd.getLength());
                Assert.assertEquals(SIZES[i], afd.getLength());
            }
        }

        SpleeterSDK sdk = SpleeterSDK.createInstance(context);
        Assert.assertNotNull(sdk);
        int code = sdk.create();
        Log.e(TAG, "createCode=" + code
                + " [OK=0 INIT=1 APPID=2 EXPIRED=3 FILE=4 PROC=5 NOT_ACTIVATED=6 UNKNOWN=7 INVALID/WAVE=8]");
        try {
            Log.e(TAG, "progressAfterCreate=" + sdk.progress() + " playSizeAfterCreate=" + sdk.playsize());
        } catch (Throwable t) {
            Log.e(TAG, "state query after create threw", t);
        }
        try {
            Log.e(TAG, "releaseCode=" + sdk.release());
        } catch (Throwable t) {
            Log.e(TAG, "release threw", t);
        }
        Assert.assertEquals("vendor create() failed; see SpleeterInitAudit for exact code", SpleeterSDK.SDK_OK, code);
    }
}
