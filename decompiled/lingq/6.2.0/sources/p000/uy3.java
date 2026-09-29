package p000;

import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: loaded from: classes2.dex */
public final class uy3 {

    /* JADX INFO: renamed from: a */
    public final long f64519a;

    /* JADX INFO: renamed from: b */
    public final long f64520b;

    /* JADX INFO: renamed from: c */
    public final long f64521c;

    /* JADX INFO: renamed from: d */
    public final long f64522d;

    /* JADX INFO: renamed from: e */
    public final long f64523e;

    /* JADX INFO: renamed from: f */
    public final long f64524f;

    public uy3(long j, long j2, long j3, long j4, long j5, long j6) {
        this.f64519a = j;
        this.f64520b = j2;
        this.f64521c = j3;
        this.f64522d = j4;
        this.f64523e = j5;
        this.f64524f = j6;
    }

    /* JADX INFO: renamed from: c */
    public static uy3 m23010c(uy3 uy3Var, long j, long j2) {
        return new uy3(uy3Var.f64519a, j != 16 ? j : uy3Var.f64520b, uy3Var.f64521c, j2 != 16 ? j2 : uy3Var.f64522d, uy3Var.f64523e, uy3Var.f64524f);
    }

    /* JADX INFO: renamed from: a */
    public final t66 m23011a(boolean z, boolean z2, ye1 ye1Var) {
        long j;
        if (z) {
            j = !z2 ? this.f64519a : this.f64523e;
        } else {
            j = this.f64521c;
        }
        return AbstractC0278f.m1263m(new aa1(j), ye1Var);
    }

    /* JADX INFO: renamed from: b */
    public final t66 m23012b(boolean z, boolean z2, ye1 ye1Var) {
        long j;
        if (z) {
            j = !z2 ? this.f64520b : this.f64524f;
        } else {
            j = this.f64522d;
        }
        return AbstractC0278f.m1263m(new aa1(j), ye1Var);
    }

    /* JADX INFO: renamed from: d */
    public final long m23013d() {
        return this.f64520b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof uy3)) {
            return false;
        }
        uy3 uy3Var = (uy3) obj;
        return aa1.m199c(this.f64519a, uy3Var.f64519a) && aa1.m199c(this.f64520b, uy3Var.f64520b) && aa1.m199c(this.f64521c, uy3Var.f64521c) && aa1.m199c(this.f64522d, uy3Var.f64522d) && aa1.m199c(this.f64523e, uy3Var.f64523e) && aa1.m199c(this.f64524f, uy3Var.f64524f);
    }

    public final int hashCode() {
        int i = aa1.f413l;
        return Long.hashCode(this.f64524f) + ux5.m22981d(this.f64523e, ux5.m22981d(this.f64522d, ux5.m22981d(this.f64521c, ux5.m22981d(this.f64520b, Long.hashCode(this.f64519a) * 31, 31), 31), 31), 31);
    }
}
