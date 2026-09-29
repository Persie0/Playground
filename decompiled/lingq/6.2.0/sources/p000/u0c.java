package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.AbstractC0407s;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u0c {

    /* JADX INFO: renamed from: a */
    public static final C0282a f63222a = new C0282a(2069523993, false, new ud1(10));

    /* JADX INFO: renamed from: b */
    public static final C0282a f63223b = new C0282a(395934107, false, new ud1(11));

    /* JADX INFO: renamed from: c */
    public static final C0282a f63224c = new C0282a(-440860836, false, new ud1(12));

    /* JADX INFO: renamed from: a */
    public static final g77 m22380a(ye1 ye1Var) {
        g77 hi8Var;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22111b0(923020361);
        tj3Var.m22111b0(1537041123);
        Object objM22097O = tj3Var.m22097O();
        p84 p84Var = we1.f66679a;
        if (objM22097O == p84Var) {
            objM22097O = new lz5(22);
            tj3Var.m22131l0(objM22097O);
        }
        vi3 vi3Var = (vi3) objM22097O;
        tj3Var.m22139q(false);
        tj3Var.m22111b0(-1732095526);
        if (((Boolean) tj3Var.m22128k(AbstractC0407s.f4861a)).booleanValue()) {
            hi8Var = new hi8(i77.f43628a);
        } else {
            tj3Var.m22111b0(1424240517);
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            tj3Var.m22111b0(1134374053);
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                context.getClass();
                Context baseContext = context;
                while (true) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        C3386nv.m17633t("Permissions should be called in the context of an Activity");
                        return null;
                    }
                    if (baseContext instanceof Activity) {
                        objM22097O2 = new k66(context, (Activity) baseContext);
                        tj3Var.m22131l0(objM22097O2);
                        break;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                }
            }
            k66 k66Var = (k66) objM22097O2;
            tj3Var.m22139q(false);
            y0c.m24826a(k66Var, null, tj3Var, 0);
            C3065h7 c3065h7 = new C3065h7();
            tj3Var.m22111b0(1134386901);
            boolean zM22120g = tj3Var.m22120g(k66Var) | tj3Var.m22120g(vi3Var);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22120g || objM22097O3 == p84Var) {
                objM22097O3 = new h85(14, k66Var, vi3Var);
                tj3Var.m22131l0(objM22097O3);
            }
            tj3Var.m22139q(false);
            hp5 hp5VarM16109I = lda.m16109I(c3065h7, (vi3) objM22097O3, tj3Var);
            tj3Var.m22111b0(1134391322);
            boolean zM22120g2 = tj3Var.m22120g(k66Var) | tj3Var.m22124i(hp5VarM16109I);
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22120g2 || objM22097O4 == p84Var) {
                objM22097O4 = new h85(15, k66Var, hp5VarM16109I);
                tj3Var.m22131l0(objM22097O4);
            }
            tj3Var.m22139q(false);
            d32.m10043i(k66Var, hp5VarM16109I, (vi3) objM22097O4, tj3Var);
            tj3Var.m22139q(false);
            hi8Var = k66Var;
        }
        tj3Var.m22139q(false);
        tj3Var.m22139q(false);
        return hi8Var;
    }
}
