package p026b5;

import android.support.v4.media.session.C0166e;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: b5.a */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC1308a implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f8043a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f8044b;

    public ThreadFactoryC1308a(boolean z10) {
        this.f8044b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder sbM771r = C0166e.m771r(this.f8044b ? "WM.task-" : "androidx.work-");
        sbM771r.append(this.f8043a.incrementAndGet());
        return new Thread(runnable, sbM771r.toString());
    }
}
