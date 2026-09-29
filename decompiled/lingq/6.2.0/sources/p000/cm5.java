package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class cm5 implements ThreadFactory {

    /* JADX INFO: renamed from: d */
    public static final AtomicInteger f10268d = new AtomicInteger(1);

    /* JADX INFO: renamed from: a */
    public final ThreadGroup f10269a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f10270b = new AtomicInteger(1);

    /* JADX INFO: renamed from: c */
    public final String f10271c;

    public cm5() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f10269a = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f10271c = "lottie-" + f10268d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f10269a, runnable, this.f10271c + this.f10270b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
