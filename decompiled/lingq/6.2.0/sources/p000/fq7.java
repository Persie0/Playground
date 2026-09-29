package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class fq7 {

    /* JADX INFO: renamed from: a */
    public final long f39485a;

    /* JADX INFO: renamed from: b */
    public final long f39486b;

    /* JADX INFO: renamed from: c */
    public final long f39487c;

    /* JADX INFO: renamed from: d */
    public final long f39488d;

    public fq7(long j, long j2, long j3, long j4) {
        this.f39485a = j;
        this.f39486b = j2;
        this.f39487c = j3;
        this.f39488d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fq7)) {
            return false;
        }
        fq7 fq7Var = (fq7) obj;
        return aa1.m199c(this.f39485a, fq7Var.f39485a) && aa1.m199c(this.f39486b, fq7Var.f39486b) && aa1.m199c(this.f39487c, fq7Var.f39487c) && aa1.m199c(this.f39488d, fq7Var.f39488d);
    }

    public final int hashCode() {
        int i = aa1.f413l;
        return Long.hashCode(this.f39488d) + ux5.m22981d(this.f39487c, ux5.m22981d(this.f39486b, Long.hashCode(this.f39485a) * 31, 31), 31);
    }
}
