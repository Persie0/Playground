package p000;

import com.google.common.util.concurrent.AbstractC1112b;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class a26 extends eh0 implements ScheduledFuture, ListenableFuture, Future {

    /* JADX INFO: renamed from: P */
    public final AbstractC1112b f112P;

    /* JADX INFO: renamed from: Q */
    public final ScheduledFuture f113Q;

    public a26(AbstractC1112b abstractC1112b, ScheduledFuture scheduledFuture) {
        this.f112P = abstractC1112b;
        this.f113Q = scheduledFuture;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m51T(boolean z) {
        return this.f112P.cancel(z);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    /* JADX INFO: renamed from: a */
    public final void mo52a(Runnable runnable, Executor executor) {
        this.f112P.mo52a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zM51T = m51T(z);
        if (zM51T) {
            this.f113Q.cancel(z);
        }
        return zM51T;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f113Q.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f112P.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f113Q.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f112P.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f112P.isDone();
    }

    @Override // p000.eh0
    /* JADX INFO: renamed from: n */
    public final Object mo53n() {
        return this.f112P;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f112P.get(j, timeUnit);
    }
}
