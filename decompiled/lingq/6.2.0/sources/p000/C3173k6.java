package p000;

/* JADX INFO: renamed from: k6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3173k6 {

    /* JADX INFO: renamed from: a */
    public final int f46740a;

    /* JADX INFO: renamed from: b */
    public final boolean f46741b;

    /* JADX INFO: renamed from: c */
    public final boolean f46742c;

    /* JADX INFO: renamed from: d */
    public final boolean f46743d;

    /* JADX INFO: renamed from: e */
    public final boolean f46744e;

    /* JADX INFO: renamed from: f */
    public final boolean f46745f;

    /* JADX INFO: renamed from: g */
    public final boolean f46746g;

    /* JADX INFO: renamed from: h */
    public final boolean f46747h;

    /* JADX INFO: renamed from: i */
    public final boolean f46748i;

    /* JADX INFO: renamed from: j */
    public final boolean f46749j;

    public C3173k6(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f46740a = i;
        this.f46741b = z;
        this.f46742c = z2;
        this.f46743d = z3;
        this.f46744e = z4;
        this.f46745f = z5;
        this.f46746g = z6;
        this.f46747h = z7;
        this.f46748i = z8;
        this.f46749j = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3173k6)) {
            return false;
        }
        C3173k6 c3173k6 = (C3173k6) obj;
        return this.f46740a == c3173k6.f46740a && this.f46741b == c3173k6.f46741b && this.f46742c == c3173k6.f46742c && this.f46743d == c3173k6.f46743d && this.f46744e == c3173k6.f46744e && this.f46745f == c3173k6.f46745f && this.f46746g == c3173k6.f46746g && this.f46747h == c3173k6.f46747h && this.f46748i == c3173k6.f46748i && this.f46749j == c3173k6.f46749j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f46749j) + g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(Integer.hashCode(this.f46740a) * 31, 31, this.f46741b), 31, this.f46742c), 31, this.f46743d), 31, this.f46744e), 31, this.f46745f), 31, this.f46746g), 31, this.f46747h), 31, this.f46748i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivitiesData(cardsPerSession=");
        sb.append(this.f46740a);
        sb.append(", isFlashCardActive=");
        sb.append(this.f46741b);
        sb.append(", isFlashCardReverseActive=");
        wq1.m24101A(sb, this.f46742c, ", isClozeActive=", this.f46743d, ", isMultiChoiceActive=");
        wq1.m24101A(sb, this.f46744e, ", isDictationActive=", this.f46745f, ", isUnscrambleActive=");
        wq1.m24101A(sb, this.f46746g, ", isSpeakingActive=", this.f46747h, ", isMatchingActive=");
        return e65.m10875g(sb, this.f46748i, ", hasTTS=", this.f46749j, ")");
    }
}
