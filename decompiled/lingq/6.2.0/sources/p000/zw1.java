package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class zw1 {

    /* JADX INFO: renamed from: a */
    public final ft1 f72292a;

    /* JADX INFO: renamed from: b */
    public final ft1 f72293b;

    public zw1(ft1 ft1Var, ft1 ft1Var2) {
        this.f72292a = ft1Var;
        this.f72293b = ft1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw1)) {
            return false;
        }
        zw1 zw1Var = (zw1) obj;
        return fa4.m11650l(this.f72292a, zw1Var.f72292a) && fa4.m11650l(this.f72293b, zw1Var.f72293b);
    }

    public final int hashCode() {
        ft1 ft1Var = this.f72292a;
        int iHashCode = (ft1Var == null ? 0 : ft1Var.hashCode()) * 31;
        ft1 ft1Var2 = this.f72293b;
        return iHashCode + (ft1Var2 != null ? ft1Var2.hashCode() : 0);
    }

    public final String toString() {
        return "ContributorsData(global=" + this.f72292a + ", team=" + this.f72293b + ")";
    }
}
