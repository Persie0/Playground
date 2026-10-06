package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kmx implements kpy {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ kmz f36571a;

    /* JADX INFO: renamed from: b */
    private final kpy f36572b;

    public kmx(kmz kmzVar, kpy kpyVar) {
        this.f36571a = kmzVar;
        this.f36572b = kpyVar;
    }

    @Override // p000.kpy
    /* JADX INFO: renamed from: ca */
    public final void mo8395ca() {
        synchronized (this.f36571a.f36575a) {
            kmz kmzVar = this.f36571a;
            if (kmzVar.f36576b) {
                kmzVar.m14587j();
            } else {
                this.f36572b.mo8395ca();
            }
        }
    }
}
