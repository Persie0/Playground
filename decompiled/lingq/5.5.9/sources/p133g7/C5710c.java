package p133g7;

import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p216k7.RunnableC6628c;

/* JADX INFO: renamed from: g7.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5710c extends ThreadPoolExecutor {
    public C5710c(int i10, ThreadFactoryC5713f threadFactoryC5713f) {
        super(i10, i10, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), threadFactoryC5713f);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        C5711d c5711d = new C5711d((RunnableC6628c) runnable);
        execute(c5711d);
        return c5711d;
    }
}
