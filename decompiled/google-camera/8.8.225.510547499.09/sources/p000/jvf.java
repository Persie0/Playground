package p000;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jvf extends noa {

    /* JADX INFO: renamed from: a */
    private final Executor f34881a;

    /* JADX INFO: renamed from: b */
    private final Object f34882b = new Object();

    /* JADX INFO: renamed from: c */
    private int f34883c = 0;

    /* JADX INFO: renamed from: d */
    private boolean f34884d = false;

    public jvf(Executor executor) {
        this.f34881a = executor;
    }

    /* JADX INFO: renamed from: d */
    private final void m13542d() {
        synchronized (this.f34882b) {
            int i = this.f34883c - 1;
            this.f34883c = i;
            if (i == 0) {
                this.f34882b.notifyAll();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        synchronized (this.f34882b) {
            while (true) {
                if (this.f34884d && this.f34883c == 0) {
                    return true;
                }
                if (nanos <= 0) {
                    return false;
                }
                long jNanoTime = System.nanoTime();
                TimeUnit.NANOSECONDS.timedWait(this.f34882b, nanos);
                nanos -= System.nanoTime() - jNanoTime;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f34882b) {
            if (this.f34884d) {
                throw new RejectedExecutionException("Executor already shutdown");
            }
            this.f34883c++;
        }
        try {
            this.f34881a.execute(runnable);
        } finally {
            m13542d();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        boolean z;
        synchronized (this.f34882b) {
            z = this.f34884d;
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        boolean z;
        synchronized (this.f34882b) {
            z = false;
            if (this.f34884d && this.f34883c == 0) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        synchronized (this.f34882b) {
            this.f34884d = true;
            if (this.f34883c == 0) {
                this.f34882b.notifyAll();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }
}
