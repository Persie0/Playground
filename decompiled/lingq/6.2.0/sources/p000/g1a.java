package p000;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class g1a {

    /* JADX INFO: renamed from: a */
    public long f40051a;

    /* JADX INFO: renamed from: b */
    public long f40052b;

    /* JADX INFO: renamed from: c */
    public long f40053c;

    /* JADX INFO: renamed from: d */
    public final ThreadLocal f40054d = new ThreadLocal();

    public g1a(long j) {
        m12283e(j);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m12279a(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            synchronized (this) {
                if (!(this.f40052b != -9223372036854775807L)) {
                    long jLongValue = this.f40051a;
                    if (jLongValue == 9223372036854775806L) {
                        Long l = (Long) this.f40054d.get();
                        l.getClass();
                        jLongValue = l.longValue();
                    }
                    this.f40052b = jLongValue - j;
                    notifyAll();
                }
                this.f40053c = j;
                j2 = j + this.f40052b;
            }
            return j2;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized long m12280b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.f40053c;
            if (j2 != -9223372036854775807L) {
                String str = uma.f64080a;
                long jM22803H = uma.m22803H(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = (4294967296L + jM22803H) / 8589934592L;
                long j4 = ((j3 - 1) * 8589934592L) + j;
                long j5 = (j3 * 8589934592L) + j;
                j = Math.abs(j4 - jM22803H) < Math.abs(j5 - jM22803H) ? j4 : j5;
            }
            long j6 = j;
            String str2 = uma.f64080a;
            return m12279a(uma.m22803H(j6, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized long m12281c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.f40053c;
            if (j2 != -9223372036854775807L) {
                String str = uma.f64080a;
                long jM22803H = uma.m22803H(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = jM22803H / 8589934592L;
                long j4 = (j3 * 8589934592L) + j;
                j = j4 >= jM22803H ? j4 : ((j3 + 1) * 8589934592L) + j;
            }
            long j5 = j;
            String str2 = uma.f64080a;
            return m12279a(uma.m22803H(j5, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized long m12282d() {
        long j;
        j = this.f40051a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m12283e(long j) {
        this.f40051a = j;
        this.f40052b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f40053c = -9223372036854775807L;
    }
}
