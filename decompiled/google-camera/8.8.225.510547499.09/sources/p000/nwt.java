package p000;

import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nwt extends nww {

    /* JADX INFO: renamed from: e */
    private final Iterable f44848e;

    /* JADX INFO: renamed from: f */
    private final Iterator f44849f;

    /* JADX INFO: renamed from: g */
    private ByteBuffer f44850g;

    /* JADX INFO: renamed from: h */
    private int f44851h;

    /* JADX INFO: renamed from: i */
    private int f44852i;

    /* JADX INFO: renamed from: k */
    private int f44854k;

    /* JADX INFO: renamed from: m */
    private long f44856m;

    /* JADX INFO: renamed from: n */
    private long f44857n;

    /* JADX INFO: renamed from: o */
    private long f44858o;

    /* JADX INFO: renamed from: j */
    private int f44853j = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: l */
    private int f44855l = 0;

    public nwt(Iterable iterable, int i) {
        this.f44851h = i;
        this.f44848e = iterable;
        this.f44849f = iterable.iterator();
        if (i != 0) {
            m17844Q();
            return;
        }
        this.f44850g = nxz.f44987c;
        this.f44856m = 0L;
        this.f44857n = 0L;
        this.f44858o = 0L;
    }

    /* JADX INFO: renamed from: M */
    private final int m17840M() {
        return (int) ((((long) (this.f44851h - this.f44855l)) - this.f44856m) + this.f44857n);
    }

    /* JADX INFO: renamed from: N */
    private final long m17841N() {
        return this.f44858o - this.f44856m;
    }

    /* JADX INFO: renamed from: O */
    private final void m17842O() throws nyb {
        if (!this.f44849f.hasNext()) {
            throw nyb.m18167i();
        }
        m17844Q();
    }

    /* JADX INFO: renamed from: P */
    private final void m17843P() {
        int i = this.f44851h + this.f44852i;
        this.f44851h = i;
        int i2 = this.f44853j;
        if (i <= i2) {
            this.f44852i = 0;
            return;
        }
        int i3 = i - i2;
        this.f44852i = i3;
        this.f44851h = i - i3;
    }

    /* JADX INFO: renamed from: Q */
    private final void m17844Q() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f44849f.next();
        this.f44850g = byteBuffer;
        this.f44855l += (int) (this.f44856m - this.f44857n);
        long jPosition = byteBuffer.position();
        this.f44856m = jPosition;
        this.f44857n = jPosition;
        this.f44858o = this.f44850g.limit();
        long jM18357e = oag.m18357e(this.f44850g);
        this.f44856m += jM18357e;
        this.f44857n += jM18357e;
        this.f44858o += jM18357e;
    }

    /* JADX INFO: renamed from: R */
    private final void m17845R(byte[] bArr, int i) throws nyb {
        if (i > m17840M()) {
            if (i > 0) {
                throw nyb.m18167i();
            }
            return;
        }
        int i2 = i;
        while (i2 > 0) {
            if (m17841N() == 0) {
                m17842O();
            }
            int iMin = Math.min(i2, (int) m17841N());
            long j = iMin;
            oag.m18363k(this.f44856m, bArr, i - i2, j);
            i2 -= iMin;
            this.f44856m += j;
        }
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: A */
    public final void mo17809A(int i) {
        this.f44853j = i;
        m17843P();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: C */
    public final boolean mo17811C() {
        return (((long) this.f44855l) + this.f44856m) - this.f44857n == ((long) this.f44851h);
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: D */
    public final boolean mo17812D() {
        return m17850r() != 0;
    }

    /* JADX INFO: renamed from: a */
    public final byte m17847a() throws nyb {
        if (m17841N() == 0) {
            m17842O();
        }
        long j = this.f44856m;
        this.f44856m = 1 + j;
        return oag.m18353a(j);
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: b */
    public final double mo17815b() {
        return Double.longBitsToDouble(m17849q());
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: c */
    public final float mo17816c() {
        return Float.intBitsToFloat(m17848i());
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: d */
    public final int mo17817d() {
        return (int) ((((long) this.f44855l) + this.f44856m) - this.f44857n);
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: e */
    public final int mo17818e(int i) throws nyb {
        if (i < 0) {
            throw nyb.m18164f();
        }
        int iMo17817d = i + mo17817d();
        int i2 = this.f44853j;
        if (iMo17817d > i2) {
            throw nyb.m18167i();
        }
        this.f44853j = iMo17817d;
        m17843P();
        return i2;
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: f */
    public final int mo17819f() {
        return mo17823j();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: g */
    public final int mo17820g() {
        return m17848i();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: h */
    public final int mo17821h() {
        return mo17823j();
    }

    /* JADX INFO: renamed from: i */
    public final int m17848i() {
        if (m17841N() < 4) {
            int iM17847a = m17847a() & 255;
            int iM17847a2 = (m17847a() & 255) << 8;
            return iM17847a | iM17847a2 | ((m17847a() & 255) << 16) | ((m17847a() & 255) << 24);
        }
        long j = this.f44856m;
        this.f44856m = 4 + j;
        int iM18353a = oag.m18353a(j) & 255;
        int iM18353a2 = (oag.m18353a(1 + j) & 255) << 8;
        return ((oag.m18353a(j + 3) & 255) << 24) | iM18353a | iM18353a2 | ((oag.m18353a(2 + j) & 255) << 16);
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: k */
    public final int mo17824k() {
        return m17848i();
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
            this.f44854k = 0;
            return 0;
        }
        int iMo17823j = mo17823j();
        this.f44854k = iMo17823j;
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
        return m17849q();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: p */
    public final long mo17829p() {
        return m17850r();
    }

    /* JADX INFO: renamed from: q */
    public final long m17849q() {
        if (m17841N() < 8) {
            long jM17847a = ((long) m17847a()) & 255;
            long jM17847a2 = (((long) m17847a()) & 255) << 8;
            long jM17847a3 = (((long) m17847a()) & 255) << 16;
            long jM17847a4 = (((long) m17847a()) & 255) << 24;
            long jM17847a5 = (((long) m17847a()) & 255) << 32;
            long jM17847a6 = (((long) m17847a()) & 255) << 40;
            return jM17847a | jM17847a2 | jM17847a3 | jM17847a4 | jM17847a5 | jM17847a6 | ((((long) m17847a()) & 255) << 48) | ((255 & ((long) m17847a())) << 56);
        }
        long j = this.f44856m;
        this.f44856m = 8 + j;
        long jM18353a = ((long) oag.m18353a(j)) & 255;
        long jM18353a2 = (((long) oag.m18353a(1 + j)) & 255) << 8;
        long jM18353a3 = (((long) oag.m18353a(j + 2)) & 255) << 16;
        long jM18353a4 = (((long) oag.m18353a(3 + j)) & 255) << 24;
        long jM18353a5 = (((long) oag.m18353a(j + 4)) & 255) << 32;
        long jM18353a6 = (((long) oag.m18353a(5 + j)) & 255) << 40;
        return ((((long) oag.m18353a(j + 7)) & 255) << 56) | jM18353a3 | jM18353a | jM18353a2 | jM18353a4 | jM18353a5 | jM18353a6 | ((((long) oag.m18353a(j + 6)) & 255) << 48);
    }

    /* JADX INFO: renamed from: s */
    final long m17851s() throws nyb {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bM17847a = m17847a();
            j |= ((long) (bM17847a & 127)) << i;
            if ((bM17847a & 128) == 0) {
                return j;
            }
        }
        throw nyb.m18163e();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: t */
    public final long mo17833t() {
        return m17849q();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: u */
    public final long mo17834u() {
        return m17875H(m17850r());
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: v */
    public final long mo17835v() {
        return m17850r();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: w */
    public final nwr mo17836w() throws nyb {
        int iMo17823j = mo17823j();
        if (iMo17823j > 0) {
            long j = this.f44858o;
            long j2 = this.f44856m;
            long j3 = iMo17823j;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[iMo17823j];
                oag.m18363k(j2, bArr, 0L, j3);
                this.f44856m += j3;
                return nwr.m17802x(bArr);
            }
        }
        if (iMo17823j > 0 && iMo17823j <= m17840M()) {
            byte[] bArr2 = new byte[iMo17823j];
            m17845R(bArr2, iMo17823j);
            return nwr.m17802x(bArr2);
        }
        if (iMo17823j == 0) {
            return nwr.f44839b;
        }
        if (iMo17823j < 0) {
            throw nyb.m18164f();
        }
        throw nyb.m18167i();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: x */
    public final String mo17837x() throws nyb {
        int iMo17823j = mo17823j();
        if (iMo17823j > 0) {
            long j = this.f44858o;
            long j2 = this.f44856m;
            long j3 = iMo17823j;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[iMo17823j];
                oag.m18363k(j2, bArr, 0L, j3);
                String str = new String(bArr, nxz.f44985a);
                this.f44856m += j3;
                return str;
            }
        }
        if (iMo17823j > 0 && iMo17823j <= m17840M()) {
            byte[] bArr2 = new byte[iMo17823j];
            m17845R(bArr2, iMo17823j);
            return new String(bArr2, nxz.f44985a);
        }
        if (iMo17823j == 0) {
            return "";
        }
        if (iMo17823j < 0) {
            throw nyb.m18164f();
        }
        throw nyb.m18167i();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: y */
    public final String mo17838y() throws nyb {
        int iMo17823j = mo17823j();
        if (iMo17823j > 0) {
            long j = this.f44858o;
            long j2 = this.f44856m;
            long j3 = iMo17823j;
            if (j3 <= j - j2) {
                String strM18384f = oai.m18384f(this.f44850g, (int) (j2 - this.f44857n), iMo17823j);
                this.f44856m += j3;
                return strM18384f;
            }
        }
        if (iMo17823j >= 0 && iMo17823j <= m17840M()) {
            byte[] bArr = new byte[iMo17823j];
            m17845R(bArr, iMo17823j);
            return lij.m15410S(bArr, 0, iMo17823j);
        }
        if (iMo17823j == 0) {
            return "";
        }
        if (iMo17823j <= 0) {
            throw nyb.m18164f();
        }
        throw nyb.m18167i();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: z */
    public final void mo17839z(int i) throws nyb {
        if (this.f44854k != i) {
            throw nyb.m18160b();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m17846B(int i) throws nyb {
        if (i >= 0) {
            if (i <= (((long) (this.f44851h - this.f44855l)) - this.f44856m) + this.f44857n) {
                while (i > 0) {
                    if (m17841N() == 0) {
                        m17842O();
                    }
                    int iMin = Math.min(i, (int) m17841N());
                    i -= iMin;
                    this.f44856m += (long) iMin;
                }
                return;
            }
        }
        if (i >= 0) {
            throw nyb.m18167i();
        }
        throw nyb.m18164f();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p000.nww
    /* JADX INFO: renamed from: E */
    public final boolean mo17813E(int i) throws nyb {
        int iMo17826m;
        switch (oal.m18387b(i)) {
            case 0:
                for (int i2 = 0; i2 < 10; i2++) {
                    if (m17847a() >= 0) {
                        return true;
                    }
                }
                throw nyb.m18163e();
            case 1:
                m17846B(8);
                return true;
            case 2:
                m17846B(mo17823j());
                return true;
            case 3:
                do {
                    iMo17826m = mo17826m();
                    if (iMo17826m != 0) {
                    }
                    mo17839z(oal.m18388c(oal.m18386a(i), 4));
                    return true;
                } while (mo17813E(iMo17826m));
                mo17839z(oal.m18388c(oal.m18386a(i), 4));
                return true;
            case 4:
                return false;
            case 5:
                m17846B(4);
                return true;
            default:
                throw nyb.m18159a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008a A[PHI: r4
      0x008a: PHI (r4v4 long) = (r4v3 long), (r4v5 long), (r4v6 long) binds: [B:21:0x005f, B:25:0x006f, B:29:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
    
        if (p000.oag.m18353a(r4) >= 0) goto L34;
     */
    @Override // p000.nww
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo17823j() {
        int i;
        long j = this.f44856m;
        if (this.f44858o != j) {
            long j2 = j + 1;
            byte bM18353a = oag.m18353a(j);
            if (bM18353a >= 0) {
                this.f44856m++;
                return bM18353a;
            }
            if (this.f44858o - this.f44856m >= 10) {
                long j3 = j2 + 1;
                int iM18353a = bM18353a ^ (oag.m18353a(j2) << 7);
                if (iM18353a < 0) {
                    i = iM18353a ^ (-128);
                } else {
                    long j4 = j3 + 1;
                    int iM18353a2 = iM18353a ^ (oag.m18353a(j3) << 14);
                    if (iM18353a2 >= 0) {
                        i = iM18353a2 ^ 16256;
                        j3 = j4;
                    } else {
                        j3 = j4 + 1;
                        int iM18353a3 = iM18353a2 ^ (oag.m18353a(j4) << 21);
                        if (iM18353a3 < 0) {
                            i = iM18353a3 ^ (-2080896);
                        } else {
                            long j5 = j3 + 1;
                            byte bM18353a2 = oag.m18353a(j3);
                            i = (iM18353a3 ^ (bM18353a2 << 28)) ^ 266354560;
                            if (bM18353a2 < 0) {
                                j3 = j5 + 1;
                                if (oag.m18353a(j5) < 0) {
                                    j5 = j3 + 1;
                                    if (oag.m18353a(j3) < 0) {
                                        j3 = j5 + 1;
                                        if (oag.m18353a(j5) < 0) {
                                            j5 = j3 + 1;
                                            if (oag.m18353a(j3) < 0) {
                                                j3 = j5 + 1;
                                            } else {
                                                j3 = j5;
                                            }
                                        }
                                    } else {
                                        j3 = j5;
                                    }
                                }
                            } else {
                                j3 = j5;
                            }
                        }
                    }
                }
                this.f44856m = j3;
                return i;
            }
        }
        return (int) m17851s();
    }

    /* JADX INFO: renamed from: r */
    public final long m17850r() {
        long jM18353a;
        long j = this.f44856m;
        if (this.f44858o != j) {
            long j2 = j + 1;
            byte bM18353a = oag.m18353a(j);
            if (bM18353a >= 0) {
                this.f44856m++;
                return bM18353a;
            }
            if (this.f44858o - this.f44856m >= 10) {
                long j3 = j2 + 1;
                int iM18353a = bM18353a ^ (oag.m18353a(j2) << 7);
                if (iM18353a < 0) {
                    jM18353a = iM18353a ^ (-128);
                } else {
                    long j4 = j3 + 1;
                    int iM18353a2 = iM18353a ^ (oag.m18353a(j3) << 14);
                    if (iM18353a2 >= 0) {
                        jM18353a = iM18353a2 ^ 16256;
                        j3 = j4;
                    } else {
                        j3 = j4 + 1;
                        int iM18353a3 = iM18353a2 ^ (oag.m18353a(j4) << 21);
                        if (iM18353a3 < 0) {
                            jM18353a = iM18353a3 ^ (-2080896);
                        } else {
                            long j5 = j3 + 1;
                            long jM18353a2 = ((long) iM18353a3) ^ (((long) oag.m18353a(j3)) << 28);
                            if (jM18353a2 >= 0) {
                                jM18353a = jM18353a2 ^ 266354560;
                                j3 = j5;
                            } else {
                                long j6 = j5 + 1;
                                long jM18353a3 = jM18353a2 ^ (((long) oag.m18353a(j5)) << 35);
                                if (jM18353a3 < 0) {
                                    jM18353a = jM18353a3 ^ (-34093383808L);
                                    j3 = j6;
                                } else {
                                    long j7 = j6 + 1;
                                    long jM18353a4 = jM18353a3 ^ (((long) oag.m18353a(j6)) << 42);
                                    if (jM18353a4 >= 0) {
                                        jM18353a = jM18353a4 ^ 4363953127296L;
                                        j3 = j7;
                                    } else {
                                        long j8 = j7 + 1;
                                        long jM18353a5 = jM18353a4 ^ (((long) oag.m18353a(j7)) << 49);
                                        if (jM18353a5 < 0) {
                                            jM18353a = jM18353a5 ^ (-558586000294016L);
                                            j3 = j8;
                                        } else {
                                            long j9 = j8 + 1;
                                            jM18353a = (jM18353a5 ^ (((long) oag.m18353a(j8)) << 56)) ^ 71499008037633920L;
                                            if (jM18353a < 0) {
                                                long j10 = 1 + j9;
                                                if (oag.m18353a(j9) >= 0) {
                                                    j3 = j10;
                                                }
                                            } else {
                                                j3 = j9;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.f44856m = j3;
                return jM18353a;
            }
        }
        return m17851s();
    }
}
