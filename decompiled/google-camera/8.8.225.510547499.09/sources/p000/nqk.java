package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nqk extends npr {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ nqm f44064a;

    /* JADX INFO: renamed from: b */
    private final nol f44065b;

    public nqk(nqm nqmVar, nol nolVar) {
        this.f44064a = nqmVar;
        nolVar.getClass();
        this.f44065b = nolVar;
    }

    @Override // p000.npr
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17569a() {
        nps npsVarMo3988a = this.f44065b.mo3988a();
        npsVarMo3988a.getClass();
        return npsVarMo3988a;
    }

    @Override // p000.npr
    /* JADX INFO: renamed from: b */
    public final String mo17570b() {
        return this.f44065b.toString();
    }

    @Override // p000.npr
    /* JADX INFO: renamed from: d */
    public final void mo17572d(Throwable th) {
        this.f44064a.mo8566a(th);
    }

    @Override // p000.npr
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ void mo17573e(Object obj) {
        this.f44064a.mo16665f((nps) obj);
    }

    @Override // p000.npr
    /* JADX INFO: renamed from: g */
    public final boolean mo17575g() {
        return this.f44064a.isDone();
    }
}
