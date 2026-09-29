package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class w61 extends z7d {

    /* JADX INFO: renamed from: a */
    public final int f66443a;

    /* JADX INFO: renamed from: b */
    public final int f66444b;

    /* JADX INFO: renamed from: c */
    public final int f66445c;

    public w61(int i, int i2, int i3) {
        this.f66443a = i;
        this.f66444b = i2;
        this.f66445c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w61)) {
            return false;
        }
        w61 w61Var = (w61) obj;
        return this.f66443a == w61Var.f66443a && this.f66444b == w61Var.f66444b && this.f66445c == w61Var.f66445c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f66445c) + wq1.m24106b(this.f66444b, Integer.hashCode(this.f66443a) * 31, 31);
    }

    public final String toString() {
        return wq1.m24123s(ux5.m22994q(this.f66443a, this.f66444b, "PremiumCourse(price=", ", balance=", ", courseId="), this.f66445c, ")");
    }
}
