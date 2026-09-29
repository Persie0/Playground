package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class hs0 {

    /* JADX INFO: renamed from: a */
    public final String f42853a;

    /* JADX INFO: renamed from: b */
    public final String f42854b;

    /* JADX INFO: renamed from: c */
    public final String f42855c;

    /* JADX INFO: renamed from: d */
    public final String f42856d;

    /* JADX INFO: renamed from: e */
    public final double f42857e;

    /* JADX INFO: renamed from: f */
    public final double f42858f;

    /* JADX INFO: renamed from: g */
    public final int f42859g;

    /* JADX INFO: renamed from: h */
    public final String f42860h;

    /* JADX INFO: renamed from: i */
    public final String f42861i;

    public hs0(String str, String str2, String str3, String str4, double d, double d2, int i, String str5, String str6, int i2) {
        str4 = (i2 & 8) != 0 ? "" : str4;
        i = (i2 & 128) != 0 ? 0 : i;
        str5 = (i2 & 256) != 0 ? "" : str5;
        str6 = (i2 & 512) != 0 ? "" : str6;
        str.getClass();
        this.f42853a = str;
        this.f42854b = str2;
        this.f42855c = str3;
        this.f42856d = str4;
        this.f42857e = d;
        this.f42858f = d2;
        this.f42859g = i;
        this.f42860h = str5;
        this.f42861i = str6;
    }

    /* JADX INFO: renamed from: a */
    public final int m13443a() {
        return this.f42859g;
    }

    /* JADX INFO: renamed from: b */
    public final String m13444b() {
        return this.f42860h;
    }

    /* JADX INFO: renamed from: c */
    public final String m13445c() {
        return this.f42861i;
    }

    /* JADX INFO: renamed from: d */
    public final String m13446d() {
        return this.f42854b;
    }

    /* JADX INFO: renamed from: e */
    public final String m13447e() {
        return this.f42855c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs0)) {
            return false;
        }
        hs0 hs0Var = (hs0) obj;
        return fa4.m11650l(this.f42853a, hs0Var.f42853a) && this.f42854b.equals(hs0Var.f42854b) && this.f42855c.equals(hs0Var.f42855c) && this.f42856d.equals(hs0Var.f42856d) && Double.compare(this.f42857e, hs0Var.f42857e) == 0 && Double.compare(0.0d, 0.0d) == 0 && Double.compare(this.f42858f, hs0Var.f42858f) == 0 && this.f42859g == hs0Var.f42859g && this.f42860h.equals(hs0Var.f42860h) && this.f42861i.equals(hs0Var.f42861i);
    }

    /* JADX INFO: renamed from: f */
    public final String m13448f() {
        return this.f42853a;
    }

    /* JADX INFO: renamed from: g */
    public final double m13449g() {
        return this.f42857e;
    }

    /* JADX INFO: renamed from: h */
    public final double m13450h() {
        return this.f42858f;
    }

    public final int hashCode() {
        return this.f42861i.hashCode() + ux5.m22980c(wq1.m24106b(this.f42859g, g9a.m12424a(this.f42858f, g9a.m12424a(0.0d, g9a.m12424a(this.f42857e, ux5.m22980c(ux5.m22980c(ux5.m22980c(this.f42853a.hashCode() * 31, this.f42854b, 31), this.f42855c, 31), this.f42856d, 31), 31), 31), 31), 31), this.f42860h, 31);
    }

    /* JADX INFO: renamed from: i */
    public final String m13451i() {
        return this.f42856d;
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ChallengeStatsEntity(language=", this.f42853a, ", challengeCode=", this.f42854b, ", code=");
        AbstractC3393o1.m17725C(sbM23000w, this.f42855c, ", title=", this.f42856d, ", progress=");
        sbM23000w.append(this.f42857e);
        hn1.m13370t(sbM23000w, ", actual=0.0, target=", this.f42858f, ", bookId=");
        hn1.m13361k(this.f42859g, ", bookImage=", this.f42860h, ", bookLanguage=", sbM23000w);
        return AbstractC3393o1.m17738m(sbM23000w, this.f42861i, ")");
    }
}
