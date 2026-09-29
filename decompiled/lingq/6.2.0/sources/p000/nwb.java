package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class nwb implements vwb {

    /* JADX INFO: renamed from: b */
    public static final rwb f53342b = new rwb(nwb.class);

    /* JADX INFO: renamed from: a */
    public final Object f53343a;

    public nwb(Object obj) {
        this.f53343a = obj;
    }

    @Override // p000.vwb
    /* JADX INFO: renamed from: b */
    public final void mo16661b(Runnable runnable, Executor executor) {
        if (executor == null) {
            C3386nv.m17635v("Executor was null.");
            return;
        }
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f53342b.m20965a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", wq1.m24119o("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f53343a;
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
        return super.toString() + "[status=SUCCESS, result=[" + this.f53343a.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f53343a;
    }
}
