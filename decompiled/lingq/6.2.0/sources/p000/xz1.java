package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class xz1 {

    /* JADX INFO: renamed from: a */
    public int f68982a;

    /* JADX INFO: renamed from: b */
    public int f68983b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz1)) {
            return false;
        }
        xz1 xz1Var = (xz1) obj;
        return this.f68982a == xz1Var.f68982a && this.f68983b == xz1Var.f68983b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f68983b) + wq1.m24106b(this.f68982a, Integer.hashCode(-1) * 31, 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f68982a, this.f68983b, "DataInfo(completedPages=-1, totalPages=", ", currentPage=", ")");
    }
}
