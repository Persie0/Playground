package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fxu implements fzt {

    /* JADX INFO: renamed from: a */
    private final kmd f23822a;

    /* JADX INFO: renamed from: b */
    private final cem f23823b;

    /* JADX INFO: renamed from: c */
    private final fzt f23824c;

    /* JADX INFO: renamed from: d */
    private final gvw f23825d;

    /* JADX INFO: renamed from: e */
    private final ehw f23826e;

    public fxu(kmd kmdVar, cem cemVar, fzt fztVar, gvw gvwVar, ehw ehwVar) {
        this.f23822a = kmdVar;
        this.f23823b = cemVar;
        this.f23824c = fztVar;
        this.f23826e = ehwVar;
        this.f23825d = gvwVar;
    }

    @Override // p000.fzt
    /* JADX INFO: renamed from: a */
    public final void mo3602a(kpw kpwVar, nps npsVar) {
        if (kpwVar.mo7245a() != 35) {
            kpwVar.close();
            return;
        }
        if (this.f23825d.mo9812h(this.f23822a.mo14558k())) {
            this.f23825d.mo9808d(kpwVar, this.f23823b.m3566d());
        }
        ehw ehwVar = this.f23826e;
        lku.m15670x(kpwVar.mo7245a() == 35, "Expected image format YUV but found: " + kpwVar.mo7245a());
        ehwVar.f14108c.execute(new dgq(ehwVar, kpwVar, 19));
        this.f23824c.mo3602a(kpwVar, npsVar);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f23824c.close();
    }
}
