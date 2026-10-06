package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hse implements kba {

    /* JADX INFO: renamed from: a */
    public final dxx f29393a;

    /* JADX INFO: renamed from: b */
    private final eat f29394b;

    /* JADX INFO: renamed from: c */
    private final dyf f29395c;

    public hse(eat eatVar, dyf dyfVar, dxx dxxVar) {
        this.f29394b = eatVar;
        this.f29395c = dyfVar;
        this.f29393a = dxxVar;
        dyfVar.m6920i("tracking-meta");
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m10683a() {
        this.f29394b.m7018c();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m10684b(kbc kbcVar, long j) {
        kbc kbcVar2 = new kbc(kbcVar.f35517a, kbcVar.f35518b);
        if (!this.f29394b.m7020e()) {
            this.f29394b.m7021f(kbcVar2, "trk-gyro-session");
        }
        if (!this.f29394b.m7020e()) {
            return false;
        }
        this.f29394b.m7017b(j, this.f29393a.m6885a(j));
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized float[] m10685c(long j) {
        if (!this.f29394b.m7020e()) {
            return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return ((lbp) this.f29394b.m7017b(j, this.f29393a.m6885a(j)).get(0)).m15148d();
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f29395c.m6921j("tracking-meta");
    }
}
