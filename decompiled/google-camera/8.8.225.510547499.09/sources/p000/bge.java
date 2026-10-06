package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bge extends bgc {
    public bge() {
    }

    @Override // p000.bgc
    /* JADX INFO: renamed from: a */
    protected final int mo2375a() {
        return -2147475470;
    }

    /* JADX INFO: renamed from: b */
    public final void m2387b(bge bgeVar) throws bfc {
        if (bgeVar != null) {
            m2383g(bgeVar.f3154a | this.f3154a);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2388c() {
        return m2384h(64);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2389d() {
        return m2384h(512);
    }

    @Override // p000.bgc
    /* JADX INFO: renamed from: e */
    public final void mo2381e(int i) throws bfc {
        if ((i & 256) > 0 && (i & 512) > 0) {
            throw new bfc("IsStruct and IsArray options are mutually exclusive", 103);
        }
        if ((i & 2) > 0 && (i & 768) > 0) {
            throw new bfc("Structs and arrays can't have \"value\" options", 103);
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2390i() {
        return m2384h(4096);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2391j() {
        return m2384h(2048);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2392k() {
        return m2384h(1024);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m2393l() {
        return (this.f3154a & 768) > 0;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m2394m() {
        return m2384h(32);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m2395n() {
        return m2384h(Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m2396o() {
        return m2384h(256);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m2397p() {
        return m2384h(2);
    }

    /* JADX INFO: renamed from: q */
    public final void m2398q() {
        m2382f(512, true);
    }

    /* JADX INFO: renamed from: r */
    public final void m2399r() {
        m2382f(4096, true);
    }

    /* JADX INFO: renamed from: s */
    public final void m2400s() {
        m2382f(2048, true);
    }

    /* JADX INFO: renamed from: t */
    public final void m2401t() {
        m2382f(1024, true);
    }

    /* JADX INFO: renamed from: u */
    public final void m2402u(boolean z) {
        m2382f(64, z);
    }

    /* JADX INFO: renamed from: v */
    public final void m2403v(boolean z) {
        m2382f(16, z);
    }

    /* JADX INFO: renamed from: w */
    public final void m2404w(boolean z) {
        m2382f(128, z);
    }

    /* JADX INFO: renamed from: x */
    public final void m2405x(boolean z) {
        m2382f(256, z);
    }

    public bge(int i) {
        super(i);
    }
}
