package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class x61 extends z7d {

    /* JADX INFO: renamed from: a */
    public final int f67810a;

    /* JADX INFO: renamed from: b */
    public final int f67811b;

    /* JADX INFO: renamed from: c */
    public final int f67812c;

    public x61(int i, int i2, int i3) {
        this.f67810a = i;
        this.f67811b = i2;
        this.f67812c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x61)) {
            return false;
        }
        x61 x61Var = (x61) obj;
        return this.f67810a == x61Var.f67810a && this.f67811b == x61Var.f67811b && this.f67812c == x61Var.f67812c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f67812c) + wq1.m24106b(this.f67811b, Integer.hashCode(this.f67810a) * 31, 31);
    }

    public final String toString() {
        return wq1.m24123s(ux5.m22994q(this.f67810a, this.f67811b, "PremiumLesson(price=", ", balance=", ", lessonId="), this.f67812c, ")");
    }
}
