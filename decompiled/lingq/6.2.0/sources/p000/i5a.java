package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class i5a {

    /* JADX INFO: renamed from: a */
    public final String f43551a;

    /* JADX INFO: renamed from: b */
    public final int f43552b;

    /* JADX INFO: renamed from: c */
    public final int f43553c;

    /* JADX INFO: renamed from: d */
    public final int f43554d;

    /* JADX INFO: renamed from: e */
    public final boolean f43555e;

    /* JADX INFO: renamed from: f */
    public final boolean f43556f;

    /* JADX INFO: renamed from: g */
    public final int f43557g;

    /* JADX INFO: renamed from: h */
    public final boolean f43558h;

    /* JADX INFO: renamed from: i */
    public final boolean f43559i;

    public i5a(String str, int i, int i2, int i3, boolean z, boolean z2, int i4, boolean z3, boolean z4) {
        this.f43551a = str;
        this.f43552b = i;
        this.f43553c = i2;
        this.f43554d = i3;
        this.f43555e = z;
        this.f43556f = z2;
        this.f43557g = i4;
        this.f43558h = z3;
        this.f43559i = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5a)) {
            return false;
        }
        i5a i5aVar = (i5a) obj;
        return this.f43551a.equals(i5aVar.f43551a) && this.f43552b == i5aVar.f43552b && this.f43553c == i5aVar.f43553c && this.f43554d == i5aVar.f43554d && this.f43555e == i5aVar.f43555e && this.f43556f == i5aVar.f43556f && this.f43557g == i5aVar.f43557g && this.f43558h == i5aVar.f43558h && this.f43559i == i5aVar.f43559i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43559i) + g9a.m12428e(wq1.m24106b(this.f43557g, g9a.m12428e(g9a.m12428e(wq1.m24106b(this.f43554d, wq1.m24106b(this.f43553c, wq1.m24106b(this.f43552b, this.f43551a.hashCode() * 31, 31), 31), 31), 31, this.f43555e), 31, this.f43556f), 31), 31, this.f43558h);
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f43552b, "CollapsedRowsInput(tokenType=", this.f43551a, ", tokenMeaningCount=", ", savedMeaningsCount=");
        hn1.m13360j(this.f43553c, this.f43554d, ", cwtAndDefaultMeaningsCount=", ", hasCwtMeaning=", sbM17741p);
        wq1.m24101A(sbM17741p, this.f43555e, ", hasInlineTranslation=", this.f43556f, ", phraseMeaningsCount=");
        hn1.m13368r(sbM17741p, this.f43557g, ", isLoadingTranslation=", this.f43558h, ", shouldMergeMeanings=");
        return AbstractC3393o1.m17740o(sbM17741p, this.f43559i, ")");
    }
}
