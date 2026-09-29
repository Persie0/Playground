package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class vpb implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final ThreadFactory f65772a = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f65773b = new AtomicInteger(1);

    public vpb(kc0 kc0Var) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f65772a.newThread(runnable);
        threadNewThread.setName("PlayBillingLibrary-" + this.f65773b.getAndIncrement());
        return threadNewThread;
    }
}
