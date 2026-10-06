package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class coi extends kfv {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ key f6434a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ kgg f6435b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ cok f6436c;

    public coi(cok cokVar, key keyVar, kgg kggVar) {
        this.f6436c = cokVar;
        this.f6434a = keyVar;
        this.f6435b = kggVar;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bb */
    public final void mo4006bb() {
        this.f6434a.close();
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bc */
    public final void mo4007bc() {
        try {
            cok cokVar = this.f6436c;
            key keyVar = this.f6434a;
            kgg kggVar = this.f6435b;
            synchronized (cokVar.f6445g) {
                while (cokVar.f6451m.size() >= 5) {
                    ((coj) cokVar.f6451m.removeFirst()).f6437a.close();
                }
                cokVar.f6451m.addLast(new coj(keyVar, kggVar));
            }
        } catch (RuntimeException e) {
            ((nbe) ((nbe) ((nbe) cok.f6443e.m17251b()).mo17283h(e)).mo17276G((char) 352)).mo17290o("Frame is not ready.");
            this.f6434a.close();
        }
    }
}
