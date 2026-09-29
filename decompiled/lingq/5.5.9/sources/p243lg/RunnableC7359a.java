package p243lg;

/* JADX INFO: renamed from: lg.a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7359a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Runnable f41118a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C7360b f41119b;

    public RunnableC7359a(C7360b c7360b, Runnable runnable) {
        this.f41119b = c7360b;
        this.f41118a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f41118a.run();
        } catch (Throwable th2) {
            this.f41119b.m14768e(Thread.currentThread(), th2);
        }
    }
}
