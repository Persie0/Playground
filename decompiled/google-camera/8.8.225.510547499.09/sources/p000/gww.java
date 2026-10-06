package p000;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gww implements kqf {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ gwy f26656a;

    public gww(gwy gwyVar) {
        this.f26656a = gwyVar;
    }

    @Override // p000.kqf
    /* JADX INFO: renamed from: a */
    public final void mo5614a() {
        gwy gwyVar = this.f26656a;
        gwyVar.m9874F("Mediagroup.Listener#onAbandoned: ".concat(gwyVar.f26679o.toString()));
        gwy gwyVar2 = this.f26656a;
        gwyVar2.f26666b.mo6356d(gwyVar2.f26670f.f26876b, "onAbandoned");
        this.f26656a.f26681q.cancel(false);
    }

    @Override // p000.kqf
    /* JADX INFO: renamed from: b */
    public final void mo5615b(Throwable th) {
        gwy gwyVar = this.f26656a;
        gwyVar.m9874F("Mediagroup.Listener#onError: " + gwyVar.f26679o.toString() + ": " + th.toString());
        gwy gwyVar2 = this.f26656a;
        gwyVar2.f26666b.mo6356d(gwyVar2.f26670f.f26876b, "onError");
        this.f26656a.f26681q.mo8566a(th);
        gwy gwyVar3 = this.f26656a;
        gwyVar3.f26671g.mo6406h(gwyVar3.f26683s, gwyVar3.f26684t, th);
        this.f26656a.m9879K(ihd.f30944a);
    }

    @Override // p000.kqf
    /* JADX INFO: renamed from: c */
    public final void mo5616c() {
        gwy gwyVar = this.f26656a;
        gwyVar.f26666b.mo6356d(gwyVar.f26670f.f26876b, "onPublished");
        this.f26656a.f26673i.mo10403e(SystemClock.elapsedRealtime());
        this.f26656a.f26688x.m2559H(3, 4);
        this.f26656a.m9884P(kbb.f35512a, true);
        gwy gwyVar2 = this.f26656a;
        gwyVar2.f26671g.mo6407i(gwyVar2.f26683s, gwyVar2.f26684t);
        this.f26656a.m9878J();
        gwy gwyVar3 = this.f26656a;
        gwyVar3.f26666b.mo6361i(gwyVar3.f26670f.f26876b);
        gwy gwyVar4 = this.f26656a;
        gwyVar4.f26681q.mo14894e(gwyVar4.f26670f.f26875a);
    }

    @Override // p000.kqf
    /* JADX INFO: renamed from: d */
    public final void mo5617d() {
        dhx dhxVar = dib.f11240a;
    }
}
