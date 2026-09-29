package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class wt3 {

    /* JADX INFO: renamed from: a */
    public final long f67267a;

    /* JADX INFO: renamed from: b */
    public final double f67268b;

    /* JADX INFO: renamed from: c */
    public final double f67269c;

    /* JADX INFO: renamed from: d */
    public final double f67270d;

    public wt3(long j, double d, double d2, double d3) {
        this.f67267a = j;
        this.f67268b = d;
        this.f67269c = d2;
        this.f67270d = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt3)) {
            return false;
        }
        wt3 wt3Var = (wt3) obj;
        return this.f67267a == wt3Var.f67267a && Double.compare(this.f67268b, wt3Var.f67268b) == 0 && Double.compare(this.f67269c, wt3Var.f67269c) == 0 && Double.compare(this.f67270d, wt3Var.f67270d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f67270d) + g9a.m12424a(this.f67269c, g9a.m12424a(this.f67268b, Long.hashCode(this.f67267a) * 31, 31), 31);
    }

    public final String toString() {
        return "HistogramResult(count=" + this.f67267a + ", min=" + this.f67268b + ", max=" + this.f67269c + ", avg=" + this.f67270d + ')';
    }
}
