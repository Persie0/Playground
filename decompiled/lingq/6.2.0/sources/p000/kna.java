package p000;

import android.content.Context;
import androidx.compose.p002ui.platform.AbstractC0394f;

/* JADX INFO: loaded from: classes.dex */
public abstract class kna {

    /* JADX INFO: renamed from: a */
    public static final long f47563a = dk1.m10430h(0, 0, 0, 0);

    /* JADX INFO: renamed from: b */
    public static final q18 f47564b = new q18(w89.f66530c);

    /* JADX INFO: renamed from: a */
    public static final e04 m15339a(Object obj, ye1 ye1Var) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22113c0(1087186730);
        if (obj instanceof e04) {
            e04 e04Var = (e04) obj;
            tj3Var.m22139q(false);
            return e04Var;
        }
        Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
        tj3Var.m22113c0(-1245195153);
        boolean zM22120g = tj3Var.m22120g(context) | tj3Var.m22120g(obj);
        Object objM22097O = tj3Var.m22097O();
        if (zM22120g || objM22097O == we1.f66679a) {
            d04 d04Var = new d04(context);
            d04Var.f34778c = obj;
            objM22097O = d04Var.m9960a();
            tj3Var.m22131l0(objM22097O);
        }
        e04 e04Var2 = (e04) objM22097O;
        tj3Var.m22139q(false);
        tj3Var.m22139q(false);
        return e04Var2;
    }
}
