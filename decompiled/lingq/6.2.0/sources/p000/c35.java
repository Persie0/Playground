package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c35 {

    /* JADX INFO: renamed from: a */
    public final int f9390a;

    /* JADX INFO: renamed from: b */
    public final String f9391b;

    /* JADX INFO: renamed from: c */
    public final String f9392c;

    /* JADX INFO: renamed from: d */
    public final String f9393d;

    /* JADX INFO: renamed from: e */
    public final String f9394e;

    /* JADX INFO: renamed from: f */
    public final String f9395f;

    /* JADX INFO: renamed from: g */
    public final String f9396g;

    /* JADX INFO: renamed from: h */
    public final int f9397h;

    /* JADX INFO: renamed from: i */
    public final int f9398i;

    /* JADX INFO: renamed from: j */
    public final String f9399j;

    /* JADX INFO: renamed from: k */
    public final String f9400k;

    /* JADX INFO: renamed from: l */
    public final boolean f9401l;

    /* JADX INFO: renamed from: m */
    public final boolean f9402m;

    /* JADX INFO: renamed from: n */
    public final int f9403n;

    /* JADX INFO: renamed from: o */
    public final String f9404o;

    /* JADX INFO: renamed from: p */
    public final String f9405p;

    /* JADX INFO: renamed from: q */
    public final List f9406q;

    /* JADX INFO: renamed from: r */
    public final int f9407r;

    /* JADX INFO: renamed from: s */
    public final String f9408s;

    /* JADX INFO: renamed from: t */
    public final String f9409t;

    /* JADX INFO: renamed from: u */
    public final boolean f9410u;

    /* JADX INFO: renamed from: v */
    public final boolean f9411v;

    /* JADX INFO: renamed from: w */
    public final int f9412w;

    public c35(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, int i3, String str7, String str8, boolean z, boolean z2, int i4, String str9, String str10, List list, int i5, String str11, String str12, boolean z3, boolean z4, int i6) {
        str.getClass();
        str4.getClass();
        this.f9390a = i;
        this.f9391b = str;
        this.f9392c = str2;
        this.f9393d = str3;
        this.f9394e = str4;
        this.f9395f = str5;
        this.f9396g = str6;
        this.f9397h = i2;
        this.f9398i = i3;
        this.f9399j = str7;
        this.f9400k = str8;
        this.f9401l = z;
        this.f9402m = z2;
        this.f9403n = i4;
        this.f9404o = str9;
        this.f9405p = str10;
        this.f9406q = list;
        this.f9407r = i5;
        this.f9408s = str11;
        this.f9409t = str12;
        this.f9410u = z3;
        this.f9411v = z4;
        this.f9412w = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c35)) {
            return false;
        }
        c35 c35Var = (c35) obj;
        return this.f9390a == c35Var.f9390a && fa4.m11650l(this.f9391b, c35Var.f9391b) && this.f9392c.equals(c35Var.f9392c) && this.f9393d.equals(c35Var.f9393d) && fa4.m11650l(this.f9394e, c35Var.f9394e) && fa4.m11650l(this.f9395f, c35Var.f9395f) && this.f9396g.equals(c35Var.f9396g) && this.f9397h == c35Var.f9397h && this.f9398i == c35Var.f9398i && this.f9399j.equals(c35Var.f9399j) && this.f9400k.equals(c35Var.f9400k) && this.f9401l == c35Var.f9401l && this.f9402m == c35Var.f9402m && this.f9403n == c35Var.f9403n && fa4.m11650l(this.f9404o, c35Var.f9404o) && fa4.m11650l(this.f9405p, c35Var.f9405p) && this.f9406q.equals(c35Var.f9406q) && this.f9407r == c35Var.f9407r && fa4.m11650l(this.f9408s, c35Var.f9408s) && fa4.m11650l(this.f9409t, c35Var.f9409t) && this.f9410u == c35Var.f9410u && this.f9411v == c35Var.f9411v && this.f9412w == c35Var.f9412w;
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f9390a) * 31, this.f9391b, 31), this.f9392c, 31), this.f9393d, 31), this.f9394e, 31);
        String str = this.f9395f;
        int iM24106b = wq1.m24106b(this.f9403n, g9a.m12428e(g9a.m12428e(ux5.m22980c(ux5.m22980c(wq1.m24106b(this.f9398i, wq1.m24106b(this.f9397h, ux5.m22980c((iM22980c + (str == null ? 0 : str.hashCode())) * 31, this.f9396g, 31), 31), 31), this.f9399j, 31), this.f9400k, 31), 31, this.f9401l), 31, this.f9402m), 31);
        String str2 = this.f9404o;
        int iHashCode = (iM24106b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9405p;
        int iM24106b2 = wq1.m24106b(this.f9407r, ux5.m22979b((iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f9406q), 31);
        String str4 = this.f9408s;
        int iHashCode2 = (iM24106b2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f9409t;
        return Integer.hashCode(this.f9412w) + g9a.m12428e(g9a.m12428e((iHashCode2 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.f9410u), 31, this.f9411v);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f9390a, "LessonInfoContent(id=", ", title=", this.f9391b, ", description=");
        AbstractC3393o1.m17725C(sbM22995r, this.f9392c, ", level=", this.f9393d, ", imageUrl=");
        AbstractC3393o1.m17725C(sbM22995r, this.f9394e, ", originalImageUrl=", this.f9395f, ", audioDuration=");
        AbstractC3393o1.m17748w(this.f9397h, this.f9396g, ", likesCount=", ", wordCount=", sbM22995r);
        hn1.m13361k(this.f9398i, ", sharedByName=", this.f9399j, ", sharedByImageUrl=", sbM22995r);
        ux5.m22976C(this.f9400k, ", isPrivate=", ", needsImport=", sbM22995r, this.f9401l);
        hn1.m13373w(sbM22995r, this.f9402m, ", collectionId=", this.f9403n, ", collectionTitle=");
        AbstractC3393o1.m17725C(sbM22995r, this.f9404o, ", originalUrl=", this.f9405p, ", tags=");
        sbM22995r.append(this.f9406q);
        sbM22995r.append(", price=");
        sbM22995r.append(this.f9407r);
        sbM22995r.append(", sourceUrl=");
        AbstractC3393o1.m17725C(sbM22995r, this.f9408s, ", sourceName=", this.f9409t, ", isVirtual=");
        wq1.m24101A(sbM22995r, this.f9410u, ", hasAudio=", this.f9411v, ", duration=");
        return wq1.m24123s(sbM22995r, this.f9412w, ")");
    }
}
