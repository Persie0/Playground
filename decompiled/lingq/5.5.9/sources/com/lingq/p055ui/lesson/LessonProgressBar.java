package com.lingq.p055ui.lesson;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v4.media.C0141b;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.activity.RunnableC0190i;
import androidx.activity.RunnableC0191j;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.storage.LessonFont;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import mo.C7661i;
import p160hj.C6055a;
import p160hj.C6064j;
import p160hj.C6066l;
import p160hj.C6067m;
import p160hj.C6068n;
import p160hj.RunnableC6065k;
import p225kk.C6716m;
import p240ld.C7308h;
import p338qd.C8573r0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u0012\u0010\u0011\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u0002H\u0002J\u0012\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u0002H\u0002J\u0012\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u0002H\u0002R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m13365d2 = {"Lcom/lingq/ui/lesson/LessonProgressBar;", "Landroid/view/View;", "", "pages", "Lsl/e;", "setTotalPages", "page", "setCurrentPage", "progress", "setCompletedPages", "", "isCompleted", "setupOnePageLessonView", "enabled", "setIsTouchingEnabled", "getPageNumber", "thumbColor", "setThumbColor", "bubbleColor", "setBubbleColor", "bubbleTextColor", "setBubbleTextColor", "Lcom/lingq/ui/lesson/LessonProgressBar$a;", "S", "Lcom/lingq/ui/lesson/LessonProgressBar$a;", "getOnPageChangedListener", "()Lcom/lingq/ui/lesson/LessonProgressBar$a;", "setOnPageChangedListener", "(Lcom/lingq/ui/lesson/LessonProgressBar$a;)V", "onPageChangedListener", "a", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonProgressBar extends View {

    /* JADX INFO: renamed from: n0 */
    public static final /* synthetic */ int f27339n0 = 0;

    /* JADX INFO: renamed from: H */
    public final RectF f27340H;

    /* JADX INFO: renamed from: I */
    public final float f27341I;

    /* JADX INFO: renamed from: J */
    public final float f27342J;

    /* JADX INFO: renamed from: K */
    public float f27343K;

    /* JADX INFO: renamed from: L */
    public int f27344L;

    /* JADX INFO: renamed from: M */
    public float f27345M;

    /* JADX INFO: renamed from: N */
    public final int f27346N;

    /* JADX INFO: renamed from: O */
    public final int f27347O;

    /* JADX INFO: renamed from: P */
    public final long f27348P;

    /* JADX INFO: renamed from: Q */
    public final long f27349Q;

    /* JADX INFO: renamed from: R */
    public final long f27350R;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public InterfaceC4222a onPageChangedListener;

    /* JADX INFO: renamed from: T */
    public boolean f27352T;

    /* JADX INFO: renamed from: U */
    public boolean f27353U;

    /* JADX INFO: renamed from: V */
    public boolean f27354V;

    /* JADX INFO: renamed from: W */
    public boolean f27355W;

    /* JADX INFO: renamed from: a */
    public final Paint f27356a;

    /* JADX INFO: renamed from: a0 */
    public boolean f27357a0;

    /* JADX INFO: renamed from: b */
    public final Paint f27358b;

    /* JADX INFO: renamed from: b0 */
    public boolean f27359b0;

    /* JADX INFO: renamed from: c */
    public final Paint f27360c;

    /* JADX INFO: renamed from: c0 */
    public boolean f27361c0;

    /* JADX INFO: renamed from: d */
    public final Paint f27362d;

    /* JADX INFO: renamed from: d0 */
    public boolean f27363d0;

    /* JADX INFO: renamed from: e */
    public final Paint f27364e;

    /* JADX INFO: renamed from: e0 */
    public boolean f27365e0;

    /* JADX INFO: renamed from: f */
    public final RectF f27366f;

    /* JADX INFO: renamed from: f0 */
    public boolean f27367f0;

    /* JADX INFO: renamed from: g */
    public final RectF f27368g;

    /* JADX INFO: renamed from: g0 */
    public boolean f27369g0;

    /* JADX INFO: renamed from: h */
    public final Rect f27370h;

    /* JADX INFO: renamed from: h0 */
    public boolean f27371h0;

    /* JADX INFO: renamed from: i */
    public final float f27372i;

    /* JADX INFO: renamed from: i0 */
    public Pair<Integer, Float> f27373i0;

    /* JADX INFO: renamed from: j */
    public final float f27374j;

    /* JADX INFO: renamed from: j0 */
    public final C6055a f27375j0;

    /* JADX INFO: renamed from: k */
    public final float f27376k;

    /* JADX INFO: renamed from: k0 */
    public int f27377k0;

    /* JADX INFO: renamed from: l */
    public final float f27378l;

    /* JADX INFO: renamed from: l0 */
    public int f27379l0;

    /* JADX INFO: renamed from: m0 */
    public int f27380m0;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonProgressBar$a */
    public interface InterfaceC4222a {
        /* JADX INFO: renamed from: a */
        void mo10113a(int i10);
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonProgressBar$b */
    public static final class C4223b implements Animator.AnimatorListener {
        public C4223b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            C5207g.m11111f(animator, "animator");
            LessonProgressBar.this.f27373i0 = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C5207g.m11111f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            C5207g.m11111f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            C5207g.m11111f(animator, "animator");
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonProgressBar$c */
    public static final class C4224c implements Animator.AnimatorListener {
        public C4224c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            C5207g.m11111f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C5207g.m11111f(animator, "animator");
            LessonProgressBar.this.f27373i0 = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            C5207g.m11111f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            C5207g.m11111f(animator, "animator");
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonProgressBar$d */
    public static final class C4225d implements Animator.AnimatorListener {
        public C4225d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            C5207g.m11111f(animator, "animator");
            int i10 = LessonProgressBar.f27339n0;
            LessonProgressBar lessonProgressBar = LessonProgressBar.this;
            lessonProgressBar.f27355W = false;
            lessonProgressBar.f27357a0 = false;
            lessonProgressBar.f27359b0 = false;
            lessonProgressBar.f27354V = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C5207g.m11111f(animator, "animator");
            int i10 = LessonProgressBar.f27339n0;
            LessonProgressBar lessonProgressBar = LessonProgressBar.this;
            lessonProgressBar.f27355W = false;
            lessonProgressBar.f27357a0 = false;
            lessonProgressBar.f27359b0 = false;
            lessonProgressBar.f27354V = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            C5207g.m11111f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            C5207g.m11111f(animator, "animator");
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonProgressBar$e */
    public static final class C4226e implements Animator.AnimatorListener {
        public C4226e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            C5207g.m11111f(animator, "animator");
            LessonProgressBar.this.f27367f0 = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C5207g.m11111f(animator, "animator");
            LessonProgressBar.this.f27367f0 = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            C5207g.m11111f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            C5207g.m11111f(animator, "animator");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C5207g.m11111f(context, "context");
        Paint paint = new Paint();
        this.f27356a = paint;
        Paint paint2 = new Paint();
        this.f27358b = paint2;
        Paint paint3 = new Paint();
        this.f27360c = paint3;
        Paint paint4 = new Paint();
        this.f27362d = paint4;
        Paint paint5 = new Paint();
        this.f27364e = paint5;
        this.f27366f = new RectF();
        this.f27368g = new RectF();
        this.f27370h = new Rect();
        List<Integer> list = C6716m.f37937a;
        this.f27372i = C6716m.m13316a(3);
        this.f27374j = C6716m.m13316a(12);
        float fM13316a = C6716m.m13316a(4);
        this.f27376k = fM13316a;
        this.f27378l = C6716m.m13316a(2) + fM13316a;
        this.f27340H = new RectF();
        this.f27341I = C6716m.m13316a(18);
        this.f27342J = C6716m.m13316a((int) context.getResources().getDimension(R.dimen.btn_corner_radius));
        int iM13333r = C6716m.m13333r(R.attr.progressTrack, context);
        this.f27346N = iM13333r;
        int iM13333r2 = C6716m.m13333r(R.attr.greenTint, context);
        this.f27347O = iM13333r2;
        this.f27348P = 200L;
        this.f27349Q = 650L;
        this.f27350R = 1000L;
        this.f27352T = true;
        this.f27365e0 = true;
        this.f27375j0 = new C6055a(0);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(iM13333r);
        paint2.setAntiAlias(true);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(iM13333r2);
        paint3.setAntiAlias(true);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setTextSize(C6716m.m13331p(10));
        paint3.setTypeface(C4924a.m10475n0(LessonFont.RubikBold.INSTANCE, context));
        paint4.setAntiAlias(true);
        paint4.setStrokeCap(Paint.Cap.ROUND);
        paint5.setAntiAlias(true);
        paint5.setStrokeCap(Paint.Cap.ROUND);
    }

    /* JADX INFO: renamed from: b */
    public static void m10116b(LessonProgressBar lessonProgressBar) {
        C5207g.m11111f(lessonProgressBar, "this$0");
        lessonProgressBar.m10121e(lessonProgressBar.getPageNumber());
    }

    /* JADX INFO: renamed from: g */
    public static int m10117g(float f3, LessonProgressBar lessonProgressBar) {
        float width;
        int i10 = 1;
        int i11 = lessonProgressBar.f27344L - 1;
        if (i11 >= 1) {
            i10 = i11;
        }
        if (lessonProgressBar.f27361c0) {
            float f10 = i10;
            width = f10 - ((f3 / lessonProgressBar.getWidth()) * f10);
        } else {
            width = i10 * (f3 / lessonProgressBar.getWidth());
        }
        int iM16710Y0 = C8573r0.m16710Y0(width);
        if (iM16710Y0 < 0) {
            iM16710Y0 = 0;
        }
        int i12 = lessonProgressBar.f27344L;
        return iM16710Y0 > i12 ? i12 : iM16710Y0;
    }

    private final int getPageNumber() {
        return m10117g(this.f27345M, this);
    }

    /* JADX INFO: renamed from: h */
    public static float m10118h(LessonProgressBar lessonProgressBar, float f3) {
        int i10 = 1;
        int i11 = lessonProgressBar.f27344L - 1;
        if (i11 >= 1) {
            i10 = i11;
        }
        float f10 = i10;
        return lessonProgressBar.f27361c0 ? lessonProgressBar.getWidth() - ((lessonProgressBar.getWidth() / f10) * f3) : (lessonProgressBar.getWidth() / f10) * f3;
    }

    private final void setBubbleColor(int i10) {
        if (this.f27377k0 != i10) {
            this.f27362d.setColor(i10);
            this.f27377k0 = i10;
        }
    }

    private final void setBubbleTextColor(int i10) {
        if (this.f27379l0 != i10) {
            this.f27360c.setColor(i10);
            this.f27379l0 = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCompletedPages$lambda$31(LessonProgressBar lessonProgressBar) {
        C5207g.m11111f(lessonProgressBar, "this$0");
        lessonProgressBar.m10119c(lessonProgressBar.f27349Q);
    }

    private final void setThumbColor(int i10) {
        if (this.f27380m0 != i10) {
            this.f27364e.setColor(i10);
            this.f27380m0 = i10;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10119c(long j10) {
        if (this.f27367f0 || this.f27369g0) {
            return;
        }
        this.f27369g0 = true;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f27362d.getAlpha(), 0);
        valueAnimatorOfInt.setDuration(j10);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.addUpdateListener(new C7308h(1, this));
        valueAnimatorOfInt.addListener(new C6068n(this));
        valueAnimatorOfInt.addListener(new C6067m(this));
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: renamed from: d */
    public final void m10120d(int i10, float f3) {
        boolean z10;
        Pair<Integer, Float> pair = this.f27373i0;
        if (pair == null) {
            z10 = i10 <= 0 && getWidth() > 0;
        } else {
            if (!(pair != null && pair.f38012a.intValue() == i10)) {
                Pair<Integer, Float> pair2 = this.f27373i0;
                Float f10 = pair2 != null ? pair2.f38013b : null;
                if (!(f10 != null && f10.floatValue() == f3)) {
                    if (i10 <= 0) {
                    }
                }
            }
        }
        if (z10) {
            this.f27373i0 = new Pair<>(Integer.valueOf(i10), Float.valueOf(f3));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f3, i10);
            valueAnimatorOfFloat.setDuration(this.f27348P - ((long) 50));
            valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new C6064j(this, 0));
            valueAnimatorOfFloat.addListener(new C4224c());
            valueAnimatorOfFloat.addListener(new C4223b());
            valueAnimatorOfFloat.start();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10121e(int i10) {
        if (!this.f27354V && !this.f27355W) {
            float fM10118h = m10118h(this, i10);
            if (!(fM10118h == this.f27345M)) {
                this.f27354V = true;
                AnimatorSet animatorSet = new AnimatorSet();
                InterfaceC4222a interfaceC4222a = this.onPageChangedListener;
                if (interfaceC4222a != null) {
                    interfaceC4222a.mo10113a(m10117g(fM10118h, this));
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f27345M, fM10118h);
                valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                long j10 = this.f27348P;
                valueAnimatorOfFloat.setDuration(j10);
                valueAnimatorOfFloat.addUpdateListener(new C6066l(this, 1));
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f27362d.getAlpha(), 0);
                valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
                valueAnimatorOfInt.setDuration(j10);
                valueAnimatorOfInt.addUpdateListener(new C6064j(this, 2));
                animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfInt);
                animatorSet.addListener(new C4225d());
                animatorSet.start();
                return;
            }
            m10119c(this.f27350R);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m10122f(boolean z10) {
        if (this.f27363d0 != z10) {
            this.f27363d0 = z10;
            m10127m();
            postDelayed(new RunnableC0190i(21, this), this.f27348P);
        }
    }

    public final InterfaceC4222a getOnPageChangedListener() {
        return this.onPageChangedListener;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m10123i(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float f3 = this.f27345M;
        float f10 = this.f27376k;
        float f11 = f3 - f10;
        float f12 = f3 + f10;
        float x10 = motionEvent.getX();
        return f11 <= x10 && x10 <= f12;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m10124j(float f3) {
        return !this.f27361c0 ? f3 <= m10118h(this, this.f27343K) : f3 >= m10118h(this, this.f27343K);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    /* JADX INFO: renamed from: k */
    public final void m10125k(int i10, float f3) {
        boolean z10;
        float f10;
        boolean z11;
        float fM10118h = m10118h(this, i10 + f3);
        boolean z12 = this.f27359b0;
        if (((z12 || fM10118h <= 0.0f || this.f27354V) ? false : true) && this.f27363d0) {
            this.f27345M = fM10118h;
            this.f27355W = true;
            if (this.f27367f0 || this.f27369g0) {
                if (f3 == 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && !z12) {
                    f10 = this.f27343K;
                    if (f10 - ((int) f10) == 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        this.f27355W = false;
                        postDelayed(new RunnableC6065k(this, 1), this.f27349Q);
                    }
                }
            } else {
                if (f3 == 0.0f) {
                    if (f3 == 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        f10 = this.f27343K;
                        if (f10 - ((int) f10) == 0.0f) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            this.f27355W = false;
                            postDelayed(new RunnableC6065k(this, 1), this.f27349Q);
                        }
                    }
                } else {
                    this.f27362d.setAlpha(255);
                    this.f27360c.setAlpha(255);
                }
            }
            m10128n();
            m10127m();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m10126l() {
        this.f27355W = false;
        this.f27357a0 = false;
        m10119c(this.f27349Q);
        InterfaceC4222a interfaceC4222a = this.onPageChangedListener;
        if (interfaceC4222a != null) {
            interfaceC4222a.mo10113a(getPageNumber());
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m10127m() {
        if (this.f27363d0) {
            C6055a c6055a = this.f27375j0;
            C5207g.m11111f(c6055a, "<this>");
            if ((c6055a.f35751b == -1 || c6055a.f35752c == -1) ? false : true) {
                if (this.f27365e0) {
                    this.f27365e0 = false;
                    int i10 = c6055a.f35752c;
                    int i11 = c6055a.f35750a;
                    this.f27345M = m10118h(this, i10);
                    m10120d(i11, 0.0f);
                    return;
                }
                invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m10128n() {
        if (!this.f27361c0 ? (C8573r0.m16710Y0(this.f27343K) != 0 || this.f27345M > 5.0f) && this.f27345M > m10118h(this, this.f27343K) : (C8573r0.m16710Y0(this.f27343K) != 0 || this.f27345M < ((float) getWidth()) - 5.0f) && this.f27345M < m10118h(this, this.f27343K)) {
            int i10 = this.f27347O;
            setBubbleColor(i10);
            setThumbColor(i10);
            List<Integer> list = C6716m.f37937a;
            Context context = getContext();
            C5207g.m11110e(context, "context");
            setBubbleTextColor(C6716m.m13333r(R.attr.colorOnPrimary, context));
            return;
        }
        int i11 = this.f27346N;
        setBubbleColor(i11);
        setThumbColor(i11);
        List<Integer> list2 = C6716m.f37937a;
        Context context2 = getContext();
        C5207g.m11110e(context2, "context");
        setBubbleTextColor(C6716m.m13333r(R.attr.primaryTextColor, context2));
    }

    /* JADX INFO: renamed from: o */
    public final void m10129o() {
        if (!this.f27367f0 && !this.f27369g0) {
            this.f27367f0 = true;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f27362d.getAlpha(), 255);
            long j10 = this.f27349Q;
            valueAnimatorOfInt.setDuration(j10);
            valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
            valueAnimatorOfInt.addUpdateListener(new C6066l(this, 0));
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(255, 0);
            valueAnimatorOfInt2.setDuration(j10);
            valueAnimatorOfInt2.setInterpolator(new LinearInterpolator());
            valueAnimatorOfInt2.addUpdateListener(new C6064j(this, 1));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new C4226e());
            animatorSet.playSequentially(valueAnimatorOfInt, valueAnimatorOfInt2);
            animatorSet.start();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f27363d0) {
            RectF rectF = this.f27366f;
            float f3 = 0.0f;
            rectF.left = 0.0f;
            float height = getHeight() / 2.0f;
            float f10 = this.f27372i / 2;
            rectF.top = height + f10;
            rectF.bottom = (getHeight() / 2.0f) - f10;
            rectF.right = getWidth();
            boolean z10 = this.f27371h0;
            Paint paint = this.f27356a;
            if (!z10 && paint.getColor() == this.f27347O) {
                paint.setColor(this.f27346N);
            }
            float f11 = this.f27374j;
            if (canvas != null) {
                canvas.drawRoundRect(rectF, f11, f11, paint);
            }
            RectF rectF2 = this.f27368g;
            rectF2.left = this.f27361c0 ? getWidth() : 0.0f;
            rectF2.top = (getHeight() / 2.0f) + f10;
            rectF2.bottom = (getHeight() / 2.0f) - f10;
            float fM10118h = m10118h(this, this.f27343K);
            if (fM10118h < 0.0f) {
                fM10118h = 0.0f;
            }
            float width = getWidth();
            if (fM10118h > width) {
                fM10118h = width;
            }
            rectF2.right = fM10118h;
            if (canvas != null) {
                canvas.drawRoundRect(rectF2, f11, f11, this.f27358b);
            }
            if (this.f27371h0) {
                return;
            }
            float height2 = getHeight() / 2.0f;
            boolean z11 = this.f27355W;
            float f12 = this.f27378l;
            float f13 = (z11 || this.f27357a0) ? f12 : this.f27376k;
            float f14 = this.f27345M;
            if (f14 >= 0.0f) {
                f3 = f14;
            }
            float width2 = getWidth();
            if (f3 > width2) {
                f3 = width2;
            }
            this.f27345M = f3;
            if (canvas != null) {
                canvas.drawCircle(f3, height2, f13, this.f27364e);
            }
            String strM613i = C0141b.m613i(new Object[]{Integer.valueOf(getPageNumber() + 1), Integer.valueOf(this.f27344L)}, 2, Locale.getDefault(), "%d/%d", "format(locale, format, *args)");
            Paint paint2 = this.f27360c;
            int length = C7661i.m15254T2(strM613i, "/", "").length();
            Rect rect = this.f27370h;
            paint2.getTextBounds(strM613i, 0, length, rect);
            int iWidth = rect.width();
            List<Integer> list = C6716m.f37937a;
            int iM13316a = (int) C6716m.m13316a(12);
            if (iWidth < iM13316a) {
                iWidth = iM13316a;
            }
            float f15 = height2 - (f12 + 2.0f);
            RectF rectF3 = this.f27340H;
            float f16 = this.f27345M;
            float f17 = iWidth;
            rectF3.left = f16 - f17;
            rectF3.top = f15 - this.f27341I;
            rectF3.right = f16 + f17;
            rectF3.bottom = f15;
            if (canvas != null) {
                Paint paint3 = this.f27362d;
                float f18 = this.f27342J;
                canvas.drawRoundRect(rectF3, f18, f18, paint3);
            }
            if (canvas != null) {
                canvas.drawText(strM613i, rectF3.centerX(), rectF3.centerY() + (rect.height() / 2), paint2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:75:0x016a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0197  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a5  */
    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        float width;
        boolean z11;
        float x10;
        InterfaceC4222a interfaceC4222a;
        boolean z12;
        C5207g.m11111f(motionEvent, "event");
        boolean z13 = true;
        if (this.f27352T) {
            this.f27359b0 = isEnabled() && !(motionEvent.getActionMasked() == 1 && motionEvent.getActionMasked() == 0);
            int actionMasked = motionEvent.getActionMasked();
            Paint paint = this.f27362d;
            Paint paint2 = this.f27360c;
            if (actionMasked == 0) {
                this.f27357a0 = m10123i(motionEvent);
                if (this.f27353U && m10124j(motionEvent.getX())) {
                    m10128n();
                    paint2.setAlpha(255);
                    paint.setAlpha(255);
                    m10121e(C8573r0.m16710Y0(this.f27343K));
                } else {
                    if (motionEvent.getX() <= 0.0f) {
                        width = 0.0f;
                    } else {
                        width = motionEvent.getX() >= ((float) getWidth()) ? getWidth() : motionEvent.getX();
                    }
                    this.f27345M = width;
                    paint2.setAlpha(255);
                    paint.setAlpha(255);
                    InterfaceC4222a interfaceC4222a2 = this.onPageChangedListener;
                    if (interfaceC4222a2 != null) {
                        interfaceC4222a2.mo10113a(getPageNumber());
                    }
                    m10128n();
                    m10127m();
                }
            } else if (actionMasked == 1) {
                this.f27355W = false;
                this.f27357a0 = false;
                this.f27359b0 = false;
                postDelayed(new RunnableC6065k(this, 0), this.f27349Q);
            } else if (actionMasked == 2) {
                if (!m10123i(motionEvent)) {
                    if (isEnabled()) {
                        float width2 = getWidth();
                        float x11 = motionEvent.getX();
                        if (0.0f <= x11 && x11 <= width2) {
                            z12 = true;
                        }
                        if (z12) {
                            z11 = false;
                        }
                        this.f27355W = z11;
                        if (z11) {
                            if (motionEvent.getX() <= 0.0f) {
                                x10 = 0.0f;
                            } else if (!m10124j(motionEvent.getX()) && this.f27353U) {
                                x10 = m10118h(this, this.f27343K);
                            } else if (motionEvent.getX() >= getWidth()) {
                                x10 = getWidth();
                            } else {
                                x10 = motionEvent.getX();
                            }
                            this.f27345M = x10;
                            paint2.setAlpha(255);
                            paint.setAlpha(255);
                            interfaceC4222a = this.onPageChangedListener;
                            if (interfaceC4222a != null) {
                                interfaceC4222a.mo10113a(getPageNumber());
                            }
                            m10128n();
                            m10127m();
                        }
                    }
                    z12 = false;
                    if (z12) {
                        z11 = false;
                    }
                    this.f27355W = z11;
                    if (z11) {
                        if (motionEvent.getX() <= 0.0f) {
                            x10 = 0.0f;
                        } else if (!m10124j(motionEvent.getX())) {
                            if (motionEvent.getX() >= getWidth()) {
                                x10 = getWidth();
                            } else {
                                x10 = motionEvent.getX();
                            }
                        } else if (motionEvent.getX() >= getWidth()) {
                            x10 = getWidth();
                        } else {
                            x10 = motionEvent.getX();
                        }
                        this.f27345M = x10;
                        paint2.setAlpha(255);
                        paint.setAlpha(255);
                        interfaceC4222a = this.onPageChangedListener;
                        if (interfaceC4222a != null) {
                            interfaceC4222a.mo10113a(getPageNumber());
                        }
                        m10128n();
                        m10127m();
                    }
                }
                z11 = true;
                this.f27355W = z11;
                if (z11) {
                    if (motionEvent.getX() <= 0.0f) {
                        x10 = 0.0f;
                    } else if (!m10124j(motionEvent.getX())) {
                        if (motionEvent.getX() >= getWidth()) {
                            x10 = getWidth();
                        } else {
                            x10 = motionEvent.getX();
                        }
                    } else if (motionEvent.getX() >= getWidth()) {
                        x10 = getWidth();
                    } else {
                        x10 = motionEvent.getX();
                    }
                    this.f27345M = x10;
                    paint2.setAlpha(255);
                    paint.setAlpha(255);
                    interfaceC4222a = this.onPageChangedListener;
                    if (interfaceC4222a != null) {
                        interfaceC4222a.mo10113a(getPageNumber());
                    }
                    m10128n();
                    m10127m();
                }
            } else if (actionMasked == 3) {
                this.f27355W = false;
                this.f27357a0 = false;
                this.f27359b0 = false;
                postDelayed(new RunnableC6065k(this, 0), this.f27349Q);
            }
        }
        if (motionEvent.getActionMasked() != 0) {
            if (super.onTouchEvent(motionEvent)) {
                z13 = false;
            }
        } else if (!m10123i(motionEvent)) {
            if (isEnabled()) {
                float width3 = getWidth();
                float x12 = motionEvent.getX();
                if (0.0f > x12 || x12 > width3) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            if (!z10) {
                if (super.onTouchEvent(motionEvent)) {
                    z13 = false;
                }
            }
        }
        return z13;
    }

    public final void setCompletedPages(int i10) {
        if (i10 >= 0) {
            this.f27375j0.f35750a = i10;
            m10120d(i10, this.f27343K);
            postDelayed(new RunnableC0191j(19, this), this.f27349Q);
        }
    }

    public final void setCurrentPage(int i10) {
        this.f27375j0.f35752c = i10;
        this.f27345M = m10118h(this, i10);
        m10128n();
    }

    public final void setIsTouchingEnabled(boolean z10) {
        if (z10 != this.f27352T) {
            this.f27352T = z10;
            m10127m();
        }
    }

    public final void setOnPageChangedListener(InterfaceC4222a interfaceC4222a) {
        this.onPageChangedListener = interfaceC4222a;
    }

    public final void setTotalPages(int i10) {
        this.f27371h0 = i10 + (-1) == 0;
        this.f27375j0.f35751b = i10;
        int i11 = this.f27344L;
        if (i11 != 0 && i11 != i10) {
            m10129o();
        }
        this.f27344L = i10;
        m10127m();
    }

    public final void setupOnePageLessonView(boolean z10) {
        setIsTouchingEnabled(false);
        if (z10) {
            this.f27356a.setColor(this.f27347O);
        }
        m10127m();
    }
}
