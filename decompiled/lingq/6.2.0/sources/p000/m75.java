package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class m75 {

    /* JADX INFO: renamed from: a */
    public final int f50711a;

    /* JADX INFO: renamed from: b */
    public final String f50712b;

    public m75(int i, String str) {
        str.getClass();
        this.f50711a = i;
        this.f50712b = str;
    }

    /* JADX INFO: renamed from: a */
    public final int m16665a() {
        return this.f50711a;
    }

    /* JADX INFO: renamed from: b */
    public final String m16666b() {
        return this.f50712b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m75)) {
            return false;
        }
        m75 m75Var = (m75) obj;
        return this.f50711a == m75Var.f50711a && fa4.m11650l(this.f50712b, m75Var.f50712b);
    }

    public final int hashCode() {
        return this.f50712b.hashCode() + (Integer.hashCode(this.f50711a) * 31);
    }

    public final String toString() {
        return hn1.m13354d(this.f50711a, "LessonsAndWordsJoin(contentId=", ", termWithLanguage=", this.f50712b, ")");
    }
}
