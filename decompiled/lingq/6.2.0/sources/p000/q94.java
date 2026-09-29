package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q94 {

    /* JADX INFO: renamed from: a */
    public static final Charset f57449a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f57450b;

    static {
        Charset.forName("US-ASCII");
        f57449a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f57450b = bArr;
        ByteBuffer.wrap(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static void m19807a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C3386nv.m17635v(str);
    }

    /* JADX INFO: renamed from: b */
    public static int m19808b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
