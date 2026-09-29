package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
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
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import dm.C5212l;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p024b3.C1298e;
import p471x2.C10026a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p471x2.C10052n;
import p471x2.C10058q;
import p471x2.InterfaceC10050m;
import p471x2.InterfaceC10056p;
import p497y2.C10284f;
import p497y2.C10286h;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC10056p, InterfaceC10050m {

    /* JADX INFO: renamed from: W */
    public static final float f5603W = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: a0 */
    public static final C0784a f5604a0 = new C0784a();

    /* JADX INFO: renamed from: b0 */
    public static final int[] f5605b0 = {R.attr.fillViewport};

    /* JADX INFO: renamed from: H */
    public boolean f5606H;

    /* JADX INFO: renamed from: I */
    public boolean f5607I;

    /* JADX INFO: renamed from: J */
    public int f5608J;

    /* JADX INFO: renamed from: K */
    public int f5609K;

    /* JADX INFO: renamed from: L */
    public int f5610L;

    /* JADX INFO: renamed from: M */
    public int f5611M;

    /* JADX INFO: renamed from: N */
    public final int[] f5612N;

    /* JADX INFO: renamed from: O */
    public final int[] f5613O;

    /* JADX INFO: renamed from: P */
    public int f5614P;

    /* JADX INFO: renamed from: Q */
    public int f5615Q;

    /* JADX INFO: renamed from: R */
    public SavedState f5616R;

    /* JADX INFO: renamed from: S */
    public final C10058q f5617S;

    /* JADX INFO: renamed from: T */
    public final C10052n f5618T;

    /* JADX INFO: renamed from: U */
    public float f5619U;

    /* JADX INFO: renamed from: V */
    public InterfaceC0786c f5620V;

    /* JADX INFO: renamed from: a */
    public final float f5621a;

    /* JADX INFO: renamed from: b */
    public long f5622b;

    /* JADX INFO: renamed from: c */
    public final Rect f5623c;

    /* JADX INFO: renamed from: d */
    public OverScroller f5624d;

    /* JADX INFO: renamed from: e */
    public final EdgeEffect f5625e;

    /* JADX INFO: renamed from: f */
    public final EdgeEffect f5626f;

    /* JADX INFO: renamed from: g */
    public int f5627g;

    /* JADX INFO: renamed from: h */
    public boolean f5628h;

    /* JADX INFO: renamed from: i */
    public boolean f5629i;

    /* JADX INFO: renamed from: j */
    public View f5630j;

    /* JADX INFO: renamed from: k */
    public boolean f5631k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f5632l;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0783a();

        /* JADX INFO: renamed from: a */
        public int f5633a;

        /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$SavedState$a */
        public class C0783a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f5633a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HorizontalScrollView.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" scrollPosition=");
            return C0166e.m768o(sb2, this.f5633a, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f5633a);
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$a */
    public static class C0784a extends C10026a {
        @Override // p471x2.C10026a
        /* JADX INFO: renamed from: c */
        public final void mo2998c(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2998c(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C10286h.m19278c(accessibilityEvent, nestedScrollView.getScrollX());
            C10286h.m19279d(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // p471x2.C10026a
        /* JADX INFO: renamed from: d */
        public final void mo2999d(View view, C10284f c10284f) {
            int scrollRange;
            this.f50989a.onInitializeAccessibilityNodeInfo(view, c10284f.f51739a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c10284f.m19264i(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c10284f.m19268m(true);
            if (nestedScrollView.getScrollY() > 0) {
                c10284f.m19257b(C10284f.a.f51746i);
                c10284f.m19257b(C10284f.a.f51750m);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c10284f.m19257b(C10284f.a.f51745h);
                c10284f.m19257b(C10284f.a.f51752o);
            }
        }

        @Override // p471x2.C10026a
        /* JADX INFO: renamed from: g */
        public final boolean mo3000g(View view, int i10, Bundle bundle) {
            if (super.mo3000g(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m2995t(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                    return true;
                }
                if (i10 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.m2995t(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$b */
    public static class C0785b {
        /* JADX INFO: renamed from: a */
        public static boolean m3001a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$c */
    public interface InterfaceC0786c {
        /* JADX INFO: renamed from: d */
        void mo3002d(NestedScrollView nestedScrollView, int i10);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.linguist.R.attr.nestedScrollViewStyle);
        this.f5623c = new Rect();
        this.f5628h = true;
        this.f5629i = false;
        this.f5630j = null;
        this.f5631k = false;
        this.f5607I = true;
        this.f5611M = -1;
        this.f5612N = new int[2];
        this.f5613O = new int[2];
        int i10 = Build.VERSION.SDK_INT;
        this.f5625e = i10 >= 31 ? C1298e.b.m4812a(context, attributeSet) : new EdgeEffect(context);
        this.f5626f = i10 >= 31 ? C1298e.b.m4812a(context, attributeSet) : new EdgeEffect(context);
        this.f5621a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f5624d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f5608J = viewConfiguration.getScaledTouchSlop();
        this.f5609K = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5610L = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5605b0, com.linguist.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f5617S = new C10058q();
        this.f5618T = new C10052n(this);
        setNestedScrollingEnabled(true);
        C10029b0.m18658n(this, f5604a0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private float getVerticalScrollFactorCompat() {
        if (this.f5619U == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f5619U = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f5619U;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2982h(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m2982h((View) parent, view2);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2983a(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m2989i(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m2985c(maxScrollAmount);
        } else {
            Rect rect = this.f5623c;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m2985c(m2984b(rect));
            viewFindNextFocus.requestFocus(i10);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && (!m2989i(viewFindFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i10, layoutParams);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public final int m2984b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i11) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    /* JADX INFO: renamed from: c */
    public final void m2985c(int i10) {
        if (i10 != 0) {
            if (this.f5607I) {
                m2995t(0, i10, false);
            } else {
                scrollBy(0, i10);
            }
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

    /* JADX WARN: Code duplicated, block: B:21:0x0083  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00be  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ef  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        boolean z10;
        int i10;
        int scrollRange;
        int overScrollMode;
        if (this.f5624d.isFinished()) {
            return;
        }
        this.f5624d.computeScrollOffset();
        int currY = this.f5624d.getCurrY();
        int i11 = currY - this.f5615Q;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f5626f;
        EdgeEffect edgeEffect2 = this.f5625e;
        if (i11 <= 0 || C1298e.m4809a(edgeEffect2) == 0.0f) {
            if (i11 < 0 && C1298e.m4809a(edgeEffect) != 0.0f) {
                float f3 = height;
                iRound = Math.round(C1298e.m4810b(edgeEffect, (i11 * 4.0f) / f3, 0.5f) * (f3 / 4.0f));
                if (iRound != i11) {
                    edgeEffect.finish();
                }
            }
            this.f5615Q = currY;
            iArr = this.f5613O;
            z10 = false;
            iArr[1] = 0;
            this.f5618T.m18843c(0, i11, 1, iArr, null);
            i10 = i11 - iArr[1];
            scrollRange = getScrollRange();
            if (i10 != 0) {
                int scrollY = getScrollY();
                m2992q(i10, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i12 = i10 - scrollY2;
                iArr[1] = 0;
                this.f5618T.m18845e(0, scrollY2, 0, i12, this.f5612N, 1, iArr);
                i10 = i12 - iArr[1];
            }
            if (i10 != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z10 = true;
                }
                if (z10) {
                    if (i10 < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f5624d.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f5624d.getCurrVelocity());
                    }
                }
                this.f5624d.abortAnimation();
                m2997v(1);
            }
            if (!this.f5624d.isFinished()) {
                m2997v(1);
            } else {
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                C10029b0.d.m18674k(this);
            }
        }
        iRound = Math.round(C1298e.m4810b(edgeEffect2, ((-i11) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i11) {
            edgeEffect2.finish();
        }
        i11 -= iRound;
        this.f5615Q = currY;
        iArr = this.f5613O;
        z10 = false;
        iArr[1] = 0;
        this.f5618T.m18843c(0, i11, 1, iArr, null);
        i10 = i11 - iArr[1];
        scrollRange = getScrollRange();
        if (i10 != 0) {
            int scrollY3 = getScrollY();
            m2992q(i10, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i13 = i10 - scrollY4;
            iArr[1] = 0;
            this.f5618T.m18845e(0, scrollY4, 0, i13, this.f5612N, 1, iArr);
            i10 = i13 - iArr[1];
        }
        if (i10 != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (z10) {
                if (i10 < 0) {
                    if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f5624d.getCurrVelocity());
                    }
                } else if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.f5624d.getCurrVelocity());
                }
            }
            this.f5624d.abortAnimation();
            m2997v(1);
        }
        if (!this.f5624d.isFinished()) {
            m2997v(1);
        } else {
            WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
            C10029b0.d.m18674k(this);
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
        if (scrollY > iMax) {
            bottom += scrollY - iMax;
        }
        return bottom;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x003e  */
    /* JADX INFO: renamed from: d */
    public final boolean m2986d(KeyEvent keyEvent) {
        boolean z10;
        Rect rect = this.f5623c;
        rect.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (!z10) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? m2983a(33) : m2988g(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? m2983a(130) : m2988g(130);
        }
        if (keyCode != 62) {
            return false;
        }
        int i10 = keyEvent.isShiftPressed() ? 33 : 130;
        boolean z11 = i10 == 130;
        int height = getHeight();
        if (z11) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt2 = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt2.getBottom() + ((FrameLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin;
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
        int i11 = rect.top;
        int i12 = height + i11;
        rect.bottom = i12;
        m2993r(i10, i11, i12);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !m2986d(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f3, float f10, boolean z10) {
        return this.f5618T.m18841a(f3, f10, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f3, float f10) {
        return this.f5618T.m18842b(f3, f10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f5618T.m18843c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f5618T.m18845e(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f5625e;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (C0785b.m3001a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft() + 0;
            } else {
                paddingLeft = 0;
            }
            if (C0785b.m3001a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                C10029b0.d.m18674k(this);
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f5626f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (C0785b.m3001a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = 0 + getPaddingLeft();
        }
        if (C0785b.m3001a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
            C10029b0.d.m18674k(this);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // p471x2.InterfaceC10056p
    /* JADX INFO: renamed from: e */
    public final void mo964e(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        m2990j(i13, i14, iArr);
    }

    /* JADX INFO: renamed from: f */
    public final void m2987f(int i10) {
        if (getChildCount() > 0) {
            this.f5624d.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f5618T.m18847g(2, 1);
            this.f5615Q = getScrollY();
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.d.m18674k(this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2988g(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f5623c;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            rect.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.top = rect.bottom - height;
        }
        return m2993r(i10, rect.top, rect.bottom);
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
        C10058q c10058q = this.f5617S;
        return c10058q.f51048b | c10058q.f51047a;
    }

    public int getScrollRange() {
        int iMax = 0;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            iMax = Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return iMax;
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

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        boolean z10 = false;
        if (this.f5618T.m18846f(0) != null) {
            z10 = true;
        }
        return z10;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2989i(View view, int i10, int i11) {
        Rect rect = this.f5623c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i10 >= getScrollY() && rect.top - i10 <= getScrollY() + i11;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f5618T.f51045d;
    }

    /* JADX INFO: renamed from: j */
    public final void m2990j(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f5618T.m18844d(scrollY2, i10 - scrollY2, i11, iArr);
    }

    @Override // p471x2.InterfaceC10054o
    /* JADX INFO: renamed from: k */
    public final void mo970k(View view, int i10, int i11, int i12, int i13, int i14) {
        m2990j(i13, i14, null);
    }

    @Override // p471x2.InterfaceC10054o
    /* JADX INFO: renamed from: l */
    public final boolean mo971l(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // p471x2.InterfaceC10054o
    /* JADX INFO: renamed from: m */
    public final void mo972m(View view, View view2, int i10, int i11) {
        C10058q c10058q = this.f5617S;
        if (i11 == 1) {
            c10058q.f51048b = i10;
        } else {
            c10058q.f51047a = i10;
        }
        this.f5618T.m18847g(2, i11);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // p471x2.InterfaceC10054o
    /* JADX INFO: renamed from: n */
    public final void mo973n(View view, int i10) {
        C10058q c10058q = this.f5617S;
        if (i10 == 1) {
            c10058q.f51048b = 0;
        } else {
            c10058q.f51047a = 0;
        }
        m2997v(i10);
    }

    @Override // p471x2.InterfaceC10054o
    /* JADX INFO: renamed from: o */
    public final void mo974o(View view, int i10, int i11, int[] iArr, int i12) {
        this.f5618T.m18843c(i10, i11, i12, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5629i = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        boolean z10;
        int i10 = 0;
        if (motionEvent.getAction() == 8 && !this.f5631k) {
            if (C5212l.m11152Y(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
            } else {
                axisValue = C5212l.m11152Y(motionEvent, 4194304) ? motionEvent.getAxisValue(26) : 0.0f;
            }
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i11 = scrollY - verticalScrollFactorCompat;
                if (i11 < 0) {
                    int overScrollMode = getOverScrollMode();
                    if ((overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !C5212l.m11152Y(motionEvent, 8194)) {
                        float height = (-i11) / getHeight();
                        EdgeEffect edgeEffect = this.f5625e;
                        C1298e.m4810b(edgeEffect, height, 0.5f);
                        edgeEffect.onRelease();
                        invalidate();
                        z10 = 1;
                    } else {
                        z10 = 0;
                    }
                } else if (i11 > scrollRange) {
                    int overScrollMode2 = getOverScrollMode();
                    if ((overScrollMode2 == 0 || (overScrollMode2 == 1 && getScrollRange() > 0)) && !C5212l.m11152Y(motionEvent, 8194)) {
                        float height2 = (i11 - scrollRange) / getHeight();
                        EdgeEffect edgeEffect2 = this.f5626f;
                        C1298e.m4810b(edgeEffect2, height2, 0.5f);
                        edgeEffect2.onRelease();
                        invalidate();
                        i10 = 1;
                    }
                    z10 = i10;
                    i10 = scrollRange;
                } else {
                    z10 = 0;
                    i10 = i11;
                }
                if (i10 == scrollY) {
                    return z10;
                }
                super.scrollTo(getScrollX(), i10);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:52:0x011c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0187  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        VelocityTracker velocityTracker;
        int action = motionEvent.getAction();
        boolean z11 = true;
        if (action == 2 && this.f5631k) {
            return true;
        }
        int i10 = action & 255;
        if (i10 == 0) {
            int y10 = (int) motionEvent.getY();
            int x10 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y10 < childAt.getTop() - scrollY || y10 >= childAt.getBottom() - scrollY || x10 < childAt.getLeft() || x10 >= childAt.getRight()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            if (z10) {
                this.f5627g = y10;
                this.f5611M = motionEvent.getPointerId(0);
                VelocityTracker velocityTracker2 = this.f5632l;
                if (velocityTracker2 == null) {
                    this.f5632l = VelocityTracker.obtain();
                } else {
                    velocityTracker2.clear();
                }
                this.f5632l.addMovement(motionEvent);
                this.f5624d.computeScrollOffset();
                if (!m2996u(motionEvent) && this.f5624d.isFinished()) {
                    z11 = false;
                }
                this.f5631k = z11;
                this.f5618T.m18847g(2, 0);
            } else {
                if (!m2996u(motionEvent) && this.f5624d.isFinished()) {
                    z11 = false;
                }
                this.f5631k = z11;
                VelocityTracker velocityTracker3 = this.f5632l;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f5632l = null;
                }
            }
        } else if (i10 == 1) {
            this.f5631k = false;
            this.f5611M = -1;
            velocityTracker = this.f5632l;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f5632l = null;
            }
            if (this.f5624d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                C10029b0.d.m18674k(this);
            }
            m2997v(0);
        } else if (i10 == 2) {
            int i11 = this.f5611M;
            if (i11 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i11);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                } else {
                    int y11 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y11 - this.f5627g) > this.f5608J && (2 & getNestedScrollAxes()) == 0) {
                        this.f5631k = true;
                        this.f5627g = y11;
                        if (this.f5632l == null) {
                            this.f5632l = VelocityTracker.obtain();
                        }
                        this.f5632l.addMovement(motionEvent);
                        this.f5614P = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i10 == 3) {
            this.f5631k = false;
            this.f5611M = -1;
            velocityTracker = this.f5632l;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f5632l = null;
            }
            if (this.f5624d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
                C10029b0.d.m18674k(this);
            }
            m2997v(0);
        } else if (i10 == 6) {
            m2991p(motionEvent);
        }
        return this.f5631k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.f5628h = false;
        View view = this.f5630j;
        if (view != null && m2982h(view, this)) {
            View view2 = this.f5630j;
            Rect rect = this.f5623c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM2984b = m2984b(rect);
            if (iM2984b != 0) {
                scrollBy(0, iM2984b);
            }
        }
        this.f5630j = null;
        if (!this.f5629i) {
            if (this.f5616R != null) {
                scrollTo(getScrollX(), this.f5616R.f5633a);
                this.f5616R = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i14 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i14 != scrollY) {
                scrollTo(getScrollX(), i14);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f5629i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f5606H && View.MeasureSpec.getMode(i11) != 0) {
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
                if (measuredHeight < measuredHeight2) {
                    childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f10, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f10, true);
        m2987f((int) f10);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f10) {
        return dispatchNestedPreFling(f3, f10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        mo974o(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        m2990j(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        mo972m(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i10) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        if (viewFindNextFocus != null && !(true ^ m2989i(viewFindNextFocus, 0, getHeight()))) {
            return viewFindNextFocus.requestFocus(i10, rect);
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
        this.f5616R = savedState;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5633a = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        InterfaceC0786c interfaceC0786c = this.f5620V;
        if (interfaceC0786c != null) {
            interfaceC0786c.mo3002d(this, i11);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            if (this == viewFindFocus) {
                return;
            }
            if (m2989i(viewFindFocus, 0, i13)) {
                Rect rect = this.f5623c;
                viewFindFocus.getDrawingRect(rect);
                offsetDescendantRectToMyCoords(viewFindFocus, rect);
                m2985c(m2984b(rect));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return mo971l(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo973n(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x023b  */
    /* JADX WARN: Code duplicated, block: B:118:0x028d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0295  */
    /* JADX WARN: Code duplicated, block: B:49:0x012b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0141  */
    /* JADX WARN: Code duplicated, block: B:59:0x0148  */
    /* JADX WARN: Code duplicated, block: B:60:0x014c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0153  */
    /* JADX WARN: Code duplicated, block: B:65:0x0171  */
    /* JADX WARN: Code duplicated, block: B:72:0x0195  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:84:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:88:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:89:0x0202 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0204  */
    /* JADX WARN: Code duplicated, block: B:92:0x0222  */
    /* JADX WARN: Code duplicated, block: B:98:0x0238  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        boolean z10;
        int i10;
        float f3;
        float fM4810b;
        int iRound;
        int i11;
        boolean zM18843c;
        int[] iArr;
        int[] iArr2;
        int scrollY;
        int scrollRange;
        int overScrollMode;
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        int i13;
        boolean z14;
        ViewParent parent2;
        if (this.f5632l == null) {
            this.f5632l = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5614P = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f10 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f5614P);
        C10052n c10052n = this.f5618T;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f5625e;
            EdgeEffect edgeEffect2 = this.f5626f;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f5632l;
                velocityTracker.computeCurrentVelocity(1000, this.f5610L);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f5611M);
                if (Math.abs(yVelocity) >= this.f5609K) {
                    if (C1298e.m4809a(edgeEffect) == 0.0f) {
                        if (C1298e.m4809a(edgeEffect2) != 0.0f) {
                            int i14 = -yVelocity;
                            if (m2994s(edgeEffect2, i14)) {
                                edgeEffect2.onAbsorb(i14);
                            } else {
                                m2987f(i14);
                            }
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            i10 = -yVelocity;
                            f3 = i10;
                            if (!dispatchNestedPreFling(0.0f, f3)) {
                                dispatchNestedFling(0.0f, f3, true);
                                m2987f(i10);
                            }
                        }
                    } else if (m2994s(edgeEffect, yVelocity)) {
                        edgeEffect.onAbsorb(yVelocity);
                    } else {
                        m2987f(-yVelocity);
                    }
                    z10 = true;
                    if (!z10) {
                        i10 = -yVelocity;
                        f3 = i10;
                        if (!dispatchNestedPreFling(0.0f, f3)) {
                            dispatchNestedFling(0.0f, f3, true);
                            m2987f(i10);
                        }
                    }
                } else if (this.f5624d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                    C10029b0.d.m18674k(this);
                }
                this.f5611M = -1;
                this.f5631k = false;
                VelocityTracker velocityTracker2 = this.f5632l;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f5632l = null;
                }
                m2997v(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f5611M);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f5611M + " in onTouchEvent");
                } else {
                    int y10 = (int) motionEvent.getY(iFindPointerIndex);
                    int i15 = this.f5627g - y10;
                    float x10 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i15 / getHeight();
                    if (C1298e.m4809a(edgeEffect) != 0.0f) {
                        fM4810b = -C1298e.m4810b(edgeEffect, -height, x10);
                        if (C1298e.m4809a(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else if (C1298e.m4809a(edgeEffect2) != 0.0f) {
                        fM4810b = C1298e.m4810b(edgeEffect2, height, 1.0f - x10);
                        if (C1298e.m4809a(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                    } else {
                        iRound = Math.round(f10 * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i11 = i15 - iRound;
                        if (!this.f5631k && Math.abs(i11) > this.f5608J) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f5631k = true;
                            if (i11 > 0) {
                                i11 -= this.f5608J;
                            } else {
                                i11 += this.f5608J;
                            }
                        }
                        if (this.f5631k) {
                            zM18843c = this.f5618T.m18843c(0, i11, 0, this.f5613O, this.f5612N);
                            iArr = this.f5613O;
                            iArr2 = this.f5612N;
                            if (zM18843c) {
                                i11 -= iArr[1];
                                this.f5614P += iArr2[1];
                            }
                            this.f5627g = y10 - iArr2[1];
                            scrollY = getScrollY();
                            scrollRange = getScrollRange();
                            overScrollMode = getOverScrollMode();
                            if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (m2992q(i11, 0, getScrollY(), scrollRange)) {
                                if (c10052n.m18846f(0) != null) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (z14) {
                                    z12 = false;
                                } else {
                                    z12 = true;
                                }
                            } else {
                                z12 = false;
                            }
                            int scrollY2 = getScrollY() - scrollY;
                            iArr[1] = 0;
                            this.f5618T.m18845e(0, scrollY2, 0, i11 - scrollY2, this.f5612N, 0, iArr);
                            int i16 = this.f5627g;
                            int i17 = iArr2[1];
                            this.f5627g = i16 - i17;
                            this.f5614P += i17;
                            if (z11) {
                                i12 = i11 - iArr[1];
                                i13 = scrollY + i12;
                                if (i13 < 0) {
                                    C1298e.m4810b(edgeEffect, (-i12) / getHeight(), motionEvent.getX(iFindPointerIndex) / getWidth());
                                    if (!edgeEffect2.isFinished()) {
                                        edgeEffect2.onRelease();
                                    }
                                } else if (i13 > scrollRange) {
                                    C1298e.m4810b(edgeEffect2, i12 / getHeight(), 1.0f - (motionEvent.getX(iFindPointerIndex) / getWidth()));
                                    if (!edgeEffect.isFinished()) {
                                        edgeEffect.onRelease();
                                    }
                                }
                                if (edgeEffect.isFinished() || !edgeEffect2.isFinished()) {
                                    WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
                                    C10029b0.d.m18674k(this);
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                            } else {
                                z13 = z12;
                            }
                            if (z13) {
                                this.f5632l.clear();
                            }
                        }
                    }
                    f10 = fM4810b;
                    iRound = Math.round(f10 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i11 = i15 - iRound;
                    if (!this.f5631k) {
                        parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f5631k = true;
                        if (i11 > 0) {
                            i11 -= this.f5608J;
                        } else {
                            i11 += this.f5608J;
                        }
                    }
                    if (this.f5631k) {
                        zM18843c = this.f5618T.m18843c(0, i11, 0, this.f5613O, this.f5612N);
                        iArr = this.f5613O;
                        iArr2 = this.f5612N;
                        if (zM18843c) {
                            i11 -= iArr[1];
                            this.f5614P += iArr2[1];
                        }
                        this.f5627g = y10 - iArr2[1];
                        scrollY = getScrollY();
                        scrollRange = getScrollRange();
                        overScrollMode = getOverScrollMode();
                        if (overScrollMode != 0) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (m2992q(i11, 0, getScrollY(), scrollRange)) {
                            z12 = false;
                        } else {
                            if (c10052n.m18846f(0) != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z14) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        }
                        int scrollY3 = getScrollY() - scrollY;
                        iArr[1] = 0;
                        this.f5618T.m18845e(0, scrollY3, 0, i11 - scrollY3, this.f5612N, 0, iArr);
                        int i18 = this.f5627g;
                        int i19 = iArr2[1];
                        this.f5627g = i18 - i19;
                        this.f5614P += i19;
                        if (z11) {
                            z13 = z12;
                        } else {
                            i12 = i11 - iArr[1];
                            i13 = scrollY + i12;
                            if (i13 < 0) {
                                C1298e.m4810b(edgeEffect, (-i12) / getHeight(), motionEvent.getX(iFindPointerIndex) / getWidth());
                                if (!edgeEffect2.isFinished()) {
                                    edgeEffect2.onRelease();
                                }
                            } else if (i13 > scrollRange) {
                                C1298e.m4810b(edgeEffect2, i12 / getHeight(), 1.0f - (motionEvent.getX(iFindPointerIndex) / getWidth()));
                                if (!edgeEffect.isFinished()) {
                                    edgeEffect.onRelease();
                                }
                            }
                            if (edgeEffect.isFinished()) {
                            }
                            WeakHashMap<View, C10049l0> weakHashMap3 = C10029b0.f50993a;
                            C10029b0.d.m18674k(this);
                            z13 = false;
                        }
                        if (z13) {
                            this.f5632l.clear();
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f5631k && getChildCount() > 0 && this.f5624d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    WeakHashMap<View, C10049l0> weakHashMap4 = C10029b0.f50993a;
                    C10029b0.d.m18674k(this);
                }
                this.f5611M = -1;
                this.f5631k = false;
                VelocityTracker velocityTracker3 = this.f5632l;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f5632l = null;
                }
                m2997v(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f5627g = (int) motionEvent.getY(actionIndex);
                this.f5611M = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m2991p(motionEvent);
                this.f5627g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f5611M));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f5631k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f5624d.isFinished()) {
                this.f5624d.abortAnimation();
                m2997v(1);
            }
            this.f5627g = (int) motionEvent.getY();
            this.f5611M = motionEvent.getPointerId(0);
            c10052n.m18847g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f5632l;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m2991p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5611M) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f5627g = (int) motionEvent.getY(i10);
            this.f5611M = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f5632l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c A[PHI: r1
      0x005c: PHI (r1v1 boolean) = (r1v0 boolean), (r1v3 boolean) binds: [B:22:0x0056, B:25:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: q */
    public final boolean m2992q(int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        boolean z12;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        boolean z13 = true;
        int i14 = i11 + 0;
        int i15 = i12 + i10;
        int i16 = i13 + 0;
        if (i14 <= 0 && i14 >= 0) {
            z10 = false;
        } else {
            i14 = 0;
            z10 = true;
        }
        if (i15 <= i16) {
            if (i15 < 0) {
                i15 = 0;
            } else {
                z11 = false;
            }
            if (z11) {
                if (this.f5618T.m18846f(1) != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    this.f5624d.springBack(i14, i15, 0, 0, 0, getScrollRange());
                }
            }
            onOverScrolled(i14, i15, z10, z11);
            if (z10) {
                if (!z11) {
                    z13 = false;
                }
            }
            return z13;
        }
        i15 = i16;
        z11 = true;
        if (z11) {
            if (this.f5618T.m18846f(1) != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                this.f5624d.springBack(i14, i15, 0, 0, 0, getScrollRange());
            }
        }
        onOverScrolled(i14, i15, z10, z11);
        if (z10) {
            if (!z11) {
                z13 = false;
            }
        }
        return z13;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006f  */
    /* JADX INFO: renamed from: r */
    public final boolean m2993r(int i10, int i11, int i12) {
        boolean z10;
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z11 = i10 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z12 = false;
        for (int i14 = 0; i14 < size; i14++) {
            View view2 = focusables.get(i14);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                boolean z13 = i11 < top && bottom < i12;
                if (view == null) {
                    view = view2;
                    z12 = z13;
                } else {
                    boolean z14 = (z11 && top < view.getTop()) || (!z11 && bottom > view.getBottom());
                    if (z12) {
                        if (z13 && z14) {
                            view = view2;
                        }
                    } else if (z13) {
                        view = view2;
                        z12 = true;
                    } else if (z14) {
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i11 < scrollY || i12 > i13) {
            m2985c(z11 ? i11 - scrollY : i12 - i13);
            z10 = true;
        } else {
            z10 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i10);
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f5628h) {
            Rect rect = this.f5623c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM2984b = m2984b(rect);
            if (iM2984b != 0) {
                scrollBy(0, iM2984b);
            }
            super.requestChildFocus(view, view2);
        }
        this.f5630j = view2;
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM2984b = m2984b(rect);
        boolean z11 = iM2984b != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, iM2984b);
            } else {
                m2995t(0, iM2984b, false);
            }
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        VelocityTracker velocityTracker;
        if (z10 && (velocityTracker = this.f5632l) != null) {
            velocityTracker.recycle();
            this.f5632l = null;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f5628h = true;
        super.requestLayout();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m2994s(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        float fM4809a = C1298e.m4809a(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i10) * 0.35f;
        float f3 = this.f5621a * 0.015f;
        double dLog = Math.log(fAbs / f3);
        double d10 = f5603W;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * dLog) * ((double) f3))) < fM4809a;
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i10 < 0) {
                i10 = 0;
            } else if (width + i10 > width2) {
                i10 = width2 - width;
            }
            if (height >= height2 || i11 < 0) {
                i11 = 0;
            } else if (height + i11 > height2) {
                i11 = height2 - height;
            }
            if (i10 == getScrollX() && i11 == getScrollY()) {
                return;
            }
            super.scrollTo(i10, i11);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f5606H) {
            this.f5606H = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        C10052n c10052n = this.f5618T;
        if (c10052n.f51045d) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.i.m18732z(c10052n.f51044c);
        }
        c10052n.f51045d = z10;
    }

    public void setOnScrollChangeListener(InterfaceC0786c interfaceC0786c) {
        this.f5620V = interfaceC0786c;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f5607I = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return this.f5618T.m18847g(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m2997v(0);
    }

    /* JADX INFO: renamed from: t */
    public final void m2995t(int i10, int i11, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f5622b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f5624d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z10) {
                this.f5618T.m18847g(2, 1);
            } else {
                m2997v(1);
            }
            this.f5615Q = getScrollY();
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.d.m18674k(this);
        } else {
            if (!this.f5624d.isFinished()) {
                this.f5624d.abortAnimation();
                m2997v(1);
            }
            scrollBy(i10, i11);
        }
        this.f5622b = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m2996u(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f5625e;
        if (C1298e.m4809a(edgeEffect) != 0.0f) {
            C1298e.m4810b(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f5626f;
        if (C1298e.m4809a(edgeEffect2) == 0.0f) {
            return z10;
        }
        C1298e.m4810b(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* JADX INFO: renamed from: v */
    public final void m2997v(int i10) {
        this.f5618T.m18848h(i10);
    }
}
