package p000;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class y04 implements ListenableFuture {

    /* JADX INFO: renamed from: b */
    public static final y04 f69048b = new y04(null);

    /* JADX INFO: renamed from: c */
    public static final nv4 f69049c = new nv4(y04.class);

    /* JADX INFO: renamed from: a */
    public final Object f69050a;

    public y04(Object obj) {
        this.f69050a = obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    /* JADX INFO: renamed from: a */
    public final void mo52a(Runnable runnable, Executor executor) {
        bna.m3979v(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f69049c.m17640a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f69050a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f69050a + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f69050a;
    }
}
