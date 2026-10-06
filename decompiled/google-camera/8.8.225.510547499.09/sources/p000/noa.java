package p000;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class noa extends AbstractExecutorService implements npu {
    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nps submit(Runnable runnable) {
        return (nps) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final nps submit(Callable callable) {
        return (nps) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final nps submit(Runnable runnable, Object obj) {
        return (nps) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return nqm.m17624i(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Callable callable) {
        return nqm.m17623h(callable);
    }
}
