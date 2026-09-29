package p000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class px0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56937a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f56938b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f56939c;

    public /* synthetic */ px0(t66 t66Var, t66 t66Var2, int i) {
        this.f56937a = i;
        this.f56938b = t66Var;
        this.f56939c = t66Var2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        long j;
        int i = this.f56937a;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f56939c;
        t66 t66Var2 = this.f56938b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else if (((String) t66Var2.getValue()).length() <= 0) {
                    tj3Var.m22111b0(-429158234);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(-429957538);
                    String strM17732g = AbstractC3393o1.m17732g(((String) t66Var2.getValue()).length(), " / 500");
                    e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
                    if (((Boolean) t66Var.getValue()).booleanValue()) {
                        tj3Var.m22111b0(-429596729);
                        j = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55879w;
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(-429432708);
                        j = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55875s;
                        tj3Var.m22139q(false);
                    }
                    lw9.m16554b(strM17732g, e16VarM4412e, j, null, 0L, null, null, 0L, null, new ks9(6), 0L, 0, false, 0, 0, null, null, tj3Var, 48, 0, 261112);
                    tj3Var.m22139q(false);
                }
                break;
            case 1:
                z4a z4aVar = (z4a) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                z4aVar.getClass();
                if (!((Boolean) t66Var2.getValue()).booleanValue() || zBooleanValue) {
                    t66Var.setValue(z4aVar);
                }
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                t66Var2.setValue(bool);
                t66Var.setValue(new n84(((n84) obj2).f52482a));
                break;
        }
        return xfaVar;
    }
}
