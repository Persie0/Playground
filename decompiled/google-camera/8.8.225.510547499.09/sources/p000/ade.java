package p000;

import android.net.ConnectivityManager;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import p021j$.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ade {
    /* JADX INFO: renamed from: a */
    public static boolean m268a(ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }

    /* JADX INFO: renamed from: b */
    public static int m269b(InputStream inputStream) {
        return (int) m272e(inputStream, 2);
    }

    /* JADX INFO: renamed from: c */
    public static int m270c(InputStream inputStream) {
        return (int) m272e(inputStream, 1);
    }

    /* JADX INFO: renamed from: d */
    public static int m271d(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    /* JADX INFO: renamed from: e */
    static long m272e(InputStream inputStream, int i) throws IOException {
        byte[] bArrM283p = m283p(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrM283p[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: f */
    public static long m273f(InputStream inputStream) {
        return m272e(inputStream, 4);
    }

    /* JADX INFO: renamed from: g */
    public static RuntimeException m274g(String str) {
        return new IllegalStateException(str);
    }

    /* JADX INFO: renamed from: h */
    public static String m275h(InputStream inputStream, int i) {
        return new String(m283p(inputStream, i), StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: i */
    public static void m276i(OutputStream outputStream, byte[] bArr) throws IOException {
        m280m(outputStream, bArr.length);
        byte[] bArrM282o = m282o(bArr);
        m280m(outputStream, bArrM282o.length);
        outputStream.write(bArrM282o);
    }

    /* JADX INFO: renamed from: j */
    public static void m277j(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: k */
    static void m278k(OutputStream outputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: l */
    public static void m279l(OutputStream outputStream, int i) throws IOException {
        m278k(outputStream, i, 2);
    }

    /* JADX INFO: renamed from: m */
    public static void m280m(OutputStream outputStream, long j) throws IOException {
        m278k(outputStream, j, 4);
    }

    /* JADX INFO: renamed from: n */
    public static void m281n(OutputStream outputStream, int i) throws IOException {
        m278k(outputStream, i, 1);
    }

    /* JADX INFO: renamed from: o */
    public static byte[] m282o(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception e) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: p */
    public static byte[] m283p(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw m274g("Not enough bytes to read: " + i);
            }
            i2 += i3;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: q */
    public static byte[] m284q(InputStream inputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = inputStream.read(bArr2);
                if (i4 < 0) {
                    throw m274g("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw m274g(e.getMessage());
                }
            }
            if (i3 == i) {
                if (!inflater.finished()) {
                    throw m274g("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw m274g("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }
}
