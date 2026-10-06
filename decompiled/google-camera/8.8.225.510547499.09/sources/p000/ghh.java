package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ghh implements fuw {

    /* JADX INFO: renamed from: b */
    private static final nbh f24752b = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/aaa/PckLock3A");

    /* JADX INFO: renamed from: a */
    public final long f24753a;

    /* JADX INFO: renamed from: c */
    private final kfo f24754c;

    /* JADX INFO: renamed from: d */
    private final boolean f24755d;

    /* JADX INFO: renamed from: e */
    private final boolean f24756e;

    /* JADX INFO: renamed from: f */
    private final boolean f24757f;

    /* JADX INFO: renamed from: g */
    private boolean f24758g;

    public ghh(kfo kfoVar, long j, boolean z, boolean z2, boolean z3) {
        this.f24754c = kfoVar;
        this.f24753a = j;
        this.f24755d = z;
        this.f24756e = z2;
        this.f24757f = z3;
    }

    @Override // p000.fuw
    /* JADX INFO: renamed from: a */
    public final long mo8816a() {
        return this.f24753a;
    }

    @Override // p000.fuw, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f24758g) {
            return;
        }
        this.f24758g = true;
        try {
            kfo kfoVar = this.f24754c;
            kxk.m14975U(((khm) kfoVar).f36060a.m14310d(this.f24755d, this.f24756e, this.f24757f, false), new gil(1), not.INSTANCE);
        } catch (kec e) {
            ((nbe) ((nbe) ((nbe) f24752b.m17251b()).mo17283h(e)).mo17276G((char) 2638)).mo17290o("Error unlocking 3A.");
        }
    }
}
