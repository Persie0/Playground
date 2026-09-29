package p000;

/* JADX INFO: loaded from: classes.dex */
public final class kl4 {

    /* JADX INFO: renamed from: a */
    public final String f47488a;

    /* JADX INFO: renamed from: b */
    public final String f47489b;

    /* JADX INFO: renamed from: c */
    public final int f47490c;

    public kl4(String str, int i, String str2) {
        str.getClass();
        str2.getClass();
        this.f47488a = str;
        this.f47489b = str2;
        this.f47490c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl4)) {
            return false;
        }
        kl4 kl4Var = (kl4) obj;
        return fa4.m11650l(this.f47488a, kl4Var.f47488a) && fa4.m11650l(this.f47489b, kl4Var.f47489b) && this.f47490c == kl4Var.f47490c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f47490c) + ux5.m22980c(this.f47488a.hashCode() * 31, this.f47489b, 31);
    }

    public final String toString() {
        return wq1.m24123s(ux5.m23000w("LanguageAndTtsVoicesJoin(code=", this.f47488a, ", name=", this.f47489b, ", voiceOrder="), this.f47490c, ")");
    }
}
