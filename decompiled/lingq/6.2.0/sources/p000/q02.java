package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class q02 {

    /* JADX INFO: renamed from: a */
    public final Object f57065a;

    /* JADX INFO: renamed from: b */
    public final Object f57066b;

    public /* synthetic */ q02() {
        this(null, -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q02)) {
            return false;
        }
        q02 q02Var = (q02) obj;
        return fa4.m11650l(this.f57065a, q02Var.f57065a) && fa4.m11650l(this.f57066b, q02Var.f57066b);
    }

    public final int hashCode() {
        Object obj = this.f57065a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f57066b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "DataWithResult(data=" + this.f57065a + ", result=" + this.f57066b + ")";
    }

    public q02(Object obj, Object obj2) {
        this.f57065a = obj;
        this.f57066b = obj2;
    }
}
