package p000;

import com.lingq.core.domain.model.token.TokenMeaning;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lf2 {

    /* JADX INFO: renamed from: a */
    public final zf2 f49582a;

    /* JADX INFO: renamed from: b */
    public final String f49583b;

    /* JADX INFO: renamed from: c */
    public final boolean f49584c;

    /* JADX INFO: renamed from: d */
    public final String f49585d;

    /* JADX INFO: renamed from: e */
    public final Boolean f49586e;

    /* JADX INFO: renamed from: f */
    public final List f49587f;

    /* JADX INFO: renamed from: g */
    public final boolean f49588g;

    /* JADX INFO: renamed from: h */
    public final TokenMeaning f49589h;

    public lf2(zf2 zf2Var, String str, boolean z, String str2, Boolean bool, List list, boolean z2, TokenMeaning tokenMeaning) {
        list.getClass();
        this.f49582a = zf2Var;
        this.f49583b = str;
        this.f49584c = z;
        this.f49585d = str2;
        this.f49586e = bool;
        this.f49587f = list;
        this.f49588g = z2;
        this.f49589h = tokenMeaning;
    }

    /* JADX INFO: renamed from: a */
    public static lf2 m16158a(lf2 lf2Var, zf2 zf2Var, String str, boolean z, String str2, Boolean bool, ArrayList arrayList, boolean z2, TokenMeaning tokenMeaning, int i) {
        if ((i & 1) != 0) {
            zf2Var = lf2Var.f49582a;
        }
        zf2 zf2Var2 = zf2Var;
        if ((i & 2) != 0) {
            str = lf2Var.f49583b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            z = lf2Var.f49584c;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            str2 = lf2Var.f49585d;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            bool = lf2Var.f49586e;
        }
        Boolean bool2 = bool;
        List list = arrayList;
        if ((i & 32) != 0) {
            list = lf2Var.f49587f;
        }
        List list2 = list;
        boolean z4 = (i & 64) != 0 ? lf2Var.f49588g : z2;
        TokenMeaning tokenMeaning2 = (i & 128) != 0 ? lf2Var.f49589h : tokenMeaning;
        lf2Var.getClass();
        str4.getClass();
        list2.getClass();
        return new lf2(zf2Var2, str3, z3, str4, bool2, list2, z4, tokenMeaning2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf2)) {
            return false;
        }
        lf2 lf2Var = (lf2) obj;
        return fa4.m11650l(this.f49582a, lf2Var.f49582a) && this.f49583b.equals(lf2Var.f49583b) && this.f49584c == lf2Var.f49584c && this.f49585d.equals(lf2Var.f49585d) && fa4.m11650l(this.f49586e, lf2Var.f49586e) && fa4.m11650l(this.f49587f, lf2Var.f49587f) && this.f49588g == lf2Var.f49588g && fa4.m11650l(this.f49589h, lf2Var.f49589h);
    }

    public final int hashCode() {
        zf2 zf2Var = this.f49582a;
        int iM22980c = ux5.m22980c(g9a.m12428e(ux5.m22980c((zf2Var == null ? 0 : zf2Var.hashCode()) * 31, this.f49583b, 31), 31, this.f49584c), this.f49585d, 31);
        Boolean bool = this.f49586e;
        int iM12428e = g9a.m12428e(ux5.m22979b((iM22980c + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f49587f), 31, this.f49588g);
        TokenMeaning tokenMeaning = this.f49589h;
        return iM12428e + (tokenMeaning != null ? tokenMeaning.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DictionaryContentUiState(dictionary=");
        sb.append(this.f49582a);
        sb.append(", term=");
        sb.append(this.f49583b);
        sb.append(", isLoading=");
        hn1.m13367q(", hintText=", this.f49585d, ", hasTTS=", sb, this.f49584c);
        sb.append(this.f49586e);
        sb.append(", activeDictionaries=");
        sb.append(this.f49587f);
        sb.append(", shouldDismiss=");
        sb.append(this.f49588g);
        sb.append(", meaningToReturn=");
        sb.append(this.f49589h);
        sb.append(")");
        return sb.toString();
    }
}
