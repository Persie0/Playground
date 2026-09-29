package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class v36 {

    /* JADX INFO: renamed from: a */
    public final String f64790a;

    /* JADX INFO: renamed from: b */
    public final int f64791b;

    /* JADX INFO: renamed from: c */
    public final String f64792c;

    public v36(String str, int i, String str2) {
        this.f64790a = str;
        this.f64791b = i;
        this.f64792c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v36)) {
            return false;
        }
        v36 v36Var = (v36) obj;
        return this.f64790a.equals(v36Var.f64790a) && this.f64791b == v36Var.f64791b && this.f64792c.equals(v36Var.f64792c);
    }

    public final int hashCode() {
        return this.f64792c.hashCode() + wq1.m24106b(this.f64791b, this.f64790a.hashCode() * 31, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(AbstractC3393o1.m17741p(this.f64791b, "MotivationOption(value=", this.f64790a, ", displayTextRes=", ", emoji="), this.f64792c, ")");
    }
}
