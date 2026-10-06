package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class evk extends igg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ evo f20403a;

    public evk(evo evoVar) {
        this.f20403a = evoVar;
    }

    @Override // p000.igg, p000.igf
    public final void onShutterButtonClick() {
        evo evoVar = this.f20403a;
        if (evoVar.f20431p.f20387g) {
            evoVar.m7929w();
            return;
        }
        if (evoVar.m7930x()) {
            return;
        }
        int i = ((gzp) evoVar.f20420e.mo3831be()).f26960g;
        if (i <= 0) {
            evoVar.mo3783r();
            return;
        }
        evf evfVar = evoVar.f20431p;
        evfVar.f20383c.f29755n = evoVar;
        jvd.m13538a();
        evfVar.f20383c.m10791d(i);
    }
}
