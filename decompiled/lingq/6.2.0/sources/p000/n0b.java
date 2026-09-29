package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class n0b extends p0b {

    /* JADX INFO: renamed from: a */
    public final int f52148a;

    /* JADX INFO: renamed from: b */
    public final int f52149b;

    public n0b(int i, int i2) {
        this.f52148a = i;
        this.f52149b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0b)) {
            return false;
        }
        n0b n0bVar = (n0b) obj;
        return this.f52148a == n0bVar.f52148a && this.f52149b == n0bVar.f52149b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f52149b) + (Integer.hashCode(this.f52148a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f52148a, this.f52149b, "ShowPageSelector(currentPage=", ", totalPages=", ")");
    }
}
