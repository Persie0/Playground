package p000;

/* JADX INFO: loaded from: classes.dex */
public final class is6 extends d16 implements mt5 {

    /* JADX INFO: renamed from: J */
    public vi3 f44510J;

    /* JADX INFO: renamed from: K */
    public long f44511K;

    @Override // p000.d16
    /* JADX INFO: renamed from: O0 */
    public final boolean mo574O0() {
        return true;
    }

    @Override // p000.mt5
    /* JADX INFO: renamed from: c */
    public final void mo858c(long j) {
        if (n84.m17279a(this.f44511K, j)) {
            return;
        }
        this.f44510J.invoke(new n84(j));
        this.f44511K = j;
    }
}
