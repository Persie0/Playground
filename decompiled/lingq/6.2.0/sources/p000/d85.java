package p000;

/* JADX INFO: loaded from: classes.dex */
public final class d85 {

    /* JADX INFO: renamed from: a */
    public final int f35148a;

    /* JADX INFO: renamed from: b */
    public final String f35149b;

    /* JADX INFO: renamed from: c */
    public final String f35150c;

    /* JADX INFO: renamed from: d */
    public final String f35151d;

    /* JADX INFO: renamed from: e */
    public final String f35152e;

    /* JADX INFO: renamed from: f */
    public final String f35153f;

    /* JADX INFO: renamed from: g */
    public final String f35154g;

    /* JADX INFO: renamed from: h */
    public final float f35155h;

    /* JADX INFO: renamed from: i */
    public final int f35156i;

    /* JADX INFO: renamed from: j */
    public final boolean f35157j;

    /* JADX INFO: renamed from: k */
    public final boolean f35158k;

    /* JADX INFO: renamed from: l */
    public final boolean f35159l;

    /* JADX INFO: renamed from: m */
    public final boolean f35160m;

    /* JADX INFO: renamed from: n */
    public final boolean f35161n;

    /* JADX INFO: renamed from: o */
    public final boolean f35162o;

    /* JADX INFO: renamed from: p */
    public final boolean f35163p;

    public d85(int i, String str, String str2, String str3, String str4, String str5, String str6, float f, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        str4.getClass();
        this.f35148a = i;
        this.f35149b = str;
        this.f35150c = str2;
        this.f35151d = str3;
        this.f35152e = str4;
        this.f35153f = str5;
        this.f35154g = str6;
        this.f35155h = f;
        this.f35156i = i2;
        this.f35157j = z;
        this.f35158k = z2;
        this.f35159l = z3;
        this.f35160m = z4;
        this.f35161n = z5;
        this.f35162o = z6;
        this.f35163p = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d85)) {
            return false;
        }
        d85 d85Var = (d85) obj;
        return this.f35148a == d85Var.f35148a && this.f35149b.equals(d85Var.f35149b) && this.f35150c.equals(d85Var.f35150c) && this.f35151d.equals(d85Var.f35151d) && fa4.m11650l(this.f35152e, d85Var.f35152e) && this.f35153f.equals(d85Var.f35153f) && this.f35154g.equals(d85Var.f35154g) && Float.compare(this.f35155h, d85Var.f35155h) == 0 && this.f35156i == d85Var.f35156i && this.f35157j == d85Var.f35157j && this.f35158k == d85Var.f35158k && this.f35159l == d85Var.f35159l && this.f35160m == d85Var.f35160m && this.f35161n == d85Var.f35161n && this.f35162o == d85Var.f35162o && this.f35163p == d85Var.f35163p;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35163p) + g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(wq1.m24106b(this.f35156i, wq1.m24105a(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f35148a) * 31, this.f35149b, 31), this.f35150c, 31), this.f35151d, 31), this.f35152e, 31), this.f35153f, 31), this.f35154g, 31), this.f35155h, 31), 31), 31, this.f35157j), 31, this.f35158k), 31, this.f35159l), 31, this.f35160m), 31, this.f35161n), 31, this.f35162o);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f35148a, "LibraryCourseItemState(courseId=", ", courseImage=", this.f35149b, ", courseProvider=");
        AbstractC3393o1.m17725C(sbM22995r, this.f35150c, ", wordsCount=", this.f35151d, ", lingqsCount=");
        AbstractC3393o1.m17725C(sbM22995r, this.f35152e, ", courseTitle=", this.f35153f, ", audioDuration=");
        sbM22995r.append(this.f35154g);
        sbM22995r.append(", progress=");
        sbM22995r.append(this.f35155h);
        sbM22995r.append(", lessonsCount=");
        hn1.m13368r(sbM22995r, this.f35156i, ", isPrivate=", this.f35157j, ", isLiked=");
        wq1.m24101A(sbM22995r, this.f35158k, ", isTaken=", this.f35159l, ", canSubscribe=");
        wq1.m24101A(sbM22995r, this.f35160m, ", isSubscribed=", this.f35161n, ", canArchive=");
        return e65.m10875g(sbM22995r, this.f35162o, ", isArchived=", this.f35163p, ")");
    }
}
