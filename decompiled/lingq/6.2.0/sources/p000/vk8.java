package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class vk8 {

    /* JADX INFO: renamed from: a */
    public final int f65542a;

    /* JADX INFO: renamed from: b */
    public final int f65543b;

    /* JADX INFO: renamed from: c */
    public final int f65544c;

    /* JADX INFO: renamed from: d */
    public final int f65545d;

    /* JADX INFO: renamed from: e */
    public final boolean f65546e;

    public /* synthetic */ vk8(int i, int i2, int i3, int i4, int i5) {
        this(false, (i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }

    /* JADX INFO: renamed from: a */
    public static vk8 m23364a(vk8 vk8Var, boolean z) {
        return new vk8(z, vk8Var.f65542a, vk8Var.f65543b, vk8Var.f65544c, vk8Var.f65545d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk8)) {
            return false;
        }
        vk8 vk8Var = (vk8) obj;
        return this.f65542a == vk8Var.f65542a && this.f65543b == vk8Var.f65543b && this.f65544c == vk8Var.f65544c && this.f65545d == vk8Var.f65545d && this.f65546e == vk8Var.f65546e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65546e) + wq1.m24106b(this.f65545d, wq1.m24106b(this.f65544c, wq1.m24106b(this.f65543b, Integer.hashCode(this.f65542a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f65542a, this.f65543b, "SaleTimeRemaining(days=", ", hours=", ", minutes=");
        hn1.m13360j(this.f65544c, this.f65545d, ", seconds=", ", isNotMet=", sbM22994q);
        return AbstractC3393o1.m17740o(sbM22994q, this.f65546e, ")");
    }

    public vk8(boolean z, int i, int i2, int i3, int i4) {
        this.f65542a = i;
        this.f65543b = i2;
        this.f65544c = i3;
        this.f65545d = i4;
        this.f65546e = z;
    }
}
