package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class bi1 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f8555a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f8556b;

    public bi1(boolean z) {
        this.f8556b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        runnable.getClass();
        StringBuilder sbM22997t = ux5.m22997t(this.f8556b ? "WM.task-" : "androidx.work-");
        sbM22997t.append(this.f8555a.incrementAndGet());
        return new Thread(runnable, sbM22997t.toString());
    }
}
