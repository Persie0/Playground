package p000;

import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gtr {

    /* JADX INFO: renamed from: a */
    private static final long f26383a = Duration.ofSeconds(1).toNanos();

    /* JADX INFO: renamed from: b */
    private final long f26384b;

    /* JADX INFO: renamed from: c */
    private long f26385c = 0;

    private gtr(long j) {
        this.f26384b = j;
    }

    /* JADX INFO: renamed from: b */
    public static gtr m9767b() {
        lku.m15606A(true, "permitsPerSecond must be > 0: %s", 17L);
        return new gtr(f26383a / 17);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9768a(long j) {
        if (j - this.f26385c < this.f26384b) {
            return false;
        }
        this.f26385c = j;
        return true;
    }
}
