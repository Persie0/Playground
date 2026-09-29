package p000;

/* JADX INFO: loaded from: classes.dex */
public final class bk3 {

    /* JADX INFO: renamed from: a */
    public final String f8633a;

    /* JADX INFO: renamed from: b */
    public final boolean f8634b;

    public bk3(String str, boolean z) {
        str.getClass();
        this.f8633a = str;
        this.f8634b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk3)) {
            return false;
        }
        bk3 bk3Var = (bk3) obj;
        return fa4.m11650l(this.f8633a, bk3Var.f8633a) && this.f8634b == bk3Var.f8634b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iHashCode = this.f8633a.hashCode() * 31;
        boolean z = this.f8634b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GateKeeper(name=");
        sb.append(this.f8633a);
        sb.append(", value=");
        return ux5.m22993p(sb, this.f8634b, ')');
    }
}
