package ge;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import p128g2.RunnableC5682t;

/* JADX INFO: renamed from: ge.a */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC5777a implements ThreadFactory {

    /* JADX INFO: renamed from: e */
    public static final ThreadFactory f34958e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a */
    public final AtomicLong f34959a = new AtomicLong();

    /* JADX INFO: renamed from: b */
    public final String f34960b;

    /* JADX INFO: renamed from: c */
    public final int f34961c;

    /* JADX INFO: renamed from: d */
    public final StrictMode.ThreadPolicy f34962d;

    public ThreadFactoryC5777a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f34960b = str;
        this.f34961c = i10;
        this.f34962d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f34958e.newThread(new RunnableC5682t(this, 14, runnable));
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f34960b, Long.valueOf(this.f34959a.getAndIncrement())));
        return threadNewThread;
    }
}
