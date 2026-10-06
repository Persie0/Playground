package p000;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ckf implements ScheduledExecutorService {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f5972a = 0;

    /* JADX INFO: renamed from: b */
    private static final nbh f5973b = nbh.m17259h("com/google/android/apps/camera/async/readiness/GatedScheduledExecutorService");

    /* JADX INFO: renamed from: c */
    private final Executor f5974c;

    /* JADX INFO: renamed from: d */
    private final ScheduledExecutorService f5975d;

    public ckf(Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f5974c = executor;
        this.f5975d = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    private static void m3835a(String str) {
        ((nbe) ((nbe) ((nbe) f5973b.m17252c()).mo17283h(new UnsupportedOperationException(str))).mo17276G((char) 205)).mo17293r("%s is not gated and it doesn't guarantee the execution order", str);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f5975d.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f5974c.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        m3835a("invokeAll(1)");
        return this.f5975d.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        m3835a("invokeAny(1)");
        return this.f5975d.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f5975d.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f5975d.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f5975d.schedule(runnable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f5975d.scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f5975d.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f5975d.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f5975d.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return submit(runnable, "");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return this.f5975d.schedule(callable, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return kxk.m14969O(new cpb(runnable, obj, 1), this.f5974c);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        m3835a("invokeAll(2)");
        return this.f5975d.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        m3835a("invokeAny(2)");
        return this.f5975d.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return kxk.m14969O(callable, this.f5974c);
    }
}
