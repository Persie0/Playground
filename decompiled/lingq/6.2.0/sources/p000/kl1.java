package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class kl1 {

    /* JADX INFO: renamed from: a */
    public final int f47478a;

    /* JADX INFO: renamed from: b */
    public final int f47479b;

    /* JADX INFO: renamed from: c */
    public final int f47480c;

    public kl1(int i, int i2, int i3) {
        this.f47478a = i;
        this.f47479b = i2;
        this.f47480c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl1)) {
            return false;
        }
        kl1 kl1Var = (kl1) obj;
        return this.f47478a == kl1Var.f47478a && this.f47479b == kl1Var.f47479b && this.f47480c == kl1Var.f47480c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f47480c) + wq1.m24106b(this.f47479b, Integer.hashCode(this.f47478a) * 31, 31);
    }

    public final String toString() {
        return wq1.m24123s(ux5.m22994q(this.f47478a, this.f47479b, "ContentSource(iconRes=", ", labelRes=", ", itemsRes="), this.f47480c, ")");
    }
}
