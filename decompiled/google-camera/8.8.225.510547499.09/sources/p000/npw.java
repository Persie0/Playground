package p000;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class npw extends noa {

    /* JADX INFO: renamed from: a */
    private final Object f44038a = new Object();

    /* JADX INFO: renamed from: b */
    private int f44039b = 0;

    /* JADX INFO: renamed from: c */
    private boolean f44040c = false;

    /* JADX INFO: renamed from: d */
    private final void m17620d() {
        synchronized (this.f44038a) {
            int i = this.f44039b - 1;
            this.f44039b = i;
            if (i == 0) {
                this.f44038a.notifyAll();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        synchronized (this.f44038a) {
            while (true) {
                if (this.f44040c && this.f44039b == 0) {
                    return true;
                }
                if (nanos <= 0) {
                    return false;
                }
                long jNanoTime = System.nanoTime();
                TimeUnit.NANOSECONDS.timedWait(this.f44038a, nanos);
                nanos -= System.nanoTime() - jNanoTime;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f44038a) {
            if (this.f44040c) {
                throw new RejectedExecutionException("Executor already shutdown");
            }
            this.f44039b++;
        }
        try {
            runnable.run();
        } finally {
            m17620d();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        boolean z;
        synchronized (this.f44038a) {
            z = this.f44040c;
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        boolean z;
        synchronized (this.f44038a) {
            z = false;
            if (this.f44040c && this.f44039b == 0) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        synchronized (this.f44038a) {
            this.f44040c = true;
            if (this.f44039b == 0) {
                this.f44038a.notifyAll();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }
}
