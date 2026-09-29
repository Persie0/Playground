package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class o94 {

    /* JADX INFO: renamed from: a */
    public static final Charset f54077a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f54078b;

    static {
        Charset.forName("US-ASCII");
        f54077a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f54078b = bArr;
        ByteBuffer.wrap(bArr);
        m80.m16674f(bArr, 0, 0, false);
    }

    /* JADX INFO: renamed from: a */
    public static void m17872a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C3386nv.m17635v(str);
    }

    /* JADX INFO: renamed from: b */
    public static int m17873b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
