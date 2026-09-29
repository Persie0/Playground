package p000;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public final class pg1 implements js6, yr6, sr6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56083a;

    /* JADX INFO: renamed from: b */
    public final CountDownLatch f56084b;

    public pg1(int i) {
        this.f56083a = i;
        switch (i) {
            case 1:
                this.f56084b = new CountDownLatch(1);
                break;
            default:
                this.f56084b = new CountDownLatch(1);
                break;
        }
    }

    @Override // p000.sr6
    /* JADX INFO: renamed from: b */
    public final void mo319b() {
        switch (this.f56083a) {
            case 0:
                this.f56084b.countDown();
                break;
            default:
                this.f56084b.countDown();
                break;
        }
    }

    @Override // p000.js6
    /* JADX INFO: renamed from: g */
    public final void mo320g(Object obj) {
        switch (this.f56083a) {
            case 0:
                this.f56084b.countDown();
                break;
            default:
                this.f56084b.countDown();
                break;
        }
    }

    @Override // p000.yr6
    /* JADX INFO: renamed from: m */
    public final void mo321m(Exception exc) {
        switch (this.f56083a) {
            case 0:
                this.f56084b.countDown();
                break;
            default:
                this.f56084b.countDown();
                break;
        }
    }
}
