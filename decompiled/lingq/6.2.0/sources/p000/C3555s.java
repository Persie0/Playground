package p000;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: s */
/* JADX INFO: loaded from: classes.dex */
public final class C3555s extends AbstractRunnableC3630u {
    @Override // p000.AbstractRunnableC3630u
    /* JADX INFO: renamed from: r */
    public final Object mo20987r(Object obj, Throwable th) {
        InterfaceC3053gw interfaceC3053gw = (InterfaceC3053gw) obj;
        ListenableFuture listenableFutureApply = interfaceC3053gw.apply(th);
        bna.m3977u(listenableFutureApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC3053gw);
        return listenableFutureApply;
    }

    @Override // p000.AbstractRunnableC3630u
    /* JADX INFO: renamed from: s */
    public final void mo20988s(Object obj) {
        m6387o((ListenableFuture) obj);
    }
}
