package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ae9 extends g04 {

    /* JADX INFO: renamed from: a */
    public final vz1 f556a;

    /* JADX INFO: renamed from: b */
    public boolean f557b;

    /* JADX INFO: renamed from: c */
    public final hj0 f558c;

    public ae9(hj0 hj0Var, vz1 vz1Var) {
        this.f556a = vz1Var;
        this.f558c = hj0Var;
    }

    @Override // p000.g04
    /* JADX INFO: renamed from: a */
    public final vz1 mo315a() {
        return this.f556a;
    }

    @Override // p000.g04
    /* JADX INFO: renamed from: b */
    public final synchronized hj0 mo316b() {
        hj0 hj0Var;
        try {
            if (this.f557b) {
                throw new IllegalStateException("closed");
            }
            hj0Var = this.f558c;
            if (hj0Var == null) {
                rg4 rg4Var = u33.f63345a;
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return hj0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f557b = true;
        hj0 hj0Var = this.f558c;
        if (hj0Var != null) {
            AbstractC3057h.m12986a(hj0Var);
        }
    }
}
