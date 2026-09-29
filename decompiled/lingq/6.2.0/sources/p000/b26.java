package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class b26 extends AbstractC3355n0 implements Runnable {

    /* JADX INFO: renamed from: h */
    public final Runnable f7793h;

    public b26(Runnable runnable) {
        runnable.getClass();
        this.f7793h = runnable;
    }

    @Override // com.google.common.util.concurrent.AbstractC1112b
    /* JADX INFO: renamed from: k */
    public final String mo43k() {
        return "task=[" + this.f7793h + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f7793h.run();
        } catch (Throwable th) {
            m6386n(th);
            throw th;
        }
    }
}
