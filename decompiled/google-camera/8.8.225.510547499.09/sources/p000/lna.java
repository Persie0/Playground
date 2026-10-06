package p000;

import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lna {

    /* JADX INFO: renamed from: a */
    public int f38729a;

    /* JADX INFO: renamed from: b */
    public float f38730b;

    /* JADX INFO: renamed from: c */
    public mrm f38731c;

    /* JADX INFO: renamed from: d */
    public byte f38732d;

    /* JADX INFO: renamed from: e */
    public int f38733e;

    public lna() {
    }

    public lna(byte[] bArr) {
        this.f38731c = mqu.f41450a;
    }

    /* JADX INFO: renamed from: a */
    public final lnb m15760a() {
        int i;
        if (this.f38732d == 3 && (i = this.f38733e) != 0) {
            lnb lnbVar = new lnb(i, this.f38729a, this.f38730b, this.f38731c);
            lku.m15614I(true, "Rate limit per second must be >= 0");
            float f = lnbVar.f38734a;
            lku.m15614I(f > 0.0f && f <= 1.0f, "Sampling Probability shall be > 0 and <= 1");
            return lnbVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f38733e == 0) {
            sb.append(" enablement");
        }
        if ((this.f38732d & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if ((this.f38732d & 2) == 0) {
            sb.append(" samplingProbability");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m15761b(boolean z) {
        this.f38733e = true != z ? 2 : 3;
    }

    /* JADX INFO: renamed from: c */
    public final ljq m15762c() {
        int i;
        if (this.f38732d == 3 && (i = this.f38729a) != 0) {
            ljq ljqVar = new ljq(i, this.f38730b, this.f38733e, this.f38731c);
            float f = ljqVar.f38410a;
            lku.m15670x(f > 0.0f && f <= 100.0f, "StartupSamplePercentage should be a floating number > 0 and <= 100.");
            return ljqVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f38729a == 0) {
            sb.append(pIeXJQLZLfgIN.RNX);
        }
        if ((this.f38732d & 1) == 0) {
            sb.append(" startupSamplePercentage");
        }
        if ((this.f38732d & 2) == 0) {
            sb.append(" debugLogsSize");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: d */
    public final void m15763d(boolean z) {
        this.f38729a = true != z ? 2 : 3;
    }
}
