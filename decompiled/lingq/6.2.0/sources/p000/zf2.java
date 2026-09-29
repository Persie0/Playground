package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class zf2 {

    /* JADX INFO: renamed from: a */
    public final String f71484a;

    /* JADX INFO: renamed from: b */
    public final String f71485b;

    /* JADX INFO: renamed from: c */
    public final String f71486c;

    /* JADX INFO: renamed from: d */
    public final String f71487d;

    public zf2(String str, String str2, String str3, String str4) {
        str4.getClass();
        this.f71484a = str;
        this.f71485b = str2;
        this.f71486c = str3;
        this.f71487d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf2)) {
            return false;
        }
        zf2 zf2Var = (zf2) obj;
        return this.f71484a.equals(zf2Var.f71484a) && this.f71485b.equals(zf2Var.f71485b) && this.f71486c.equals(zf2Var.f71486c) && fa4.m11650l(this.f71487d, zf2Var.f71487d);
    }

    public final int hashCode() {
        return this.f71487d.hashCode() + ux5.m22980c(ux5.m22980c(this.f71484a.hashCode() * 31, this.f71485b, 31), this.f71486c, 31);
    }

    public final String toString() {
        return wq1.m24125u(ux5.m23000w("DictionaryToUseData(term=", this.f71484a, ", urlToSend=", this.f71485b, ", dictionaryTitle="), this.f71486c, ", languageTo=", this.f71487d, ")");
    }
}
