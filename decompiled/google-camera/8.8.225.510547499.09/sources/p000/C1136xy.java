package p000;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: xy */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1136xy implements nps {

    /* JADX INFO: renamed from: a */
    final WeakReference f48039a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1131xt f48040b = new C1135xx(this);

    public C1136xy(C1132xu c1132xu) {
        this.f48039a = new WeakReference(c1132xu);
    }

    /* JADX INFO: renamed from: a */
    public final void m19592a(Throwable th) {
        AbstractC1131xt abstractC1131xt = this.f48040b;
        if (AbstractC1131xt.f48031b.mo19576d(abstractC1131xt, null, new C1124xm(th))) {
            AbstractC1131xt.m19582e(abstractC1131xt);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C1132xu c1132xu = (C1132xu) this.f48039a.get();
        boolean zCancel = this.f48040b.cancel(z);
        if (!zCancel || c1132xu == null) {
            return zCancel;
        }
        c1132xu.f48034a = null;
        c1132xu.f48035b = null;
        c1132xu.f48036c.mo19590f(null);
        return true;
    }

    @Override // p000.nps
    /* JADX INFO: renamed from: d */
    public final void mo2282d(Runnable runnable, Executor executor) {
        this.f48040b.mo2282d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f48040b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f48040b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f48040b.isDone();
    }

    public final String toString() {
        return this.f48040b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f48040b.get(j, timeUnit);
    }
}
