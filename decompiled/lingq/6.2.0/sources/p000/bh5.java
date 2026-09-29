package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class bh5 {

    /* JADX INFO: renamed from: a */
    public final op6 f8538a;

    /* JADX INFO: renamed from: b */
    public boolean f8539b;

    /* JADX INFO: renamed from: c */
    public int f8540c = -1;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ w56 f8541d;

    public bh5(w56 w56Var, op6 op6Var) {
        this.f8541d = w56Var;
        this.f8538a = op6Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m3717a(boolean z) {
        if (z == this.f8539b) {
            return;
        }
        this.f8539b = z;
        int i = z ? 1 : -1;
        w56 w56Var = this.f8541d;
        int i2 = w56Var.f66419c;
        w56Var.f66419c = i + i2;
        if (!w56Var.f66420d) {
            w56Var.f66420d = true;
            while (true) {
                try {
                    int i3 = w56Var.f66419c;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        w56Var.mo13908e();
                    } else if (z3) {
                        w56Var.mo13909f();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    w56Var.f66420d = false;
                    throw th;
                }
            }
            w56Var.f66420d = false;
        }
        if (this.f8539b) {
            w56Var.m23762c(this);
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo400d() {
    }

    /* JADX INFO: renamed from: f */
    public boolean mo401f(ub5 ub5Var) {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public abstract boolean mo402g();
}
