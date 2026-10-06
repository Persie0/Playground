package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nqc implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Runnable f44048a;

    public nqc(Runnable runnable) {
        this.f44048a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f44048a.run();
    }

    public final String toString() {
        return this.f44048a.toString();
    }
}
