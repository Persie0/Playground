package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p7a implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55704a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Set f55705b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f55706c;

    public /* synthetic */ p7a(Set set, vi3 vi3Var, int i) {
        this.f55704a = i;
        this.f55705b = set;
        this.f55706c = vi3Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f55704a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f55706c;
        Set set = this.f55705b;
        switch (i) {
            case 0:
                db1 db1Var = (db1) obj;
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                db1Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((tj3) ye1Var).m22120g(db1Var) ? 4 : 2;
                }
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    tj3Var.m22102U();
                } else {
                    e16 e16VarM10266b = db1Var.m10266b(b16.f7762a, true);
                    zf1 zf1Var = ge9.f40637a;
                    x17 x17VarM21622e = AbstractC3584sr.m21622e(0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38955d, 1);
                    C3661uu c3661uu = new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38963l, true, new gm5(28));
                    boolean zM22124i = tj3Var.m22124i(set) | tj3Var.m22120g(vi3Var);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22124i || objM22097O == we1.f66679a) {
                        objM22097O = new r3a(5, set, vi3Var);
                        tj3Var.m22131l0(objM22097O);
                    }
                    fa4.m11642c(e16VarM10266b, null, x17VarM21622e, c3661uu, null, null, false, null, (vi3) objM22097O, tj3Var, 0, 490);
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    tj3Var2.m22102U();
                } else {
                    q7a.m19707b(q7a.f57354a, set, vi3Var, tj3Var2, 0);
                }
                break;
            case 2:
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    tj3Var3.m22102U();
                } else {
                    q7a.m19707b(q7a.f57355b, set, vi3Var, tj3Var3, 0);
                }
                break;
            default:
                ye1 ye1Var4 = (ye1) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    tj3Var4.m22102U();
                } else {
                    q7a.m19707b(q7a.f57356c, set, vi3Var, tj3Var4, 0);
                }
                break;
        }
        return xfaVar;
    }
}
