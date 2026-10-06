package com.pairip;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes2.dex */
public class VMRunner {
    private static final String TAG = "VMRunner";
    private static String apkPath = null;
    private static String loggingEnabled = "false";

    public static native Object executeVM(byte[] vmCode, Object[] args);

    static {
        System.loadLibrary("pairipcore");
    }

    private static class VMRunnerException extends RuntimeException {
        public VMRunnerException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public static Object invoke(String vmByteCodeFile, Object[] args) {
        if (isDebuggingEnabled()) {
            Log.i(TAG, "Executing " + vmByteCodeFile);
        }
        try {
            byte[] byteCode = readByteCode(vmByteCodeFile);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object objExecuteVM = executeVM(byteCode, args);
            if (isDebuggingEnabled()) {
                Log.i(TAG, String.format("Finished executing %s after %d ms.", vmByteCodeFile, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            }
            return objExecuteVM;
        } catch (IOException e) {
            throw new VMRunnerException("Error while loading bytecode.", e);
        }
    }

    public static Runnable createInvokeRunnable(final String vmByteCodeFile, final Object[] args) {
        return new Runnable() { // from class: com.pairip.VMRunner.1
            @Override // java.lang.Runnable
            public void run() {
                VMRunner.invoke(vmByteCodeFile, args);
            }
        };
    }

    private static byte[] readByteCode(String vmByteCodeFile) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ZipFile zipFile = new ZipFile(getApkPath());
        try {
            ZipEntry entry = zipFile.getEntry("assets/" + vmByteCodeFile);
            if (entry == null) {
                throw new IOException(vmByteCodeFile + " not found.");
            }
            InputStream inputStream = zipFile.getInputStream(entry);
            try {
                int size = (int) entry.getSize();
                byte[] bArr = new byte[size];
                readFullByteArrayFromStream(inputStream, bArr);
                if (isDebuggingEnabled()) {
                    Log.i(TAG, String.format("Finished loading %s (%d kB) after %d ms.", vmByteCodeFile, Integer.valueOf(size / 1024), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                zipFile.close();
                return bArr;
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                zipFile.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    private static byte[] readFullByteArrayFromStream(InputStream is, byte[] byteArray) throws IOException {
        int i = 0;
        while (true) {
            int i2 = is.read(byteArray, i, byteArray.length - i);
            if (i2 <= 0) {
                break;
            }
            i += i2;
        }
        if (i == byteArray.length) {
            return byteArray;
        }
        throw new IOException("Read " + i + "/" + byteArray.length + " bytes.");
    }

    private static synchronized String getApkPath() {
        String str = apkPath;
        if (str != null) {
            return str;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        URL resource = VMRunner.class.getResource("/AndroidManifest.xml");
        if (resource == null) {
            if (isDebuggingEnabled()) {
                Log.i(TAG, "Cannot load resource!");
            }
            return null;
        }
        if (isDebuggingEnabled()) {
            Log.i(TAG, "Resource URL is " + String.valueOf(resource));
        }
        String string = resource.toString();
        String strSubstring = string.substring(9, string.lastIndexOf(33));
        if (isDebuggingEnabled()) {
            Log.i(TAG, String.format("Found APK path %s after %d ms.", strSubstring, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
        }
        apkPath = strSubstring;
        return strSubstring;
    }

    private static boolean isDebuggingEnabled() {
        return "true".equals(loggingEnabled);
    }

    private VMRunner() {
    }
}
