package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class npz extends nnu implements Runnable {

    /* JADX INFO: renamed from: a */
    private final Runnable f44043a;

    public npz(Runnable runnable) {
        runnable.getClass();
        this.f44043a = runnable;
    }

    @Override // p000.nnz
    /* JADX INFO: renamed from: bQ */
    protected final String mo14892bQ() {
        return "task=[" + this.f44043a.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f44043a.run();
        } catch (Error | RuntimeException e) {
            mo8566a(e);
            throw e;
        }
    }
}
