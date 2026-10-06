package p000;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hnd {

    /* JADX INFO: renamed from: a */
    public static final nbh f28392a = nbh.m17259h("com/google/android/apps/camera/taxi/MacroFocusFramesProcessor");

    /* JADX INFO: renamed from: b */
    final int f28393b;

    /* JADX INFO: renamed from: c */
    final int f28394c;

    /* JADX INFO: renamed from: d */
    public final jwn f28395d;

    /* JADX INFO: renamed from: e */
    public final imu f28396e;

    /* JADX INFO: renamed from: f */
    final int f28397f;

    /* JADX INFO: renamed from: g */
    final int f28398g;

    /* JADX INFO: renamed from: h */
    public final dhv f28399h;

    /* JADX INFO: renamed from: i */
    public int f28400i;

    /* JADX INFO: renamed from: j */
    public int f28401j;

    /* JADX INFO: renamed from: k */
    public int f28402k;

    /* JADX INFO: renamed from: l */
    public boolean f28403l;

    /* JADX INFO: renamed from: m */
    public Float f28404m = Float.valueOf(1.0f);

    /* JADX INFO: renamed from: n */
    public int f28405n;

    /* JADX INFO: renamed from: o */
    public boolean f28406o;

    /* JADX INFO: renamed from: p */
    private final int f28407p;

    /* JADX INFO: renamed from: q */
    private int f28408q;

    /* JADX INFO: renamed from: r */
    private int f28409r;

    /* JADX INFO: renamed from: s */
    private boolean f28410s;

    public hnd(jwn jwnVar, imu imuVar, dhv dhvVar) {
        this.f28395d = jwnVar;
        this.f28396e = imuVar;
        this.f28399h = dhvVar;
        this.f28393b = ((Integer) dhvVar.mo6173a(dib.f11230Q).orElse(30)).intValue();
        this.f28394c = ((Integer) dhvVar.mo6173a(dib.f11231R).get()).intValue();
        this.f28407p = ((Integer) dhvVar.mo6173a(dib.f11229P).orElse(15)).intValue();
        this.f28397f = ((Integer) dhvVar.mo6173a(dib.f11233T).get()).intValue();
        this.f28398g = ((Integer) dhvVar.mo6173a(dib.f11234U).get()).intValue();
    }

    /* JADX INFO: renamed from: a */
    public final void m10485a() {
        if (this.f28403l) {
            this.f28403l = false;
            this.f28400i = 0;
        }
    }

    /* JADX INFO: renamed from: b */
    final void m10486b() {
        this.f28408q = 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m10487c() {
        this.f28409r = 0;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m10488d(kpp kppVar, int i) {
        Float f = (Float) kppVar.mo9517d(CaptureResult.LENS_FOCUS_DISTANCE);
        if (f == null) {
            return false;
        }
        if (100.0f / f.floatValue() <= this.f28407p) {
            this.f28408q = Math.min(this.f28408q + 1, i);
            m10487c();
        } else {
            this.f28409r = Math.min(this.f28409r + 1, 15);
            m10486b();
        }
        if (this.f28408q >= i) {
            this.f28410s = true;
            return true;
        }
        if (this.f28409r < 15) {
            return this.f28410s;
        }
        this.f28410s = false;
        return false;
    }
}
