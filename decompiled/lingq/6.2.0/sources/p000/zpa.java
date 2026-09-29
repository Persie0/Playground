package p000;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public final class zpa {

    /* JADX INFO: renamed from: a */
    public long f71941a;

    /* JADX INFO: renamed from: b */
    public long f71942b;

    /* JADX INFO: renamed from: c */
    public double f71943c;

    /* JADX INFO: renamed from: d */
    public Range f71944d;

    public zpa() {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        this.f71944d = range;
        this.f71943c = ((Double) range.getUpper()).doubleValue();
        this.f71941a = -9223372036854775807L;
        this.f71942b = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    /* JADX INFO: renamed from: a */
    public final void m25736a(long j, long j2) {
        double dDoubleValue;
        bna.m3969q(j != -9223372036854775807L);
        bna.m3969q(j2 != -9223372036854775807L);
        long j3 = this.f71941a;
        if (j3 != -9223372036854775807L) {
            long j4 = this.f71942b;
            if (j4 == -9223372036854775807L || j == j3) {
                dDoubleValue = ((Double) this.f71944d.getUpper()).doubleValue();
            } else {
                dDoubleValue = (j2 - j4) / (j - j3);
            }
        } else {
            dDoubleValue = ((Double) this.f71944d.getUpper()).doubleValue();
        }
        this.f71943c = (((Double) this.f71944d.clamp(Double.valueOf(dDoubleValue))).doubleValue() * 0.20000000298023224d) + (this.f71943c * 0.800000011920929d);
        this.f71941a = j;
        this.f71942b = j2;
    }

    /* JADX INFO: renamed from: b */
    public final void m25737b() {
        this.f71943c = ((Double) this.f71944d.getUpper()).doubleValue();
        this.f71941a = -9223372036854775807L;
        this.f71942b = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: c */
    public final void m25738c(float f) {
        bna.m3969q(f > 0.0f);
        this.f71944d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f)));
        m25737b();
    }
}
