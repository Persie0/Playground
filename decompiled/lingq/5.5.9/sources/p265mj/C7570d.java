package p265mj;

import android.support.v4.media.session.C0166e;
import com.kochava.tracker.BuildConfig;
import com.lingq.p055ui.lesson.page.data.TextTokenType;
import com.lingq.p055ui.token.TokenTransliteration;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: mj.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C7570d {

    /* JADX INFO: renamed from: a */
    public int f41721a;

    /* JADX INFO: renamed from: b */
    public int f41722b;

    /* JADX INFO: renamed from: c */
    public final int f41723c;

    /* JADX INFO: renamed from: d */
    public final int f41724d;

    /* JADX INFO: renamed from: e */
    public final String f41725e;

    /* JADX INFO: renamed from: f */
    public final int f41726f;

    /* JADX INFO: renamed from: g */
    public final int f41727g;

    /* JADX INFO: renamed from: h */
    public final int f41728h;

    /* JADX INFO: renamed from: i */
    public String f41729i;

    /* JADX INFO: renamed from: j */
    public final TokenTransliteration f41730j;

    /* JADX INFO: renamed from: k */
    public final TextTokenType f41731k;

    /* JADX INFO: renamed from: l */
    public final int f41732l;

    /* JADX INFO: renamed from: m */
    public int f41733m;

    /* JADX INFO: renamed from: n */
    public final boolean f41734n;

    public /* synthetic */ C7570d(int i10, int i11, int i12, int i13, String str, int i14, int i15, int i16, String str2, TokenTransliteration tokenTransliteration, TextTokenType textTokenType, int i17, int i18) {
        this((i18 & 1) != 0 ? 0 : i10, (i18 & 2) != 0 ? 0 : i11, (i18 & 4) != 0 ? 0 : i12, (i18 & 8) != 0 ? 0 : i13, str, (i18 & 32) != 0 ? 0 : i14, (i18 & 64) != 0 ? 0 : i15, (i18 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? 0 : i16, (i18 & 256) != 0 ? "" : str2, (i18 & 512) != 0 ? null : tokenTransliteration, (i18 & 1024) != 0 ? TextTokenType.WORD : textTokenType, (i18 & 2048) != 0 ? 0 : i17, 0, false);
    }

    public C7570d(int i10, int i11, int i12, int i13, String str, int i14, int i15, int i16, String str2, TokenTransliteration tokenTransliteration, TextTokenType textTokenType, int i17, int i18, boolean z10) {
        C5207g.m11111f(str, "text");
        C5207g.m11111f(str2, "scriptToUse");
        C5207g.m11111f(textTokenType, "type");
        this.f41721a = i10;
        this.f41722b = i11;
        this.f41723c = i12;
        this.f41724d = i13;
        this.f41725e = str;
        this.f41726f = i14;
        this.f41727g = i15;
        this.f41728h = i16;
        this.f41729i = str2;
        this.f41730j = tokenTransliteration;
        this.f41731k = textTokenType;
        this.f41732l = i17;
        this.f41733m = i18;
        this.f41734n = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7570d)) {
            return false;
        }
        C7570d c7570d = (C7570d) obj;
        return this.f41721a == c7570d.f41721a && this.f41722b == c7570d.f41722b && this.f41723c == c7570d.f41723c && this.f41724d == c7570d.f41724d && C5207g.m11106a(this.f41725e, c7570d.f41725e) && this.f41726f == c7570d.f41726f && this.f41727g == c7570d.f41727g && this.f41728h == c7570d.f41728h && C5207g.m11106a(this.f41729i, c7570d.f41729i) && C5207g.m11106a(this.f41730j, c7570d.f41730j) && this.f41731k == c7570d.f41731k && this.f41732l == c7570d.f41732l && this.f41733m == c7570d.f41733m && this.f41734n == c7570d.f41734n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v20 */
    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f41729i, C0009a.m16d(this.f41728h, C0009a.m16d(this.f41727g, C0009a.m16d(this.f41726f, C0166e.m758d(this.f41725e, C0009a.m16d(this.f41724d, C0009a.m16d(this.f41723c, C0009a.m16d(this.f41722b, Integer.hashCode(this.f41721a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        TokenTransliteration tokenTransliteration = this.f41730j;
        int iM16d = C0009a.m16d(this.f41733m, C0009a.m16d(this.f41732l, (this.f41731k.hashCode() + ((iM758d + (tokenTransliteration == null ? 0 : tokenTransliteration.hashCode())) * 31)) * 31, 31), 31);
        boolean z10 = this.f41734n;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iM16d + r10;
    }

    public final String toString() {
        StringBuilder sbM25n = C0009a.m25n("TextToken(startIndex=", this.f41721a, ", endIndex=", this.f41722b, ", startSentenceIndex=");
        sbM25n.append(this.f41723c);
        sbM25n.append(", endSentenceIndex=");
        sbM25n.append(this.f41724d);
        sbM25n.append(", text='");
        sbM25n.append(this.f41725e);
        sbM25n.append("', index=");
        sbM25n.append(this.f41726f);
        sbM25n.append(", sentenceIndex=");
        sbM25n.append(this.f41727g);
        sbM25n.append(", indexInSentence=");
        return C0166e.m768o(sbM25n, this.f41728h, ")");
    }
}
