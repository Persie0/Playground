package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mdz {

    /* JADX INFO: renamed from: a */
    private final double f40159a;

    /* JADX INFO: renamed from: b */
    private final double f40160b;

    public mdz(lzb lzbVar, int i) {
        lzbVar.getClass();
        long j = lzbVar.f39596f;
        this.f40159a = lzd.m16226d(j);
        this.f40160b = lzd.m16226d(j - ((long) i));
    }

    /* JADX INFO: renamed from: a */
    public final double m16332a(long j) {
        double d = this.f40160b;
        double d2 = j;
        Double.isNaN(d2);
        return lzd.m16225c((d + d2) / this.f40159a);
    }
}
