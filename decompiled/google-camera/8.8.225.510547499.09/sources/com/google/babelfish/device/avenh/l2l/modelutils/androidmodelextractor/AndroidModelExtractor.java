package com.google.babelfish.device.avenh.l2l.modelutils.androidmodelextractor;

import android.content.res.AssetManager;
import com.google.common.p019io.ByteStreams;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidModelExtractor {
    static {
        System.loadLibrary("native_utils_android");
    }

    /* JADX INFO: renamed from: a */
    public static void m4874a(AssetManager assetManager, String str, File file) throws IllegalAccessException, IOException, InvocationTargetException {
        String[] list = assetManager.list(str);
        if (list.length != 0) {
            File file2 = new File(file, str);
            if (!file2.exists()) {
                file2.mkdir();
            }
            for (String str2 : list) {
                m4874a(assetManager, str + File.separator + str2, file);
            }
            return;
        }
        File file3 = new File(file, str);
        InputStream inputStreamOpen = assetManager.open(str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            try {
                ByteStreams.copy(inputStreamOpen, fileOutputStream);
                fileOutputStream.close();
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th4) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                }
            }
            throw th3;
        }
    }
}
