package p000;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hca {

    /* JADX INFO: renamed from: a */
    public final ksa f27218a;

    /* JADX INFO: renamed from: b */
    public long f27219b = -1;

    /* JADX INFO: renamed from: c */
    public long f27220c = -1;

    /* JADX INFO: renamed from: d */
    public long f27221d;

    /* JADX INFO: renamed from: e */
    public long f27222e;

    /* JADX INFO: renamed from: f */
    public long f27223f;

    /* JADX INFO: renamed from: g */
    private final fcp f27224g;

    /* JADX INFO: renamed from: h */
    private final hah f27225h;

    /* JADX INFO: renamed from: i */
    private final bko f27226i;

    public hca(fcp fcpVar, ksa ksaVar, bko bkoVar, hah hahVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f27224g = fcpVar;
        this.f27218a = ksaVar;
        this.f27226i = bkoVar;
        this.f27225h = hahVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX INFO: renamed from: a */
    public final void m10098a(boolean z, int i, int i2) {
        int iMax;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f27221d;
        int iMax2 = j != 0 ? (int) Math.max(jElapsedRealtime - j, 0L) : 0;
        long j2 = this.f27222e;
        if (j2 != 0) {
            long j3 = this.f27221d;
            if (j3 != 0) {
                iMax = (int) Math.max(j2 - j3, 0L);
            } else {
                iMax = 0;
            }
        } else {
            iMax = 0;
        }
        long j4 = this.f27222e;
        int iMax3 = j4 != 0 ? (int) Math.max(jElapsedRealtime - j4, 0L) : 0;
        long j5 = this.f27223f;
        this.f27224g.mo8166ak(this.f27219b, this.f27220c, z, iMax2, iMax, iMax3, j5 != 0 ? (int) Math.max(jElapsedRealtime - j5, 0L) : 0, i, i2, ((Integer) this.f27225h.mo10031c(gzy.f27027ak)).intValue());
        if (iMax2 >= 30000) {
            this.f27226i.m2632z();
        }
        this.f27219b = -1L;
        this.f27220c = -1L;
        this.f27221d = 0L;
        this.f27222e = 0L;
        this.f27223f = 0L;
    }

    /* JADX INFO: renamed from: b */
    public final void m10099b(int i, int i2) {
        m10098a(false, i2, i);
    }
}
