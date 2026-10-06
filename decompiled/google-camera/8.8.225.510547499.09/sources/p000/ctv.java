package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ctv extends kfv {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ctx f9503a;

    public ctv(ctx ctxVar) {
        this.f9503a = ctxVar;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: aZ */
    public final void mo5454aZ(kgg kggVar, long j) {
        synchronized (this.f9503a.f9521c) {
            if (kggVar.equals(this.f9503a.f9529k)) {
                ((nbe) ((nbe) ctx.f9507a.m17252c()).mo17276G(613)).mo17292q("onBufferLost in viewfinderStream => frame number: %d", j);
            } else if (kggVar.equals(this.f9503a.f9530l)) {
                ((nbe) ((nbe) ctx.f9507a.m17252c()).mo17276G(612)).mo17292q("onBufferLost in recordingStream => frame number: %d", j);
            }
        }
    }
}
