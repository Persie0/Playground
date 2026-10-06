package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ehz {

    /* JADX INFO: renamed from: a */
    double f14116a = Double.NaN;

    /* JADX INFO: renamed from: b */
    double f14117b = Double.NaN;

    /* JADX INFO: renamed from: c */
    boolean f14118c = false;

    /* JADX INFO: renamed from: a */
    public final double m7340a(double d) {
        if (!this.f14118c) {
            this.f14117b = d;
            this.f14116a = d;
            this.f14118c = true;
            return d;
        }
        double d2 = d - this.f14117b;
        this.f14117b = d;
        if (d2 > 180.0d) {
            d2 -= 360.0d;
        }
        if (d2 < -180.0d) {
            d2 += 360.0d;
        }
        double d3 = this.f14116a + d2;
        this.f14116a = d3;
        return d3;
    }
}
