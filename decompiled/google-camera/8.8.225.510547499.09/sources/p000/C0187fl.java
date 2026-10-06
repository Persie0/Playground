package p000;

/* JADX INFO: renamed from: fl */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0187fl {

    /* JADX INFO: renamed from: a */
    public static C0187fl f22444a;

    /* JADX INFO: renamed from: b */
    public long f22445b;

    /* JADX INFO: renamed from: c */
    public long f22446c;

    /* JADX INFO: renamed from: d */
    public int f22447d;

    /* JADX INFO: renamed from: a */
    public final void m8538a(long j, double d, double d2) {
        float f = (j - 946728000000L) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d3 = f2;
        double dSin = Math.sin(d3) * 0.03341960161924362d;
        double dSin2 = Math.sin(f2 + f2) * 3.4906598739326E-4d;
        double dSin3 = Math.sin(f2 * 3.0f) * 5.236000106378924E-6d;
        double d4 = f - 9.0E-4f;
        double d5 = (-d2) / 360.0d;
        Double.isNaN(d4);
        float fRound = Math.round(d4 - d5);
        double dSin4 = Math.sin(d3) * 0.0053d;
        Double.isNaN(d3);
        double d6 = d3 + dSin + dSin2 + dSin3 + 1.796593063d + 3.141592653589793d;
        double dSin5 = Math.sin(d6 + d6) * (-0.0069d);
        double dAsin = Math.asin(Math.sin(d6) * Math.sin(0.4092797040939331d));
        double d7 = 0.01745329238474369d * d;
        double dSin6 = (Math.sin(-0.10471975803375244d) - (Math.sin(d7) * Math.sin(dAsin))) / (Math.cos(d7) * Math.cos(dAsin));
        if (dSin6 >= 1.0d) {
            this.f22447d = 1;
        } else {
            if (dSin6 > -1.0d) {
                double d8 = fRound + 9.0E-4f;
                Double.isNaN(d8);
                double d9 = d8 + d5 + dSin4 + dSin5;
                double dAcos = (float) (Math.acos(dSin6) / 6.283185307179586d);
                Double.isNaN(dAcos);
                this.f22445b = Math.round((d9 + dAcos) * 8.64E7d) + 946728000000L;
                Double.isNaN(dAcos);
                long jRound = Math.round((d9 - dAcos) * 8.64E7d) + 946728000000L;
                this.f22446c = jRound;
                if (jRound >= j || this.f22445b <= j) {
                    this.f22447d = 1;
                    return;
                } else {
                    this.f22447d = 0;
                    return;
                }
            }
            this.f22447d = 0;
        }
        this.f22445b = -1L;
        this.f22446c = -1L;
    }
}
