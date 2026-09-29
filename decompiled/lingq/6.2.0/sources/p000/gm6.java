package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class gm6 {

    /* JADX INFO: renamed from: a */
    public final boolean f41011a;

    /* JADX INFO: renamed from: b */
    public final int f41012b;

    /* JADX INFO: renamed from: c */
    public final int f41013c;

    /* JADX INFO: renamed from: d */
    public final String f41014d;

    public gm6(int i, int i2, String str, boolean z) {
        this.f41011a = z;
        this.f41012b = i;
        this.f41013c = i2;
        this.f41014d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm6)) {
            return false;
        }
        gm6 gm6Var = (gm6) obj;
        return this.f41011a == gm6Var.f41011a && this.f41012b == gm6Var.f41012b && this.f41013c == gm6Var.f41013c && fa4.m11650l(this.f41014d, gm6Var.f41014d);
    }

    public final int hashCode() {
        return this.f41014d.hashCode() + wq1.m24106b(this.f41013c, wq1.m24106b(this.f41012b, Boolean.hashCode(this.f41011a) * 31, 31), 31);
    }

    public final String toString() {
        return "NotEnoughBalanceDialogState(show=" + this.f41011a + ", price=" + this.f41012b + ", balance=" + this.f41013c + ", buyPointsUrl=" + this.f41014d + ")";
    }

    public /* synthetic */ gm6() {
        this(0, 0, "", false);
    }
}
