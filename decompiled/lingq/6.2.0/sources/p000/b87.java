package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class b87 implements nca {

    /* JADX INFO: renamed from: a */
    public final yo2 f8110a;

    /* JADX INFO: renamed from: b */
    public final so0 f8111b = new so0(10, new byte[10]);

    /* JADX INFO: renamed from: c */
    public int f8112c = 0;

    /* JADX INFO: renamed from: d */
    public int f8113d;

    /* JADX INFO: renamed from: e */
    public g1a f8114e;

    /* JADX INFO: renamed from: f */
    public boolean f8115f;

    /* JADX INFO: renamed from: g */
    public boolean f8116g;

    /* JADX INFO: renamed from: h */
    public boolean f8117h;

    /* JADX INFO: renamed from: i */
    public int f8118i;

    /* JADX INFO: renamed from: j */
    public int f8119j;

    /* JADX INFO: renamed from: k */
    public boolean f8120k;

    /* JADX INFO: renamed from: l */
    public long f8121l;

    public b87(yo2 yo2Var) {
        this.f8110a = yo2Var;
    }

    @Override // p000.nca
    /* JADX INFO: renamed from: a */
    public final void mo3474a(int i, k47 k47Var) {
        int i2;
        int i3;
        this.f8114e.getClass();
        int i4 = i & 1;
        int i5 = -1;
        int i6 = 2;
        yo2 yo2Var = this.f8110a;
        if (i4 != 0) {
            int i7 = this.f8112c;
            if (i7 != 0 && i7 != 1) {
                if (i7 == 2) {
                    ss5.m21707d0("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i7 != 3) {
                        uk9.m22770c();
                        return;
                    }
                    if (this.f8119j != -1) {
                        ss5.m21707d0("PesReader", "Unexpected start indicator: expected " + this.f8119j + " more bytes");
                    }
                    yo2Var.mo612e(k47Var.f46702c == 0);
                }
            }
            this.f8112c = 1;
            this.f8113d = 0;
        }
        int i8 = i;
        while (k47Var.m14820a() > 0) {
            int i9 = this.f8112c;
            if (i9 != 0) {
                so0 so0Var = this.f8111b;
                if (i9 != 1) {
                    if (i9 == i6) {
                        if (m3475b(k47Var, so0Var.f61083b, Math.min(10, this.f8118i)) && m3475b(k47Var, null, this.f8118i)) {
                            so0Var.m21509m(0);
                            this.f8121l = -9223372036854775807L;
                            if (this.f8115f) {
                                so0Var.m21511o(4);
                                long jM21503g = ((long) so0Var.m21503g(3)) << 30;
                                so0Var.m21511o(1);
                                long jM21503g2 = ((long) (so0Var.m21503g(15) << 15)) | jM21503g;
                                so0Var.m21511o(1);
                                long jM21503g3 = jM21503g2 | ((long) so0Var.m21503g(15));
                                so0Var.m21511o(1);
                                if (!this.f8117h && this.f8116g) {
                                    so0Var.m21511o(4);
                                    long jM21503g4 = ((long) so0Var.m21503g(3)) << 30;
                                    so0Var.m21511o(1);
                                    long jM21503g5 = jM21503g4 | ((long) (so0Var.m21503g(15) << 15));
                                    so0Var.m21511o(1);
                                    long jM21503g6 = jM21503g5 | ((long) so0Var.m21503g(15));
                                    so0Var.m21511o(1);
                                    this.f8114e.m12280b(jM21503g6);
                                    this.f8117h = true;
                                }
                                this.f8121l = this.f8114e.m12280b(jM21503g3);
                            }
                            i8 |= this.f8120k ? 4 : 0;
                            yo2Var.mo613f(i8, this.f8121l);
                            this.f8112c = 3;
                            this.f8113d = 0;
                            i5 = -1;
                            i6 = 2;
                        }
                    } else {
                        if (i9 != 3) {
                            uk9.m22770c();
                            return;
                        }
                        int iM14820a = k47Var.m14820a();
                        int i10 = this.f8119j;
                        int i11 = i10 == i5 ? 0 : iM14820a - i10;
                        if (i11 > 0) {
                            iM14820a -= i11;
                            k47Var.m14817L(k47Var.f46701b + iM14820a);
                        }
                        yo2Var.mo609b(k47Var);
                        int i12 = this.f8119j;
                        if (i12 != i5) {
                            int i13 = i12 - iM14820a;
                            this.f8119j = i13;
                            if (i13 == 0) {
                                yo2Var.mo612e(false);
                                this.f8112c = 1;
                                this.f8113d = 0;
                            }
                        }
                    }
                    i2 = i6;
                } else if (m3475b(k47Var, so0Var.f61083b, 9)) {
                    so0Var.m21509m(0);
                    int iM21503g = so0Var.m21503g(24);
                    if (iM21503g != 1) {
                        hn1.m13364n("Unexpected start code prefix: ", iM21503g, "PesReader");
                        i5 = -1;
                        this.f8119j = -1;
                        i3 = 0;
                        i2 = 2;
                    } else {
                        so0Var.m21511o(8);
                        int iM21503g2 = so0Var.m21503g(16);
                        so0Var.m21511o(5);
                        this.f8120k = so0Var.m21502f();
                        i2 = 2;
                        so0Var.m21511o(2);
                        this.f8115f = so0Var.m21502f();
                        this.f8116g = so0Var.m21502f();
                        so0Var.m21511o(6);
                        int iM21503g3 = so0Var.m21503g(8);
                        this.f8118i = iM21503g3;
                        if (iM21503g2 == 0) {
                            this.f8119j = -1;
                            i5 = -1;
                        } else {
                            int i14 = (iM21503g2 - 3) - iM21503g3;
                            this.f8119j = i14;
                            if (i14 < 0) {
                                ss5.m21707d0("PesReader", "Found negative packet payload size: " + this.f8119j);
                                i5 = -1;
                                this.f8119j = -1;
                            } else {
                                i5 = -1;
                            }
                        }
                        i3 = 2;
                    }
                    this.f8112c = i3;
                    this.f8113d = 0;
                } else {
                    i5 = -1;
                    i2 = 2;
                }
            } else {
                i2 = i6;
                k47Var.m14819N(k47Var.m14820a());
            }
            i6 = i2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3475b(k47 k47Var, byte[] bArr, int i) {
        int iMin = Math.min(k47Var.m14820a(), i - this.f8113d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            k47Var.m14819N(iMin);
        } else {
            k47Var.m14827k(bArr, this.f8113d, iMin);
        }
        int i2 = this.f8113d + iMin;
        this.f8113d = i2;
        return i2 == i;
    }

    @Override // p000.nca
    /* JADX INFO: renamed from: c */
    public final void mo3476c(g1a g1aVar, jy2 jy2Var, mca mcaVar) {
        this.f8114e = g1aVar;
        this.f8110a.mo614g(jy2Var, mcaVar);
    }

    @Override // p000.nca
    /* JADX INFO: renamed from: d */
    public final void mo3477d() {
        this.f8112c = 0;
        this.f8113d = 0;
        this.f8117h = false;
        this.f8110a.mo611d();
    }
}
