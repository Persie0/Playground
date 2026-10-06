package p000;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jpu implements jpl, jpk, jpi {

    /* JADX INFO: renamed from: a */
    public final CountDownLatch f34569a = new CountDownLatch(1);

    @Override // p000.jpi
    /* JADX INFO: renamed from: b */
    public final void mo13447b() {
        this.f34569a.countDown();
    }

    @Override // p000.jpk
    /* JADX INFO: renamed from: c */
    public final void mo11475c(Exception exc) {
        this.f34569a.countDown();
    }

    @Override // p000.jpl
    /* JADX INFO: renamed from: d */
    public final void mo4011d(Object obj) {
        this.f34569a.countDown();
    }
}
