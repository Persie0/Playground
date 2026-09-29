package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ux4 extends yx4 {

    /* JADX INFO: renamed from: a */
    public final int f64486a;

    /* JADX INFO: renamed from: b */
    public final int f64487b;

    /* JADX INFO: renamed from: c */
    public final String f64488c;

    public ux4(int i, String str, int i2) {
        this.f64486a = i;
        this.f64487b = i2;
        this.f64488c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux4)) {
            return false;
        }
        ux4 ux4Var = (ux4) obj;
        return this.f64486a == ux4Var.f64486a && this.f64487b == ux4Var.f64487b && this.f64488c.equals(ux4Var.f64488c);
    }

    public final int hashCode() {
        return this.f64488c.hashCode() + wq1.m24106b(this.f64487b, Integer.hashCode(this.f64486a) * 31, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m22994q(this.f64486a, this.f64487b, "BuyPoints(price=", ", balance=", ", url="), this.f64488c, ")");
    }
}
