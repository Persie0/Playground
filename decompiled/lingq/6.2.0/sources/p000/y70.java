package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class y70 {

    /* JADX INFO: renamed from: a */
    public final String f69390a;

    /* JADX INFO: renamed from: b */
    public final String f69391b;

    /* JADX INFO: renamed from: c */
    public final String f69392c;

    /* JADX INFO: renamed from: d */
    public final String f69393d;

    /* JADX INFO: renamed from: e */
    public final int f69394e;

    /* JADX INFO: renamed from: f */
    public final String f69395f;

    /* JADX INFO: renamed from: g */
    public final String f69396g;

    /* JADX INFO: renamed from: h */
    public final String f69397h;

    /* JADX INFO: renamed from: i */
    public final String f69398i;

    public y70(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8) {
        this.f69390a = str;
        this.f69391b = str2;
        this.f69392c = str3;
        this.f69393d = str4;
        this.f69394e = i;
        this.f69395f = str5;
        this.f69396g = str6;
        this.f69397h = str7;
        this.f69398i = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y70)) {
            return false;
        }
        y70 y70Var = (y70) obj;
        return this.f69390a.equals(y70Var.f69390a) && this.f69391b.equals(y70Var.f69391b) && this.f69392c.equals(y70Var.f69392c) && this.f69393d.equals(y70Var.f69393d) && this.f69394e == y70Var.f69394e && this.f69395f.equals(y70Var.f69395f) && this.f69396g.equals(y70Var.f69396g) && this.f69397h.equals(y70Var.f69397h) && fa4.m11650l(this.f69398i, y70Var.f69398i);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(ux5.m22980c(ux5.m22980c(wq1.m24106b(this.f69394e, ux5.m22980c(ux5.m22980c(ux5.m22980c(this.f69390a.hashCode() * 31, this.f69391b, 31), this.f69392c, 31), this.f69393d, 31), 31), this.f69395f, 31), this.f69396g, 31), this.f69397h, 31);
        String str = this.f69398i;
        return iM22980c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("BadgeEntity(languageAndSlug=", this.f69390a, ", language=", this.f69391b, ", slug=");
        AbstractC3393o1.m17725C(sbM23000w, this.f69392c, ", name=", this.f69393d, ", goal=");
        hn1.m13361k(this.f69394e, ", stat=", this.f69395f, ", metAt=", sbM23000w);
        AbstractC3393o1.m17725C(sbM23000w, this.f69396g, ", gainedAt=", this.f69397h, ", imageUrl=");
        return AbstractC3393o1.m17738m(sbM23000w, this.f69398i, ")");
    }
}
