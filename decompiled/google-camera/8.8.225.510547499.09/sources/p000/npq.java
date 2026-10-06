package p000;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class npq extends AbstractOwnableSynchronizer implements Runnable {

    /* JADX INFO: renamed from: a */
    private final npr f44034a;

    public npq(npr nprVar) {
        this.f44034a = nprVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m17612a(Thread thread) {
        super.setExclusiveOwnerThread(thread);
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.f44034a.toString();
    }
}
