package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class g42 extends tad {

    /* JADX INFO: renamed from: a */
    public final String f40162a;

    /* JADX INFO: renamed from: b */
    public final String f40163b;

    public g42(String str, String str2) {
        this.f40162a = str;
        this.f40163b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g42)) {
            return false;
        }
        g42 g42Var = (g42) obj;
        return fa4.m11650l(this.f40162a, g42Var.f40162a) && fa4.m11650l(this.f40163b, g42Var.f40163b);
    }

    public final int hashCode() {
        String str = this.f40162a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f40163b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ux5.m22991n("LanguageStats(language=", this.f40162a, ", interfaceLanguage=", this.f40163b, ")");
    }
}
