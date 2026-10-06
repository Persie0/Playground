package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dhe {

    /* JADX INFO: renamed from: a */
    private final dhd f11035a;

    /* JADX INFO: renamed from: b */
    private final dhd f11036b;

    /* JADX INFO: renamed from: c */
    private final long f11037c;

    /* JADX INFO: renamed from: d */
    private mrm f11038d = mqu.f41450a;

    /* JADX INFO: renamed from: e */
    private boolean f11039e = false;

    public dhe(dhd dhdVar, dhd dhdVar2, long j) {
        this.f11035a = dhdVar;
        this.f11036b = dhdVar2;
        this.f11037c = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m6147a() {
        this.f11039e = false;
        this.f11038d = mqu.f41450a;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m6148b(long j) {
        mrm mrmVarM16829i;
        boolean z = false;
        if (this.f11036b.mo6105a()) {
            this.f11038d = mqu.f41450a;
            this.f11039e = false;
            return;
        }
        if (this.f11035a.mo6105a() || !this.f11038d.mo16813g() || this.f11039e) {
            if (this.f11035a.mo6105a() && !this.f11038d.mo16813g()) {
                mrmVarM16829i = mrm.m16829i(Long.valueOf(j));
            }
            if (this.f11038d.mo16813g() && j - ((Long) this.f11038d.mo16809c()).longValue() > this.f11037c) {
                z = true;
            }
            this.f11039e = z;
            return;
        }
        mrmVarM16829i = mqu.f41450a;
        this.f11038d = mrmVarM16829i;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m6149c() {
        return this.f11039e;
    }
}
