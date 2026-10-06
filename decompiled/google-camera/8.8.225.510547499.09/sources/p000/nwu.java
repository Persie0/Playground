package p000;

import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nwu extends nww {

    /* JADX INFO: renamed from: e */
    private final InputStream f44859e;

    /* JADX INFO: renamed from: f */
    private final byte[] f44860f;

    /* JADX INFO: renamed from: g */
    private int f44861g;

    /* JADX INFO: renamed from: h */
    private int f44862h;

    /* JADX INFO: renamed from: i */
    private int f44863i;

    /* JADX INFO: renamed from: j */
    private int f44864j;

    /* JADX INFO: renamed from: k */
    private int f44865k;

    /* JADX INFO: renamed from: l */
    private int f44866l = Integer.MAX_VALUE;

    public nwu(InputStream inputStream) {
        Charset charset = nxz.f44985a;
        this.f44859e = inputStream;
        this.f44860f = new byte[4096];
        this.f44861g = 0;
        this.f44863i = 0;
        this.f44865k = 0;
    }

    /* JADX INFO: renamed from: M */
    private static int m17852M(InputStream inputStream, byte[] bArr, int i, int i2) throws nyb {
        try {
            return inputStream.read(bArr, i, i2);
        } catch (nyb e) {
            e.m18168j();
            throw e;
        }
    }

    /* JADX INFO: renamed from: N */
    private final List m17853N(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f44859e.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw nyb.m18167i();
                }
                this.f44865k += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: O */
    private final void m17854O() {
        int i = this.f44861g + this.f44862h;
        this.f44861g = i;
        int i2 = this.f44865k + i;
        int i3 = this.f44866l;
        if (i2 <= i3) {
            this.f44862h = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f44862h = i4;
        this.f44861g = i - i4;
    }

    /* JADX INFO: renamed from: P */
    private final void m17855P(int i) throws nyb {
        if (m17856Q(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.f44865k) - this.f44863i) {
            throw nyb.m18167i();
        }
        throw nyb.m18166h();
    }

    /* JADX INFO: renamed from: Q */
    private final boolean m17856Q(int i) throws nyb {
        int i2 = this.f44863i;
        int i3 = i2 + i;
        int i4 = this.f44861g;
        if (i3 <= i4) {
            throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
        }
        int i5 = this.f44865k;
        if (i > (Integer.MAX_VALUE - i5) - i2 || i5 + i2 + i > this.f44866l) {
            return false;
        }
        if (i2 > 0) {
            if (i4 > i2) {
                byte[] bArr = this.f44860f;
                System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            i5 = this.f44865k + i2;
            this.f44865k = i5;
            i4 = this.f44861g - i2;
            this.f44861g = i4;
            this.f44863i = 0;
        }
        int iM17852M = m17852M(this.f44859e, this.f44860f, i4, Math.min(4096 - i4, (Integer.MAX_VALUE - i5) - i4));
        if (iM17852M == 0 || iM17852M < -1 || iM17852M > 4096) {
            throw new IllegalStateException(String.valueOf(this.f44859e.getClass()) + "#read(byte[]) returned invalid result: " + iM17852M + "\nThe InputStream implementation is buggy.");
        }
        if (iM17852M <= 0) {
            return false;
        }
        this.f44861g += iM17852M;
        m17854O();
        if (this.f44861g >= i) {
            return true;
        }
        return m17856Q(i);
    }

    /* JADX INFO: renamed from: R */
    private final byte[] m17857R(int i) throws nyb {
        if (i == 0) {
            return nxz.f44986b;
        }
        if (i < 0) {
            throw nyb.m18164f();
        }
        int i2 = this.f44865k;
        int i3 = this.f44863i;
        int i4 = i2 + i3 + i;
        if ((-2147483647) + i4 > 0) {
            throw nyb.m18166h();
        }
        int i5 = this.f44866l;
        if (i4 > i5) {
            m17859B((i5 - i2) - i3);
            throw nyb.m18167i();
        }
        int i6 = this.f44861g - i3;
        int i7 = i - i6;
        if (i7 >= 4096) {
            try {
                if (i7 > this.f44859e.available()) {
                    return null;
                }
            } catch (nyb e) {
                e.m18168j();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f44860f, this.f44863i, bArr, 0, i6);
        this.f44865k += this.f44861g;
        this.f44863i = 0;
        this.f44861g = 0;
        while (i6 < i) {
            int iM17852M = m17852M(this.f44859e, bArr, i6, i - i6);
            if (iM17852M == -1) {
                throw nyb.m18167i();
            }
            this.f44865k += iM17852M;
            i6 += iM17852M;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: S */
    private final byte[] m17858S(int i) throws IOException {
        byte[] bArrM17857R = m17857R(i);
        if (bArrM17857R != null) {
            return bArrM17857R;
        }
        int i2 = this.f44863i;
        int i3 = this.f44861g;
        int i4 = i3 - i2;
        this.f44865k += i3;
        this.f44863i = 0;
        this.f44861g = 0;
        List<byte[]> listM17853N = m17853N(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f44860f, i2, bArr, 0, i4);
        for (byte[] bArr2 : listM17853N) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: A */
    public final void mo17809A(int i) {
        this.f44866l = i;
        m17854O();
    }

    /* JADX INFO: renamed from: B */
    public final void m17859B(int i) throws nyb {
        int i2 = this.f44861g;
        int i3 = this.f44863i;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f44863i = i3 + i;
            return;
        }
        if (i < 0) {
            throw nyb.m18164f();
        }
        int i5 = this.f44865k;
        int i6 = i5 + i3;
        int i7 = this.f44866l;
        if (i6 + i > i7) {
            m17859B((i7 - i5) - i3);
            throw nyb.m18167i();
        }
        this.f44865k = i6;
        this.f44861g = 0;
        this.f44863i = 0;
        while (i4 < i) {
            try {
                long j = i - i4;
                try {
                    long jSkip = this.f44859e.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(String.valueOf(this.f44859e.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (nyb e) {
                    e.m18168j();
                    throw e;
                }
            } catch (Throwable th) {
                this.f44865k += i4;
                m17854O();
                throw th;
            }
        }
        this.f44865k += i4;
        m17854O();
        if (i4 >= i) {
            return;
        }
        int i8 = this.f44861g;
        int i9 = i8 - this.f44863i;
        this.f44863i = i8;
        m17855P(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.f44861g;
            if (i10 <= i11) {
                this.f44863i = i10;
                return;
            } else {
                i9 += i11;
                this.f44863i = i11;
                m17855P(1);
            }
        }
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: C */
    public final boolean mo17811C() {
        return this.f44863i == this.f44861g && !m17856Q(1);
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: D */
    public final boolean mo17812D() {
        return m17863r() != 0;
    }

    /* JADX INFO: renamed from: a */
    public final byte m17860a() throws nyb {
        if (this.f44863i == this.f44861g) {
            m17855P(1);
        }
        byte[] bArr = this.f44860f;
        int i = this.f44863i;
        this.f44863i = i + 1;
        return bArr[i];
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: b */
    public final double mo17815b() {
        return Double.longBitsToDouble(m17862q());
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: c */
    public final float mo17816c() {
        return Float.intBitsToFloat(m17861i());
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: d */
    public final int mo17817d() {
        return this.f44865k + this.f44863i;
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: e */
    public final int mo17818e(int i) throws nyb {
        if (i < 0) {
            throw nyb.m18164f();
        }
        int i2 = this.f44865k + this.f44863i;
        int i3 = this.f44866l;
        int i4 = i + i2;
        if (i4 > i3) {
            throw nyb.m18167i();
        }
        this.f44866l = i4;
        m17854O();
        return i3;
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: f */
    public final int mo17819f() {
        return mo17823j();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: g */
    public final int mo17820g() {
        return m17861i();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: h */
    public final int mo17821h() {
        return mo17823j();
    }

    /* JADX INFO: renamed from: i */
    public final int m17861i() throws nyb {
        int i = this.f44863i;
        if (this.f44861g - i < 4) {
            m17855P(4);
            i = this.f44863i;
        }
        byte[] bArr = this.f44860f;
        this.f44863i = i + 4;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: k */
    public final int mo17824k() {
        return m17861i();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: l */
    public final int mo17825l() {
        return m17873F(mo17823j());
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: m */
    public final int mo17826m() throws nyb {
        if (mo17811C()) {
            this.f44864j = 0;
            return 0;
        }
        int iMo17823j = mo17823j();
        this.f44864j = iMo17823j;
        if (oal.m18386a(iMo17823j) != 0) {
            return iMo17823j;
        }
        throw nyb.m18161c();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: n */
    public final int mo17827n() {
        return mo17823j();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: o */
    public final long mo17828o() {
        return m17862q();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: p */
    public final long mo17829p() {
        return m17863r();
    }

    /* JADX INFO: renamed from: q */
    public final long m17862q() throws nyb {
        int i = this.f44863i;
        if (this.f44861g - i < 8) {
            m17855P(8);
            i = this.f44863i;
        }
        byte[] bArr = this.f44860f;
        this.f44863i = i + 8;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        long j6 = bArr[i + 5];
        return ((((long) bArr[i + 7]) & 255) << 56) | (j & 255) | j2 | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* JADX INFO: renamed from: s */
    final long m17864s() throws nyb {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bM17860a = m17860a();
            j |= ((long) (bM17860a & 127)) << i;
            if ((bM17860a & 128) == 0) {
                return j;
            }
        }
        throw nyb.m18163e();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: t */
    public final long mo17833t() {
        return m17862q();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: u */
    public final long mo17834u() {
        return m17875H(m17863r());
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: v */
    public final long mo17835v() {
        return m17863r();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: w */
    public final nwr mo17836w() throws IOException {
        int iMo17823j = mo17823j();
        int i = this.f44861g;
        int i2 = this.f44863i;
        if (iMo17823j <= i - i2 && iMo17823j > 0) {
            nwr nwrVarM17800v = nwr.m17800v(this.f44860f, i2, iMo17823j);
            this.f44863i += iMo17823j;
            return nwrVarM17800v;
        }
        if (iMo17823j == 0) {
            return nwr.f44839b;
        }
        byte[] bArrM17857R = m17857R(iMo17823j);
        if (bArrM17857R != null) {
            return nwr.m17799u(bArrM17857R);
        }
        int i3 = this.f44863i;
        int i4 = this.f44861g;
        int i5 = i4 - i3;
        this.f44865k += i4;
        this.f44863i = 0;
        this.f44861g = 0;
        List<byte[]> listM17853N = m17853N(iMo17823j - i5);
        byte[] bArr = new byte[iMo17823j];
        System.arraycopy(this.f44860f, i3, bArr, 0, i5);
        for (byte[] bArr2 : listM17853N) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        return nwr.m17802x(bArr);
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: x */
    public final String mo17837x() throws nyb {
        int iMo17823j = mo17823j();
        if (iMo17823j > 0) {
            int i = this.f44861g;
            int i2 = this.f44863i;
            if (iMo17823j <= i - i2) {
                String str = new String(this.f44860f, i2, iMo17823j, nxz.f44985a);
                this.f44863i += iMo17823j;
                return str;
            }
        }
        if (iMo17823j == 0) {
            return voNZjxiJou.MjsO;
        }
        if (iMo17823j > this.f44861g) {
            return new String(m17858S(iMo17823j), nxz.f44985a);
        }
        m17855P(iMo17823j);
        String str2 = new String(this.f44860f, this.f44863i, iMo17823j, nxz.f44985a);
        this.f44863i += iMo17823j;
        return str2;
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: y */
    public final String mo17838y() throws IOException {
        byte[] bArrM17858S;
        int iMo17823j = mo17823j();
        int i = this.f44863i;
        int i2 = this.f44861g;
        if (iMo17823j <= i2 - i && iMo17823j > 0) {
            bArrM17858S = this.f44860f;
            this.f44863i = i + iMo17823j;
        } else {
            if (iMo17823j == 0) {
                return "";
            }
            i = 0;
            if (iMo17823j <= i2) {
                m17855P(iMo17823j);
                bArrM17858S = this.f44860f;
                this.f44863i = iMo17823j;
            } else {
                bArrM17858S = m17858S(iMo17823j);
            }
        }
        return lij.m15410S(bArrM17858S, i, iMo17823j);
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: z */
    public final void mo17839z(int i) throws nyb {
        if (this.f44864j != i) {
            throw nyb.m18160b();
        }
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: E */
    public final boolean mo17813E(int i) throws nyb {
        int iMo17826m;
        int i2 = 0;
        switch (oal.m18387b(i)) {
            case 0:
                if (this.f44861g - this.f44863i < 10) {
                    while (i2 < 10) {
                        if (m17860a() < 0) {
                            i2++;
                        }
                    }
                    throw nyb.m18163e();
                }
                while (i2 < 10) {
                    byte[] bArr = this.f44860f;
                    int i3 = this.f44863i;
                    this.f44863i = i3 + 1;
                    if (bArr[i3] < 0) {
                        i2++;
                    }
                }
                throw nyb.m18163e();
                return true;
            case 1:
                m17859B(8);
                return true;
            case 2:
                m17859B(mo17823j());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                m17859B(4);
                return true;
            default:
                throw nyb.m18159a();
        }
        do {
            iMo17826m = mo17826m();
            if (iMo17826m != 0) {
            }
            mo17839z(oal.m18388c(oal.m18386a(i), 4));
            return true;
        } while (mo17813E(iMo17826m));
        mo17839z(oal.m18388c(oal.m18386a(i), 4));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006b A[PHI: r3
      0x006b: PHI (r3v7 int) = (r3v6 int), (r3v9 int), (r3v11 int) binds: [B:21:0x004a, B:25:0x0056, B:29:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        if (r2[r3] < 0) goto L36;
     */
    @Override // p000.nww
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo17823j() {
        int i;
        int i2 = this.f44863i;
        int i3 = this.f44861g;
        if (i3 != i2) {
            byte[] bArr = this.f44860f;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f44863i = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                        i5 = i7;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            int i10 = i5 + 1;
                            byte b2 = bArr[i5];
                            i = (i9 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i5 = i10 + 1;
                                if (bArr[i10] < 0) {
                                    i10 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i10 + 1;
                                        if (bArr[i10] < 0) {
                                            i10 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i10 + 1;
                                            } else {
                                                i5 = i10;
                                            }
                                        }
                                    } else {
                                        i5 = i10;
                                    }
                                }
                            } else {
                                i5 = i10;
                            }
                        }
                    }
                }
                this.f44863i = i5;
                return i;
            }
        }
        return (int) m17864s();
    }

    /* JADX INFO: renamed from: r */
    public final long m17863r() {
        long j;
        int i = this.f44863i;
        int i2 = this.f44861g;
        if (i2 != i) {
            byte[] bArr = this.f44860f;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.f44863i = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i3 + 1;
                int i5 = b ^ (bArr[i3] << 7);
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i4 + 1;
                    int i7 = i5 ^ (bArr[i4] << 14);
                    if (i7 >= 0) {
                        i4 = i6;
                        j = i7 ^ 16256;
                    } else {
                        i4 = i6 + 1;
                        int i8 = i7 ^ (bArr[i6] << 21);
                        if (i8 < 0) {
                            j = i8 ^ (-2080896);
                        } else {
                            int i9 = i4 + 1;
                            long j2 = ((long) i8) ^ (((long) bArr[i4]) << 28);
                            if (j2 >= 0) {
                                i4 = i9;
                                j = j2 ^ 266354560;
                            } else {
                                int i10 = i9 + 1;
                                long j3 = j2 ^ (((long) bArr[i9]) << 35);
                                if (j3 < 0) {
                                    j = (-34093383808L) ^ j3;
                                    i4 = i10;
                                } else {
                                    int i11 = i10 + 1;
                                    long j4 = j3 ^ (((long) bArr[i10]) << 42);
                                    if (j4 >= 0) {
                                        i4 = i11;
                                        j = j4 ^ 4363953127296L;
                                    } else {
                                        int i12 = i11 + 1;
                                        long j5 = j4 ^ (((long) bArr[i11]) << 49);
                                        if (j5 < 0) {
                                            j = (-558586000294016L) ^ j5;
                                            i4 = i12;
                                        } else {
                                            int i13 = i12 + 1;
                                            long j6 = (j5 ^ (((long) bArr[i12]) << 56)) ^ 71499008037633920L;
                                            if (j6 < 0) {
                                                int i14 = i13 + 1;
                                                if (bArr[i13] >= 0) {
                                                    j = j6;
                                                    i4 = i14;
                                                }
                                            } else {
                                                i4 = i13;
                                                j = j6;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.f44863i = i4;
                return j;
            }
        }
        return m17864s();
    }
}
