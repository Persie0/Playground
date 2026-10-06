package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cfm implements fzt {

    /* JADX INFO: renamed from: a */
    private final cem f5503a;

    /* JADX INFO: renamed from: b */
    private final nps f5504b;

    /* JADX INFO: renamed from: c */
    private final fzt f5505c;

    /* JADX INFO: renamed from: d */
    private fxn f5506d;

    public cfm(cem cemVar, nps npsVar, fzt fztVar) {
        this.f5503a = cemVar;
        this.f5504b = npsVar;
        this.f5505c = fztVar;
    }

    @Override // p000.fzt
    /* JADX INFO: renamed from: a */
    public final void mo3602a(kpw kpwVar, nps npsVar) {
        if (kpwVar.mo7245a() == 35 && (this.f5506d == null || kpwVar.mo7248d() > this.f5506d.mo7248d())) {
            kmv kmvVar = new kmv(kpwVar, 2);
            fxn fxnVar = this.f5506d;
            if (fxnVar != null) {
                fxnVar.close();
            }
            this.f5506d = new fxn(new kmw(kmvVar), npsVar);
            kpwVar = kmvVar;
        }
        this.f5505c.mo3602a(new kmw(kpwVar), npsVar);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        if (this.f5506d != null) {
            cet cetVar = (cet) jvh.m13560h(this.f5504b);
            if (cetVar != null) {
                kay kayVarM13889b = kay.m13889b(((Integer) this.f5503a.m3565c().mo3831be()).intValue());
                grl grlVarM9672b = grm.m9672b(this.f5506d);
                grlVarM9672b.f26145c = kayVarM13889b;
                cetVar.mo3580f(grlVarM9672b.m9669a());
            }
            this.f5506d.close();
        }
        this.f5505c.close();
    }
}
