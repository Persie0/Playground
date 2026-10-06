package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fxq implements nph {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ nqf f23805a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ gdu f23806b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ fxs f23807c;

    public fxq(fxs fxsVar, nqf nqfVar, gdu gduVar) {
        this.f23807c = fxsVar;
        this.f23805a = nqfVar;
        this.f23806b = gduVar;
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        this.f23805a.mo8566a(th);
        this.f23806b.close();
        this.f23807c.m8940b();
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final void mo3811b(Object obj) {
        this.f23805a.mo14894e(obj);
        this.f23806b.close();
        this.f23807c.m8940b();
    }
}
