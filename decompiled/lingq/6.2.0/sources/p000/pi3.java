package p000;

/* JADX INFO: loaded from: classes.dex */
public final class pi3 {

    /* JADX INFO: renamed from: a */
    public final String f56242a;

    /* JADX INFO: renamed from: b */
    public final String f56243b;

    /* JADX INFO: renamed from: c */
    public final String f56244c;

    /* JADX INFO: renamed from: d */
    public final String f56245d;

    /* JADX INFO: renamed from: e */
    public final String f56246e;

    /* JADX INFO: renamed from: f */
    public final String f56247f;

    public pi3(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f56242a = str;
        this.f56243b = str2;
        this.f56244c = str3;
        this.f56245d = str4;
        this.f56246e = str5;
        this.f56247f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi3)) {
            return false;
        }
        pi3 pi3Var = (pi3) obj;
        return fa4.m11650l(this.f56242a, pi3Var.f56242a) && fa4.m11650l(this.f56243b, pi3Var.f56243b) && fa4.m11650l(this.f56244c, pi3Var.f56244c) && fa4.m11650l(this.f56245d, pi3Var.f56245d) && this.f56246e.equals(pi3Var.f56246e) && fa4.m11650l(this.f56247f, pi3Var.f56247f);
    }

    public final int hashCode() {
        String str = this.f56242a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f56243b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f56244c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f56245d;
        int iM22980c = ux5.m22980c((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, this.f56246e, 31);
        String str5 = this.f56247f;
        return iM22980c + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TargetInfo(className=");
        sb.append(this.f56242a);
        sb.append(", resourceName=");
        sb.append(this.f56243b);
        sb.append(", tag=");
        sb.append(this.f56244c);
        sb.append(", text=");
        sb.append(this.f56245d);
        sb.append(", source=");
        sb.append(this.f56246e);
        sb.append(", hierarchy=");
        return ux5.m22992o(sb, this.f56247f, ')');
    }
}
