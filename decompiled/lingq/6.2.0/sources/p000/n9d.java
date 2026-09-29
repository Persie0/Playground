package p000;

import androidx.compose.foundation.AbstractC0080f;
import com.google.firebase.sessions.C1168d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n9d {

    /* JADX INFO: renamed from: a */
    public static C1168d f52529a;

    /* JADX INFO: renamed from: a */
    public static final void m17299a(int i, int i2, ye1 ye1Var, ui3 ui3Var, e16 e16Var) {
        int i3;
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-48435273);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22124i(ui3Var) ? 32 : 16;
        }
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                e16Var = b16.f7762a;
            }
            e16 e16VarM4412e = c99.m4412e(e16Var, 1.0f);
            boolean z = (i3 & 112) == 32;
            Object objM22097O = tj3Var.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new zy7(15, ui3Var);
                tj3Var.m22131l0(objM22097O);
            }
            bq1.m4039O(AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16VarM4412e, 15), ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64858d, null, te1.m22000n(62, 0.0f), null, uqc.f64235a, tj3Var, 196608, 20);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new en5(e16Var, ui3Var, i, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m17300b() {
        try {
            if (f52529a == null) {
                C1168d c1168d = (C1168d) ((by1) ((p53) q43.m19641c().m19645b(p53.class))).f9170o.get();
                c1168d.getClass();
                f52529a = c1168d;
            }
            C1168d c1168d2 = f52529a;
            if (c1168d2 == null) {
                fa4.m11636J("sharedSessionRepository");
                throw null;
            }
            if (c1168d2.f13866i) {
                if (c1168d2 != null) {
                    c1168d2.m6757b();
                } else {
                    fa4.m11636J("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }
}
