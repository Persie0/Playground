package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class kk0 {

    /* JADX INFO: renamed from: a */
    public final boolean f47448a;

    /* JADX INFO: renamed from: b */
    public final yx4 f47449b;

    public kk0(boolean z, yx4 yx4Var) {
        yx4Var.getClass();
        this.f47448a = z;
        this.f47449b = yx4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk0)) {
            return false;
        }
        kk0 kk0Var = (kk0) obj;
        return this.f47448a == kk0Var.f47448a && fa4.m11650l(this.f47449b, kk0Var.f47449b);
    }

    public final int hashCode() {
        return this.f47449b.hashCode() + (Boolean.hashCode(this.f47448a) * 31);
    }

    public final String toString() {
        return "BuyLessonState(showDialog=" + this.f47448a + ", lessonBuyInfo=" + this.f47449b + ")";
    }
}
