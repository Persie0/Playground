package p000;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nwv extends nww {

    /* JADX INFO: renamed from: e */
    private final ByteBuffer f44867e;

    /* JADX INFO: renamed from: f */
    private final long f44868f;

    /* JADX INFO: renamed from: g */
    private long f44869g;

    /* JADX INFO: renamed from: h */
    private long f44870h;

    /* JADX INFO: renamed from: i */
    private final long f44871i;

    /* JADX INFO: renamed from: j */
    private int f44872j;

    /* JADX INFO: renamed from: k */
    private int f44873k;

    /* JADX INFO: renamed from: l */
    private int f44874l = Integer.MAX_VALUE;

    public nwv(ByteBuffer byteBuffer) {
        this.f44867e = byteBuffer;
        long jM18357e = oag.m18357e(byteBuffer);
        this.f44868f = jM18357e;
        this.f44869g = ((long) byteBuffer.limit()) + jM18357e;
        long jPosition = jM18357e + ((long) byteBuffer.position());
        this.f44870h = jPosition;
        this.f44871i = jPosition;
    }

    /* JADX INFO: renamed from: M */
    private final int m17865M() {
        return (int) (this.f44869g - this.f44870h);
    }

    /* JADX INFO: renamed from: N */
    private final void m17866N() {
        long j = this.f44869g + ((long) this.f44872j);
        this.f44869g = j;
        int i = (int) (j - this.f44871i);
        int i2 = this.f44874l;
        if (i <= i2) {
            this.f44872j = 0;
            return;
        }
        int i3 = i - i2;
        this.f44872j = i3;
        this.f44869g = j - ((long) i3);
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: A */
    public final void mo17809A(int i) {
        this.f44874l = i;
        m17866N();
    }

    /* JADX INFO: renamed from: B */
    public final void m17867B(int i) throws nyb {
        if (i >= 0 && i <= m17865M()) {
            this.f44870h += (long) i;
        } else {
            if (i >= 0) {
                throw nyb.m18167i();
            }
            throw nyb.m18164f();
        }
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: C */
    public final boolean mo17811C() {
        return this.f44870h == this.f44869g;
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: D */
    public final boolean mo17812D() {
        return m17871r() != 0;
    }

    /* JADX INFO: renamed from: a */
    public final byte m17868a() throws nyb {
        long j = this.f44870h;
        if (j == this.f44869g) {
            throw nyb.m18167i();
        }
        this.f44870h = 1 + j;
        return oag.m18353a(j);
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: b */
    public final double mo17815b() {
        return Double.longBitsToDouble(m17870q());
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: c */
    public final float mo17816c() {
        return Float.intBitsToFloat(m17869i());
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: d */
    public final int mo17817d() {
        return (int) (this.f44870h - this.f44871i);
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: e */
    public final int mo17818e(int i) throws nyb {
        if (i < 0) {
            throw nyb.m18164f();
        }
        int iMo17817d = i + mo17817d();
        int i2 = this.f44874l;
        if (iMo17817d > i2) {
            throw nyb.m18167i();
        }
        this.f44874l = iMo17817d;
        m17866N();
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
        return m17869i();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: h */
    public final int mo17821h() {
        return mo17823j();
    }

    /* JADX INFO: renamed from: i */
    public final int m17869i() throws nyb {
        long j = this.f44870h;
        if (this.f44869g - j < 4) {
            throw nyb.m18167i();
        }
        this.f44870h = 4 + j;
        int iM18353a = oag.m18353a(j) & 255;
        int iM18353a2 = oag.m18353a(1 + j) & 255;
        int iM18353a3 = oag.m18353a(2 + j) & 255;
        return ((oag.m18353a(j + 3) & 255) << 24) | (iM18353a2 << 8) | iM18353a | (iM18353a3 << 16);
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: k */
    public final int mo17824k() {
        return m17869i();
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
            this.f44873k = 0;
            return 0;
        }
        int iMo17823j = mo17823j();
        this.f44873k = iMo17823j;
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
        return m17870q();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: p */
    public final long mo17829p() {
        return m17871r();
    }

    /* JADX INFO: renamed from: q */
    public final long m17870q() throws nyb {
        long j = this.f44870h;
        if (this.f44869g - j < 8) {
            throw nyb.m18167i();
        }
        this.f44870h = 8 + j;
        long jM18353a = oag.m18353a(j);
        long jM18353a2 = oag.m18353a(1 + j);
        long jM18353a3 = oag.m18353a(2 + j);
        long jM18353a4 = oag.m18353a(3 + j);
        long jM18353a5 = oag.m18353a(4 + j);
        return ((((long) oag.m18353a(j + 7)) & 255) << 56) | (jM18353a & 255) | ((jM18353a2 & 255) << 8) | ((jM18353a3 & 255) << 16) | ((jM18353a4 & 255) << 24) | ((jM18353a5 & 255) << 32) | ((oag.m18353a(5 + j) & 255) << 40) | ((oag.m18353a(6 + j) & 255) << 48);
    }

    /* JADX INFO: renamed from: s */
    final long m17872s() throws nyb {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bM17868a = m17868a();
            j |= ((long) (bM17868a & 127)) << i;
            if ((bM17868a & 128) == 0) {
                return j;
            }
        }
        throw nyb.m18163e();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: t */
    public final long mo17833t() {
        return m17870q();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: u */
    public final long mo17834u() {
        return m17875H(m17871r());
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: v */
    public final long mo17835v() {
        return m17871r();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: w */
    public final nwr mo17836w() throws nyb {
        int iMo17823j = mo17823j();
        if (iMo17823j <= 0 || iMo17823j > m17865M()) {
            if (iMo17823j == 0) {
                return nwr.f44839b;
            }
            if (iMo17823j < 0) {
                throw nyb.m18164f();
            }
            throw nyb.m18167i();
        }
        byte[] bArr = new byte[iMo17823j];
        long j = iMo17823j;
        oag.m18363k(this.f44870h, bArr, 0L, j);
        this.f44870h += j;
        return nwr.m17802x(bArr);
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: x */
    public final String mo17837x() throws nyb {
        int iMo17823j = mo17823j();
        if (iMo17823j <= 0 || iMo17823j > m17865M()) {
            if (iMo17823j == 0) {
                return "";
            }
            if (iMo17823j < 0) {
                throw nyb.m18164f();
            }
            throw nyb.m18167i();
        }
        byte[] bArr = new byte[iMo17823j];
        long j = iMo17823j;
        oag.m18363k(this.f44870h, bArr, 0L, j);
        String str = new String(bArr, nxz.f44985a);
        this.f44870h += j;
        return str;
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: y */
    public final String mo17838y() throws nyb {
        int iMo17823j = mo17823j();
        if (iMo17823j > 0 && iMo17823j <= m17865M()) {
            String strM18384f = oai.m18384f(this.f44867e, (int) (this.f44870h - this.f44868f), iMo17823j);
            this.f44870h += (long) iMo17823j;
            return strM18384f;
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
        if (this.f44873k != i) {
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
                if (m17865M() < 10) {
                    while (i2 < 10) {
                        if (m17868a() < 0) {
                            i2++;
                        }
                    }
                    throw nyb.m18163e();
                }
                while (i2 < 10) {
                    long j = this.f44870h;
                    this.f44870h = 1 + j;
                    if (oag.m18353a(j) < 0) {
                        i2++;
                    }
                }
                throw nyb.m18163e();
                return true;
            case 1:
                m17867B(8);
                return true;
            case 2:
                m17867B(mo17823j());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                m17867B(4);
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

    /* JADX WARN: Code duplicated, block: B:33:0x0085 A[PHI: r4
      0x0085: PHI (r4v4 long) = (r4v3 long), (r4v5 long), (r4v6 long) binds: [B:21:0x005a, B:25:0x006a, B:29:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        if (p000.oag.m18353a(r4) >= 0) goto L34;
     */
    @Override // p000.nww
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo17823j() {
        int i;
        long j = this.f44870h;
        if (this.f44869g != j) {
            long j2 = j + 1;
            byte bM18353a = oag.m18353a(j);
            if (bM18353a >= 0) {
                this.f44870h = j2;
                return bM18353a;
            }
            if (this.f44869g - j2 >= 9) {
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
                this.f44870h = j3;
                return i;
            }
        }
        return (int) m17872s();
    }

    /* JADX INFO: renamed from: r */
    public final long m17871r() {
        long jM18353a;
        long j = this.f44870h;
        if (this.f44869g != j) {
            long j2 = j + 1;
            byte bM18353a = oag.m18353a(j);
            if (bM18353a >= 0) {
                this.f44870h = j2;
                return bM18353a;
            }
            if (this.f44869g - j2 >= 9) {
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
                this.f44870h = j3;
                return jM18353a;
            }
        }
        return m17872s();
    }
}
