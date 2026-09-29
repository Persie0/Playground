package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class tf8 {

    /* JADX INFO: renamed from: a */
    public final boolean f62224a;

    /* JADX INFO: renamed from: b */
    public final boolean f62225b;

    /* JADX INFO: renamed from: c */
    public final boolean f62226c;

    /* JADX INFO: renamed from: d */
    public final boolean f62227d;

    /* JADX INFO: renamed from: e */
    public final boolean f62228e;

    public tf8(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f62224a = z;
        this.f62225b = z2;
        this.f62226c = z3;
        this.f62227d = z4;
        this.f62228e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf8)) {
            return false;
        }
        tf8 tf8Var = (tf8) obj;
        return this.f62224a == tf8Var.f62224a && this.f62225b == tf8Var.f62225b && this.f62226c == tf8Var.f62226c && this.f62227d == tf8Var.f62227d && this.f62228e == tf8Var.f62228e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f62228e) + g9a.m12428e(g9a.m12428e(g9a.m12428e(Boolean.hashCode(this.f62224a) * 31, 31, this.f62225b), 31, this.f62226c), 31, this.f62227d);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("CardFaceProperties(term=", ", phrase=", ", translation=", this.f62224a, this.f62225b);
        wq1.m24101A(sbM13357g, this.f62226c, ", status=", this.f62227d, ", tags=");
        return AbstractC3393o1.m17740o(sbM13357g, this.f62228e, ")");
    }
}
