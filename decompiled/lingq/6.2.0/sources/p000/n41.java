package p000;

import androidx.glance.appwidget.protobuf.ByteString;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n41 {

    /* JADX INFO: renamed from: a */
    public int f52310a;

    /* JADX INFO: renamed from: b */
    public Object f52311b;

    /* JADX INFO: renamed from: d */
    public static int m17206d(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* JADX INFO: renamed from: e */
    public static long m17207e(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: renamed from: A */
    public abstract int mo2279A();

    /* JADX INFO: renamed from: B */
    public abstract int mo2280B();

    /* JADX INFO: renamed from: C */
    public abstract long mo2281C();

    /* JADX INFO: renamed from: a */
    public ByteBuffer m17208a(int i, byte[] bArr) {
        int[] iArrMo13088c = mo13088c(kp0.m15633c(bArr), i);
        int[] iArr = (int[]) iArrMo13088c.clone();
        kp0.m15632b(iArr);
        for (int i2 = 0; i2 < iArrMo13088c.length; i2++) {
            iArrMo13088c[i2] = iArrMo13088c[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrMo13088c, 0, 16);
        return byteBufferOrder;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo2288b(int i);

    /* JADX INFO: renamed from: c */
    public abstract int[] mo13088c(int[] iArr, int i);

    /* JADX INFO: renamed from: f */
    public abstract int mo2289f();

    /* JADX INFO: renamed from: g */
    public abstract boolean mo2290g();

    /* JADX INFO: renamed from: h */
    public abstract int mo13089h();

    /* JADX INFO: renamed from: i */
    public abstract void mo2291i(int i);

    /* JADX INFO: renamed from: j */
    public void m17209j(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != mo13089h()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + mo13089h());
        }
        int iRemaining = byteBuffer2.remaining();
        int i = iRemaining / 64;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBufferM17208a = m17208a(this.f52310a + i3, bArr);
            if (i3 == i) {
                AbstractC3184kh.m15204L(byteBuffer, byteBuffer2, byteBufferM17208a, iRemaining % 64);
            } else {
                AbstractC3184kh.m15204L(byteBuffer, byteBuffer2, byteBufferM17208a, 64);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract int mo2292k(int i);

    /* JADX INFO: renamed from: l */
    public abstract boolean mo2293l();

    /* JADX INFO: renamed from: m */
    public abstract ByteString mo2294m();

    /* JADX INFO: renamed from: n */
    public abstract double mo2295n();

    /* JADX INFO: renamed from: o */
    public abstract int mo2296o();

    /* JADX INFO: renamed from: p */
    public abstract int mo2297p();

    /* JADX INFO: renamed from: q */
    public abstract long mo2298q();

    /* JADX INFO: renamed from: r */
    public abstract float mo2299r();

    /* JADX INFO: renamed from: s */
    public abstract int mo2300s();

    /* JADX INFO: renamed from: t */
    public abstract long mo2301t();

    /* JADX INFO: renamed from: u */
    public abstract int mo2302u();

    /* JADX INFO: renamed from: v */
    public abstract long mo2303v();

    /* JADX INFO: renamed from: w */
    public abstract int mo2304w();

    /* JADX INFO: renamed from: x */
    public abstract long mo2305x();

    /* JADX INFO: renamed from: y */
    public abstract String mo2306y();

    /* JADX INFO: renamed from: z */
    public abstract String mo2307z();
}
