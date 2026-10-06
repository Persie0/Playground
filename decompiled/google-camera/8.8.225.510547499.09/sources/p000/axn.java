package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class axn implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ boolean f2668a;

    /* JADX INFO: renamed from: b */
    private final AtomicInteger f2669b = new AtomicInteger(0);

    public axn(boolean z) {
        this.f2668a = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, (true != this.f2668a ? "androidx.work-" : "WM.task-") + this.f2669b.incrementAndGet());
    }
}
