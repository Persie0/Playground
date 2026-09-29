package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ur8 extends hs8 {

    /* JADX INFO: renamed from: a */
    public final int f64249a;

    /* JADX INFO: renamed from: b */
    public final int f64250b;

    public ur8(int i, int i2) {
        this.f64249a = i;
        this.f64250b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur8)) {
            return false;
        }
        ur8 ur8Var = (ur8) obj;
        return this.f64249a == ur8Var.f64249a && this.f64250b == ur8Var.f64250b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f64250b) + (Integer.hashCode(this.f64249a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f64249a, this.f64250b, "OnPremiumLessonRequired(price=", ", lessonId=", ")");
    }
}
