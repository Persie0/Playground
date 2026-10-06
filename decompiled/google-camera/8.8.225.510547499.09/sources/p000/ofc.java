package p000;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ofc implements off {

    /* JADX INFO: renamed from: a */
    private final Runnable f45828a;

    /* JADX INFO: renamed from: b */
    private final Runnable f45829b;

    /* JADX INFO: renamed from: c */
    private final Handler f45830c;

    public ofc(Runnable runnable, Runnable runnable2, Handler handler) {
        this.f45828a = runnable;
        this.f45829b = runnable2;
        this.f45830c = handler;
    }

    @Override // p000.off
    /* JADX INFO: renamed from: a */
    public final void mo18458a() {
        this.f45830c.removeCallbacks(this.f45828a);
        Runnable runnable = this.f45829b;
        if (runnable != null) {
            this.f45830c.removeCallbacks(runnable);
        }
    }

    @Override // p000.off
    /* JADX INFO: renamed from: b */
    public final void mo18459b() {
        Runnable runnable = this.f45829b;
        if (runnable != null) {
            this.f45830c.post(runnable);
        }
    }

    @Override // p000.off
    /* JADX INFO: renamed from: c */
    public final void mo18460c() {
        this.f45830c.post(this.f45828a);
    }
}
