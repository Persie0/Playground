package p000;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;
import p021j$.nio.channels.DesugarChannels;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cav {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f4932a = 0;

    /* JADX INFO: renamed from: b */
    private static final AtomicReference f4933b = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public static InputStream m3362a(ByteBuffer byteBuffer) {
        return new cau(byteBuffer);
    }

    /* JADX INFO: renamed from: b */
    public static ByteBuffer m3363b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] bArr = (byte[]) f4933b.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[16384];
        }
        while (true) {
            int i = inputStream.read(bArr);
            if (i < 0) {
                f4933b.set(bArr);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return m3364c(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static ByteBuffer m3364c(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    /* JADX INFO: renamed from: d */
    public static void m3365d(ByteBuffer byteBuffer, File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        m3364c(byteBuffer);
        FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
                fileChannelConvertMaybeLegacyFileChannelFromLibrary.write(byteBuffer);
                fileChannelConvertMaybeLegacyFileChannelFromLibrary.force(false);
                fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                randomAccessFile.close();
                if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                    try {
                        fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                    } catch (IOException e) {
                    }
                }
                try {
                    randomAccessFile.close();
                } catch (IOException e2) {
                }
            } catch (Throwable th) {
                th = th;
                if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                    try {
                        fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                    } catch (IOException e3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException e4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }
}
