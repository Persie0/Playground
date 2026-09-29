package no;

import cm.InterfaceC2052l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sl.C9072e;

/* JADX INFO: renamed from: no.t0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7871t0 extends AbstractC7877w0 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f42970f = AtomicIntegerFieldUpdater.newUpdater(C7871t0.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2052l<Throwable, C9072e> f42971e;

    /* JADX WARN: Multi-variable type inference failed */
    public C7871t0(InterfaceC2052l<? super Throwable, C9072e> interfaceC2052l) {
        this.f42971e = interfaceC2052l;
    }

    @Override // no.AbstractC7874v
    /* JADX INFO: renamed from: K */
    public final void mo14509K(Throwable th2) {
        if (f42970f.compareAndSet(this, 0, 1)) {
            this.f42971e.mo528n(th2);
        }
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ C9072e mo528n(Throwable th2) {
        mo14509K(th2);
        return C9072e.f47360a;
    }
}
