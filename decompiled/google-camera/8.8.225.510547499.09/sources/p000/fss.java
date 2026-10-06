package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fss implements fsd {

    /* JADX INFO: renamed from: a */
    public static final nbh f23506a = nbh.m17259h("com/google/android/apps/camera/moments/SafeMomentsTrackEncoder");

    /* JADX INFO: renamed from: b */
    private final fsd f23507b;

    /* JADX INFO: renamed from: c */
    private int f23508c = 1;

    public fss(fsd fsdVar) {
        this.f23507b = fsdVar;
    }

    @Override // p000.fsd
    /* JADX INFO: renamed from: a */
    public final synchronized fqu mo8765a(kyt kytVar, kay kayVar) {
        try {
            int i = this.f23508c;
            if (i > 0) {
                this.f23508c = i + 1;
                return new fsr(this, this.f23507b.mo8765a(kytVar, kayVar));
            }
            ((nbe) ((nbe) f23506a.m17252c()).mo17276G(2494)).mo17290o("Attempting to launch already-closed MomentsTrackEncoder!");
            kytVar.close();
            return new fsq(0);
        } catch (RuntimeException e) {
            ((nbe) ((nbe) ((nbe) f23506a.m17251b()).mo17283h(e)).mo17276G((char) 2495)).mo17290o("Cannot create MomentsTrackEncoder! Moments will be disabled!");
        }
    }

    @Override // p000.fsd
    /* JADX INFO: renamed from: b */
    public final synchronized void mo8766b() {
        try {
            if (this.f23508c > 0) {
                this.f23507b.mo8766b();
            }
        } catch (RuntimeException e) {
            ((nbe) ((nbe) ((nbe) f23506a.m17252c()).mo17283h(e)).mo17276G((char) 2496)).mo17290o("Failed to prewarm MomentsTrackEncoder! Will instantiate during snapshot.");
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m8782c() {
        int i = this.f23508c - 1;
        this.f23508c = i;
        if (i == 0) {
            this.f23507b.close();
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        m8782c();
    }
}
