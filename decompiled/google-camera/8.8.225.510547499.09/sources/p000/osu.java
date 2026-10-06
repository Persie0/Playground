package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class osu extends oxw implements Runnable {

    /* JADX INFO: renamed from: b */
    public final long f46501b;

    public osu(long j, ols olsVar) {
        super(olsVar.mo18639d(), olsVar);
        this.f46501b = j;
    }

    @Override // p000.opp, p000.osg
    /* JADX INFO: renamed from: cR */
    public final String mo18858cR() {
        return super.mo18858cR() + "(timeMillis=" + this.f46501b + ")";
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        m19005E(new ost("Timed out waiting for " + this.f46501b + " ms", this));
    }
}
