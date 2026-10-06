package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nnr implements Runnable {

    /* JADX INFO: renamed from: a */
    final nnz f43956a;

    /* JADX INFO: renamed from: b */
    final nps f43957b;

    public nnr(nnz nnzVar, nps npsVar) {
        this.f43956a = nnzVar;
        this.f43957b = npsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nnz nnzVar = this.f43956a;
        nnk nnkVar = nnz.f43968e;
        if (nnzVar.value != this) {
            return;
        }
        if (nnz.f43968e.mo17530f(this.f43956a, this, nnz.m17539k(this.f43957b))) {
            nnz.m17540m(this.f43956a, false);
        }
    }
}
