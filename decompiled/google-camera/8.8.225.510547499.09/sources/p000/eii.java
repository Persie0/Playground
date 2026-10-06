package p000;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class eii {

    /* JADX INFO: renamed from: a */
    public float f14136a;

    /* JADX INFO: renamed from: b */
    private float f14137b;

    /* JADX INFO: renamed from: c */
    private int f14138c;

    /* JADX INFO: renamed from: d */
    private long f14139d;

    /* JADX INFO: renamed from: e */
    private long f14140e;

    /* JADX INFO: renamed from: f */
    private int f14141f = 1;

    /* JADX INFO: renamed from: a */
    public final void m7355a() {
        this.f14136a = 0.0f;
        this.f14137b = 0.0015f;
        this.f14138c = 0;
        this.f14139d = 0L;
        this.f14141f = 1;
        this.f14140e = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: b */
    public final void m7356b() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.f14140e;
        this.f14140e = jElapsedRealtime;
        int i = this.f14141f;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                float f = j;
                float f2 = this.f14137b + ((-7.0E-6f) * f);
                this.f14137b = f2;
                float f3 = this.f14136a + (f * f2);
                this.f14136a = f3;
                if (f3 < 0.0f) {
                    int i3 = this.f14138c + 1;
                    this.f14138c = i3;
                    this.f14136a = 0.0f;
                    this.f14137b = -(f2 * 0.55f);
                    if (i3 >= 2) {
                        this.f14141f = 2;
                        this.f14137b = 0.0015f;
                        this.f14138c = 0;
                        this.f14139d = 0L;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                long j2 = this.f14139d + j;
                this.f14139d = j2;
                if (j2 >= 800) {
                    this.f14141f = 1;
                    return;
                }
                return;
            default:
                return;
        }
    }
}
