package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import p000.abi;
import p000.aer;
import p000.aes;
import p000.aeu;
import p000.aev;
import p000.afb;
import p000.afq;
import p000.ahi;
import p000.ahl;
import p000.ahm;
import p000.ahn;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements aeu, aer {

    /* JADX INFO: renamed from: c */
    private static final float f1485c = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: d */
    private static final ahl f1486d = new ahl();

    /* JADX INFO: renamed from: e */
    private static final int[] f1487e = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A */
    private final aev f1488A;

    /* JADX INFO: renamed from: B */
    private final aes f1489B;

    /* JADX INFO: renamed from: C */
    private float f1490C;

    /* JADX INFO: renamed from: a */
    public EdgeEffect f1491a;

    /* JADX INFO: renamed from: b */
    public EdgeEffect f1492b;

    /* JADX INFO: renamed from: f */
    private final float f1493f;

    /* JADX INFO: renamed from: g */
    private long f1494g;

    /* JADX INFO: renamed from: h */
    private final Rect f1495h;

    /* JADX INFO: renamed from: i */
    private OverScroller f1496i;

    /* JADX INFO: renamed from: j */
    private int f1497j;

    /* JADX INFO: renamed from: k */
    private boolean f1498k;

    /* JADX INFO: renamed from: l */
    private boolean f1499l;

    /* JADX INFO: renamed from: m */
    private View f1500m;

    /* JADX INFO: renamed from: n */
    private boolean f1501n;

    /* JADX INFO: renamed from: o */
    private VelocityTracker f1502o;

    /* JADX INFO: renamed from: p */
    private boolean f1503p;

    /* JADX INFO: renamed from: q */
    private boolean f1504q;

    /* JADX INFO: renamed from: r */
    private int f1505r;

    /* JADX INFO: renamed from: s */
    private int f1506s;

    /* JADX INFO: renamed from: t */
    private int f1507t;

    /* JADX INFO: renamed from: u */
    private int f1508u;

    /* JADX INFO: renamed from: v */
    private final int[] f1509v;

    /* JADX INFO: renamed from: w */
    private final int[] f1510w;

    /* JADX INFO: renamed from: x */
    private int f1511x;

    /* JADX INFO: renamed from: y */
    private int f1512y;

    /* JADX INFO: renamed from: z */
    private ahn f1513z;

    public NestedScrollView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: A */
    private final void m1432A(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1508u) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1497j = (int) motionEvent.getY(i);
            this.f1508u = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1502o;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX INFO: renamed from: B */
    private final void m1433B() {
        VelocityTracker velocityTracker = this.f1502o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1502o = null;
        }
    }

    /* JADX INFO: renamed from: C */
    private final void m1434C(boolean z) {
        if (z) {
            m1458o(2, 1);
        } else {
            m1452i(1);
        }
        this.f1512y = getScrollY();
        afb.m426g(this);
    }

    /* JADX INFO: renamed from: D */
    private final void m1435D(View view) {
        view.getDrawingRect(this.f1495h);
        offsetDescendantRectToMyCoords(view, this.f1495h);
        int iM1449a = m1449a(this.f1495h);
        if (iM1449a != 0) {
            scrollBy(0, iM1449a);
        }
    }

    /* JADX INFO: renamed from: E */
    private final boolean m1436E(View view) {
        return !m1438G(view, 0, getHeight());
    }

    /* JADX INFO: renamed from: F */
    private static boolean m1437F(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m1437F((View) parent, view2);
    }

    /* JADX INFO: renamed from: G */
    private final boolean m1438G(View view, int i, int i2) {
        view.getDrawingRect(this.f1495h);
        offsetDescendantRectToMyCoords(view, this.f1495h);
        return this.f1495h.bottom + i >= getScrollY() && this.f1495h.top - i <= getScrollY() + i2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0066  */
    /* JADX INFO: renamed from: H */
    private final boolean m1439H(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = (View) focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z3 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = i == 33 ? top < view.getTop() : bottom > view.getBottom();
                    if (z2) {
                        if (z3 && z4) {
                            view = view2;
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (z4) {
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m1444v(i == 33 ? i2 - scrollY : i3 - i4, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    /* JADX INFO: renamed from: I */
    private final boolean m1440I(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fM670a = ahi.m670a(edgeEffect) * getHeight();
        double dLog = Math.log((Math.abs(-i) * 0.35f) / (this.f1493f * 0.015f));
        double d = f1485c;
        float f = this.f1493f * 0.015f;
        Double.isNaN(d);
        Double.isNaN(d);
        double d2 = f;
        double dExp = Math.exp((d / ((-1.0d) + d)) * dLog);
        Double.isNaN(d2);
        return ((float) (d2 * dExp)) < fM670a;
    }

    /* JADX INFO: renamed from: J */
    private final boolean m1441J(MotionEvent motionEvent) {
        boolean z;
        if (ahi.m670a(this.f1491a) != 0.0f) {
            ahi.m671b(this.f1491a, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (ahi.m670a(this.f1492b) == 0.0f) {
            return z;
        }
        ahi.m671b(this.f1492b, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* JADX INFO: renamed from: K */
    private final void m1442K(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1494g > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f1496i.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            m1434C(z);
        } else {
            if (!this.f1496i.isFinished()) {
                m1445w();
            }
            scrollBy(i, i2);
        }
        this.f1494g = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX INFO: renamed from: u */
    private static int m1443u(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* JADX INFO: renamed from: v */
    private final int m1444v(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        if (i3 == 1) {
            m1458o(2, 1);
        }
        if (m1454k(0, i, this.f1510w, this.f1509v, i3)) {
            i4 = i - this.f1510w[1];
            i5 = this.f1509v[1];
        } else {
            i4 = i;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int iM1450b = m1450b();
        int overScrollMode = getOverScrollMode();
        boolean z2 = (overScrollMode == 0 || (overScrollMode == 1 && m1450b() > 0)) && !z;
        boolean z3 = m1460q(i4, 0, scrollY, iM1450b) && !m1457n(i3);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f1510w;
        iArr[1] = 0;
        m1459p(scrollY2, i4 - scrollY2, this.f1509v, i3, iArr);
        int i6 = i5 + this.f1509v[1];
        int i7 = i4 - this.f1510w[1];
        int i8 = scrollY + i7;
        if (i8 < 0) {
            if (z2) {
                ahi.m671b(this.f1491a, (-i7) / getHeight(), i2 / getWidth());
                if (!this.f1492b.isFinished()) {
                    this.f1492b.onRelease();
                }
            }
        } else if (i8 > iM1450b && z2) {
            ahi.m671b(this.f1492b, i7 / getHeight(), 1.0f - (i2 / getWidth()));
            if (!this.f1491a.isFinished()) {
                this.f1491a.onRelease();
            }
        }
        if (!this.f1491a.isFinished() || !this.f1492b.isFinished()) {
            afb.m426g(this);
        } else if (z3 && i3 == 0) {
            this.f1502o.clear();
        }
        if (i3 == 1) {
            m1452i(1);
            this.f1491a.onRelease();
            this.f1492b.onRelease();
        }
        return i6;
    }

    /* JADX INFO: renamed from: w */
    private final void m1445w() {
        this.f1496i.abortAnimation();
        m1452i(1);
    }

    /* JADX INFO: renamed from: x */
    private final void m1446x() {
        this.f1508u = -1;
        this.f1501n = false;
        m1433B();
        m1452i(0);
        this.f1491a.onRelease();
        this.f1492b.onRelease();
    }

    /* JADX INFO: renamed from: y */
    private final void m1447y() {
        if (this.f1502o == null) {
            this.f1502o = VelocityTracker.obtain();
        }
    }

    /* JADX INFO: renamed from: z */
    private final void m1448z(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1489B.m389g(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* JADX INFO: renamed from: a */
    protected final int m1449a(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        if (rect.bottom > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || rect.bottom >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? -(i2 - rect.bottom) : -(scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    /* JADX INFO: renamed from: b */
    public final int m1450b() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* JADX INFO: renamed from: c */
    public final void m1451c(int i) {
        if (getChildCount() > 0) {
            this.f1496i.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m1434C(true);
        }
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.f1496i.isFinished()) {
            return;
        }
        this.f1496i.computeScrollOffset();
        int currY = this.f1496i.getCurrY();
        int i = currY - this.f1512y;
        int height = getHeight();
        if (i > 0 && ahi.m670a(this.f1491a) != 0.0f) {
            int iRound = Math.round(((-height) / 4.0f) * ahi.m671b(this.f1491a, ((-i) * 4.0f) / height, 0.5f));
            if (iRound != i) {
                this.f1491a.finish();
            }
            i -= iRound;
        } else if (i < 0 && ahi.m670a(this.f1492b) != 0.0f) {
            float f = height;
            int iRound2 = Math.round((f / 4.0f) * ahi.m671b(this.f1492b, (i * 4.0f) / f, 0.5f));
            if (iRound2 != i) {
                this.f1492b.finish();
            }
            i -= iRound2;
        }
        this.f1512y = currY;
        int[] iArr = this.f1510w;
        iArr[1] = 0;
        m1454k(0, i, iArr, null, 1);
        int i2 = i - this.f1510w[1];
        int iM1450b = m1450b();
        if (i2 != 0) {
            int scrollY = getScrollY();
            m1460q(i2, getScrollX(), scrollY, iM1450b);
            int scrollY2 = getScrollY() - scrollY;
            int[] iArr2 = this.f1510w;
            iArr2[1] = 0;
            int i3 = i2 - scrollY2;
            m1459p(scrollY2, i3, this.f1509v, 1, iArr2);
            i2 = i3 - this.f1510w[1];
        }
        if (i2 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && iM1450b > 0)) {
                if (i2 < 0) {
                    if (this.f1491a.isFinished()) {
                        this.f1491a.onAbsorb((int) this.f1496i.getCurrVelocity());
                    }
                } else if (this.f1492b.isFinished()) {
                    this.f1492b.onAbsorb((int) this.f1496i.getCurrVelocity());
                }
            }
            m1445w();
        }
        if (this.f1496i.isFinished()) {
            m1452i(1);
        } else {
            afb.m426g(this);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY <= iMax ? bottom : bottom + (scrollY - iMax);
    }

    @Override // p000.aet
    /* JADX INFO: renamed from: d */
    public final void mo392d(View view, int i, int i2, int[] iArr, int i3) {
        m1454k(i, i2, iArr, null, i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m1455l(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1489B.m385c(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1489B.m386d(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m1454k(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1489B.m388f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f1491a.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (ahm.m679a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (ahm.m679a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f1491a.setSize(width, height);
            if (this.f1491a.draw(canvas)) {
                afb.m426g(this);
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f1492b.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(m1450b(), scrollY) + height2;
        if (ahm.m679a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = getPaddingLeft();
        }
        if (ahm.m679a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f1492b.setSize(width2, height2);
        if (this.f1492b.draw(canvas)) {
            afb.m426g(this);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // p000.aet
    /* JADX INFO: renamed from: e */
    public final void mo393e(View view, int i, int i2, int i3, int i4, int i5) {
        m1448z(i4, i5, null);
    }

    @Override // p000.aeu
    /* JADX INFO: renamed from: f */
    public final void mo397f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m1448z(i4, i5, iArr);
    }

    @Override // p000.aet
    /* JADX INFO: renamed from: g */
    public final void mo394g(View view, View view2, int i, int i2) {
        this.f1488A.m399b(i, i2);
        m1458o(2, i2);
    }

    @Override // android.view.View
    protected final float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.f1488A.m398a();
    }

    @Override // android.view.View
    protected final float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // p000.aet
    /* JADX INFO: renamed from: h */
    public final void mo395h(View view, int i) {
        this.f1488A.m400c(i);
        m1452i(i);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return m1457n(0);
    }

    /* JADX INFO: renamed from: i */
    public final void m1452i(int i) {
        this.f1489B.m384b(i);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1489B.f258a;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1453j(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int height = (int) (getHeight() * 0.5f);
        if (viewFindNextFocus == null || !m1438G(viewFindNextFocus, height, getHeight())) {
            if (i == 33 && getScrollY() < height) {
                height = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                height = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), height);
            }
            if (height == 0) {
                return false;
            }
            if (i != 130) {
                height = -height;
            }
            m1444v(height, 0, 1, true);
        } else {
            viewFindNextFocus.getDrawingRect(this.f1495h);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f1495h);
            m1444v(m1449a(this.f1495h), 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && m1436E(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1454k(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f1489B.m387e(i, i2, iArr, iArr2, i3);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m1455l(KeyEvent keyEvent) {
        this.f1495h.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                switch (keyEvent.getKeyCode()) {
                    case 19:
                        return !keyEvent.isAltPressed() ? m1453j(33) : m1456m(33);
                    case 20:
                        return !keyEvent.isAltPressed() ? m1453j(130) : m1456m(130);
                    case 62:
                        int i = true != keyEvent.isShiftPressed() ? 130 : 33;
                        int height = getHeight();
                        if (i == 130) {
                            this.f1495h.top = getScrollY() + height;
                            int childCount = getChildCount();
                            if (childCount > 0) {
                                View childAt2 = getChildAt(childCount - 1);
                                int bottom = childAt2.getBottom() + ((FrameLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin + getPaddingBottom();
                                if (this.f1495h.top + height > bottom) {
                                    this.f1495h.top = bottom - height;
                                }
                            }
                        } else {
                            this.f1495h.top = getScrollY() - height;
                            if (this.f1495h.top < 0) {
                                this.f1495h.top = 0;
                            }
                        }
                        Rect rect = this.f1495h;
                        rect.bottom = rect.top + height;
                        m1439H(i, this.f1495h.top, this.f1495h.bottom);
                        return false;
                    default:
                        return false;
                }
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m1456m(int i) {
        int childCount;
        int height = getHeight();
        this.f1495h.top = 0;
        this.f1495h.bottom = height;
        if (i == 130 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f1495h.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect = this.f1495h;
            rect.top = rect.bottom - height;
        }
        return m1439H(i, this.f1495h.top, this.f1495h.bottom);
    }

    @Override // android.view.ViewGroup
    protected final void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX INFO: renamed from: n */
    public final boolean m1457n(int i) {
        return this.f1489B.m390h(i);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m1458o(int i, int i2) {
        return this.f1489B.m391i(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1499l = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int width;
        if (motionEvent.getAction() == 8 && !this.f1501n) {
            if (abi.m111c(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if (abi.m111c(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                axisValue = axisValue2;
            } else {
                axisValue = 0.0f;
                width = 0;
            }
            if (axisValue != 0.0f) {
                float dimension = this.f1490C;
                if (dimension == 0.0f) {
                    TypedValue typedValue = new TypedValue();
                    Context context = getContext();
                    if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
                    }
                    dimension = typedValue.getDimension(context.getResources().getDisplayMetrics());
                    this.f1490C = dimension;
                }
                m1444v(-((int) (axisValue * dimension)), width, 1, abi.m111c(motionEvent, 8194));
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0106  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2) {
            if (this.f1501n) {
                return true;
            }
            action = 2;
        }
        switch (action & 255) {
            case 0:
                int y = (int) motionEvent.getY();
                int x = (int) motionEvent.getX();
                if (getChildCount() <= 0) {
                    if (!m1441J(motionEvent)) {
                        z = false;
                    }
                    this.f1501n = z;
                    m1433B();
                } else {
                    int scrollY = getScrollY();
                    View childAt = getChildAt(0);
                    if (y >= childAt.getTop() - scrollY && y < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                        this.f1497j = y;
                        this.f1508u = motionEvent.getPointerId(0);
                        VelocityTracker velocityTracker = this.f1502o;
                        if (velocityTracker == null) {
                            this.f1502o = VelocityTracker.obtain();
                        } else {
                            velocityTracker.clear();
                        }
                        this.f1502o.addMovement(motionEvent);
                        this.f1496i.computeScrollOffset();
                        if (!m1441J(motionEvent) && this.f1496i.isFinished()) {
                            z = false;
                        }
                        this.f1501n = z;
                        m1458o(2, 0);
                    } else {
                        if (!m1441J(motionEvent) && this.f1496i.isFinished()) {
                            z = false;
                        }
                        this.f1501n = z;
                        m1433B();
                    }
                }
                break;
            case 1:
            case 3:
                this.f1501n = false;
                this.f1508u = -1;
                m1433B();
                if (this.f1496i.springBack(getScrollX(), getScrollY(), 0, 0, 0, m1450b())) {
                    afb.m426g(this);
                }
                m1452i(0);
                break;
            case 2:
                int i = this.f1508u;
                if (i != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    if (iFindPointerIndex != -1) {
                        int y2 = (int) motionEvent.getY(iFindPointerIndex);
                        if (Math.abs(y2 - this.f1497j) > this.f1505r && (2 & getNestedScrollAxes()) == 0) {
                            this.f1501n = true;
                            this.f1497j = y2;
                            m1447y();
                            this.f1502o.addMovement(motionEvent);
                            this.f1511x = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    } else {
                        Log.e("NestedScrollView", "Invalid pointerId=" + i + " in onInterceptTouchEvent");
                    }
                }
                break;
            case 6:
                m1432A(motionEvent);
                break;
        }
        return this.f1501n;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredHeight = 0;
        this.f1498k = false;
        View view = this.f1500m;
        if (view != null && m1437F(view, this)) {
            m1435D(this.f1500m);
        }
        this.f1500m = null;
        if (!this.f1499l) {
            if (this.f1513z != null) {
                scrollTo(getScrollX(), this.f1513z.f392a);
                this.f1513z = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iM1443u = m1443u(scrollY, paddingTop, measuredHeight);
            if (iM1443u != scrollY) {
                scrollTo(getScrollX(), iM1443u);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1499l = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1503p && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m1451c((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo392d(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m1448z(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo394g(view, view2, i, 0);
    }

    @Override // android.view.View
    protected final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus == null || m1436E(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ahn)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ahn ahnVar = (ahn) parcelable;
        super.onRestoreInstanceState(ahnVar.getSuperState());
        this.f1513z = ahnVar;
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        ahn ahnVar = new ahn(super.onSaveInstanceState());
        ahnVar.f392a = getScrollY();
        return ahnVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m1438G(viewFindFocus, 0, i4)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f1495h);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f1495h);
        int iM1449a = m1449a(this.f1495h);
        if (iM1449a != 0) {
            if (this.f1504q) {
                m1461r(iM1449a);
            } else {
                scrollBy(0, iM1449a);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo396t(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo395h(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0117  */
    /* JADX WARN: Code duplicated, block: B:45:0x011e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0122  */
    /* JADX WARN: Code duplicated, block: B:49:0x0129  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float fM671b;
        int iRound;
        int i;
        ViewParent parent2;
        m1447y();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1511x = 0;
            actionMasked = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f1511x);
        switch (actionMasked) {
            case 0:
                if (getChildCount() == 0) {
                    return false;
                }
                if (this.f1501n && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                if (!this.f1496i.isFinished()) {
                    m1445w();
                }
                int y = (int) motionEvent.getY();
                int pointerId = motionEvent.getPointerId(0);
                this.f1497j = y;
                this.f1508u = pointerId;
                m1458o(2, 0);
                break;
            case 1:
                VelocityTracker velocityTracker = this.f1502o;
                velocityTracker.computeCurrentVelocity(1000, this.f1507t);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1508u);
                if (Math.abs(yVelocity) >= this.f1506s) {
                    if (ahi.m670a(this.f1491a) != 0.0f) {
                        if (m1440I(this.f1491a, yVelocity)) {
                            this.f1491a.onAbsorb(yVelocity);
                        } else {
                            m1451c(-yVelocity);
                        }
                    } else if (ahi.m670a(this.f1492b) != 0.0f) {
                        int i2 = -yVelocity;
                        if (m1440I(this.f1492b, i2)) {
                            this.f1492b.onAbsorb(i2);
                        } else {
                            m1451c(i2);
                        }
                    } else {
                        int i3 = -yVelocity;
                        float f2 = i3;
                        if (!dispatchNestedPreFling(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            m1451c(i3);
                        }
                    }
                } else if (this.f1496i.springBack(getScrollX(), getScrollY(), 0, 0, 0, m1450b())) {
                    afb.m426g(this);
                }
                m1446x();
                break;
            case 2:
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1508u);
                if (iFindPointerIndex != -1) {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    int i4 = this.f1497j - y2;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i4 / getHeight();
                    if (ahi.m670a(this.f1491a) != 0.0f) {
                        fM671b = -ahi.m671b(this.f1491a, -height, x);
                        if (ahi.m670a(this.f1491a) == 0.0f) {
                            this.f1491a.onRelease();
                        }
                    } else if (ahi.m670a(this.f1492b) == 0.0f) {
                        iRound = Math.round(f * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i = i4 - iRound;
                        if (!this.f1501n && Math.abs(i) > this.f1505r) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f1501n = true;
                            if (i > 0) {
                                i -= this.f1505r;
                            } else {
                                i += this.f1505r;
                            }
                        }
                        if (this.f1501n) {
                            int iM1444v = m1444v(i, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.f1497j = y2 - iM1444v;
                            this.f1511x += iM1444v;
                        }
                    } else {
                        fM671b = ahi.m671b(this.f1492b, height, 1.0f - x);
                        if (ahi.m670a(this.f1492b) == 0.0f) {
                            this.f1492b.onRelease();
                        }
                    }
                    f = fM671b;
                    iRound = Math.round(f * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i = i4 - iRound;
                    if (!this.f1501n) {
                        parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f1501n = true;
                        if (i > 0) {
                            i -= this.f1505r;
                        } else {
                            i += this.f1505r;
                        }
                    }
                    if (this.f1501n) {
                        int iM1444v2 = m1444v(i, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f1497j = y2 - iM1444v2;
                        this.f1511x += iM1444v2;
                    }
                } else {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f1508u + " in onTouchEvent");
                }
                break;
            case 3:
                if (this.f1501n && getChildCount() > 0 && this.f1496i.springBack(getScrollX(), getScrollY(), 0, 0, 0, m1450b())) {
                    afb.m426g(this);
                }
                m1446x();
                break;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                this.f1497j = (int) motionEvent.getY(actionIndex);
                this.f1508u = motionEvent.getPointerId(actionIndex);
                break;
            case 6:
                m1432A(motionEvent);
                this.f1497j = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1508u));
                break;
        }
        VelocityTracker velocityTracker2 = this.f1502o;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m1459p(int i, int i2, int[] iArr, int i3, int[] iArr2) {
        this.f1489B.m389g(0, i, 0, i2, iArr, i3, iArr2);
    }

    /* JADX INFO: renamed from: q */
    final boolean m1460q(int i, int i2, int i3, int i4) {
        boolean z;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        boolean z2 = i2 > 0 || i2 < 0;
        int i5 = i3 + i;
        if (i5 > i4) {
            z = true;
        } else if (i5 < 0) {
            z = true;
            i4 = 0;
        } else {
            i4 = i5;
            z = false;
        }
        if (z && !m1457n(1)) {
            this.f1496i.springBack(0, i4, 0, 0, 0, m1450b());
        }
        super.scrollTo(0, i4);
        return z2 || z;
    }

    /* JADX INFO: renamed from: r */
    public final void m1461r(int i) {
        m1442K(0, i, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f1498k) {
            this.f1500m = view2;
        } else {
            m1435D(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM1449a = m1449a(rect);
        boolean z2 = iM1449a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iM1449a);
            } else {
                m1461r(iM1449a);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m1433B();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1498k = true;
        super.requestLayout();
    }

    /* JADX INFO: renamed from: s */
    public final void m1462s(int i) {
        m1442K(-getScrollX(), i - getScrollY(), true);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iM1443u = m1443u(i, width, width2);
            int iM1443u2 = m1443u(i2, height, height2);
            if (iM1443u == getScrollX() && iM1443u2 == getScrollY()) {
                return;
            }
            super.scrollTo(iM1443u, iM1443u2);
        }
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        this.f1489B.m383a(z);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return m1458o(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m1452i(0);
    }

    @Override // p000.aet
    /* JADX INFO: renamed from: t */
    public final boolean mo396t(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0100R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1495h = new Rect();
        this.f1498k = true;
        this.f1499l = false;
        this.f1500m = null;
        this.f1501n = false;
        this.f1504q = true;
        this.f1508u = -1;
        this.f1509v = new int[2];
        this.f1510w = new int[2];
        this.f1491a = ahi.m672c(context, attributeSet);
        this.f1492b = ahi.m672c(context, attributeSet);
        this.f1493f = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f1496i = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1505r = viewConfiguration.getScaledTouchSlop();
        this.f1506s = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1507t = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1487e, i, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        if (z != this.f1503p) {
            this.f1503p = z;
            requestLayout();
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f1488A = new aev();
        this.f1489B = new aes(this);
        setNestedScrollingEnabled(true);
        afq.m547g(this, f1486d);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }
}
