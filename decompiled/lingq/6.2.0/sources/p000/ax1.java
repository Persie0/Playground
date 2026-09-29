package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ax1 {

    /* JADX INFO: renamed from: a */
    public final vv1 f7635a;

    /* JADX INFO: renamed from: b */
    public final boolean f7636b;

    /* JADX INFO: renamed from: c */
    public final boolean f7637c;

    /* JADX INFO: renamed from: d */
    public final hu1 f7638d;

    public ax1(vv1 vv1Var, boolean z, boolean z2, hu1 hu1Var) {
        this.f7635a = vv1Var;
        this.f7636b = z;
        this.f7637c = z2;
        this.f7638d = hu1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax1)) {
            return false;
        }
        ax1 ax1Var = (ax1) obj;
        return fa4.m11650l(this.f7635a, ax1Var.f7635a) && this.f7636b == ax1Var.f7636b && this.f7637c == ax1Var.f7637c && fa4.m11650l(this.f7638d, ax1Var.f7638d);
    }

    public final int hashCode() {
        vv1 vv1Var = this.f7635a;
        int iM12428e = g9a.m12428e(g9a.m12428e((vv1Var == null ? 0 : vv1Var.hashCode()) * 31, 31, this.f7636b), 31, this.f7637c);
        hu1 hu1Var = this.f7638d;
        return iM12428e + (hu1Var != null ? hu1Var.hashCode() : 0);
    }

    public final String toString() {
        return "UiFlags(signup=" + this.f7635a + ", isRefreshing=" + this.f7636b + ", claimAnimation=" + this.f7637c + ", message=" + this.f7638d + ")";
    }
}
