package p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.Choreographer;
import com.airbnb.lottie.AsyncUpdates;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
public final class dm5 extends ValueAnimator implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: l */
    public gl5 f35837l;

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArraySet f35826a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArraySet f35827b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArraySet f35828c = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: d */
    public float f35829d = 1.0f;

    /* JADX INFO: renamed from: e */
    public boolean f35830e = false;

    /* JADX INFO: renamed from: f */
    public long f35831f = 0;

    /* JADX INFO: renamed from: g */
    public float f35832g = 0.0f;

    /* JADX INFO: renamed from: h */
    public float f35833h = 0.0f;

    /* JADX INFO: renamed from: i */
    public int f35834i = 0;

    /* JADX INFO: renamed from: j */
    public float f35835j = -2.1474836E9f;

    /* JADX INFO: renamed from: k */
    public float f35836k = 2.1474836E9f;

    /* JADX INFO: renamed from: H */
    public boolean f35824H = false;

    /* JADX INFO: renamed from: I */
    public boolean f35825I = false;

    /* JADX INFO: renamed from: a */
    public final float m10473a() {
        gl5 gl5Var = this.f35837l;
        if (gl5Var == null) {
            return 0.0f;
        }
        float f = this.f35833h;
        float f2 = gl5Var.f40968l;
        return (f - f2) / (gl5Var.f40969m - f2);
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f35827b.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f35828c.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f35826a.add(animatorUpdateListener);
    }

    /* JADX INFO: renamed from: b */
    public final float m10474b() {
        gl5 gl5Var = this.f35837l;
        if (gl5Var == null) {
            return 0.0f;
        }
        float f = this.f35836k;
        return f == 2.1474836E9f ? gl5Var.f40969m : f;
    }

    /* JADX INFO: renamed from: c */
    public final float m10475c() {
        gl5 gl5Var = this.f35837l;
        if (gl5Var == null) {
            return 0.0f;
        }
        float f = this.f35835j;
        return f == -2.1474836E9f ? gl5Var.f40968l : f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f35827b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        m10477e(m10476d());
        m10479g(true);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m10476d() {
        return this.f35829d < 0.0f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z = false;
        if (this.f35824H) {
            m10479g(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        gl5 gl5Var = this.f35837l;
        if (gl5Var == null || !this.f35824H) {
            return;
        }
        AsyncUpdates asyncUpdates = wk4.f66962a;
        long j2 = this.f35831f;
        float fAbs = (j2 != 0 ? j - j2 : 0L) / ((1.0E9f / gl5Var.f40970n) / Math.abs(this.f35829d));
        float f = this.f35832g;
        if (m10476d()) {
            fAbs = -fAbs;
        }
        float f2 = f + fAbs;
        float fM10475c = m10475c();
        float fM10474b = m10474b();
        PointF pointF = f06.f38140a;
        if (f2 >= fM10475c && f2 <= fM10474b) {
            z = true;
        }
        float f3 = this.f35832g;
        float fM11421b = f06.m11421b(f2, m10475c(), m10474b());
        this.f35832g = fM11421b;
        if (this.f35825I) {
            fM11421b = (float) Math.floor(fM11421b);
        }
        this.f35833h = fM11421b;
        this.f35831f = j;
        if (z) {
            if (!this.f35825I || this.f35832g != f3) {
                m10478f();
            }
        } else if (getRepeatCount() == -1 || this.f35834i < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.f35830e = !this.f35830e;
                this.f35829d = -this.f35829d;
            } else {
                float fM10474b2 = m10476d() ? m10474b() : m10475c();
                this.f35832g = fM10474b2;
                this.f35833h = fM10474b2;
            }
            this.f35831f = j;
            if (!this.f35825I || this.f35832g != f3) {
                m10478f();
            }
            Iterator it = this.f35827b.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
            }
            this.f35834i++;
        } else {
            float fM10475c2 = this.f35829d < 0.0f ? m10475c() : m10474b();
            this.f35832g = fM10475c2;
            this.f35833h = fM10475c2;
            m10479g(true);
            if (!this.f35825I || this.f35832g != f3) {
                m10478f();
            }
            m10477e(m10476d());
        }
        if (this.f35837l != null) {
            float f4 = this.f35833h;
            float f5 = this.f35835j;
            if (f4 < f5 || f4 > this.f35836k) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f5), Float.valueOf(this.f35836k), Float.valueOf(this.f35833h)));
            }
        }
        AsyncUpdates asyncUpdates2 = wk4.f66962a;
    }

    /* JADX INFO: renamed from: e */
    public final void m10477e(boolean z) {
        Iterator it = this.f35827b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationEnd(this, z);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m10478f() {
        Iterator it = this.f35826a.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m10479g(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f35824H = false;
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fM10475c;
        float fM10474b;
        float fM10475c2;
        if (this.f35837l == null) {
            return 0.0f;
        }
        if (m10476d()) {
            fM10475c = m10474b() - this.f35833h;
            fM10474b = m10474b();
            fM10475c2 = m10475c();
        } else {
            fM10475c = this.f35833h - m10475c();
            fM10474b = m10474b();
            fM10475c2 = m10475c();
        }
        return fM10475c / (fM10474b - fM10475c2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(m10473a());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        gl5 gl5Var = this.f35837l;
        if (gl5Var == null) {
            return 0L;
        }
        return (long) gl5Var.m12729c();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    /* JADX INFO: renamed from: h */
    public final void m10480h(float f) {
        if (this.f35832g == f) {
            return;
        }
        float fM11421b = f06.m11421b(f, m10475c(), m10474b());
        this.f35832g = fM11421b;
        if (this.f35825I) {
            fM11421b = (float) Math.floor(fM11421b);
        }
        this.f35833h = fM11421b;
        this.f35831f = 0L;
        m10478f();
    }

    /* JADX INFO: renamed from: i */
    public final void m10481i(float f, float f2) {
        if (f > f2) {
            ij6.m13953k("minFrame (", f, ") must be <= maxFrame (", f2, ")");
            return;
        }
        gl5 gl5Var = this.f35837l;
        float f3 = gl5Var == null ? -3.4028235E38f : gl5Var.f40968l;
        float f4 = gl5Var == null ? Float.MAX_VALUE : gl5Var.f40969m;
        float fM11421b = f06.m11421b(f, f3, f4);
        float fM11421b2 = f06.m11421b(f2, f3, f4);
        if (fM11421b == this.f35835j && fM11421b2 == this.f35836k) {
            return;
        }
        this.f35835j = fM11421b;
        this.f35836k = fM11421b2;
        m10480h((int) f06.m11421b(this.f35833h, fM11421b, fM11421b2));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f35824H;
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.f35827b.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.f35826a.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f35827b.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f35828c.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f35826a.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.f35830e) {
            return;
        }
        this.f35830e = false;
        this.f35829d = -this.f35829d;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j) {
        setDuration(j);
        throw null;
    }
}
