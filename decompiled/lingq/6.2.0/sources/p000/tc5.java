package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class tc5 {

    /* JADX INFO: renamed from: a */
    public final float f62148a;

    /* JADX INFO: renamed from: b */
    public final float f62149b;

    /* JADX INFO: renamed from: c */
    public final float f62150c;

    /* JADX INFO: renamed from: d */
    public final float f62151d;

    public tc5(float f, float f2, float f3, float f4) {
        this.f62148a = f;
        this.f62149b = f2;
        this.f62150c = f3;
        this.f62151d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc5)) {
            return false;
        }
        tc5 tc5Var = (tc5) obj;
        return Float.compare(this.f62148a, tc5Var.f62148a) == 0 && Float.compare(this.f62149b, tc5Var.f62149b) == 0 && Float.compare(this.f62150c, tc5Var.f62150c) == 0 && Float.compare(this.f62151d, tc5Var.f62151d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f62151d) + wq1.m24105a(wq1.m24105a(Float.hashCode(this.f62148a) * 31, this.f62149b, 31), this.f62150c, 31);
    }

    public final String toString() {
        return "LineSegment(startX=" + this.f62148a + ", endX=" + this.f62149b + ", y=" + this.f62150c + ", length=" + this.f62151d + ")";
    }
}
