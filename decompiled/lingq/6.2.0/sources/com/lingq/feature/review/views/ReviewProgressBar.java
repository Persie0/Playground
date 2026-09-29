package com.lingq.feature.review.views;

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
import p000.ae8;
import p000.f88;
import p000.jfa;
import p000.mt6;
import p000.ss5;
import p000.xz1;
import p000.y52;
import p000.yd8;
import p000.zd8;

/* JADX INFO: loaded from: classes3.dex */
public final class ReviewProgressBar extends View {

    /* JADX INFO: renamed from: Q */
    public static final /* synthetic */ int f32763Q = 0;

    /* JADX INFO: renamed from: H */
    public boolean f32764H;

    /* JADX INFO: renamed from: I */
    public boolean f32765I;

    /* JADX INFO: renamed from: J */
    public boolean f32766J;

    /* JADX INFO: renamed from: K */
    public boolean f32767K;

    /* JADX INFO: renamed from: L */
    public boolean f32768L;

    /* JADX INFO: renamed from: M */
    public final xz1 f32769M;

    /* JADX INFO: renamed from: N */
    public int f32770N;

    /* JADX INFO: renamed from: O */
    public int f32771O;

    /* JADX INFO: renamed from: P */
    public int f32772P;

    /* JADX INFO: renamed from: a */
    public final Paint f32773a;

    /* JADX INFO: renamed from: b */
    public final Paint f32774b;

    /* JADX INFO: renamed from: c */
    public final Paint f32775c;

    /* JADX INFO: renamed from: d */
    public final Paint f32776d;

    /* JADX INFO: renamed from: e */
    public final float f32777e;

    /* JADX INFO: renamed from: f */
    public int f32778f;

    /* JADX INFO: renamed from: g */
    public float f32779g;

    /* JADX INFO: renamed from: h */
    public final int f32780h;

    /* JADX INFO: renamed from: i */
    public final int f32781i;

    /* JADX INFO: renamed from: j */
    public final long f32782j;

    /* JADX INFO: renamed from: k */
    public final long f32783k;

    /* JADX INFO: renamed from: l */
    public final long f32784l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        Paint paint = new Paint();
        this.f32773a = paint;
        Paint paint2 = new Paint();
        Paint paint3 = new Paint();
        this.f32774b = paint3;
        Paint paint4 = new Paint();
        this.f32775c = paint4;
        Paint paint5 = new Paint();
        this.f32776d = paint5;
        new RectF();
        new RectF();
        new Rect();
        jfa.m14419b(context, 3);
        jfa.m14419b(context, 12);
        this.f32777e = jfa.m14419b(context, 4);
        jfa.m14419b(context, 2);
        new RectF();
        jfa.m14419b(context, 18);
        jfa.m14419b(context, (int) context.getResources().getDimension(R$dimen.btn_corner_large));
        int iM14431n = jfa.m14431n(context, R$attr.progressTrack);
        this.f32780h = iM14431n;
        int iM14431n2 = jfa.m14431n(context, R$attr.greenTint);
        this.f32781i = iM14431n2;
        this.f32782j = 200L;
        this.f32783k = 650L;
        this.f32784l = 1000L;
        this.f32764H = true;
        xz1 xz1Var = new xz1();
        xz1Var.f68982a = -1;
        xz1Var.f68983b = -1;
        this.f32769M = xz1Var;
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
    public static void m9654a(ReviewProgressBar reviewProgressBar) {
        int pageNumber = reviewProgressBar.getPageNumber();
        long j = reviewProgressBar.f32782j;
        if (reviewProgressBar.f32765I || reviewProgressBar.f32766J) {
            return;
        }
        float fM9655c = m9655c(reviewProgressBar, pageNumber);
        if (fM9655c == reviewProgressBar.f32779g) {
            reviewProgressBar.m9656b(reviewProgressBar.f32784l);
            return;
        }
        reviewProgressBar.f32765I = true;
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(reviewProgressBar.f32779g, fM9655c);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new yd8(reviewProgressBar, 3));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(reviewProgressBar.f32775c.getAlpha(), 0);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.addUpdateListener(new yd8(reviewProgressBar, 4));
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfInt);
        animatorSet.addListener(new ae8(reviewProgressBar, 2));
        animatorSet.start();
    }

    /* JADX INFO: renamed from: c */
    public static float m9655c(ReviewProgressBar reviewProgressBar, float f) {
        int i = reviewProgressBar.f32778f - 1;
        return (reviewProgressBar.getWidth() / (i >= 1 ? i : 1)) * f;
    }

    private final int getPageNumber() {
        float f = this.f32779g;
        int i = this.f32778f - 1;
        int iM21693T = ss5.m21693T((f / getWidth()) * (i >= 1 ? i : 1));
        if (iM21693T < 0) {
            iM21693T = 0;
        }
        int i2 = this.f32778f;
        return iM21693T > i2 ? i2 : iM21693T;
    }

    private final void setBubbleColor(int i) {
        if (this.f32770N != i) {
            this.f32775c.setColor(i);
            this.f32770N = i;
        }
    }

    private final void setBubbleTextColor(int i) {
        if (this.f32771O != i) {
            this.f32774b.setColor(i);
            this.f32771O = i;
        }
    }

    private final void setThumbColor(int i) {
        if (this.f32772P != i) {
            this.f32776d.setColor(i);
            this.f32772P = i;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m9656b(long j) {
        if (this.f32767K || this.f32768L) {
            return;
        }
        this.f32768L = true;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f32775c.getAlpha(), 0);
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.addUpdateListener(new yd8(this, 2));
        valueAnimatorOfInt.addListener(new ae8(this, 1));
        valueAnimatorOfInt.addListener(new ae8(this, 0));
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m9657d(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float f = this.f32779g;
        float f2 = this.f32777e;
        float f3 = f - f2;
        float f4 = f + f2;
        float x = motionEvent.getX();
        return f3 <= x && x <= f4;
    }

    /* JADX INFO: renamed from: e */
    public final void m9658e() {
        if ((ss5.m21693T(0.0f) != 0 || this.f32779g > 5.0f) && this.f32779g > m9655c(this, 0.0f)) {
            int i = this.f32780h;
            setBubbleColor(i);
            setThumbColor(i);
            Context context = getContext();
            context.getClass();
            setBubbleTextColor(jfa.m14431n(context, com.google.android.material.R$attr.colorOnSurface));
            return;
        }
        int i2 = this.f32781i;
        setBubbleColor(i2);
        setThumbColor(i2);
        Context context2 = getContext();
        context2.getClass();
        setBubbleTextColor(jfa.m14431n(context2, com.google.android.material.R$attr.colorOnPrimary));
    }

    public final zd8 getOnPageChangedListener() {
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:40:0x008a  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f3 A[RETURN] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float width;
        boolean z;
        float width2;
        motionEvent.getClass();
        if (this.f32764H) {
            if (isEnabled() && motionEvent.getActionMasked() == 1) {
                motionEvent.getActionMasked();
            }
            int actionMasked = motionEvent.getActionMasked();
            Paint paint = this.f32775c;
            Paint paint2 = this.f32774b;
            if (actionMasked == 0) {
                m9657d(motionEvent);
                if (motionEvent.getX() <= 0.0f) {
                    width = 0.0f;
                } else {
                    width = motionEvent.getX() >= ((float) getWidth()) ? getWidth() : motionEvent.getX();
                }
                this.f32779g = width;
                paint2.setAlpha(255);
                paint.setAlpha(255);
                m9658e();
            } else if (actionMasked == 1) {
                this.f32766J = false;
                postDelayed(new mt6(this, 5), this.f32783k);
            } else if (actionMasked == 2) {
                if (m9657d(motionEvent)) {
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
                this.f32766J = z;
                if (z) {
                    if (motionEvent.getX() <= 0.0f) {
                        width2 = 0.0f;
                    } else {
                        motionEvent.getX();
                        m9655c(this, 0.0f);
                        width2 = motionEvent.getX() >= ((float) getWidth()) ? getWidth() : motionEvent.getX();
                    }
                    this.f32779g = width2;
                    paint2.setAlpha(255);
                    paint.setAlpha(255);
                    m9658e();
                }
            } else if (actionMasked == 3) {
                this.f32766J = false;
                postDelayed(new mt6(this, 5), this.f32783k);
            }
        }
        if (motionEvent.getActionMasked() != 0) {
            if (super.onTouchEvent(motionEvent)) {
                return false;
            }
        } else if (!m9657d(motionEvent)) {
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
        this.f32769M.f68983b = i;
        this.f32779g = m9655c(this, i);
        m9658e();
    }

    public final void setIsTouchingEnabled(boolean z) {
        if (z != this.f32764H) {
            this.f32764H = z;
        }
    }

    public final void setOnPageChangedListener(zd8 zd8Var) {
    }

    public final void setTotalPages(int i) {
        this.f32769M.f68982a = i;
        int i2 = this.f32778f;
        if (i2 != 0 && i2 != i && !this.f32767K && !this.f32768L) {
            this.f32767K = true;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f32775c.getAlpha(), 255);
            long j = this.f32783k;
            valueAnimatorOfInt.setDuration(j);
            valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
            valueAnimatorOfInt.addUpdateListener(new yd8(this, 0));
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(255, 0);
            valueAnimatorOfInt2.setDuration(j);
            valueAnimatorOfInt2.setInterpolator(new LinearInterpolator());
            valueAnimatorOfInt2.addUpdateListener(new yd8(this, 1));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new ae8(this, 3));
            animatorSet.playSequentially(valueAnimatorOfInt, valueAnimatorOfInt2);
            animatorSet.start();
        }
        this.f32778f = i;
    }

    public final void setupOnePageLessonView(boolean z) {
        setIsTouchingEnabled(false);
        if (z) {
            this.f32773a.setColor(this.f32781i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReviewProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReviewProgressBar(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ ReviewProgressBar(Context context, AttributeSet attributeSet, int i, int i2, y52 y52Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
