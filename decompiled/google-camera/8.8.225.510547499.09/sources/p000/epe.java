package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class epe implements eqt {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ eqt f14958a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int f14959b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ epf f14960c;

    public epe(epf epfVar, eqt eqtVar, int i) {
        this.f14960c = epfVar;
        this.f14958a = eqtVar;
        this.f14959b = i;
    }

    @Override // p000.eqt
    /* JADX INFO: renamed from: b */
    public final void mo7612b(ntv ntvVar) {
        this.f14958a.mo7612b(ntvVar);
    }

    @Override // p000.eqt
    /* JADX INFO: renamed from: d */
    public final void mo7613d(boolean z) {
        this.f14958a.mo7613d(false);
        synchronized (this.f14960c) {
            this.f14960c.f14965e.remove(Integer.valueOf(this.f14959b));
        }
    }
}
