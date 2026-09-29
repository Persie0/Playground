package p000;

/* JADX INFO: loaded from: classes.dex */
public final class h68 {

    /* JADX INFO: renamed from: a */
    public final boolean f41840a;

    /* JADX INFO: renamed from: b */
    public final int f41841b;

    /* JADX INFO: renamed from: c */
    public final String f41842c;

    /* JADX INFO: renamed from: d */
    public final boolean f41843d;

    /* JADX INFO: renamed from: e */
    public final String f41844e;

    /* JADX INFO: renamed from: f */
    public final boolean f41845f;

    /* JADX INFO: renamed from: g */
    public final int f41846g;

    public /* synthetic */ h68(int i, int i2, String str, boolean z) {
        this((i2 & 1) == 0, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str, (i2 & 8) == 0, (i2 & 16) == 0 ? "Something went wrong." : null, (i2 & 32) != 0 ? false : z, 5000);
    }

    /* JADX INFO: renamed from: a */
    public static h68 m13100a(h68 h68Var, boolean z, String str) {
        return new h68(h68Var.f41840a, h68Var.f41841b, h68Var.f41842c, z, str, h68Var.f41845f, h68Var.f41846g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h68)) {
            return false;
        }
        h68 h68Var = (h68) obj;
        return this.f41840a == h68Var.f41840a && this.f41841b == h68Var.f41841b && fa4.m11650l(this.f41842c, h68Var.f41842c) && this.f41843d == h68Var.f41843d && fa4.m11650l(this.f41844e, h68Var.f41844e) && this.f41845f == h68Var.f41845f && this.f41846g == h68Var.f41846g;
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f41841b, Boolean.hashCode(this.f41840a) * 31, 31);
        String str = this.f41842c;
        int iM12428e = g9a.m12428e((iM24106b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f41843d);
        String str2 = this.f41844e;
        return Integer.hashCode(this.f41846g) + g9a.m12428e((iM12428e + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f41845f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RepairStreakDialogState(show=");
        sb.append(this.f41840a);
        sb.append(", streakDays=");
        sb.append(this.f41841b);
        sb.append(", brokenStreakDate=");
        ux5.m22976C(this.f41842c, ", isLoading=", ", errorMessage=", sb, this.f41843d);
        ux5.m22976C(this.f41844e, ", notEnoughCoins=", ", repairCost=", sb, this.f41845f);
        return wq1.m24123s(sb, this.f41846g, ")");
    }

    public h68(boolean z, int i, String str, boolean z2, String str2, boolean z3, int i2) {
        this.f41840a = z;
        this.f41841b = i;
        this.f41842c = str;
        this.f41843d = z2;
        this.f41844e = str2;
        this.f41845f = z3;
        this.f41846g = i2;
    }
}
