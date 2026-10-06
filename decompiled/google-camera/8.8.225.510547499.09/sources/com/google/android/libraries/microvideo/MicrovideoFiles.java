package com.google.android.libraries.microvideo;

import android.util.Log;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;
import com.google.common.p019io.ByteStreams;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.bfc;
import p000.bfd;
import p000.lqi;
import p000.lrv;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class MicrovideoFiles {
    private static final byte[] MPEG4_FTYP_MARKER = {102, 116, 121, 112};
    private static final String TAG = "MicrovideoFiles";

    private MicrovideoFiles() {
    }

    public static void extractVideo(File file, File file2) throws IllegalAccessException, IOException, bfc, InvocationTargetException {
        long videoOffset = getVideoOffset(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                ByteStreams.skipFully(fileInputStream, videoOffset);
                ByteStreams.copy(fileInputStream, fileOutputStream);
                fileInputStream.close();
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                fileOutputStream.close();
            } catch (Throwable th4) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
            }
            throw th3;
        }
    }

    public static bfd extractXMPData(File file) {
        String path = file.getPath();
        Logger logger = lrv.f39107a;
        try {
            return lrv.m15923a(new FileInputStream(path));
        } catch (FileNotFoundException e) {
            lrv.f39107a.logp(Level.SEVERE, "com.google.android.libraries.social.xmp.XmpUtil", xRFdVyfdeve.Evej, "Could not read file: ".concat(String.valueOf(path)), (Throwable) e);
            return null;
        }
    }

    public static long getVideoOffset(File file) throws IllegalAccessException, IOException, bfc, InvocationTargetException {
        int iM15877v = lqi.m15877v(extractXMPData(file));
        long length = file.length() - ((long) iM15877v);
        if (length <= 0 || !validateOffset(file, length)) {
            Log.w(TAG, String.format("MicroVideoOffset %d invalid. Attempting recovery", Integer.valueOf(iM15877v)));
            long jScanForMpeg4FtypAtom = scanForMpeg4FtypAtom(file);
            if (jScanForMpeg4FtypAtom >= 0) {
                return jScanForMpeg4FtypAtom;
            }
            throw new IOException("Could not recover starting offset.");
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            fileInputStream.skip((-2) + length);
            fileInputStream.close();
            return length;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    public static boolean isMicrovideo(InputStream inputStream) {
        bfd bfdVarM15923a = lrv.m15923a(inputStream);
        if (bfdVarM15923a == null) {
            return false;
        }
        try {
            return ((long) lqi.m15877v(bfdVarM15923a)) > 0;
        } catch (bfc e) {
            return false;
        }
    }

    public static InputStream openVideoStream(File file) throws IllegalAccessException, IOException, bfc, InvocationTargetException {
        long videoOffset = getVideoOffset(file);
        FileInputStream fileInputStream = new FileInputStream(file);
        fileInputStream.skip(videoOffset);
        return fileInputStream;
    }

    private static long scanForMpeg4FtypAtom(File file) throws IllegalAccessException, IOException, InvocationTargetException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[4];
            ByteStreams.readFully(fileInputStream, bArr);
            long j = 4;
            while (true) {
                byte[] bArr2 = MPEG4_FTYP_MARKER;
                if (Arrays.equals(bArr, bArr2)) {
                    long length = j - ((long) bArr2.length);
                    fileInputStream.close();
                    return length - 4;
                }
                int i = 0;
                while (i < 3) {
                    int i2 = i + 1;
                    bArr[i] = bArr[i2];
                    i = i2;
                }
                int i3 = fileInputStream.read();
                if (i3 < 0) {
                    fileInputStream.close();
                    return -1L;
                }
                bArr[3] = (byte) i3;
                j++;
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    private static boolean validateOffset(File file, long j) throws IllegalAccessException, InvocationTargetException {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                ByteStreams.skipFully(fileInputStream, j + 4);
                byte[] bArr = new byte[4];
                ByteStreams.readFully(fileInputStream, bArr);
                boolean zEquals = Arrays.equals(bArr, MPEG4_FTYP_MARKER);
                fileInputStream.close();
                return zEquals;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        } catch (IOException e) {
            return false;
        }
    }
}
