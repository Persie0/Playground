package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class cct implements juw {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f5200a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f5201b;

    public cct(ccm ccmVar, int i) {
        this.f5201b = i;
        this.f5200a = ccmVar;
    }

    public cct(ccu ccuVar, int i) {
        this.f5201b = i;
        this.f5200a = ccuVar;
    }

    public cct(ccx ccxVar, int i) {
        this.f5201b = i;
        this.f5200a = ccxVar;
    }

    public cct(cdd cddVar, int i) {
        this.f5201b = i;
        this.f5200a = cddVar;
    }

    @Override // p000.juw
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nps mo3468a(Object obj, Object obj2) {
        switch (this.f5201b) {
            case 0:
                ((ccu) this.f5200a).f5205d = null;
                if (((Boolean) obj).booleanValue()) {
                    ccu ccuVar = (ccu) this.f5200a;
                    ccuVar.f5204c = ccuVar.f5202a.mo4152j();
                    ilv ilvVar = ((ccu) this.f5200a).f5204c;
                    ilvVar.getClass();
                    ilvVar.mo11450b(new ccb(this, 8));
                }
                break;
            case 1:
                ((ccm) this.f5200a).f5146e = null;
                if (((Boolean) obj).booleanValue()) {
                    ccm ccmVar = (ccm) this.f5200a;
                    ccmVar.f5144c = ccmVar.f5142a.mo4152j();
                    ilv ilvVar2 = ((ccm) this.f5200a).f5144c;
                    ilvVar2.getClass();
                    ilvVar2.mo11450b(new ccb(this, 6, (byte[]) null));
                }
                break;
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    ccx ccxVar = (ccx) this.f5200a;
                    ccxVar.f5216c = ccxVar.f5214a.mo4146d();
                    ((ccx) this.f5200a).f5216c.mo11450b(new ccb(this, 10, (char[]) null));
                }
                break;
            default:
                Boolean bool = (Boolean) obj;
                if (!((Boolean) ((cdd) this.f5200a).f5266c.mo3831be()).booleanValue() && bool.booleanValue()) {
                    cdd cddVar = (cdd) this.f5200a;
                    cddVar.f5269f = cddVar.f5264a.mo4154l();
                    ((cdd) this.f5200a).f5269f.mo11450b(new ccb(this, 12, (short[]) null));
                }
                break;
        }
        return null;
    }
}
