package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class jr0 {

    /* JADX INFO: renamed from: a */
    public final String f46021a;

    /* JADX INFO: renamed from: b */
    public final String f46022b;

    /* JADX INFO: renamed from: c */
    public final double f46023c;

    /* JADX INFO: renamed from: d */
    public final double f46024d;

    /* JADX INFO: renamed from: e */
    public final double f46025e;

    /* JADX INFO: renamed from: f */
    public final String f46026f;

    /* JADX INFO: renamed from: g */
    public final int f46027g;

    /* JADX INFO: renamed from: h */
    public final String f46028h;

    /* JADX INFO: renamed from: i */
    public final String f46029i;

    public jr0(String str, String str2, double d, double d2, double d3, String str3, int i, String str4, String str5) {
        ux5.m22975B(str, str2, str3, str4, str5);
        this.f46021a = str;
        this.f46022b = str2;
        this.f46023c = d;
        this.f46024d = d2;
        this.f46025e = d3;
        this.f46026f = str3;
        this.f46027g = i;
        this.f46028h = str4;
        this.f46029i = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jr0)) {
            return false;
        }
        jr0 jr0Var = (jr0) obj;
        return fa4.m11650l(this.f46021a, jr0Var.f46021a) && fa4.m11650l(this.f46022b, jr0Var.f46022b) && Double.compare(this.f46023c, jr0Var.f46023c) == 0 && Double.compare(this.f46024d, jr0Var.f46024d) == 0 && Double.compare(this.f46025e, jr0Var.f46025e) == 0 && fa4.m11650l(this.f46026f, jr0Var.f46026f) && this.f46027g == jr0Var.f46027g && fa4.m11650l(this.f46028h, jr0Var.f46028h) && fa4.m11650l(this.f46029i, jr0Var.f46029i);
    }

    public final int hashCode() {
        return this.f46029i.hashCode() + ux5.m22980c(wq1.m24106b(this.f46027g, ux5.m22980c(g9a.m12424a(this.f46025e, g9a.m12424a(this.f46024d, g9a.m12424a(this.f46023c, ux5.m22980c(this.f46021a.hashCode() * 31, this.f46022b, 31), 31), 31), 31), this.f46026f, 31), 31), this.f46028h, 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ChallengeProgress(title=", this.f46021a, ", code=", this.f46022b, ", progress=");
        sbM23000w.append(this.f46023c);
        hn1.m13370t(sbM23000w, ", actual=", this.f46024d, ", target=");
        sbM23000w.append(this.f46025e);
        sbM23000w.append(", language=");
        sbM23000w.append(this.f46026f);
        sbM23000w.append(", bookId=");
        sbM23000w.append(this.f46027g);
        sbM23000w.append(", bookImage=");
        sbM23000w.append(this.f46028h);
        return AbstractC3393o1.m17739n(sbM23000w, ", bookLanguage=", this.f46029i, ")");
    }
}
