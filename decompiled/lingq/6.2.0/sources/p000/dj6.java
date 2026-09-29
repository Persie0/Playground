package p000;

import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes.dex */
public abstract class dj6 {

    /* JADX INFO: renamed from: a */
    public ny8 f35721a;

    /* JADX INFO: renamed from: b */
    public boolean f35722b;

    /* JADX INFO: renamed from: a */
    public final void m10414a() {
        ny8 ny8Var = this.f35721a;
        if (ny8Var == null) {
            C3386nv.m17633t("This input is not added to any dispatcher.");
            return;
        }
        if (!this.f35722b) {
            ny8Var.m17699p(this, null);
        }
        ej6 ej6Var = (ej6) ny8Var.f53415c;
        C3487q7 c3487q7 = (C3487q7) ny8Var.f53414b;
        ej6Var.getClass();
        if (equals(ej6Var.f37334h) && -1 == ej6Var.f37333g) {
            bj6 bj6VarM11175c = ej6Var.f37332f;
            if (bj6VarM11175c == null) {
                bj6VarM11175c = ej6Var.m11175c(-1);
            }
            ej6Var.f37332f = null;
            ej6Var.f37333g = 0;
            ej6Var.f37334h = null;
            if (bj6VarM11175c == null) {
                ((pr6) c3487q7.f57333b).f56726a.run();
            } else {
                bj6VarM11175c.mo3781b();
            }
            C3244l c3244l = ej6Var.f37327a;
            fj6 fj6Var = fj6.f39197m;
            c3244l.getClass();
            c3244l.m15572j(null, fj6Var);
        }
        this.f35722b = false;
    }

    /* JADX INFO: renamed from: b */
    public void mo10415b(boolean z) {
    }
}
