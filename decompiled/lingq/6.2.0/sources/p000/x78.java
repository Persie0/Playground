package p000;

/* JADX INFO: loaded from: classes.dex */
public final class x78 {

    /* JADX INFO: renamed from: a */
    public final int f67900a;

    /* JADX INFO: renamed from: b */
    public final bc3 f67901b;

    /* JADX INFO: renamed from: c */
    public final int f67902c;

    /* JADX INFO: renamed from: d */
    public final zb3 f67903d;

    public x78(int i, bc3 bc3Var, int i2, zb3 zb3Var) {
        this.f67900a = i;
        this.f67901b = bc3Var;
        this.f67902c = i2;
        this.f67903d = zb3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x78)) {
            return false;
        }
        x78 x78Var = (x78) obj;
        return this.f67900a == x78Var.f67900a && fa4.m11650l(this.f67901b, x78Var.f67901b) && this.f67902c == x78Var.f67902c && this.f67903d.equals(x78Var.f67903d);
    }

    public final int hashCode() {
        return this.f67903d.f71299a.hashCode() + wq1.m24106b(0, wq1.m24106b(this.f67902c, ((this.f67900a * 31) + this.f67901b.f8327a) * 31, 31), 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ResourceFont(resId=");
        sb.append(this.f67900a);
        sb.append(", weight=");
        sb.append(this.f67901b);
        sb.append(", style=");
        int i = this.f67902c;
        if (i == 0) {
            str = "Normal";
        } else {
            str = i == 1 ? "Italic" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", loadingStrategy=Blocking)");
        return sb.toString();
    }
}
