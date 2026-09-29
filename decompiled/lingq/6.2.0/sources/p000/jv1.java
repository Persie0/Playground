package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jv1 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46173a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ru1 f46174b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lv1 f46175c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ui3 f46176d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ vi3 f46177e;

    public /* synthetic */ jv1(ru1 ru1Var, lv1 lv1Var, ui3 ui3Var, vi3 vi3Var) {
        this.f46174b = ru1Var;
        this.f46175c = lv1Var;
        this.f46176d = ui3Var;
        this.f46177e = vi3Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f46173a;
        xfa xfaVar = xfa.f68157a;
        p84 p84Var = we1.f66679a;
        vi3 vi3Var = this.f46177e;
        lv1 lv1Var = this.f46175c;
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
                    rv1.m20857b(lv1Var.f50172c, lv1Var.f50170a, null, tj3Var, 0);
                    ru1 ru1Var = this.f46174b;
                    if (ru1Var.f59823l) {
                        tj3Var.m22111b0(-268675549);
                        rv1.m20859d(null, tj3Var, 0);
                        boolean zM22120g = tj3Var.m22120g(vi3Var);
                        Object objM22097O = tj3Var.m22097O();
                        if (zM22120g || objM22097O == p84Var) {
                            objM22097O = new hv1(vi3Var, 18);
                            tj3Var.m22131l0(objM22097O);
                        }
                        rv1.m20862g(0, tj3Var, (ui3) objM22097O, null);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(-268535243);
                        tj3Var.m22139q(false);
                    }
                    qu1.m20174k(db1Var, ru1Var, this.f46176d, tj3Var, iIntValue & 14);
                }
                break;
            default:
                db1 db1Var2 = (db1) obj;
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                db1Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((tj3) ye1Var2).m22120g(db1Var2) ? 4 : 2;
                }
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    tj3Var2.m22102U();
                } else {
                    List list = lv1Var.f50175f;
                    boolean zM22120g2 = tj3Var2.m22120g(vi3Var);
                    Object objM22097O2 = tj3Var2.m22097O();
                    if (zM22120g2 || objM22097O2 == p84Var) {
                        objM22097O2 = new te0(vi3Var, 13);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    int i2 = iIntValue2 & 14;
                    ru1 ru1Var2 = this.f46174b;
                    ui3 ui3Var = this.f46176d;
                    qu1.m20175l(db1Var2, ru1Var2, list, ui3Var, ui3Var, (vi3) objM22097O2, tj3Var2, i2);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ jv1(lv1 lv1Var, ru1 ru1Var, vi3 vi3Var, ui3 ui3Var) {
        this.f46175c = lv1Var;
        this.f46174b = ru1Var;
        this.f46177e = vi3Var;
        this.f46176d = ui3Var;
    }
}
