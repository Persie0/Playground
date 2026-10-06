package p000;

import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class crx {

    /* JADX INFO: renamed from: a */
    private static final nbh f9194a = nbh.m17259h("com/google/android/apps/camera/camcorder/audio/processor/util/AudioTimestampRangeQueue");

    /* JADX INFO: renamed from: b */
    private final int f9195b;

    /* JADX INFO: renamed from: c */
    private final int f9196c;

    /* JADX INFO: renamed from: d */
    private boolean f9197d;

    /* JADX INFO: renamed from: e */
    private long f9198e = Long.MIN_VALUE;

    /* JADX INFO: renamed from: f */
    private long f9199f = Long.MIN_VALUE;

    /* JADX INFO: renamed from: g */
    private int f9200g;

    public crx(int i, int i2) {
        lku.m15669w(i > 0);
        lku.m15669w(i2 > 0);
        this.f9195b = i;
        this.f9196c = i2;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m5443a(int i) {
        long j;
        int i2 = this.f9200g;
        lku.m15608C(i <= i2, "The polled length %s is greater than total length %s.", i, i2);
        j = this.f9198e;
        long j2 = this.f9199f - j;
        int i3 = this.f9200g;
        long j3 = ((j2 * ((long) i)) / ((long) i3)) + j;
        if (i == i3) {
            this.f9198e = Long.MIN_VALUE;
            this.f9199f = Long.MIN_VALUE;
            this.f9200g = 0;
        } else {
            this.f9198e = j3;
            this.f9200g = i3 - i;
        }
        return j;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5444b(long j, int i) {
        lku.m15669w(i > 0);
        if (!this.f9197d) {
            this.f9197d = true;
        }
        if (this.f9200g + i > this.f9196c) {
            ((nbe) ((nbe) f9194a.m17252c()).mo17276G((char) 566)).mo17290o("The size offered is over the capacity.");
            return;
        }
        if (this.f9198e == Long.MIN_VALUE) {
            this.f9198e = j;
        }
        this.f9199f = j + (((Duration.ofSeconds(1L).toNanos() * ((long) i)) * 8) / ((long) this.f9195b));
        this.f9200g += i;
    }
}
