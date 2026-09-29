package p000;

/* JADX INFO: loaded from: classes.dex */
public final class n73 implements b73 {

    /* JADX INFO: renamed from: a */
    public final int f52429a;

    /* JADX INFO: renamed from: b */
    public final go2 f52430b;

    /* JADX INFO: renamed from: c */
    public final long f52431c;

    /* JADX INFO: renamed from: d */
    public final long f52432d;

    public n73(int i, int i2, go2 go2Var) {
        this.f52429a = i;
        this.f52430b = go2Var;
        this.f52431c = ((long) i) * 1000000;
        this.f52432d = ((long) i2) * 1000000;
    }

    @Override // p000.b73
    /* JADX INFO: renamed from: b */
    public final float mo3395b(long j, float f, float f2, float f3) {
        long j2 = j - this.f52432d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.f52431c;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (mo3398e(j4, f, f2, f3) - mo3398e(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // p000.b73
    /* JADX INFO: renamed from: c */
    public final long mo3396c(float f, float f2, float f3) {
        return this.f52432d + this.f52431c;
    }

    @Override // p000.b73
    /* JADX INFO: renamed from: e */
    public final float mo3398e(long j, float f, float f2, float f3) {
        long j2 = j - this.f52432d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.f52431c;
        if (j2 > j3) {
            j2 = j3;
        }
        float fMo12780a = this.f52430b.mo12780a(this.f52429a == 0 ? 1.0f : j2 / j3);
        return (f2 * fMo12780a) + ((1.0f - fMo12780a) * f);
    }
}
