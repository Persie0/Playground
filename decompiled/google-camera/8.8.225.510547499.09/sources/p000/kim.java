package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kim implements key {

    /* JADX INFO: renamed from: a */
    private final khq f36185a;

    /* JADX INFO: renamed from: b */
    private final kba f36186b;

    /* JADX INFO: renamed from: c */
    private boolean f36187c = false;

    public kim(khq khqVar, kba kbaVar) {
        this.f36185a = khqVar;
        this.f36186b = kbaVar;
    }

    /* JADX INFO: renamed from: l */
    public static key m14356l(khq khqVar) {
        kba kbaVarM14278b = khqVar.m14278b();
        if (kbaVarM14278b == null) {
            return null;
        }
        return new kim(khqVar, kbaVarM14278b);
    }

    @Override // p000.key
    /* JADX INFO: renamed from: a */
    public final synchronized key mo7040a() {
        if (this.f36187c) {
            return null;
        }
        return m14356l(this.f36185a);
    }

    @Override // p000.key
    /* JADX INFO: renamed from: b */
    public final synchronized kfd mo7041b() {
        return this.f36185a.f36078b;
    }

    @Override // p000.key
    /* JADX INFO: renamed from: c */
    public final synchronized kpp mo7042c() {
        return this.f36185a.m14280d();
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.f36187c) {
            this.f36187c = true;
            this.f36186b.close();
        }
    }

    @Override // p000.key
    /* JADX INFO: renamed from: d */
    public final synchronized kpw mo7043d(kgg kggVar) {
        if (this.f36187c) {
            return null;
        }
        return this.f36185a.m14281e(kggVar);
    }

    @Override // p000.key
    /* JADX INFO: renamed from: e */
    public final synchronized boolean mo7044e() {
        return this.f36187c;
    }

    @Override // p000.key
    /* JADX INFO: renamed from: f */
    public final synchronized boolean mo7045f() {
        return this.f36185a.m14287k();
    }

    @Override // p000.key
    /* JADX INFO: renamed from: g */
    public final boolean mo7046g() {
        return this.f36185a.m14288l();
    }

    @Override // p000.key
    /* JADX INFO: renamed from: h */
    public final synchronized boolean mo7047h() {
        return this.f36185a.m14289m();
    }

    @Override // p000.key
    /* JADX INFO: renamed from: i */
    public final synchronized boolean mo7048i() {
        return this.f36185a.m14290n();
    }

    @Override // p000.key
    /* JADX INFO: renamed from: j */
    public final synchronized kho mo7049j() {
        return this.f36185a.f36079c;
    }

    @Override // p000.key
    /* JADX INFO: renamed from: k */
    public final synchronized void mo7050k(kfv kfvVar) {
        this.f36185a.m14291o(kfvVar);
    }

    public final String toString() {
        return this.f36185a.toString();
    }
}
