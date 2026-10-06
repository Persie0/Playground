package p000;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bmf {

    /* JADX INFO: renamed from: a */
    private final bgm f3758a;

    /* JADX INFO: renamed from: b */
    public final Object f3759b;

    /* JADX INFO: renamed from: c */
    public Object f3760c;

    /* JADX INFO: renamed from: d */
    public final Interpolator f3761d;

    /* JADX INFO: renamed from: e */
    public final Interpolator f3762e;

    /* JADX INFO: renamed from: f */
    public final Interpolator f3763f;

    /* JADX INFO: renamed from: g */
    public final float f3764g;

    /* JADX INFO: renamed from: h */
    public Float f3765h;

    /* JADX INFO: renamed from: i */
    public float f3766i;

    /* JADX INFO: renamed from: j */
    public float f3767j;

    /* JADX INFO: renamed from: k */
    public int f3768k;

    /* JADX INFO: renamed from: l */
    public int f3769l;

    /* JADX INFO: renamed from: m */
    public PointF f3770m;

    /* JADX INFO: renamed from: n */
    public PointF f3771n;

    /* JADX INFO: renamed from: o */
    private float f3772o;

    /* JADX INFO: renamed from: p */
    private float f3773p;

    public bmf(bgm bgmVar, Object obj, Object obj2, Interpolator interpolator, float f, Float f2) {
        this.f3766i = -3987645.8f;
        this.f3767j = -3987645.8f;
        this.f3768k = 784923401;
        this.f3769l = 784923401;
        this.f3772o = Float.MIN_VALUE;
        this.f3773p = Float.MIN_VALUE;
        this.f3770m = null;
        this.f3771n = null;
        this.f3758a = bgmVar;
        this.f3759b = obj;
        this.f3760c = obj2;
        this.f3761d = interpolator;
        this.f3762e = null;
        this.f3763f = null;
        this.f3764g = f;
        this.f3765h = f2;
    }

    public bmf(bgm bgmVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f) {
        this.f3766i = -3987645.8f;
        this.f3767j = -3987645.8f;
        this.f3768k = 784923401;
        this.f3769l = 784923401;
        this.f3772o = Float.MIN_VALUE;
        this.f3773p = Float.MIN_VALUE;
        this.f3770m = null;
        this.f3771n = null;
        this.f3758a = bgmVar;
        this.f3759b = obj;
        this.f3760c = obj2;
        this.f3761d = null;
        this.f3762e = interpolator;
        this.f3763f = interpolator2;
        this.f3764g = f;
        this.f3765h = null;
    }

    protected bmf(bgm bgmVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.f3766i = -3987645.8f;
        this.f3767j = -3987645.8f;
        this.f3768k = 784923401;
        this.f3769l = 784923401;
        this.f3772o = Float.MIN_VALUE;
        this.f3773p = Float.MIN_VALUE;
        this.f3770m = null;
        this.f3771n = null;
        this.f3758a = bgmVar;
        this.f3759b = obj;
        this.f3760c = obj2;
        this.f3761d = interpolator;
        this.f3762e = interpolator2;
        this.f3763f = interpolator3;
        this.f3764g = f;
        this.f3765h = f2;
    }

    public bmf(Object obj) {
        this.f3766i = -3987645.8f;
        this.f3767j = -3987645.8f;
        this.f3768k = 784923401;
        this.f3769l = 784923401;
        this.f3772o = Float.MIN_VALUE;
        this.f3773p = Float.MIN_VALUE;
        this.f3770m = null;
        this.f3771n = null;
        this.f3758a = null;
        this.f3759b = obj;
        this.f3760c = obj;
        this.f3761d = null;
        this.f3762e = null;
        this.f3763f = null;
        this.f3764g = Float.MIN_VALUE;
        this.f3765h = Float.valueOf(Float.MAX_VALUE);
    }

    /* JADX INFO: renamed from: b */
    public final float m2707b() {
        if (this.f3758a == null) {
            return 1.0f;
        }
        float f = this.f3773p;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        if (this.f3765h == null) {
            this.f3773p = 1.0f;
            return 1.0f;
        }
        float fFloatValue = ((this.f3765h.floatValue() - this.f3764g) / this.f3758a.m2416b()) + m2708c();
        this.f3773p = fFloatValue;
        return fFloatValue;
    }

    /* JADX INFO: renamed from: c */
    public final float m2708c() {
        bgm bgmVar = this.f3758a;
        if (bgmVar == null) {
            return 0.0f;
        }
        float f = this.f3772o;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        float fM2416b = (this.f3764g - bgmVar.f3179h) / bgmVar.m2416b();
        this.f3772o = fM2416b;
        return fM2416b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2709d(float f) {
        return f >= m2708c() && f < m2707b();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2710e() {
        return this.f3761d == null && this.f3762e == null && this.f3763f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + String.valueOf(this.f3759b) + ", endValue=" + String.valueOf(this.f3760c) + ", startFrame=" + this.f3764g + ", endFrame=" + this.f3765h + ", interpolator=" + String.valueOf(this.f3761d) + "}";
    }
}
