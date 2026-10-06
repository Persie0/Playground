package p000;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jvk implements ScheduledExecutorService {

    /* JADX INFO: renamed from: a */
    public final jvd f34890a = jvi.f34887a;

    /* JADX INFO: renamed from: b */
    private final npv f34891b;

    public jvk(ScheduledExecutorService scheduledExecutorService) {
        this.f34891b = kxk.m14955A(scheduledExecutorService);
    }

    /* JADX INFO: renamed from: a */
    private final void m13579a(nps npsVar) {
        npsVar.mo2282d(new bso(this, npsVar, 3), not.INSTANCE);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f34891b.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m13579a(this.f34891b.submit(runnable));
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f34891b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f34891b.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        npy npyVarMo17616d = this.f34891b.schedule(runnable, j, timeUnit);
        m13579a(npyVarMo17616d);
        return npyVarMo17616d;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        npy npyVarMo17618f = this.f34891b.scheduleAtFixedRate(runnable, j, j2, timeUnit);
        m13579a(npyVarMo17618f);
        return npyVarMo17618f;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        npy npyVarMo17619g = this.f34891b.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
        m13579a(npyVarMo17619g);
        return npyVarMo17619g;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f34891b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f34891b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        nps npsVarA = this.f34891b.submit(runnable);
        m13579a(npsVarA);
        return npsVarA;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        npy npyVarMo17617e = this.f34891b.schedule(callable, j, timeUnit);
        m13579a(npyVarMo17617e);
        return npyVarMo17617e;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        nps npsVarC = this.f34891b.submit(runnable, obj);
        m13579a(npsVarC);
        return npsVarC;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        nps npsVarB = this.f34891b.submit(callable);
        m13579a(npsVarB);
        return npsVarB;
    }
}
