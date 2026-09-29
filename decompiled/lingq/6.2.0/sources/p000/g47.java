package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class g47 extends d16 implements pba, ov8 {

    /* JADX INFO: renamed from: J */
    public C3485q5 f40183J;

    /* JADX INFO: renamed from: K */
    public boolean f40184K;

    @Override // p000.ov8
    /* JADX INFO: renamed from: H0 */
    public final void mo787H0(tv8 tv8Var) throws Exception {
        if (this.f40184K) {
            return;
        }
        this.f40183J.invoke(tv8Var);
    }

    @Override // p000.ov8
    /* JADX INFO: renamed from: I0 */
    public final boolean mo789I0() {
        return true;
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m12356Z0(tv8 tv8Var) throws Exception {
        this.f40184K = true;
        this.f40183J.invoke(tv8Var);
        thb.m22062u(this);
    }

    /* JADX INFO: renamed from: a1 */
    public final void m12357a1() {
        this.f40184K = false;
        thb.m22062u(this);
    }

    @Override // p000.pba
    /* JADX INFO: renamed from: r */
    public final Object mo956r() {
        return p58.f55613g;
    }
}
