package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class g45 implements q45 {

    /* JADX INFO: renamed from: a */
    public final int f40178a;

    /* JADX INFO: renamed from: b */
    public final int f40179b;

    public g45(int i, int i2) {
        this.f40178a = i;
        this.f40179b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g45)) {
            return false;
        }
        g45 g45Var = (g45) obj;
        return this.f40178a == g45Var.f40178a && this.f40179b == g45Var.f40179b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40179b) + (Integer.hashCode(this.f40178a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f40178a, this.f40179b, "ConfirmBuyLesson(price=", ", lessonId=", ")");
    }
}
