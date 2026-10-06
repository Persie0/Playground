package p000;

import p021j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dsc implements fxp {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ dsj f12469a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Instant f12470b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ mrm f12471c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ dsf f12472d;

    public dsc(dsf dsfVar, dsj dsjVar, Instant instant, mrm mrmVar) {
        this.f12472d = dsfVar;
        this.f12469a = dsjVar;
        this.f12470b = instant;
        this.f12471c = mrmVar;
    }

    @Override // p000.fxp
    /* JADX INFO: renamed from: a */
    public final nps mo6600a() {
        dsf dsfVar = this.f12472d;
        dsfVar.f12487e = new dse(dsfVar, this.f12469a.mo6655a(), this.f12470b);
        dsf dsfVar2 = this.f12472d;
        dsfVar2.f12488f = this.f12469a.mo6657c(dsfVar2.f12483a);
        return this.f12472d.m6647a(this.f12469a, this.f12470b, this.f12471c);
    }

    @Override // p000.fxp
    /* JADX INFO: renamed from: b */
    public final nps mo6601b() {
        return kxk.m14963I();
    }
}
