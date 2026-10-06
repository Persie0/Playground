package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fog implements kfb {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ nqf f22929a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ foh f22930b;

    public fog(foh fohVar, nqf nqfVar) {
        this.f22930b = fohVar;
        this.f22929a = nqfVar;
    }

    @Override // p000.kfb
    /* JADX INFO: renamed from: c */
    public final void mo3625c(kiq kiqVar) {
        if (this.f22930b.f22934d.compareAndSet(false, true)) {
            this.f22929a.mo14894e(foh.f22931a);
            kfc kfcVar = this.f22930b.f22938h;
            kfcVar.getClass();
            kfcVar.mo9412l(this);
        }
    }
}
