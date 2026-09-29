package p000;

import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import com.lingq.core.domain.store.AudioUnderlineMode;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public final class jt3 {

    /* JADX INFO: renamed from: a */
    public final int f46103a;

    /* JADX INFO: renamed from: b */
    public final String f46104b;

    /* JADX INFO: renamed from: c */
    public final List f46105c;

    /* JADX INFO: renamed from: d */
    public final List f46106d;

    /* JADX INFO: renamed from: e */
    public final d87 f46107e;

    /* JADX INFO: renamed from: f */
    public final boolean f46108f;

    /* JADX INFO: renamed from: g */
    public final TextHighlightStyle f46109g;

    /* JADX INFO: renamed from: h */
    public final vs3 f46110h;

    /* JADX INFO: renamed from: i */
    public final Integer f46111i;

    /* JADX INFO: renamed from: j */
    public final Integer f46112j;

    /* JADX INFO: renamed from: k */
    public final boolean f46113k;

    /* JADX INFO: renamed from: l */
    public final int f46114l;

    /* JADX INFO: renamed from: m */
    public final double f46115m;

    /* JADX INFO: renamed from: n */
    public final ReaderFont f46116n;

    /* JADX INFO: renamed from: o */
    public final String f46117o;

    /* JADX INFO: renamed from: p */
    public final boolean f46118p;

    /* JADX INFO: renamed from: q */
    public final boolean f46119q;

    /* JADX INFO: renamed from: r */
    public final Map f46120r;

    /* JADX INFO: renamed from: s */
    public final boolean f46121s;

    /* JADX INFO: renamed from: t */
    public final f00 f46122t;

    /* JADX INFO: renamed from: u */
    public final AudioUnderlineMode f46123u;

    /* JADX INFO: renamed from: v */
    public final boolean f46124v;

    /* JADX INFO: renamed from: w */
    public final Map f46125w;

    /* JADX INFO: renamed from: x */
    public final float f46126x;

    public jt3(int i, String str, List list, List list2, d87 d87Var, boolean z, TextHighlightStyle textHighlightStyle, vs3 vs3Var, Integer num, Integer num2, boolean z2, int i2, double d, ReaderFont readerFont, String str2, boolean z3, boolean z4, Map map, boolean z5, f00 f00Var, AudioUnderlineMode audioUnderlineMode, Map map2, float f, int i3) {
        List list3 = (i3 & 8) != 0 ? EmptyList.f47638a : list2;
        d87 d87Var2 = (i3 & 16) != 0 ? null : d87Var;
        boolean z6 = (i3 & 32) != 0 ? false : z;
        TextHighlightStyle textHighlightStyle2 = (i3 & 64) != 0 ? TextHighlightStyle.Default : textHighlightStyle;
        Integer num3 = (i3 & 256) != 0 ? null : num;
        Integer num4 = (i3 & 512) != 0 ? null : num2;
        boolean z7 = (65536 & i3) != 0 ? false : z4;
        Map mapM15360M = (131072 & i3) != 0 ? AbstractC3194a.m15360M() : map;
        boolean z8 = (262144 & i3) != 0 ? false : z5;
        f00 f00Var2 = (524288 & i3) == 0 ? f00Var : null;
        AudioUnderlineMode audioUnderlineMode2 = (1048576 & i3) != 0 ? AudioUnderlineMode.Wave : audioUnderlineMode;
        boolean z9 = (2097152 & i3) != 0;
        Map mapM15360M2 = (4194304 & i3) != 0 ? AbstractC3194a.m15360M() : map2;
        float f2 = (i3 & 8388608) != 0 ? 1.0f : f;
        str.getClass();
        list.getClass();
        list3.getClass();
        textHighlightStyle2.getClass();
        vs3Var.getClass();
        readerFont.getClass();
        str2.getClass();
        mapM15360M.getClass();
        audioUnderlineMode2.getClass();
        this.f46103a = i;
        this.f46104b = str;
        this.f46105c = list;
        this.f46106d = list3;
        this.f46107e = d87Var2;
        this.f46108f = z6;
        this.f46109g = textHighlightStyle2;
        this.f46110h = vs3Var;
        this.f46111i = num3;
        this.f46112j = num4;
        this.f46113k = z2;
        this.f46114l = i2;
        this.f46115m = d;
        this.f46116n = readerFont;
        this.f46117o = str2;
        this.f46118p = z3;
        this.f46119q = z7;
        this.f46120r = mapM15360M;
        this.f46121s = z8;
        this.f46122t = f00Var2;
        this.f46123u = audioUnderlineMode2;
        this.f46124v = z9;
        this.f46125w = mapM15360M2;
        this.f46126x = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt3)) {
            return false;
        }
        jt3 jt3Var = (jt3) obj;
        return this.f46103a == jt3Var.f46103a && fa4.m11650l(this.f46104b, jt3Var.f46104b) && fa4.m11650l(this.f46105c, jt3Var.f46105c) && fa4.m11650l(this.f46106d, jt3Var.f46106d) && fa4.m11650l(this.f46107e, jt3Var.f46107e) && this.f46108f == jt3Var.f46108f && this.f46109g == jt3Var.f46109g && fa4.m11650l(this.f46110h, jt3Var.f46110h) && fa4.m11650l(this.f46111i, jt3Var.f46111i) && fa4.m11650l(this.f46112j, jt3Var.f46112j) && this.f46113k == jt3Var.f46113k && this.f46114l == jt3Var.f46114l && Double.compare(this.f46115m, jt3Var.f46115m) == 0 && this.f46116n == jt3Var.f46116n && fa4.m11650l(this.f46117o, jt3Var.f46117o) && this.f46118p == jt3Var.f46118p && this.f46119q == jt3Var.f46119q && fa4.m11650l(this.f46120r, jt3Var.f46120r) && this.f46121s == jt3Var.f46121s && fa4.m11650l(this.f46122t, jt3Var.f46122t) && this.f46123u == jt3Var.f46123u && this.f46124v == jt3Var.f46124v && fa4.m11650l(this.f46125w, jt3Var.f46125w) && Float.compare(this.f46126x, jt3Var.f46126x) == 0;
    }

    public final int hashCode() {
        int iM22979b = ux5.m22979b(ux5.m22979b(ux5.m22980c(Integer.hashCode(this.f46103a) * 31, this.f46104b, 31), 31, this.f46105c), 31, this.f46106d);
        d87 d87Var = this.f46107e;
        int iHashCode = (this.f46110h.hashCode() + ((this.f46109g.hashCode() + g9a.m12428e((iM22979b + (d87Var == null ? 0 : d87Var.hashCode())) * 31, 31, this.f46108f)) * 31)) * 31;
        Integer num = this.f46111i;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f46112j;
        int iM12428e = g9a.m12428e(e65.m10869a(g9a.m12428e(g9a.m12428e(ux5.m22980c((this.f46116n.hashCode() + g9a.m12424a(this.f46115m, wq1.m24106b(this.f46114l, g9a.m12428e((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f46113k), 31), 31)) * 31, this.f46117o, 31), 31, this.f46118p), 31, this.f46119q), 31, this.f46120r), 31, this.f46121s);
        f00 f00Var = this.f46122t;
        return Float.hashCode(this.f46126x) + e65.m10869a(g9a.m12428e((this.f46123u.hashCode() + ((iM12428e + (f00Var != null ? f00Var.hashCode() : 0)) * 31)) * 31, 31, this.f46124v), 31, this.f46125w);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f46103a, "HighlightedTextState(id=", ", text=", this.f46104b, ", spans=");
        hn1.m13372v(sbM22995r, this.f46105c, ", phraseSpans=", this.f46106d, ", relatedPhraseSpan=");
        sbM22995r.append(this.f46107e);
        sbM22995r.append(", isRelatedPhraseSelected=");
        sbM22995r.append(this.f46108f);
        sbM22995r.append(", highlightStyle=");
        sbM22995r.append(this.f46109g);
        sbM22995r.append(", colorScheme=");
        sbM22995r.append(this.f46110h);
        sbM22995r.append(", activeTappedWordIndex=");
        e65.m10883o(sbM22995r, this.f46111i, ", activeTappedPhraseIndex=", this.f46112j, ", canSelectText=");
        hn1.m13373w(sbM22995r, this.f46113k, ", fontSize=", this.f46114l, ", lineHeight=");
        sbM22995r.append(this.f46115m);
        sbM22995r.append(", font=");
        sbM22995r.append(this.f46116n);
        sbM22995r.append(", language=");
        sbM22995r.append(this.f46117o);
        sbM22995r.append(", isRtl=");
        sbM22995r.append(this.f46118p);
        sbM22995r.append(", showSentenceTranslations=");
        sbM22995r.append(this.f46119q);
        sbM22995r.append(", sentenceTranslations=");
        sbM22995r.append(this.f46120r);
        sbM22995r.append(", shouldResetSelection=");
        sbM22995r.append(this.f46121s);
        sbM22995r.append(", audioWave=");
        sbM22995r.append(this.f46122t);
        sbM22995r.append(", audioUnderlineMode=");
        sbM22995r.append(this.f46123u);
        sbM22995r.append(", fillWidth=");
        sbM22995r.append(this.f46124v);
        sbM22995r.append(", imageUrlsByPlaceholder=");
        sbM22995r.append(this.f46125w);
        sbM22995r.append(", revealFraction=");
        sbM22995r.append(this.f46126x);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }
}
