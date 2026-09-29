package p457wd;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: wd.l */
/* JADX INFO: loaded from: classes.dex */
public final class C9911l implements InterfaceC9901b, InterfaceC9900a {

    /* JADX INFO: renamed from: a */
    public final CountDownLatch f50548a = new CountDownLatch(1);

    @Override // p457wd.InterfaceC9901b
    /* JADX INFO: renamed from: a */
    public final void mo11402a(Object obj) {
        this.f50548a.countDown();
    }

    @Override // p457wd.InterfaceC9900a
    /* JADX INFO: renamed from: b */
    public final void mo16774b(Exception exc) {
        this.f50548a.countDown();
    }
}
