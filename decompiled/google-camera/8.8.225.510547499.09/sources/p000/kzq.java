package p000;

import android.util.Log;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kzq extends AbstractExecutorService implements kzf {

    /* JADX INFO: renamed from: b */
    private final Thread f37782b;

    /* JADX INFO: renamed from: d */
    private final kzr f37784d;

    /* JADX INFO: renamed from: c */
    private final AtomicBoolean f37783c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public final lav f37781a = lav.m15121j();

    private kzq(String str, kzr kzrVar) {
        this.f37784d = kzrVar;
        this.f37782b = new Thread(new kds(this, kzrVar, 19), str);
    }

    /* JADX INFO: renamed from: b */
    public static kzq m15095b(String str, kzr kzrVar) {
        return new kzq(str, kzrVar);
    }

    /* JADX INFO: renamed from: a */
    public final void m15096a() {
        this.f37782b.start();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        try {
            this.f37782b.join(TimeUnit.MILLISECONDS.convert(j, timeUnit));
            return isTerminated();
        } catch (InterruptedException e) {
            Log.w("EventLoopThread", "Interrupted while waiting for thread to stop.");
            return false;
        }
    }

    @Override // p000.kzf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f37781a.mo15109h(kzj.f37771a);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f37784d.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f37783c.get();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return !this.f37782b.isAlive();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f37783c.set(true);
        this.f37784d.m15097a();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        this.f37783c.set(true);
        kzr kzrVar = this.f37784d;
        kzrVar.f37785a.clear();
        kzrVar.m15097a();
        return (List) lqi.m15868m(this.f37781a);
    }

    public final String toString() {
        return "EventLoopThread[" + this.f37782b.getName() + "]";
    }
}
