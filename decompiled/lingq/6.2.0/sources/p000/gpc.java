package p000;

import android.content.Context;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.feature.library.p013ui.components.ReportScope;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gpc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f41168a = new C0282a(1355816641, false, new de1(29));

    /* JADX INFO: renamed from: b */
    public static final C0282a f41169b = new C0282a(-2000690504, false, new fe1(0));

    /* JADX INFO: renamed from: a */
    public static final void m12795a(boolean z, String str, ui3 ui3Var, zi3 zi3Var, ye1 ye1Var, int i) {
        int i2;
        zi3 zi3Var2;
        tj3 tj3Var;
        ui3Var.getClass();
        zi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(142469540);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22122h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22120g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22124i(ui3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            zi3Var2 = zi3Var;
            i2 |= tj3Var2.m22124i(zi3Var2) ? 2048 : 1024;
        } else {
            zi3Var2 = zi3Var;
        }
        int i3 = i2;
        if (!tj3Var2.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        } else if (z) {
            tj3Var2.m22111b0(882654028);
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(null);
                tj3Var2.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            Object objM22097O2 = tj3Var2.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j("");
                tj3Var2.m22131l0(objM22097O2);
            }
            t66 t66Var2 = (t66) objM22097O2;
            Object objM22097O3 = tj3Var2.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = AbstractC3550rv.m20852t0(ReportScope.values());
                tj3Var2.m22131l0(objM22097O3);
            }
            List list = (List) objM22097O3;
            q2d.m19625a(ui3Var, ci8.m4703P(1220637495, new py3(zi3Var2, (Context) tj3Var2.m22128k(AbstractC0394f.f4761b), ui3Var, (((ReportScope) t66Var.getValue()) == null || vk9.m23391n0((String) t66Var2.getValue())) ? false : true, t66Var, t66Var2), tj3Var2), null, ci8.m4703P(297470069, new he7(18, ui3Var), tj3Var2), null, cjc.f10186c, ci8.m4703P(1060202578, new C2919d9(str, list, t66Var, t66Var2), tj3Var2), null, 0L, 0L, 0L, 0L, null, tj3Var2, ((i3 >> 6) & 14) | 1772592, 16276);
            tj3Var = tj3Var2;
            tj3Var.m22139q(false);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22111b0(886300062);
            tj3Var.m22139q(false);
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3294ld(z, str, ui3Var, zi3Var, i, 5);
        }
    }
}
