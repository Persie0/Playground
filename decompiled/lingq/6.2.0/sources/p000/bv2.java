package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class bv2 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9046a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9047b;

    public /* synthetic */ bv2(Object obj, int i) {
        this.f9046a = i;
        this.f9047b = obj;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.f9046a;
        Object obj = this.f9047b;
        switch (i) {
            case 0:
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(new av2(runnable, 0));
                threadNewThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) obj).getAndIncrement());
                return threadNewThread;
            default:
                return ((ThreadFactory) obj).newThread(new xx8(runnable, 2));
        }
    }
}
