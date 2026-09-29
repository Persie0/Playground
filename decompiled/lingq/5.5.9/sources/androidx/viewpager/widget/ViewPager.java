package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.WeakHashMap;
import p254m2.C7472a;
import p471x2.C10026a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p497y2.C10284f;
import p499y4.AbstractC10290a;
import p499y4.C10291b;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* JADX INFO: renamed from: t0 */
    public static final int[] f7634t0 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: u0 */
    public static final C1201a f7635u0 = new C1201a();

    /* JADX INFO: renamed from: v0 */
    public static final InterpolatorC1202b f7636v0 = new InterpolatorC1202b();

    /* JADX INFO: renamed from: H */
    public Drawable f7637H;

    /* JADX INFO: renamed from: I */
    public int f7638I;

    /* JADX INFO: renamed from: J */
    public int f7639J;

    /* JADX INFO: renamed from: K */
    public float f7640K;

    /* JADX INFO: renamed from: L */
    public float f7641L;

    /* JADX INFO: renamed from: M */
    public int f7642M;

    /* JADX INFO: renamed from: N */
    public boolean f7643N;

    /* JADX INFO: renamed from: O */
    public boolean f7644O;

    /* JADX INFO: renamed from: P */
    public boolean f7645P;

    /* JADX INFO: renamed from: Q */
    public int f7646Q;

    /* JADX INFO: renamed from: R */
    public boolean f7647R;

    /* JADX INFO: renamed from: S */
    public boolean f7648S;

    /* JADX INFO: renamed from: T */
    public int f7649T;

    /* JADX INFO: renamed from: U */
    public int f7650U;

    /* JADX INFO: renamed from: V */
    public int f7651V;

    /* JADX INFO: renamed from: W */
    public float f7652W;

    /* JADX INFO: renamed from: a */
    public int f7653a;

    /* JADX INFO: renamed from: a0 */
    public float f7654a0;

    /* JADX INFO: renamed from: b */
    public final ArrayList<C1205e> f7655b;

    /* JADX INFO: renamed from: b0 */
    public float f7656b0;

    /* JADX INFO: renamed from: c */
    public final C1205e f7657c;

    /* JADX INFO: renamed from: c0 */
    public float f7658c0;

    /* JADX INFO: renamed from: d */
    public final Rect f7659d;

    /* JADX INFO: renamed from: d0 */
    public int f7660d0;

    /* JADX INFO: renamed from: e */
    public AbstractC10290a f7661e;

    /* JADX INFO: renamed from: e0 */
    public VelocityTracker f7662e0;

    /* JADX INFO: renamed from: f */
    public int f7663f;

    /* JADX INFO: renamed from: f0 */
    public int f7664f0;

    /* JADX INFO: renamed from: g */
    public int f7665g;

    /* JADX INFO: renamed from: g0 */
    public int f7666g0;

    /* JADX INFO: renamed from: h */
    public Parcelable f7667h;

    /* JADX INFO: renamed from: h0 */
    public int f7668h0;

    /* JADX INFO: renamed from: i */
    public Scroller f7669i;

    /* JADX INFO: renamed from: i0 */
    public int f7670i0;

    /* JADX INFO: renamed from: j */
    public boolean f7671j;

    /* JADX INFO: renamed from: j0 */
    public EdgeEffect f7672j0;

    /* JADX INFO: renamed from: k */
    public C1210j f7673k;

    /* JADX INFO: renamed from: k0 */
    public EdgeEffect f7674k0;

    /* JADX INFO: renamed from: l */
    public int f7675l;

    /* JADX INFO: renamed from: l0 */
    public boolean f7676l0;

    /* JADX INFO: renamed from: m0 */
    public boolean f7677m0;

    /* JADX INFO: renamed from: n0 */
    public int f7678n0;

    /* JADX INFO: renamed from: o0 */
    public ArrayList f7679o0;

    /* JADX INFO: renamed from: p0 */
    public InterfaceC1209i f7680p0;

    /* JADX INFO: renamed from: q0 */
    public ArrayList f7681q0;

    /* JADX INFO: renamed from: r0 */
    public final RunnableC1203c f7682r0;

    /* JADX INFO: renamed from: s0 */
    public int f7683s0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1200a();

        /* JADX INFO: renamed from: c */
        public int f7684c;

        /* JADX INFO: renamed from: d */
        public Parcelable f7685d;

        /* JADX INFO: renamed from: e */
        public final ClassLoader f7686e;

        /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$SavedState$a */
        public static class C1200a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f7684c = parcel.readInt();
            this.f7685d = parcel.readParcelable(classLoader);
            this.f7686e = classLoader;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" position=");
            return C0166e.m768o(sb2, this.f7684c, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5635a, i10);
            parcel.writeInt(this.f7684c);
            parcel.writeParcelable(this.f7685d, i10);
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$a */
    public static class C1201a implements Comparator<C1205e> {
        @Override // java.util.Comparator
        public final int compare(C1205e c1205e, C1205e c1205e2) {
            return c1205e.f7689b - c1205e2.f7689b;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$b */
    public static class InterpolatorC1202b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f3) {
            float f10 = f3 - 1.0f;
            return (f10 * f10 * f10 * f10 * f10) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$c */
    public class RunnableC1203c implements Runnable {
        public RunnableC1203c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewPager viewPager = ViewPager.this;
            viewPager.setScrollState(0);
            viewPager.m4656q();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$d */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC1204d {
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$e */
    public static class C1205e {

        /* JADX INFO: renamed from: a */
        public Object f7688a;

        /* JADX INFO: renamed from: b */
        public int f7689b;

        /* JADX INFO: renamed from: c */
        public boolean f7690c;

        /* JADX INFO: renamed from: d */
        public float f7691d;

        /* JADX INFO: renamed from: e */
        public float f7692e;
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$f */
    public static class C1206f extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a */
        public boolean f7693a;

        /* JADX INFO: renamed from: b */
        public final int f7694b;

        /* JADX INFO: renamed from: c */
        public float f7695c;

        /* JADX INFO: renamed from: d */
        public boolean f7696d;

        public C1206f() {
            super(-1, -1);
            this.f7695c = 0.0f;
        }

        public C1206f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7695c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f7634t0);
            this.f7694b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$g */
    public class C1207g extends C10026a {
        public C1207g() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001f  */
        @Override // p471x2.C10026a
        /* JADX INFO: renamed from: c */
        public final void mo2998c(View view, AccessibilityEvent accessibilityEvent) {
            boolean z10;
            AbstractC10290a abstractC10290a;
            super.mo2998c(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            ViewPager viewPager = ViewPager.this;
            AbstractC10290a abstractC10290a2 = viewPager.f7661e;
            if (abstractC10290a2 != null) {
                z10 = true;
                if (abstractC10290a2.mo17877c() <= 1) {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            if (accessibilityEvent.getEventType() != 4096 || (abstractC10290a = viewPager.f7661e) == null) {
                return;
            }
            accessibilityEvent.setItemCount(abstractC10290a.mo17877c());
            accessibilityEvent.setFromIndex(viewPager.f7663f);
            accessibilityEvent.setToIndex(viewPager.f7663f);
        }

        @Override // p471x2.C10026a
        /* JADX INFO: renamed from: d */
        public final void mo2999d(View view, C10284f c10284f) {
            this.f50989a.onInitializeAccessibilityNodeInfo(view, c10284f.f51739a);
            c10284f.m19264i(ViewPager.class.getName());
            ViewPager viewPager = ViewPager.this;
            AbstractC10290a abstractC10290a = viewPager.f7661e;
            c10284f.m19268m(abstractC10290a != null && abstractC10290a.mo17877c() > 1);
            if (viewPager.canScrollHorizontally(1)) {
                c10284f.m19256a(4096);
            }
            if (viewPager.canScrollHorizontally(-1)) {
                c10284f.m19256a(8192);
            }
        }

        @Override // p471x2.C10026a
        /* JADX INFO: renamed from: g */
        public final boolean mo3000g(View view, int i10, Bundle bundle) {
            if (super.mo3000g(view, i10, bundle)) {
                return true;
            }
            ViewPager viewPager = ViewPager.this;
            if (i10 == 4096) {
                if (!viewPager.canScrollHorizontally(1)) {
                    return false;
                }
                viewPager.setCurrentItem(viewPager.f7663f + 1);
                return true;
            }
            if (i10 == 8192 && viewPager.canScrollHorizontally(-1)) {
                viewPager.setCurrentItem(viewPager.f7663f - 1);
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$h */
    public interface InterfaceC1208h {
        /* JADX INFO: renamed from: a */
        void mo4662a(ViewPager viewPager, AbstractC10290a abstractC10290a);
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$i */
    public interface InterfaceC1209i {
        /* JADX INFO: renamed from: a */
        void mo4663a(float f3, int i10);

        /* JADX INFO: renamed from: b */
        void mo4664b(int i10);

        /* JADX INFO: renamed from: c */
        void mo4665c(int i10);
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$j */
    public class C1210j extends DataSetObserver {
        public C1210j() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ViewPager.this.m4645f();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ViewPager.this.m4645f();
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7655b = new ArrayList<>();
        this.f7657c = new C1205e();
        this.f7659d = new Rect();
        this.f7665g = -1;
        this.f7667h = null;
        this.f7640K = -3.4028235E38f;
        this.f7641L = Float.MAX_VALUE;
        this.f7646Q = 1;
        this.f7660d0 = -1;
        this.f7676l0 = true;
        this.f7682r0 = new RunnableC1203c();
        this.f7683s0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f7669i = new Scroller(context2, f7636v0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f3 = context2.getResources().getDisplayMetrics().density;
        this.f7651V = viewConfiguration.getScaledPagingTouchSlop();
        this.f7664f0 = (int) (400.0f * f3);
        this.f7666g0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f7672j0 = new EdgeEffect(context2);
        this.f7674k0 = new EdgeEffect(context2);
        this.f7668h0 = (int) (25.0f * f3);
        this.f7670i0 = (int) (2.0f * f3);
        this.f7649T = (int) (f3 * 16.0f);
        C10029b0.m18658n(this, new C1207g());
        if (C10029b0.d.m18666c(this) == 0) {
            C10029b0.d.m18682s(this, 1);
        }
        C10029b0.i.m18727u(this, new C10291b(this));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m4640d(int i10, int i11, int i12, View view, boolean z10) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && m4640d(i10, i14 - childAt.getLeft(), i13 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.f7644O != z10) {
            this.f7644O = z10;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C1205e m4641a(int i10, int i11) {
        C1205e c1205e = new C1205e();
        c1205e.f7689b = i10;
        c1205e.f7688a = this.f7661e.mo17878e(this, i10);
        this.f7661e.getClass();
        c1205e.f7691d = 1.0f;
        ArrayList<C1205e> arrayList = this.f7655b;
        if (i11 < 0 || i11 >= arrayList.size()) {
            arrayList.add(c1205e);
        } else {
            arrayList.add(i11, c1205e);
        }
        return c1205e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        C1205e c1205eM4648i;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (c1205eM4648i = m4648i(childAt)) != null && c1205eM4648i.f7689b == this.f7663f) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if (descendantFocusability == 262144 && size != arrayList.size()) {
            return;
        }
        if (isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        C1205e c1205eM4648i;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (c1205eM4648i = m4648i(childAt)) != null && c1205eM4648i.f7689b == this.f7663f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C1206f c1206f = (C1206f) layoutParams;
        boolean z10 = c1206f.f7693a | (view.getClass().getAnnotation(InterfaceC1204d.class) != null);
        c1206f.f7693a = z10;
        if (!this.f7643N) {
            super.addView(view, i10, layoutParams);
        } else {
            if (z10) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c1206f.f7696d = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4642b(InterfaceC1209i interfaceC1209i) {
        if (this.f7679o0 == null) {
            this.f7679o0 = new ArrayList();
        }
        this.f7679o0.add(interfaceC1209i);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00db  */
    /* JADX WARN: Code duplicated, block: B:44:0x00de  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:59:0x0100  */
    /* JADX INFO: renamed from: c */
    public final boolean m4643c(int i10) {
        boolean z10;
        View viewFindNextFocus;
        int i11;
        boolean zRequestFocus;
        View viewFindFocus = findFocus();
        boolean z11 = true;
        boolean zM4653n = false;
        if (viewFindFocus != this) {
            if (viewFindFocus != null) {
                ViewParent parent = viewFindFocus.getParent();
                while (true) {
                    if (!(parent instanceof ViewGroup)) {
                        z10 = false;
                        break;
                    }
                    if (parent == this) {
                        z10 = true;
                        break;
                    }
                    parent = parent.getParent();
                }
                if (!z10) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb2.append(" => ");
                        sb2.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb2.toString());
                }
            }
            viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
            if (viewFindNextFocus == null && viewFindNextFocus != viewFindFocus) {
                Rect rect = this.f7659d;
                if (i10 == 17) {
                    int i12 = m4647h(viewFindNextFocus, rect).left;
                    int i13 = m4647h(viewFindFocus, rect).left;
                    if (viewFindFocus == null || i12 < i13) {
                        zRequestFocus = viewFindNextFocus.requestFocus();
                    } else {
                        int i14 = this.f7663f;
                        if (i14 > 0) {
                            this.f7645P = false;
                            m4661v(i14 - 1, 0, true, false);
                        } else {
                            z11 = false;
                        }
                        zM4653n = z11;
                    }
                } else if (i10 == 66) {
                    zRequestFocus = (viewFindFocus == null || m4647h(viewFindNextFocus, rect).left > m4647h(viewFindFocus, rect).left) ? viewFindNextFocus.requestFocus() : m4653n();
                }
                zM4653n = zRequestFocus;
            } else if (i10 != 17 || i10 == 1) {
                i11 = this.f7663f;
                if (i11 > 0) {
                    this.f7645P = false;
                    m4661v(i11 - 1, 0, true, false);
                } else {
                    z11 = false;
                }
                zM4653n = z11;
            } else if (i10 == 66 || i10 == 2) {
                zM4653n = m4653n();
            }
            if (zM4653n) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
            }
            return zM4653n;
        }
        viewFindFocus = null;
        viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        if (viewFindNextFocus == null) {
            if (i10 != 17) {
            }
            i11 = this.f7663f;
            if (i11 > 0) {
                this.f7645P = false;
                m4661v(i11 - 1, 0, true, false);
            } else {
                z11 = false;
            }
            zM4653n = z11;
        } else {
            if (i10 != 17) {
            }
            i11 = this.f7663f;
            if (i11 > 0) {
                this.f7645P = false;
                m4661v(i11 - 1, 0, true, false);
            } else {
                z11 = false;
            }
            zM4653n = z11;
        }
        if (zM4653n) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
        }
        return zM4653n;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        boolean z10 = false;
        if (this.f7661e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.f7640K));
        }
        if (i10 > 0 && scrollX < ((int) (clientWidth * this.f7641L))) {
            z10 = true;
        }
        return z10;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1206f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f7671j = true;
        if (this.f7669i.isFinished() || !this.f7669i.computeScrollOffset()) {
            m4644e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f7669i.getCurrX();
        int currY = this.f7669i.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!m4654o(currX)) {
                this.f7669i.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.d.m18674k(this);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zM4643c;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode == 22) {
                    zM4643c = keyEvent.hasModifiers(2) ? m4653n() : m4643c(66);
                } else if (keyCode == 61) {
                    if (keyEvent.hasNoModifiers()) {
                        zM4643c = m4643c(2);
                    } else {
                        zM4643c = keyEvent.hasModifiers(1) ? m4643c(1) : false;
                    }
                }
            } else if (keyEvent.hasModifiers(2)) {
                int i10 = this.f7663f;
                if (i10 > 0) {
                    this.f7645P = false;
                    m4661v(i10 - 1, 0, true, false);
                    zM4643c = true;
                }
            } else {
                zM4643c = m4643c(17);
            }
        }
        return zM4643c;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C1205e c1205eM4648i;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (c1205eM4648i = m4648i(childAt)) != null && c1205eM4648i.f7689b == this.f7663f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        AbstractC10290a abstractC10290a;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC10290a = this.f7661e) != null && abstractC10290a.mo17877c() > 1)) {
            if (!this.f7672j0.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f7640K * width);
                this.f7672j0.setSize(height, width);
                zDraw = false | this.f7672j0.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f7674k0.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f7641L + 1.0f)) * width2);
                this.f7674k0.setSize(height2, width2);
                zDraw |= this.f7674k0.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.f7672j0.finish();
            this.f7674k0.finish();
        }
        if (zDraw) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.d.m18674k(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f7637H;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4644e(boolean z10) {
        boolean z11 = this.f7683s0 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f7669i.isFinished()) {
                this.f7669i.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f7669i.getCurrX();
                int currY = this.f7669i.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m4654o(currX);
                    }
                }
            }
        }
        this.f7645P = false;
        int i10 = 0;
        while (true) {
            ArrayList<C1205e> arrayList = this.f7655b;
            if (i10 >= arrayList.size()) {
                break;
            }
            C1205e c1205e = arrayList.get(i10);
            if (c1205e.f7690c) {
                c1205e.f7690c = false;
                z11 = true;
            }
            i10++;
        }
        if (z11) {
            RunnableC1203c runnableC1203c = this.f7682r0;
            if (z10) {
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                C10029b0.d.m18676m(this, runnableC1203c);
                return;
            }
            runnableC1203c.run();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4645f() {
        int iMo17877c = this.f7661e.mo17877c();
        this.f7653a = iMo17877c;
        ArrayList<C1205e> arrayList = this.f7655b;
        boolean z10 = arrayList.size() < (this.f7646Q * 2) + 1 && arrayList.size() < iMo17877c;
        int i10 = this.f7663f;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            C1205e c1205e = arrayList.get(i11);
            AbstractC10290a abstractC10290a = this.f7661e;
            Object obj = c1205e.f7688a;
            abstractC10290a.getClass();
        }
        Collections.sort(arrayList, f7635u0);
        if (z10) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                C1206f c1206f = (C1206f) getChildAt(i12).getLayoutParams();
                if (!c1206f.f7693a) {
                    c1206f.f7695c = 0.0f;
                }
            }
            m4661v(i10, 0, false, true);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m4646g(int i10) {
        InterfaceC1209i interfaceC1209i = this.f7680p0;
        if (interfaceC1209i != null) {
            interfaceC1209i.mo4665c(i10);
        }
        ArrayList arrayList = this.f7679o0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                InterfaceC1209i interfaceC1209i2 = (InterfaceC1209i) this.f7679o0.get(i11);
                if (interfaceC1209i2 != null) {
                    interfaceC1209i2.mo4665c(i10);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1206f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1206f(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC10290a getAdapter() {
        return this.f7661e;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f7663f;
    }

    public int getOffscreenPageLimit() {
        return this.f7646Q;
    }

    public int getPageMargin() {
        return this.f7675l;
    }

    /* JADX INFO: renamed from: h */
    public final Rect m4647h(View view, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* JADX INFO: renamed from: i */
    public final C1205e m4648i(View view) {
        int i10 = 0;
        while (true) {
            ArrayList<C1205e> arrayList = this.f7655b;
            if (i10 >= arrayList.size()) {
                return null;
            }
            C1205e c1205e = arrayList.get(i10);
            if (this.f7661e.mo3733f(view, c1205e.f7688a)) {
                return c1205e;
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: j */
    public final C1205e m4649j() {
        C1205e c1205e;
        int i10;
        int clientWidth = getClientWidth();
        float f3 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f10 = clientWidth > 0 ? this.f7675l / clientWidth : 0.0f;
        int i11 = 0;
        boolean z10 = true;
        C1205e c1205e2 = null;
        int i12 = -1;
        float f11 = 0.0f;
        while (true) {
            ArrayList<C1205e> arrayList = this.f7655b;
            if (i11 >= arrayList.size()) {
                return c1205e2;
            }
            C1205e c1205e3 = arrayList.get(i11);
            if (z10 || c1205e3.f7689b == (i10 = i12 + 1)) {
                c1205e = c1205e3;
            } else {
                float f12 = f3 + f11 + f10;
                C1205e c1205e4 = this.f7657c;
                c1205e4.f7692e = f12;
                c1205e4.f7689b = i10;
                this.f7661e.getClass();
                c1205e4.f7691d = 1.0f;
                i11--;
                c1205e = c1205e4;
            }
            f3 = c1205e.f7692e;
            float f13 = c1205e.f7691d + f3 + f10;
            if (!z10 && scrollX < f3) {
                return c1205e2;
            }
            if (scrollX >= f13 && i11 != arrayList.size() - 1) {
                int i13 = c1205e.f7689b;
                float f14 = c1205e.f7691d;
                i11++;
                z10 = false;
                C1205e c1205e5 = c1205e;
                i12 = i13;
                f11 = f14;
                c1205e2 = c1205e5;
            }
            return c1205e;
        }
    }

    /* JADX INFO: renamed from: k */
    public final C1205e m4650k(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList<C1205e> arrayList = this.f7655b;
            if (i11 >= arrayList.size()) {
                return null;
            }
            C1205e c1205e = arrayList.get(i11);
            if (c1205e.f7689b == i10) {
                return c1205e;
            }
            i11++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0077  */
    /* JADX INFO: renamed from: l */
    public final void m4651l(float f3, int i10, int i11) {
        int iMax;
        int width;
        int left;
        if (this.f7678n0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                C1206f c1206f = (C1206f) childAt.getLayoutParams();
                if (c1206f.f7693a) {
                    int i13 = c1206f.f7694b & 7;
                    if (i13 != 1) {
                        if (i13 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i13 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i14 = iMax;
                    width = paddingLeft;
                    paddingLeft = i14;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        InterfaceC1209i interfaceC1209i = this.f7680p0;
        if (interfaceC1209i != null) {
            interfaceC1209i.mo4663a(f3, i10);
        }
        ArrayList arrayList = this.f7679o0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                InterfaceC1209i interfaceC1209i2 = (InterfaceC1209i) this.f7679o0.get(i15);
                if (interfaceC1209i2 != null) {
                    interfaceC1209i2.mo4663a(f3, i10);
                }
            }
        }
        this.f7677m0 = true;
    }

    /* JADX INFO: renamed from: m */
    public final void m4652m(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f7660d0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f7652W = motionEvent.getX(i10);
            this.f7660d0 = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f7662e0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m4653n() {
        AbstractC10290a abstractC10290a = this.f7661e;
        if (abstractC10290a == null || this.f7663f >= abstractC10290a.mo17877c() - 1) {
            return false;
        }
        int i10 = this.f7663f + 1;
        this.f7645P = false;
        m4661v(i10, 0, true, false);
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: o */
    public final boolean m4654o(int i10) {
        if (this.f7655b.size() == 0) {
            if (this.f7676l0) {
                return false;
            }
            this.f7677m0 = false;
            m4651l(0.0f, 0, 0);
            if (this.f7677m0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C1205e c1205eM4649j = m4649j();
        int clientWidth = getClientWidth();
        int i11 = this.f7675l;
        float f3 = clientWidth;
        int i12 = c1205eM4649j.f7689b;
        float f10 = ((i10 / f3) - c1205eM4649j.f7692e) / (c1205eM4649j.f7691d + (i11 / f3));
        this.f7677m0 = false;
        m4651l(f10, i12, (int) ((clientWidth + i11) * f10));
        if (this.f7677m0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7676l0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f7682r0);
        Scroller scroller = this.f7669i;
        if (scroller != null && !scroller.isFinished()) {
            this.f7669i.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        float f3;
        super.onDraw(canvas);
        if (this.f7675l <= 0 || this.f7637H == null) {
            return;
        }
        ArrayList<C1205e> arrayList = this.f7655b;
        if (arrayList.size() <= 0 || this.f7661e == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f10 = width;
        float f11 = this.f7675l / f10;
        int i11 = 0;
        C1205e c1205e = arrayList.get(0);
        float f12 = c1205e.f7692e;
        int size = arrayList.size();
        int i12 = c1205e.f7689b;
        int i13 = arrayList.get(size - 1).f7689b;
        while (i12 < i13) {
            while (true) {
                i10 = c1205e.f7689b;
                if (i12 <= i10 || i11 >= size) {
                    break;
                }
                i11++;
                c1205e = arrayList.get(i11);
            }
            if (i12 == i10) {
                float f13 = c1205e.f7692e;
                float f14 = c1205e.f7691d;
                f3 = (f13 + f14) * f10;
                f12 = f13 + f14 + f11;
            } else {
                this.f7661e.getClass();
                f3 = (f12 + 1.0f) * f10;
                f12 = 1.0f + f11 + f12;
            }
            if (this.f7675l + f3 > scrollX) {
                this.f7637H.setBounds(Math.round(f3), this.f7638I, Math.round(this.f7675l + f3), this.f7639J);
                this.f7637H.draw(canvas);
            }
            if (f3 > scrollX + width) {
                return;
            }
            i12++;
            arrayList = arrayList;
            f11 = f11;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.f7647R) {
                    return true;
                }
                if (this.f7648S) {
                    return false;
                }
            }
            if (action == 0) {
                float x10 = motionEvent.getX();
                this.f7656b0 = x10;
                this.f7652W = x10;
                float y10 = motionEvent.getY();
                this.f7658c0 = y10;
                this.f7654a0 = y10;
                this.f7660d0 = motionEvent.getPointerId(0);
                this.f7648S = false;
                this.f7671j = true;
                this.f7669i.computeScrollOffset();
                if (this.f7683s0 != 2 || Math.abs(this.f7669i.getFinalX() - this.f7669i.getCurrX()) <= this.f7670i0) {
                    m4644e(false);
                    this.f7647R = false;
                } else {
                    this.f7669i.abortAnimation();
                    this.f7645P = false;
                    m4656q();
                    this.f7647R = true;
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                }
            } else if (action == 2) {
                int i10 = this.f7660d0;
                if (i10 != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                    float x11 = motionEvent.getX(iFindPointerIndex);
                    float f3 = x11 - this.f7652W;
                    float fAbs = Math.abs(f3);
                    float y11 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y11 - this.f7658c0);
                    if (f3 != 0.0f) {
                        float f10 = this.f7652W;
                        if (!((f10 < ((float) this.f7650U) && f3 > 0.0f) || (f10 > ((float) (getWidth() - this.f7650U)) && f3 < 0.0f)) && m4640d((int) f3, (int) x11, (int) y11, this, false)) {
                            this.f7652W = x11;
                            this.f7654a0 = y11;
                            this.f7648S = true;
                            return false;
                        }
                    }
                    float f11 = this.f7651V;
                    if (fAbs > f11 && fAbs * 0.5f > fAbs2) {
                        this.f7647R = true;
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        setScrollState(1);
                        float f12 = this.f7656b0;
                        float f13 = this.f7651V;
                        this.f7652W = f3 > 0.0f ? f12 + f13 : f12 - f13;
                        this.f7654a0 = y11;
                        setScrollingCacheEnabled(true);
                    } else if (fAbs2 > f11) {
                        this.f7648S = true;
                    }
                    if (this.f7647R && m4655p(x11)) {
                        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                        C10029b0.d.m18674k(this);
                    }
                }
            } else if (action == 6) {
                m4652m(motionEvent);
            }
            if (this.f7662e0 == null) {
                this.f7662e0 = VelocityTracker.obtain();
            }
            this.f7662e0.addMovement(motionEvent);
            return this.f7647R;
        }
        m4659t();
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0079  */
    /* JADX WARN: Code duplicated, block: B:24:0x007f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    /* JADX WARN: Code duplicated, block: B:29:0x0098  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        C1205e c1205eM4648i;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                C1206f c1206f = (C1206f) childAt.getLayoutParams();
                if (c1206f.f7693a) {
                    int i18 = c1206f.f7694b;
                    int i19 = i18 & 7;
                    int i20 = i18 & 112;
                    if (i19 != 1) {
                        if (i19 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i19 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i14 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i20 != 16) {
                            if (i20 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i20 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i21 = paddingLeft + scrollX;
                            childAt.layout(i21, paddingTop, childAt.getMeasuredWidth() + i21, childAt.getMeasuredHeight() + paddingTop);
                            i16++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i22 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i22;
                        int i23 = paddingLeft + scrollX;
                        childAt.layout(i23, paddingTop, childAt.getMeasuredWidth() + i23, childAt.getMeasuredHeight() + paddingTop);
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i14 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i24 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i24;
                    if (i20 != 16) {
                        if (i20 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i20 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i25 = paddingLeft + scrollX;
                        childAt.layout(i25, paddingTop, childAt.getMeasuredWidth() + i25, childAt.getMeasuredHeight() + paddingTop);
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i26 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i26;
                    int i27 = paddingLeft + scrollX;
                    childAt.layout(i27, paddingTop, childAt.getMeasuredWidth() + i27, childAt.getMeasuredHeight() + paddingTop);
                    i16++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i28 = (i14 - paddingLeft) - paddingRight;
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt2 = getChildAt(i29);
            if (childAt2.getVisibility() != 8) {
                C1206f c1206f2 = (C1206f) childAt2.getLayoutParams();
                if (!c1206f2.f7693a && (c1205eM4648i = m4648i(childAt2)) != null) {
                    float f3 = i28;
                    int i30 = ((int) (c1205eM4648i.f7692e * f3)) + paddingLeft;
                    if (c1206f2.f7696d) {
                        c1206f2.f7696d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f3 * c1206f2.f7695c), 1073741824), View.MeasureSpec.makeMeasureSpec((i15 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i30, paddingTop, childAt2.getMeasuredWidth() + i30, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f7638I = paddingTop;
        this.f7639J = i15 - paddingBottom;
        this.f7678n0 = i16;
        if (this.f7676l0) {
            z11 = false;
            m4660u(this.f7663f, 0, false, false);
        } else {
            z11 = false;
        }
        this.f7676l0 = z11;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        C1206f c1206f;
        C1206f c1206f2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.f7650U = Math.min(measuredWidth / 10, this.f7649T);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (c1206f2 = (C1206f) childAt.getLayoutParams()) != null && c1206f2.f7693a) {
                int i15 = c1206f2.f7694b;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z11 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z11) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) c1206f2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) c1206f2).height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f7642M = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f7643N = true;
        m4656q();
        this.f7643N = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((c1206f = (C1206f) childAt2.getLayoutParams()) == null || !c1206f.f7693a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c1206f.f7695c), 1073741824), this.f7642M);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        C1205e c1205eM4648i;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (c1205eM4648i = m4648i(childAt)) != null && c1205eM4648i.f7689b == this.f7663f && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
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
        super.onRestoreInstanceState(savedState.f5635a);
        AbstractC10290a abstractC10290a = this.f7661e;
        if (abstractC10290a != null) {
            abstractC10290a.mo3734g();
            m4661v(savedState.f7684c, 0, false, true);
        } else {
            this.f7665g = savedState.f7684c;
            this.f7667h = savedState.f7685d;
            ClassLoader classLoader = savedState.f7686e;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7684c = this.f7663f;
        AbstractC10290a abstractC10290a = this.f7661e;
        if (abstractC10290a != null) {
            abstractC10290a.mo3735h();
            savedState.f7685d = null;
        }
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f7675l;
            m4658s(i10, i12, i14, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0107  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC10290a abstractC10290a;
        boolean zM4659t = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (abstractC10290a = this.f7661e) == null || abstractC10290a.mo17877c() == 0) {
            return false;
        }
        if (this.f7662e0 == null) {
            this.f7662e0 = VelocityTracker.obtain();
        }
        this.f7662e0.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f7669i.abortAnimation();
            this.f7645P = false;
            m4656q();
            float x10 = motionEvent.getX();
            this.f7656b0 = x10;
            this.f7652W = x10;
            float y10 = motionEvent.getY();
            this.f7658c0 = y10;
            this.f7654a0 = y10;
            this.f7660d0 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f7652W = motionEvent.getX(actionIndex);
                        this.f7660d0 = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        m4652m(motionEvent);
                        this.f7652W = motionEvent.getX(motionEvent.findPointerIndex(this.f7660d0));
                    }
                } else if (this.f7647R) {
                    m4660u(this.f7663f, 0, true, false);
                    zM4659t = m4659t();
                }
            } else if (!this.f7647R) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f7660d0);
                if (iFindPointerIndex == -1) {
                    zM4659t = m4659t();
                } else {
                    float x11 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x11 - this.f7652W);
                    float y11 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y11 - this.f7654a0);
                    if (fAbs > this.f7651V && fAbs > fAbs2) {
                        this.f7647R = true;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        float f3 = this.f7656b0;
                        this.f7652W = x11 - f3 > 0.0f ? f3 + this.f7651V : f3 - this.f7651V;
                        this.f7654a0 = y11;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f7647R) {
                        zM4659t = false | m4655p(motionEvent.getX(motionEvent.findPointerIndex(this.f7660d0)));
                    }
                }
            } else if (this.f7647R) {
                zM4659t = false | m4655p(motionEvent.getX(motionEvent.findPointerIndex(this.f7660d0)));
            }
        } else if (this.f7647R) {
            VelocityTracker velocityTracker = this.f7662e0;
            velocityTracker.computeCurrentVelocity(1000, this.f7666g0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f7660d0);
            this.f7645P = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C1205e c1205eM4649j = m4649j();
            float f10 = clientWidth;
            float f11 = this.f7675l / f10;
            int iMax = c1205eM4649j.f7689b;
            float f12 = ((scrollX / f10) - c1205eM4649j.f7692e) / (c1205eM4649j.f7691d + f11);
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f7660d0)) - this.f7656b0)) <= this.f7668h0 || Math.abs(xVelocity) <= this.f7664f0) {
                iMax += (int) (f12 + (iMax >= this.f7663f ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                iMax++;
            }
            ArrayList<C1205e> arrayList = this.f7655b;
            if (arrayList.size() > 0) {
                iMax = Math.max(arrayList.get(0).f7689b, Math.min(iMax, arrayList.get(arrayList.size() - 1).f7689b));
            }
            m4661v(iMax, xVelocity, true, true);
            zM4659t = m4659t();
        }
        if (zM4659t) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.d.m18674k(this);
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m4655p(float f3) {
        boolean z10;
        boolean z11;
        float f10 = this.f7652W - f3;
        this.f7652W = f3;
        float scrollX = getScrollX() + f10;
        float clientWidth = getClientWidth();
        float f11 = this.f7640K * clientWidth;
        float f12 = this.f7641L * clientWidth;
        ArrayList<C1205e> arrayList = this.f7655b;
        boolean z12 = false;
        C1205e c1205e = arrayList.get(0);
        C1205e c1205e2 = arrayList.get(arrayList.size() - 1);
        if (c1205e.f7689b != 0) {
            f11 = c1205e.f7692e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (c1205e2.f7689b != this.f7661e.mo17877c() - 1) {
            f12 = c1205e2.f7692e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f11) {
            if (z10) {
                this.f7672j0.onPull(Math.abs(f11 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f11;
        } else if (scrollX > f12) {
            if (z11) {
                this.f7674k0.onPull(Math.abs(scrollX - f12) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        }
        int i10 = (int) scrollX;
        this.f7652W = (scrollX - i10) + this.f7652W;
        scrollTo(i10, getScrollY());
        m4654o(i10);
        return z12;
    }

    /* JADX INFO: renamed from: q */
    public final void m4656q() {
        m4657r(this.f7663f);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00df A[PHI: r2 r6 r12
      0x00df: PHI (r2v21 int) = (r2v20 int), (r2v9 int), (r2v23 int) binds: [B:58:0x00d6, B:55:0x00c2, B:49:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r6v6 int) = (r6v1 int), (r6v5 int), (r6v8 int) binds: [B:58:0x00d6, B:55:0x00c2, B:49:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r12v5 float) = (r12v3 float), (r12v4 float), (r12v2 float) binds: [B:58:0x00d6, B:55:0x00c2, B:49:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x0166 A[PHI: r1 r10
      0x0166: PHI (r1v17 float) = (r1v15 float), (r1v16 float), (r1v14 float) binds: [B:92:0x015d, B:89:0x0147, B:83:0x012f] A[DONT_GENERATE, DONT_INLINE]
      0x0166: PHI (r10v29 int) = (r10v27 int), (r10v28 int), (r10v26 int) binds: [B:92:0x015d, B:89:0x0147, B:83:0x012f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: r */
    public final void m4657r(int i10) {
        C1205e c1205eM4650k;
        String hexString;
        ArrayList<C1205e> arrayList;
        C1205e c1205eM4641a;
        C1205e c1205eM4648i;
        C1205e c1205eM4648i2;
        int i11;
        int i12;
        C1205e c1205e;
        C1205e c1205e2;
        int i13 = this.f7663f;
        if (i13 != i10) {
            c1205eM4650k = m4650k(i13);
            this.f7663f = i10;
        } else {
            c1205eM4650k = null;
        }
        if (this.f7661e == null || this.f7645P || getWindowToken() == null) {
            return;
        }
        this.f7661e.mo3737j(this);
        int i14 = this.f7646Q;
        int i15 = 0;
        int iMax = Math.max(0, this.f7663f - i14);
        int iMo17877c = this.f7661e.mo17877c();
        int iMin = Math.min(iMo17877c - 1, this.f7663f + i14);
        if (iMo17877c != this.f7653a) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f7653a + ", found: " + iMo17877c + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f7661e.getClass());
        }
        while (true) {
            arrayList = this.f7655b;
            if (i15 < arrayList.size()) {
                c1205eM4641a = arrayList.get(i15);
                int i16 = c1205eM4641a.f7689b;
                int i17 = this.f7663f;
                if (i16 >= i17) {
                    if (i16 != i17) {
                        break;
                    } else {
                        break;
                    }
                }
                i15++;
            }
            c1205eM4641a = null;
            break;
        }
        if (c1205eM4641a == null && iMo17877c > 0) {
            c1205eM4641a = m4641a(this.f7663f, i15);
        }
        if (c1205eM4641a != null) {
            int i18 = i15 - 1;
            C1205e c1205e3 = i18 >= 0 ? arrayList.get(i18) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - c1205eM4641a.f7691d) + (getPaddingLeft() / clientWidth);
            float f3 = 0.0f;
            for (int i19 = this.f7663f - 1; i19 >= 0; i19--) {
                if (f3 >= paddingLeft && i19 < iMax) {
                    if (c1205e3 == null) {
                        break;
                    }
                    if (i19 == c1205e3.f7689b && !c1205e3.f7690c) {
                        arrayList.remove(i18);
                        this.f7661e.mo3731a(this, c1205e3.f7688a);
                        i18--;
                        i15--;
                        if (i18 >= 0) {
                            c1205e3 = arrayList.get(i18);
                        } else {
                            c1205e3 = null;
                        }
                    }
                } else if (c1205e3 == null || i19 != c1205e3.f7689b) {
                    f3 += m4641a(i19, i18 + 1).f7691d;
                    i15++;
                    if (i18 >= 0) {
                        c1205e3 = arrayList.get(i18);
                    } else {
                        c1205e3 = null;
                    }
                } else {
                    f3 += c1205e3.f7691d;
                    i18--;
                    if (i18 >= 0) {
                        c1205e3 = arrayList.get(i18);
                    } else {
                        c1205e3 = null;
                    }
                }
            }
            float f10 = c1205eM4641a.f7691d;
            int i20 = i15 + 1;
            if (f10 < 2.0f) {
                C1205e c1205e4 = i20 < arrayList.size() ? arrayList.get(i20) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i21 = i20;
                for (int i22 = this.f7663f + 1; i22 < iMo17877c; i22++) {
                    if (f10 >= paddingRight && i22 > iMin) {
                        if (c1205e4 == null) {
                            break;
                        }
                        if (i22 == c1205e4.f7689b && !c1205e4.f7690c) {
                            arrayList.remove(i21);
                            this.f7661e.mo3731a(this, c1205e4.f7688a);
                            if (i21 < arrayList.size()) {
                                c1205e4 = arrayList.get(i21);
                            } else {
                                c1205e4 = null;
                            }
                        }
                    } else if (c1205e4 == null || i22 != c1205e4.f7689b) {
                        C1205e c1205eM4641a2 = m4641a(i22, i21);
                        i21++;
                        f10 += c1205eM4641a2.f7691d;
                        if (i21 < arrayList.size()) {
                            c1205e4 = arrayList.get(i21);
                        } else {
                            c1205e4 = null;
                        }
                    } else {
                        f10 += c1205e4.f7691d;
                        i21++;
                        if (i21 < arrayList.size()) {
                            c1205e4 = arrayList.get(i21);
                        } else {
                            c1205e4 = null;
                        }
                    }
                }
            }
            int iMo17877c2 = this.f7661e.mo17877c();
            int clientWidth2 = getClientWidth();
            float f11 = clientWidth2 > 0 ? this.f7675l / clientWidth2 : 0.0f;
            if (c1205eM4650k != null) {
                int i23 = c1205eM4650k.f7689b;
                int i24 = c1205eM4641a.f7689b;
                if (i23 < i24) {
                    float f12 = c1205eM4650k.f7692e + c1205eM4650k.f7691d + f11;
                    int i25 = i23 + 1;
                    int i26 = 0;
                    while (i25 <= c1205eM4641a.f7689b && i26 < arrayList.size()) {
                        C1205e c1205e5 = arrayList.get(i26);
                        while (true) {
                            c1205e2 = c1205e5;
                            if (i25 <= c1205e2.f7689b || i26 >= arrayList.size() - 1) {
                                break;
                            }
                            i26++;
                            c1205e5 = arrayList.get(i26);
                        }
                        while (i25 < c1205e2.f7689b) {
                            this.f7661e.getClass();
                            f12 += 1.0f + f11;
                            i25++;
                        }
                        c1205e2.f7692e = f12;
                        f12 += c1205e2.f7691d + f11;
                        i25++;
                    }
                } else if (i23 > i24) {
                    int size = arrayList.size() - 1;
                    float f13 = c1205eM4650k.f7692e;
                    while (true) {
                        i23--;
                        if (i23 < c1205eM4641a.f7689b || size < 0) {
                            break;
                        }
                        C1205e c1205e6 = arrayList.get(size);
                        while (true) {
                            c1205e = c1205e6;
                            if (i23 >= c1205e.f7689b || size <= 0) {
                                break;
                            }
                            size--;
                            c1205e6 = arrayList.get(size);
                        }
                        while (i23 > c1205e.f7689b) {
                            this.f7661e.getClass();
                            f13 -= 1.0f + f11;
                            i23--;
                        }
                        f13 -= c1205e.f7691d + f11;
                        c1205e.f7692e = f13;
                    }
                }
            }
            int size2 = arrayList.size();
            float f14 = c1205eM4641a.f7692e;
            int i27 = c1205eM4641a.f7689b;
            int i28 = i27 - 1;
            this.f7640K = i27 == 0 ? f14 : -3.4028235E38f;
            int i29 = iMo17877c2 - 1;
            this.f7641L = i27 == i29 ? (c1205eM4641a.f7691d + f14) - 1.0f : Float.MAX_VALUE;
            int i30 = i15 - 1;
            while (i30 >= 0) {
                C1205e c1205e7 = arrayList.get(i30);
                while (true) {
                    i12 = c1205e7.f7689b;
                    if (i28 <= i12) {
                        break;
                    }
                    i28--;
                    this.f7661e.getClass();
                    f14 -= 1.0f + f11;
                }
                f14 -= c1205e7.f7691d + f11;
                c1205e7.f7692e = f14;
                if (i12 == 0) {
                    this.f7640K = f14;
                }
                i30--;
                i28--;
            }
            float f15 = c1205eM4641a.f7692e + c1205eM4641a.f7691d + f11;
            int i31 = c1205eM4641a.f7689b;
            while (true) {
                i31++;
                if (i20 >= size2) {
                    break;
                }
                C1205e c1205e8 = arrayList.get(i20);
                while (true) {
                    i11 = c1205e8.f7689b;
                    if (i31 >= i11) {
                        break;
                    }
                    i31++;
                    this.f7661e.getClass();
                    f15 += 1.0f + f11;
                }
                if (i11 == i29) {
                    this.f7641L = (c1205e8.f7691d + f15) - 1.0f;
                }
                c1205e8.f7692e = f15;
                f15 += c1205e8.f7691d + f11;
                i20++;
            }
            this.f7661e.mo3736i(c1205eM4641a.f7688a);
        }
        this.f7661e.mo3732b();
        int childCount = getChildCount();
        for (int i32 = 0; i32 < childCount; i32++) {
            View childAt = getChildAt(i32);
            C1206f c1206f = (C1206f) childAt.getLayoutParams();
            c1206f.getClass();
            if (!c1206f.f7693a && c1206f.f7695c == 0.0f && (c1205eM4648i2 = m4648i(childAt)) != null) {
                c1206f.f7695c = c1205eM4648i2.f7691d;
                int i33 = c1205eM4648i2.f7689b;
                c1206f.getClass();
            }
        }
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == null) {
                c1205eM4648i = null;
                break;
            }
            while (true) {
                Object parent = viewFindFocus.getParent();
                if (parent == this) {
                    c1205eM4648i = m4648i(viewFindFocus);
                    break;
                } else {
                    if (parent == null || !(parent instanceof View)) {
                        c1205eM4648i = null;
                        break;
                    }
                    viewFindFocus = (View) parent;
                }
            }
            if (c1205eM4648i == null || c1205eM4648i.f7689b != this.f7663f) {
                for (int i34 = 0; i34 < getChildCount(); i34++) {
                    View childAt2 = getChildAt(i34);
                    C1205e c1205eM4648i3 = m4648i(childAt2);
                    if (c1205eM4648i3 != null && c1205eM4648i3.f7689b == this.f7663f && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f7643N) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m4658s(int i10, int i11, int i12, int i13) {
        if (i11 <= 0 || this.f7655b.isEmpty()) {
            C1205e c1205eM4650k = m4650k(this.f7663f);
            int iMin = (int) ((c1205eM4650k != null ? Math.min(c1205eM4650k.f7692e, this.f7641L) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
            if (iMin != getScrollX()) {
                m4644e(false);
                scrollTo(iMin, getScrollY());
            }
            return;
        }
        if (!this.f7669i.isFinished()) {
            this.f7669i.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public void setAdapter(AbstractC10290a abstractC10290a) {
        ArrayList<C1205e> arrayList;
        AbstractC10290a abstractC10290a2 = this.f7661e;
        if (abstractC10290a2 != null) {
            synchronized (abstractC10290a2) {
                try {
                    abstractC10290a2.f51778b = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f7661e.mo3737j(this);
            int i10 = 0;
            while (true) {
                arrayList = this.f7655b;
                if (i10 >= arrayList.size()) {
                    break;
                }
                C1205e c1205e = arrayList.get(i10);
                AbstractC10290a abstractC10290a3 = this.f7661e;
                int i11 = c1205e.f7689b;
                abstractC10290a3.mo3731a(this, c1205e.f7688a);
                i10++;
            }
            this.f7661e.mo3732b();
            arrayList.clear();
            int i12 = 0;
            while (i12 < getChildCount()) {
                if (!((C1206f) getChildAt(i12).getLayoutParams()).f7693a) {
                    removeViewAt(i12);
                    i12--;
                }
                i12++;
            }
            this.f7663f = 0;
            scrollTo(0, 0);
        }
        this.f7661e = abstractC10290a;
        this.f7653a = 0;
        if (abstractC10290a != null) {
            if (this.f7673k == null) {
                this.f7673k = new C1210j();
            }
            AbstractC10290a abstractC10290a4 = this.f7661e;
            C1210j c1210j = this.f7673k;
            synchronized (abstractC10290a4) {
                abstractC10290a4.f51778b = c1210j;
            }
            this.f7645P = false;
            boolean z10 = this.f7676l0;
            this.f7676l0 = true;
            this.f7653a = this.f7661e.mo17877c();
            if (this.f7665g >= 0) {
                this.f7661e.mo3734g();
                m4661v(this.f7665g, 0, false, true);
                this.f7665g = -1;
                this.f7667h = null;
            } else if (z10) {
                requestLayout();
            } else {
                m4656q();
            }
        }
        ArrayList arrayList2 = this.f7681q0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.f7681q0.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((InterfaceC1208h) this.f7681q0.get(i13)).mo4662a(this, abstractC10290a);
        }
    }

    public void setCurrentItem(int i10) {
        this.f7645P = false;
        m4661v(i10, 0, !this.f7676l0, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.f7646Q) {
            this.f7646Q = i10;
            m4656q();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC1209i interfaceC1209i) {
        this.f7680p0 = interfaceC1209i;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f7675l;
        this.f7675l = i10;
        int width = getWidth();
        m4658s(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(int i10) {
        Context context = getContext();
        Object obj = C7472a.f41322a;
        setPageMarginDrawable(C7472a.c.m14849b(context, i10));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f7637H = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        if (this.f7683s0 == i10) {
            return;
        }
        this.f7683s0 = i10;
        InterfaceC1209i interfaceC1209i = this.f7680p0;
        if (interfaceC1209i != null) {
            interfaceC1209i.mo4664b(i10);
        }
        ArrayList arrayList = this.f7679o0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                InterfaceC1209i interfaceC1209i2 = (InterfaceC1209i) this.f7679o0.get(i11);
                if (interfaceC1209i2 != null) {
                    interfaceC1209i2.mo4664b(i10);
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m4659t() {
        this.f7660d0 = -1;
        this.f7647R = false;
        this.f7648S = false;
        VelocityTracker velocityTracker = this.f7662e0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f7662e0 = null;
        }
        this.f7672j0.onRelease();
        this.f7674k0.onRelease();
        if (!this.f7672j0.isFinished() && !this.f7674k0.isFinished()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    public final void m4660u(int i10, int i11, boolean z10, boolean z11) {
        int iMax;
        int scrollX;
        int iAbs;
        C1205e c1205eM4650k = m4650k(i10);
        if (c1205eM4650k != null) {
            iMax = (int) (Math.max(this.f7640K, Math.min(c1205eM4650k.f7692e, this.f7641L)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (z10) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.f7669i;
                if ((scroller == null || scroller.isFinished()) ? false : true) {
                    scrollX = this.f7671j ? this.f7669i.getCurrX() : this.f7669i.getStartX();
                    this.f7669i.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    scrollX = getScrollX();
                }
                int i12 = scrollX;
                int scrollY = getScrollY();
                int i13 = iMax - i12;
                int i14 = 0 - scrollY;
                if (i13 == 0 && i14 == 0) {
                    m4644e(false);
                    m4656q();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    float f3 = clientWidth;
                    float f10 = clientWidth / 2;
                    float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i13) * 1.0f) / f3) - 0.5f) * 0.47123894f)) * f10) + f10;
                    int iAbs2 = Math.abs(i11);
                    if (iAbs2 > 0) {
                        iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                    } else {
                        this.f7661e.getClass();
                        iAbs = (int) (((Math.abs(i13) / ((f3 * 1.0f) + this.f7675l)) + 1.0f) * 100.0f);
                    }
                    int iMin = Math.min(iAbs, 600);
                    this.f7671j = false;
                    this.f7669i.startScroll(i12, scrollY, i13, i14, iMin);
                    WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                    C10029b0.d.m18674k(this);
                }
            }
            if (z11) {
                m4646g(i10);
            }
        } else {
            if (z11) {
                m4646g(i10);
            }
            m4644e(false);
            scrollTo(iMax, 0);
            m4654o(iMax);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m4661v(int i10, int i11, boolean z10, boolean z11) {
        AbstractC10290a abstractC10290a = this.f7661e;
        if (abstractC10290a == null || abstractC10290a.mo17877c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList<C1205e> arrayList = this.f7655b;
        if (!z11 && this.f7663f == i10 && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 >= this.f7661e.mo17877c()) {
            i10 = this.f7661e.mo17877c() - 1;
        }
        int i12 = this.f7646Q;
        int i13 = this.f7663f;
        if (i10 > i13 + i12 || i10 < i13 - i12) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                arrayList.get(i14).f7690c = true;
            }
        }
        boolean z12 = this.f7663f != i10;
        if (!this.f7676l0) {
            m4657r(i10);
            m4660u(i10, i11, z10, z12);
        } else {
            this.f7663f = i10;
            if (z12) {
                m4646g(i10);
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f7637H;
    }
}
