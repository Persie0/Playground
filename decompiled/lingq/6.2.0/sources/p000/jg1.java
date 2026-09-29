package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class jg1 {

    /* JADX INFO: renamed from: a */
    public final String f45512a;

    /* JADX INFO: renamed from: b */
    public final int f45513b;

    /* JADX INFO: renamed from: c */
    public final String f45514c;

    public jg1(String str, int i, String str2) {
        this.f45512a = str;
        this.f45513b = i;
        this.f45514c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg1)) {
            return false;
        }
        jg1 jg1Var = (jg1) obj;
        return this.f45512a.equals(jg1Var.f45512a) && this.f45513b == jg1Var.f45513b && this.f45514c.equals(jg1Var.f45514c);
    }

    public final int hashCode() {
        return this.f45514c.hashCode() + wq1.m24106b(this.f45513b, this.f45512a.hashCode() * 31, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(AbstractC3393o1.m17741p(this.f45513b, "ConfidenceOption(value=", this.f45512a, ", displayTextRes=", ", emoji="), this.f45514c, ")");
    }
}
