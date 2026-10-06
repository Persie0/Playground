package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dgw {

    /* JADX INFO: renamed from: a */
    public static final float f10990a = (float) Math.toRadians(15.0d);

    /* JADX INFO: renamed from: b */
    public static final float f10991b = (float) Math.toRadians(15.0d);

    /* JADX INFO: renamed from: g */
    private static final float f10992g = (float) Math.toRadians(15.0d);

    /* JADX INFO: renamed from: h */
    private static final float f10993h = (float) Math.toRadians(15.0d);

    /* JADX INFO: renamed from: c */
    public final float f10994c;

    /* JADX INFO: renamed from: d */
    public final float f10995d;

    /* JADX INFO: renamed from: e */
    public mrm f10996e;

    /* JADX INFO: renamed from: f */
    public mrm f10997f;

    /* JADX INFO: renamed from: i */
    private final long f10998i;

    static {
        Math.toRadians(20.0d);
        Math.toRadians(20.0d);
    }

    public dgw(dhv dhvVar) {
        mqu mquVar = mqu.f41450a;
        this.f10996e = mquVar;
        this.f10997f = mquVar;
        if (dhvVar.mo6184l(dhi.f11124k)) {
            dhvVar.mo6179g();
        }
        lku.m15614I(true, "camera.coach.fast_up_down and camera.coach.instant_up_down should not be enabled at the same time.");
        if (dhvVar.mo6184l(dhi.f11124k)) {
            this.f10998i = 1000L;
            this.f10994c = f10992g;
            this.f10995d = f10993h;
        } else {
            dhvVar.mo6179g();
            this.f10998i = 4000L;
            this.f10994c = f10992g;
            this.f10995d = f10993h;
        }
    }

    /* JADX INFO: renamed from: a */
    final synchronized void m6128a(float f, float f2, long j) {
        this.f10996e = mrm.m16829i(new dgv(f, f2));
        if (!this.f10997f.mo16813g()) {
            this.f10997f = mrm.m16829i(new dhe(new dgj(this, 2), new dgj(this, 3), this.f10998i));
        }
        ((dhe) this.f10997f.mo16809c()).m6148b(j);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m6129b() {
        mqu mquVar = mqu.f41450a;
        this.f10996e = mquVar;
        this.f10997f = mquVar;
    }
}
