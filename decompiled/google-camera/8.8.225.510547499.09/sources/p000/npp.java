package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class npp implements nps {

    /* JADX INFO: renamed from: a */
    public static final nps f44031a = new npp(null);

    /* JADX INFO: renamed from: c */
    private static final Logger f44032c = Logger.getLogger(npp.class.getName());

    /* JADX INFO: renamed from: b */
    public final Object f44033b;

    public npp(Object obj) {
        this.f44033b = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // p000.nps
    /* JADX INFO: renamed from: d */
    public final void mo2282d(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f44032c.logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + executor.toString(), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f44033b;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f44033b;
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
        return super.toString() + "[status=SUCCESS, result=[" + String.valueOf(this.f44033b) + "]]";
    }
}
