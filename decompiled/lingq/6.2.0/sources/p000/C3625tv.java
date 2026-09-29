package p000;

/* JADX INFO: renamed from: tv */
/* JADX INFO: loaded from: classes3.dex */
public final class C3625tv {

    /* JADX INFO: renamed from: a */
    public final String f62925a;

    /* JADX INFO: renamed from: b */
    public final boolean f62926b;

    /* JADX INFO: renamed from: c */
    public final boolean f62927c;

    /* JADX INFO: renamed from: d */
    public final String f62928d;

    /* JADX INFO: renamed from: e */
    public final String f62929e;

    /* JADX INFO: renamed from: f */
    public final String f62930f;

    /* JADX INFO: renamed from: g */
    public final String f62931g;

    /* JADX INFO: renamed from: h */
    public final String f62932h;

    /* JADX INFO: renamed from: i */
    public final String f62933i;

    /* JADX INFO: renamed from: j */
    public final String f62934j;

    /* JADX INFO: renamed from: k */
    public final String f62935k;

    /* JADX INFO: renamed from: l */
    public final String f62936l;

    /* JADX INFO: renamed from: m */
    public final String f62937m;

    public C3625tv(String str, boolean z, boolean z2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        ux5.m22975B(str2, str3, str4, str5, str6);
        ux5.m22975B(str7, str8, str9, str10, str11);
        this.f62925a = str;
        this.f62926b = z;
        this.f62927c = z2;
        this.f62928d = str2;
        this.f62929e = str3;
        this.f62930f = str4;
        this.f62931g = str5;
        this.f62932h = str6;
        this.f62933i = str7;
        this.f62934j = str8;
        this.f62935k = str9;
        this.f62936l = str10;
        this.f62937m = str11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3625tv)) {
            return false;
        }
        C3625tv c3625tv = (C3625tv) obj;
        return this.f62925a.equals(c3625tv.f62925a) && this.f62926b == c3625tv.f62926b && this.f62927c == c3625tv.f62927c && fa4.m11650l(this.f62928d, c3625tv.f62928d) && fa4.m11650l(this.f62929e, c3625tv.f62929e) && fa4.m11650l(this.f62930f, c3625tv.f62930f) && fa4.m11650l(this.f62931g, c3625tv.f62931g) && fa4.m11650l(this.f62932h, c3625tv.f62932h) && fa4.m11650l(this.f62933i, c3625tv.f62933i) && fa4.m11650l(this.f62934j, c3625tv.f62934j) && fa4.m11650l(this.f62935k, c3625tv.f62935k) && fa4.m11650l(this.f62936l, c3625tv.f62936l) && fa4.m11650l(this.f62937m, c3625tv.f62937m);
    }

    public final int hashCode() {
        return this.f62937m.hashCode() + ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(g9a.m12428e(g9a.m12428e(this.f62925a.hashCode() * 31, 31, this.f62926b), 31, this.f62927c), this.f62928d, 31), this.f62929e, 31), this.f62930f, 31), this.f62931g, 31), this.f62932h, 31), this.f62933i, 31), this.f62934j, 31), this.f62935k, 31), this.f62936l, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AsianScriptData(activeLanguage=");
        sb.append(this.f62925a);
        sb.append(", showSpacesBetweenWords=");
        sb.append(this.f62926b);
        sb.append(", transliterationStatus=");
        hn1.m13367q(", mandarinScript=", this.f62928d, ", japaneseScript=", sb, this.f62927c);
        AbstractC3393o1.m17725C(sb, this.f62929e, ", chineseTraditionalScript=", this.f62930f, ", cantoneseScript=");
        AbstractC3393o1.m17725C(sb, this.f62931g, ", latinScript=", this.f62932h, ", tokenMandarinScript=");
        AbstractC3393o1.m17725C(sb, this.f62933i, ", tokenJapaneseScript=", this.f62934j, ", tokenChineseTraditionalScript=");
        AbstractC3393o1.m17725C(sb, this.f62935k, ", tokenCantoneseScript=", this.f62936l, ", tokenLatinScript=");
        return AbstractC3393o1.m17738m(sb, this.f62937m, ")");
    }
}
