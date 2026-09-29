package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class fa9 {

    /* JADX INFO: renamed from: a */
    public final long f38725a;

    /* JADX INFO: renamed from: b */
    public final long f38726b;

    /* JADX INFO: renamed from: c */
    public final long f38727c;

    /* JADX INFO: renamed from: d */
    public final long f38728d;

    /* JADX INFO: renamed from: e */
    public final long f38729e;

    /* JADX INFO: renamed from: f */
    public final long f38730f;

    /* JADX INFO: renamed from: g */
    public final long f38731g;

    /* JADX INFO: renamed from: h */
    public final long f38732h;

    /* JADX INFO: renamed from: i */
    public final long f38733i;

    /* JADX INFO: renamed from: j */
    public final long f38734j;

    public fa9(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.f38725a = j;
        this.f38726b = j2;
        this.f38727c = j3;
        this.f38728d = j4;
        this.f38729e = j5;
        this.f38730f = j6;
        this.f38731g = j7;
        this.f38732h = j8;
        this.f38733i = j9;
        this.f38734j = j10;
    }

    /* JADX INFO: renamed from: a */
    public final long m11665a(boolean z, boolean z2) {
        if (z) {
            return z2 ? this.f38727c : this.f38729e;
        }
        return z2 ? this.f38732h : this.f38734j;
    }

    /* JADX INFO: renamed from: b */
    public final long m11666b(boolean z, boolean z2) {
        if (z) {
            return z2 ? this.f38726b : this.f38728d;
        }
        return z2 ? this.f38731g : this.f38733i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fa9)) {
            return false;
        }
        fa9 fa9Var = (fa9) obj;
        return aa1.m199c(this.f38725a, fa9Var.f38725a) && aa1.m199c(this.f38726b, fa9Var.f38726b) && aa1.m199c(this.f38727c, fa9Var.f38727c) && aa1.m199c(this.f38728d, fa9Var.f38728d) && aa1.m199c(this.f38729e, fa9Var.f38729e) && aa1.m199c(this.f38730f, fa9Var.f38730f) && aa1.m199c(this.f38731g, fa9Var.f38731g) && aa1.m199c(this.f38732h, fa9Var.f38732h) && aa1.m199c(this.f38733i, fa9Var.f38733i) && aa1.m199c(this.f38734j, fa9Var.f38734j);
    }

    public final int hashCode() {
        int i = aa1.f413l;
        return Long.hashCode(this.f38734j) + ux5.m22981d(this.f38733i, ux5.m22981d(this.f38732h, ux5.m22981d(this.f38731g, ux5.m22981d(this.f38730f, ux5.m22981d(this.f38729e, ux5.m22981d(this.f38728d, ux5.m22981d(this.f38727c, ux5.m22981d(this.f38726b, Long.hashCode(this.f38725a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
