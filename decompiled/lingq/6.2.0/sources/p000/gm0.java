package p000;

import androidx.concurrent.futures.C0464b;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class gm0 implements ListenableFuture {

    /* JADX INFO: renamed from: a */
    public final WeakReference f40989a;

    /* JADX INFO: renamed from: b */
    public final fm0 f40990b = new fm0(this);

    public gm0(C0464b c0464b) {
        this.f40989a = new WeakReference(c0464b);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    /* JADX INFO: renamed from: a */
    public final void mo52a(Runnable runnable, Executor executor) {
        this.f40990b.mo52a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C0464b c0464b = (C0464b) this.f40989a.get();
        boolean zCancel = this.f40990b.cancel(z);
        if (zCancel && c0464b != null) {
            c0464b.f5328a = null;
            c0464b.f5329b = null;
            c0464b.f5330c.m22389k(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f40990b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f40990b.f63229a instanceof C3444p1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f40990b.isDone();
    }

    public final String toString() {
        return this.f40990b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f40990b.get(j, timeUnit);
    }
}
