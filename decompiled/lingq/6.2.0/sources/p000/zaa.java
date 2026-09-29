package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class zaa {

    /* JADX INFO: renamed from: a */
    public final String f71294a;

    /* JADX INFO: renamed from: b */
    public final String f71295b;

    public zaa(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f71294a = str;
        this.f71295b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaa)) {
            return false;
        }
        zaa zaaVar = (zaa) obj;
        return fa4.m11650l(this.f71294a, zaaVar.f71294a) && fa4.m11650l(this.f71295b, zaaVar.f71295b);
    }

    public final int hashCode() {
        return this.f71295b.hashCode() + (this.f71294a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("TranslationItem(language=", this.f71294a, ", text=", this.f71295b, ")");
    }
}
