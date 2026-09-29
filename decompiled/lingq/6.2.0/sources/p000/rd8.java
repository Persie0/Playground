package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class rd8 {

    /* JADX INFO: renamed from: a */
    public final int f59118a;

    /* JADX INFO: renamed from: b */
    public final int f59119b;

    /* JADX INFO: renamed from: c */
    public final int f59120c;

    /* JADX INFO: renamed from: d */
    public final int f59121d;

    /* JADX INFO: renamed from: e */
    public final int f59122e;

    /* JADX INFO: renamed from: f */
    public final int f59123f;

    /* JADX INFO: renamed from: g */
    public final int f59124g;

    /* JADX INFO: renamed from: h */
    public final int f59125h;

    public /* synthetic */ rd8(int i, int i2, int i3, int i4) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 1 : i3, 0, 0, 0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd8)) {
            return false;
        }
        rd8 rd8Var = (rd8) obj;
        return this.f59118a == rd8Var.f59118a && this.f59119b == rd8Var.f59119b && this.f59120c == rd8Var.f59120c && this.f59121d == rd8Var.f59121d && this.f59122e == rd8Var.f59122e && this.f59123f == rd8Var.f59123f && this.f59124g == rd8Var.f59124g && this.f59125h == rd8Var.f59125h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59125h) + wq1.m24106b(this.f59124g, wq1.m24106b(this.f59123f, wq1.m24106b(this.f59122e, wq1.m24106b(this.f59121d, wq1.m24106b(this.f59120c, wq1.m24106b(this.f59119b, Integer.hashCode(this.f59118a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f59118a, this.f59119b, "ReviewMenuState(currentCoins=", ", dailyGoal=", ", activityLevel=");
        hn1.m13360j(this.f59120c, this.f59121d, ", lingqCount=", ", newWordsCount=", sbM22994q);
        hn1.m13360j(this.f59122e, this.f59123f, ", reviewPageCount=", ", cardsDueCount=", sbM22994q);
        sbM22994q.append(this.f59124g);
        sbM22994q.append(", sentenceReviewCount=");
        sbM22994q.append(this.f59125h);
        sbM22994q.append(")");
        return sbM22994q.toString();
    }

    public rd8(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f59118a = i;
        this.f59119b = i2;
        this.f59120c = i3;
        this.f59121d = i4;
        this.f59122e = i5;
        this.f59123f = i6;
        this.f59124g = i7;
        this.f59125h = i8;
    }
}
