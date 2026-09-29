package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class m99 {

    /* JADX INFO: renamed from: a */
    public final String f50816a;

    /* JADX INFO: renamed from: b */
    public final int f50817b;

    /* JADX INFO: renamed from: c */
    public final String f50818c;

    public m99(String str, int i, String str2) {
        this.f50816a = str;
        this.f50817b = i;
        this.f50818c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m99)) {
            return false;
        }
        m99 m99Var = (m99) obj;
        return this.f50816a.equals(m99Var.f50816a) && this.f50817b == m99Var.f50817b && this.f50818c.equals(m99Var.f50818c);
    }

    public final int hashCode() {
        return this.f50818c.hashCode() + wq1.m24106b(this.f50817b, this.f50816a.hashCode() * 31, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(AbstractC3393o1.m17741p(this.f50817b, "SkillOption(value=", this.f50816a, ", displayTextRes=", ", emoji="), this.f50818c, ")");
    }
}
