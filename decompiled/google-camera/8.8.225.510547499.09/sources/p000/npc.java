package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class npc extends npm {

    /* JADX INFO: renamed from: a */
    private final nps f44019a;

    public npc(nps npsVar) {
        npsVar.getClass();
        this.f44019a = npsVar;
    }

    @Override // p000.nnz, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f44019a.cancel(z);
    }

    @Override // p000.nnz, p000.nps
    /* JADX INFO: renamed from: d */
    public final void mo2282d(Runnable runnable, Executor executor) {
        this.f44019a.mo2282d(runnable, executor);
    }

    @Override // p000.nnz, java.util.concurrent.Future
    public final Object get() {
        return this.f44019a.get();
    }

    @Override // p000.nnz, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f44019a.isCancelled();
    }

    @Override // p000.nnz, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f44019a.isDone();
    }

    @Override // p000.nnz
    public final String toString() {
        return this.f44019a.toString();
    }

    @Override // p000.nnz, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f44019a.get(j, timeUnit);
    }
}
