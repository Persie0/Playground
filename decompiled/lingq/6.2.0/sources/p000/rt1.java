package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class rt1 {

    /* JADX INFO: renamed from: a */
    public final boolean f59785a;

    /* JADX INFO: renamed from: b */
    public final hu1 f59786b;

    public rt1(boolean z, hu1 hu1Var) {
        this.f59785a = z;
        this.f59786b = hu1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt1)) {
            return false;
        }
        rt1 rt1Var = (rt1) obj;
        return this.f59785a == rt1Var.f59785a && fa4.m11650l(this.f59786b, rt1Var.f59786b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f59785a) * 31;
        hu1 hu1Var = this.f59786b;
        return iHashCode + (hu1Var == null ? 0 : hu1Var.hashCode());
    }

    public final String toString() {
        return "UiFlags(claimAnimation=" + this.f59785a + ", message=" + this.f59786b + ")";
    }
}
