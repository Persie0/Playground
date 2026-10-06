package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class him implements nph {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f27914a;

    public him(int i) {
        this.f27914a = i;
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final void mo3811b(Object obj) {
        int i = this.f27914a;
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        switch (this.f27914a) {
            case 0:
                ((nbe) ((nbe) ((nbe) hio.f27922a.m17251b()).mo17283h(th)).mo17276G((char) 3640)).mo17290o("Failed to submit a task to the executor.");
                break;
            default:
                ((nbe) ((nbe) ((nbe) cru.f9175a.m17251b()).mo17283h(th)).mo17276G((char) 550)).mo17290o("Failed to submit a task to the executor.");
                break;
        }
    }
}
