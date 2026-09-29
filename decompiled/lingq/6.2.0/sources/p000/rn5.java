package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class rn5 {

    /* JADX INFO: renamed from: a */
    public final Boolean f59588a;

    /* JADX INFO: renamed from: b */
    public final Boolean f59589b;

    public rn5(Boolean bool, Boolean bool2) {
        this.f59588a = bool;
        this.f59589b = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn5)) {
            return false;
        }
        rn5 rn5Var = (rn5) obj;
        return fa4.m11650l(this.f59588a, rn5Var.f59588a) && fa4.m11650l(this.f59589b, rn5Var.f59589b);
    }

    public final int hashCode() {
        Boolean bool = this.f59588a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f59589b;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "LynxPrivacySettings(memoryEnabled=" + this.f59588a + ", dataImprovementOptIn=" + this.f59589b + ")";
    }
}
