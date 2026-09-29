package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class kbb extends obb {

    /* JADX INFO: renamed from: a */
    public final double f46988a;

    /* JADX INFO: renamed from: b */
    public final double f46989b;

    public kbb(double d, double d2) {
        this.f46988a = d;
        this.f46989b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbb)) {
            return false;
        }
        kbb kbbVar = (kbb) obj;
        return Double.compare(this.f46988a, kbbVar.f46988a) == 0 && Double.compare(this.f46989b, kbbVar.f46989b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f46989b) + (Double.hashCode(this.f46988a) * 31);
    }

    public final String toString() {
        return "Play(start=" + this.f46988a + ", end=" + this.f46989b + ")";
    }
}
