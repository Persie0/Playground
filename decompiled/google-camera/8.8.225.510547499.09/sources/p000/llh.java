package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class llh {

    /* JADX INFO: renamed from: a */
    public int f38572a;

    /* JADX INFO: renamed from: b */
    public boolean f38573b;

    /* JADX INFO: renamed from: c */
    public byte f38574c;

    /* JADX INFO: renamed from: d */
    public int f38575d;

    /* JADX INFO: renamed from: e */
    public Object f38576e;

    public llh() {
    }

    public llh(byte[] bArr) {
        this.f38576e = mqu.f41450a;
    }

    /* JADX INFO: renamed from: a */
    public final lli m15704a() {
        int i;
        if (this.f38574c == 31 && (i = this.f38575d) != 0) {
            return new lli(i, this.f38572a, (mrm) this.f38576e, this.f38573b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f38575d == 0) {
            sb.append(" enablement");
        }
        if ((this.f38574c & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if ((this.f38574c & 2) == 0) {
            sb.append(" recordMetricPerProcess");
        }
        if ((this.f38574c & 4) == 0) {
            sb.append(" forceGcBeforeRecordMemory");
        }
        if ((this.f38574c & 8) == 0) {
            sb.append(" captureDebugMetrics");
        }
        if ((this.f38574c & 16) == 0) {
            sb.append(" captureMemoryInfo");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m15705b(boolean z) {
        this.f38575d = true != z ? 2 : 3;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, npv] */
    /* JADX INFO: renamed from: c */
    public final lgy m15706c() {
        if (this.f38574c == 7) {
            lgy lgyVar = new lgy(this.f38576e, this.f38572a, this.f38575d, this.f38573b);
            lku.m15615J(lgyVar.f38247c > 0, "Thread pool size must be less than or equal to %s", 2);
            return lgyVar;
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f38574c & 1) == 0) {
            sb.append(" primesMetricExecutorPriority");
        }
        if ((this.f38574c & 2) == 0) {
            sb.append(" primesMetricExecutorPoolSize");
        }
        if ((this.f38574c & 4) == 0) {
            sb.append(" enableDeferredTasks");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
