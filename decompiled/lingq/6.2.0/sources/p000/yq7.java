package p000;

/* JADX INFO: loaded from: classes.dex */
public final class yq7 {

    /* JADX INFO: renamed from: a */
    public final boolean f70294a;

    /* JADX INFO: renamed from: b */
    public final boolean f70295b;

    /* JADX INFO: renamed from: c */
    public final boolean f70296c;

    /* JADX INFO: renamed from: d */
    public final boolean f70297d;

    public yq7(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f70294a = z;
        this.f70295b = z2;
        this.f70296c = z3;
        this.f70297d = z4;
    }

    /* JADX INFO: renamed from: a */
    public static yq7 m25286a(yq7 yq7Var, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = yq7Var.f70294a;
        }
        if ((i & 2) != 0) {
            z2 = yq7Var.f70295b;
        }
        if ((i & 4) != 0) {
            z3 = yq7Var.f70296c;
        }
        if ((i & 8) != 0) {
            z4 = yq7Var.f70297d;
        }
        yq7Var.getClass();
        return new yq7(z, z2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq7)) {
            return false;
        }
        yq7 yq7Var = (yq7) obj;
        return this.f70294a == yq7Var.f70294a && this.f70295b == yq7Var.f70295b && this.f70296c == yq7Var.f70296c && this.f70297d == yq7Var.f70297d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f70297d) + g9a.m12428e(g9a.m12428e(Boolean.hashCode(this.f70294a) * 31, 31, this.f70295b), 31, this.f70296c);
    }

    public final String toString() {
        return e65.m10875g(hn1.m13357g("RatingFlowState(showPrompt=", ", nativePrompt=", ", launchReview=", this.f70294a, this.f70295b), this.f70296c, ", isNativeReview=", this.f70297d, ")");
    }
}
