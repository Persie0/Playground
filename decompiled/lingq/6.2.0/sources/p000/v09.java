package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class v09 extends g19 {

    /* JADX INFO: renamed from: a */
    public final boolean f64667a;

    /* JADX INFO: renamed from: b */
    public final boolean f64668b;

    public v09(boolean z, boolean z2) {
        this.f64667a = z;
        this.f64668b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v09)) {
            return false;
        }
        v09 v09Var = (v09) obj;
        return this.f64667a == v09Var.f64667a && this.f64668b == v09Var.f64668b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64668b) + (Boolean.hashCode(this.f64667a) * 31);
    }

    public final String toString() {
        return "OnManageSubscription(goToUrl=" + this.f64667a + ", goToUpgrade=" + this.f64668b + ")";
    }
}
