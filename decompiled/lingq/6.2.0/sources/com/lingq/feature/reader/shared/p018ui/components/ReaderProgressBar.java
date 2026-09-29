package com.lingq.feature.reader.shared.p018ui.components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.lingq.core.designsystem.R$attr;
import com.lingq.core.designsystem.R$dimen;
import com.lingq.core.font.R$font;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Pair;
import p000.cl9;
import p000.f88;
import p000.fa4;
import p000.jfa;
import p000.ny7;
import p000.oy7;
import p000.py7;
import p000.qy7;
import p000.ss5;
import p000.vqb;
import p000.y52;
import p000.yz1;

/* JADX INFO: loaded from: classes3.dex */
public final class ReaderProgressBar extends View {

    /* JADX INFO: renamed from: n0 */
    public static final /* synthetic */ int f30401n0 = 0;

    /* JADX INFO: renamed from: H */
    public final RectF f30402H;

    /* JADX INFO: renamed from: I */
    public final float f30403I;

    /* JADX INFO: renamed from: J */
    public final float f30404J;

    /* JADX INFO: renamed from: K */
    public float f30405K;

    /* JADX INFO: renamed from: L */
    public int f30406L;

    /* JADX INFO: renamed from: M */
    public float f30407M;

    /* JADX INFO: renamed from: N */
    public final int f30408N;

    /* JADX INFO: renamed from: O */
    public final int f30409O;

    /* JADX INFO: renamed from: P */
    public final long f30410P;

    /* JADX INFO: renamed from: Q */
    public final long f30411Q;

    /* JADX INFO: renamed from: R */
    public final long f30412R;

    /* JADX INFO: renamed from: S */
    public py7 f30413S;

    /* JADX INFO: renamed from: T */
    public boolean f30414T;

    /* JADX INFO: renamed from: U */
    public boolean f30415U;

    /* JADX INFO: renamed from: V */
    public boolean f30416V;

    /* JADX INFO: renamed from: W */
    public boolean f30417W;

    /* JADX INFO: renamed from: a */
    public final Paint f30418a;

    /* JADX INFO: renamed from: a0 */
    public boolean f30419a0;

    /* JADX INFO: renamed from: b */
    public final Paint f30420b;

    /* JADX INFO: renamed from: b0 */
    public boolean f30421b0;

    /* JADX INFO: renamed from: c */
    public final Paint f30422c;

    /* JADX INFO: renamed from: c0 */
    public boolean f30423c0;

    /* JADX INFO: renamed from: d */
    public final Paint f30424d;

    /* JADX INFO: renamed from: d0 */
    public boolean f30425d0;

    /* JADX INFO: renamed from: e */
    public final Paint f30426e;

    /* JADX INFO: renamed from: e0 */
    public boolean f30427e0;

    /* JADX INFO: renamed from: f */
    public final RectF f30428f;

    /* JADX INFO: renamed from: f0 */
    public boolean f30429f0;

    /* JADX INFO: renamed from: g */
    public final RectF f30430g;

    /* JADX INFO: renamed from: g0 */
    public boolean f30431g0;

    /* JADX INFO: renamed from: h */
    public final Rect f30432h;

    /* JADX INFO: renamed from: h0 */
    public boolean f30433h0;

    /* JADX INFO: renamed from: i */
    public final float f30434i;

    /* JADX INFO: renamed from: i0 */
    public Pair f30435i0;

    /* JADX INFO: renamed from: j */
    public final float f30436j;

    /* JADX INFO: renamed from: j0 */
    public final yz1 f30437j0;

    /* JADX INFO: renamed from: k */
    public final float f30438k;

    /* JADX INFO: renamed from: k0 */
    public int f30439k0;

    /* JADX INFO: renamed from: l */
    public final float f30440l;

    /* JADX INFO: renamed from: l0 */
    public int f30441l0;

    /* JADX INFO: renamed from: m0 */
    public int f30442m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        Paint paint = new Paint();
        this.f30418a = paint;
        Paint paint2 = new Paint();
        this.f30420b = paint2;
        Paint paint3 = new Paint();
        this.f30422c = paint3;
        Paint paint4 = new Paint();
        this.f30424d = paint4;
        Paint paint5 = new Paint();
        this.f30426e = paint5;
        this.f30428f = new RectF();
        this.f30430g = new RectF();
        this.f30432h = new Rect();
        this.f30434i = jfa.m14419b(context, 3);
        this.f30436j = jfa.m14419b(context, 12);
        float fM14419b = jfa.m14419b(context, 4);
        this.f30438k = fM14419b;
        this.f30440l = jfa.m14419b(context, 2) + fM14419b;
        this.f30402H = new RectF();
        this.f30403I = jfa.m14419b(context, 18);
        this.f30404J = jfa.m14419b(context, (int) context.getResources().getDimension(R$dimen.btn_corner_large));
        int iM14431n = jfa.m14431n(context, R$attr.progressTrack);
        this.f30408N = iM14431n;
        int iM14431n2 = jfa.m14431n(context, R$attr.greenTint);
        this.f30409O = iM14431n2;
        this.f30410P = 200L;
        this.f30411Q = 650L;
        this.f30412R = 1000L;
        this.f30414T = true;
        this.f30427e0 = true;
        yz1 yz1Var = new yz1();
        yz1Var.f70663a = -1;
        yz1Var.f70664b = -1;
        yz1Var.f70665c = -1;
        this.f30437j0 = yz1Var;
        paint.setAntiAlias(true);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setColor(iM14431n);
        paint2.setAntiAlias(true);
        paint2.setStrokeCap(cap);
        paint2.setColor(iM14431n2);
        paint3.setAntiAlias(true);
        paint3.setStrokeCap(cap);
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setTextSize(jfa.m14430m(context, 10));
        paint3.setTypeface(Typeface.create(f88.m11597a(context, R$font.font_dm_sans), 1));
        paint4.setAntiAlias(true);
        paint4.setStrokeCap(cap);
        paint5.setAntiAlias(true);
        paint5.setStrokeCap(cap);
    }

    /* JADX INFO: renamed from: a */
    public static void m9417a(ReaderProgressBar readerProgressBar) {
        readerProgressBar.m9423e(readerProgressBar.getPageNumber());
    }

    /* JADX INFO: renamed from: d */
    public static void m9419d(ReaderProgressBar readerProgressBar, int i, int i2) {
        int i3 = 2;
        float f = (i2 & 2) != 0 ? readerProgressBar.f30405K : 0.0f;
        boolean z = i > 0;
        Pair pair = readerProgressBar.f30435i0;
        if (pair != null) {
            if (((Number) pair.f47623a).intValue() == i) {
                return;
            }
            Pair pair2 = readerProgressBar.f30435i0;
            if (fa4.m11649k(pair2 != null ? (Float) pair2.f47624b : null, f)) {
                return;
            }
        }
        if (!z || readerProgressBar.getWidth() <= 0) {
            return;
        }
        readerProgressBar.f30435i0 = new Pair(Integer.valueOf(i), Float.valueOf(f));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, i);
        valueAnimatorOfFloat.setDuration(readerProgressBar.f30410P - 50);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ny7(readerProgressBar, 1));
        valueAnimatorOfFloat.addListener(new qy7(readerProgressBar, 3));
        valueAnimatorOfFloat.addListener(new qy7(readerProgressBar, i3));
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: g */
    public static int m9420g(ReaderProgressBar readerProgressBar, float f) {
        float width;
        int i = readerProgressBar.f30406L - 1;
        int i2 = i >= 1 ? i : 1;
        if (readerProgressBar.f30423c0) {
            float f2 = i2;
            width = f2 - ((f / readerProgressBar.getWidth()) * f2);
        } else {
            width = i2 * (f / readerProgressBar.getWidth());
        }
        int iM21693T = ss5.m21693T(width);
        if (iM21693T < 0) {
            iM21693T = 0;
        }
        int i3 = readerProgressBar.f30406L;
        return iM21693T > i3 ? i3 : iM21693T;
    }

    private final int getPageNumber() {
        return m9420g(this, this.f30407M);
    }

    /* JADX INFO: renamed from: h */
    public static float m9421h(ReaderProgressBar readerProgressBar, float f) {
        int i = readerProgressBar.f30406L - 1;
        float f2 = i >= 1 ? i : 1;
        return readerProgressBar.f30423c0 ? readerProgressBar.getWidth() - ((readerProgressBar.getWidth() / f2) * f) : (readerProgressBar.getWidth() / f2) * f;
    }

    private final void setBubbleColor(int i) {
        if (this.f30439k0 != i) {
            this.f30424d.setColor(i);
            this.f30439k0 = i;
        }
    }

    private final void setBubbleTextColor(int i) {
        if (this.f30441l0 != i) {
            this.f30422c.setColor(i);
            this.f30441l0 = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCompletedPages$lambda$0(ReaderProgressBar readerProgressBar) {
        readerProgressBar.m9422c(readerProgressBar.f30411Q);
    }

    private final void setThumbColor(int i) {
        if (this.f30442m0 != i) {
            this.f30426e.setColor(i);
            this.f30442m0 = i;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m9422c(long j) {
        if (this.f30429f0 || this.f30431g0) {
            return;
        }
        this.f30431g0 = true;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f30424d.getAlpha(), 0);
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ny7(this, 0));
        valueAnimatorOfInt.addListener(new qy7(this, 1));
        valueAnimatorOfInt.addListener(new qy7(this, 0));
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: renamed from: e */
    public final void m9423e(int i) {
        if (this.f30416V || this.f30417W) {
            return;
        }
        float fM9421h = m9421h(this, i);
        if (fM9421h == this.f30407M) {
            m9422c(this.f30412R);
            return;
        }
        this.f30416V = true;
        AnimatorSet animatorSet = new AnimatorSet();
        py7 py7Var = this.f30413S;
        if (py7Var != null) {
            ((vqb) py7Var).m23477v(m9420g(this, fM9421h));
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f30407M, fM9421h);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        long j = this.f30410P;
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new ny7(this, 4));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f30424d.getAlpha(), 0);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.addUpdateListener(new ny7(this, 5));
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfInt);
        animatorSet.addListener(new qy7(this, 4));
        animatorSet.start();
    }

    /* JADX INFO: renamed from: f */
    public final void m9424f(boolean z) {
        this.f30417W = false;
        this.f30419a0 = false;
        this.f30421b0 = false;
        if (z) {
            this.f30416V = false;
        }
    }

    public final py7 getOnPageChangedListener() {
        return this.f30413S;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m9425i(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float f = this.f30407M;
        float f2 = this.f30438k;
        float f3 = f - f2;
        float f4 = f + f2;
        float x = motionEvent.getX();
        return f3 <= x && x <= f4;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m9426j(float f) {
        boolean z = this.f30423c0;
        float f2 = this.f30405K;
        if (z) {
            return f < m9421h(this, f2);
        }
        return f > m9421h(this, f2);
    }

    /* JADX INFO: renamed from: k */
    public final void m9427k() {
        this.f30417W = false;
        this.f30419a0 = false;
        m9422c(this.f30411Q);
        py7 py7Var = this.f30413S;
        if (py7Var != null) {
            ((vqb) py7Var).m23477v(getPageNumber());
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m9428l() {
        int i;
        if (this.f30425d0) {
            yz1 yz1Var = this.f30437j0;
            yz1Var.getClass();
            if (yz1Var.f70664b == -1 || (i = yz1Var.f70665c) == -1) {
                return;
            }
            if (!this.f30427e0) {
                invalidate();
                return;
            }
            this.f30427e0 = false;
            int i2 = yz1Var.f70663a;
            this.f30407M = m9421h(this, i);
            m9419d(this, i2, 4);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m9429m() {
        boolean z = this.f30423c0;
        float f = this.f30405K;
        if (!z ? !((ss5.m21693T(f) != 0 || this.f30407M > 5.0f) && this.f30407M > m9421h(this, this.f30405K)) : !((ss5.m21693T(f) != 0 || this.f30407M < getWidth() - 5.0f) && this.f30407M < m9421h(this, this.f30405K))) {
            int i = this.f30408N;
            setBubbleColor(i);
            setThumbColor(i);
            Context context = getContext();
            context.getClass();
            setBubbleTextColor(jfa.m14431n(context, com.google.android.material.R$attr.colorOnSurface));
            return;
        }
        int i2 = this.f30409O;
        setBubbleColor(i2);
        setThumbColor(i2);
        Context context2 = getContext();
        context2.getClass();
        setBubbleTextColor(jfa.m14431n(context2, com.google.android.material.R$attr.colorOnPrimary));
    }

    /* JADX INFO: renamed from: n */
    public final void m9430n() {
        if (this.f30429f0 || this.f30431g0) {
            return;
        }
        this.f30429f0 = true;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f30424d.getAlpha(), 255);
        long j = this.f30411Q;
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ny7(this, 2));
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(255, 0);
        valueAnimatorOfInt2.setDuration(j);
        valueAnimatorOfInt2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt2.addUpdateListener(new ny7(this, 3));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new qy7(this, 5));
        animatorSet.playSequentially(valueAnimatorOfInt, valueAnimatorOfInt2);
        animatorSet.start();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        if (this.f30425d0) {
            RectF rectF = this.f30428f;
            rectF.left = 0.0f;
            float height = getHeight() / 2.0f;
            float f = this.f30434i / 2.0f;
            rectF.top = height + f;
            rectF.bottom = (getHeight() / 2.0f) - f;
            rectF.right = getWidth();
            boolean z = this.f30433h0;
            Paint paint = this.f30418a;
            if (!z && paint.getColor() == this.f30409O) {
                paint.setColor(this.f30408N);
            }
            float f2 = this.f30436j;
            canvas.drawRoundRect(rectF, f2, f2, paint);
            float width = this.f30423c0 ? getWidth() : 0.0f;
            RectF rectF2 = this.f30430g;
            rectF2.left = width;
            rectF2.top = (getHeight() / 2.0f) + f;
            rectF2.bottom = (getHeight() / 2.0f) - f;
            float fM9421h = m9421h(this, this.f30405K);
            if (fM9421h < 0.0f) {
                fM9421h = 0.0f;
            }
            float width2 = getWidth();
            if (fM9421h > width2) {
                fM9421h = width2;
            }
            rectF2.right = fM9421h;
            canvas.drawRoundRect(rectF2, f2, f2, this.f30420b);
            if (this.f30433h0) {
                return;
            }
            float height2 = getHeight() / 2.0f;
            boolean z2 = this.f30417W;
            float f3 = this.f30440l;
            float f4 = (z2 || this.f30419a0) ? f3 : this.f30438k;
            float f5 = this.f30407M;
            float f6 = f5 >= 0.0f ? f5 : 0.0f;
            float width3 = getWidth();
            if (f6 > width3) {
                f6 = width3;
            }
            this.f30407M = f6;
            canvas.drawCircle(f6, height2, f4, this.f30426e);
            String str = String.format(Locale.getDefault(), "%d/%d", Arrays.copyOf(new Object[]{Integer.valueOf(getPageNumber() + 1), Integer.valueOf(this.f30406L)}, 2));
            int length = cl9.m4839V(str, "/", "").length();
            Paint paint2 = this.f30422c;
            Rect rect = this.f30432h;
            paint2.getTextBounds(str, 0, length, rect);
            int iWidth = rect.width();
            Context context = getContext();
            context.getClass();
            int iM14419b = (int) jfa.m14419b(context, 12);
            if (iWidth < iM14419b) {
                iWidth = iM14419b;
            }
            float f7 = height2 - (f3 + 2.0f);
            float f8 = this.f30407M;
            float f9 = iWidth;
            RectF rectF3 = this.f30402H;
            rectF3.left = f8 - f9;
            rectF3.top = f7 - this.f30403I;
            rectF3.right = f8 + f9;
            rectF3.bottom = f7;
            float f10 = this.f30404J;
            canvas.drawRoundRect(rectF3, f10, f10, this.f30424d);
            canvas.drawText(str, rectF3.centerX(), rectF3.centerY() + (rect.height() / 2), paint2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:82:0x014d A[RETURN] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float width;
        boolean z;
        float width2;
        motionEvent.getClass();
        int i = 0;
        if (this.f30414T) {
            this.f30421b0 = isEnabled() && !(motionEvent.getActionMasked() == 1 && motionEvent.getActionMasked() == 0);
            int actionMasked = motionEvent.getActionMasked();
            Paint paint = this.f30424d;
            Paint paint2 = this.f30422c;
            if (actionMasked == 0) {
                this.f30419a0 = m9425i(motionEvent);
                if (this.f30415U && m9426j(motionEvent.getX())) {
                    m9429m();
                    paint2.setAlpha(255);
                    paint.setAlpha(255);
                    m9423e(ss5.m21693T(this.f30405K));
                } else {
                    if (motionEvent.getX() <= 0.0f) {
                        width = 0.0f;
                    } else {
                        width = motionEvent.getX() >= ((float) getWidth()) ? getWidth() : motionEvent.getX();
                    }
                    this.f30407M = width;
                    paint2.setAlpha(255);
                    paint.setAlpha(255);
                    py7 py7Var = this.f30413S;
                    if (py7Var != null) {
                        ((vqb) py7Var).m23477v(getPageNumber());
                    }
                    m9429m();
                    m9428l();
                }
            } else if (actionMasked == 1) {
                m9424f(false);
                postDelayed(new oy7(this, i), this.f30411Q);
            } else if (actionMasked == 2) {
                if (m9425i(motionEvent)) {
                    z = true;
                } else {
                    if (isEnabled()) {
                        float width3 = getWidth();
                        float x = motionEvent.getX();
                        if (0.0f <= x && x <= width3) {
                            z = true;
                        }
                    }
                    z = false;
                }
                this.f30417W = z;
                if (z) {
                    if (motionEvent.getX() <= 0.0f) {
                        width2 = 0.0f;
                    } else if (m9426j(motionEvent.getX()) && this.f30415U) {
                        width2 = m9421h(this, this.f30405K);
                    } else {
                        width2 = motionEvent.getX() >= ((float) getWidth()) ? getWidth() : motionEvent.getX();
                    }
                    this.f30407M = width2;
                    paint2.setAlpha(255);
                    paint.setAlpha(255);
                    py7 py7Var2 = this.f30413S;
                    if (py7Var2 != null) {
                        ((vqb) py7Var2).m23477v(getPageNumber());
                    }
                    m9429m();
                    m9428l();
                }
            } else if (actionMasked == 3) {
                m9424f(false);
                postDelayed(new oy7(this, i), this.f30411Q);
            }
        }
        if (motionEvent.getActionMasked() != 0) {
            if (super.onTouchEvent(motionEvent)) {
                return false;
            }
        } else if (!m9425i(motionEvent)) {
            if (isEnabled()) {
                float width4 = getWidth();
                float x2 = motionEvent.getX();
                if (0.0f <= x2 && x2 <= width4) {
                    return true;
                }
            }
            if (super.onTouchEvent(motionEvent)) {
                return false;
            }
        }
        return true;
    }

    public final void setCurrentPage(int i) {
        this.f30437j0.f70665c = i;
        this.f30407M = m9421h(this, i);
        m9429m();
    }

    public final void setIsTouchingEnabled(boolean z) {
        if (z != this.f30414T) {
            this.f30414T = z;
            m9428l();
        }
    }

    public final void setOnPageChangedListener(py7 py7Var) {
        this.f30413S = py7Var;
    }

    public final void setTotalPages(int i) {
        this.f30433h0 = i + (-1) == 0;
        this.f30437j0.f70664b = i;
        int i2 = this.f30406L;
        if (i2 != 0 && i2 != i) {
            m9430n();
        }
        this.f30406L = i;
        m9428l();
    }

    public final void setupOnePageLessonView(boolean z) {
        setIsTouchingEnabled(false);
        if (z) {
            this.f30418a.setColor(this.f30409O);
        }
        m9428l();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReaderProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReaderProgressBar(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ ReaderProgressBar(Context context, AttributeSet attributeSet, int i, int i2, y52 y52Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
