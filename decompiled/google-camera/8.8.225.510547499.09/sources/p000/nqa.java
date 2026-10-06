package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nqa extends npx implements npv {

    /* JADX INFO: renamed from: a */
    final ScheduledExecutorService f44046a;

    public nqa(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.f44046a = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final npy schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        nqm nqmVarM17624i = nqm.m17624i(runnable, null);
        return new npy(nqmVarM17624i, this.f44046a.schedule(nqmVarM17624i, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final npy schedule(Callable callable, long j, TimeUnit timeUnit) {
        nqm nqmVarM17623h = nqm.m17623h(callable);
        return new npy(nqmVarM17623h, this.f44046a.schedule(nqmVarM17623h, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final npy scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        npz npzVar = new npz(runnable);
        return new npy(npzVar, this.f44046a.scheduleAtFixedRate(npzVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final npy scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        npz npzVar = new npz(runnable);
        return new npy(npzVar, this.f44046a.scheduleWithFixedDelay(npzVar, j, j2, timeUnit));
    }
}
