package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class fp8 extends zyc {

    /* JADX INFO: renamed from: a */
    public final int f39428a;

    /* JADX INFO: renamed from: b */
    public final int f39429b;

    public fp8(int i, int i2) {
        this.f39428a = i;
        this.f39429b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp8)) {
            return false;
        }
        fp8 fp8Var = (fp8) obj;
        return this.f39428a == fp8Var.f39428a && this.f39429b == fp8Var.f39429b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39429b) + (Integer.hashCode(this.f39428a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f39428a, this.f39429b, "RequestPremiumLesson(price=", ", lessonId=", ")");
    }
}
