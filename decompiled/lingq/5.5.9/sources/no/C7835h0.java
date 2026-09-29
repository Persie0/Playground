package no;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: no.h0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7835h0 implements InterfaceC7838i0 {

    /* JADX INFO: renamed from: a */
    public final Future<?> f42932a;

    public C7835h0(ScheduledFuture scheduledFuture) {
        this.f42932a = scheduledFuture;
    }

    @Override // no.InterfaceC7838i0
    /* JADX INFO: renamed from: a */
    public final void mo14330a() {
        this.f42932a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f42932a + ']';
    }
}
