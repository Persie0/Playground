package p000;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes3.dex */
public final class lm0 implements nm0 {

    /* JADX INFO: renamed from: a */
    public final ScheduledFuture f49813a;

    public lm0(ScheduledFuture scheduledFuture) {
        this.f49813a = scheduledFuture;
    }

    @Override // p000.nm0
    /* JADX INFO: renamed from: b */
    public final void mo15586b(Throwable th) {
        this.f49813a.cancel(false);
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.f49813a + ']';
    }
}
