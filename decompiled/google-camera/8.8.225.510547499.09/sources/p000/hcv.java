package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hcv implements hcp {

    /* JADX INFO: renamed from: a */
    final gof f27277a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ oju f27278b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ kfk f27279c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ gva f27280d;

    public hcv(oju ojuVar, kfk kfkVar, gva gvaVar, byte[] bArr) {
        this.f27278b = ojuVar;
        this.f27279c = kfkVar;
        this.f27280d = gvaVar;
        this.f27277a = (gof) ojuVar.get();
    }

    @Override // p000.hcp
    /* JADX INFO: renamed from: a */
    public final void mo10116a(hdu hduVar) {
        try {
            key keyVarMo9305c = this.f27277a.mo9305c();
            if (keyVarMo9305c == null) {
                ((nbe) ((nbe) hcw.f27281a.m17252c()).mo17276G((char) 3477)).mo17290o("Fetching high resolution image failed, frame is null. Submitting a new request.");
                keyVarMo9305c = this.f27279c.mo14130q(this.f27277a.mo9316n());
                try {
                    kfv.m14171t(keyVarMo9305c);
                } catch (InterruptedException e) {
                    throw new hdm(2, e);
                }
            }
            kpp kppVarMo7042c = keyVarMo9305c.mo7042c();
            if (kppVarMo7042c == null) {
                throw new hdm(3, null);
            }
            gmc gmcVarM9784a = this.f27280d.m9784a(keyVarMo9305c);
            kpw kpwVarM9496e = gmcVarM9784a.m9496e();
            if (kpwVarM9496e == null) {
                throw new hdm(4, null);
            }
            kmg kmgVarMo14193c = gmcVarM9784a.m9492a().mo14193c();
            hdw hdwVar = hduVar.f27392a;
            mrm mrmVar = hduVar.f27393b;
            heq heqVar = hduVar.f27394c;
            hdwVar.f27398b.mo4207b(kpwVarM9496e, ((gjj) mrmVar.mo16809c()).m9333a(kmgVarMo14193c, kppVarMo7042c, 0), new jfz(kbc.m13903h(kpwVarM9496e.mo7247c() / 2, kpwVarM9496e.mo7246b() / 2), 0, 1, 3L), new hdv(kpwVarM9496e, heqVar));
        } catch (InterruptedException e2) {
            throw new hdm(1, e2);
        }
    }
}
