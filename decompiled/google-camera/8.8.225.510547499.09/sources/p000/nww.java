package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class nww {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f44875d = 0;

    /* JADX INFO: renamed from: e */
    private static volatile int f44876e = 100;

    /* JADX INFO: renamed from: a */
    int f44877a;

    /* JADX INFO: renamed from: b */
    final int f44878b = f44876e;

    /* JADX INFO: renamed from: c */
    nwx f44879c;

    /* JADX INFO: renamed from: F */
    public static int m17873F(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    /* JADX INFO: renamed from: G */
    public static int m17874G(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw nyb.m18167i();
            }
            i2 |= (i4 & 127) << i3;
            if ((i4 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw nyb.m18167i();
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw nyb.m18163e();
    }

    /* JADX INFO: renamed from: H */
    public static long m17875H(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    /* JADX INFO: renamed from: I */
    public static nww m17876I(InputStream inputStream) {
        return inputStream == null ? m17878K(nxz.f44986b) : new nwu(inputStream);
    }

    /* JADX INFO: renamed from: J */
    public static nww m17877J(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return m17879L(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        }
        if (byteBuffer.isDirect() && oag.f45121a) {
            return new nwv(byteBuffer);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return m17879L(bArr, 0, iRemaining);
    }

    /* JADX INFO: renamed from: K */
    public static nww m17878K(byte[] bArr) {
        return m17879L(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: L */
    static nww m17879L(byte[] bArr, int i, int i2) {
        nws nwsVar = new nws(bArr, i, i2);
        try {
            nwsVar.mo17818e(i2);
            return nwsVar;
        } catch (nyb e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo17809A(int i);

    /* JADX INFO: renamed from: C */
    public abstract boolean mo17811C();

    /* JADX INFO: renamed from: D */
    public abstract boolean mo17812D();

    /* JADX INFO: renamed from: E */
    public abstract boolean mo17813E(int i);

    /* JADX INFO: renamed from: b */
    public abstract double mo17815b();

    /* JADX INFO: renamed from: c */
    public abstract float mo17816c();

    /* JADX INFO: renamed from: d */
    public abstract int mo17817d();

    /* JADX INFO: renamed from: e */
    public abstract int mo17818e(int i);

    /* JADX INFO: renamed from: f */
    public abstract int mo17819f();

    /* JADX INFO: renamed from: g */
    public abstract int mo17820g();

    /* JADX INFO: renamed from: h */
    public abstract int mo17821h();

    /* JADX INFO: renamed from: j */
    public abstract int mo17823j();

    /* JADX INFO: renamed from: k */
    public abstract int mo17824k();

    /* JADX INFO: renamed from: l */
    public abstract int mo17825l();

    /* JADX INFO: renamed from: m */
    public abstract int mo17826m();

    /* JADX INFO: renamed from: n */
    public abstract int mo17827n();

    /* JADX INFO: renamed from: o */
    public abstract long mo17828o();

    /* JADX INFO: renamed from: p */
    public abstract long mo17829p();

    /* JADX INFO: renamed from: t */
    public abstract long mo17833t();

    /* JADX INFO: renamed from: u */
    public abstract long mo17834u();

    /* JADX INFO: renamed from: v */
    public abstract long mo17835v();

    /* JADX INFO: renamed from: w */
    public abstract nwr mo17836w();

    /* JADX INFO: renamed from: x */
    public abstract String mo17837x();

    /* JADX INFO: renamed from: y */
    public abstract String mo17838y();

    /* JADX INFO: renamed from: z */
    public abstract void mo17839z(int i);
}
