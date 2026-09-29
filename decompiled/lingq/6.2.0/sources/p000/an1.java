package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class an1 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f856a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cn1 f857b;

    public /* synthetic */ an1(cn1 cn1Var, int i) {
        this.f856a = i;
        this.f857b = cn1Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f856a;
        xfa xfaVar = xfa.f68157a;
        cn1 cn1Var = this.f857b;
        switch (i) {
            case 0:
                te1.m21975H(cn1Var);
                return xfaVar;
            case 1:
                cn1Var.f10312R.m1107h(true);
                break;
            case 2:
                cn1Var.f10312R.m1104d(true);
                break;
            case 3:
                cn1Var.f10312R.m1105f();
                break;
            case 4:
                te1.m21975H(cn1Var);
                return xfaVar;
            case 5:
                cn1Var.f10312R.m1116q();
                break;
            case 6:
                sm1 sm1Var = cn1Var.f10308N.f70591w;
                sm1Var.f61018b.f70586r.m11889b(cn1Var.f10313S.f66168e);
                break;
            default:
                yw4 yw4Var = cn1Var.f10308N;
                z93 z93Var = cn1Var.f10314T;
                if (yw4Var.m25361b()) {
                    ld9 ld9Var = yw4Var.f70571c;
                    if (ld9Var != null) {
                        ((pa2) ld9Var).m19005b();
                    }
                } else {
                    z93.m25512a(z93Var);
                }
                return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}
