package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class o64 extends d16 implements pba {

    /* JADX INFO: renamed from: J */
    public e5b f53891J;

    /* JADX INFO: renamed from: K */
    public e5b f53892K;

    public o64() {
        d63 d63Var = bna.f8739l;
        this.f53891J = d63Var;
        this.f53892K = d63Var;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: R0 */
    public void mo36R0() {
        qba.m19852d(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new n64(this, 1));
        mo4502a1();
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: S0 */
    public void mo37S0() {
        this.f53892K = this.f53891J;
        qba.m19854f(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new n64(this, 0));
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: T0 */
    public final void mo763T0() {
        this.f53891J = bna.f8739l;
    }

    /* JADX INFO: renamed from: Z0 */
    public abstract e5b mo4501Z0(e5b e5bVar);

    /* JADX INFO: renamed from: a1 */
    public void mo4502a1() {
        this.f53892K = mo4501Z0(this.f53891J);
        qba.m19854f(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new n64(this, 0));
    }

    @Override // p000.pba
    /* JADX INFO: renamed from: r */
    public final Object mo956r() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }
}
