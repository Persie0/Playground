package p000;

/* JADX INFO: loaded from: classes.dex */
public final class p02 {

    /* JADX INFO: renamed from: a */
    public final Object f55352a;

    /* JADX INFO: renamed from: b */
    public final Object f55353b;

    public p02(Object obj, Object obj2) {
        this.f55352a = obj;
        this.f55353b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p02)) {
            return false;
        }
        p02 p02Var = (p02) obj;
        return fa4.m11650l(this.f55352a, p02Var.f55352a) && fa4.m11650l(this.f55353b, p02Var.f55353b);
    }

    public final int hashCode() {
        Object obj = this.f55352a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f55353b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "DataWithResult(data=" + this.f55352a + ", result=" + this.f55353b + ")";
    }
}
