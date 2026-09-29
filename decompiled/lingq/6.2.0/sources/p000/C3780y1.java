package p000;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: y1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3780y1 extends AbstractRunnableC0004a2 {
    @Override // p000.AbstractRunnableC0004a2
    /* JADX INFO: renamed from: r */
    public final Object mo44r(Object obj, Object obj2) {
        InterfaceC3053gw interfaceC3053gw = (InterfaceC3053gw) obj;
        ListenableFuture listenableFutureApply = interfaceC3053gw.apply(obj2);
        bna.m3977u(listenableFutureApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC3053gw);
        return listenableFutureApply;
    }

    @Override // p000.AbstractRunnableC0004a2
    /* JADX INFO: renamed from: s */
    public final void mo45s(Object obj) {
        m6387o((ListenableFuture) obj);
    }
}
