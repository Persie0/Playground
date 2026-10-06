package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: ql */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ThreadFactoryC0934ql implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    private final AtomicInteger f47494a = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.f47494a.getAndIncrement());
        return thread;
    }
}
