package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class dp1 {

    /* JADX INFO: renamed from: a */
    public final int f35983a;

    /* JADX INFO: renamed from: b */
    public final int f35984b;

    /* JADX INFO: renamed from: c */
    public final int f35985c;

    /* JADX INFO: renamed from: d */
    public final String f35986d;

    public dp1(int i, int i2, int i3, String str) {
        this.f35983a = i;
        this.f35984b = i2;
        this.f35985c = i3;
        this.f35986d = str;
    }

    /* JADX INFO: renamed from: a */
    public final int m10566a() {
        return this.f35984b;
    }

    /* JADX INFO: renamed from: b */
    public final int m10567b() {
        return this.f35985c;
    }

    /* JADX INFO: renamed from: c */
    public final int m10568c() {
        return this.f35983a;
    }

    /* JADX INFO: renamed from: d */
    public final String m10569d() {
        return this.f35986d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp1)) {
            return false;
        }
        dp1 dp1Var = (dp1) obj;
        return this.f35983a == dp1Var.f35983a && this.f35984b == dp1Var.f35984b && this.f35985c == dp1Var.f35985c && this.f35986d.equals(dp1Var.f35986d);
    }

    public final int hashCode() {
        return this.f35986d.hashCode() + wq1.m24106b(this.f35985c, wq1.m24106b(this.f35984b, Integer.hashCode(this.f35983a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f35983a, this.f35984b, "CoursesAndLessonsSortJoin(pk=", ", contentId=", ", courseOrder=");
        sbM22994q.append(this.f35985c);
        sbM22994q.append(", sort=");
        sbM22994q.append(this.f35986d);
        sbM22994q.append(")");
        return sbM22994q.toString();
    }
}
