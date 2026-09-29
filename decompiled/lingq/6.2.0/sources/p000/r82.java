package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class r82 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58871a;

    /* JADX INFO: renamed from: b */
    public final Object f58872b;

    public r82() {
        this.f58871a = 0;
        this.f58872b = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.f58871a;
        Object obj = this.f58872b;
        switch (i) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) obj).getAndIncrement());
                return thread;
            default:
                Thread threadNewThread = ((ThreadFactory) obj).newThread(runnable);
                threadNewThread.setName("ScionFrontendApi");
                return threadNewThread;
        }
    }

    public r82(v3c v3cVar) {
        this.f58871a = 1;
        this.f58872b = Executors.defaultThreadFactory();
    }
}
