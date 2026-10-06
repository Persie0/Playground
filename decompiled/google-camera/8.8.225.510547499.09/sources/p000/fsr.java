package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fsr implements fqu {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ fss f23503a;

    /* JADX INFO: renamed from: b */
    private final fqu f23504b;

    /* JADX INFO: renamed from: c */
    private boolean f23505c = false;

    public fsr(fss fssVar, fqu fquVar) {
        this.f23503a = fssVar;
        this.f23504b = fquVar;
    }

    @Override // p000.fqu, p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.f23505c) {
            this.f23504b.close();
            this.f23505c = true;
            this.f23503a.m8782c();
        }
    }

    @Override // p000.fqu
    /* JADX INFO: renamed from: a */
    public final synchronized boolean mo8697a(kpw kpwVar) {
        try {
            try {
                if (this.f23505c) {
                    ((nbe) ((nbe) fss.f23506a.m17252c()).mo17276G(2492)).mo17290o("Attempting to enqueue image on closed sink!");
                    kpwVar.close();
                    return false;
                }
                boolean zMo8697a = this.f23504b.mo8697a(kpwVar);
                kpwVar.close();
                return zMo8697a;
            } catch (RuntimeException e) {
                ((nbe) ((nbe) ((nbe) fss.f23506a.m17251b()).mo17283h(e)).mo17276G(2493)).mo17290o("Could not encode out image");
            }
        } catch (Throwable th) {
            kpwVar.close();
            throw th;
        }
    }
}
