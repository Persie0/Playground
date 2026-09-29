package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class tr8 extends hs8 {

    /* JADX INFO: renamed from: a */
    public final int f62772a;

    /* JADX INFO: renamed from: b */
    public final int f62773b;

    public tr8(int i, int i2) {
        this.f62772a = i;
        this.f62773b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr8)) {
            return false;
        }
        tr8 tr8Var = (tr8) obj;
        return this.f62772a == tr8Var.f62772a && this.f62773b == tr8Var.f62773b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f62773b) + (Integer.hashCode(this.f62772a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f62772a, this.f62773b, "OnPremiumLessonPurchaseConfirmed(price=", ", lessonId=", ")");
    }
}
