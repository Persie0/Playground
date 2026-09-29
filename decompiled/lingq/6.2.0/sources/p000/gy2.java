package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class gy2 {

    /* JADX INFO: renamed from: a */
    public final on3 f41519a;

    /* JADX INFO: renamed from: b */
    public final on3 f41520b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ gy2(on3 on3Var, int i) {
        int i2 = i & 2;
        mn3 mn3Var = mn3.f51554a;
        this(mn3Var, i2 != 0 ? mn3Var : on3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy2)) {
            return false;
        }
        gy2 gy2Var = (gy2) obj;
        return fa4.m11650l(this.f41519a, gy2Var.f41519a) && fa4.m11650l(this.f41520b, gy2Var.f41520b);
    }

    public final int hashCode() {
        return this.f41520b.hashCode() + (this.f41519a.hashCode() * 31);
    }

    public final String toString() {
        return "ExtractedSizeAndCornerModifiers(sizeAndCornerModifiers=" + this.f41519a + ", nonSizeOrCornerModifiers=" + this.f41520b + ')';
    }

    public gy2(on3 on3Var, on3 on3Var2) {
        this.f41519a = on3Var;
        this.f41520b = on3Var2;
    }
}
