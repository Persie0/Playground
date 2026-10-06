package p000;

import android.util.Range;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gvd {

    /* JADX INFO: renamed from: a */
    private final Range f26484a;

    /* JADX INFO: renamed from: b */
    private final Duration f26485b;

    /* JADX INFO: renamed from: c */
    private final Duration f26486c;

    /* JADX INFO: renamed from: d */
    private long f26487d = -1;

    /* JADX INFO: renamed from: e */
    private long f26488e = -1;

    /* JADX INFO: renamed from: f */
    private int f26489f = 0;

    public gvd(Range range, Duration duration, Duration duration2) {
        this.f26484a = range;
        this.f26485b = duration;
        this.f26486c = duration2;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m9785a(float f, long j) {
        if (this.f26487d >= 0 && this.f26484a.contains(Float.valueOf(f))) {
            this.f26489f = Math.min(this.f26489f + 1, 5);
            this.f26488e = j;
            return;
        }
        this.f26487d = j;
        this.f26489f = 0;
        this.f26488e = -1L;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m9786b() {
        this.f26489f = 0;
        this.f26487d = -1L;
        this.f26488e = -1L;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m9787c(long j) {
        if (this.f26489f >= 5 && j - this.f26487d >= this.f26485b.toNanos()) {
            long j2 = this.f26488e;
            if (j2 > -1 && j - j2 <= this.f26486c.toNanos()) {
                return true;
            }
        }
        return false;
    }
}
