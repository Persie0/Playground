package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jvs implements Executor, kba {

    /* JADX INFO: renamed from: a */
    private final ScheduledExecutorService f34909a;

    /* JADX INFO: renamed from: b */
    private final long f34910b;

    /* JADX INFO: renamed from: c */
    private final TimeUnit f34911c;

    /* JADX INFO: renamed from: e */
    private ScheduledFuture f34913e;

    /* JADX INFO: renamed from: d */
    private final Object f34912d = new Object();

    /* JADX INFO: renamed from: f */
    private boolean f34914f = false;

    public jvs(ScheduledExecutorService scheduledExecutorService, long j, TimeUnit timeUnit) {
        this.f34909a = scheduledExecutorService;
        this.f34910b = j;
        this.f34911c = timeUnit;
    }

    /* JADX INFO: renamed from: a */
    public final void m13584a(Runnable runnable, long j, TimeUnit timeUnit) {
        synchronized (this.f34912d) {
            if (this.f34914f) {
                return;
            }
            m13585b();
            this.f34913e = this.f34909a.schedule(runnable, j, timeUnit);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m13585b() {
        synchronized (this.f34912d) {
            ScheduledFuture scheduledFuture = this.f34913e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f34912d) {
            if (this.f34914f) {
                return;
            }
            this.f34914f = true;
            this.f34909a.shutdownNow();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m13584a(runnable, this.f34910b, this.f34911c);
    }
}
