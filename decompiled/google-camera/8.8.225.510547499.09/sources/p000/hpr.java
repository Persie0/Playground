package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hpr implements hmo {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f28990a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f28991b;

    public /* synthetic */ hpr(cpw cpwVar, int i) {
        this.f28991b = i;
        this.f28990a = cpwVar;
    }

    public /* synthetic */ hpr(hpu hpuVar, int i) {
        this.f28991b = i;
        this.f28990a = hpuVar;
    }

    @Override // p000.hmo
    /* JADX INFO: renamed from: a */
    public final void mo10462a(hmq hmqVar) {
        switch (this.f28991b) {
            case 0:
                ((hpu) this.f28990a).m10592a(hmqVar, false);
                return;
            default:
                Object obj = this.f28990a;
                boolean zM10467c = hmqVar.m10467c();
                cpw cpwVar = (cpw) obj;
                synchronized (cpwVar.f8689e) {
                    if (!zM10467c) {
                        ((nbe) ((nbe) cpw.f8674a.m17252c()).mo17276G(448)).mo17292q("Stopping recording due to low storage. Remaining bytes=%d", hmqVar.f28352b);
                        ((cpw) obj).m5268j(((cpw) obj).f8709y != cpv.RECORDING);
                    }
                    break;
                }
                if (zM10467c) {
                    ((hmn) cpwVar.f8700p.get()).m10461e(hmqVar);
                    ((ljf) cpwVar.f8701q.get()).m15530f(hmqVar);
                    return;
                }
                return;
        }
    }
}
