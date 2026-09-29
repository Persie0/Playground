package p276nb;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p289o5.RunnableC7943w;

/* JADX INFO: renamed from: nb.b */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC7737b implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final String f42336a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f42337b = new AtomicInteger();

    /* JADX INFO: renamed from: c */
    public final ThreadFactory f42338c = Executors.defaultThreadFactory();

    public ThreadFactoryC7737b(String str) {
        this.f42336a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f42338c.newThread(new RunnableC7943w(runnable));
        threadNewThread.setName(this.f42336a + "[" + this.f42337b.getAndIncrement() + "]");
        return threadNewThread;
    }
}
