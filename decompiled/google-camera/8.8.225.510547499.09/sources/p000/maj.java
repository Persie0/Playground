package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class maj extends lzv {

    /* JADX INFO: renamed from: a */
    public final apt f39706a;

    /* JADX INFO: renamed from: b */
    public final apn f39707b;

    /* JADX INFO: renamed from: c */
    public final aqa f39708c;

    /* JADX INFO: renamed from: d */
    public final aqa f39709d;

    /* JADX INFO: renamed from: e */
    public final aqa f39710e;

    /* JADX INFO: renamed from: f */
    public final aqa f39711f;

    /* JADX INFO: renamed from: g */
    public final aqa f39712g;

    public maj(apt aptVar) {
        this.f39706a = aptVar;
        this.f39707b = new mac(aptVar);
        this.f39708c = new mad(aptVar);
        this.f39709d = new mae(aptVar);
        this.f39710e = new maf(aptVar);
        this.f39711f = new mag(aptVar);
        this.f39712g = new mah(aptVar);
    }

    @Override // p000.lzv
    /* JADX INFO: renamed from: a */
    public final Object mo16256a(final lzb lzbVar, ols olsVar) {
        return aeo.m363i(this.f39706a, new oni() { // from class: lzw
            @Override // p000.oni
            /* JADX INFO: renamed from: a */
            public final Object mo1803a(Object obj) {
                return lzv.m16252b(this.f39674a, lzbVar, (ols) obj);
            }
        }, olsVar);
    }

    @Override // p000.lzv
    /* JADX INFO: renamed from: c */
    public final Object mo16257c(lzb lzbVar, lxm lxmVar, ols olsVar) {
        return aeo.m363i(this.f39706a, new lxt(this, lzbVar, lxmVar, 2), olsVar);
    }

    @Override // p000.lzv
    /* JADX INFO: renamed from: e */
    public final Object mo16258e(long j, double d, lwh lwhVar, ols olsVar) {
        return adr.m307c(this.f39706a, new lzz(this, d, lwhVar, j), olsVar);
    }

    @Override // p000.lzv
    /* JADX INFO: renamed from: f */
    public final Object mo16259f(long j, ols olsVar) {
        apy apyVarM1841a = apy.m1841a("SELECT status_uploadProgressPercent FROM ResourceEntity WHERE onDeviceId = ?", 1);
        apyVarM1841a.mo1845e(1, j);
        return adr.m306b(this.f39706a, false, afj.m507g(), new kab(this, apyVarM1841a, 3), olsVar);
    }

    @Override // p000.lzv
    /* JADX INFO: renamed from: g */
    public final Object mo16260g(lxm lxmVar, ols olsVar) {
        return adr.m307c(this.f39706a, new kab(this, lxmVar, 4), olsVar);
    }

    @Override // p000.lzv
    /* JADX INFO: renamed from: i */
    public final Object mo16262i(long j, double d, ols olsVar) {
        return adr.m307c(this.f39706a, new mai(this, d, j), olsVar);
    }

    @Override // p000.lzv
    /* JADX INFO: renamed from: j */
    public final Object mo16263j(final lzb lzbVar, final lxm lxmVar, final boolean z, final oni oniVar, ols olsVar) {
        return aeo.m363i(this.f39706a, new oni() { // from class: lzx
            @Override // p000.oni
            /* JADX INFO: renamed from: a */
            public final Object mo1803a(Object obj) {
                return lzv.m16254k(this.f39676a, lzbVar, lxmVar, z, oniVar, (ols) obj);
            }
        }, olsVar);
    }

    @Override // p000.lzv
    /* JADX INFO: renamed from: m */
    public final Object mo16265m(long j, String str, ols olsVar) {
        return adr.m307c(this.f39706a, new maa(this, str, j, 2), olsVar);
    }

    @Override // p000.lzv
    /* JADX INFO: renamed from: n */
    public final Object mo16266n(long j, lwh lwhVar, ols olsVar) {
        return adr.m307c(this.f39706a, new maa(this, lwhVar, j, 0), olsVar);
    }

    @Override // p000.lzv
    /* JADX INFO: renamed from: q */
    public final Object mo16268q(long j, lvn lvnVar, nzw nzwVar, lwh lwhVar, ols olsVar) {
        return adr.m307c(this.f39706a, new lzy(this, lvnVar, nzwVar, lwhVar, j), olsVar);
    }
}
