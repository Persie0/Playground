package p000;

/* JADX INFO: loaded from: classes.dex */
public final class tt8 {

    /* JADX INFO: renamed from: c */
    public static final tt8 f62866c;

    /* JADX INFO: renamed from: d */
    public static final tt8 f62867d;

    /* JADX INFO: renamed from: a */
    public final long f62868a;

    /* JADX INFO: renamed from: b */
    public final long f62869b;

    static {
        tt8 tt8Var = new tt8(0L, 0L);
        new tt8(Long.MAX_VALUE, Long.MAX_VALUE);
        f62866c = new tt8(Long.MAX_VALUE, 0L);
        new tt8(0L, Long.MAX_VALUE);
        f62867d = tt8Var;
    }

    public tt8(long j, long j2) {
        bna.m3969q(j >= 0);
        bna.m3969q(j2 >= 0);
        this.f62868a = j;
        this.f62869b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tt8.class == obj.getClass()) {
            tt8 tt8Var = (tt8) obj;
            if (this.f62868a == tt8Var.f62868a && this.f62869b == tt8Var.f62869b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f62868a) * 31) + ((int) this.f62869b);
    }
}
