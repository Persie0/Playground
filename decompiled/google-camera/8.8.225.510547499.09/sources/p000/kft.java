package p000;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class kft extends kfv {

    /* JADX INFO: renamed from: a */
    private final CountDownLatch f35854a = new CountDownLatch(1);

    /* JADX INFO: renamed from: p */
    public final void m14162p() {
        this.f35854a.await();
    }

    /* JADX INFO: renamed from: q */
    protected final void m14163q() {
        this.f35854a.countDown();
    }
}
