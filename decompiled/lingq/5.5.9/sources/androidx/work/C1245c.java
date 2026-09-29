package androidx.work;

import androidx.work.impl.utils.futures.AbstractFuture;
import androidx.work.impl.utils.futures.C1268a;
import cm.InterfaceC2052l;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import no.C7879x0;
import no.InterfaceC7875v0;
import p532zd.InterfaceFutureC10478a;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.work.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1245c<R> implements InterfaceFutureC10478a<R> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7875v0 f7826a;

    /* JADX INFO: renamed from: b */
    public final C1268a<R> f7827b;

    public C1245c(C7879x0 c7879x0) {
        C1268a<R> c1268a = new C1268a<>();
        this.f7826a = c7879x0;
        this.f7827b = c1268a;
        c7879x0.mo15620r1(new InterfaceC2052l<Throwable, C9072e>(this) { // from class: androidx.work.JobListenableFuture$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C1245c<Object> f7796b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f7796b = this;
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(Throwable th2) {
                Throwable th3 = th2;
                C1245c<Object> c1245c = this.f7796b;
                if (th3 == null) {
                    if (!c1245c.f7827b.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                } else if (th3 instanceof CancellationException) {
                    c1245c.f7827b.cancel(true);
                } else {
                    C1268a<Object> c1268a2 = c1245c.f7827b;
                    Throwable cause = th3.getCause();
                    if (cause != null) {
                        th3 = cause;
                    }
                    c1268a2.m4767j(th3);
                }
                return C9072e.f47360a;
            }
        });
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.f7827b.cancel(z10);
    }

    @Override // p532zd.InterfaceFutureC10478a
    /* JADX INFO: renamed from: f */
    public final void mo2629f(Runnable runnable, Executor executor) {
        this.f7827b.mo2629f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        return this.f7827b.get();
    }

    @Override // java.util.concurrent.Future
    public final R get(long j10, TimeUnit timeUnit) {
        return this.f7827b.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f7827b.f7924a instanceof AbstractFuture.C1262b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f7827b.isDone();
    }
}
