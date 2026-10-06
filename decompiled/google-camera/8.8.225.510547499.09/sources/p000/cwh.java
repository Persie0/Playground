package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum cwh {
    FPS_30(20000001, 33333333, 1.0f),
    f9872b(0, 20000000, 1.5f);


    /* JADX INFO: renamed from: c */
    public final float f9874c;

    /* JADX INFO: renamed from: e */
    private final long f9875e;

    /* JADX INFO: renamed from: f */
    private final long f9876f;

    cwh(long j, long j2, float f) {
        this.f9875e = j;
        this.f9876f = j2;
        this.f9874c = f;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5679a(long j) {
        return j >= this.f9875e && j <= this.f9876f;
    }
}
