package no;

import ae.C0062b;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractC7092d;
import kotlinx.coroutines.RunnableC7081b;
import kotlinx.coroutines.internal.C7154d;
import p289o5.RunnableC7934n;

/* JADX INFO: renamed from: no.n0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7853n0 extends AbstractC7092d implements InterfaceC7820c0 {

    /* JADX INFO: renamed from: c */
    public final Executor f42951c;

    public C7853n0(Executor executor) {
        Method method;
        this.f42951c = executor;
        Method method2 = C7154d.f40417a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = C7154d.f40417a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // no.InterfaceC7820c0
    /* JADX INFO: renamed from: G0 */
    public final InterfaceC7838i0 mo14318G0(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        Executor executor = this.f42951c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                C0062b.m330a0(coroutineContext, cancellationException);
            }
        }
        return scheduledFutureSchedule != null ? new C7835h0(scheduledFutureSchedule) : RunnableC7081b.f40007i.mo14318G0(j10, runnable, coroutineContext);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f42951c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7853n0) && ((C7853n0) obj).f42951c == this.f42951c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f42951c);
    }

    @Override // no.InterfaceC7820c0
    /* JADX INFO: renamed from: q */
    public final void mo14319q(long j10, C7843k c7843k) {
        Executor executor = this.f42951c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(new RunnableC7934n(this, 2, c7843k), j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                C0062b.m330a0(c7843k.f42940e, cancellationException);
            }
        }
        if (scheduledFutureSchedule != null) {
            c7843k.mo15577R(new C7831g(0, scheduledFutureSchedule));
        } else {
            RunnableC7081b.f40007i.mo14319q(j10, c7843k);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return this.f42951c.toString();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: z1 */
    public final void mo2307z1(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.f42951c.execute(runnable);
        } catch (RejectedExecutionException e10) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e10);
            C0062b.m330a0(coroutineContext, cancellationException);
            C7832g0.f42931b.mo2307z1(coroutineContext, runnable);
        }
    }
}
