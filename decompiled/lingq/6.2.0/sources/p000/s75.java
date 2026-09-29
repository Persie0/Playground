package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class s75 {

    /* JADX INFO: renamed from: a */
    public final String f60464a;

    /* JADX INFO: renamed from: b */
    public final int f60465b;

    /* JADX INFO: renamed from: c */
    public final int f60466c;

    public s75(String str, int i, int i2) {
        str.getClass();
        this.f60464a = str;
        this.f60465b = i;
        this.f60466c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s75)) {
            return false;
        }
        s75 s75Var = (s75) obj;
        return fa4.m11650l(this.f60464a, s75Var.f60464a) && this.f60465b == s75Var.f60465b && this.f60466c == s75Var.f60466c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f60466c) + wq1.m24106b(this.f60465b, this.f60464a.hashCode() * 31, 31);
    }

    public final String toString() {
        return wq1.m24123s(AbstractC3393o1.m17741p(this.f60465b, "LevelOption(value=", this.f60464a, ", displayTextRes=", ", iconRes="), this.f60466c, ")");
    }
}
