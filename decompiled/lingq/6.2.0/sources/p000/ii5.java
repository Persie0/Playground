package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.R$id;
import androidx.compose.p002ui.platform.AbstractC0394f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ii5 {

    /* JADX INFO: renamed from: a */
    public static final zf1 f44145a = new zf1(new b25(27));

    /* JADX INFO: renamed from: a */
    public static rr6 m13938a(ye1 ye1Var) {
        tj3 tj3Var = (tj3) ye1Var;
        rr6 rr6Var = (rr6) tj3Var.m22128k(f44145a);
        Object obj = null;
        if (rr6Var == null) {
            tj3Var.m22111b0(1208426157);
            View view = (View) tj3Var.m22128k(AbstractC0394f.f4765f);
            view.getClass();
            while (true) {
                if (view == null) {
                    rr6Var = null;
                    break;
                }
                Object tag = view.getTag(R$id.view_tree_on_back_pressed_dispatcher_owner);
                rr6 rr6Var2 = tag instanceof rr6 ? (rr6) tag : null;
                if (rr6Var2 != null) {
                    rr6Var = rr6Var2;
                    break;
                }
                Object objM17996b = oha.m17996b(view);
                view = objM17996b instanceof View ? (View) objM17996b : null;
            }
        } else {
            tj3Var.m22111b0(1208423708);
        }
        tj3Var.m22139q(false);
        if (rr6Var != null) {
            tj3Var.m22111b0(1208423789);
            tj3Var.m22139q(false);
            return rr6Var;
        }
        tj3Var.m22111b0(1208428160);
        for (Context baseContext = (Context) tj3Var.m22128k(AbstractC0394f.f4761b); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof rr6) {
                obj = baseContext;
                break;
            }
        }
        rr6 rr6Var3 = (rr6) obj;
        tj3Var.m22139q(false);
        return rr6Var3;
    }
}
