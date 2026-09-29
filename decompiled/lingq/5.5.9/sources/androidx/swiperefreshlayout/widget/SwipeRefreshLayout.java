package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import java.util.WeakHashMap;
import p024b3.C1301h;
import p254m2.C7472a;
import p379s4.C8956a;
import p379s4.C8959d;
import p379s4.C8960e;
import p379s4.C8961f;
import p379s4.C8962g;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p471x2.C10052n;
import p471x2.C10058q;
import p471x2.InterfaceC10050m;

/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements InterfaceC10050m {

    /* JADX INFO: renamed from: g0 */
    public static final int[] f7591g0 = {R.attr.enabled};

    /* JADX INFO: renamed from: H */
    public int f7592H;

    /* JADX INFO: renamed from: I */
    public float f7593I;

    /* JADX INFO: renamed from: J */
    public float f7594J;

    /* JADX INFO: renamed from: K */
    public boolean f7595K;

    /* JADX INFO: renamed from: L */
    public int f7596L;

    /* JADX INFO: renamed from: M */
    public final DecelerateInterpolator f7597M;

    /* JADX INFO: renamed from: N */
    public C8956a f7598N;

    /* JADX INFO: renamed from: O */
    public int f7599O;

    /* JADX INFO: renamed from: P */
    public int f7600P;

    /* JADX INFO: renamed from: Q */
    public final int f7601Q;

    /* JADX INFO: renamed from: R */
    public final int f7602R;

    /* JADX INFO: renamed from: S */
    public int f7603S;

    /* JADX INFO: renamed from: T */
    public C8959d f7604T;

    /* JADX INFO: renamed from: U */
    public C8960e f7605U;

    /* JADX INFO: renamed from: V */
    public C8961f f7606V;

    /* JADX INFO: renamed from: W */
    public C8962g f7607W;

    /* JADX INFO: renamed from: a */
    public View f7608a;

    /* JADX INFO: renamed from: a0 */
    public C8962g f7609a0;

    /* JADX INFO: renamed from: b */
    public InterfaceC1198f f7610b;

    /* JADX INFO: renamed from: b0 */
    public boolean f7611b0;

    /* JADX INFO: renamed from: c */
    public boolean f7612c;

    /* JADX INFO: renamed from: c0 */
    public int f7613c0;

    /* JADX INFO: renamed from: d */
    public final int f7614d;

    /* JADX INFO: renamed from: d0 */
    public final AnimationAnimationListenerC1193a f7615d0;

    /* JADX INFO: renamed from: e */
    public float f7616e;

    /* JADX INFO: renamed from: e0 */
    public final C1195c f7617e0;

    /* JADX INFO: renamed from: f */
    public float f7618f;

    /* JADX INFO: renamed from: f0 */
    public final C1196d f7619f0;

    /* JADX INFO: renamed from: g */
    public final C10058q f7620g;

    /* JADX INFO: renamed from: h */
    public final C10052n f7621h;

    /* JADX INFO: renamed from: i */
    public final int[] f7622i;

    /* JADX INFO: renamed from: j */
    public final int[] f7623j;

    /* JADX INFO: renamed from: k */
    public boolean f7624k;

    /* JADX INFO: renamed from: l */
    public final int f7625l;

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a */
    public class AnimationAnimationListenerC1193a implements Animation.AnimationListener {
        public AnimationAnimationListenerC1193a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            InterfaceC1198f interfaceC1198f;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f7612c) {
                swipeRefreshLayout.m4613f();
                return;
            }
            swipeRefreshLayout.f7604T.setAlpha(255);
            swipeRefreshLayout.f7604T.start();
            if (swipeRefreshLayout.f7611b0 && (interfaceC1198f = swipeRefreshLayout.f7610b) != null) {
                interfaceC1198f.mo4616c();
            }
            swipeRefreshLayout.f7592H = swipeRefreshLayout.f7598N.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b */
    public class AnimationAnimationListenerC1194b implements Animation.AnimationListener {
        public AnimationAnimationListenerC1194b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            swipeRefreshLayout.getClass();
            C8961f c8961f = new C8961f(swipeRefreshLayout);
            swipeRefreshLayout.f7606V = c8961f;
            c8961f.setDuration(150L);
            C8956a c8956a = swipeRefreshLayout.f7598N;
            c8956a.f46923a = null;
            c8956a.clearAnimation();
            swipeRefreshLayout.f7598N.startAnimation(swipeRefreshLayout.f7606V);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c */
    public class C1195c extends Animation {
        public C1195c() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f3, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            swipeRefreshLayout.getClass();
            int iAbs = swipeRefreshLayout.f7602R - Math.abs(swipeRefreshLayout.f7601Q);
            int i10 = swipeRefreshLayout.f7600P;
            swipeRefreshLayout.setTargetOffsetTopAndBottom((i10 + ((int) ((iAbs - i10) * f3))) - swipeRefreshLayout.f7598N.getTop());
            C8959d c8959d = swipeRefreshLayout.f7604T;
            float f10 = 1.0f - f3;
            C8959d.a aVar = c8959d.f46931a;
            if (f10 != aVar.f46952p) {
                aVar.f46952p = f10;
            }
            c8959d.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d */
    public class C1196d extends Animation {
        public C1196d() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f3, Transformation transformation) {
            SwipeRefreshLayout.this.m4612e(f3);
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e */
    public interface InterfaceC1197e {
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f */
    public interface InterfaceC1198f {
        /* JADX INFO: renamed from: c */
        void mo4616c();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7612c = false;
        this.f7616e = -1.0f;
        this.f7622i = new int[2];
        this.f7623j = new int[2];
        this.f7596L = -1;
        this.f7599O = -1;
        this.f7615d0 = new AnimationAnimationListenerC1193a();
        this.f7617e0 = new C1195c();
        this.f7619f0 = new C1196d();
        this.f7614d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f7625l = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f7597M = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f7613c0 = (int) (displayMetrics.density * 40.0f);
        this.f7598N = new C8956a(getContext());
        C8959d c8959d = new C8959d(getContext());
        this.f7604T = c8959d;
        c8959d.m17186c(1);
        this.f7598N.setImageDrawable(this.f7604T);
        this.f7598N.setVisibility(8);
        addView(this.f7598N);
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.f7602R = i10;
        this.f7616e = i10;
        this.f7620g = new C10058q();
        this.f7621h = new C10052n(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.f7613c0;
        this.f7592H = i11;
        this.f7601Q = i11;
        m4612e(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f7591g0);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setColorViewAlpha(int i10) {
        this.f7598N.getBackground().setAlpha(i10);
        this.f7604T.setAlpha(i10);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4608a() {
        View view = this.f7608a;
        return view instanceof ListView ? C1301h.m4819a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    /* JADX INFO: renamed from: b */
    public final void m4609b() {
        if (this.f7608a == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.f7598N)) {
                    this.f7608a = childAt;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4610c(float f3) {
        if (f3 > this.f7616e) {
            m4614g(true, true);
            return;
        }
        this.f7612c = false;
        C8959d c8959d = this.f7604T;
        C8959d.a aVar = c8959d.f46931a;
        aVar.f46941e = 0.0f;
        aVar.f46942f = 0.0f;
        c8959d.invalidateSelf();
        AnimationAnimationListenerC1194b animationAnimationListenerC1194b = new AnimationAnimationListenerC1194b();
        this.f7600P = this.f7592H;
        C1196d c1196d = this.f7619f0;
        c1196d.reset();
        c1196d.setDuration(200L);
        c1196d.setInterpolator(this.f7597M);
        C8956a c8956a = this.f7598N;
        c8956a.f46923a = animationAnimationListenerC1194b;
        c8956a.clearAnimation();
        this.f7598N.startAnimation(c1196d);
        C8959d c8959d2 = this.f7604T;
        C8959d.a aVar2 = c8959d2.f46931a;
        if (aVar2.f46950n) {
            aVar2.f46950n = false;
        }
        c8959d2.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x015c  */
    /* JADX INFO: renamed from: d */
    public final void m4611d(float f3) {
        float fMin;
        C8959d.a aVar;
        C8959d c8959d = this.f7604T;
        C8959d.a aVar2 = c8959d.f46931a;
        boolean z10 = true;
        if (!aVar2.f46950n) {
            aVar2.f46950n = true;
        }
        c8959d.invalidateSelf();
        float fMin2 = Math.min(1.0f, Math.abs(f3 / this.f7616e));
        float fMax = (((float) Math.max(((double) fMin2) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f3) - this.f7616e;
        int i10 = this.f7603S;
        if (i10 <= 0) {
            i10 = this.f7602R;
        }
        float f10 = i10;
        double dMax = Math.max(0.0f, Math.min(fAbs, f10 * 2.0f) / f10) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i11 = this.f7601Q + ((int) ((f10 * fMin2) + (f10 * fPow * 2.0f)));
        if (this.f7598N.getVisibility() != 0) {
            this.f7598N.setVisibility(0);
        }
        this.f7598N.setScaleX(1.0f);
        this.f7598N.setScaleY(1.0f);
        if (f3 < this.f7616e) {
            if (this.f7604T.f46931a.f46956t > 76) {
                C8962g c8962g = this.f7607W;
                if (c8962g == null || !c8962g.hasStarted() || c8962g.hasEnded()) {
                    z10 = false;
                }
                if (!z10) {
                    C8962g c8962g2 = new C8962g(this, this.f7604T.f46931a.f46956t, 76);
                    c8962g2.setDuration(300L);
                    C8956a c8956a = this.f7598N;
                    c8956a.f46923a = null;
                    c8956a.clearAnimation();
                    this.f7598N.startAnimation(c8962g2);
                    this.f7607W = c8962g2;
                }
            }
            C8959d c8959d2 = this.f7604T;
            float fMin3 = Math.min(0.8f, fMax * 0.8f);
            C8959d.a aVar3 = c8959d2.f46931a;
            aVar3.f46941e = 0.0f;
            aVar3.f46942f = fMin3;
            c8959d2.invalidateSelf();
            C8959d c8959d3 = this.f7604T;
            fMin = Math.min(1.0f, fMax);
            aVar = c8959d3.f46931a;
            if (fMin != aVar.f46952p) {
                aVar.f46952p = fMin;
            }
            c8959d3.invalidateSelf();
            C8959d c8959d4 = this.f7604T;
            c8959d4.f46931a.f46943g = ((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
            c8959d4.invalidateSelf();
            setTargetOffsetTopAndBottom(i11 - this.f7592H);
        }
        if (this.f7604T.f46931a.f46956t < 255) {
            C8962g c8962g3 = this.f7609a0;
            if (c8962g3 == null || !c8962g3.hasStarted() || c8962g3.hasEnded()) {
                z10 = false;
            }
            if (!z10) {
                C8962g c8962g4 = new C8962g(this, this.f7604T.f46931a.f46956t, 255);
                c8962g4.setDuration(300L);
                C8956a c8956a2 = this.f7598N;
                c8956a2.f46923a = null;
                c8956a2.clearAnimation();
                this.f7598N.startAnimation(c8962g4);
                this.f7609a0 = c8962g4;
            }
        }
        C8959d c8959d5 = this.f7604T;
        float fMin4 = Math.min(0.8f, fMax * 0.8f);
        C8959d.a aVar4 = c8959d5.f46931a;
        aVar4.f46941e = 0.0f;
        aVar4.f46942f = fMin4;
        c8959d5.invalidateSelf();
        C8959d c8959d6 = this.f7604T;
        fMin = Math.min(1.0f, fMax);
        aVar = c8959d6.f46931a;
        if (fMin != aVar.f46952p) {
            aVar.f46952p = fMin;
        }
        c8959d6.invalidateSelf();
        C8959d c8959d7 = this.f7604T;
        c8959d7.f46931a.f46943g = ((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        c8959d7.invalidateSelf();
        setTargetOffsetTopAndBottom(i11 - this.f7592H);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f3, float f10, boolean z10) {
        return this.f7621h.m18841a(f3, f10, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f3, float f10) {
        return this.f7621h.m18842b(f3, f10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f7621h.m18843c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f7621h.m18845e(i10, i11, i12, i13, iArr, 0, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m4612e(float f3) {
        int i10 = this.f7600P;
        setTargetOffsetTopAndBottom((i10 + ((int) ((this.f7601Q - i10) * f3))) - this.f7598N.getTop());
    }

    /* JADX INFO: renamed from: f */
    public final void m4613f() {
        this.f7598N.clearAnimation();
        this.f7604T.stop();
        this.f7598N.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.f7601Q - this.f7592H);
        this.f7592H = this.f7598N.getTop();
    }

    /* JADX INFO: renamed from: g */
    public final void m4614g(boolean z10, boolean z11) {
        if (this.f7612c != z10) {
            this.f7611b0 = z11;
            m4609b();
            this.f7612c = z10;
            AnimationAnimationListenerC1193a animationAnimationListenerC1193a = this.f7615d0;
            if (z10) {
                this.f7600P = this.f7592H;
                C1195c c1195c = this.f7617e0;
                c1195c.reset();
                c1195c.setDuration(200L);
                c1195c.setInterpolator(this.f7597M);
                if (animationAnimationListenerC1193a != null) {
                    this.f7598N.f46923a = animationAnimationListenerC1193a;
                }
                this.f7598N.clearAnimation();
                this.f7598N.startAnimation(c1195c);
                return;
            }
            C8961f c8961f = new C8961f(this);
            this.f7606V = c8961f;
            c8961f.setDuration(150L);
            C8956a c8956a = this.f7598N;
            c8956a.f46923a = animationAnimationListenerC1193a;
            c8956a.clearAnimation();
            this.f7598N.startAnimation(this.f7606V);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.f7599O;
        if (i12 < 0) {
            return i11;
        }
        if (i11 == i10 - 1) {
            return i12;
        }
        if (i11 >= i12) {
            i11++;
        }
        return i11;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C10058q c10058q = this.f7620g;
        return c10058q.f51048b | c10058q.f51047a;
    }

    public int getProgressCircleDiameter() {
        return this.f7613c0;
    }

    public int getProgressViewEndOffset() {
        return this.f7602R;
    }

    public int getProgressViewStartOffset() {
        return this.f7601Q;
    }

    /* JADX INFO: renamed from: h */
    public final void m4615h(float f3) {
        float f10 = this.f7594J;
        float f11 = f3 - f10;
        int i10 = this.f7614d;
        if (f11 <= i10 || this.f7595K) {
            return;
        }
        this.f7593I = f10 + i10;
        this.f7595K = true;
        this.f7604T.setAlpha(76);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f7621h.m18846f(0) != null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f7621h.f51045d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m4613f();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0078  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m4609b();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !m4608a() && !this.f7612c && !this.f7624k) {
            if (actionMasked == 0) {
                setTargetOffsetTopAndBottom(this.f7601Q - this.f7598N.getTop());
                int pointerId = motionEvent.getPointerId(0);
                this.f7596L = pointerId;
                this.f7595K = false;
                int iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
                if (iFindPointerIndex < 0) {
                    return false;
                }
                this.f7594J = motionEvent.getY(iFindPointerIndex);
            } else if (actionMasked == 1) {
                this.f7595K = false;
                this.f7596L = -1;
            } else if (actionMasked == 2) {
                int i10 = this.f7596L;
                if (i10 == -1) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                    return false;
                }
                int iFindPointerIndex2 = motionEvent.findPointerIndex(i10);
                if (iFindPointerIndex2 < 0) {
                    return false;
                }
                m4615h(motionEvent.getY(iFindPointerIndex2));
            } else if (actionMasked == 3) {
                this.f7595K = false;
                this.f7596L = -1;
            } else if (actionMasked == 6) {
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == this.f7596L) {
                    this.f7596L = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                }
            }
            return this.f7595K;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f7608a == null) {
            m4609b();
        }
        View view = this.f7608a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f7598N.getMeasuredWidth();
        int measuredHeight2 = this.f7598N.getMeasuredHeight();
        int i14 = measuredWidth / 2;
        int i15 = measuredWidth2 / 2;
        int i16 = this.f7592H;
        this.f7598N.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f7608a == null) {
            m4609b();
        }
        View view = this.f7608a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f7598N.measure(View.MeasureSpec.makeMeasureSpec(this.f7613c0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f7613c0, 1073741824));
        this.f7599O = -1;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == this.f7598N) {
                this.f7599O = i12;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f10, boolean z10) {
        return dispatchNestedFling(f3, f10, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f10) {
        return dispatchNestedPreFling(f3, f10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f3 = this.f7618f;
            if (f3 > 0.0f) {
                float f10 = i11;
                if (f10 > f3) {
                    iArr[1] = i11 - ((int) f3);
                    this.f7618f = 0.0f;
                } else {
                    this.f7618f = f3 - f10;
                    iArr[1] = i11;
                }
                m4611d(this.f7618f);
            }
        }
        int i12 = i10 - iArr[0];
        int i13 = i11 - iArr[1];
        int[] iArr2 = this.f7622i;
        if (dispatchNestedPreScroll(i12, i13, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        dispatchNestedScroll(i10, i11, i12, i13, this.f7623j);
        int i14 = i13 + this.f7623j[1];
        if (i14 < 0 && !m4608a()) {
            float fAbs = this.f7618f + Math.abs(i14);
            this.f7618f = fAbs;
            m4611d(fAbs);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f7620g.f51047a = i10;
        startNestedScroll(i10 & 2);
        this.f7618f = 0.0f;
        this.f7624k = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return (!isEnabled() || this.f7612c || (i10 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f7620g.f51047a = 0;
        this.f7624k = false;
        float f3 = this.f7618f;
        if (f3 > 0.0f) {
            m4610c(f3);
            this.f7618f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !m4608a() && !this.f7612c) {
            if (!this.f7624k) {
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.f7596L);
                        if (iFindPointerIndex < 0) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                            return false;
                        }
                        if (this.f7595K) {
                            float y10 = (motionEvent.getY(iFindPointerIndex) - this.f7593I) * 0.5f;
                            this.f7595K = false;
                            m4610c(y10);
                        }
                        this.f7596L = -1;
                        return false;
                    }
                    if (actionMasked == 2) {
                        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f7596L);
                        if (iFindPointerIndex2 < 0) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                            return false;
                        }
                        float y11 = motionEvent.getY(iFindPointerIndex2);
                        m4615h(y11);
                        if (this.f7595K) {
                            float f3 = (y11 - this.f7593I) * 0.5f;
                            if (f3 <= 0.0f) {
                                return false;
                            }
                            m4611d(f3);
                        }
                    } else {
                        if (actionMasked == 3) {
                            return false;
                        }
                        if (actionMasked == 5) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (actionIndex < 0) {
                                Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                return false;
                            }
                            this.f7596L = motionEvent.getPointerId(actionIndex);
                        } else if (actionMasked == 6) {
                            int actionIndex2 = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex2) == this.f7596L) {
                                this.f7596L = motionEvent.getPointerId(actionIndex2 == 0 ? 1 : 0);
                            }
                        }
                    }
                    return true;
                }
                this.f7596L = motionEvent.getPointerId(0);
                this.f7595K = false;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        View view = this.f7608a;
        if (view != null) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            if (!C10029b0.i.m18722p(view)) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void setAnimationProgress(float f3) {
        this.f7598N.setScaleX(f3);
        this.f7598N.setScaleY(f3);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m4609b();
        C8959d c8959d = this.f7604T;
        C8959d.a aVar = c8959d.f46931a;
        aVar.f46945i = iArr;
        aVar.m17187a(0);
        aVar.m17187a(0);
        c8959d.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            Object obj = C7472a.f41322a;
            iArr2[i10] = C7472a.d.m14851a(context, i11);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f7616e = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!z10) {
            m4613f();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        C10052n c10052n = this.f7621h;
        if (c10052n.f51045d) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.i.m18732z(c10052n.f51044c);
        }
        c10052n.f51045d = z10;
    }

    public void setOnChildScrollUpCallback(InterfaceC1197e interfaceC1197e) {
    }

    public void setOnRefreshListener(InterfaceC1198f interfaceC1198f) {
        this.f7610b = interfaceC1198f;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.f7598N.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        Context context = getContext();
        Object obj = C7472a.f41322a;
        setProgressBackgroundColorSchemeColor(C7472a.d.m14851a(context, i10));
    }

    public void setRefreshing(boolean z10) {
        if (!z10 || this.f7612c == z10) {
            m4614g(z10, false);
            return;
        }
        this.f7612c = z10;
        setTargetOffsetTopAndBottom((this.f7602R + this.f7601Q) - this.f7592H);
        this.f7611b0 = false;
        this.f7598N.setVisibility(0);
        this.f7604T.setAlpha(255);
        C8960e c8960e = new C8960e(this);
        this.f7605U = c8960e;
        c8960e.setDuration(this.f7625l);
        AnimationAnimationListenerC1193a animationAnimationListenerC1193a = this.f7615d0;
        if (animationAnimationListenerC1193a != null) {
            this.f7598N.f46923a = animationAnimationListenerC1193a;
        }
        this.f7598N.clearAnimation();
        this.f7598N.startAnimation(this.f7605U);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i10 == 0) {
                this.f7613c0 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f7613c0 = (int) (displayMetrics.density * 40.0f);
            }
            this.f7598N.setImageDrawable(null);
            this.f7604T.m17186c(i10);
            this.f7598N.setImageDrawable(this.f7604T);
        }
    }

    public void setSlingshotDistance(int i10) {
        this.f7603S = i10;
    }

    public void setTargetOffsetTopAndBottom(int i10) {
        this.f7598N.bringToFront();
        C8956a c8956a = this.f7598N;
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        c8956a.offsetTopAndBottom(i10);
        this.f7592H = this.f7598N.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return this.f7621h.m18847g(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f7621h.m18848h(0);
    }
}
