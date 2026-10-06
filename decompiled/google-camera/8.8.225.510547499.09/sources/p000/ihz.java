package p000;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ihz implements fbp, fbn {

    /* JADX INFO: renamed from: a */
    public final jwf f31027a = new jwf(Boolean.FALSE);

    /* JADX INFO: renamed from: b */
    public final jwf f31028b = new jwf(0);

    /* JADX INFO: renamed from: c */
    public final jwf f31029c = new jwf(Float.valueOf(1.0f));

    /* JADX INFO: renamed from: d */
    public final jwf f31030d = new jwf(Float.valueOf(0.0f));

    /* JADX INFO: renamed from: e */
    public final float f31031e;

    /* JADX INFO: renamed from: f */
    public long f31032f;

    /* JADX INFO: renamed from: g */
    public long f31033g;

    /* JADX INFO: renamed from: h */
    private final Interpolator f31034h;

    /* JADX INFO: renamed from: i */
    private final long f31035i;

    /* JADX INFO: renamed from: j */
    private final int f31036j;

    /* JADX INFO: renamed from: k */
    private final float f31037k;

    /* JADX INFO: renamed from: l */
    private final float f31038l;

    public ihz(long j, int i, float f, float f2, float f3, Interpolator interpolator) {
        lku.m15669w(j > 0);
        lku.m15669w(i > 0);
        lku.m15669w(f > 1.0f);
        this.f31035i = j;
        this.f31036j = i;
        this.f31037k = f;
        this.f31038l = f2;
        this.f31031e = f3;
        this.f31034h = interpolator;
        this.f31032f = 0L;
        this.f31033g = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m11373a() {
        float f;
        lku.m15613H(this.f31032f <= this.f31033g);
        long j = this.f31033g;
        long j2 = this.f31032f;
        long j3 = this.f31035i;
        if (j >= j2 + j3) {
            f = 1.0f;
        } else {
            f = (j - j2) / j3;
        }
        float interpolation = 1.0f - this.f31034h.getInterpolation(f);
        this.f31028b.mo3415bf(Integer.valueOf((int) (this.f31036j * interpolation)));
        this.f31029c.mo3415bf(Float.valueOf((interpolation * (this.f31037k - 1.0f)) + 1.0f));
        jwf jwfVar = this.f31030d;
        float f2 = this.f31038l;
        jwfVar.mo3415bf(Float.valueOf(f2 + ((1.0f - f2) * f)));
        this.f31027a.mo3415bf(Boolean.valueOf(f < 1.0f));
    }

    @Override // p000.fbn
    /* JADX INFO: renamed from: bG */
    public final void mo3524bG() {
        this.f31032f = 0L;
        this.f31033g = 0L;
        m11373a();
    }
}
