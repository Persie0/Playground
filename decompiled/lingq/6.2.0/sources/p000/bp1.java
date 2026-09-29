package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class bp1 {

    /* JADX INFO: renamed from: a */
    public final int f8781a;

    /* JADX INFO: renamed from: b */
    public final String f8782b;

    public bp1(int i, String str) {
        str.getClass();
        this.f8781a = i;
        this.f8782b = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m4026a() {
        return this.f8782b;
    }

    /* JADX INFO: renamed from: b */
    public final int m4027b() {
        return this.f8781a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp1)) {
            return false;
        }
        bp1 bp1Var = (bp1) obj;
        return this.f8781a == bp1Var.f8781a && fa4.m11650l(this.f8782b, bp1Var.f8782b);
    }

    public final int hashCode() {
        return this.f8782b.hashCode() + (Integer.hashCode(this.f8781a) * 31);
    }

    public final String toString() {
        return hn1.m13354d(this.f8781a, "CoursesAndLanguageJoin(pk=", ", language=", this.f8782b, ")");
    }
}
