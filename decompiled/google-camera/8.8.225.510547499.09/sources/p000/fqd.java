package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fqd implements fqu {

    /* JADX INFO: renamed from: a */
    private static final nbh f23189a = nbh.m17259h("com/google/android/apps/camera/moments/EncoderStartingImageSink");

    /* JADX INFO: renamed from: b */
    private final fsd f23190b;

    /* JADX INFO: renamed from: c */
    private final kyt f23191c;

    /* JADX INFO: renamed from: d */
    private final kay f23192d;

    /* JADX INFO: renamed from: e */
    private fqu f23193e = null;

    /* JADX INFO: renamed from: f */
    private boolean f23194f = false;

    public fqd(fsd fsdVar, kyt kytVar, kay kayVar) {
        this.f23190b = fsdVar;
        this.f23191c = kytVar;
        this.f23192d = kayVar;
    }

    @Override // p000.fqu
    /* JADX INFO: renamed from: a */
    public final synchronized boolean mo8697a(kpw kpwVar) {
        if (this.f23194f) {
            kpwVar.mo7248d();
            kpwVar.close();
            return false;
        }
        if (this.f23193e == null) {
            this.f23193e = this.f23190b.mo8765a(this.f23191c, this.f23192d);
        }
        fqu fquVar = this.f23193e;
        fquVar.getClass();
        return fquVar.mo8697a(kpwVar);
    }

    @Override // p000.fqu, p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f23194f) {
            ((nbe) ((nbe) f23189a.m17252c()).mo17276G((char) 2482)).mo17290o("Closing sink more than once");
            return;
        }
        fqu fquVar = this.f23193e;
        if (fquVar != null) {
            fquVar.close();
        } else {
            this.f23191c.close();
        }
        this.f23194f = true;
    }
}
