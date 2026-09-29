package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
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
import androidx.core.R$attr;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.ArrayList;
import p000.C3386nv;
import p000.dta;
import p000.fqb;
import p000.gg2;
import p000.jo2;
import p000.qg3;
import p000.qj6;
import p000.rj6;
import p000.sj6;
import p000.sn8;
import p000.tbd;
import p000.uj6;
import p000.ur5;
import p000.vj6;
import p000.wo2;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
public class NestedScrollView extends FrameLayout implements uj6, rj6 {

    /* JADX INFO: renamed from: b0 */
    public static final float f5522b0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: c0 */
    public static final ur5 f5523c0 = new ur5(3);

    /* JADX INFO: renamed from: d0 */
    public static final int[] f5524d0 = {R.attr.fillViewport};

    /* JADX INFO: renamed from: H */
    public VelocityTracker f5525H;

    /* JADX INFO: renamed from: I */
    public boolean f5526I;

    /* JADX INFO: renamed from: J */
    public boolean f5527J;

    /* JADX INFO: renamed from: K */
    public final int f5528K;

    /* JADX INFO: renamed from: L */
    public final int f5529L;

    /* JADX INFO: renamed from: M */
    public final int f5530M;

    /* JADX INFO: renamed from: N */
    public int f5531N;

    /* JADX INFO: renamed from: O */
    public final int[] f5532O;

    /* JADX INFO: renamed from: P */
    public final int[] f5533P;

    /* JADX INFO: renamed from: Q */
    public int f5534Q;

    /* JADX INFO: renamed from: R */
    public int f5535R;

    /* JADX INFO: renamed from: S */
    public SavedState f5536S;

    /* JADX INFO: renamed from: T */
    public final qg3 f5537T;

    /* JADX INFO: renamed from: U */
    public final sj6 f5538U;

    /* JADX INFO: renamed from: V */
    public float f5539V;

    /* JADX INFO: renamed from: W */
    public qj6 f5540W;

    /* JADX INFO: renamed from: a */
    public final float f5541a;

    /* JADX INFO: renamed from: a0 */
    public final gg2 f5542a0;

    /* JADX INFO: renamed from: b */
    public long f5543b;

    /* JADX INFO: renamed from: c */
    public final Rect f5544c;

    /* JADX INFO: renamed from: d */
    public final OverScroller f5545d;

    /* JADX INFO: renamed from: e */
    public final EdgeEffect f5546e;

    /* JADX INFO: renamed from: f */
    public final EdgeEffect f5547f;

    /* JADX INFO: renamed from: g */
    public sn8 f5548g;

    /* JADX INFO: renamed from: h */
    public int f5549h;

    /* JADX INFO: renamed from: i */
    public boolean f5550i;

    /* JADX INFO: renamed from: j */
    public boolean f5551j;

    /* JADX INFO: renamed from: k */
    public View f5552k;

    /* JADX INFO: renamed from: l */
    public boolean f5553l;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0482a();

        /* JADX INFO: renamed from: a */
        public int f5554a;

        public final String toString() {
            StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            return wq1.m24123s(sb, this.f5554a, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5554a);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5544c = new Rect();
        this.f5550i = true;
        this.f5551j = false;
        this.f5552k = null;
        this.f5553l = false;
        this.f5527J = true;
        this.f5531N = -1;
        this.f5532O = new int[2];
        this.f5533P = new int[2];
        this.f5542a0 = new gg2(getContext(), new vj6(this, 25));
        int i2 = Build.VERSION.SDK_INT;
        this.f5546e = i2 >= 31 ? jo2.m14567a(context, attributeSet) : new EdgeEffect(context);
        this.f5547f = i2 >= 31 ? jo2.m14567a(context, attributeSet) : new EdgeEffect(context);
        this.f5541a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f5545d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f5528K = viewConfiguration.getScaledTouchSlop();
        this.f5529L = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5530M = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5524d0, i, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f5537T = new qg3();
        this.f5538U = new sj6(this);
        setNestedScrollingEnabled(true);
        dta.m10640k(this, f5523c0);
    }

    private sn8 getScrollFeedbackProvider() {
        if (this.f5548g == null) {
            this.f5548g = new sn8(this);
        }
        return this.f5548g;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m2004m(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m2004m((View) parent, nestedScrollView);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2005a(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View view = viewFindFocus;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m2011n(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m2017t(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f5544c;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m2017t(m2006b(rect), -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (view != null && view.isFocused() && !m2011n(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
        } else {
            C3386nv.m17633t("ScrollView can host only one direct child");
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m2006b(Rect rect) {
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
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // p000.uj6
    /* JADX INFO: renamed from: c */
    public final void mo660c(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m2012o(i4, i5, iArr);
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

    /* JADX WARN: Code duplicated, block: B:21:0x0080  */
    /* JADX WARN: Code duplicated, block: B:23:0x008d  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ef  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i;
        int scrollRange;
        int i2;
        int overScrollMode;
        OverScroller overScroller = this.f5545d;
        if (overScroller.isFinished()) {
            return;
        }
        overScroller.computeScrollOffset();
        int currY = overScroller.getCurrY();
        int i3 = currY - this.f5535R;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f5546e;
        EdgeEffect edgeEffect2 = this.f5547f;
        if (i3 <= 0 || tbd.m21943a(edgeEffect) == 0.0f) {
            if (i3 < 0 && tbd.m21943a(edgeEffect2) != 0.0f) {
                float f = height;
                iRound = Math.round(tbd.m21945c(edgeEffect2, (i3 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (iRound != i3) {
                    edgeEffect2.finish();
                }
            }
            this.f5535R = currY;
            iArr = this.f5533P;
            iArr[1] = 0;
            m2007i(0, i3, 1, iArr, null);
            i = i3 - iArr[1];
            scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                wo2.m24088a(this, Math.abs(overScroller.getCurrVelocity()));
            }
            if (i != 0) {
                int scrollY = getScrollY();
                m2014q(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i - scrollY2;
                iArr[1] = 0;
                i2 = 1;
                this.f5538U.m21427g(0, scrollY2, 0, i4, this.f5532O, 1, iArr);
                i = i4 - iArr[1];
            } else {
                i2 = 1;
            }
            if (i != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == i2 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                }
                overScroller.abortAnimation();
                m2022y(i2);
            }
            if (overScroller.isFinished()) {
                m2022y(i2);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(tbd.m21945c(edgeEffect, ((-i3) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i3) {
            edgeEffect.finish();
        }
        i3 -= iRound;
        this.f5535R = currY;
        iArr = this.f5533P;
        iArr[1] = 0;
        m2007i(0, i3, 1, iArr, null);
        i = i3 - iArr[1];
        scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            wo2.m24088a(this, Math.abs(overScroller.getCurrVelocity()));
        }
        if (i != 0) {
            int scrollY3 = getScrollY();
            m2014q(i, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i5 = i - scrollY4;
            iArr[1] = 0;
            i2 = 1;
            this.f5538U.m21427g(0, scrollY4, 0, i5, this.f5532O, 1, iArr);
            i = i5 - iArr[1];
        } else {
            i2 = 1;
        }
        if (i != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i < 0) {
                    if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                } else if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                }
            } else if (i < 0) {
                if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                }
            } else if (edgeEffect2.isFinished()) {
                edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
            }
            overScroller.abortAnimation();
            m2022y(i2);
        }
        if (overScroller.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            m2022y(i2);
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
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: d */
    public final void mo661d(View view, int i, int i2, int i3, int i4, int i5) {
        m2012o(i4, i5, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m2008j(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f5538U.m21421a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f5538U.m21422b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f5538U.m21423c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f5538U.m21427g(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f5546e;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            } else {
                paddingLeft = 0;
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f5547f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: e */
    public final boolean mo662e(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: f */
    public final void mo663f(View view, View view2, int i, int i2) {
        this.f5537T.m19945d(i, i2);
        m2020w(2, i2);
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: g */
    public final void mo664g(View view, int i) {
        this.f5537T.m19946e(i);
        m2022y(i);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
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

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f5537T.m19943b();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
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

    public float getVerticalScrollFactorCompat() {
        if (this.f5539V == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                C3386nv.m17633t("Expected theme to define listPreferredItemHeight.");
                return 0.0f;
            }
            this.f5539V = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f5539V;
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: h */
    public final void mo665h(View view, int i, int i2, int[] iArr, int i3) {
        m2007i(i, i2, i3, iArr, null);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f5538U.m21430j(0);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2007i(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return this.f5538U.m21423c(i, i2, i3, iArr, null);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f5538U.f60935d;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    /* JADX INFO: renamed from: j */
    public final boolean m2008j(KeyEvent keyEvent) {
        View viewFindFocus;
        View viewFindNextFocus;
        this.f5544c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? m2010l(33) : m2005a(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? m2010l(130) : m2005a(130);
                    }
                    if (keyCode == 62) {
                        m2015r(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return m2010l(33);
                    }
                    if (keyCode == 93) {
                        return m2010l(130);
                    }
                    if (keyCode == 122) {
                        m2015r(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        m2015r(130);
                        return false;
                    }
                }
            } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus == null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
        } else if (isFocused()) {
            viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus == null) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final void m2009k(int i) {
        if (getChildCount() > 0) {
            this.f5545d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m2020w(2, 1);
            this.f5535R = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                wo2.m24088a(this, Math.abs(this.f5545d.getCurrVelocity()));
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m2010l(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f5544c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m2016s(i, rect.top, rect.bottom);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX INFO: renamed from: n */
    public final boolean m2011n(View view, int i, int i2) {
        Rect rect = this.f5544c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    /* JADX INFO: renamed from: o */
    public final void m2012o(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f5538U.m21427g(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5551j = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f5553l) {
            if (fqb.m11999a(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
                i = 9;
                width = (int) motionEvent.getX();
            } else if (fqb.m11999a(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i = 26;
                axisValue = axisValue2;
            } else {
                i = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                m2017t(-((int) (getVerticalScrollFactorCompat() * axisValue)), i, motionEvent, width, 1, fqb.m11999a(motionEvent, 8194));
                if (i == 0) {
                    return true;
                }
                this.f5542a0.m12580a(motionEvent, i);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0115  */
    /* JADX WARN: Code duplicated, block: B:70:0x0129  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.f5553l) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            int childCount = getChildCount();
            OverScroller overScroller = this.f5545d;
            if (childCount > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x < childAt.getLeft() || x >= childAt.getRight()) {
                    if (!m2021x(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.f5553l = z;
                    velocityTracker = this.f5525H;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f5525H = null;
                    }
                } else {
                    this.f5549h = y;
                    this.f5531N = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.f5525H;
                    if (velocityTracker3 == null) {
                        this.f5525H = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f5525H.addMovement(motionEvent);
                    overScroller.computeScrollOffset();
                    if (!m2021x(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.f5553l = z;
                    m2020w(2, 0);
                }
            } else {
                if (!m2021x(motionEvent)) {
                    z = false;
                }
                this.f5553l = z;
                velocityTracker = this.f5525H;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f5525H = null;
                }
            }
        } else if (i == 1) {
            this.f5553l = false;
            this.f5531N = -1;
            velocityTracker2 = this.f5525H;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f5525H = null;
            }
            if (this.f5545d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m2022y(0);
        } else if (i == 2) {
            int i2 = this.f5531N;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y2 - this.f5549h) > this.f5528K && (2 & getNestedScrollAxes()) == 0) {
                        this.f5553l = true;
                        this.f5549h = y2;
                        if (this.f5525H == null) {
                            this.f5525H = VelocityTracker.obtain();
                        }
                        this.f5525H.addMovement(motionEvent);
                        this.f5534Q = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i == 3) {
            this.f5553l = false;
            this.f5531N = -1;
            velocityTracker2 = this.f5525H;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f5525H = null;
            }
            if (this.f5545d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m2022y(0);
        } else if (i == 6) {
            m2013p(motionEvent);
        }
        return this.f5553l;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f5550i = false;
        View view = this.f5552k;
        if (view != null && m2004m(view, this)) {
            View view2 = this.f5552k;
            Rect rect = this.f5544c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM2006b = m2006b(rect);
            if (iM2006b != 0) {
                scrollBy(0, iM2006b);
            }
        }
        this.f5552k = null;
        if (!this.f5551j) {
            if (this.f5536S != null) {
                scrollTo(getScrollX(), this.f5536S.f5554a);
                this.f5536S = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i5 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f5551j = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f5526I && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m2009k((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f5538U.m21422b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        m2007i(i, i2, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m2012o(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo663f(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus != null && m2011n(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f5536S = savedState;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5554a = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        qj6 qj6Var = this.f5540W;
        if (qj6Var != null) {
            qj6Var.getClass();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m2011n(viewFindFocus, 0, i4)) {
            return;
        }
        Rect rect = this.f5544c;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iM2006b = m2006b(rect);
        if (iM2006b != 0) {
            if (this.f5527J) {
                m2019v(0, iM2006b, false);
            } else {
                scrollBy(0, iM2006b);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo662e(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo664g(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x011d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0125  */
    /* JADX WARN: Code duplicated, block: B:54:0x012d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0133  */
    /* JADX WARN: Code duplicated, block: B:59:0x013a  */
    /* JADX WARN: Code duplicated, block: B:60:0x013c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0141  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float fM21945c;
        int iRound;
        int i;
        int iAbs;
        int i2;
        ViewParent parent2;
        if (this.f5525H == null) {
            this.f5525H = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5534Q = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f5534Q);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f5546e;
            EdgeEffect edgeEffect2 = this.f5547f;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f5525H;
                velocityTracker.computeCurrentVelocity(DescriptorProtos.Edition.EDITION_2023_VALUE, this.f5530M);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f5531N);
                if (Math.abs(yVelocity) >= this.f5529L) {
                    if (tbd.m21943a(edgeEffect) != 0.0f) {
                        if (m2018u(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            m2009k(-yVelocity);
                        }
                    } else if (tbd.m21943a(edgeEffect2) != 0.0f) {
                        int i3 = -yVelocity;
                        if (m2018u(edgeEffect2, i3)) {
                            edgeEffect2.onAbsorb(i3);
                        } else {
                            m2009k(i3);
                        }
                    } else {
                        int i4 = -yVelocity;
                        float f2 = i4;
                        if (!this.f5538U.m21422b(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            m2009k(i4);
                        }
                    }
                } else if (this.f5545d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f5531N = -1;
                this.f5553l = false;
                VelocityTracker velocityTracker2 = this.f5525H;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f5525H = null;
                }
                m2022y(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f5531N);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f5531N + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i5 = this.f5549h - y;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i5 / getHeight();
                    if (tbd.m21943a(edgeEffect) != 0.0f) {
                        fM21945c = -tbd.m21945c(edgeEffect, -height, x);
                        if (tbd.m21943a(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else if (tbd.m21943a(edgeEffect2) != 0.0f) {
                        fM21945c = tbd.m21945c(edgeEffect2, height, 1.0f - x);
                        if (tbd.m21943a(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                    } else {
                        iRound = Math.round(f * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i = i5 - iRound;
                        if (!this.f5553l) {
                            iAbs = Math.abs(i);
                            i2 = this.f5528K;
                            if (iAbs > i2) {
                                parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                                this.f5553l = true;
                                if (i > 0) {
                                    i -= i2;
                                } else {
                                    i += i2;
                                }
                            }
                        }
                        if (this.f5553l) {
                            int iM2017t = m2017t(i, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.f5549h = y - iM2017t;
                            this.f5534Q += iM2017t;
                        }
                    }
                    f = fM21945c;
                    iRound = Math.round(f * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i = i5 - iRound;
                    if (!this.f5553l) {
                        iAbs = Math.abs(i);
                        i2 = this.f5528K;
                        if (iAbs > i2) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f5553l = true;
                            if (i > 0) {
                                i -= i2;
                            } else {
                                i += i2;
                            }
                        }
                    }
                    if (this.f5553l) {
                        int iM2017t2 = m2017t(i, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f5549h = y - iM2017t2;
                        this.f5534Q += iM2017t2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f5553l && getChildCount() > 0) {
                    if (this.f5545d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.f5531N = -1;
                this.f5553l = false;
                VelocityTracker velocityTracker3 = this.f5525H;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f5525H = null;
                }
                m2022y(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f5549h = (int) motionEvent.getY(actionIndex);
                this.f5531N = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m2013p(motionEvent);
                this.f5549h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f5531N));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f5553l && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            OverScroller overScroller = this.f5545d;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                m2022y(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f5549h = y2;
            this.f5531N = pointerId;
            m2020w(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f5525H;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m2013p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5531N) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f5549h = (int) motionEvent.getY(i);
            this.f5531N = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f5525H;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m2014q(int i, int i2, int i3, int i4) {
        int i5;
        boolean z;
        int i6;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i7 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            i5 = i2;
            z = false;
        } else {
            i5 = 0;
            z = true;
        }
        if (i7 <= i4) {
            if (i7 < 0) {
                i6 = 0;
            } else {
                i6 = i7;
                z2 = false;
            }
            if (z2 && !this.f5538U.m21430j(1)) {
                this.f5545d.springBack(i5, i6, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i5, i6);
            return !z || z2;
        }
        i6 = i4;
        z2 = true;
        if (z2) {
            this.f5545d.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i6);
        if (z) {
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m2015r(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f5544c;
        if (z) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        m2016s(i, i2, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f5550i) {
            this.f5552k = view2;
        } else {
            Rect rect = this.f5544c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM2006b = m2006b(rect);
            if (iM2006b != 0) {
                scrollBy(0, iM2006b);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM2006b = m2006b(rect);
        boolean z2 = iM2006b != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iM2006b);
                return z2;
            }
            m2019v(0, iM2006b, false);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.f5525H) != null) {
            velocityTracker.recycle();
            this.f5525H = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f5550i = true;
        super.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX INFO: renamed from: s */
    public final boolean m2016s(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4 && z5) {
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (z5) {
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i2 < scrollY || i3 > i4) {
            m2017t(z2 ? i2 - scrollY : i3 - i4, -1, null, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i);
        }
        return z;
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
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f5526I) {
            this.f5526I = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f5538U.m21432l(z);
    }

    public void setOnScrollChangeListener(qj6 qj6Var) {
        this.f5540W = qj6Var;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f5527J = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f5538U.m21434n(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m2022y(0);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0115  */
    /* JADX WARN: Code duplicated, block: B:59:0x0126  */
    /* JADX INFO: renamed from: t */
    public final int m2017t(int i, int i2, MotionEvent motionEvent, int i3, int i4, boolean z) {
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        VelocityTracker velocityTracker;
        if (i4 == 1) {
            m2020w(2, i4);
        }
        boolean zM21423c = this.f5538U.m21423c(0, i, i4, this.f5533P, this.f5532O);
        int[] iArr = this.f5532O;
        int[] iArr2 = this.f5533P;
        if (zM21423c) {
            i5 = i - iArr2[1];
            i6 = iArr[1];
        } else {
            i5 = i;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
        boolean z5 = m2014q(i5, 0, scrollY, scrollRange) && !this.f5538U.m21430j(i4);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f61066a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i2, scrollY2);
        }
        iArr2[1] = 0;
        this.f5538U.m21427g(0, scrollY2, 0, i5 - scrollY2, this.f5532O, i4, iArr2);
        int i7 = i6 + iArr[1];
        int i8 = i5 - iArr2[1];
        int i9 = scrollY + i8;
        EdgeEffect edgeEffect = this.f5547f;
        EdgeEffect edgeEffect2 = this.f5546e;
        if (i9 >= 0) {
            if (i9 > scrollRange && z4) {
                tbd.m21945c(edgeEffect, i8 / getHeight(), 1.0f - (i3 / getWidth()));
                if (motionEvent != null) {
                    z2 = false;
                    getScrollFeedbackProvider().f61066a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, false);
                } else {
                    z2 = false;
                }
                if (!edgeEffect2.isFinished()) {
                    edgeEffect2.onRelease();
                }
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z3 = z2;
            } else {
                z3 = z5;
            }
            if (z3 && i4 == 0 && (velocityTracker = this.f5525H) != null) {
                velocityTracker.clear();
            }
            if (i4 == 1) {
                m2022y(i4);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i7;
        }
        if (z4) {
            tbd.m21945c(edgeEffect2, (-i8) / getHeight(), i3 / getWidth());
            if (motionEvent != null) {
                getScrollFeedbackProvider().f61066a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, true);
            }
            if (!edgeEffect.isFinished()) {
                edgeEffect.onRelease();
            }
        }
        z2 = false;
        if (edgeEffect2.isFinished()) {
            postInvalidateOnAnimation();
            z3 = z2;
        } else {
            postInvalidateOnAnimation();
            z3 = z2;
        }
        if (z3) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
            m2022y(i4);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i7;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m2018u(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fM21943a = tbd.m21943a(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.f5541a * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = f5522b0;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fM21943a;
    }

    /* JADX INFO: renamed from: v */
    public final void m2019v(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f5543b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f5545d.startScroll(getScrollX(), scrollY, 0, iMax, 250);
            if (z) {
                m2020w(2, 1);
            } else {
                m2022y(1);
            }
            this.f5535R = getScrollY();
            postInvalidateOnAnimation();
        } else {
            OverScroller overScroller = this.f5545d;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                m2022y(1);
            }
            scrollBy(i, i2);
        }
        this.f5543b = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX INFO: renamed from: w */
    public final void m2020w(int i, int i2) {
        this.f5538U.m21434n(2, i2);
    }

    /* JADX INFO: renamed from: x */
    public final boolean m2021x(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.f5546e;
        if (tbd.m21943a(edgeEffect) != 0.0f) {
            tbd.m21945c(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f5547f;
        if (tbd.m21943a(edgeEffect2) == 0.0f) {
            return z;
        }
        tbd.m21945c(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* JADX INFO: renamed from: y */
    public final void m2022y(int i) {
        this.f5538U.m21436p(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
        } else {
            C3386nv.m17633t("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            C3386nv.m17633t("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
        } else {
            C3386nv.m17633t("ScrollView can host only one direct child");
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }
}
