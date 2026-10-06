package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gjo extends kfv {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ nqf f25029a;

    public gjo(nqf nqfVar) {
        this.f25029a = nqfVar;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: ba */
    public final void mo5455ba(kll kllVar) {
        String strValueOf = kllVar != null ? String.valueOf(kllVar.m14499a()) : "Unknown";
        nbw nbwVarM17252c = gjp.f25030a.m17252c();
        String strConcat = "Failed to receive frame metadata. Reason: ".concat(String.valueOf(strValueOf));
        ((nbe) ((nbe) nbwVarM17252c).mo17276G((char) 2749)).mo17293r("%s", strConcat);
        this.f25029a.mo8566a(new Throwable(strConcat));
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bj */
    public final void mo6427bj(kpl kplVar) {
        kplVar.mo9515b();
        this.f25029a.mo14894e(kplVar);
    }
}
