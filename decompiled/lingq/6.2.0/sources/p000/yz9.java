package p000;

/* JADX INFO: loaded from: classes.dex */
public final class yz9 {

    /* JADX INFO: renamed from: a */
    public final t56 f70710a;

    /* JADX INFO: renamed from: b */
    public xz9 f70711b;

    /* JADX INFO: renamed from: c */
    public long f70712c;

    /* JADX INFO: renamed from: d */
    public long f70713d;

    /* JADX INFO: renamed from: e */
    public long f70714e;

    /* JADX INFO: renamed from: f */
    public long f70715f;

    /* JADX INFO: renamed from: g */
    public float[] f70716g;

    public yz9() {
        t56 t56Var = e84.f36837a;
        this.f70710a = new t56();
        this.f70712c = -1L;
        this.f70713d = 0L;
        this.f70714e = 0L;
    }

    /* JADX INFO: renamed from: a */
    public static long m25390a(xz9 xz9Var, long j, long j2, float[] fArr, long j3, long j4) {
        long j5 = xz9Var.f69023b;
        if (j5 > 0) {
            long j6 = xz9Var.f69030i;
            if (j6 > 0) {
                if (j3 - j6 < j5) {
                    return Math.min(j4, j6 + j5);
                }
                xz9Var.f69029h = j3;
                xz9Var.f69030i = -1L;
                xz9Var.m24799a(xz9Var.f69027f, xz9Var.f69028g, j, j2, fArr);
                return j4;
            }
        }
        return j4;
    }

    /* JADX INFO: renamed from: b */
    public final void m25391b(xz9 xz9Var, long j, long j2, float[] fArr, long j3) {
        long j4 = xz9Var.f69029h;
        long j5 = xz9Var.f69023b;
        boolean z = j3 - j4 > 0 || j4 == Long.MIN_VALUE;
        boolean z2 = j5 == 0;
        xz9Var.f69030i = j3;
        if (z && z2) {
            xz9Var.f69029h = j3;
            xz9Var.m24799a(xz9Var.f69027f, xz9Var.f69028g, j, j2, fArr);
        }
        if (z2) {
            return;
        }
        long j6 = this.f70712c;
        long j7 = j3 + j5;
        if (j6 <= 0 || j7 >= j6) {
            return;
        }
        this.f70712c = j6;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m25392c(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (f84.m11593b(j2, this.f70713d)) {
            z = false;
        } else {
            this.f70713d = j2;
            z = true;
        }
        if (!f84.m11593b(j, this.f70714e)) {
            this.f70714e = j;
            z = true;
        }
        if (fArr != null) {
            this.f70716g = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.f70715f) {
            return z;
        }
        this.f70715f = j3;
        return true;
    }
}
