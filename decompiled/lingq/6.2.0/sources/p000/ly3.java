package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ly3 {

    /* JADX INFO: renamed from: a */
    public final long f50302a;

    /* JADX INFO: renamed from: b */
    public final long f50303b;

    /* JADX INFO: renamed from: c */
    public final long f50304c;

    /* JADX INFO: renamed from: d */
    public final long f50305d;

    public ly3(long j, long j2, long j3, long j4) {
        this.f50302a = j;
        this.f50303b = j2;
        this.f50304c = j3;
        this.f50305d = j4;
    }

    /* JADX INFO: renamed from: a */
    public final ly3 m16572a(long j, long j2, long j3, long j4) {
        return new ly3(j != 16 ? j : this.f50302a, j2 != 16 ? j2 : this.f50303b, j3 != 16 ? j3 : this.f50304c, j4 != 16 ? j4 : this.f50305d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ly3)) {
            return false;
        }
        ly3 ly3Var = (ly3) obj;
        return aa1.m199c(this.f50302a, ly3Var.f50302a) && aa1.m199c(this.f50303b, ly3Var.f50303b) && aa1.m199c(this.f50304c, ly3Var.f50304c) && aa1.m199c(this.f50305d, ly3Var.f50305d);
    }

    public final int hashCode() {
        int i = aa1.f413l;
        return Long.hashCode(this.f50305d) + ux5.m22981d(this.f50304c, ux5.m22981d(this.f50303b, Long.hashCode(this.f50302a) * 31, 31), 31);
    }
}
