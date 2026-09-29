package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class r75 {

    /* JADX INFO: renamed from: a */
    public final String f58853a;

    /* JADX INFO: renamed from: b */
    public final int f58854b;

    /* JADX INFO: renamed from: c */
    public final int f58855c;

    public r75(String str, int i, int i2) {
        str.getClass();
        this.f58853a = str;
        this.f58854b = i;
        this.f58855c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r75)) {
            return false;
        }
        r75 r75Var = (r75) obj;
        return fa4.m11650l(this.f58853a, r75Var.f58853a) && this.f58854b == r75Var.f58854b && this.f58855c == r75Var.f58855c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f58855c) + wq1.m24106b(this.f58854b, this.f58853a.hashCode() * 31, 31);
    }

    public final String toString() {
        return wq1.m24123s(AbstractC3393o1.m17741p(this.f58854b, "LevelItem(code=", this.f58853a, ", desc=", ", icon="), this.f58855c, ")");
    }
}
