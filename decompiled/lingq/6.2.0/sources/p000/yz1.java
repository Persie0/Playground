package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class yz1 {

    /* JADX INFO: renamed from: a */
    public int f70663a;

    /* JADX INFO: renamed from: b */
    public int f70664b;

    /* JADX INFO: renamed from: c */
    public int f70665c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz1)) {
            return false;
        }
        yz1 yz1Var = (yz1) obj;
        return this.f70663a == yz1Var.f70663a && this.f70664b == yz1Var.f70664b && this.f70665c == yz1Var.f70665c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f70665c) + wq1.m24106b(this.f70664b, Integer.hashCode(this.f70663a) * 31, 31);
    }

    public final String toString() {
        int i = this.f70663a;
        int i2 = this.f70664b;
        return wq1.m24123s(ux5.m22994q(i, i2, "DataInfo(completedPages=", ", totalPages=", ", currentPage="), this.f70665c, ")");
    }
}
