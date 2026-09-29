package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class dd8 {

    /* JADX INFO: renamed from: a */
    public final int f35449a;

    /* JADX INFO: renamed from: b */
    public final int f35450b;

    /* JADX INFO: renamed from: c */
    public final int f35451c;

    /* JADX INFO: renamed from: d */
    public final int f35452d;

    /* JADX INFO: renamed from: e */
    public final int f35453e;

    public dd8(int i, int i2, int i3, int i4, int i5) {
        this.f35449a = i;
        this.f35450b = i2;
        this.f35451c = i3;
        this.f35452d = i4;
        this.f35453e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd8)) {
            return false;
        }
        dd8 dd8Var = (dd8) obj;
        return this.f35449a == dd8Var.f35449a && this.f35450b == dd8Var.f35450b && this.f35451c == dd8Var.f35451c && this.f35452d == dd8Var.f35452d && this.f35453e == dd8Var.f35453e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35453e) + wq1.m24106b(this.f35452d, wq1.m24106b(this.f35451c, wq1.m24106b(this.f35450b, Integer.hashCode(this.f35449a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f35449a, this.f35450b, "ReviewCounts(lingqCount=", ", newWordsCount=", ", reviewPageCount=");
        hn1.m13360j(this.f35451c, this.f35452d, ", cardsDueCount=", ", sentenceReviewCount=", sbM22994q);
        return wq1.m24123s(sbM22994q, this.f35453e, ")");
    }
}
