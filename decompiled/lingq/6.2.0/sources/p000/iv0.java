package p000;

import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public final class iv0 {

    /* JADX INFO: renamed from: a */
    public final List f44629a;

    /* JADX INFO: renamed from: b */
    public final int f44630b;

    /* JADX INFO: renamed from: c */
    public final String f44631c;

    /* JADX INFO: renamed from: d */
    public final String f44632d;

    /* JADX INFO: renamed from: e */
    public final double f44633e;

    /* JADX INFO: renamed from: f */
    public final String f44634f;

    /* JADX INFO: renamed from: g */
    public final String f44635g;

    /* JADX INFO: renamed from: h */
    public final String f44636h;

    /* JADX INFO: renamed from: i */
    public final String f44637i;

    /* JADX INFO: renamed from: j */
    public final List f44638j;

    /* JADX INFO: renamed from: k */
    public final Map f44639k;

    /* JADX INFO: renamed from: l */
    public final Map f44640l;

    /* JADX INFO: renamed from: m */
    public final boolean f44641m;

    /* JADX INFO: renamed from: n */
    public final String f44642n;

    public iv0(List list, int i, String str, String str2, double d, String str3, String str4, String str5, String str6, List list2, Map map, Map map2, boolean z, String str7) {
        list.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        list2.getClass();
        map.getClass();
        this.f44629a = list;
        this.f44630b = i;
        this.f44631c = str;
        this.f44632d = str2;
        this.f44633e = d;
        this.f44634f = str3;
        this.f44635g = str4;
        this.f44636h = str5;
        this.f44637i = str6;
        this.f44638j = list2;
        this.f44639k = map;
        this.f44640l = map2;
        this.f44641m = z;
        this.f44642n = str7;
    }

    /* JADX INFO: renamed from: a */
    public static iv0 m14155a(iv0 iv0Var, Map map, Map map2, boolean z, String str, int i) {
        List list = (i & 1) != 0 ? iv0Var.f44629a : EmptyList.f47638a;
        int i2 = iv0Var.f44630b;
        String str2 = iv0Var.f44631c;
        String str3 = iv0Var.f44632d;
        double d = iv0Var.f44633e;
        String str4 = iv0Var.f44634f;
        String str5 = iv0Var.f44635g;
        String str6 = iv0Var.f44636h;
        String str7 = iv0Var.f44637i;
        List list2 = iv0Var.f44638j;
        Map map3 = (i & 1024) != 0 ? iv0Var.f44639k : map;
        Map map4 = (i & 2048) != 0 ? iv0Var.f44640l : map2;
        boolean z2 = (i & 4096) != 0 ? iv0Var.f44641m : z;
        String str8 = (i & 8192) != 0 ? iv0Var.f44642n : str;
        list.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        list2.getClass();
        map3.getClass();
        map4.getClass();
        return new iv0(list, i2, str2, str3, d, str4, str5, str6, str7, list2, map3, map4, z2, str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv0)) {
            return false;
        }
        iv0 iv0Var = (iv0) obj;
        return fa4.m11650l(this.f44629a, iv0Var.f44629a) && this.f44630b == iv0Var.f44630b && fa4.m11650l(this.f44631c, iv0Var.f44631c) && fa4.m11650l(this.f44632d, iv0Var.f44632d) && Double.compare(this.f44633e, iv0Var.f44633e) == 0 && fa4.m11650l(this.f44634f, iv0Var.f44634f) && fa4.m11650l(this.f44635g, iv0Var.f44635g) && fa4.m11650l(this.f44636h, iv0Var.f44636h) && fa4.m11650l(this.f44637i, iv0Var.f44637i) && fa4.m11650l(this.f44638j, iv0Var.f44638j) && fa4.m11650l(this.f44639k, iv0Var.f44639k) && fa4.m11650l(this.f44640l, iv0Var.f44640l) && this.f44641m == iv0Var.f44641m && fa4.m11650l(this.f44642n, iv0Var.f44642n);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(e65.m10869a(e65.m10869a(ux5.m22979b(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(g9a.m12424a(this.f44633e, ux5.m22980c(ux5.m22980c(wq1.m24106b(this.f44630b, this.f44629a.hashCode() * 31, 31), this.f44631c, 31), this.f44632d, 31), 31), this.f44634f, 31), this.f44635g, 31), this.f44636h, 31), this.f44637i, 31), 31, this.f44638j), 31, this.f44639k), 31, this.f44640l), 31, this.f44641m);
        String str = this.f44642n;
        return iM12428e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chat(messages=");
        sb.append(this.f44629a);
        sb.append(", chatId=");
        sb.append(this.f44630b);
        sb.append(", title=");
        AbstractC3393o1.m17725C(sb, this.f44631c, ", image=", this.f44632d, ", coins=");
        sb.append(this.f44633e);
        sb.append(", targetLanguage=");
        sb.append(this.f44634f);
        AbstractC3393o1.m17725C(sb, ", dictionaryLanguage=", this.f44635g, ", startedAt=", this.f44636h);
        sb.append(", updatedAt=");
        sb.append(this.f44637i);
        sb.append(", chatHistory=");
        sb.append(this.f44638j);
        sb.append(", translationState=");
        sb.append(this.f44639k);
        sb.append(", phrasesState=");
        sb.append(this.f44640l);
        sb.append(", isLoadingMessage=");
        sb.append(this.f44641m);
        sb.append(", streamingText=");
        sb.append(this.f44642n);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ iv0(int i) {
        Map mapM15360M = AbstractC3194a.m15360M();
        Map mapM15360M2 = AbstractC3194a.m15360M();
        boolean z = (i & 4096) == 0;
        EmptyList emptyList = EmptyList.f47638a;
        this(emptyList, -1, "", "", 0.0d, "", "", "", "", emptyList, mapM15360M, mapM15360M2, z, null);
    }
}
