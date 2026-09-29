package p000;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class sx1 implements ThreadFactory {

    /* JADX INFO: renamed from: e */
    public static final ThreadFactory f61536e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a */
    public final AtomicLong f61537a = new AtomicLong();

    /* JADX INFO: renamed from: b */
    public final String f61538b;

    /* JADX INFO: renamed from: c */
    public final int f61539c;

    /* JADX INFO: renamed from: d */
    public final StrictMode.ThreadPolicy f61540d;

    public sx1(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.f61538b = str;
        this.f61539c = i;
        this.f61540d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f61536e.newThread(new RunnableC3470pr(12, this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f61538b + " Thread #" + this.f61537a.getAndIncrement());
        return threadNewThread;
    }
}
