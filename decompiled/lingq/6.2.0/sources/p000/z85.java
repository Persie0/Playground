package p000;

/* JADX INFO: loaded from: classes.dex */
public final class z85 {

    /* JADX INFO: renamed from: a */
    public final int f71072a;

    /* JADX INFO: renamed from: b */
    public final String f71073b;

    /* JADX INFO: renamed from: c */
    public final String f71074c;

    /* JADX INFO: renamed from: d */
    public final String f71075d;

    /* JADX INFO: renamed from: e */
    public final String f71076e;

    /* JADX INFO: renamed from: f */
    public final String f71077f;

    /* JADX INFO: renamed from: g */
    public final String f71078g;

    /* JADX INFO: renamed from: h */
    public final String f71079h;

    /* JADX INFO: renamed from: i */
    public final String f71080i;

    /* JADX INFO: renamed from: j */
    public final float f71081j;

    /* JADX INFO: renamed from: k */
    public final boolean f71082k;

    /* JADX INFO: renamed from: l */
    public final boolean f71083l;

    /* JADX INFO: renamed from: m */
    public final boolean f71084m;

    /* JADX INFO: renamed from: n */
    public final boolean f71085n;

    /* JADX INFO: renamed from: o */
    public final boolean f71086o;

    /* JADX INFO: renamed from: p */
    public final boolean f71087p;

    /* JADX INFO: renamed from: q */
    public final boolean f71088q;

    /* JADX INFO: renamed from: r */
    public final boolean f71089r;

    /* JADX INFO: renamed from: s */
    public final boolean f71090s;

    public z85(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, float f, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i2) {
        boolean z9 = (i2 & 1024) != 0 ? false : z;
        boolean z10 = (i2 & 4096) != 0 ? false : z2;
        boolean z11 = (i2 & 8192) != 0 ? false : z3;
        boolean z12 = (i2 & 16384) != 0 ? false : z4;
        boolean z13 = (32768 & i2) == 0;
        boolean z14 = (131072 & i2) != 0 ? false : z5;
        boolean z15 = (262144 & i2) != 0 ? false : z6;
        boolean z16 = (524288 & i2) != 0 ? false : z7;
        boolean z17 = (i2 & 1048576) == 0 ? z8 : false;
        str4.getClass();
        this.f71072a = i;
        this.f71073b = str;
        this.f71074c = str2;
        this.f71075d = str3;
        this.f71076e = str4;
        this.f71077f = str5;
        this.f71078g = str6;
        this.f71079h = str7;
        this.f71080i = str8;
        this.f71081j = f;
        this.f71082k = z9;
        this.f71083l = z10;
        this.f71084m = z11;
        this.f71085n = z12;
        this.f71086o = z13;
        this.f71087p = z14;
        this.f71088q = z15;
        this.f71089r = z16;
        this.f71090s = z17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z85)) {
            return false;
        }
        z85 z85Var = (z85) obj;
        return this.f71072a == z85Var.f71072a && this.f71073b.equals(z85Var.f71073b) && this.f71074c.equals(z85Var.f71074c) && this.f71075d.equals(z85Var.f71075d) && fa4.m11650l(this.f71076e, z85Var.f71076e) && this.f71077f.equals(z85Var.f71077f) && this.f71078g.equals(z85Var.f71078g) && this.f71079h.equals(z85Var.f71079h) && this.f71080i.equals(z85Var.f71080i) && Float.compare(this.f71081j, z85Var.f71081j) == 0 && this.f71082k == z85Var.f71082k && this.f71083l == z85Var.f71083l && this.f71084m == z85Var.f71084m && this.f71085n == z85Var.f71085n && this.f71086o == z85Var.f71086o && this.f71087p == z85Var.f71087p && this.f71088q == z85Var.f71088q && this.f71089r == z85Var.f71089r && this.f71090s == z85Var.f71090s;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f71090s) + g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(wq1.m24105a(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f71072a) * 31, this.f71073b, 31), this.f71074c, 31), this.f71075d, 31), this.f71076e, 31), this.f71077f, 31), this.f71078g, 31), this.f71079h, 31), this.f71080i, 31), this.f71081j, 31), 31, this.f71082k), 31, false), 31, this.f71083l), 31, this.f71084m), 31, this.f71085n), 31, this.f71086o), 31, false), 31, this.f71087p), 31, this.f71088q), 31, this.f71089r);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f71072a, "LibraryLessonItemState(lessonId=", ", lessonImage=", this.f71073b, ", courseImage=");
        AbstractC3393o1.m17725C(sbM22995r, this.f71074c, ", wordsCount=", this.f71075d, ", lingqsCount=");
        AbstractC3393o1.m17725C(sbM22995r, this.f71076e, ", knownWordsCount=", this.f71077f, ", lessonTitle=");
        AbstractC3393o1.m17725C(sbM22995r, this.f71078g, ", courseTitle=", this.f71079h, ", audioDuration=");
        sbM22995r.append(this.f71080i);
        sbM22995r.append(", progress=");
        sbM22995r.append(this.f71081j);
        sbM22995r.append(", isVideoOnly=");
        wq1.m24101A(sbM22995r, this.f71082k, ", isBlacklisted=false, isExternal=", this.f71083l, ", isTaken=");
        wq1.m24101A(sbM22995r, this.f71084m, ", isLiked=", this.f71085n, ", showBlacklist=");
        wq1.m24101A(sbM22995r, this.f71086o, ", fromCourse=false, canSubscribe=", this.f71087p, ", isSubscribed=");
        wq1.m24101A(sbM22995r, this.f71088q, ", canArchive=", this.f71089r, ", isArchived=");
        return AbstractC3393o1.m17740o(sbM22995r, this.f71090s, ")");
    }
}
