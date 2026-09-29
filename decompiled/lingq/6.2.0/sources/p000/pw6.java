package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class pw6 {

    /* JADX INFO: renamed from: a */
    public final String f56906a;

    /* JADX INFO: renamed from: b */
    public final int f56907b;

    /* JADX INFO: renamed from: c */
    public final String f56908c;

    public pw6(String str, int i, String str2) {
        this.f56906a = str;
        this.f56907b = i;
        this.f56908c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pw6)) {
            return false;
        }
        pw6 pw6Var = (pw6) obj;
        return fa4.m11650l(this.f56906a, pw6Var.f56906a) && this.f56907b == pw6Var.f56907b && fa4.m11650l(this.f56908c, pw6Var.f56908c);
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f56907b, this.f56906a.hashCode() * 31, 31);
        String str = this.f56908c;
        return iM24106b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(AbstractC3393o1.m17741p(this.f56907b, "OnboardingSingleChoice(value=", this.f56906a, ", labelRes=", ", emoji="), this.f56908c, ")");
    }
}
