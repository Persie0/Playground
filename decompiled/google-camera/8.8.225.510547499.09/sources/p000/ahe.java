package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ahe {

    /* JADX INFO: renamed from: a */
    public int f366a;

    /* JADX INFO: renamed from: b */
    public int f367b;

    /* JADX INFO: renamed from: c */
    public float f368c;

    /* JADX INFO: renamed from: d */
    public float f369d;

    /* JADX INFO: renamed from: h */
    public float f373h;

    /* JADX INFO: renamed from: i */
    public int f374i;

    /* JADX INFO: renamed from: e */
    public long f370e = Long.MIN_VALUE;

    /* JADX INFO: renamed from: g */
    public long f372g = -1;

    /* JADX INFO: renamed from: f */
    public long f371f = 0;

    /* JADX INFO: renamed from: a */
    public final float m658a(long j) {
        long j2 = this.f370e;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.f372g;
        if (j3 < 0 || j < j3) {
            return ahf.m659a((j - j2) / this.f366a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f373h;
        return (1.0f - f) + (f * ahf.m659a((j - j3) / this.f374i, 0.0f, 1.0f));
    }
}
