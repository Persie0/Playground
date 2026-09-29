package p276nb;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p289o5.RunnableC7943w;

/* JADX INFO: renamed from: nb.a */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC7736a implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final String f42334a;

    /* JADX INFO: renamed from: b */
    public final ThreadFactory f42335b = Executors.defaultThreadFactory();

    public ThreadFactoryC7736a(String str) {
        this.f42334a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f42335b.newThread(new RunnableC7943w(runnable));
        threadNewThread.setName(this.f42334a);
        return threadNewThread;
    }
}
