package p000;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes2.dex */
public class kj4 {

    /* JADX INFO: renamed from: a */
    public final gl5 f47377a;

    /* JADX INFO: renamed from: b */
    public final Object f47378b;

    /* JADX INFO: renamed from: c */
    public Object f47379c;

    /* JADX INFO: renamed from: d */
    public final Interpolator f47380d;

    /* JADX INFO: renamed from: e */
    public final Interpolator f47381e;

    /* JADX INFO: renamed from: f */
    public final Interpolator f47382f;

    /* JADX INFO: renamed from: g */
    public final float f47383g;

    /* JADX INFO: renamed from: h */
    public Float f47384h;

    /* JADX INFO: renamed from: i */
    public float f47385i;

    /* JADX INFO: renamed from: j */
    public float f47386j;

    /* JADX INFO: renamed from: k */
    public int f47387k;

    /* JADX INFO: renamed from: l */
    public int f47388l;

    /* JADX INFO: renamed from: m */
    public float f47389m;

    /* JADX INFO: renamed from: n */
    public float f47390n;

    /* JADX INFO: renamed from: o */
    public PointF f47391o;

    /* JADX INFO: renamed from: p */
    public PointF f47392p;

    public kj4(Object obj) {
        this.f47385i = -3987645.8f;
        this.f47386j = -3987645.8f;
        this.f47387k = 784923401;
        this.f47388l = 784923401;
        this.f47389m = Float.MIN_VALUE;
        this.f47390n = Float.MIN_VALUE;
        this.f47391o = null;
        this.f47392p = null;
        this.f47377a = null;
        this.f47378b = obj;
        this.f47379c = obj;
        this.f47380d = null;
        this.f47381e = null;
        this.f47382f = null;
        this.f47383g = Float.MIN_VALUE;
        this.f47384h = Float.valueOf(Float.MAX_VALUE);
    }

    /* JADX INFO: renamed from: a */
    public final float m15269a() {
        gl5 gl5Var = this.f47377a;
        if (gl5Var == null) {
            return 1.0f;
        }
        if (this.f47390n == Float.MIN_VALUE) {
            if (this.f47384h == null) {
                this.f47390n = 1.0f;
            } else {
                this.f47390n = (float) (((double) m15270b()) + (((double) (this.f47384h.floatValue() - this.f47383g)) / ((double) (gl5Var.f40969m - gl5Var.f40968l))));
            }
        }
        return this.f47390n;
    }

    /* JADX INFO: renamed from: b */
    public final float m15270b() {
        gl5 gl5Var = this.f47377a;
        if (gl5Var == null) {
            return 0.0f;
        }
        if (this.f47389m == Float.MIN_VALUE) {
            float f = gl5Var.f40968l;
            this.f47389m = (this.f47383g - f) / (gl5Var.f40969m - f);
        }
        return this.f47389m;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m15271c() {
        return this.f47380d == null && this.f47381e == null && this.f47382f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f47378b + ", endValue=" + this.f47379c + ", startFrame=" + this.f47383g + ", endFrame=" + this.f47384h + ", interpolator=" + this.f47380d + '}';
    }

    public kj4(gl5 gl5Var, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f) {
        this.f47385i = -3987645.8f;
        this.f47386j = -3987645.8f;
        this.f47387k = 784923401;
        this.f47388l = 784923401;
        this.f47389m = Float.MIN_VALUE;
        this.f47390n = Float.MIN_VALUE;
        this.f47391o = null;
        this.f47392p = null;
        this.f47377a = gl5Var;
        this.f47378b = obj;
        this.f47379c = obj2;
        this.f47380d = null;
        this.f47381e = interpolator;
        this.f47382f = interpolator2;
        this.f47383g = f;
        this.f47384h = null;
    }

    public kj4(gl5 gl5Var, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.f47385i = -3987645.8f;
        this.f47386j = -3987645.8f;
        this.f47387k = 784923401;
        this.f47388l = 784923401;
        this.f47389m = Float.MIN_VALUE;
        this.f47390n = Float.MIN_VALUE;
        this.f47391o = null;
        this.f47392p = null;
        this.f47377a = gl5Var;
        this.f47378b = obj;
        this.f47379c = obj2;
        this.f47380d = interpolator;
        this.f47381e = interpolator2;
        this.f47382f = interpolator3;
        this.f47383g = f;
        this.f47384h = f2;
    }

    public kj4(gl5 gl5Var, Object obj, Object obj2, Interpolator interpolator, float f, Float f2) {
        this.f47385i = -3987645.8f;
        this.f47386j = -3987645.8f;
        this.f47387k = 784923401;
        this.f47388l = 784923401;
        this.f47389m = Float.MIN_VALUE;
        this.f47390n = Float.MIN_VALUE;
        this.f47391o = null;
        this.f47392p = null;
        this.f47377a = gl5Var;
        this.f47378b = obj;
        this.f47379c = obj2;
        this.f47380d = interpolator;
        this.f47381e = null;
        this.f47382f = null;
        this.f47383g = f;
        this.f47384h = f2;
    }

    public kj4(ap3 ap3Var, ap3 ap3Var2) {
        this.f47385i = -3987645.8f;
        this.f47386j = -3987645.8f;
        this.f47387k = 784923401;
        this.f47388l = 784923401;
        this.f47389m = Float.MIN_VALUE;
        this.f47390n = Float.MIN_VALUE;
        this.f47391o = null;
        this.f47392p = null;
        this.f47377a = null;
        this.f47378b = ap3Var;
        this.f47379c = ap3Var2;
        this.f47380d = null;
        this.f47381e = null;
        this.f47382f = null;
        this.f47383g = Float.MIN_VALUE;
        this.f47384h = Float.valueOf(Float.MAX_VALUE);
    }
}
