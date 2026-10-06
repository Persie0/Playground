package p000;

import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mqd {

    /* JADX INFO: renamed from: a */
    public boolean f41341a;

    /* JADX INFO: renamed from: b */
    public Duration f41342b;

    /* JADX INFO: renamed from: c */
    public int f41343c;

    /* JADX INFO: renamed from: d */
    public int f41344d;

    /* JADX INFO: renamed from: e */
    public int f41345e;

    /* JADX INFO: renamed from: f */
    public int f41346f;

    /* JADX INFO: renamed from: g */
    public int f41347g;

    /* JADX INFO: renamed from: h */
    public Duration f41348h;

    /* JADX INFO: renamed from: i */
    public byte f41349i;

    /* JADX INFO: renamed from: j */
    private int f41350j;

    /* JADX INFO: renamed from: a */
    public final mqe m16801a() {
        if (this.f41349i == 127 && this.f41342b != null && this.f41348h != null) {
            return new mqe(this.f41350j, this.f41341a, this.f41342b, this.f41343c, this.f41344d, this.f41345e, this.f41346f, this.f41347g, this.f41348h);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f41349i & 1) == 0) {
            sb.append(" targetFps");
        }
        if ((this.f41349i & 2) == 0) {
            sb.append(" trackFpsPerformance");
        }
        if (this.f41342b == null) {
            sb.append(" fpsWindowDuration");
        }
        if ((this.f41349i & 4) == 0) {
            sb.append(" expectedInputFps");
        }
        if ((this.f41349i & 8) == 0) {
            sb.append(" minInputFpsWarningThreshold");
        }
        if ((this.f41349i & 16) == 0) {
            sb.append(" maxInputFpsWarningThreshold");
        }
        if ((this.f41349i & 32) == 0) {
            sb.append(" minOutputFpsWarningThreshold");
        }
        if ((this.f41349i & 64) == 0) {
            sb.append(" maxOutputFpsWarningThreshold");
        }
        if (this.f41348h == null) {
            sb.append(" minDurationBetweenLogs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m16802b(int i) {
        this.f41350j = i;
        this.f41349i = (byte) (this.f41349i | 1);
    }
}
