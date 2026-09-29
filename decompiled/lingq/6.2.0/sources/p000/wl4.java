package p000;

/* JADX INFO: loaded from: classes.dex */
public final class wl4 {

    /* JADX INFO: renamed from: a */
    public final String f66998a;

    /* JADX INFO: renamed from: b */
    public final Integer f66999b;

    /* JADX INFO: renamed from: c */
    public final Boolean f67000c;

    /* JADX INFO: renamed from: d */
    public final String f67001d;

    /* JADX INFO: renamed from: e */
    public final String f67002e;

    /* JADX INFO: renamed from: f */
    public final Integer f67003f;

    /* JADX INFO: renamed from: g */
    public final String f67004g;

    /* JADX INFO: renamed from: h */
    public final String f67005h;

    /* JADX INFO: renamed from: i */
    public final Boolean f67006i;

    public wl4(String str, Integer num, Boolean bool, String str2, String str3, Integer num2, String str4, String str5, Boolean bool2) {
        str.getClass();
        this.f66998a = str;
        this.f66999b = num;
        this.f67000c = bool;
        this.f67001d = str2;
        this.f67002e = str3;
        this.f67003f = num2;
        this.f67004g = str4;
        this.f67005h = str5;
        this.f67006i = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl4)) {
            return false;
        }
        wl4 wl4Var = (wl4) obj;
        return fa4.m11650l(this.f66998a, wl4Var.f66998a) && fa4.m11650l(this.f66999b, wl4Var.f66999b) && fa4.m11650l(this.f67000c, wl4Var.f67000c) && fa4.m11650l(this.f67001d, wl4Var.f67001d) && fa4.m11650l(this.f67002e, wl4Var.f67002e) && this.f67003f.equals(wl4Var.f67003f) && fa4.m11650l(this.f67004g, wl4Var.f67004g) && fa4.m11650l(this.f67005h, wl4Var.f67005h) && fa4.m11650l(this.f67006i, wl4Var.f67006i);
    }

    public final int hashCode() {
        int iHashCode = this.f66998a.hashCode() * 31;
        Integer num = this.f66999b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f67000c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f67001d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f67002e;
        int iHashCode5 = (this.f67003f.hashCode() + ((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.f67004g;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f67005h;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.f67006i;
        return iHashCode7 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LanguageEntity(code=");
        sb.append(this.f66998a);
        sb.append(", id=");
        sb.append(this.f66999b);
        sb.append(", supported=");
        sb.append(this.f67000c);
        sb.append(", title=");
        sb.append(this.f67001d);
        sb.append(", lastUsed=");
        hn1.m13371u(sb, this.f67002e, ", knownWords=", this.f67003f, ", dictionaryLocaleActive=");
        AbstractC3393o1.m17725C(sb, this.f67004g, ", grammarResourceSlug=", this.f67005h, ", scheduledForDeletion=");
        sb.append(this.f67006i);
        sb.append(")");
        return sb.toString();
    }
}
