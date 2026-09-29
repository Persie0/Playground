package ge;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p150h9.RunnableC5918i0;
import p213k4.RunnableC6589i;
import p274n8.RunnableC7716a;
import p286o2.RunnableC7907g;

/* JADX INFO: renamed from: ge.g */
/* JADX INFO: loaded from: classes.dex */
public final class ScheduledExecutorServiceC5783g implements ScheduledExecutorService {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f34984a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f34985b;

    public ScheduledExecutorServiceC5783g(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f34984a = executorService;
        this.f34985b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f34984a.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f34984a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f34984a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f34984a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f34984a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f34984a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f34984a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f34984a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(final Runnable runnable, final long j10, final TimeUnit timeUnit) {
        return new ScheduledFutureC5784h(new ScheduledFutureC5784h.c() { // from class: ge.c
            @Override // ge.ScheduledFutureC5784h.c
            /* JADX INFO: renamed from: a */
            public final ScheduledFuture mo12171a(ScheduledFutureC5784h.a aVar) {
                ScheduledExecutorServiceC5783g scheduledExecutorServiceC5783g = this.f34967a;
                scheduledExecutorServiceC5783g.getClass();
                return scheduledExecutorServiceC5783g.f34985b.schedule(new RunnableC5918i0(3, scheduledExecutorServiceC5783g, runnable, aVar), j10, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j10, final TimeUnit timeUnit) {
        return new ScheduledFutureC5784h(new ScheduledFutureC5784h.c() { // from class: ge.b
            @Override // ge.ScheduledFutureC5784h.c
            /* JADX INFO: renamed from: a */
            public final ScheduledFuture mo12171a(final ScheduledFutureC5784h.a aVar) {
                final ScheduledExecutorServiceC5783g scheduledExecutorServiceC5783g = this.f34963a;
                scheduledExecutorServiceC5783g.getClass();
                final Callable callable2 = callable;
                return scheduledExecutorServiceC5783g.f34985b.schedule(new Callable() { // from class: ge.f
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ScheduledExecutorServiceC5783g scheduledExecutorServiceC5783g2 = scheduledExecutorServiceC5783g;
                        scheduledExecutorServiceC5783g2.getClass();
                        return scheduledExecutorServiceC5783g2.f34984a.submit(new RunnableC7907g(callable2, 16, aVar));
                    }
                }, j10, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new ScheduledFutureC5784h(new ScheduledFutureC5784h.c() { // from class: ge.e
            @Override // ge.ScheduledFutureC5784h.c
            /* JADX INFO: renamed from: a */
            public final ScheduledFuture mo12171a(ScheduledFutureC5784h.a aVar) {
                long j12 = j10;
                long j13 = j11;
                TimeUnit timeUnit2 = timeUnit;
                ScheduledExecutorServiceC5783g scheduledExecutorServiceC5783g = this.f34976a;
                return scheduledExecutorServiceC5783g.f34985b.scheduleAtFixedRate(new RunnableC7716a(4, scheduledExecutorServiceC5783g, runnable, aVar), j12, j13, timeUnit2);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new ScheduledFutureC5784h(new ScheduledFutureC5784h.c() { // from class: ge.d
            @Override // ge.ScheduledFutureC5784h.c
            /* JADX INFO: renamed from: a */
            public final ScheduledFuture mo12171a(ScheduledFutureC5784h.a aVar) {
                long j12 = j10;
                long j13 = j11;
                TimeUnit timeUnit2 = timeUnit;
                ScheduledExecutorServiceC5783g scheduledExecutorServiceC5783g = this.f34971a;
                return scheduledExecutorServiceC5783g.f34985b.scheduleWithFixedDelay(new RunnableC6589i(5, scheduledExecutorServiceC5783g, runnable, aVar), j12, j13, timeUnit2);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.f34984a.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f34984a.submit(runnable, t10);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f34984a.submit(callable);
    }
}
