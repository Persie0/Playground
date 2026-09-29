package p000;

import com.google.android.gms.internal.play_billing.C0994e0;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zid implements vwb {

    /* JADX INFO: renamed from: a */
    public final WeakReference f71628a;

    /* JADX INFO: renamed from: b */
    public final pgd f71629b = new pgd(this);

    public zid(C0994e0 c0994e0) {
        this.f71628a = new WeakReference(c0994e0);
    }

    @Override // p000.vwb
    /* JADX INFO: renamed from: b */
    public final void mo16661b(Runnable runnable, Executor executor) {
        this.f71629b.mo16661b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C0994e0 c0994e0 = (C0994e0) this.f71628a.get();
        boolean zCancel = this.f71629b.cancel(z);
        if (!zCancel || c0994e0 == null) {
            return zCancel;
        }
        c0994e0.f12180a = null;
        c0994e0.f12181b = null;
        c0994e0.f12182c.m11217i(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f71629b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f71629b.f50688a instanceof i0c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f71629b.isDone();
    }

    public final String toString() {
        return this.f71629b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f71629b.get(j, timeUnit);
    }
}
