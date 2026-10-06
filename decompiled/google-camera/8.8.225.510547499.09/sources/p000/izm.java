package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class izm implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    private static final AtomicInteger f32716a = new AtomicInteger();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new izn(runnable, "measurement-" + f32716a.incrementAndGet());
    }
}
