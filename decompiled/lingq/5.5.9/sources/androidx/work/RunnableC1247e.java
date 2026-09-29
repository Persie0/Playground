package androidx.work;

/* JADX INFO: renamed from: androidx.work.e */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1247e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Worker f7834a;

    public RunnableC1247e(Worker worker) {
        this.f7834a = worker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Worker worker = this.f7834a;
        try {
            worker.f7798e.m4766i(worker.mo4699g());
        } catch (Throwable th2) {
            worker.f7798e.m4767j(th2);
        }
    }
}
