package p000;

/* JADX INFO: renamed from: bq */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0071bq implements InterfaceC0944qv {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f4131a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f4132b;

    public C0071bq(ComponentCallbacksC0077bw componentCallbacksC0077bw, int i) {
        this.f4132b = i;
        this.f4131a = componentCallbacksC0077bw;
    }

    public C0071bq(C0923qa c0923qa, int i) {
        this.f4132b = i;
        this.f4131a = c0923qa;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ce, qb] */
    @Override // p000.InterfaceC0944qv
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo2905a(Object obj) {
        switch (this.f4132b) {
            case 0:
                return this.f4131a;
            default:
                ComponentCallbacksC0077bw componentCallbacksC0077bw = (ComponentCallbacksC0077bw) this.f4131a;
                ?? r0 = componentCallbacksC0077bw.f4624z;
                return r0 instanceof InterfaceC0924qb ? r0.mo3177c() : componentCallbacksC0077bw.requireActivity().f47427h;
        }
    }
}
