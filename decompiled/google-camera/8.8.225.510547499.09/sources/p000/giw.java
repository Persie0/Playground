package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class giw extends kfv {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ key f24928a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ nqf f24929b;

    public giw(key keyVar, nqf nqfVar) {
        this.f24928a = keyVar;
        this.f24929b = nqfVar;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bo */
    public final void mo6748bo(kpp kppVar) {
        if (kppVar != null) {
            this.f24929b.mo14894e(kppVar);
        } else {
            ((nbe) ((nbe) gix.f24930a.m17252c()).mo17276G(2689)).mo17293r("Failed to get metadata for frame %s", this.f24928a);
            this.f24929b.mo8566a(new kec());
        }
    }
}
