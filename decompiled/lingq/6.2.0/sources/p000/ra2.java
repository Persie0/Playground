package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ra2 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58960a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ta2 f58961b;

    public /* synthetic */ ra2(ta2 ta2Var) {
        this.f58961b = ta2Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        vxc lh8Var;
        int i = this.f58960a;
        ta2 ta2Var = this.f58961b;
        switch (i) {
            case 0:
                ch8 ch8Var = (ch8) thb.m22050i(ta2Var, gh8.f40824b);
                hh8 hh8Var = ta2Var.f62047T;
                if (ch8Var == null) {
                    if (hh8Var != null) {
                        ta2Var.m11625a1(hh8Var);
                    }
                    ta2Var.f62047T = null;
                } else if (hh8Var == null) {
                    sa2 sa2Var = new sa2(ta2Var, 0);
                    ra2 ra2Var = new ra2(ta2Var, new sa2(ta2Var, 1), new m58(ta2Var, 17));
                    v56 v56Var = ta2Var.f62039L;
                    boolean z = ta2Var.f62040M;
                    float f = ta2Var.f62041N;
                    fda fdaVar = fh8.f39110a;
                    hh8 hh8Var2 = new hh8();
                    hh8Var2.m11624Z0(new C2931dk(v56Var, z, f, sa2Var, ra2Var));
                    ta2Var.m11624Z0(hh8Var2);
                    ta2Var.f62047T = hh8Var2;
                }
                return xfa.f68157a;
            default:
                q36 q36Var = ((ms5) thb.m22050i(ta2Var, ps5.f56764b)).f51802d;
                th8 th8Var = (th8) thb.m22050i(ta2Var, gh8.f40823a);
                dyc ph8Var = ta2Var.f62043P ? new ph8() : oh8.f54354d;
                if (ta2Var.f62044Q) {
                    sh8 sh8Var = th8Var.f62294a;
                    lh8Var = new lh8();
                } else {
                    lh8Var = kh8.f47301c;
                }
                return new qh8(ph8Var, lh8Var, ta2Var.f62045R ? new nh8() : mh8.f51335c, ta2Var.f62046S ? new jh8() : ih8.f44114b);
        }
    }

    public /* synthetic */ ra2(ta2 ta2Var, sa2 sa2Var, m58 m58Var) {
        this.f58961b = ta2Var;
    }
}
