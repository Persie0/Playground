package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kbs implements kbo {

    /* JADX INFO: renamed from: a */
    private final kbo f35540a;

    /* JADX INFO: renamed from: b */
    private final String f35541b;

    private kbs(kbo kboVar, String str) {
        this.f35540a = kboVar;
        this.f35541b = str;
    }

    /* JADX INFO: renamed from: k */
    public static kbs m13951k(String str, kbo kboVar) {
        return new kbs(kboVar, str);
    }

    @Override // p000.kbo, p000.kbn
    /* JADX INFO: renamed from: a */
    public final kbo mo6314a(String str) {
        return new kbs(this.f35540a.mo6314a(str), this.f35541b);
    }

    @Override // p000.kbo
    /* JADX INFO: renamed from: b */
    public final void mo13940b(String str) {
        this.f35540a.mo13940b(this.f35541b.concat(String.valueOf(str)));
    }

    @Override // p000.kbo
    /* JADX INFO: renamed from: c */
    public final void mo13941c(String str, Throwable th) {
        this.f35540a.mo13941c(this.f35541b.concat(str), th);
    }

    @Override // p000.kbo
    /* JADX INFO: renamed from: d */
    public final void mo13942d(String str) {
        this.f35540a.mo13942d(this.f35541b.concat(String.valueOf(str)));
    }

    @Override // p000.kbo
    /* JADX INFO: renamed from: e */
    public final void mo13943e(String str, Throwable th) {
        this.f35540a.mo13943e(this.f35541b.concat(String.valueOf(str)), th);
    }

    @Override // p000.kbo
    /* JADX INFO: renamed from: f */
    public final void mo13944f(String str) {
        this.f35540a.mo13944f(this.f35541b.concat(String.valueOf(str)));
    }

    @Override // p000.kbo
    /* JADX INFO: renamed from: g */
    public final void mo13945g(String str, Throwable th) {
        this.f35540a.mo13945g(this.f35541b.concat(str), th);
    }

    @Override // p000.kbo
    /* JADX INFO: renamed from: h */
    public final void mo13946h(String str) {
        this.f35540a.mo13946h(this.f35541b.concat(String.valueOf(str)));
    }

    @Override // p000.kbo
    /* JADX INFO: renamed from: i */
    public final void mo13947i(String str) {
        this.f35540a.mo13947i(this.f35541b.concat(String.valueOf(str)));
    }

    @Override // p000.kbo
    /* JADX INFO: renamed from: j */
    public final void mo13948j(String str, Throwable th) {
        this.f35540a.mo13948j(this.f35541b.concat(String.valueOf(str)), th);
    }
}
