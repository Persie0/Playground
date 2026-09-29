package p000;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.AbstractC3208a;

/* JADX INFO: loaded from: classes.dex */
public final class yu2 extends xu2 implements ca2 {

    /* JADX INFO: renamed from: c */
    public final Executor f70470c;

    public yu2(Executor executor) {
        Method method;
        this.f70470c = executor;
        Method method2 = fg1.f39032a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = fg1.f39032a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // p000.ca2
    /* JADX INFO: renamed from: N */
    public final void mo4458N(long j, sm0 sm0Var) {
        Executor executor = this.f70470c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            kj3 kj3Var = new kj3(9, this, sm0Var);
            kn1 kn1Var = sm0Var.f61016e;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(kj3Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                AbstractC3208a.m15436c(kn1Var, rcd.m20580a("The task was rejected", e));
            }
        }
        if (scheduledFutureSchedule != null) {
            sm0Var.m21471x(new lm0(scheduledFutureSchedule));
        } else {
            f62.f38512l.mo4458N(j, sm0Var);
        }
    }

    @Override // p000.nn1
    /* JADX INFO: renamed from: T */
    public final void mo385T(kn1 kn1Var, Runnable runnable) {
        try {
            this.f70470c.execute(runnable);
        } catch (RejectedExecutionException e) {
            AbstractC3208a.m15436c(kn1Var, rcd.m20580a("The task was rejected", e));
            v72 v72Var = ph2.f56212a;
            t62.f61909c.mo385T(kn1Var, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f70470c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof yu2) && ((yu2) obj).f70470c == this.f70470c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f70470c);
    }

    @Override // p000.nn1
    public final String toString() {
        return this.f70470c.toString();
    }

    @Override // p000.ca2
    /* JADX INFO: renamed from: x */
    public final ci2 mo4459x(long j, Runnable runnable, kn1 kn1Var) {
        Executor executor = this.f70470c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                AbstractC3208a.m15436c(kn1Var, rcd.m20580a("The task was rejected", e));
            }
        }
        return scheduledFutureSchedule != null ? new bi2(scheduledFutureSchedule) : f62.f38512l.mo4459x(j, runnable, kn1Var);
    }
}
