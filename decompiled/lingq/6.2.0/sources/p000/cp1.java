package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class cp1 {

    /* JADX INFO: renamed from: a */
    public final int f34330a;

    /* JADX INFO: renamed from: b */
    public final int f34331b;

    /* JADX INFO: renamed from: c */
    public final int f34332c;

    public cp1(int i, int i2, int i3) {
        this.f34330a = i;
        this.f34331b = i2;
        this.f34332c = i3;
    }

    /* JADX INFO: renamed from: a */
    public final int m9824a() {
        return this.f34331b;
    }

    /* JADX INFO: renamed from: b */
    public final int m9825b() {
        return this.f34332c;
    }

    /* JADX INFO: renamed from: c */
    public final int m9826c() {
        return this.f34330a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp1)) {
            return false;
        }
        cp1 cp1Var = (cp1) obj;
        return this.f34330a == cp1Var.f34330a && this.f34331b == cp1Var.f34331b && this.f34332c == cp1Var.f34332c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34332c) + wq1.m24106b(this.f34331b, Integer.hashCode(this.f34330a) * 31, 31);
    }

    public final String toString() {
        return wq1.m24123s(ux5.m22994q(this.f34330a, this.f34331b, "CoursesAndLessonsJoin(pk=", ", contentId=", ", courseOrder="), this.f34332c, ")");
    }
}
