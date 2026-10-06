package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dgj implements dhd {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f10905a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f10906b;

    public dgj(dgl dglVar, int i) {
        this.f10906b = i;
        this.f10905a = dglVar;
    }

    public /* synthetic */ dgj(dgw dgwVar, int i) {
        this.f10906b = i;
        this.f10905a = dgwVar;
    }

    @Override // p000.dhd
    /* JADX INFO: renamed from: a */
    public final boolean mo6105a() {
        switch (this.f10906b) {
            case 0:
                if (((dgl) this.f10905a).f10912c.mo16813g() && ((dgl) this.f10905a).f10913d.mo16813g()) {
                    return Math.abs(Math.toDegrees((double) ((dgk) ((dgl) this.f10905a).f10912c.mo16809c()).f10907a)) >= 45.0d || Math.abs(Math.toDegrees((double) ((dgk) ((dgl) this.f10905a).f10912c.mo16809c()).f10908b)) >= 45.0d || ((dgk) ((dgl) this.f10905a).f10912c.mo16809c()).f10909c;
                }
                return false;
            case 1:
                if (((dgl) this.f10905a).f10912c.mo16813g() && ((dgl) this.f10905a).f10913d.mo16813g()) {
                    float f = ((dgk) ((dgl) this.f10905a).f10912c.mo16809c()).f10907a;
                    float f2 = ((dgk) ((dgl) this.f10905a).f10912c.mo16809c()).f10908b;
                    boolean z = ((dgk) ((dgl) this.f10905a).f10912c.mo16809c()).f10909c;
                    if (dgl.f10910a.contains(Double.valueOf(Math.toDegrees(f))) && Math.abs(Math.toDegrees(f2)) <= 10.0d && !z) {
                        return true;
                    }
                }
                return false;
            case 2:
                dgw dgwVar = (dgw) this.f10905a;
                return dgwVar.f10996e.mo16813g() && Math.abs(((dgv) dgwVar.f10996e.mo16809c()).f10988a) < dgw.f10990a && Math.abs(((dgv) dgwVar.f10996e.mo16809c()).f10989b) < dgw.f10991b;
            default:
                dgw dgwVar2 = (dgw) this.f10905a;
                if (dgwVar2.f10996e.mo16813g()) {
                    return Math.abs(((dgv) dgwVar2.f10996e.mo16809c()).f10988a) > dgwVar2.f10994c || Math.abs(((dgv) dgwVar2.f10996e.mo16809c()).f10989b) > dgwVar2.f10995d;
                }
                return false;
        }
    }
}
