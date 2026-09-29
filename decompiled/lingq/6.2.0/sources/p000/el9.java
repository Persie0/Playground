package p000;

/* JADX INFO: loaded from: classes.dex */
public final class el9 extends ml2 {

    /* JADX INFO: renamed from: a */
    public final float f37448a;

    /* JADX INFO: renamed from: b */
    public final float f37449b;

    /* JADX INFO: renamed from: c */
    public final int f37450c;

    /* JADX INFO: renamed from: d */
    public final int f37451d;

    public el9(float f, float f2, int i, int i2, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.f37448a = f;
        this.f37449b = f2;
        this.f37450c = i;
        this.f37451d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el9)) {
            return false;
        }
        el9 el9Var = (el9) obj;
        return this.f37448a == el9Var.f37448a && this.f37449b == el9Var.f37449b && this.f37450c == el9Var.f37450c && this.f37451d == el9Var.f37451d;
    }

    public final int hashCode() {
        return wq1.m24106b(this.f37451d, wq1.m24106b(this.f37450c, wq1.m24105a(Float.hashCode(this.f37448a) * 31, this.f37449b, 31), 31), 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f37448a);
        sb.append(", miter=");
        sb.append(this.f37449b);
        sb.append(", cap=");
        String str2 = "Unknown";
        int i = this.f37450c;
        if (i == 0) {
            str = "Butt";
        } else if (i == 1) {
            str = "Round";
        } else {
            str = i == 2 ? "Square" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(", join=");
        int i2 = this.f37451d;
        if (i2 == 0) {
            str2 = "Miter";
        } else if (i2 == 1) {
            str2 = "Round";
        } else if (i2 == 2) {
            str2 = "Bevel";
        }
        sb.append((Object) str2);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
