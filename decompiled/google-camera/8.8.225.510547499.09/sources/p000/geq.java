package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class geq implements gfe {

    /* JADX INFO: renamed from: a */
    public boolean f24419a;

    /* JADX INFO: renamed from: b */
    public ikw f24420b;

    /* JADX INFO: renamed from: c */
    public kmq f24421c;

    /* JADX INFO: renamed from: d */
    private int f24422d;

    public geq(dhv dhvVar) {
        dhw dhwVar = dim.f11638a;
        dhvVar.mo6175c();
    }

    /* JADX INFO: renamed from: c */
    private final void m9140c() {
        this.f24422d = 0;
        this.f24420b = null;
        this.f24421c = null;
        this.f24419a = false;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m9141a(int i) {
        m9140c();
        this.f24422d = i;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m9142b() {
        if (this.f24422d != 0) {
            m9140c();
        }
    }

    @Override // p000.gfe
    /* JADX INFO: renamed from: bM */
    public final void mo9116bM(gfc gfcVar, gev gevVar, int i) {
    }
}
