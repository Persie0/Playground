package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class zs8 {

    /* JADX INFO: renamed from: a */
    public final String f72109a;

    /* JADX INFO: renamed from: b */
    public final int f72110b;

    /* JADX INFO: renamed from: c */
    public final String f72111c;

    public zs8(String str, int i, String str2) {
        this.f72109a = str;
        this.f72110b = i;
        this.f72111c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs8)) {
            return false;
        }
        zs8 zs8Var = (zs8) obj;
        return this.f72109a.equals(zs8Var.f72109a) && this.f72110b == zs8Var.f72110b && this.f72111c.equals(zs8Var.f72111c);
    }

    public final int hashCode() {
        return this.f72111c.hashCode() + wq1.m24106b(this.f72110b, this.f72109a.hashCode() * 31, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(AbstractC3393o1.m17741p(this.f72110b, "SearchSessionData(activeLanguage=", this.f72109a, ", activeLanguagePk=", ", dictionaryLocale="), this.f72111c, ")");
    }
}
