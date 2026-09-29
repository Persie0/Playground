package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class v61 extends z7d {

    /* JADX INFO: renamed from: a */
    public final int f64908a;

    /* JADX INFO: renamed from: b */
    public final int f64909b;

    /* JADX INFO: renamed from: c */
    public final boolean f64910c;

    public v61(int i, int i2, boolean z) {
        this.f64908a = i;
        this.f64909b = i2;
        this.f64910c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v61)) {
            return false;
        }
        v61 v61Var = (v61) obj;
        return this.f64908a == v61Var.f64908a && this.f64909b == v61Var.f64909b && this.f64910c == v61Var.f64910c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64910c) + wq1.m24106b(this.f64909b, Integer.hashCode(this.f64908a) * 31, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17740o(ux5.m22994q(this.f64908a, this.f64909b, "NotEnoughBalance(price=", ", balance=", ", isCourse="), this.f64910c, ")");
    }
}
