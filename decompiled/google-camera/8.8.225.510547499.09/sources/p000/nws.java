package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nws extends nww {

    /* JADX INFO: renamed from: e */
    private final byte[] f44841e;

    /* JADX INFO: renamed from: f */
    private int f44842f;

    /* JADX INFO: renamed from: g */
    private int f44843g;

    /* JADX INFO: renamed from: h */
    private int f44844h;

    /* JADX INFO: renamed from: i */
    private final int f44845i;

    /* JADX INFO: renamed from: j */
    private int f44846j;

    /* JADX INFO: renamed from: k */
    private int f44847k = Integer.MAX_VALUE;

    public nws(byte[] bArr, int i, int i2) {
        this.f44841e = bArr;
        this.f44842f = i2 + i;
        this.f44844h = i;
        this.f44845i = i;
    }

    /* JADX INFO: renamed from: M */
    private final void m17808M() {
        int i = this.f44842f + this.f44843g;
        this.f44842f = i;
        int i2 = i - this.f44845i;
        int i3 = this.f44847k;
        if (i2 <= i3) {
            this.f44843g = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f44843g = i4;
        this.f44842f = i - i4;
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: A */
    public final void mo17809A(int i) {
        this.f44847k = i;
        m17808M();
    }

    /* JADX INFO: renamed from: B */
    public final void m17810B(int i) throws nyb {
        if (i >= 0) {
            int i2 = this.f44842f;
            int i3 = this.f44844h;
            if (i <= i2 - i3) {
                this.f44844h = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw nyb.m18167i();
        }
        throw nyb.m18164f();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: C */
    public final boolean mo17811C() {
        return this.f44844h == this.f44842f;
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: D */
    public final boolean mo17812D() {
        return m17831r() != 0;
    }

    /* JADX INFO: renamed from: a */
    public final byte m17814a() throws nyb {
        int i = this.f44844h;
        if (i == this.f44842f) {
            throw nyb.m18167i();
        }
        byte[] bArr = this.f44841e;
        this.f44844h = i + 1;
        return bArr[i];
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: b */
    public final double mo17815b() {
        return Double.longBitsToDouble(m17830q());
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: c */
    public final float mo17816c() {
        return Float.intBitsToFloat(m17822i());
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: d */
    public final int mo17817d() {
        return this.f44844h - this.f44845i;
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: e */
    public final int mo17818e(int i) {
        if (i < 0) {
            throw nyb.m18164f();
        }
        int iMo17817d = i + mo17817d();
        if (iMo17817d < 0) {
            throw nyb.m18165g();
        }
        int i2 = this.f44847k;
        if (iMo17817d > i2) {
            throw nyb.m18167i();
        }
        this.f44847k = iMo17817d;
        m17808M();
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
        return m17822i();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: h */
    public final int mo17821h() {
        return mo17823j();
    }

    /* JADX INFO: renamed from: i */
    public final int m17822i() throws nyb {
        int i = this.f44844h;
        if (this.f44842f - i < 4) {
            throw nyb.m18167i();
        }
        byte[] bArr = this.f44841e;
        this.f44844h = i + 4;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: k */
    public final int mo17824k() {
        return m17822i();
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
            this.f44846j = 0;
            return 0;
        }
        int iMo17823j = mo17823j();
        this.f44846j = iMo17823j;
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
        return m17830q();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: p */
    public final long mo17829p() {
        return m17831r();
    }

    /* JADX INFO: renamed from: q */
    public final long m17830q() throws nyb {
        int i = this.f44844h;
        if (this.f44842f - i < 8) {
            throw nyb.m18167i();
        }
        byte[] bArr = this.f44841e;
        this.f44844h = i + 8;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        long j6 = bArr[i + 5];
        return ((((long) bArr[i + 7]) & 255) << 56) | (j & 255) | j2 | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* JADX INFO: renamed from: s */
    final long m17832s() throws nyb {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bM17814a = m17814a();
            j |= ((long) (bM17814a & 127)) << i;
            if ((bM17814a & 128) == 0) {
                return j;
            }
        }
        throw nyb.m18163e();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: t */
    public final long mo17833t() {
        return m17830q();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: u */
    public final long mo17834u() {
        return m17875H(m17831r());
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: v */
    public final long mo17835v() {
        return m17831r();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: w */
    public final nwr mo17836w() throws nyb {
        int iMo17823j = mo17823j();
        if (iMo17823j > 0) {
            int i = this.f44842f;
            int i2 = this.f44844h;
            if (iMo17823j <= i - i2) {
                nwr nwrVarM17800v = nwr.m17800v(this.f44841e, i2, iMo17823j);
                this.f44844h += iMo17823j;
                return nwrVarM17800v;
            }
        }
        if (iMo17823j == 0) {
            return nwr.f44839b;
        }
        if (iMo17823j > 0) {
            int i3 = this.f44842f;
            int i4 = this.f44844h;
            if (iMo17823j <= i3 - i4) {
                int i5 = iMo17823j + i4;
                this.f44844h = i5;
                return nwr.m17802x(Arrays.copyOfRange(this.f44841e, i4, i5));
            }
        }
        if (iMo17823j <= 0) {
            throw nyb.m18164f();
        }
        throw nyb.m18167i();
    }

    @Override // p000.nww
    /* JADX INFO: renamed from: x */
    public final String mo17837x() throws nyb {
        int iMo17823j = mo17823j();
        if (iMo17823j > 0) {
            int i = this.f44842f;
            int i2 = this.f44844h;
            if (iMo17823j <= i - i2) {
                String str = new String(this.f44841e, i2, iMo17823j, nxz.f44985a);
                this.f44844h += iMo17823j;
                return str;
            }
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
            int i = this.f44842f;
            int i2 = this.f44844h;
            if (iMo17823j <= i - i2) {
                String strM15410S = lij.m15410S(this.f44841e, i2, iMo17823j);
                this.f44844h += iMo17823j;
                return strM15410S;
            }
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
        if (this.f44846j != i) {
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
                if (this.f44842f - this.f44844h < 10) {
                    while (i2 < 10) {
                        if (m17814a() < 0) {
                            i2++;
                        }
                    }
                    throw nyb.m18163e();
                }
                while (i2 < 10) {
                    byte[] bArr = this.f44841e;
                    int i3 = this.f44844h;
                    this.f44844h = i3 + 1;
                    if (bArr[i3] < 0) {
                        i2++;
                    }
                }
                throw nyb.m18163e();
                return true;
            case 1:
                m17810B(8);
                return true;
            case 2:
                m17810B(mo17823j());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                m17810B(4);
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
        int i2 = this.f44844h;
        int i3 = this.f44842f;
        if (i3 != i2) {
            byte[] bArr = this.f44841e;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f44844h = i4;
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
                this.f44844h = i5;
                return i;
            }
        }
        return (int) m17832s();
    }

    /* JADX INFO: renamed from: r */
    public final long m17831r() {
        long j;
        int i = this.f44844h;
        int i2 = this.f44842f;
        if (i2 != i) {
            byte[] bArr = this.f44841e;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.f44844h = i3;
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
                this.f44844h = i4;
                return j;
            }
        }
        return m17832s();
    }
}
