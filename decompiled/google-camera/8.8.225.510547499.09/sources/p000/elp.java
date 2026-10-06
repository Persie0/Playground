package p000;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class elp {

    /* JADX INFO: renamed from: b */
    public Object f14613b;

    /* JADX INFO: renamed from: c */
    public Object f14614c;

    /* JADX INFO: renamed from: d */
    private final Object f14615d;

    /* JADX INFO: renamed from: a */
    public float f14612a = 0.0f;

    /* JADX INFO: renamed from: f */
    private int f14617f = 4;

    /* JADX INFO: renamed from: e */
    private long f14616e = SystemClock.elapsedRealtime();

    public elp(Object obj) {
        this.f14615d = obj;
        this.f14613b = obj;
        this.f14614c = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m7462a() {
        this.f14612a = 0.0f;
        this.f14617f = 4;
        Object obj = this.f14615d;
        this.f14613b = obj;
        this.f14614c = obj;
        this.f14616e = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: b */
    public final void m7463b() {
        String str;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.f14616e;
        this.f14616e = jElapsedRealtime;
        int i = this.f14617f;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                float f = this.f14612a + (j / 200.0f);
                this.f14612a = f;
                if (f >= 1.0f) {
                    this.f14612a = 1.0f;
                    if (this.f14614c != this.f14613b) {
                        this.f14617f = 3;
                        return;
                    } else {
                        this.f14617f = 2;
                        return;
                    }
                }
                return;
            case 1:
                if (this.f14614c != this.f14613b) {
                    this.f14617f = 3;
                    return;
                }
                return;
            case 2:
                float f2 = this.f14612a - (j / 200.0f);
                this.f14612a = f2;
                Object obj = this.f14614c;
                if (obj == this.f14613b) {
                    this.f14617f = 1;
                    return;
                } else {
                    if (f2 <= 0.0f) {
                        this.f14612a = 0.0f;
                        this.f14617f = 4;
                        this.f14613b = obj;
                        return;
                    }
                    return;
                }
            case 3:
                Object obj2 = this.f14614c;
                if (obj2 != this.f14615d) {
                    this.f14613b = obj2;
                    this.f14617f = 1;
                    float f3 = this.f14612a + (j / 200.0f);
                    this.f14612a = f3;
                    if (f3 >= 1.0f) {
                        this.f14612a = 1.0f;
                        return;
                    }
                    return;
                }
                return;
            default:
                switch (i) {
                    case 1:
                        str = "FADING_IN";
                        break;
                    case 2:
                        str = "FADED_IN";
                        break;
                    case 3:
                        str = "FADING_OUT";
                        break;
                    default:
                        str = "FADED_OUT";
                        break;
                }
                throw new RuntimeException("Unhandled FadeState: ".concat(str));
        }
    }
}
