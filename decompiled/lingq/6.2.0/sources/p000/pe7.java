package p000;

import com.lingq.feature.playlist.AbstractC2253c;

/* JADX INFO: loaded from: classes3.dex */
public final class pe7 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tb7 f56007a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ td7 f56008b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f56009c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f56010d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ t66 f56011e;

    public pe7(tb7 tb7Var, td7 td7Var, vi3 vi3Var, t66 t66Var, t66 t66Var2) {
        this.f56007a = tb7Var;
        this.f56008b = td7Var;
        this.f56009c = vi3Var;
        this.f56010d = t66Var;
        this.f56011e = t66Var2;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((bi0) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            e16 e16VarM4409b = c99.m4409b(b16.f7762a, 0.0f, 48.0f, 1);
            boolean zBooleanValue = ((Boolean) this.f56010d.getValue()).booleanValue();
            tb7 tb7Var = this.f56007a;
            Integer numValueOf = tb7Var != null ? Integer.valueOf(tb7Var.f62101a) : null;
            boolean zM22124i = tj3Var.m22124i(tb7Var);
            vi3 vi3Var = this.f56009c;
            boolean zM22120g = zM22124i | tj3Var.m22120g(vi3Var);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                objM22097O = new sb0((Object) tb7Var, (Object) vi3Var, this.f56011e, 4);
                tj3Var.m22131l0(objM22097O);
            }
            vi3 vi3Var2 = (vi3) objM22097O;
            boolean zM22120g2 = tj3Var.m22120g(vi3Var);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22120g2 || objM22097O2 == p84Var) {
                objM22097O2 = new qo1(vi3Var, 2);
                tj3Var.m22131l0(objM22097O2);
            }
            vi3 vi3Var3 = (vi3) objM22097O2;
            boolean zM22120g3 = tj3Var.m22120g(vi3Var);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22120g3 || objM22097O3 == p84Var) {
                objM22097O3 = new ro1(vi3Var, 1);
                tj3Var.m22131l0(objM22097O3);
            }
            zi3 zi3Var = (zi3) objM22097O3;
            boolean zM22120g4 = tj3Var.m22120g(vi3Var);
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22120g4 || objM22097O4 == p84Var) {
                objM22097O4 = new ro1(vi3Var, 2);
                tj3Var.m22131l0(objM22097O4);
            }
            AbstractC2253c.m9228n(e16VarM4409b, this.f56008b, numValueOf, zBooleanValue, false, vi3Var2, vi3Var3, zi3Var, (zi3) objM22097O4, tj3Var, 24582, 0);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }
}
