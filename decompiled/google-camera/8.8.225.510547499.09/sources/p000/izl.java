package p000;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class izl extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ izo f32715a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izl(izo izoVar) {
        super(1, 1, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
        this.f32715a = izoVar;
        setThreadFactory(new izm());
        allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new izk(this, runnable, obj);
    }
}
