package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class lnu extends lnx {

    /* JADX INFO: renamed from: a */
    private final boolean f38782a;

    public lnu(pas pasVar, boolean z) {
        super(pasVar);
        this.f38782a = z;
    }

    /* JADX INFO: renamed from: f */
    private final pas m15773f(Long l) {
        return this.f38782a ? m15779e(l) : m15778d();
    }

    @Override // p000.lnx
    /* JADX INFO: renamed from: a */
    public final long mo15774a(String str) {
        pas pasVarM15773f = m15773f(null);
        if (pasVarM15773f.equals(pas.f47269d)) {
            return 1000L;
        }
        return pasVarM15773f.f47272b;
    }

    @Override // p000.lnx
    /* JADX INFO: renamed from: b */
    public final pas mo15775b(Long l) {
        return m15773f(l);
    }

    @Override // p000.lnx
    /* JADX INFO: renamed from: c */
    public final boolean mo15776c() {
        return this.f38782a;
    }
}
