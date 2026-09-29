package p000;

/* JADX INFO: loaded from: classes.dex */
public final class vj0 {

    /* JADX INFO: renamed from: a */
    public final long f65428a;

    /* JADX INFO: renamed from: b */
    public final long f65429b;

    /* JADX INFO: renamed from: c */
    public final long f65430c;

    /* JADX INFO: renamed from: d */
    public final long f65431d;

    public vj0(long j, long j2, long j3, long j4) {
        this.f65428a = j;
        this.f65429b = j2;
        this.f65430c = j3;
        this.f65431d = j4;
    }

    /* JADX INFO: renamed from: a */
    public final vj0 m23297a(long j, long j2, long j3, long j4) {
        return new vj0(j != 16 ? j : this.f65428a, j2 != 16 ? j2 : this.f65429b, j3 != 16 ? j3 : this.f65430c, j4 != 16 ? j4 : this.f65431d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof vj0)) {
            return false;
        }
        vj0 vj0Var = (vj0) obj;
        return aa1.m199c(this.f65428a, vj0Var.f65428a) && aa1.m199c(this.f65429b, vj0Var.f65429b) && aa1.m199c(this.f65430c, vj0Var.f65430c) && aa1.m199c(this.f65431d, vj0Var.f65431d);
    }

    public final int hashCode() {
        int i = aa1.f413l;
        return Long.hashCode(this.f65431d) + ux5.m22981d(this.f65430c, ux5.m22981d(this.f65429b, Long.hashCode(this.f65428a) * 31, 31), 31);
    }
}
