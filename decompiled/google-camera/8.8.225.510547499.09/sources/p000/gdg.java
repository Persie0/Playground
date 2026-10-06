package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gdg implements kba {

    /* JADX INFO: renamed from: a */
    public final mrn f24290a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ gdh f24291b;

    /* JADX INFO: renamed from: c */
    private boolean f24292c;

    public gdg(gdh gdhVar, mrn mrnVar) {
        this.f24291b = gdhVar;
        this.f24290a = mrnVar;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f24291b.f24294b) {
            if (this.f24292c) {
                return;
            }
            boolean z = true;
            this.f24292c = true;
            gdh gdhVar = this.f24291b;
            int i = gdhVar.f24301i;
            if (i > 0) {
                gdhVar.f24301i = i - 1;
            } else {
                ((nbe) ((nbe) gdh.f24293a.m17252c()).mo17276G(2557)).mo17290o("Metering lock was invalid.");
            }
            gdh gdhVar2 = this.f24291b;
            if (gdhVar2.f24301i != 0 || !gdhVar2.f24302j) {
                z = false;
            }
            if (z) {
                this.f24291b.m9075b();
            }
        }
    }
}
