package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mcg {

    /* JADX INFO: renamed from: a */
    public final double f39938a;

    /* JADX INFO: renamed from: b */
    private final long f39939b;

    /* JADX INFO: renamed from: c */
    private final double f39940c;

    /* JADX INFO: renamed from: d */
    private final double f39941d;

    /* JADX INFO: renamed from: e */
    private final double f39942e;

    public mcg(lzb lzbVar, lxm lxmVar, long j) {
        lzbVar.getClass();
        lxmVar.getClass();
        this.f39939b = j;
        this.f39940c = lzd.m16226d(lzbVar.f39596f);
        double dM16226d = lzd.m16226d(lxmVar.f39516f);
        this.f39941d = dM16226d;
        this.f39942e = lxmVar.f39520j.f39542f;
        double d = j;
        Double.isNaN(d);
        this.f39938a = lzd.m16225c(d / dM16226d);
    }

    /* JADX INFO: renamed from: a */
    public final double m16309a(double d) {
        double d2 = this.f39940c;
        double d3 = this.f39941d * this.f39942e;
        double d4 = this.f39939b;
        Double.isNaN(d4);
        return lzd.m16225c((((d * d2) - d3) + d4) / d2);
    }
}
