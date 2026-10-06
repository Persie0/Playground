package p000;

import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;
import com.google.android.material.snackbar.VMX.rgoX;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: vj */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1067vj {

    /* JADX INFO: renamed from: a */
    public static final int[] f47847a = {19, 16, 13, 10, 0, -2, -4, -5, -6, -8};

    /* JADX INFO: renamed from: b */
    public static final ThreadFactory f47848b;

    static {
        ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        threadFactoryDefaultThreadFactory.getClass();
        f47848b = threadFactoryDefaultThreadFactory;
    }

    /* JADX INFO: renamed from: b */
    public static final ThreadFactory m19501b(final ThreadFactory threadFactory, final int i) {
        return new ThreadFactory() { // from class: vi
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                int i2;
                int i3 = i;
                ThreadFactory threadFactory2 = threadFactory;
                int i4 = 0;
                while (true) {
                    i2 = 10;
                    if (i4 >= 10) {
                        break;
                    }
                    if (i3 >= C1067vj.f47847a[i4]) {
                        i2 = i4 + 1;
                        break;
                    }
                    i4++;
                }
                Thread threadNewThread = threadFactory2.newThread(new bbt(i3, runnable, 1));
                threadNewThread.getClass();
                threadNewThread.setPriority(i2);
                return threadNewThread;
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public static final ThreadFactory m19502c(ThreadFactory threadFactory, String str) {
        threadFactory.getClass();
        return new nqg(threadFactory, str, ook.m18794h(0), 1);
    }

    /* JADX INFO: renamed from: a */
    public static final ScheduledExecutorService m19500a(ThreadFactory threadFactory, int i) {
        if (i > 0) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(i, threadFactory);
            scheduledExecutorServiceNewScheduledThreadPool.getClass();
            return scheduledExecutorServiceNewScheduledThreadPool;
        }
        throw new IllegalArgumentException(WIxTIdUIdfb.ftoZcFYwGYOgsEE + i + rgoX.WYXNUADfadA);
    }
}
