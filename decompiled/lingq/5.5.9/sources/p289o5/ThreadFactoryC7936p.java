package p289o5;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: o5.p */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC7936p implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final ThreadFactory f43234a = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f43235b = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f43234a.newThread(runnable);
        threadNewThread.setName("PlayBillingLibrary-" + this.f43235b.getAndIncrement());
        return threadNewThread;
    }
}
