package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kiq {

    /* JADX INFO: renamed from: a */
    public final khq f36192a;

    /* JADX INFO: renamed from: b */
    public final kho f36193b;

    /* JADX INFO: renamed from: c */
    private kba f36194c;

    public kiq(kho khoVar, khq khqVar, kba kbaVar) {
        this.f36192a = khqVar;
        this.f36193b = khoVar;
        this.f36194c = kbaVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized key m14357a() {
        return kim.m14356l(this.f36192a);
    }

    /* JADX INFO: renamed from: b */
    public final kfd m14358b() {
        return this.f36192a.f36078b;
    }

    /* JADX INFO: renamed from: c */
    final void m14359c() {
        kba kbaVar;
        synchronized (this) {
            kbaVar = this.f36194c;
            this.f36194c = null;
        }
        if (kbaVar != null) {
            kbaVar.close();
        }
    }

    /* JADX INFO: renamed from: d */
    final synchronized boolean m14360d() {
        return this.f36194c != null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m14361e() {
        return this.f36192a.m14287k();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m14362f() {
        return this.f36192a.m14289m();
    }

    public final String toString() {
        return this.f36192a.toString();
    }
}
