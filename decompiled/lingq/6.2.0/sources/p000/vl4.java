package p000;

/* JADX INFO: loaded from: classes.dex */
public final class vl4 {

    /* JADX INFO: renamed from: a */
    public final String f65560a;

    /* JADX INFO: renamed from: b */
    public final String f65561b;

    public vl4(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f65560a = str;
        this.f65561b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl4)) {
            return false;
        }
        vl4 vl4Var = (vl4) obj;
        return fa4.m11650l(this.f65560a, vl4Var.f65560a) && fa4.m11650l(this.f65561b, vl4Var.f65561b);
    }

    public final int hashCode() {
        return this.f65561b.hashCode() + (this.f65560a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("LanguageDictionaryLocaleJoin(language=", this.f65560a, ", code=", this.f65561b, ")");
    }
}
