package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class lk0 {

    /* JADX INFO: renamed from: a */
    public final boolean f49753a;

    /* JADX INFO: renamed from: b */
    public final int f49754b;

    /* JADX INFO: renamed from: c */
    public final int f49755c;

    /* JADX INFO: renamed from: d */
    public final int f49756d;

    public lk0(int i, int i2, int i3, boolean z) {
        this.f49753a = z;
        this.f49754b = i;
        this.f49755c = i2;
        this.f49756d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk0)) {
            return false;
        }
        lk0 lk0Var = (lk0) obj;
        return this.f49753a == lk0Var.f49753a && this.f49754b == lk0Var.f49754b && this.f49755c == lk0Var.f49755c && this.f49756d == lk0Var.f49756d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f49756d) + wq1.m24106b(this.f49755c, wq1.m24106b(this.f49754b, Boolean.hashCode(this.f49753a) * 31, 31), 31);
    }

    public final String toString() {
        return "BuyPremiumDialogState(show=" + this.f49753a + ", price=" + this.f49754b + ", balance=" + this.f49755c + ", lessonId=" + this.f49756d + ")";
    }
}
