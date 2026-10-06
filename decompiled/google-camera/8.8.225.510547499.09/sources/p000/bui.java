package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bui implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final boolean f4484a;

    /* JADX INFO: renamed from: b */
    private final ThreadFactory f4485b;

    /* JADX INFO: renamed from: c */
    private final String f4486c;

    /* JADX INFO: renamed from: d */
    private final AtomicInteger f4487d = new AtomicInteger();

    public bui(ThreadFactory threadFactory, String str, boolean z) {
        this.f4485b = threadFactory;
        this.f4486c = str;
        this.f4484a = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f4485b.newThread(new bey(this, runnable, 15));
        threadNewThread.setName("glide-" + this.f4486c + "-thread-" + this.f4487d.getAndIncrement());
        return threadNewThread;
    }
}
