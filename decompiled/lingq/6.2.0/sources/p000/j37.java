package p000;

/* JADX INFO: loaded from: classes.dex */
public final class j37 implements InterfaceC3190kn {

    /* JADX INFO: renamed from: a */
    public final int f45012a;

    /* JADX INFO: renamed from: b */
    public final int f45013b;

    /* JADX INFO: renamed from: c */
    public final long f45014c;

    /* JADX INFO: renamed from: d */
    public final aw9 f45015d;

    /* JADX INFO: renamed from: e */
    public final a97 f45016e;

    /* JADX INFO: renamed from: f */
    public final rc5 f45017f;

    /* JADX INFO: renamed from: g */
    public final int f45018g;

    /* JADX INFO: renamed from: h */
    public final int f45019h;

    /* JADX INFO: renamed from: i */
    public final ax9 f45020i;

    public j37(int i, int i2, long j, aw9 aw9Var, a97 a97Var, rc5 rc5Var, int i3, int i4, ax9 ax9Var) {
        this.f45012a = i;
        this.f45013b = i2;
        this.f45014c = j;
        this.f45015d = aw9Var;
        this.f45016e = a97Var;
        this.f45017f = rc5Var;
        this.f45018g = i3;
        this.f45019h = i4;
        this.f45020i = ax9Var;
        if (zx9.m25846a(j, zx9.f72359c) || zx9.m25848c(j) >= 0.0f) {
            return;
        }
        j54.m14290c("lineHeight can't be negative (" + zx9.m25848c(j) + ')');
    }

    /* JADX INFO: renamed from: a */
    public final j37 m14282a(j37 j37Var) {
        return j37Var == null ? this : k37.m14787a(this, j37Var.f45012a, j37Var.f45013b, j37Var.f45014c, j37Var.f45015d, j37Var.f45016e, j37Var.f45017f, j37Var.f45018g, j37Var.f45019h, j37Var.f45020i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j37)) {
            return false;
        }
        j37 j37Var = (j37) obj;
        return this.f45012a == j37Var.f45012a && this.f45013b == j37Var.f45013b && zx9.m25846a(this.f45014c, j37Var.f45014c) && fa4.m11650l(this.f45015d, j37Var.f45015d) && fa4.m11650l(this.f45016e, j37Var.f45016e) && fa4.m11650l(this.f45017f, j37Var.f45017f) && this.f45018g == j37Var.f45018g && this.f45019h == j37Var.f45019h && fa4.m11650l(this.f45020i, j37Var.f45020i);
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f45013b, Integer.hashCode(this.f45012a) * 31, 31);
        ay9[] ay9VarArr = zx9.f72358b;
        int iM22981d = ux5.m22981d(this.f45014c, iM24106b, 31);
        aw9 aw9Var = this.f45015d;
        int iHashCode = (iM22981d + (aw9Var != null ? aw9Var.hashCode() : 0)) * 31;
        a97 a97Var = this.f45016e;
        int iHashCode2 = (iHashCode + (a97Var != null ? a97Var.hashCode() : 0)) * 31;
        rc5 rc5Var = this.f45017f;
        int iM24106b2 = wq1.m24106b(this.f45019h, wq1.m24106b(this.f45018g, (iHashCode2 + (rc5Var != null ? rc5Var.hashCode() : 0)) * 31, 31), 31);
        ax9 ax9Var = this.f45020i;
        return iM24106b2 + (ax9Var != null ? ax9Var.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) ks9.m15663b(this.f45012a)) + ", textDirection=" + ((Object) vt9.m23544a(this.f45013b)) + ", lineHeight=" + ((Object) zx9.m25850e(this.f45014c)) + ", textIndent=" + this.f45015d + ", platformStyle=" + this.f45016e + ", lineHeightStyle=" + this.f45017f + ", lineBreak=" + ((Object) hc5.m13193a(this.f45018g)) + ", hyphens=" + ((Object) kx3.m15711a(this.f45019h)) + ", textMotion=" + this.f45020i + ')';
    }
}
