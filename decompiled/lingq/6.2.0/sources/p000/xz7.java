package p000;

import com.lingq.core.domain.model.token.TextTokenType;
import com.lingq.core.domain.model.token.TokenTransliteration;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes2.dex */
public final class xz7 {

    /* JADX INFO: renamed from: a */
    public int f69004a;

    /* JADX INFO: renamed from: b */
    public int f69005b;

    /* JADX INFO: renamed from: c */
    public final int f69006c;

    /* JADX INFO: renamed from: d */
    public final int f69007d;

    /* JADX INFO: renamed from: e */
    public final String f69008e;

    /* JADX INFO: renamed from: f */
    public final int f69009f;

    /* JADX INFO: renamed from: g */
    public final int f69010g;

    /* JADX INFO: renamed from: h */
    public final int f69011h;

    /* JADX INFO: renamed from: i */
    public String f69012i;

    /* JADX INFO: renamed from: j */
    public final TokenTransliteration f69013j;

    /* JADX INFO: renamed from: k */
    public final TextTokenType f69014k;

    /* JADX INFO: renamed from: l */
    public final int f69015l;

    /* JADX INFO: renamed from: m */
    public final int f69016m;

    /* JADX INFO: renamed from: n */
    public final Map f69017n;

    /* JADX INFO: renamed from: o */
    public final String f69018o;

    /* JADX INFO: renamed from: p */
    public final String f69019p;

    /* JADX INFO: renamed from: q */
    public final String f69020q;

    public /* synthetic */ xz7(int i, int i2, int i3, int i4, String str, int i5, int i6, int i7, String str2, TokenTransliteration tokenTransliteration, TextTokenType textTokenType, int i8, Map map, String str3, String str4, String str5, int i9) {
        this((i9 & 1) != 0 ? 0 : i, (i9 & 2) != 0 ? 0 : i2, (i9 & 4) != 0 ? 0 : i3, (i9 & 8) != 0 ? 0 : i4, str, (i9 & 32) != 0 ? 0 : i5, (i9 & 64) != 0 ? 0 : i6, (i9 & 128) != 0 ? 0 : i7, (i9 & 256) != 0 ? "" : str2, (i9 & 512) != 0 ? null : tokenTransliteration, (i9 & 1024) != 0 ? TextTokenType.WORD : textTokenType, (i9 & 2048) != 0 ? 0 : i8, 0, (i9 & 16384) != 0 ? AbstractC3194a.m15360M() : map, (32768 & i9) != 0 ? null : str3, (65536 & i9) != 0 ? null : str4, (i9 & 131072) != 0 ? null : str5);
    }

    /* JADX INFO: renamed from: a */
    public static xz7 m24797a(xz7 xz7Var, int i, int i2, int i3, int i4, int i5, LinkedHashMap linkedHashMap, String str, int i6) {
        int i7 = (i6 & 1) != 0 ? xz7Var.f69004a : i;
        int i8 = (i6 & 2) != 0 ? xz7Var.f69005b : i2;
        int i9 = (i6 & 4) != 0 ? xz7Var.f69006c : i3;
        int i10 = (i6 & 8) != 0 ? xz7Var.f69007d : i4;
        String str2 = xz7Var.f69008e;
        int i11 = xz7Var.f69009f;
        int i12 = xz7Var.f69010g;
        int i13 = xz7Var.f69011h;
        String str3 = xz7Var.f69012i;
        TokenTransliteration tokenTransliteration = xz7Var.f69013j;
        TextTokenType textTokenType = xz7Var.f69014k;
        int i14 = xz7Var.f69015l;
        int i15 = (i6 & 4096) != 0 ? xz7Var.f69016m : i5;
        Map map = (i6 & 16384) != 0 ? xz7Var.f69017n : linkedHashMap;
        String str4 = (i6 & 32768) != 0 ? xz7Var.f69018o : str;
        String str5 = xz7Var.f69019p;
        String str6 = xz7Var.f69020q;
        str2.getClass();
        str3.getClass();
        textTokenType.getClass();
        map.getClass();
        return new xz7(i7, i8, i9, i10, str2, i11, i12, i13, str3, tokenTransliteration, textTokenType, i14, i15, map, str4, str5, str6);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m24798b() {
        String str = this.f69008e;
        return vk9.m23380c0(vk9.m23376L0(str).toString(), " ", false) || vk9.m23380c0(vk9.m23376L0(str).toString(), "-", false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz7)) {
            return false;
        }
        xz7 xz7Var = (xz7) obj;
        return this.f69004a == xz7Var.f69004a && this.f69005b == xz7Var.f69005b && this.f69006c == xz7Var.f69006c && this.f69007d == xz7Var.f69007d && fa4.m11650l(this.f69008e, xz7Var.f69008e) && this.f69009f == xz7Var.f69009f && this.f69010g == xz7Var.f69010g && this.f69011h == xz7Var.f69011h && fa4.m11650l(this.f69012i, xz7Var.f69012i) && fa4.m11650l(this.f69013j, xz7Var.f69013j) && this.f69014k == xz7Var.f69014k && this.f69015l == xz7Var.f69015l && this.f69016m == xz7Var.f69016m && fa4.m11650l(this.f69017n, xz7Var.f69017n) && fa4.m11650l(this.f69018o, xz7Var.f69018o) && fa4.m11650l(this.f69019p, xz7Var.f69019p) && fa4.m11650l(this.f69020q, xz7Var.f69020q);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(wq1.m24106b(this.f69011h, wq1.m24106b(this.f69010g, wq1.m24106b(this.f69009f, ux5.m22980c(wq1.m24106b(this.f69007d, wq1.m24106b(this.f69006c, wq1.m24106b(this.f69005b, Integer.hashCode(this.f69004a) * 31, 31), 31), 31), this.f69008e, 31), 31), 31), 31), this.f69012i, 31);
        TokenTransliteration tokenTransliteration = this.f69013j;
        int iM10869a = e65.m10869a(g9a.m12428e(wq1.m24106b(this.f69016m, wq1.m24106b(this.f69015l, (this.f69014k.hashCode() + ((iM22980c + (tokenTransliteration == null ? 0 : tokenTransliteration.hashCode())) * 31)) * 31, 31), 31), 31, false), 31, this.f69017n);
        String str = this.f69018o;
        int iHashCode = (iM10869a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f69019p;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f69020q;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f69004a, this.f69005b, "TextToken(startIndex=", ", endIndex=", ", startSentenceIndex=");
        hn1.m13360j(this.f69006c, this.f69007d, ", endSentenceIndex=", ", text='", sbM22994q);
        AbstractC3393o1.m17748w(this.f69009f, this.f69008e, "', index=", ", sentenceIndex=", sbM22994q);
        sbM22994q.append(this.f69010g);
        sbM22994q.append(", indexInSentence=");
        sbM22994q.append(this.f69011h);
        sbM22994q.append(")");
        return sbM22994q.toString();
    }

    public xz7(int i, int i2, int i3, int i4, String str, int i5, int i6, int i7, String str2, TokenTransliteration tokenTransliteration, TextTokenType textTokenType, int i8, int i9, Map map, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        textTokenType.getClass();
        map.getClass();
        this.f69004a = i;
        this.f69005b = i2;
        this.f69006c = i3;
        this.f69007d = i4;
        this.f69008e = str;
        this.f69009f = i5;
        this.f69010g = i6;
        this.f69011h = i7;
        this.f69012i = str2;
        this.f69013j = tokenTransliteration;
        this.f69014k = textTokenType;
        this.f69015l = i8;
        this.f69016m = i9;
        this.f69017n = map;
        this.f69018o = str3;
        this.f69019p = str4;
        this.f69020q = str5;
    }
}
