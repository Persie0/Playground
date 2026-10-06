package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hpe extends kfv {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ key f28763a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hpg f28764b;

    public hpe(hpg hpgVar, key keyVar) {
        this.f28764b = hpgVar;
        this.f28763a = keyVar;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bi */
    public final void mo5510bi() {
        this.f28763a.close();
        hpg hpgVar = this.f28764b;
        kfb kfbVar = hpgVar.f28794aa;
        if (kfbVar != null) {
            kfc kfcVar = hpgVar.f28781N;
            if (kfcVar != null) {
                kfcVar.mo9412l(kfbVar);
            }
            hpg hpgVar2 = this.f28764b;
            hpgVar2.f28794aa = null;
            hpgVar2.f28819l.execute(new hmm(this, 20));
        }
    }
}
