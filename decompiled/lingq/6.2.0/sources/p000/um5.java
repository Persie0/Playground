package p000;

/* JADX INFO: loaded from: classes.dex */
public final class um5 implements ym5 {

    /* JADX INFO: renamed from: a */
    public final qm5 f64075a;

    public um5(qm5 qm5Var) {
        qm5Var.getClass();
        this.f64075a = qm5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof um5) && fa4.m11650l(this.f64075a, ((um5) obj).f64075a);
    }

    public final int hashCode() {
        return this.f64075a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.f64075a + ")";
    }
}
