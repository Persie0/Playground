package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import androidx.swiperefreshlayout.R$styleable;
import java.util.WeakHashMap;
import p000.dta;
import p000.e21;
import p000.mt6;
import p000.o21;
import p000.p21;
import p000.qg3;
import p000.qo9;
import p000.rj6;
import p000.ro9;
import p000.sj6;
import p000.so9;
import p000.tj6;
import p000.to9;
import p000.uj6;
import p000.uo9;

/* JADX INFO: loaded from: classes2.dex */
public class SwipeRefreshLayout extends ViewGroup implements uj6, tj6, rj6 {

    /* JADX INFO: renamed from: g0 */
    public static final int[] f7073g0 = {R.attr.enabled};

    /* JADX INFO: renamed from: H */
    public int f7074H;

    /* JADX INFO: renamed from: I */
    public float f7075I;

    /* JADX INFO: renamed from: J */
    public float f7076J;

    /* JADX INFO: renamed from: K */
    public boolean f7077K;

    /* JADX INFO: renamed from: L */
    public int f7078L;

    /* JADX INFO: renamed from: M */
    public final DecelerateInterpolator f7079M;

    /* JADX INFO: renamed from: N */
    public final e21 f7080N;

    /* JADX INFO: renamed from: O */
    public int f7081O;

    /* JADX INFO: renamed from: P */
    public int f7082P;

    /* JADX INFO: renamed from: Q */
    public final int f7083Q;

    /* JADX INFO: renamed from: R */
    public final int f7084R;

    /* JADX INFO: renamed from: S */
    public int f7085S;

    /* JADX INFO: renamed from: T */
    public final p21 f7086T;

    /* JADX INFO: renamed from: U */
    public ro9 f7087U;

    /* JADX INFO: renamed from: V */
    public ro9 f7088V;

    /* JADX INFO: renamed from: W */
    public so9 f7089W;

    /* JADX INFO: renamed from: a */
    public View f7090a;

    /* JADX INFO: renamed from: a0 */
    public so9 f7091a0;

    /* JADX INFO: renamed from: b */
    public boolean f7092b;

    /* JADX INFO: renamed from: b0 */
    public int f7093b0;

    /* JADX INFO: renamed from: c */
    public final int f7094c;

    /* JADX INFO: renamed from: c0 */
    public boolean f7095c0;

    /* JADX INFO: renamed from: d */
    public float f7096d;

    /* JADX INFO: renamed from: d0 */
    public final qo9 f7097d0;

    /* JADX INFO: renamed from: e */
    public float f7098e;

    /* JADX INFO: renamed from: e0 */
    public final ro9 f7099e0;

    /* JADX INFO: renamed from: f */
    public final qg3 f7100f;

    /* JADX INFO: renamed from: f0 */
    public final ro9 f7101f0;

    /* JADX INFO: renamed from: g */
    public final sj6 f7102g;

    /* JADX INFO: renamed from: h */
    public final int[] f7103h;

    /* JADX INFO: renamed from: i */
    public final int[] f7104i;

    /* JADX INFO: renamed from: j */
    public final int[] f7105j;

    /* JADX INFO: renamed from: k */
    public boolean f7106k;

    /* JADX INFO: renamed from: l */
    public final int f7107l;

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7092b = false;
        this.f7096d = -1.0f;
        this.f7103h = new int[2];
        this.f7104i = new int[2];
        this.f7105j = new int[2];
        this.f7078L = -1;
        this.f7081O = -1;
        this.f7097d0 = new qo9(this, 0);
        this.f7099e0 = new ro9(this, 2);
        this.f7101f0 = new ro9(this, 3);
        this.f7094c = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f7107l = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f7079M = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f7093b0 = (int) (displayMetrics.density * 40.0f);
        e21 e21Var = new e21(getContext());
        float f = e21Var.getContext().getResources().getDisplayMetrics().density;
        TypedArray typedArrayObtainStyledAttributes = e21Var.getContext().obtainStyledAttributes(R$styleable.SwipeRefreshLayout);
        e21Var.f36612b = typedArrayObtainStyledAttributes.getColor(R$styleable.f7072xaa980688, -328966);
        typedArrayObtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = dta.f36217a;
        e21Var.setElevation(f * 4.0f);
        shapeDrawable.getPaint().setColor(e21Var.f36612b);
        e21Var.setBackground(shapeDrawable);
        this.f7080N = e21Var;
        p21 p21Var = new p21(getContext());
        this.f7086T = p21Var;
        p21Var.m18861c(1);
        this.f7080N.setImageDrawable(this.f7086T);
        this.f7080N.setVisibility(8);
        addView(this.f7080N);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f7084R = i;
        this.f7096d = i;
        this.f7100f = new qg3();
        this.f7102g = new sj6(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f7093b0;
        this.f7074H = i2;
        this.f7083Q = i2;
        m2885k(1.0f);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f7073g0);
        setEnabled(typedArrayObtainStyledAttributes2.getBoolean(0, true));
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.f7080N.getBackground().setAlpha(i);
        this.f7086T.setAlpha(i);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2881a() {
        View view = this.f7090a;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    /* JADX INFO: renamed from: b */
    public final void m2882b() {
        if (this.f7090a == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f7080N)) {
                    this.f7090a = childAt;
                    return;
                }
            }
        }
    }

    @Override // p000.uj6
    /* JADX INFO: renamed from: c */
    public final void mo660c(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        if (i5 == 0) {
            this.f7102g.m21427g(i, i2, i3, i4, this.f7104i, i5, iArr);
        }
        int i7 = i4 - (iArr[1] - i6);
        int i8 = i7 == 0 ? this.f7104i[1] + i4 : i7;
        if (i8 >= 0 || m2881a()) {
            return;
        }
        float fAbs = this.f7098e + Math.abs(i8);
        this.f7098e = fAbs;
        m2884j(fAbs);
        iArr[1] = iArr[1] + i7;
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: d */
    public final void mo661d(View view, int i, int i2, int i3, int i4, int i5) {
        mo660c(view, i, i2, i3, i4, i5, this.f7105j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 285) {
            return super.dispatchKeyEvent(keyEvent);
        }
        m2888n(true, true);
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f7102g.m21421a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f7102g.m21422b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f7102g.m21423c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f7102g.m21427g(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: e */
    public final boolean mo662e(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: f */
    public final void mo663f(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: g */
    public final void mo664g(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f7081O;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        return i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f7100f.m19943b();
    }

    public int getProgressCircleDiameter() {
        return this.f7093b0;
    }

    public int getProgressViewEndOffset() {
        return this.f7084R;
    }

    public int getProgressViewStartOffset() {
        return this.f7083Q;
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: h */
    public final void mo665h(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f7102g.m21430j(0);
    }

    /* JADX INFO: renamed from: i */
    public final void m2883i(float f) {
        if (f > this.f7096d) {
            m2887m(true, true);
            return;
        }
        this.f7092b = false;
        p21 p21Var = this.f7086T;
        o21 o21Var = p21Var.f55474a;
        o21Var.f53631e = 0.0f;
        o21Var.f53632f = 0.0f;
        p21Var.invalidateSelf();
        qo9 qo9Var = new qo9(this, 1);
        this.f7082P = this.f7074H;
        ro9 ro9Var = this.f7101f0;
        ro9Var.reset();
        ro9Var.setDuration(200L);
        ro9Var.setInterpolator(this.f7079M);
        e21 e21Var = this.f7080N;
        e21Var.f36611a = qo9Var;
        e21Var.clearAnimation();
        e21Var.startAnimation(ro9Var);
        o21 o21Var2 = p21Var.f55474a;
        if (o21Var2.f53640n) {
            o21Var2.f53640n = false;
        }
        p21Var.invalidateSelf();
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f7102g.f60935d;
    }

    /* JADX INFO: renamed from: j */
    public final void m2884j(float f) {
        so9 so9Var;
        so9 so9Var2;
        p21 p21Var = this.f7086T;
        o21 o21Var = p21Var.f55474a;
        if (!o21Var.f53640n) {
            o21Var.f53640n = true;
        }
        p21Var.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f / this.f7096d));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - this.f7096d;
        int i = this.f7085S;
        if (i <= 0) {
            i = this.f7084R;
        }
        float f2 = i;
        double dMax = Math.max(0.0f, Math.min(fAbs, f2 * 2.0f) / f2) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i2 = this.f7083Q + ((int) ((f2 * fMin) + (f2 * fPow * 2.0f)));
        e21 e21Var = this.f7080N;
        if (e21Var.getVisibility() != 0) {
            e21Var.setVisibility(0);
        }
        e21Var.setScaleX(1.0f);
        e21Var.setScaleY(1.0f);
        if (f < this.f7096d) {
            if (p21Var.f55474a.f53646t > 76 && ((so9Var2 = this.f7089W) == null || !so9Var2.hasStarted() || so9Var2.hasEnded())) {
                so9 so9Var3 = new so9(this, p21Var.f55474a.f53646t, 76);
                so9Var3.setDuration(300L);
                e21Var.f36611a = null;
                e21Var.clearAnimation();
                e21Var.startAnimation(so9Var3);
                this.f7089W = so9Var3;
            }
        } else if (p21Var.f55474a.f53646t < 255 && ((so9Var = this.f7091a0) == null || !so9Var.hasStarted() || so9Var.hasEnded())) {
            so9 so9Var4 = new so9(this, p21Var.f55474a.f53646t, 255);
            so9Var4.setDuration(300L);
            e21Var.f36611a = null;
            e21Var.clearAnimation();
            e21Var.startAnimation(so9Var4);
            this.f7091a0 = so9Var4;
        }
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        o21 o21Var2 = p21Var.f55474a;
        o21Var2.f53631e = 0.0f;
        o21Var2.f53632f = fMin2;
        p21Var.invalidateSelf();
        float fMin3 = Math.min(1.0f, fMax);
        o21 o21Var3 = p21Var.f55474a;
        if (fMin3 != o21Var3.f53642p) {
            o21Var3.f53642p = fMin3;
        }
        p21Var.invalidateSelf();
        p21Var.f55474a.f53633g = ((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        p21Var.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.f7074H);
    }

    /* JADX INFO: renamed from: k */
    public final void m2885k(float f) {
        int i = this.f7082P;
        setTargetOffsetTopAndBottom((i + ((int) ((this.f7083Q - i) * f))) - this.f7080N.getTop());
    }

    /* JADX INFO: renamed from: l */
    public final void m2886l() {
        this.f7080N.clearAnimation();
        this.f7086T.stop();
        this.f7080N.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.f7083Q - this.f7074H);
        this.f7074H = this.f7080N.getTop();
    }

    /* JADX INFO: renamed from: m */
    public final void m2887m(boolean z, boolean z2) {
        if (this.f7092b != z) {
            m2882b();
            this.f7092b = z;
            e21 e21Var = this.f7080N;
            qo9 qo9Var = this.f7097d0;
            if (!z) {
                ro9 ro9Var = new ro9(this, 1);
                this.f7088V = ro9Var;
                ro9Var.setDuration(150L);
                e21Var.f36611a = qo9Var;
                e21Var.clearAnimation();
                e21Var.startAnimation(this.f7088V);
                return;
            }
            this.f7082P = this.f7074H;
            ro9 ro9Var2 = this.f7099e0;
            ro9Var2.reset();
            ro9Var2.setDuration(200L);
            ro9Var2.setInterpolator(this.f7079M);
            if (qo9Var != null) {
                e21Var.f36611a = qo9Var;
            }
            e21Var.clearAnimation();
            e21Var.startAnimation(ro9Var2);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m2888n(boolean z, boolean z2) {
        if (!z || this.f7092b == z) {
            m2887m(z, false);
            return;
        }
        this.f7092b = z;
        setTargetOffsetTopAndBottom((this.f7084R + this.f7083Q) - this.f7074H);
        e21 e21Var = this.f7080N;
        e21Var.setVisibility(0);
        this.f7086T.setAlpha(255);
        ro9 ro9Var = new ro9(this, 0);
        this.f7087U = ro9Var;
        ro9Var.setDuration(this.f7107l);
        qo9 qo9Var = this.f7097d0;
        if (qo9Var != null) {
            e21Var.f36611a = qo9Var;
        }
        e21Var.clearAnimation();
        e21Var.startAnimation(this.f7087U);
    }

    /* JADX INFO: renamed from: o */
    public final void m2889o(float f) {
        float f2 = this.f7076J;
        float f3 = f - f2;
        float f4 = this.f7094c;
        if (f3 <= f4 || this.f7077K) {
            return;
        }
        this.f7075I = f2 + f4;
        this.f7077K = true;
        this.f7086T.setAlpha(76);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2886l();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m2882b();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !m2881a() && !this.f7092b && !this.f7106k) {
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    this.f7077K = false;
                    this.f7078L = -1;
                } else if (actionMasked == 2) {
                    int i = this.f7078L;
                    if (i == -1) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    if (iFindPointerIndex >= 0) {
                        m2889o(motionEvent.getY(iFindPointerIndex));
                    }
                } else if (actionMasked == 3) {
                    this.f7077K = false;
                    this.f7078L = -1;
                } else if (actionMasked == 6) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == this.f7078L) {
                        this.f7078L = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    }
                }
                return this.f7077K;
            }
            setTargetOffsetTopAndBottom(this.f7083Q - this.f7080N.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f7078L = pointerId;
            this.f7077K = false;
            int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex2 >= 0) {
                this.f7076J = motionEvent.getY(iFindPointerIndex2);
                return this.f7077K;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f7090a == null) {
            m2882b();
        }
        View view = this.f7090a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f7080N.getMeasuredWidth();
        int measuredHeight2 = this.f7080N.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.f7074H;
        this.f7080N.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f7090a == null) {
            m2882b();
        }
        View view = this.f7090a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f7080N.measure(View.MeasureSpec.makeMeasureSpec(this.f7093b0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f7093b0, 1073741824));
        this.f7081O = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.f7080N) {
                this.f7081O = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.f7102g.m21421a(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f7102g.m21422b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f7098e;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.f7098e = 0.0f;
                } else {
                    this.f7098e = f - f2;
                    iArr[1] = i2;
                }
                m2884j(this.f7098e);
            }
        }
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int[] iArr2 = this.f7103h;
        if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo660c(view, i, i2, i3, i4, 0, this.f7105j);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f7100f.f57750a = i;
        startNestedScroll(i & 2);
        this.f7098e = 0.0f;
        this.f7106k = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.f7108a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f7092b);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f7092b || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f7100f.f57750a = 0;
        this.f7106k = false;
        float f = this.f7098e;
        if (f > 0.0f) {
            m2883i(f);
            this.f7098e = 0.0f;
        } else {
            post(new mt6(this, 11));
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !m2881a() && !this.f7092b && !this.f7106k) {
            if (actionMasked == 0) {
                this.f7078L = motionEvent.getPointerId(0);
                this.f7077K = false;
                return true;
            }
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f7078L);
                if (iFindPointerIndex < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f7077K) {
                    float y = (motionEvent.getY(iFindPointerIndex) - this.f7075I) * 0.5f;
                    this.f7077K = false;
                    m2883i(y);
                }
                this.f7078L = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f7078L);
                if (iFindPointerIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                m2889o(y2);
                if (this.f7077K) {
                    float f = (y2 - this.f7075I) * 0.5f;
                    if (f > 0.0f) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        m2884j(f);
                    }
                }
                return true;
            }
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f7078L) {
                            this.f7078L = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f7078L = motionEvent.getPointerId(actionIndex2);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        View view;
        if (this.f7095c0 && (view = this.f7090a) != null) {
            WeakHashMap weakHashMap = dta.f36217a;
            if (!view.isNestedScrollingEnabled()) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f) {
        this.f7080N.setScaleX(f);
        this.f7080N.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m2882b();
        p21 p21Var = this.f7086T;
        o21 o21Var = p21Var.f55474a;
        o21Var.f53635i = iArr;
        o21Var.m17769a(0);
        o21Var.m17769a(0);
        p21Var.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = context.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f7096d = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        m2886l();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.f7095c0 = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f7102g.m21432l(z);
    }

    public void setOnChildScrollUpCallback(to9 to9Var) {
    }

    public void setOnRefreshListener(uo9 uo9Var) {
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f7080N.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i));
    }

    public void setRefreshing(boolean z) {
        m2888n(z, false);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f7093b0 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f7093b0 = (int) (displayMetrics.density * 40.0f);
            }
            this.f7080N.setImageDrawable(null);
            this.f7086T.m18861c(i);
            this.f7080N.setImageDrawable(this.f7086T);
        }
    }

    public void setSlingshotDistance(int i) {
        this.f7085S = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        e21 e21Var = this.f7080N;
        e21Var.bringToFront();
        WeakHashMap weakHashMap = dta.f36217a;
        e21Var.offsetTopAndBottom(i);
        this.f7074H = e21Var.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f7102g.m21434n(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f7102g.m21436p(0);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0766a();

        /* JADX INFO: renamed from: a */
        public final boolean f7108a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f7108a = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f7108a ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.f7108a = z;
        }
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }
}
