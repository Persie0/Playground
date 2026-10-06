package p000;

/* JADX INFO: renamed from: yq */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1155yq extends C1152yn {

    /* JADX INFO: renamed from: at */
    private boolean f48277at;

    /* JADX INFO: renamed from: a */
    public float f48275a = -1.0f;

    /* JADX INFO: renamed from: b */
    public int f48278b = -1;

    /* JADX INFO: renamed from: c */
    public int f48279c = -1;

    /* JADX INFO: renamed from: d */
    public C1151ym f48280d = this.f48196L;

    /* JADX INFO: renamed from: as */
    public int f48276as = 0;

    public C1155yq() {
        this.f48204T.clear();
        this.f48204T.add(this.f48280d);
        int length = this.f48203S.length;
        for (int i = 0; i < 6; i++) {
            this.f48203S[i] = this.f48280d;
        }
    }

    @Override // p000.C1152yn
    /* JADX INFO: renamed from: S */
    public final void mo19684S(boolean z) {
        if (this.f48206V == null) {
            return;
        }
        int iM19615o = C1141yc.m19615o(this.f48280d);
        if (this.f48276as == 1) {
            this.f48212aa = iM19615o;
            this.f48213ab = 0;
            m19666A(this.f48206V.m19687h());
            m19671F(0);
            return;
        }
        this.f48212aa = 0;
        this.f48213ab = iM19615o;
        m19671F(this.f48206V.m19689j());
        m19666A(0);
    }

    /* JADX INFO: renamed from: a */
    public final void m19717a(int i) {
        this.f48280d.m19654e(i);
        this.f48277at = true;
    }

    @Override // p000.C1152yn
    /* JADX INFO: renamed from: b */
    public final void mo19645b(C1141yc c1141yc, boolean z) {
        C1152yn c1152yn = this.f48206V;
        if (c1152yn == null) {
            return;
        }
        Object objMo19692m = c1152yn.mo19692m(EnumC1150yl.LEFT);
        Object objMo19692m2 = c1152yn.mo19692m(EnumC1150yl.RIGHT);
        C1152yn c1152yn2 = this.f48206V;
        boolean z2 = c1152yn2 != null && c1152yn2.f48229ar[0] == 2;
        if (this.f48276as == 0) {
            objMo19692m = c1152yn.mo19692m(EnumC1150yl.TOP);
            objMo19692m2 = c1152yn.mo19692m(EnumC1150yl.BOTTOM);
            C1152yn c1152yn3 = this.f48206V;
            z2 = c1152yn3 != null && c1152yn3.f48229ar[1] == 2;
        }
        if (this.f48277at) {
            C1151ym c1151ym = this.f48280d;
            if (c1151ym.f48178c) {
                C1146yh c1146yhM19623b = c1141yc.m19623b(c1151ym);
                c1141yc.m19627f(c1146yhM19623b, this.f48280d.m19650a());
                if (this.f48278b != -1) {
                    if (z2) {
                        c1141yc.m19628g(c1141yc.m19623b(objMo19692m2), c1146yhM19623b, 0, 5);
                    }
                } else if (this.f48279c != -1 && z2) {
                    C1146yh c1146yhM19623b2 = c1141yc.m19623b(objMo19692m2);
                    c1141yc.m19628g(c1146yhM19623b, c1141yc.m19623b(objMo19692m), 0, 5);
                    c1141yc.m19628g(c1146yhM19623b2, c1146yhM19623b, 0, 5);
                }
                this.f48277at = false;
                return;
            }
        }
        if (this.f48278b != -1) {
            C1146yh c1146yhM19623b3 = c1141yc.m19623b(this.f48280d);
            c1141yc.m19634m(c1146yhM19623b3, c1141yc.m19623b(objMo19692m), this.f48278b, 8);
            if (z2) {
                c1141yc.m19628g(c1141yc.m19623b(objMo19692m2), c1146yhM19623b3, 0, 5);
                return;
            }
            return;
        }
        if (this.f48279c != -1) {
            C1146yh c1146yhM19623b4 = c1141yc.m19623b(this.f48280d);
            C1146yh c1146yhM19623b5 = c1141yc.m19623b(objMo19692m2);
            c1141yc.m19634m(c1146yhM19623b4, c1146yhM19623b5, -this.f48279c, 8);
            if (z2) {
                c1141yc.m19628g(c1146yhM19623b4, c1141yc.m19623b(objMo19692m), 0, 5);
                c1141yc.m19628g(c1146yhM19623b5, c1146yhM19623b4, 0, 5);
                return;
            }
            return;
        }
        if (this.f48275a != -1.0f) {
            C1146yh c1146yhM19623b6 = c1141yc.m19623b(this.f48280d);
            C1146yh c1146yhM19623b7 = c1141yc.m19623b(objMo19692m2);
            float f = this.f48275a;
            C1140yb c1140ybM19622a = c1141yc.m19622a();
            c1140ybM19622a.f48060e.m19602g(c1146yhM19623b6, -1.0f);
            c1140ybM19622a.f48060e.m19602g(c1146yhM19623b7, f);
            c1141yc.m19626e(c1140ybM19622a);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m19718c(int i) {
        if (this.f48276as == i) {
            return;
        }
        this.f48276as = i;
        this.f48204T.clear();
        if (this.f48276as == 1) {
            this.f48280d = this.f48195K;
        } else {
            this.f48280d = this.f48196L;
        }
        this.f48204T.add(this.f48280d);
        int length = this.f48203S.length;
        for (int i2 = 0; i2 < 6; i2++) {
            this.f48203S[i2] = this.f48280d;
        }
    }

    @Override // p000.C1152yn
    /* JADX INFO: renamed from: d */
    public final boolean mo19647d() {
        return true;
    }

    @Override // p000.C1152yn
    /* JADX INFO: renamed from: e */
    public final boolean mo19648e() {
        return this.f48277at;
    }

    @Override // p000.C1152yn
    /* JADX INFO: renamed from: f */
    public final boolean mo19649f() {
        return this.f48277at;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r2.f48276as == 1) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (r2.f48276as == 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        return r2.f48280d;
     */
    @Override // p000.C1152yn
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1151ym mo19692m(EnumC1150yl enumC1150yl) {
        EnumC1150yl enumC1150yl2 = EnumC1150yl.NONE;
        switch (enumC1150yl.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
            default:
                return null;
            case 1:
            case 3:
                break;
            case 2:
            case 4:
                break;
        }
    }
}
