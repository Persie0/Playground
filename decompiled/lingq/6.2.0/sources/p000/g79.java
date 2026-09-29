package p000;

import com.lingq.core.settings.theme.AbstractC1881a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g79 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40357a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f40358b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f40359c;

    public /* synthetic */ g79(int i, vi3 vi3Var, boolean z) {
        this.f40358b = z;
        this.f40359c = vi3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f40357a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f40359c;
        boolean z = this.f40358b;
        ye1 ye1Var = (ye1) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    p04 p04VarM3600c = z ? bbd.m3600c() : hka.m13318a();
                    String str = z ? "Hide password" : "Show password";
                    boolean zM22120g = tj3Var.m22120g(vi3Var) | tj3Var.m22122h(z);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22120g || objM22097O == we1.f66679a) {
                        objM22097O = new vq7(1, vi3Var, z);
                        tj3Var.m22131l0(objM22097O);
                    }
                    omd.m18141c((ui3) objM22097O, null, false, null, null, ci8.m4703P(967436191, new mw6(p04VarM3600c, str, 1), tj3Var), tj3Var, 1572864, 62);
                }
                break;
            default:
                num.getClass();
                AbstractC1881a.m8664c(z, vi3Var, ye1Var, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ g79(vi3 vi3Var, boolean z) {
        this.f40358b = z;
        this.f40359c = vi3Var;
    }
}
