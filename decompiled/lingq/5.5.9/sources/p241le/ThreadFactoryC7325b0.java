package p241le;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: le.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC7325b0 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f41030a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicLong f41031b;

    /* JADX INFO: renamed from: le.b0$a */
    public class a extends AbstractRunnableC7326c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f41032a;

        public a(Runnable runnable) {
            this.f41032a = runnable;
        }

        @Override // p241le.AbstractRunnableC7326c
        /* JADX INFO: renamed from: a */
        public final void mo14742a() {
            this.f41032a.run();
        }
    }

    public ThreadFactoryC7325b0(String str, AtomicLong atomicLong) {
        this.f41030a = str;
        this.f41031b = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(new a(runnable));
        threadNewThread.setName(this.f41030a + this.f41031b.getAndIncrement());
        return threadNewThread;
    }
}
