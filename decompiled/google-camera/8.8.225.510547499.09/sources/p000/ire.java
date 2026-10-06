package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ire implements iui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f31858a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f31859b;

    public /* synthetic */ ire(ckt cktVar, int i) {
        this.f31859b = i;
        this.f31858a = cktVar;
    }

    public /* synthetic */ ire(irg irgVar, int i) {
        this.f31859b = i;
        this.f31858a = irgVar;
    }

    @Override // p000.iui
    /* JADX INFO: renamed from: a */
    public final void mo11632a() {
        switch (this.f31859b) {
            case 0:
                ((irg) this.f31858a).m11643p();
                break;
            default:
                ((ckt) this.f31858a).m3848e();
                break;
        }
    }
}
