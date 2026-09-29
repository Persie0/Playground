package p000;

/* JADX INFO: loaded from: classes.dex */
public final class y60 {

    /* JADX INFO: renamed from: a */
    public final ny8 f69351a;

    /* JADX INFO: renamed from: b */
    public final pr6 f69352b;

    public y60(ny8 ny8Var, pr6 pr6Var) {
        this.f69351a = ny8Var;
        this.f69352b = pr6Var;
        if ((ny8Var == null ? pr6Var : ny8Var) != null) {
            return;
        }
        C3386nv.m17626m("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final void m24951a(x60 x60Var) {
        ny8 ny8Var = this.f69351a;
        if (ny8Var != null) {
            ny8.m17674f(ny8Var, (v60) x60Var.f67809b);
            return;
        }
        pr6 pr6Var = this.f69352b;
        if (pr6Var == null) {
            C3386nv.m17633t("Unreachable");
            return;
        }
        w60 w60Var = (w60) x60Var.f67808a;
        w60Var.getClass();
        jr6 jr6Var = new jr6(w60Var, new lr6(null, w60Var));
        w60Var.f48364a.add(jr6Var);
        ny8.m17674f(pr6Var.m19463b().f53170c, jr6Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m24952b(x60 x60Var) {
        if (this.f69351a != null) {
            ((v60) x60Var.f67809b).m3784e();
        } else if (this.f69352b != null) {
            ((w60) x60Var.f67808a).m15658e();
        } else {
            C3386nv.m17633t("Unreachable");
        }
    }
}
