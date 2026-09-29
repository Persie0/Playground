package p000;

/* JADX INFO: renamed from: ak */
/* JADX INFO: loaded from: classes.dex */
public final class C0022ak {

    /* JADX INFO: renamed from: a */
    public boolean f748a;

    /* JADX INFO: renamed from: b */
    public long f749b;

    public C0022ak(boolean z, long j) {
        this.f748a = z;
        this.f749b = j;
    }

    /* JADX INFO: renamed from: b */
    public static C0022ak m509b() {
        return new C0022ak(true, -1L);
    }

    /* JADX INFO: renamed from: c */
    public static C0022ak m510c() {
        return new C0022ak(false, -1L);
    }

    /* JADX INFO: renamed from: d */
    public static C0022ak m511d(long j) {
        return new C0022ak(false, Math.max(0L, j));
    }

    /* JADX INFO: renamed from: a */
    public long m512a() {
        if (this.f748a) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.f749b - System.nanoTime());
    }
}
