package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class v7b {

    /* JADX INFO: renamed from: a */
    public final boolean f64992a;

    /* JADX INFO: renamed from: b */
    public final boolean f64993b;

    /* JADX INFO: renamed from: c */
    public final boolean f64994c;

    /* JADX INFO: renamed from: d */
    public final boolean f64995d;

    /* JADX INFO: renamed from: e */
    public final boolean f64996e;

    /* JADX INFO: renamed from: f */
    public final boolean f64997f;

    public v7b(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f64992a = z;
        this.f64993b = z2;
        this.f64994c = z3;
        this.f64995d = z4;
        this.f64996e = z5;
        this.f64997f = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7b)) {
            return false;
        }
        v7b v7bVar = (v7b) obj;
        return this.f64992a == v7bVar.f64992a && this.f64993b == v7bVar.f64993b && this.f64994c == v7bVar.f64994c && this.f64995d == v7bVar.f64995d && this.f64996e == v7bVar.f64996e && this.f64997f == v7bVar.f64997f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64997f) + g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(Boolean.hashCode(this.f64992a) * 31, 31, this.f64993b), 31, this.f64994c), 31, this.f64995d), 31, this.f64996e);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("WordsPreferences(moveBlueWordsToKnown=", ", autoLingQCreation=", ", cwtMeanings=", this.f64992a, this.f64993b);
        wq1.m24101A(sbM13357g, this.f64994c, ", mergeMeanings=", this.f64995d, ", autoGrammarTagging=");
        return e65.m10875g(sbM13357g, this.f64996e, ", showRelatedPhraseHighlight=", this.f64997f, ")");
    }
}
