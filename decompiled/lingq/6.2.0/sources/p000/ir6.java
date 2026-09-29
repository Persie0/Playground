package p000;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes.dex */
public final class ir6 implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hr6 f44460a;

    public ir6(hr6 hr6Var) {
        this.f44460a = hr6Var;
    }

    public final void onBackCancelled() {
        hr6 hr6Var = this.f44460a;
        ny8 ny8Var = hr6Var.f35721a;
        if (ny8Var == null) {
            C3386nv.m17633t("This input is not added to any dispatcher.");
            return;
        }
        if (!hr6Var.f35722b) {
            ny8Var.m17699p(hr6Var, null);
        }
        ej6 ej6Var = (ej6) ny8Var.f53415c;
        ej6Var.getClass();
        if (hr6Var.equals(ej6Var.f37334h) && -1 == ej6Var.f37333g) {
            bj6 bj6VarM11175c = ej6Var.f37332f;
            if (bj6VarM11175c == null) {
                bj6VarM11175c = ej6Var.m11175c(-1);
            }
            ej6Var.f37332f = null;
            ej6Var.f37333g = 0;
            ej6Var.f37334h = null;
            if (bj6VarM11175c != null) {
                bj6VarM11175c.mo3780a();
            }
            C3244l c3244l = ej6Var.f37327a;
            fj6 fj6Var = fj6.f39197m;
            c3244l.getClass();
            c3244l.m15572j(null, fj6Var);
        }
        hr6Var.f35722b = false;
    }

    public final void onBackInvoked() {
        this.f44460a.m10414a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        zi6 zi6VarM13441a = hrb.m13441a(backEvent);
        hr6 hr6Var = this.f44460a;
        ny8 ny8Var = hr6Var.f35721a;
        if (ny8Var == null) {
            C3386nv.m17633t("This input is not added to any dispatcher.");
            return;
        }
        if (hr6Var.f35722b) {
            ej6 ej6Var = (ej6) ny8Var.f53415c;
            ej6Var.getClass();
            if (hr6Var.equals(ej6Var.f37334h) && -1 == ej6Var.f37333g) {
                bj6 bj6VarM11175c = ej6Var.f37332f;
                if (bj6VarM11175c == null) {
                    bj6VarM11175c = ej6Var.m11175c(-1);
                }
                if (bj6VarM11175c != null) {
                    bj6VarM11175c.mo3782c(zi6VarM13441a);
                }
                C3244l c3244l = ej6Var.f37327a;
                gj6 gj6Var = new gj6(zi6VarM13441a);
                c3244l.getClass();
                c3244l.m15572j(null, gj6Var);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        zi6 zi6VarM13441a = hrb.m13441a(backEvent);
        hr6 hr6Var = this.f44460a;
        ny8 ny8Var = hr6Var.f35721a;
        if (ny8Var == null) {
            C3386nv.m17633t("This input is not added to any dispatcher.");
        } else {
            if (hr6Var.f35722b) {
                return;
            }
            ny8Var.m17699p(hr6Var, zi6VarM13441a);
            hr6Var.f35722b = true;
        }
    }
}
