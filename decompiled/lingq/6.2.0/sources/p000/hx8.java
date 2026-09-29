package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hx8 {

    /* JADX INFO: renamed from: a */
    public final int f43120a;

    /* JADX INFO: renamed from: b */
    public final String f43121b;

    /* JADX INFO: renamed from: c */
    public final boolean f43122c;

    /* JADX INFO: renamed from: d */
    public final boolean f43123d;

    /* JADX INFO: renamed from: e */
    public final float f43124e;

    /* JADX INFO: renamed from: f */
    public final boolean f43125f;

    /* JADX INFO: renamed from: g */
    public final String f43126g;

    /* JADX INFO: renamed from: h */
    public final boolean f43127h;

    /* JADX INFO: renamed from: i */
    public final String f43128i;

    /* JADX INFO: renamed from: j */
    public final int f43129j;

    /* JADX INFO: renamed from: k */
    public final boolean f43130k;

    /* JADX INFO: renamed from: l */
    public final List f43131l;

    /* JADX INFO: renamed from: m */
    public final boolean f43132m;

    /* JADX INFO: renamed from: n */
    public final boolean f43133n;

    public hx8(int i, String str, boolean z, boolean z2, float f, boolean z3, String str2, boolean z4, String str3, int i2, boolean z5, List list, boolean z6, boolean z7) {
        str3.getClass();
        this.f43120a = i;
        this.f43121b = str;
        this.f43122c = z;
        this.f43123d = z2;
        this.f43124e = f;
        this.f43125f = z3;
        this.f43126g = str2;
        this.f43127h = z4;
        this.f43128i = str3;
        this.f43129j = i2;
        this.f43130k = z5;
        this.f43131l = list;
        this.f43132m = z6;
        this.f43133n = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx8)) {
            return false;
        }
        hx8 hx8Var = (hx8) obj;
        return this.f43120a == hx8Var.f43120a && this.f43121b.equals(hx8Var.f43121b) && this.f43122c == hx8Var.f43122c && this.f43123d == hx8Var.f43123d && Float.compare(this.f43124e, hx8Var.f43124e) == 0 && this.f43125f == hx8Var.f43125f && this.f43126g.equals(hx8Var.f43126g) && this.f43127h == hx8Var.f43127h && fa4.m11650l(this.f43128i, hx8Var.f43128i) && this.f43129j == hx8Var.f43129j && this.f43130k == hx8Var.f43130k && this.f43131l.equals(hx8Var.f43131l) && this.f43132m == hx8Var.f43132m && this.f43133n == hx8Var.f43133n;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43133n) + g9a.m12428e(ux5.m22979b(g9a.m12428e(wq1.m24106b(this.f43129j, ux5.m22980c(g9a.m12428e(ux5.m22980c(g9a.m12428e(wq1.m24105a(g9a.m12428e(g9a.m12428e(ux5.m22980c(Integer.hashCode(this.f43120a) * 31, this.f43121b, 31), 31, this.f43122c), 31, this.f43123d), this.f43124e, 31), 31, this.f43125f), this.f43126g, 31), 31, this.f43127h), this.f43128i, 31), 31), 31, this.f43130k), 31, this.f43131l), 31, this.f43132m);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f43120a, "SentenceModeState(sentenceIndex=", ", sentenceText=", this.f43121b, ", isPlaying=");
        wq1.m24101A(sbM22995r, this.f43122c, ", isLoading=", this.f43123d, ", playbackSpeed=");
        sbM22995r.append(this.f43124e);
        sbM22995r.append(", showTranslation=");
        sbM22995r.append(this.f43125f);
        sbM22995r.append(", translationText=");
        ux5.m22976C(this.f43126g, ", translationLoading=", ", notesText=", sbM22995r, this.f43127h);
        AbstractC3393o1.m17748w(this.f43129j, this.f43128i, ", notesBadgeNumber=", ", showNotes=", sbM22995r);
        sbM22995r.append(this.f43130k);
        sbM22995r.append(", vocabularyTokens=");
        sbM22995r.append(this.f43131l);
        sbM22995r.append(", showVocabulary=");
        return e65.m10875g(sbM22995r, this.f43132m, ", showMergedMeanings=", this.f43133n, ")");
    }
}
