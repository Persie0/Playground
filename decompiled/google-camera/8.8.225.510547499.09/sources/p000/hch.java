package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hch extends kpt {

    /* JADX INFO: renamed from: a */
    private final Runnable f27237a;

    /* JADX INFO: renamed from: b */
    private final AtomicBoolean f27238b;

    public hch(kpw kpwVar, Runnable runnable) {
        super(kpwVar);
        this.f27238b = new AtomicBoolean(false);
        this.f27237a = runnable;
    }

    @Override // p000.kpt, p000.kba, java.lang.AutoCloseable
    public final void close() {
        if (this.f27238b.compareAndSet(false, true)) {
            super.close();
            this.f27237a.run();
        }
    }
}
