package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class isr implements mrp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f32027a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f32028b;

    public /* synthetic */ isr(ite iteVar, int i) {
        this.f32028b = i;
        this.f32027a = iteVar;
    }

    public /* synthetic */ isr(kbc kbcVar, int i) {
        this.f32028b = i;
        this.f32027a = kbcVar;
    }

    @Override // p000.mrp
    /* JADX INFO: renamed from: a */
    public final boolean mo8324a(Object obj) {
        switch (this.f32028b) {
            case 0:
                return ((Float) obj).floatValue() > ((Float) ((ite) this.f32027a).f32103h.mo3831be()).floatValue();
            case 1:
                Object obj2 = this.f32027a;
                kbc kbcVar = (kbc) obj;
                kbcVar.getClass();
                if (kan.m13873j(kbcVar).m13883m(kan.f35487b)) {
                    kbc kbcVar2 = (kbc) obj2;
                    if (kbcVar.m13908e().f35517a <= kbcVar2.f35517a && kbcVar.m13908e().f35518b <= kbcVar2.f35518b) {
                        return true;
                    }
                }
                return false;
            default:
                return ((Float) obj).floatValue() < ((Float) ((ite) this.f32027a).f32103h.mo3831be()).floatValue();
        }
    }
}
