package p000;

/* JADX INFO: loaded from: classes.dex */
public final class s67 implements yd9 {

    /* JADX INFO: renamed from: a */
    public final hj0 f60428a;

    /* JADX INFO: renamed from: b */
    public final aj0 f60429b;

    /* JADX INFO: renamed from: c */
    public zt8 f60430c;

    /* JADX INFO: renamed from: d */
    public int f60431d;

    /* JADX INFO: renamed from: e */
    public boolean f60432e;

    /* JADX INFO: renamed from: f */
    public long f60433f;

    public s67(hj0 hj0Var) {
        this.f60428a = hj0Var;
        aj0 aj0VarMo482h = hj0Var.mo482h();
        this.f60429b = aj0VarMo482h;
        zt8 zt8Var = aj0VarMo482h.f722a;
        this.f60430c = zt8Var;
        this.f60431d = zt8Var != null ? zt8Var.f72154b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r3 == r5.f72154b) goto L15;
     */
    @Override // p000.yd9
    /* JADX INFO: renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo459F(aj0 aj0Var, long j) {
        zt8 zt8Var;
        aj0Var.getClass();
        if (j < 0) {
            C3386nv.m17624j(wq1.m24116l("byteCount < 0: ", j));
            return 0L;
        }
        if (this.f60432e) {
            C3386nv.m17633t("closed");
            return 0L;
        }
        zt8 zt8Var2 = this.f60430c;
        aj0 aj0Var2 = this.f60429b;
        if (zt8Var2 != null) {
            zt8 zt8Var3 = aj0Var2.f722a;
            if (zt8Var2 == zt8Var3) {
                int i = this.f60431d;
                zt8Var3.getClass();
            }
            C3386nv.m17633t("Peek source is invalid because upstream source was used");
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.f60428a.mo464P(this.f60433f + 1)) {
            return -1L;
        }
        if (this.f60430c == null && (zt8Var = aj0Var2.f722a) != null) {
            this.f60430c = zt8Var;
            this.f60431d = zt8Var.f72154b;
        }
        long jMin = Math.min(j, aj0Var2.f723b - this.f60433f);
        this.f60429b.m479e(aj0Var, this.f60433f, jMin);
        this.f60433f += jMin;
        return jMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f60432e = true;
    }

    @Override // p000.yd9, p000.t89
    /* JADX INFO: renamed from: i */
    public final c1a mo484i() {
        return this.f60428a.mo484i();
    }
}
