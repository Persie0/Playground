package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class o76 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final String f53934a;

    /* JADX INFO: renamed from: b */
    public final ThreadFactory f53935b = Executors.defaultThreadFactory();

    public o76(String str) {
        this.f53934a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f53935b.newThread(new qk8(runnable, 2));
        threadNewThread.setName(this.f53934a);
        return threadNewThread;
    }
}
