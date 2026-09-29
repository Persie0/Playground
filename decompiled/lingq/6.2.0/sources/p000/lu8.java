package p000;

/* JADX INFO: loaded from: classes.dex */
public final class lu8 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50149a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ w34 f50150b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f50151c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f50152d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ uh8 f50153e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ xi3 f50154f;

    public /* synthetic */ lu8(w34 w34Var, boolean z, boolean z2, uh8 uh8Var, xi3 xi3Var, int i) {
        this.f50149a = i;
        this.f50150b = w34Var;
        this.f50151c = z;
        this.f50152d = z2;
        this.f50153e = uh8Var;
        this.f50154f = xi3Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f50149a;
        xi3 xi3Var = this.f50154f;
        w34 w34Var = this.f50150b;
        b16 b16Var = b16.f7762a;
        p84 p84Var = we1.f66679a;
        switch (i) {
            case 0:
                ((Number) obj3).intValue();
                tj3 tj3Var = (tj3) ((ye1) obj2);
                tj3Var.m22111b0(-1525724089);
                Object objM22097O = tj3Var.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = AbstractC3393o1.m17729d(tj3Var);
                }
                v56 v56Var = (v56) objM22097O;
                e16 e16VarMo3161g = s34.m21046a(b16Var, v56Var, w34Var).mo3161g(new ku8(this.f50151c, v56Var, null, this.f50152d, this.f50153e, (ui3) xi3Var));
                tj3Var.m22139q(false);
                return e16VarMo3161g;
            default:
                ((Number) obj3).intValue();
                tj3 tj3Var2 = (tj3) ((ye1) obj2);
                tj3Var2.m22111b0(-1525724089);
                Object objM22097O2 = tj3Var2.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = AbstractC3393o1.m17729d(tj3Var2);
                }
                v56 v56Var2 = (v56) objM22097O2;
                e16 e16VarMo3161g2 = s34.m21046a(b16Var, v56Var2, w34Var).mo3161g(new y1a(this.f50151c, v56Var2, null, this.f50152d, this.f50153e, (vi3) xi3Var));
                tj3Var2.m22139q(false);
                return e16VarMo3161g2;
        }
    }
}
