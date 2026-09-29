package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class p34 implements st8 {

    /* JADX INFO: renamed from: a */
    public final ztb f55515a;

    /* JADX INFO: renamed from: b */
    public final ztb f55516b;

    /* JADX INFO: renamed from: c */
    public long f55517c;

    public p34(long j, long[] jArr, long[] jArr2) {
        bna.m3969q(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f55515a = new ztb(length, 5);
            this.f55516b = new ztb(length, 5);
        } else {
            int i = length + 1;
            ztb ztbVar = new ztb(i, 5);
            this.f55515a = ztbVar;
            ztb ztbVar2 = new ztb(i, 5);
            this.f55516b = ztbVar2;
            ztbVar.m25780a(0L);
            ztbVar2.m25780a(0L);
        }
        this.f55515a.m25781c(jArr);
        this.f55516b.m25781c(jArr2);
        this.f55517c = j;
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: c */
    public final boolean mo3541c() {
        return this.f55516b.f72161b > 0;
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: f */
    public final rt8 mo3543f(long j) {
        ztb ztbVar = this.f55516b;
        if (ztbVar.f72161b == 0) {
            ut8 ut8Var = ut8.f64337c;
            return new rt8(ut8Var, ut8Var);
        }
        int iM22807b = uma.m22807b(ztbVar, j);
        long jM25782d = ztbVar.m25782d(iM22807b);
        ztb ztbVar2 = this.f55515a;
        ut8 ut8Var2 = new ut8(jM25782d, ztbVar2.m25782d(iM22807b));
        if (jM25782d == j || iM22807b == ztbVar.f72161b - 1) {
            return new rt8(ut8Var2, ut8Var2);
        }
        int i = iM22807b + 1;
        return new rt8(ut8Var2, new ut8(ztbVar.m25782d(i), ztbVar2.m25782d(i)));
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: h */
    public final long mo3545h() {
        return this.f55517c;
    }

    /* JADX INFO: renamed from: i */
    public final void m18880i(long j, long j2) {
        ztb ztbVar = this.f55516b;
        int i = ztbVar.f72161b;
        ztb ztbVar2 = this.f55515a;
        if (i == 0 && j > 0) {
            ztbVar2.m25780a(0L);
            ztbVar.m25780a(0L);
        }
        ztbVar2.m25780a(j2);
        ztbVar.m25780a(j);
    }
}
