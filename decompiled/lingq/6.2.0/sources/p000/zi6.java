package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class zi6 {

    /* JADX INFO: renamed from: a */
    public final int f71610a;

    /* JADX INFO: renamed from: b */
    public final float f71611b;

    /* JADX INFO: renamed from: c */
    public final float f71612c;

    /* JADX INFO: renamed from: d */
    public final float f71613d;

    /* JADX INFO: renamed from: e */
    public final long f71614e;

    public zi6(float f, float f2, float f3, int i, long j) {
        this.f71610a = i;
        this.f71611b = f;
        this.f71612c = f2;
        this.f71613d = f3;
        this.f71614e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zi6.class == obj.getClass()) {
            zi6 zi6Var = (zi6) obj;
            return this.f71612c == zi6Var.f71612c && this.f71613d == zi6Var.f71613d && this.f71611b == zi6Var.f71611b && this.f71610a == zi6Var.f71610a && this.f71614e == zi6Var.f71614e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f71614e) + wq1.m24106b(this.f71610a, wq1.m24105a(wq1.m24105a(Float.hashCode(this.f71612c) * 31, this.f71613d, 31), this.f71611b, 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.f71612c + ", touchY=" + this.f71613d + ", progress=" + this.f71611b + ", swipeEdge=" + this.f71610a + ", frameTimeMillis=" + this.f71614e + ')';
    }
}
