package p000;

import androidx.compose.runtime.internal.C0282a;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.feature.onboarding.R$string;
import com.lingq.feature.onboarding.dictionary.C2206a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class otb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f54984a = new C0282a(-258154913, false, new sd1(11));

    /* JADX INFO: renamed from: a */
    public static final void m18512a(C2206a c2206a, vi3 vi3Var, ye1 ye1Var, int i) {
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1801200830);
        int i2 = 2;
        int i3 = (tj3Var.m22124i(c2206a) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        int i4 = 1;
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            tj3Var.m22104W();
            if ((i & 1) != 0 && !tj3Var.m22084B()) {
                tj3Var.m22102U();
            }
            tj3Var.m22140r();
            t66 t66VarM2513c = AbstractC0711a.m2513c(c2206a.f27217e, tj3Var);
            String strM23620a0 = vz1.m23620a0(tj3Var, R$string.onboarding_dictionary_languages);
            lp4 lp4Var = (lp4) t66VarM2513c.getValue();
            boolean zM22124i = tj3Var.m22124i(c2206a);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                objM22097O = new fy4(c2206a, 20);
                tj3Var.m22131l0(objM22097O);
            }
            vi3 vi3Var2 = (vi3) objM22097O;
            int i5 = i3 & 112;
            boolean z = i5 == 32;
            Object objM22097O2 = tj3Var.m22097O();
            if (z || objM22097O2 == p84Var) {
                objM22097O2 = new et6(vi3Var, i4);
                tj3Var.m22131l0(objM22097O2);
            }
            ui3 ui3Var = (ui3) objM22097O2;
            boolean z2 = i5 == 32;
            Object objM22097O3 = tj3Var.m22097O();
            if (z2 || objM22097O3 == p84Var) {
                objM22097O3 = new et6(vi3Var, i2);
                tj3Var.m22131l0(objM22097O3);
            }
            fid.m11884a(strM23620a0, lp4Var, vi3Var2, ui3Var, (ui3) objM22097O3, tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new wa5(c2206a, i, 12, vi3Var);
        }
    }
}
