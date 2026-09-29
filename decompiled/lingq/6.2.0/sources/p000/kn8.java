package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class kn8 {

    /* JADX INFO: renamed from: a */
    public final String f47557a;

    /* JADX INFO: renamed from: b */
    public final String f47558b;

    /* JADX INFO: renamed from: c */
    public final String f47559c;

    /* JADX INFO: renamed from: d */
    public final String f47560d;

    /* JADX INFO: renamed from: e */
    public final String f47561e;

    public kn8(String str, String str2, String str3, String str4, String str5) {
        ux5.m22975B(str, str2, str3, str4, str5);
        this.f47557a = str;
        this.f47558b = str2;
        this.f47559c = str3;
        this.f47560d = str4;
        this.f47561e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn8)) {
            return false;
        }
        kn8 kn8Var = (kn8) obj;
        return fa4.m11650l(this.f47557a, kn8Var.f47557a) && fa4.m11650l(this.f47558b, kn8Var.f47558b) && fa4.m11650l(this.f47559c, kn8Var.f47559c) && fa4.m11650l(this.f47560d, kn8Var.f47560d) && fa4.m11650l(this.f47561e, kn8Var.f47561e);
    }

    public final int hashCode() {
        return this.f47561e.hashCode() + ux5.m22980c(ux5.m22980c(ux5.m22980c(this.f47557a.hashCode() * 31, this.f47558b, 31), this.f47559c, 31), this.f47560d, 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ScriptSet(mandarin=", this.f47557a, ", japanese=", this.f47558b, ", chineseTrad=");
        AbstractC3393o1.m17725C(sbM23000w, this.f47559c, ", cantonese=", this.f47560d, ", latin=");
        return AbstractC3393o1.m17738m(sbM23000w, this.f47561e, ")");
    }
}
