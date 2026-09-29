package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class uw4 {

    /* JADX INFO: renamed from: a */
    public final String f64464a;

    /* JADX INFO: renamed from: b */
    public final String f64465b;

    /* JADX INFO: renamed from: c */
    public final String f64466c;

    public uw4(String str, String str2, String str3) {
        ux5.m22974A(str, str2, str3);
        this.f64464a = str;
        this.f64465b = str2;
        this.f64466c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw4)) {
            return false;
        }
        uw4 uw4Var = (uw4) obj;
        return fa4.m11650l(this.f64464a, uw4Var.f64464a) && fa4.m11650l(this.f64465b, uw4Var.f64465b) && fa4.m11650l(this.f64466c, uw4Var.f64466c);
    }

    public final int hashCode() {
        return this.f64466c.hashCode() + ux5.m22980c(this.f64464a.hashCode() * 31, this.f64465b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("LegacyContent(title=", this.f64464a, ", description=", this.f64465b, ", buttonText="), this.f64466c, ")");
    }
}
