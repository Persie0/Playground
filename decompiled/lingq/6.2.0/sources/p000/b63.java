package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b63 {

    /* JADX INFO: renamed from: a */
    public long f7994a;

    /* JADX INFO: renamed from: b */
    public long f7995b;

    /* JADX INFO: renamed from: c */
    public long f7996c;

    /* JADX INFO: renamed from: d */
    public long f7997d;

    /* JADX INFO: renamed from: e */
    public long f7998e;

    /* JADX INFO: renamed from: f */
    public long f7999f;

    /* JADX INFO: renamed from: g */
    public final boolean[] f8000g = new boolean[15];

    /* JADX INFO: renamed from: h */
    public int f8001h;

    /* JADX INFO: renamed from: a */
    public final boolean m3345a() {
        return this.f7997d > 15 && this.f8001h == 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m3346b(long j) {
        long j2 = this.f7997d;
        if (j2 == 0) {
            this.f7994a = j;
        } else if (j2 == 1) {
            long j3 = j - this.f7994a;
            this.f7995b = j3;
            this.f7999f = j3;
            this.f7998e = 1L;
        } else {
            long j4 = j - this.f7996c;
            int i = (int) (j2 % 15);
            long jAbs = Math.abs(j4 - this.f7995b);
            boolean[] zArr = this.f8000g;
            if (jAbs <= 1000000) {
                this.f7998e++;
                this.f7999f += j4;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.f8001h--;
                }
            } else if (!zArr[i]) {
                zArr[i] = true;
                this.f8001h++;
            }
        }
        this.f7997d++;
        this.f7996c = j;
    }

    /* JADX INFO: renamed from: c */
    public final void m3347c() {
        this.f7997d = 0L;
        this.f7998e = 0L;
        this.f7999f = 0L;
        this.f8001h = 0;
        Arrays.fill(this.f8000g, false);
    }
}
