package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class bn8 extends fo2 {

    /* JADX INFO: renamed from: H */
    public double f8725H;

    /* JADX INFO: renamed from: I */
    public double f8726I;

    @Override // p000.fo2
    /* JADX INFO: renamed from: b */
    public final double mo3907b(double d) {
        double d2 = this.f8726I;
        double d3 = this.f8725H;
        if (d < d2) {
            return (d2 * d) / (((d2 - d) * d3) + d);
        }
        return ((d - 1.0d) * (1.0d - d2)) / ((1.0d - d) - ((d2 - d) * d3));
    }

    @Override // p000.fo2
    /* JADX INFO: renamed from: c */
    public final double mo3908c(double d) {
        double d2 = this.f8726I;
        double d3 = this.f8725H;
        if (d < d2) {
            double d4 = d3 * d2 * d2;
            double d5 = ((d2 - d) * d3) + d;
            return d4 / (d5 * d5);
        }
        double d6 = d2 - 1.0d;
        double d7 = (((d2 - d) * (-d3)) - d) + 1.0d;
        return ((d6 * d3) * d6) / (d7 * d7);
    }
}
