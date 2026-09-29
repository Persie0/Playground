package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class t19 extends h29 {

    /* JADX INFO: renamed from: a */
    public final int f61747a;

    /* JADX INFO: renamed from: b */
    public final boolean f61748b;

    /* JADX INFO: renamed from: c */
    public final String f61749c;

    /* JADX INFO: renamed from: d */
    public final String f61750d;

    /* JADX INFO: renamed from: e */
    public final int f61751e;

    /* JADX INFO: renamed from: f */
    public final boolean f61752f;

    /* JADX INFO: renamed from: g */
    public final boolean f61753g;

    /* JADX INFO: renamed from: h */
    public final ViewKeys f61754h;

    public t19(int i, int i2, ViewKeys viewKeys, String str, String str2, boolean z, boolean z2, boolean z3) {
        viewKeys.getClass();
        this.f61747a = i;
        this.f61748b = z;
        this.f61749c = str;
        this.f61750d = str2;
        this.f61751e = i2;
        this.f61752f = z2;
        this.f61753g = z3;
        this.f61754h = viewKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t19)) {
            return false;
        }
        t19 t19Var = (t19) obj;
        return this.f61747a == t19Var.f61747a && this.f61748b == t19Var.f61748b && fa4.m11650l(this.f61749c, t19Var.f61749c) && fa4.m11650l(this.f61750d, t19Var.f61750d) && this.f61751e == t19Var.f61751e && this.f61752f == t19Var.f61752f && this.f61753g == t19Var.f61753g && this.f61754h == t19Var.f61754h;
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(Integer.hashCode(this.f61747a) * 31, 31, this.f61748b);
        String str = this.f61749c;
        int iHashCode = (iM12428e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f61750d;
        return this.f61754h.hashCode() + g9a.m12428e(g9a.m12428e(wq1.m24106b(this.f61751e, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31, this.f61752f), 31, this.f61753g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ManageSubscription(message=");
        sb.append(this.f61747a);
        sb.append(", hasDate=");
        sb.append(this.f61748b);
        sb.append(", date=");
        AbstractC3393o1.m17725C(sb, this.f61749c, ", lifetimeLanguage=", this.f61750d, ", changePlanMessage=");
        hn1.m13368r(sb, this.f61751e, ", goToUrl=", this.f61752f, ", goToUpgrade=");
        sb.append(this.f61753g);
        sb.append(", key=");
        sb.append(this.f61754h);
        sb.append(")");
        return sb.toString();
    }
}
