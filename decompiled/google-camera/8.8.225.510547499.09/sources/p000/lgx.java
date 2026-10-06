package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lgx implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final int f38242a;

    /* JADX INFO: renamed from: b */
    private final AtomicInteger f38243b = new AtomicInteger(1);

    /* JADX INFO: renamed from: c */
    private final String f38244c = "Primes";

    public lgx(int i) {
        this.f38242a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(new lll(this, runnable, 1), this.f38244c + "-" + this.f38243b.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
