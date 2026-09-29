package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class p42 extends tad {

    /* JADX INFO: renamed from: a */
    public final String f55546a;

    /* JADX INFO: renamed from: b */
    public final String f55547b;

    /* JADX INFO: renamed from: c */
    public final String f55548c;

    /* JADX INFO: renamed from: d */
    public final boolean f55549d;

    public p42(String str, String str2, String str3, boolean z) {
        this.f55546a = str;
        this.f55547b = str2;
        this.f55548c = str3;
        this.f55549d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p42)) {
            return false;
        }
        p42 p42Var = (p42) obj;
        return fa4.m11650l(this.f55546a, p42Var.f55546a) && fa4.m11650l(this.f55547b, p42Var.f55547b) && fa4.m11650l(this.f55548c, p42Var.f55548c) && this.f55549d == p42Var.f55549d;
    }

    public final int hashCode() {
        String str = this.f55546a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f55547b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f55548c;
        return Boolean.hashCode(this.f55549d) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("Review(language=", this.f55546a, ", interfaceLanguage=", this.f55547b, ", lotd=");
        sbM23000w.append(this.f55548c);
        sbM23000w.append(", isSRS=");
        sbM23000w.append(this.f55549d);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
