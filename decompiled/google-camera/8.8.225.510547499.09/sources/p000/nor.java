package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class nor extends npr {

    /* JADX INFO: renamed from: a */
    private final Executor f43990a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ nos f43991b;

    public nor(nos nosVar, Executor executor) {
        this.f43991b = nosVar;
        executor.getClass();
        this.f43990a = executor;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo17571c(Object obj);

    @Override // p000.npr
    /* JADX INFO: renamed from: d */
    public final void mo17572d(Throwable th) {
        this.f43991b.f43992c = null;
        if (th instanceof ExecutionException) {
            this.f43991b.mo8566a(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.f43991b.cancel(false);
        } else {
            this.f43991b.mo8566a(th);
        }
    }

    @Override // p000.npr
    /* JADX INFO: renamed from: e */
    public final void mo17573e(Object obj) {
        this.f43991b.f43992c = null;
        mo17571c(obj);
    }

    /* JADX INFO: renamed from: f */
    final void m17574f() {
        try {
            this.f43990a.execute(this);
        } catch (RejectedExecutionException e) {
            this.f43991b.mo8566a(e);
        }
    }

    @Override // p000.npr
    /* JADX INFO: renamed from: g */
    public final boolean mo17575g() {
        return this.f43991b.isDone();
    }
}
