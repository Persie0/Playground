package p000;

/* JADX INFO: loaded from: classes.dex */
public final class mn0 {

    /* JADX INFO: renamed from: a */
    public final long f51546a;

    /* JADX INFO: renamed from: b */
    public final long f51547b;

    /* JADX INFO: renamed from: c */
    public final long f51548c;

    /* JADX INFO: renamed from: d */
    public final long f51549d;

    public mn0(long j, long j2, long j3, long j4) {
        this.f51546a = j;
        this.f51547b = j2;
        this.f51548c = j3;
        this.f51549d = j4;
    }

    /* JADX INFO: renamed from: a */
    public final mn0 m16934a(long j, long j2, long j3, long j4) {
        return new mn0(j != 16 ? j : this.f51546a, j2 != 16 ? j2 : this.f51547b, j3 != 16 ? j3 : this.f51548c, j4 != 16 ? j4 : this.f51549d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof mn0)) {
            return false;
        }
        mn0 mn0Var = (mn0) obj;
        return aa1.m199c(this.f51546a, mn0Var.f51546a) && aa1.m199c(this.f51547b, mn0Var.f51547b) && aa1.m199c(this.f51548c, mn0Var.f51548c) && aa1.m199c(this.f51549d, mn0Var.f51549d);
    }

    public final int hashCode() {
        int i = aa1.f413l;
        return Long.hashCode(this.f51549d) + ux5.m22981d(this.f51548c, ux5.m22981d(this.f51547b, Long.hashCode(this.f51546a) * 31, 31), 31);
    }
}
