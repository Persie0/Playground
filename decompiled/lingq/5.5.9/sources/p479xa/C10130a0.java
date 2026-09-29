package p479xa;

/* JADX INFO: renamed from: xa.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10130a0 {

    /* JADX INFO: renamed from: a */
    public long f51349a;

    /* JADX INFO: renamed from: b */
    public long f51350b;

    /* JADX INFO: renamed from: c */
    public long f51351c;

    /* JADX INFO: renamed from: d */
    public final ThreadLocal<Long> f51352d = new ThreadLocal<>();

    public C10130a0(long j10) {
        m19006d(j10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized long m19003a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f51350b == -9223372036854775807L) {
            long jLongValue = this.f51349a;
            if (jLongValue == 9223372036854775806L) {
                Long l10 = this.f51352d.get();
                l10.getClass();
                jLongValue = l10.longValue();
            }
            this.f51350b = jLongValue - j10;
            notifyAll();
        }
        this.f51351c = j10;
        return j10 + this.f51350b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final synchronized long m19004b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.f51351c;
        if (j11 != -9223372036854775807L) {
            long j12 = (j11 * 90000) / 1000000;
            long j13 = (4294967296L + j12) / 8589934592L;
            long j14 = ((j13 - 1) * 8589934592L) + j10;
            j10 += j13 * 8589934592L;
            if (Math.abs(j14 - j12) < Math.abs(j10 - j12)) {
                j10 = j14;
            }
        }
        return m19003a((j10 * 1000000) / 90000);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized long m19005c() {
        long j10;
        try {
            j10 = this.f51349a;
            if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
                j10 = -9223372036854775807L;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return j10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final synchronized void m19006d(long j10) {
        this.f51349a = j10;
        this.f51350b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f51351c = -9223372036854775807L;
    }
}
