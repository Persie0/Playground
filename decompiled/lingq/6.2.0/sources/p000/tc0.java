package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class tc0 {

    /* JADX INFO: renamed from: a */
    public final long f62122a;

    /* JADX INFO: renamed from: b */
    public final long f62123b;

    /* JADX INFO: renamed from: c */
    public final long f62124c;

    /* JADX INFO: renamed from: d */
    public long f62125d = 0;

    /* JADX INFO: renamed from: e */
    public long f62126e;

    /* JADX INFO: renamed from: f */
    public long f62127f;

    /* JADX INFO: renamed from: g */
    public long f62128g;

    /* JADX INFO: renamed from: h */
    public long f62129h;

    public tc0(long j, long j2, long j3, long j4, long j5, long j6) {
        this.f62122a = j;
        this.f62123b = j2;
        this.f62126e = j3;
        this.f62127f = j4;
        this.f62128g = j5;
        this.f62124c = j6;
        this.f62129h = m21946a(j2, 0L, j3, j4, j5, j6);
    }

    /* JADX INFO: renamed from: a */
    public static long m21946a(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || j2 + 1 >= j3) {
            return j4;
        }
        long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
        return uma.m22813h(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
    }
}
