package p000;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class orr extends orq implements oqy {

    /* JADX INFO: renamed from: c */
    private final Executor f46466c;

    public orr(Executor executor) {
        Method method;
        this.f46466c = executor;
        Method method2 = oxa.f46757a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor == null || (method = oxa.f46757a) == null) {
                return;
            }
            method.invoke(scheduledThreadPoolExecutor, true);
        } catch (Throwable th) {
        }
    }

    /* JADX INFO: renamed from: g */
    private static final void m18971g(oly olyVar, RejectedExecutionException rejectedExecutionException) {
        ooc.m18754t(olyVar, oqv.m18932m("The task was rejected", rejectedExecutionException));
    }

    /* JADX INFO: renamed from: h */
    private static final ScheduledFuture m18972h(ScheduledExecutorService scheduledExecutorService, Runnable runnable, oly olyVar, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            m18971g(olyVar, e);
            return null;
        }
    }

    @Override // p000.oqy
    /* JADX INFO: renamed from: a */
    public final void mo18944a(opx opxVar) {
        Executor executor = this.f46466c;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture scheduledFutureM18972h = scheduledExecutorService != null ? m18972h(scheduledExecutorService, new bek(this, opxVar, 6), ((opy) opxVar).f46407b, 1000L) : null;
        if (scheduledFutureM18972h != null) {
            opxVar.mo18870a(new opu(scheduledFutureM18972h));
        } else {
            oqw.f46435c.mo18944a(opxVar);
        }
    }

    @Override // p000.orq
    /* JADX INFO: renamed from: c */
    public final Executor mo18970c() {
        return this.f46466c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f46466c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // p000.oqo
    /* JADX INFO: renamed from: d */
    public final void mo18915d(oly olyVar, Runnable runnable) {
        olyVar.getClass();
        try {
            this.f46466c.execute(runnable);
        } catch (RejectedExecutionException e) {
            m18971g(olyVar, e);
            ord.f46447b.mo18915d(olyVar, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof orr) && ((orr) obj).f46466c == this.f46466c;
    }

    @Override // p000.oqy
    /* JADX INFO: renamed from: f */
    public final orf mo18940f(long j, Runnable runnable, oly olyVar) {
        olyVar.getClass();
        Executor executor = this.f46466c;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture scheduledFutureM18972h = scheduledExecutorService != null ? m18972h(scheduledExecutorService, runnable, olyVar, j) : null;
        return scheduledFutureM18972h != null ? new ore(scheduledFutureM18972h) : oqw.f46435c.mo18940f(j, runnable, olyVar);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f46466c);
    }

    @Override // p000.oqo
    public final String toString() {
        return this.f46466c.toString();
    }
}
