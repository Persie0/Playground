package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class om6 {

    /* JADX INFO: renamed from: a */
    public final int f54579a;

    /* JADX INFO: renamed from: b */
    public final String f54580b;

    /* JADX INFO: renamed from: c */
    public final String f54581c;

    /* JADX INFO: renamed from: d */
    public final String f54582d;

    /* JADX INFO: renamed from: e */
    public final String f54583e;

    /* JADX INFO: renamed from: f */
    public final String f54584f;

    /* JADX INFO: renamed from: g */
    public final boolean f54585g;

    /* JADX INFO: renamed from: h */
    public final String f54586h;

    public om6(int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        str.getClass();
        str6.getClass();
        this.f54579a = i;
        this.f54580b = str;
        this.f54581c = str2;
        this.f54582d = str3;
        this.f54583e = str4;
        this.f54584f = str5;
        this.f54585g = z;
        this.f54586h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om6)) {
            return false;
        }
        om6 om6Var = (om6) obj;
        return this.f54579a == om6Var.f54579a && fa4.m11650l(this.f54580b, om6Var.f54580b) && fa4.m11650l(this.f54581c, om6Var.f54581c) && fa4.m11650l(this.f54582d, om6Var.f54582d) && fa4.m11650l(this.f54583e, om6Var.f54583e) && fa4.m11650l(this.f54584f, om6Var.f54584f) && this.f54585g == om6Var.f54585g && fa4.m11650l(this.f54586h, om6Var.f54586h);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(Integer.hashCode(this.f54579a) * 31, this.f54580b, 31);
        String str = this.f54581c;
        int iHashCode = (iM22980c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f54582d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f54583e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f54584f;
        return this.f54586h.hashCode() + g9a.m12428e((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.f54585g);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f54579a, "Notification(pk=", ", title=", this.f54580b, ", message=");
        AbstractC3393o1.m17725C(sbM22995r, this.f54581c, ", image=", this.f54582d, ", url=");
        AbstractC3393o1.m17725C(sbM22995r, this.f54583e, ", notificationLanguage=", this.f54584f, ", isNew=");
        sbM22995r.append(this.f54585g);
        sbM22995r.append(", timestamp=");
        sbM22995r.append(this.f54586h);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }
}
