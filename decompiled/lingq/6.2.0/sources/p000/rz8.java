package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class rz8 implements vz8 {

    /* JADX INFO: renamed from: a */
    public final ak6 f60092a;

    public rz8(ak6 ak6Var) {
        ak6Var.getClass();
        this.f60092a = ak6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rz8) && fa4.m11650l(this.f60092a, ((rz8) obj).f60092a);
    }

    public final int hashCode() {
        return this.f60092a.hashCode();
    }

    public final String toString() {
        return "Failure(error=" + this.f60092a + ")";
    }
}
