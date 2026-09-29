package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class vx4 extends yx4 {

    /* JADX INFO: renamed from: a */
    public final int f66044a;

    /* JADX INFO: renamed from: b */
    public final int f66045b;

    /* JADX INFO: renamed from: c */
    public final int f66046c;

    public vx4(int i, int i2, int i3) {
        this.f66044a = i;
        this.f66045b = i2;
        this.f66046c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx4)) {
            return false;
        }
        vx4 vx4Var = (vx4) obj;
        return this.f66044a == vx4Var.f66044a && this.f66045b == vx4Var.f66045b && this.f66046c == vx4Var.f66046c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f66046c) + wq1.m24106b(this.f66045b, Integer.hashCode(this.f66044a) * 31, 31);
    }

    public final String toString() {
        return wq1.m24123s(ux5.m22994q(this.f66044a, this.f66045b, "BuyPremiumLesson(price=", ", balance=", ", lessonId="), this.f66046c, ")");
    }
}
