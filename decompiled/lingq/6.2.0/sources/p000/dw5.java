package p000;

import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class dw5 {

    /* JADX INFO: renamed from: f */
    public static final C3723wi f36316f = C3723wi.m23970d();

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f36317a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentLinkedQueue f36318b;

    /* JADX INFO: renamed from: c */
    public final Runtime f36319c;

    /* JADX INFO: renamed from: d */
    public ScheduledFuture f36320d;

    /* JADX INFO: renamed from: e */
    public long f36321e;

    public dw5() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runtime runtime = Runtime.getRuntime();
        this.f36320d = null;
        this.f36321e = -1L;
        this.f36317a = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f36318b = new ConcurrentLinkedQueue();
        this.f36319c = runtime;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10693b(long j) {
        return j <= 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m10694a(Timer timer) {
        synchronized (this) {
            try {
                this.f36317a.schedule(new cw5(this, timer, 1), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                f36316f.m23975f("Unable to collect Memory Metric: " + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m10695c(long j, Timer timer) {
        this.f36321e = j;
        try {
            this.f36320d = this.f36317a.scheduleAtFixedRate(new cw5(this, timer, 0), 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            f36316f.m23975f("Unable to start collecting Memory Metrics: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m10696d(long j, Timer timer) {
        if (m10693b(j)) {
            return;
        }
        if (this.f36320d == null) {
            m10695c(j, timer);
        } else if (this.f36321e != j) {
            m10697e();
            m10695c(j, timer);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10697e() {
        ScheduledFuture scheduledFuture = this.f36320d;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f36320d = null;
        this.f36321e = -1L;
    }

    /* JADX INFO: renamed from: f */
    public final C0021aj m10698f(Timer timer) {
        if (timer == null) {
            return null;
        }
        long jM6742a = timer.m6742a() + timer.f13787a;
        C3834zi c3834ziM453u = C0021aj.m453u();
        c3834ziM453u.m22767h();
        C0021aj.m451s((C0021aj) c3834ziM453u.f64019b, jM6742a);
        StorageUnit storageUnit = StorageUnit.BYTES;
        Runtime runtime = this.f36319c;
        int iM15043e = kaa.m15043e(storageUnit.toKilobytes(runtime.totalMemory() - runtime.freeMemory()));
        c3834ziM453u.m22767h();
        C0021aj.m452t((C0021aj) c3834ziM453u.f64019b, iM15043e);
        return (C0021aj) c3834ziM453u.m22766g();
    }
}
