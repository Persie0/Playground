package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class jn8 {

    /* JADX INFO: renamed from: a */
    public final String f45872a;

    /* JADX INFO: renamed from: b */
    public final String f45873b;

    /* JADX INFO: renamed from: c */
    public final String f45874c;

    /* JADX INFO: renamed from: d */
    public final String f45875d;

    /* JADX INFO: renamed from: e */
    public final String f45876e;

    /* JADX INFO: renamed from: f */
    public final boolean f45877f;

    public jn8(String str, String str2, String str3, String str4, String str5, boolean z) {
        ux5.m22975B(str, str2, str3, str4, str5);
        this.f45872a = str;
        this.f45873b = str2;
        this.f45874c = str3;
        this.f45875d = str4;
        this.f45876e = str5;
        this.f45877f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn8)) {
            return false;
        }
        jn8 jn8Var = (jn8) obj;
        return fa4.m11650l(this.f45872a, jn8Var.f45872a) && fa4.m11650l(this.f45873b, jn8Var.f45873b) && fa4.m11650l(this.f45874c, jn8Var.f45874c) && fa4.m11650l(this.f45875d, jn8Var.f45875d) && fa4.m11650l(this.f45876e, jn8Var.f45876e) && this.f45877f == jn8Var.f45877f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f45877f) + ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(this.f45872a.hashCode() * 31, this.f45873b, 31), this.f45874c, 31), this.f45875d, 31), this.f45876e, 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ScriptPreferences(mandarin=", this.f45872a, ", traditional=", this.f45873b, ", japanese=");
        AbstractC3393o1.m17725C(sbM23000w, this.f45874c, ", cantonese=", this.f45875d, ", latin=");
        sbM23000w.append(this.f45876e);
        sbM23000w.append(", transliterationStatus=");
        sbM23000w.append(this.f45877f);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
