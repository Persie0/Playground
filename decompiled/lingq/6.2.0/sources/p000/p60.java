package p000;

/* JADX INFO: loaded from: classes.dex */
public final class p60 extends d16 {

    /* JADX INFO: renamed from: J */
    public xz9 f55628J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ q60 f55629K;

    public p60(q60 q60Var) {
        this.f55629K = q60Var;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: R0 */
    public final void mo36R0() {
        q60 q60Var = this.f55629K;
        q60Var.f57304b = this;
        if (q60Var.f57305c != null) {
            this.f55628J = omd.m18140b0(this, 0L, new C3704w(2, this, q60Var));
        }
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: S0 */
    public final void mo37S0() {
        q60 q60Var = this.f55629K;
        if (q60Var.f57304b == this) {
            q60Var.f57304b = null;
        }
        xz9 xz9Var = this.f55628J;
        if (xz9Var != null) {
            xz9Var.m24800b();
        }
        this.f55628J = null;
    }
}
