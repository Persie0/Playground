package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class o3a {
    public static final n3a Companion = new n3a();

    /* JADX INFO: renamed from: a */
    public final String f53800a;

    /* JADX INFO: renamed from: b */
    public final int f53801b;

    /* JADX INFO: renamed from: c */
    public final String f53802c;

    /* JADX INFO: renamed from: d */
    public final String f53803d;

    /* JADX INFO: renamed from: e */
    public final String f53804e;

    /* JADX INFO: renamed from: f */
    public final String f53805f;

    /* JADX INFO: renamed from: g */
    public final String f53806g;

    /* JADX INFO: renamed from: h */
    public final int f53807h;

    /* JADX INFO: renamed from: i */
    public final int f53808i;

    public o3a(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6) {
        ux5.m22975B(str2, str3, str4, str5, str6);
        this.f53800a = str;
        this.f53801b = i;
        this.f53802c = str2;
        this.f53803d = str3;
        this.f53804e = str4;
        this.f53805f = str5;
        this.f53806g = str6;
        this.f53807h = i2;
        this.f53808i = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3a)) {
            return false;
        }
        o3a o3aVar = (o3a) obj;
        return this.f53800a.equals(o3aVar.f53800a) && this.f53801b == o3aVar.f53801b && fa4.m11650l(this.f53802c, o3aVar.f53802c) && fa4.m11650l(this.f53803d, o3aVar.f53803d) && fa4.m11650l(this.f53804e, o3aVar.f53804e) && fa4.m11650l(this.f53805f, o3aVar.f53805f) && fa4.m11650l(this.f53806g, o3aVar.f53806g) && this.f53807h == o3aVar.f53807h && this.f53808i == o3aVar.f53808i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f53808i) + wq1.m24106b(this.f53807h, ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(wq1.m24106b(this.f53801b, this.f53800a.hashCode() * 31, 31), this.f53802c, 31), this.f53803d, 31), this.f53804e, 31), this.f53805f, 31), this.f53806g, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f53801b, "TokenCwtEntity(id=", this.f53800a, ", lessonId=", ", word=");
        AbstractC3393o1.m17725C(sbM17741p, this.f53802c, ", sentence=", this.f53803d, ", languageSrc=");
        AbstractC3393o1.m17725C(sbM17741p, this.f53804e, ", languageDst=", this.f53805f, ", translation=");
        AbstractC3393o1.m17748w(this.f53807h, this.f53806g, ", sentenceIndex=", ", sentenceTokenIndex=", sbM17741p);
        return wq1.m24123s(sbM17741p, this.f53808i, ")");
    }
}
