package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c55 {

    /* JADX INFO: renamed from: a */
    public final int f9574a;

    /* JADX INFO: renamed from: b */
    public final int f9575b;

    /* JADX INFO: renamed from: c */
    public final String f9576c;

    /* JADX INFO: renamed from: d */
    public final boolean f9577d;

    /* JADX INFO: renamed from: e */
    public final String f9578e;

    /* JADX INFO: renamed from: f */
    public final String f9579f;

    /* JADX INFO: renamed from: g */
    public final String f9580g;

    /* JADX INFO: renamed from: h */
    public final List f9581h;

    /* JADX INFO: renamed from: i */
    public final boolean f9582i;

    /* JADX INFO: renamed from: j */
    public final boolean f9583j;

    /* JADX INFO: renamed from: k */
    public final int f9584k;

    public c55(int i, int i2, String str, boolean z, String str2, String str3, String str4, List list, boolean z2, boolean z3, int i3) {
        this.f9574a = i;
        this.f9575b = i2;
        this.f9576c = str;
        this.f9577d = z;
        this.f9578e = str2;
        this.f9579f = str3;
        this.f9580g = str4;
        this.f9581h = list;
        this.f9582i = z2;
        this.f9583j = z3;
        this.f9584k = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c55)) {
            return false;
        }
        c55 c55Var = (c55) obj;
        return this.f9574a == c55Var.f9574a && this.f9575b == c55Var.f9575b && this.f9576c.equals(c55Var.f9576c) && this.f9577d == c55Var.f9577d && fa4.m11650l(this.f9578e, c55Var.f9578e) && fa4.m11650l(this.f9579f, c55Var.f9579f) && this.f9580g.equals(c55Var.f9580g) && this.f9581h.equals(c55Var.f9581h) && this.f9582i == c55Var.f9582i && this.f9583j == c55Var.f9583j && this.f9584k == c55Var.f9584k;
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(ux5.m22980c(wq1.m24106b(this.f9575b, Integer.hashCode(this.f9574a) * 31, 31), this.f9576c, 31), 31, this.f9577d);
        String str = this.f9578e;
        int iHashCode = (iM12428e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9579f;
        return Integer.hashCode(this.f9584k) + g9a.m12428e(g9a.m12428e(ux5.m22979b(ux5.m22980c((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, this.f9580g, 31), 31, this.f9581h), 31, this.f9582i), 31, this.f9583j);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f9574a, this.f9575b, "LessonNavigationData(lessonId=", ", collectionId=", ", collectionTitle=");
        ux5.m22976C(this.f9576c, ", needsImport=", ", sourceUrl=", sbM22994q, this.f9577d);
        AbstractC3393o1.m17725C(sbM22994q, this.f9578e, ", sourceName=", this.f9579f, ", sharedByName=");
        hn1.m13366p(this.f9580g, ", tags=", ", isVirtual=", sbM22994q, this.f9581h);
        wq1.m24101A(sbM22994q, this.f9582i, ", hasAudio=", this.f9583j, ", duration=");
        return wq1.m24123s(sbM22994q, this.f9584k, ")");
    }
}
