package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class fmc extends nnz {

    /* JADX INFO: renamed from: a */
    private final Runnable f22540a;

    public fmc(Runnable runnable) {
        this.f22540a = runnable;
    }

    @Override // p000.nnz
    /* JADX INFO: renamed from: a */
    public final boolean mo8566a(Throwable th) {
        return super.mo8566a(th);
    }

    /* JADX INFO: renamed from: b */
    public final void m8567b(fmd fmdVar) {
        super.mo14894e(fmdVar);
    }

    @Override // p000.nnz, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Runnable runnable = this.f22540a;
        if (runnable != null) {
            runnable.run();
        }
        return super.cancel(z);
    }
}
