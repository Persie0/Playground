package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class l91 {

    /* JADX INFO: renamed from: a */
    public final String f49324a;

    /* JADX INFO: renamed from: b */
    public final int f49325b;

    /* JADX INFO: renamed from: c */
    public final String f49326c;

    public l91(String str, int i, String str2) {
        str.getClass();
        str2.getClass();
        this.f49324a = str;
        this.f49325b = i;
        this.f49326c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l91)) {
            return false;
        }
        l91 l91Var = (l91) obj;
        return fa4.m11650l(this.f49324a, l91Var.f49324a) && this.f49325b == l91Var.f49325b && fa4.m11650l(this.f49326c, l91Var.f49326c);
    }

    public final int hashCode() {
        return this.f49326c.hashCode() + wq1.m24106b(this.f49325b, this.f49324a.hashCode() * 31, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(AbstractC3393o1.m17741p(this.f49325b, "CollectionSessionData(activeLanguage=", this.f49324a, ", activeLanguagePk=", ", dictionaryLocale="), this.f49326c, ")");
    }
}
