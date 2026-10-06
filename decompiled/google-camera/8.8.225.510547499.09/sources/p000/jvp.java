package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jvp extends ScheduledThreadPoolExecutor {
    public jvp(int i, ThreadFactory threadFactory) {
        super(i, threadFactory);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    protected final RunnableScheduledFuture decorateTask(Runnable runnable, RunnableScheduledFuture runnableScheduledFuture) {
        return jzn.m13825m(runnableScheduledFuture);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    protected final RunnableScheduledFuture decorateTask(Callable callable, RunnableScheduledFuture runnableScheduledFuture) {
        return jzn.m13825m(runnableScheduledFuture);
    }
}
