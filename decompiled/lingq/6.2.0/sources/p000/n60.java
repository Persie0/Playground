package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class n60 implements nm0 {

    /* JADX INFO: renamed from: a */
    public final m60[] f52386a;

    public n60(m60[] m60VarArr) {
        this.f52386a = m60VarArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m17246a() {
        for (m60 m60Var : this.f52386a) {
            ci2 ci2Var = m60Var.f50635i;
            if (ci2Var == null) {
                fa4.m11636J("handle");
                throw null;
            }
            ci2Var.mo125a();
        }
    }

    @Override // p000.nm0
    /* JADX INFO: renamed from: b */
    public final void mo15586b(Throwable th) {
        m17246a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f52386a + ']';
    }
}
