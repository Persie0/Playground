package p000;

import android.graphics.Point;

/* JADX INFO: loaded from: classes2.dex */
public final class ri8 {

    /* JADX INFO: renamed from: a */
    public final int f59367a;

    /* JADX INFO: renamed from: b */
    public final int f59368b;

    /* JADX INFO: renamed from: c */
    public final Point f59369c;

    public ri8(int i, int i2, Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.f59367a = i;
        this.f59368b = i2;
        this.f59369c = new Point(i3, i4);
    }

    /* JADX INFO: renamed from: a */
    public final int m20667a() {
        return this.f59368b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ri8) {
            ri8 ri8Var = (ri8) obj;
            if (this.f59367a == ri8Var.f59367a && this.f59368b == ri8Var.f59368b && this.f59369c.equals(ri8Var.f59369c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f59369c.hashCode() + (((this.f59367a * 31) + this.f59368b) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.f59367a;
        if (i == 0) {
            str = "TopLeft";
        } else if (i == 1) {
            str = "TopRight";
        } else if (i != 2) {
            str = i != 3 ? "Invalid" : "BottomLeft";
        } else {
            str = "BottomRight";
        }
        sb.append(str);
        sb.append(", radius=");
        sb.append(this.f59368b);
        sb.append(", center=");
        sb.append(this.f59369c);
        sb.append('}');
        return sb.toString();
    }
}
