package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class npl extends nnu implements Runnable {

    /* JADX INFO: renamed from: a */
    private nps f44029a;

    public npl(nps npsVar) {
        this.f44029a = npsVar;
    }

    @Override // p000.nnz
    /* JADX INFO: renamed from: bQ */
    protected final String mo14892bQ() {
        nps npsVar = this.f44029a;
        if (npsVar == null) {
            return null;
        }
        return "delegate=[" + npsVar.toString() + "]";
    }

    @Override // p000.nnz
    /* JADX INFO: renamed from: c */
    protected final void mo14893c() {
        this.f44029a = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nps npsVar = this.f44029a;
        if (npsVar != null) {
            mo16665f(npsVar);
        }
    }
}
