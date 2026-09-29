package p000;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes3.dex */
public final class bi2 implements ci2 {

    /* JADX INFO: renamed from: a */
    public final ScheduledFuture f8557a;

    public bi2(ScheduledFuture scheduledFuture) {
        this.f8557a = scheduledFuture;
    }

    @Override // p000.ci2
    /* JADX INFO: renamed from: a */
    public final void mo125a() {
        this.f8557a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f8557a + ']';
    }
}
