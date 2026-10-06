package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hmp {

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f28346a;

    /* JADX INFO: renamed from: c */
    public final hmr f28348c;

    /* JADX INFO: renamed from: e */
    private ScheduledFuture f28350e;

    /* JADX INFO: renamed from: b */
    public volatile hmq f28347b = hmq.f28351a;

    /* JADX INFO: renamed from: d */
    private final Object f28349d = new Object();

    public hmp(hmr hmrVar, ScheduledExecutorService scheduledExecutorService) {
        this.f28348c = hmrVar;
        this.f28346a = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public final void m10463a() {
        synchronized (this.f28349d) {
            ScheduledFuture scheduledFuture = this.f28350e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                this.f28350e = null;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10464b(hmo hmoVar) {
        synchronized (this.f28349d) {
            ScheduledFuture scheduledFuture = this.f28350e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f28350e = this.f28346a.scheduleAtFixedRate(new hea(this, hmoVar, 16), 0L, 30000L, TimeUnit.MILLISECONDS);
        }
    }
}
