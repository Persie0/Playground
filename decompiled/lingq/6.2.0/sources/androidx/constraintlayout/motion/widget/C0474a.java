package androidx.constraintlayout.motion.widget;

/* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C0474a {

    /* JADX INFO: renamed from: a */
    public float f5361a = Float.NaN;

    /* JADX INFO: renamed from: b */
    public float f5362b = Float.NaN;

    /* JADX INFO: renamed from: c */
    public int f5363c = -1;

    /* JADX INFO: renamed from: d */
    public int f5364d = -1;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC0475b f5365e;

    public C0474a(AbstractC0475b abstractC0475b) {
        this.f5365e = abstractC0475b;
    }

    /* JADX INFO: renamed from: a */
    public final void m1934a() {
        int i = this.f5363c;
        AbstractC0475b abstractC0475b = this.f5365e;
        if (i != -1 || this.f5364d != -1) {
            int i2 = this.f5364d;
            if (i == -1) {
                abstractC0475b.m1949z(i2);
            } else if (i2 == -1) {
                abstractC0475b.m1946w(i);
            } else {
                abstractC0475b.m1947x(i, i2);
            }
            abstractC0475b.setState(MotionLayout$TransitionState.SETUP);
        }
        boolean zIsNaN = Float.isNaN(this.f5362b);
        float f = this.f5361a;
        if (zIsNaN) {
            if (Float.isNaN(f)) {
                return;
            }
            abstractC0475b.setProgress(this.f5361a);
            return;
        }
        float f2 = this.f5362b;
        if (abstractC0475b.isAttachedToWindow()) {
            abstractC0475b.setProgress(f);
            abstractC0475b.setState(MotionLayout$TransitionState.MOVING);
            abstractC0475b.f5384O = f2;
            if (f2 != 0.0f) {
                abstractC0475b.m1939p(f2 > 0.0f ? 1.0f : 0.0f);
            } else if (f != 0.0f && f != 1.0f) {
                abstractC0475b.m1939p(f > 0.5f ? 1.0f : 0.0f);
            }
        } else {
            if (abstractC0475b.f5375I0 == null) {
                abstractC0475b.f5375I0 = new C0474a(abstractC0475b);
            }
            C0474a c0474a = abstractC0475b.f5375I0;
            c0474a.f5361a = f;
            c0474a.f5362b = f2;
        }
        this.f5361a = Float.NaN;
        this.f5362b = Float.NaN;
        this.f5363c = -1;
        this.f5364d = -1;
    }
}
