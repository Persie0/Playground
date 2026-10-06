package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nxz {

    /* JADX INFO: renamed from: a */
    public static final Charset f44985a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f44986b;

    /* JADX INFO: renamed from: c */
    public static final ByteBuffer f44987c;

    static {
        Charset.forName("US-ASCII");
        f44985a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f44986b = bArr;
        f44987c = ByteBuffer.wrap(bArr);
        nww.m17878K(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static int m18152a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* JADX INFO: renamed from: b */
    public static int m18153b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: c */
    static int m18154c(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* JADX INFO: renamed from: d */
    public static String m18155d(byte[] bArr) {
        return new String(bArr, f44985a);
    }

    /* JADX INFO: renamed from: e */
    static void m18156e(Object obj) {
        if (obj == null) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: f */
    static void m18157f(nyw nywVar) {
        if (nywVar instanceof nwd) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: g */
    static void m18158g(Object obj) {
        if (obj == null) {
            throw new NullPointerException("messageType");
        }
    }
}
