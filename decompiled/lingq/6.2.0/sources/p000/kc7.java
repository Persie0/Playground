package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class kc7 implements ad7 {

    /* JADX INFO: renamed from: a */
    public final int f47029a;

    /* JADX INFO: renamed from: b */
    public final int f47030b;

    public kc7(int i, int i2) {
        this.f47029a = i;
        this.f47030b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc7)) {
            return false;
        }
        kc7 kc7Var = (kc7) obj;
        return this.f47029a == kc7Var.f47029a && this.f47030b == kc7Var.f47030b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f47030b) + (Integer.hashCode(this.f47029a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f47029a, this.f47030b, "OnBuyLesson(price=", ", lessonId=", ")");
    }
}
