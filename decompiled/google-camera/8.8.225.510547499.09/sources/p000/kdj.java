package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kdj implements kdk {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f35646a;

    /* JADX INFO: renamed from: b */
    private final Object f35647b;

    public kdj(kcl kclVar, int i) {
        this.f35646a = i;
        this.f35647b = kclVar;
    }

    public kdj(kpj kpjVar, int i) {
        this.f35646a = i;
        this.f35647b = kpjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kpj] */
    @Override // p000.kdk
    /* JADX INFO: renamed from: a */
    public final void mo13996a(kct kctVar) {
        switch (this.f35646a) {
            case 0:
                kctVar.mo13974d(this.f35647b);
                break;
            default:
                kctVar.mo13973c((kcl) this.f35647b);
                break;
        }
    }
}
