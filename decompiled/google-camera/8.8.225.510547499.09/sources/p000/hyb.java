package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hyb {

    /* JADX INFO: renamed from: b */
    public Runnable f29894b;

    /* JADX INFO: renamed from: c */
    public Runnable f29895c;

    /* JADX INFO: renamed from: d */
    private final ScheduledExecutorService f29896d;

    /* JADX INFO: renamed from: a */
    public final Object f29893a = new Object();

    /* JADX INFO: renamed from: e */
    private volatile ScheduledFuture f29897e = null;

    public hyb(ScheduledExecutorService scheduledExecutorService) {
        this.f29896d = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public final void m10865a() {
        Runnable runnable;
        Runnable runnable2;
        ScheduledFuture scheduledFuture;
        synchronized (this.f29893a) {
            runnable = this.f29894b;
            runnable2 = this.f29895c;
            scheduledFuture = this.f29897e;
        }
        if (runnable == null || runnable2 == null) {
            return;
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        runnable.run();
        this.f29897e = this.f29896d.schedule(runnable2, 1500L, TimeUnit.MILLISECONDS);
    }
}
