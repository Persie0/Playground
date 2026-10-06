package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cxl implements cxn {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f9982a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f9983b;

    public /* synthetic */ cxl(cqg cqgVar, int i) {
        this.f9983b = i;
        this.f9982a = cqgVar;
    }

    public /* synthetic */ cxl(cxo cxoVar, int i) {
        this.f9983b = i;
        this.f9982a = cxoVar;
    }

    public /* synthetic */ cxl(fpa fpaVar, int i) {
        this.f9983b = i;
        this.f9982a = fpaVar;
    }

    public /* synthetic */ cxl(fpf fpfVar, int i) {
        this.f9983b = i;
        this.f9982a = fpfVar;
    }

    @Override // p000.cxn
    /* JADX INFO: renamed from: a */
    public final void mo5714a(cxk cxkVar, cxk cxkVar2, boolean z) {
        switch (this.f9983b) {
            case 0:
                Object obj = this.f9982a;
                if (!cxo.m5715f(cxkVar, cxkVar2)) {
                    jvh.m13554b().execute(new cxm((cxo) obj, cxkVar2, z, 0));
                }
                break;
            case 1:
                Object obj2 = this.f9982a;
                if (cxkVar.equals(cxk.LOCKED) && cxkVar2.equals(cxk.DEFAULT) && !z) {
                    ((cqg) obj2).f8832G++;
                }
                ((cqg) obj2).f8829D.add(cxkVar2);
                break;
            case 2:
                fpa fpaVar = (fpa) this.f9982a;
                if (!((csj) ((jwf) fpaVar.f23008j.m5464a().f9277g).f34942d).equals(csj.RECORDING_SESSION_ACTIVE)) {
                    if (!cxkVar2.equals(cxk.DEFAULT)) {
                        fpaVar.f23006h.mo5792d(true);
                        hzo hzoVar = ((hzp) fpaVar.f23010l.mo6051a()).f30074a;
                        if (bzq.m3253Z(hzoVar.f30073i, hzoVar.f30071g)) {
                            fpaVar.f23009k.mo11747ab();
                        }
                    } else {
                        fpaVar.f23006h.mo5796h(true);
                        fpaVar.f23009k.mo11761l(true);
                    }
                    break;
                }
                break;
            default:
                Object obj3 = this.f9982a;
                if (cxo.m5715f(cxkVar, cxkVar2)) {
                    fpf fpfVar = (fpf) obj3;
                    fpfVar.f23032d.execute(new fnx(fpfVar, 3));
                }
                break;
        }
    }
}
