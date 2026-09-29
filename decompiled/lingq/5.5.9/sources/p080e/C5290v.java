package p080e;

/* JADX INFO: renamed from: e.v */
/* JADX INFO: loaded from: classes.dex */
public final class C5290v {

    /* JADX INFO: renamed from: d */
    public static C5290v f33518d;

    /* JADX INFO: renamed from: a */
    public long f33519a;

    /* JADX INFO: renamed from: b */
    public long f33520b;

    /* JADX INFO: renamed from: c */
    public int f33521c;

    /* JADX INFO: renamed from: a */
    public final void m11411a(double d10, double d11, long j10) {
        float f3 = (j10 - 946728000000L) / 8.64E7f;
        float f10 = (0.01720197f * f3) + 6.24006f;
        double d12 = f10;
        double dSin = (Math.sin(f10 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f10) * 3.4906598739326E-4d) + (Math.sin(d12) * 0.03341960161924362d) + d12 + 1.796593063d + 3.141592653589793d;
        double d13 = (-d11) / 360.0d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d12) * 0.0053d) + ((double) (Math.round(((double) (f3 - 9.0E-4f)) - d13) + 9.0E-4f)) + d13;
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d14 = 0.01745329238474369d * d10;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d14))) / (Math.cos(dAsin) * Math.cos(d14));
        if (dSin3 >= 1.0d) {
            this.f33521c = 1;
            this.f33519a = -1L;
            this.f33520b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f33521c = 0;
                this.f33519a = -1L;
                this.f33520b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f33519a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f33520b = jRound;
            if (jRound >= j10 || this.f33519a <= j10) {
                this.f33521c = 1;
            } else {
                this.f33521c = 0;
            }
        }
    }
}
