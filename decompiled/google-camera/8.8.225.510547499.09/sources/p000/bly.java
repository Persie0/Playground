package p000;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bly extends blv implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: h */
    public bgm f3734h;

    /* JADX INFO: renamed from: b */
    public float f3728b = 1.0f;

    /* JADX INFO: renamed from: j */
    private boolean f3736j = false;

    /* JADX INFO: renamed from: c */
    public long f3729c = 0;

    /* JADX INFO: renamed from: d */
    public float f3730d = 0.0f;

    /* JADX INFO: renamed from: e */
    public int f3731e = 0;

    /* JADX INFO: renamed from: f */
    public float f3732f = -2.1474836E9f;

    /* JADX INFO: renamed from: g */
    public float f3733g = 2.1474836E9f;

    /* JADX INFO: renamed from: i */
    public boolean f3735i = false;

    /* JADX INFO: renamed from: c */
    public final float m2682c() {
        bgm bgmVar = this.f3734h;
        if (bgmVar == null) {
            return 0.0f;
        }
        float f = this.f3730d;
        float f2 = bgmVar.f3179h;
        return (f - f2) / (bgmVar.f3180i - f2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f3723a.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        m2687h();
    }

    /* JADX INFO: renamed from: d */
    public final float m2683d() {
        bgm bgmVar = this.f3734h;
        if (bgmVar == null) {
            return 0.0f;
        }
        float f = this.f3733g;
        return f == 2.1474836E9f ? bgmVar.f3180i : f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        m2686g();
        bgm bgmVar = this.f3734h;
        if (bgmVar == null || !this.f3735i) {
            return;
        }
        long j2 = this.f3729c;
        long j3 = j2 != 0 ? j - j2 : 0L;
        float fAbs = (1.0E9f / bgmVar.f3181j) / Math.abs(this.f3728b);
        float f = this.f3730d;
        float f2 = j3 / fAbs;
        if (m2692m()) {
            f2 = -f2;
        }
        float f3 = f + f2;
        this.f3730d = f3;
        float fM2684e = m2684e();
        float fM2683d = m2683d();
        PointF pointF = blz.f3737a;
        boolean z = f3 >= fM2684e && f3 <= fM2683d;
        this.f3730d = blz.m2693a(this.f3730d, m2684e(), m2683d());
        this.f3729c = j;
        m2679b();
        if (!z) {
            if (getRepeatCount() == -1 || this.f3731e < getRepeatCount()) {
                Iterator it = this.f3723a.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                }
                this.f3731e++;
                if (getRepeatMode() == 2) {
                    this.f3736j = !this.f3736j;
                    m2689j();
                } else {
                    this.f3730d = m2692m() ? m2683d() : m2684e();
                }
                this.f3729c = j;
            } else {
                this.f3730d = this.f3728b < 0.0f ? m2684e() : m2683d();
                m2687h();
                m2678a(m2692m());
            }
        }
        if (this.f3734h != null) {
            float f4 = this.f3730d;
            float f5 = this.f3732f;
            if (f4 < f5 || f4 > this.f3733g) {
                throw new IllegalStateException(String.format(YmzeHXaMYOLk.SvrIJ, Float.valueOf(f5), Float.valueOf(this.f3733g), Float.valueOf(this.f3730d)));
            }
        }
        bgh.m2413a();
    }

    /* JADX INFO: renamed from: e */
    public final float m2684e() {
        bgm bgmVar = this.f3734h;
        if (bgmVar == null) {
            return 0.0f;
        }
        float f = this.f3732f;
        return f == -2.1474836E9f ? bgmVar.f3179h : f;
    }

    /* JADX INFO: renamed from: f */
    public final void m2685f() {
        m2687h();
        m2678a(m2692m());
    }

    /* JADX INFO: renamed from: g */
    public final void m2686g() {
        if (this.f3735i) {
            m2688i(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fM2683d;
        float fM2684e;
        if (this.f3734h == null) {
            return 0.0f;
        }
        if (m2692m()) {
            fM2683d = m2683d();
            fM2684e = this.f3730d;
        } else {
            fM2683d = this.f3730d;
            fM2684e = m2684e();
        }
        return (fM2683d - fM2684e) / (m2683d() - m2684e());
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(m2682c());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        bgm bgmVar = this.f3734h;
        if (bgmVar == null) {
            return 0L;
        }
        return (long) bgmVar.m2415a();
    }

    /* JADX INFO: renamed from: h */
    public final void m2687h() {
        m2688i(true);
    }

    /* JADX INFO: renamed from: i */
    protected final void m2688i(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f3735i = false;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f3735i;
    }

    /* JADX INFO: renamed from: j */
    public final void m2689j() {
        this.f3728b = -this.f3728b;
    }

    /* JADX INFO: renamed from: k */
    public final void m2690k(float f) {
        if (this.f3730d == f) {
            return;
        }
        this.f3730d = blz.m2693a(f, m2684e(), m2683d());
        this.f3729c = 0L;
        m2679b();
    }

    /* JADX INFO: renamed from: l */
    public final void m2691l(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        bgm bgmVar = this.f3734h;
        float f3 = bgmVar == null ? -3.4028235E38f : bgmVar.f3179h;
        float f4 = bgmVar == null ? Float.MAX_VALUE : bgmVar.f3180i;
        float fM2693a = blz.m2693a(f, f3, f4);
        float fM2693a2 = blz.m2693a(f2, f3, f4);
        if (fM2693a == this.f3732f && fM2693a2 == this.f3733g) {
            return;
        }
        this.f3732f = fM2693a;
        this.f3733g = fM2693a2;
        m2690k((int) blz.m2693a(this.f3730d, fM2693a, fM2693a2));
    }

    /* JADX INFO: renamed from: m */
    public final boolean m2692m() {
        return this.f3728b < 0.0f;
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.f3736j) {
            return;
        }
        this.f3736j = false;
        m2689j();
    }
}
