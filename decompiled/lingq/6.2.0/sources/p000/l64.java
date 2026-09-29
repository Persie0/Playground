package p000;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class l64 {

    /* JADX INFO: renamed from: e */
    public static final l64 f49115e = new l64(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f49116a;

    /* JADX INFO: renamed from: b */
    public final int f49117b;

    /* JADX INFO: renamed from: c */
    public final int f49118c;

    /* JADX INFO: renamed from: d */
    public final int f49119d;

    public l64(int i, int i2, int i3, int i4) {
        this.f49116a = i;
        this.f49117b = i2;
        this.f49118c = i3;
        this.f49119d = i4;
    }

    /* JADX INFO: renamed from: a */
    public static l64 m15828a(l64 l64Var, l64 l64Var2) {
        return m15830c(Math.max(l64Var.f49116a, l64Var2.f49116a), Math.max(l64Var.f49117b, l64Var2.f49117b), Math.max(l64Var.f49118c, l64Var2.f49118c), Math.max(l64Var.f49119d, l64Var2.f49119d));
    }

    /* JADX INFO: renamed from: b */
    public static l64 m15829b(l64 l64Var, l64 l64Var2) {
        return m15830c(Math.min(l64Var.f49116a, l64Var2.f49116a), Math.min(l64Var.f49117b, l64Var2.f49117b), Math.min(l64Var.f49118c, l64Var2.f49118c), Math.min(l64Var.f49119d, l64Var2.f49119d));
    }

    /* JADX INFO: renamed from: c */
    public static l64 m15830c(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f49115e : new l64(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: d */
    public static l64 m15831d(Insets insets) {
        return m15830c(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX INFO: renamed from: e */
    public final Insets m15832e() {
        return zfd.m25598a(this.f49116a, this.f49117b, this.f49118c, this.f49119d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l64.class != obj.getClass()) {
            return false;
        }
        l64 l64Var = (l64) obj;
        return this.f49119d == l64Var.f49119d && this.f49116a == l64Var.f49116a && this.f49118c == l64Var.f49118c && this.f49117b == l64Var.f49117b;
    }

    public final int hashCode() {
        return (((((this.f49116a * 31) + this.f49117b) * 31) + this.f49118c) * 31) + this.f49119d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f49116a);
        sb.append(", top=");
        sb.append(this.f49117b);
        sb.append(", right=");
        sb.append(this.f49118c);
        sb.append(", bottom=");
        return wq1.m24122r(sb, this.f49119d, '}');
    }
}
