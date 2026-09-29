package p000;

import androidx.compose.runtime.internal.C0282a;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.feature.onboarding.R$string;
import com.lingq.feature.onboarding.languages.C2208a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xtb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f68776a = new C0282a(-785809196, false, new sd1(12));

    /* JADX INFO: renamed from: b */
    public static final C0282a f68777b = new C0282a(-941789738, false, new sd1(13));

    /* JADX INFO: renamed from: c */
    public static final C0282a f68778c = new C0282a(1148185307, false, new td1(21));

    /* JADX INFO: renamed from: d */
    public static final C0282a f68779d = new C0282a(1070195036, false, new td1(22));

    /* JADX INFO: renamed from: a */
    public static final void m24700a(C2208a c2208a, vi3 vi3Var, ye1 ye1Var, int i) {
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1525458827);
        int i2 = i | 2 | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                c2208a = (C2208a) pfa.m19114d(y38.m24933a(C2208a.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
            } else {
                tj3Var.m22102U();
            }
            int i3 = i2 & (-15);
            tj3Var.m22140r();
            t66 t66VarM2513c = AbstractC0711a.m2513c(c2208a.f27245e, tj3Var);
            String strM23620a0 = vz1.m23620a0(tj3Var, R$string.welcome_which_language);
            lp4 lp4Var = (lp4) t66VarM2513c.getValue();
            boolean zM22124i = tj3Var.m22124i(c2208a);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                objM22097O = new fy4(c2208a, 22);
                tj3Var.m22131l0(objM22097O);
            }
            vi3 vi3Var2 = (vi3) objM22097O;
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objM22097O2 = tj3Var.m22097O();
            if (z || objM22097O2 == p84Var) {
                objM22097O2 = new et6(vi3Var, 3);
                tj3Var.m22131l0(objM22097O2);
            }
            ui3 ui3Var = (ui3) objM22097O2;
            boolean z2 = i4 == 32;
            Object objM22097O3 = tj3Var.m22097O();
            if (z2 || objM22097O3 == p84Var) {
                objM22097O3 = new et6(vi3Var, 4);
                tj3Var.m22131l0(objM22097O3);
            }
            fid.m11884a(strM23620a0, lp4Var, vi3Var2, ui3Var, (ui3) objM22097O3, tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new wa5(c2208a, i, 14, vi3Var);
        }
    }
}
