package p000;

/* JADX INFO: loaded from: classes.dex */
public final class rc5 {

    /* JADX INFO: renamed from: d */
    public static final rc5 f59067d = new rc5(17, oc5.f54171c, 0);

    /* JADX INFO: renamed from: a */
    public final float f59068a;

    /* JADX INFO: renamed from: b */
    public final int f59069b;

    /* JADX INFO: renamed from: c */
    public final int f59070c;

    public rc5(int i, float f, int i2) {
        this.f59068a = f;
        this.f59069b = i;
        this.f59070c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc5)) {
            return false;
        }
        rc5 rc5Var = (rc5) obj;
        float f = rc5Var.f59068a;
        float f2 = oc5.f54170b;
        return Float.compare(this.f59068a, f) == 0 && this.f59069b == rc5Var.f59069b && this.f59070c == rc5Var.f59070c;
    }

    public final int hashCode() {
        float f = oc5.f54170b;
        return Integer.hashCode(this.f59070c) + wq1.m24106b(this.f59069b, Float.hashCode(this.f59068a) * 31, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) oc5.m17910b(this.f59068a));
        sb.append(", trim=");
        String str2 = "Invalid";
        int i = this.f59069b;
        if (i == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else {
            str = i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(",mode=");
        int i2 = this.f59070c;
        if (i2 == 0) {
            str2 = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str2 = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str2 = "LineHeightStyle.Mode.Tight";
        }
        sb.append((Object) str2);
        sb.append(')');
        return sb.toString();
    }
}
