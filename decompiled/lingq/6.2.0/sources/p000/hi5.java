package p000;

import android.view.View;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.navigationevent.R$id;

/* JADX INFO: loaded from: classes.dex */
public abstract class hi5 {

    /* JADX INFO: renamed from: a */
    public static final zf1 f42404a = new zf1(new uf4(27));

    /* JADX INFO: renamed from: a */
    public static aj6 m13277a(ye1 ye1Var) {
        aj6 aj6Var;
        tj3 tj3Var = (tj3) ye1Var;
        aj6 aj6Var2 = (aj6) tj3Var.m22128k(f42404a);
        if (aj6Var2 != null) {
            tj3Var.m22111b0(950834231);
            tj3Var.m22139q(false);
            return aj6Var2;
        }
        tj3Var.m22111b0(950836184);
        View view = (View) tj3Var.m22128k(AbstractC0394f.f4765f);
        view.getClass();
        while (true) {
            aj6Var = null;
            if (view == null) {
                break;
            }
            Object tag = view.getTag(R$id.view_tree_navigation_event_dispatcher_owner);
            aj6 aj6Var3 = tag instanceof aj6 ? (aj6) tag : null;
            if (aj6Var3 != null) {
                aj6Var = aj6Var3;
                break;
            }
            Object objM17996b = oha.m17996b(view);
            view = objM17996b instanceof View ? (View) objM17996b : null;
        }
        tj3Var.m22139q(false);
        return aj6Var;
    }
}
