package p000;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class bj6 {

    /* JADX INFO: renamed from: a */
    public omd f8609a;

    /* JADX INFO: renamed from: b */
    public boolean f8610b;

    /* JADX INFO: renamed from: c */
    public ny8 f8611c;

    /* JADX INFO: renamed from: a */
    public abstract void mo3780a();

    /* JADX INFO: renamed from: b */
    public abstract void mo3781b();

    /* JADX INFO: renamed from: c */
    public abstract void mo3782c(zi6 zi6Var);

    /* JADX INFO: renamed from: d */
    public abstract void mo3783d(zi6 zi6Var);

    /* JADX INFO: renamed from: e */
    public final void m3784e() {
        ny8 ny8Var = this.f8611c;
        if (ny8Var == null || !((LinkedHashSet) ny8Var.f53416d).remove(this)) {
            return;
        }
        ej6 ej6Var = (ej6) ny8Var.f53415c;
        ej6Var.getClass();
        if (equals(ej6Var.f37332f)) {
            if (ej6Var.f37333g == -1) {
                mo3780a();
            }
            ej6Var.f37332f = null;
            ej6Var.f37333g = 0;
            ej6Var.f37334h = null;
        }
        ej6Var.f37330d.remove(this);
        ej6Var.f37331e.remove(this);
        this.f8611c = null;
        ej6Var.m11174b();
    }

    /* JADX INFO: renamed from: f */
    public final void m3785f(boolean z) {
        ej6 ej6Var;
        if (this.f8610b == z) {
            return;
        }
        this.f8610b = z;
        ny8 ny8Var = this.f8611c;
        if (ny8Var == null || (ej6Var = (ej6) ny8Var.f53415c) == null) {
            return;
        }
        ej6Var.m11174b();
    }
}
