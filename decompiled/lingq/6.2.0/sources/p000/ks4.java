package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ks4 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48382a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f48383b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yt4 f48384c;

    public /* synthetic */ ks4(yt4 yt4Var, int i, int i2) {
        this.f48382a = i2;
        this.f48384c = yt4Var;
        this.f48383b = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f48382a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f48383b;
        yt4 yt4Var = this.f48384c;
        switch (i) {
            case 0:
                ls4 ls4Var = (ls4) yt4Var;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    x94 x94VarM12804h = ls4Var.f50073b.f46073b.m12804h(i2);
                    ((is4) x94VarM12804h.f67974c).f44507d.mo825e(ms4.f51798a, Integer.valueOf(i2 - x94VarM12804h.f67972a), tj3Var, 6);
                }
                break;
            case 1:
                wu4 wu4Var = (wu4) yt4Var;
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    x94 x94VarM12804h2 = wu4Var.f67299b.f65914a.m12804h(i2);
                    ((uu4) x94VarM12804h2.f67974c).f64368c.mo825e(wu4Var.f67300c, Integer.valueOf(i2 - x94VarM12804h2.f67972a), tj3Var2, 0);
                }
                break;
            case 2:
                uv4 uv4Var = (uv4) yt4Var;
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else {
                    x94 x94VarM12804h3 = uv4Var.f64401b.f62945a.m12804h(i2);
                    ((sv4) x94VarM12804h3.f67974c).f61484d.mo825e(vv4.f65981a, Integer.valueOf(i2 - x94VarM12804h3.f67972a), tj3Var3, 6);
                }
                break;
            default:
                l27 l27Var = (l27) yt4Var;
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    tj3Var4.m22102U();
                } else {
                    x94 x94VarM12804h4 = l27Var.f48940b.mo997d().m12804h(i2);
                    ((i27) x94VarM12804h4.f67974c).f43385b.mo825e(o27.f53653a, Integer.valueOf(i2 - x94VarM12804h4.f67972a), tj3Var4, 0);
                }
                break;
        }
        return xfaVar;
    }
}
