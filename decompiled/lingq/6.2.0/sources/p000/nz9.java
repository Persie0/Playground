package p000;

import com.lingq.core.domain.model.reader.ReaderPageMode;
import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import com.lingq.core.domain.store.AudioUnderlineMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public final class nz9 {

    /* JADX INFO: renamed from: a */
    public final int f53455a;

    /* JADX INFO: renamed from: b */
    public final double f53456b;

    /* JADX INFO: renamed from: c */
    public final List f53457c;

    /* JADX INFO: renamed from: d */
    public final ReaderFont f53458d;

    /* JADX INFO: renamed from: e */
    public final Pair f53459e;

    /* JADX INFO: renamed from: f */
    public final yz7 f53460f;

    /* JADX INFO: renamed from: g */
    public final vs3 f53461g;

    /* JADX INFO: renamed from: h */
    public final TextHighlightStyle f53462h;

    /* JADX INFO: renamed from: i */
    public final boolean f53463i;

    /* JADX INFO: renamed from: j */
    public final boolean f53464j;

    /* JADX INFO: renamed from: k */
    public final ReaderPageMode f53465k;

    /* JADX INFO: renamed from: l */
    public final boolean f53466l;

    /* JADX INFO: renamed from: m */
    public final boolean f53467m;

    /* JADX INFO: renamed from: n */
    public final boolean f53468n;

    /* JADX INFO: renamed from: o */
    public final boolean f53469o;

    /* JADX INFO: renamed from: p */
    public final boolean f53470p;

    /* JADX INFO: renamed from: q */
    public final AudioUnderlineMode f53471q;

    /* JADX INFO: renamed from: r */
    public final boolean f53472r;

    /* JADX INFO: renamed from: s */
    public final boolean f53473s;

    /* JADX INFO: renamed from: t */
    public final boolean f53474t;

    /* JADX INFO: renamed from: u */
    public final boolean f53475u;

    /* JADX INFO: renamed from: v */
    public final List f53476v;

    /* JADX INFO: renamed from: w */
    public final String f53477w;

    /* JADX INFO: renamed from: x */
    public final List f53478x;

    /* JADX INFO: renamed from: y */
    public final String f53479y;

    /* JADX WARN: Illegal instructions before constructor call */
    public nz9(int i, double d, ArrayList arrayList, ReaderFont readerFont, Pair pair, yz7 yz7Var, vs3 vs3Var, TextHighlightStyle textHighlightStyle, boolean z, boolean z2, ReaderPageMode readerPageMode, boolean z3, boolean z4, boolean z5, boolean z6, AudioUnderlineMode audioUnderlineMode, boolean z7, boolean z8, boolean z9, boolean z10, List list, String str, List list2, String str2, int i2) {
        int i3 = (i2 & 1) != 0 ? 21 : i;
        double d2 = (i2 & 2) != 0 ? 1.4d : d;
        List entries = (i2 & 4) != 0 ? ReaderFont.getEntries() : arrayList;
        ReaderFont readerFont2 = (i2 & 8) != 0 ? ReaderFont.DmSans : readerFont;
        Pair pair2 = (i2 & 16) != 0 ? null : pair;
        yz7 yz7Var2 = (i2 & 32) != 0 ? zz7.f72427b : yz7Var;
        vs3 vs3Var2 = (i2 & 64) != 0 ? zz7.f72431f : vs3Var;
        TextHighlightStyle textHighlightStyle2 = (i2 & 128) != 0 ? TextHighlightStyle.Default : textHighlightStyle;
        boolean z11 = (i2 & 256) != 0 ? false : z;
        boolean z12 = (i2 & 512) != 0 ? true : z2;
        ReaderPageMode readerPageMode2 = (i2 & 1024) != 0 ? ReaderPageMode.Standard : readerPageMode;
        boolean z13 = (i2 & 2048) != 0 ? false : z3;
        boolean z14 = (i2 & 8192) != 0 ? false : z4;
        boolean z15 = (i2 & 16384) != 0 ? false : z5;
        boolean z16 = (32768 & i2) != 0 ? false : z6;
        AudioUnderlineMode audioUnderlineMode2 = (65536 & i2) != 0 ? AudioUnderlineMode.Wave : audioUnderlineMode;
        boolean z17 = (131072 & i2) != 0 ? false : z7;
        boolean z18 = (262144 & i2) != 0 ? false : z8;
        boolean z19 = (524288 & i2) != 0 ? false : z9;
        boolean z20 = (1048576 & i2) != 0 ? false : z10;
        int i4 = 2097152 & i2;
        EmptyList emptyList = EmptyList.f47638a;
        this(i3, d2, entries, readerFont2, pair2, yz7Var2, vs3Var2, textHighlightStyle2, z11, z12, readerPageMode2, z13, true, z14, z15, z16, audioUnderlineMode2, z17, z18, z19, z20, i4 != 0 ? emptyList : list, (4194304 & i2) != 0 ? "" : str, (8388608 & i2) != 0 ? emptyList : list2, (i2 & 16777216) != 0 ? "" : str2);
    }

    /* JADX INFO: renamed from: a */
    public final ReaderFont m17708a() {
        return this.f53458d;
    }

    /* JADX INFO: renamed from: b */
    public final int m17709b() {
        return this.f53455a;
    }

    /* JADX INFO: renamed from: c */
    public final vs3 m17710c() {
        return this.f53461g;
    }

    /* JADX INFO: renamed from: d */
    public final double m17711d() {
        return this.f53456b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz9)) {
            return false;
        }
        nz9 nz9Var = (nz9) obj;
        return this.f53455a == nz9Var.f53455a && Double.compare(this.f53456b, nz9Var.f53456b) == 0 && fa4.m11650l(this.f53457c, nz9Var.f53457c) && this.f53458d == nz9Var.f53458d && fa4.m11650l(this.f53459e, nz9Var.f53459e) && fa4.m11650l(this.f53460f, nz9Var.f53460f) && fa4.m11650l(this.f53461g, nz9Var.f53461g) && this.f53462h == nz9Var.f53462h && this.f53463i == nz9Var.f53463i && this.f53464j == nz9Var.f53464j && this.f53465k == nz9Var.f53465k && this.f53466l == nz9Var.f53466l && this.f53467m == nz9Var.f53467m && this.f53468n == nz9Var.f53468n && this.f53469o == nz9Var.f53469o && this.f53470p == nz9Var.f53470p && this.f53471q == nz9Var.f53471q && this.f53472r == nz9Var.f53472r && this.f53473s == nz9Var.f53473s && this.f53474t == nz9Var.f53474t && this.f53475u == nz9Var.f53475u && fa4.m11650l(this.f53476v, nz9Var.f53476v) && fa4.m11650l(this.f53477w, nz9Var.f53477w) && fa4.m11650l(this.f53478x, nz9Var.f53478x) && fa4.m11650l(this.f53479y, nz9Var.f53479y);
    }

    public final int hashCode() {
        int iHashCode = (this.f53458d.hashCode() + ux5.m22979b(g9a.m12424a(this.f53456b, Integer.hashCode(this.f53455a) * 31, 31), 31, this.f53457c)) * 31;
        Pair pair = this.f53459e;
        return this.f53479y.hashCode() + ux5.m22979b(ux5.m22980c(ux5.m22979b(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e((this.f53471q.hashCode() + g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e((this.f53465k.hashCode() + g9a.m12428e(g9a.m12428e((this.f53462h.hashCode() + ((this.f53461g.hashCode() + ((this.f53460f.hashCode() + ((iHashCode + (pair == null ? 0 : pair.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.f53463i), 31, this.f53464j)) * 31, 31, this.f53466l), 31, this.f53467m), 31, this.f53468n), 31, this.f53469o), 31, this.f53470p)) * 31, 31, this.f53472r), 31, this.f53473s), 31, this.f53474t), 31, this.f53475u), 31, this.f53476v), this.f53477w, 31), 31, this.f53478x);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThemeSettingsState(fontSize=");
        sb.append(this.f53455a);
        sb.append(", lineHeight=");
        sb.append(this.f53456b);
        sb.append(", fonts=");
        sb.append(this.f53457c);
        sb.append(", fontSelected=");
        sb.append(this.f53458d);
        sb.append(", downloadProgress=");
        sb.append(this.f53459e);
        sb.append(", readerTheme=");
        sb.append(this.f53460f);
        sb.append(", highlightColorScheme=");
        sb.append(this.f53461g);
        sb.append(", textHighlightStyle=");
        sb.append(this.f53462h);
        sb.append(", warningScripting=");
        sb.append(this.f53463i);
        sb.append(", dockTokenPopup=");
        sb.append(this.f53464j);
        sb.append(", pageViewMode=");
        sb.append(this.f53465k);
        sb.append(", showSentenceTranslation=");
        sb.append(this.f53466l);
        sb.append(", showSentenceTranslationOption=");
        sb.append(this.f53467m);
        sb.append(", tapToPage=");
        sb.append(this.f53468n);
        sb.append(", statusBar=");
        sb.append(this.f53469o);
        sb.append(", showVocabulary=");
        sb.append(this.f53470p);
        sb.append(", audioUnderlineMode=");
        sb.append(this.f53471q);
        sb.append(", transliterationEnabled=");
        sb.append(this.f53472r);
        sb.append(", showSpacesBetweenWords=");
        sb.append(this.f53473s);
        sb.append(", hasScriptingLanguage=");
        sb.append(this.f53474t);
        sb.append(", hasNoSpacesLanguage=");
        sb.append(this.f53475u);
        sb.append(", transliterationOptions=");
        sb.append(this.f53476v);
        sb.append(", selectedTransliteration=");
        sb.append(this.f53477w);
        sb.append(", tokenTransliterationOptions=");
        sb.append(this.f53478x);
        return AbstractC3393o1.m17739n(sb, ", selectedTokenTransliteration=", this.f53479y, ")");
    }

    public nz9(int i, double d, List list, ReaderFont readerFont, Pair pair, yz7 yz7Var, vs3 vs3Var, TextHighlightStyle textHighlightStyle, boolean z, boolean z2, ReaderPageMode readerPageMode, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, AudioUnderlineMode audioUnderlineMode, boolean z8, boolean z9, boolean z10, boolean z11, List list2, String str, List list3, String str2) {
        list.getClass();
        readerFont.getClass();
        yz7Var.getClass();
        vs3Var.getClass();
        textHighlightStyle.getClass();
        readerPageMode.getClass();
        audioUnderlineMode.getClass();
        list2.getClass();
        str.getClass();
        list3.getClass();
        str2.getClass();
        this.f53455a = i;
        this.f53456b = d;
        this.f53457c = list;
        this.f53458d = readerFont;
        this.f53459e = pair;
        this.f53460f = yz7Var;
        this.f53461g = vs3Var;
        this.f53462h = textHighlightStyle;
        this.f53463i = z;
        this.f53464j = z2;
        this.f53465k = readerPageMode;
        this.f53466l = z3;
        this.f53467m = z4;
        this.f53468n = z5;
        this.f53469o = z6;
        this.f53470p = z7;
        this.f53471q = audioUnderlineMode;
        this.f53472r = z8;
        this.f53473s = z9;
        this.f53474t = z10;
        this.f53475u = z11;
        this.f53476v = list2;
        this.f53477w = str;
        this.f53478x = list3;
        this.f53479y = str2;
    }
}
