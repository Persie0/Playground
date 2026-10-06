package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hdh extends kpt {

    /* JADX INFO: renamed from: a */
    private final Runnable f27316a;

    /* JADX INFO: renamed from: b */
    private boolean f27317b;

    public hdh(kpw kpwVar, Runnable runnable) {
        super(kpwVar);
        this.f27317b = false;
        this.f27316a = runnable;
    }

    @Override // p000.kpt, p000.kba, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        synchronized (this) {
            if (this.f27317b) {
                z = false;
            } else {
                z = true;
                this.f27317b = true;
            }
        }
        if (z) {
            super.close();
            this.f27316a.run();
        }
    }
}
