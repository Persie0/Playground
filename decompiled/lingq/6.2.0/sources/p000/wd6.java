package p000;

/* JADX INFO: loaded from: classes.dex */
public final class wd6 {

    /* JADX INFO: renamed from: a */
    public final boolean f66649a;

    /* JADX INFO: renamed from: b */
    public final boolean f66650b;

    /* JADX INFO: renamed from: c */
    public final int f66651c;

    /* JADX INFO: renamed from: d */
    public final boolean f66652d;

    /* JADX INFO: renamed from: e */
    public final boolean f66653e;

    /* JADX INFO: renamed from: f */
    public final int f66654f;

    /* JADX INFO: renamed from: g */
    public final int f66655g;

    /* JADX INFO: renamed from: h */
    public final int f66656h;

    /* JADX INFO: renamed from: i */
    public final int f66657i;

    public wd6(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3, int i4, int i5) {
        this.f66649a = z;
        this.f66650b = z2;
        this.f66651c = i;
        this.f66652d = z3;
        this.f66653e = z4;
        this.f66654f = i2;
        this.f66655g = i3;
        this.f66656h = i4;
        this.f66657i = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof wd6)) {
            return false;
        }
        wd6 wd6Var = (wd6) obj;
        return this.f66649a == wd6Var.f66649a && this.f66650b == wd6Var.f66650b && this.f66651c == wd6Var.f66651c && this.f66652d == wd6Var.f66652d && this.f66653e == wd6Var.f66653e && this.f66654f == wd6Var.f66654f && this.f66655g == wd6Var.f66655g && this.f66656h == wd6Var.f66656h && this.f66657i == wd6Var.f66657i;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f66649a ? 1 : 0) * 31) + (this.f66650b ? 1 : 0)) * 31) + this.f66651c) * 923521) + (this.f66652d ? 1 : 0)) * 31) + (this.f66653e ? 1 : 0)) * 31) + this.f66654f) * 31) + this.f66655g) * 31) + this.f66656h) * 31) + this.f66657i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(wd6.class.getSimpleName());
        sb.append("(");
        if (this.f66649a) {
            sb.append("launchSingleTop ");
        }
        if (this.f66650b) {
            sb.append("restoreState ");
        }
        int i = this.f66657i;
        int i2 = this.f66656h;
        int i3 = this.f66655g;
        int i4 = this.f66654f;
        if (i4 != -1 || i3 != -1 || i2 != -1 || i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i4));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i3));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(i2));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(")");
        }
        return sb.toString();
    }
}
