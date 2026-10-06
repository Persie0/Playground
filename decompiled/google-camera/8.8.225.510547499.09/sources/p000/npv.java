package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface npv extends ScheduledExecutorService, npu {
    /* JADX INFO: renamed from: d */
    npy mo17616d(Runnable runnable, long j, TimeUnit timeUnit);

    /* JADX INFO: renamed from: e */
    npy mo17617e(Callable callable, long j, TimeUnit timeUnit);

    /* JADX INFO: renamed from: f */
    npy mo17618f(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    /* JADX INFO: renamed from: g */
    npy mo17619g(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
