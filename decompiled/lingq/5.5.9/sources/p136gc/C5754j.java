package p136gc;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: gc.j */
/* JADX INFO: loaded from: classes.dex */
public final class C5754j<T> implements InterfaceC5749e, InterfaceC5748d, InterfaceC5746b {

    /* JADX INFO: renamed from: a */
    public final CountDownLatch f34815a = new CountDownLatch(1);

    @Override // p136gc.InterfaceC5749e
    /* JADX INFO: renamed from: a */
    public final void mo12098a(T t10) {
        this.f34815a.countDown();
    }

    @Override // p136gc.InterfaceC5748d
    /* JADX INFO: renamed from: b */
    public final void mo12097b(Exception exc) {
        this.f34815a.countDown();
    }

    @Override // p136gc.InterfaceC5746b
    /* JADX INFO: renamed from: d */
    public final void mo12096d() {
        this.f34815a.countDown();
    }
}
