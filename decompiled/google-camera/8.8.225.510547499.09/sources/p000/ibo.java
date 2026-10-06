package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ibo implements ijg {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f30212a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f30213b;

    public /* synthetic */ ibo(ciq ciqVar, int i) {
        this.f30213b = i;
        this.f30212a = ciqVar;
    }

    public /* synthetic */ ibo(ibq ibqVar, int i) {
        this.f30213b = i;
        this.f30212a = ibqVar;
    }

    @Override // p000.ijg
    /* JADX INFO: renamed from: a */
    public final void mo10999a(ikw ikwVar) {
        switch (this.f30213b) {
            case 0:
                ((ibq) this.f30212a).f30218c.mo3702p(ikwVar);
                break;
            default:
                ((ciq) this.f30212a).m3808q(ikwVar);
                break;
        }
    }
}
