package p000;

/* JADX INFO: renamed from: g3 */
/* JADX INFO: loaded from: classes.dex */
public final class C3024g3 {

    /* JADX INFO: renamed from: a */
    public final String f40090a;

    /* JADX INFO: renamed from: b */
    public final xi3 f40091b;

    public C3024g3(String str, xi3 xi3Var) {
        this.f40090a = str;
        this.f40091b = xi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3024g3)) {
            return false;
        }
        C3024g3 c3024g3 = (C3024g3) obj;
        return fa4.m11650l(this.f40090a, c3024g3.f40090a) && fa4.m11650l(this.f40091b, c3024g3.f40091b);
    }

    public final int hashCode() {
        String str = this.f40090a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        xi3 xi3Var = this.f40091b;
        return iHashCode + (xi3Var != null ? xi3Var.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f40090a + ", action=" + this.f40091b + ')';
    }
}
