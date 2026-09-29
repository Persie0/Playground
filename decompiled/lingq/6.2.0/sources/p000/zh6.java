package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class zh6 implements vg6 {

    /* JADX INFO: renamed from: a */
    public final String f71578a;

    /* JADX INFO: renamed from: b */
    public final String f71579b;

    public zh6(String str, String str2) {
        str.getClass();
        this.f71578a = str;
        this.f71579b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh6)) {
            return false;
        }
        zh6 zh6Var = (zh6) obj;
        return fa4.m11650l(this.f71578a, zh6Var.f71578a) && this.f71579b.equals(zh6Var.f71579b);
    }

    public final int hashCode() {
        return this.f71579b.hashCode() + (this.f71578a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("NotificationsDailyLingqs(code=", this.f71578a, ", title=", this.f71579b, ")");
    }
}
