package com.google.android.material.appbar;

import ae.C0062b;
import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.AppBarLayout;
import com.linguist.R;
import gd.C5768g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import md.C7542a;
import p072dd.C5150c;
import p104f.C5452a;
import p153hc.C6031a;
import p177ic.C6308a;
import p198jc.AbstractC6451f;
import p198jc.AbstractC6452g;
import p198jc.C6448c;
import p198jc.C6454i;
import p198jc.C6455j;
import p326q.C8452h;
import p329q2.C8488a;
import p338qd.C8573r0;
import p471x2.C10026a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p471x2.C10063s0;
import p471x2.InterfaceC10050m;
import p497y2.C10284f;
import p507yc.C10344k;
import p531zc.C10477a;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.InterfaceC0767b {

    /* JADX INFO: renamed from: T */
    public static final /* synthetic */ int f14661T = 0;

    /* JADX INFO: renamed from: H */
    public int f14662H;

    /* JADX INFO: renamed from: I */
    public WeakReference<View> f14663I;

    /* JADX INFO: renamed from: J */
    public final ColorStateList f14664J;

    /* JADX INFO: renamed from: K */
    public ValueAnimator f14665K;

    /* JADX INFO: renamed from: L */
    public ValueAnimator.AnimatorUpdateListener f14666L;

    /* JADX INFO: renamed from: M */
    public final ArrayList f14667M;

    /* JADX INFO: renamed from: N */
    public final long f14668N;

    /* JADX INFO: renamed from: O */
    public final TimeInterpolator f14669O;

    /* JADX INFO: renamed from: P */
    public int[] f14670P;

    /* JADX INFO: renamed from: Q */
    public Drawable f14671Q;

    /* JADX INFO: renamed from: R */
    public final float f14672R;

    /* JADX INFO: renamed from: S */
    public Behavior f14673S;

    /* JADX INFO: renamed from: a */
    public int f14674a;

    /* JADX INFO: renamed from: b */
    public int f14675b;

    /* JADX INFO: renamed from: c */
    public int f14676c;

    /* JADX INFO: renamed from: d */
    public int f14677d;

    /* JADX INFO: renamed from: e */
    public boolean f14678e;

    /* JADX INFO: renamed from: f */
    public int f14679f;

    /* JADX INFO: renamed from: g */
    public C10063s0 f14680g;

    /* JADX INFO: renamed from: h */
    public ArrayList f14681h;

    /* JADX INFO: renamed from: i */
    public boolean f14682i;

    /* JADX INFO: renamed from: j */
    public boolean f14683j;

    /* JADX INFO: renamed from: k */
    public boolean f14684k;

    /* JADX INFO: renamed from: l */
    public boolean f14685l;

    public static class BaseBehavior<T extends AppBarLayout> extends AbstractC6451f<T> {

        /* JADX INFO: renamed from: j */
        public int f14686j;

        /* JADX INFO: renamed from: k */
        public int f14687k;

        /* JADX INFO: renamed from: l */
        public ValueAnimator f14688l;

        /* JADX INFO: renamed from: m */
        public SavedState f14689m;

        /* JADX INFO: renamed from: n */
        public WeakReference<View> f14690n;

        /* JADX INFO: renamed from: o */
        public AbstractC2936b f14691o;

        /* JADX INFO: renamed from: p */
        public boolean f14692p;

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new C2934a();

            /* JADX INFO: renamed from: c */
            public boolean f14693c;

            /* JADX INFO: renamed from: d */
            public boolean f14694d;

            /* JADX INFO: renamed from: e */
            public int f14695e;

            /* JADX INFO: renamed from: f */
            public float f14696f;

            /* JADX INFO: renamed from: g */
            public boolean f14697g;

            /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$a */
            public class C2934a implements Parcelable.ClassLoaderCreator<SavedState> {
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
                boolean z10 = true;
                this.f14693c = parcel.readByte() != 0;
                this.f14694d = parcel.readByte() != 0;
                this.f14695e = parcel.readInt();
                this.f14696f = parcel.readFloat();
                this.f14697g = parcel.readByte() == 0 ? false : z10;
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                parcel.writeParcelable(this.f5635a, i10);
                parcel.writeByte(this.f14693c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f14694d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f14695e);
                parcel.writeFloat(this.f14696f);
                parcel.writeByte(this.f14697g ? (byte) 1 : (byte) 0);
            }
        }

        /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        public class C2935a extends C10026a {
            public C2935a() {
            }

            @Override // p471x2.C10026a
            /* JADX INFO: renamed from: d */
            public final void mo2999d(View view, C10284f c10284f) {
                this.f50989a.onInitializeAccessibilityNodeInfo(view, c10284f.f51739a);
                c10284f.m19268m(BaseBehavior.this.f14692p);
                c10284f.m19264i(ScrollView.class.getName());
            }
        }

        /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        public static abstract class AbstractC2936b<T extends AppBarLayout> {
            /* JADX INFO: renamed from: a */
            public abstract void mo8564a(AppBarLayout appBarLayout);
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX INFO: renamed from: C */
        public static void m8550C(KeyEvent keyEvent, View view, AppBarLayout appBarLayout) {
            if (keyEvent.getAction() == 0 || keyEvent.getAction() == 1) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 19 && keyCode != 280 && keyCode != 92) {
                    if ((keyCode == 20 || keyCode == 281 || keyCode == 93) && view.getScrollY() > 0) {
                        appBarLayout.setExpanded(false);
                        return;
                    }
                    return;
                }
                if (view.getScrollY() < ((double) view.getMeasuredHeight()) * 0.1d) {
                    appBarLayout.setExpanded(true);
                }
            }
        }

        /* JADX INFO: renamed from: D */
        public static View m8551D(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof InterfaceC10050m) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0075  */
        /* JADX INFO: renamed from: I */
        public static void m8552I(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, boolean z10) {
            View childAt;
            boolean zM8547f;
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            boolean z11 = false;
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i12);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i12++;
                }
            }
            if (childAt != null) {
                int i13 = ((C2941d) childAt.getLayoutParams()).f14701a;
                if ((i13 & 1) != 0) {
                    WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                    int iM18667d = C10029b0.d.m18667d(childAt);
                    if (i11 <= 0 || (i13 & 12) == 0) {
                        if ((i13 & 2) == 0 || (-i10) < (childAt.getBottom() - iM18667d) - appBarLayout.getTopInset()) {
                            zM8547f = false;
                        } else {
                            zM8547f = true;
                        }
                    } else if ((-i10) >= (childAt.getBottom() - iM18667d) - appBarLayout.getTopInset()) {
                        zM8547f = true;
                    } else {
                        zM8547f = false;
                    }
                } else {
                    zM8547f = false;
                }
            } else {
                zM8547f = false;
            }
            if (appBarLayout.f14685l) {
                zM8547f = appBarLayout.m8547f(m8551D(coordinatorLayout));
            }
            boolean zM8546e = appBarLayout.m8546e(zM8547f);
            if (!z10) {
                if (!zM8546e) {
                    return;
                }
                List list = (List) ((C8452h) coordinatorLayout.f5536b.f8004b).getOrDefault(appBarLayout, null);
                ArrayList arrayList = coordinatorLayout.f5538d;
                arrayList.clear();
                if (list != null) {
                    arrayList.addAll(list);
                }
                int size = arrayList.size();
                for (int i14 = 0; i14 < size; i14++) {
                    CoordinatorLayout.AbstractC0768c abstractC0768c = ((CoordinatorLayout.C0771f) ((View) arrayList.get(i14)).getLayoutParams()).f5550a;
                    if (abstractC0768c instanceof ScrollingViewBehavior) {
                        if (((ScrollingViewBehavior) abstractC0768c).f37018f == 0) {
                            break;
                        }
                        z11 = true;
                        break;
                    }
                }
                if (!z11) {
                    return;
                }
            }
            appBarLayout.jumpDrawablesToCurrentState();
        }

        /* JADX INFO: renamed from: B */
        public final void m8553B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(mo8558t() - i10);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iMo8558t = mo8558t();
            if (iMo8558t == i10) {
                ValueAnimator valueAnimator = this.f14688l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f14688l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f14688l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f14688l = valueAnimator3;
                valueAnimator3.setInterpolator(C6308a.f36527e);
                this.f14688l.addUpdateListener(new C2943a(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f14688l.setDuration(Math.min(iRound, 600));
            this.f14688l.setIntValues(iMo8558t, i10);
            this.f14688l.start();
        }

        /* JADX INFO: renamed from: E */
        public final void m8554E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int[] iArr) {
            int i11;
            int downNestedPreScrollRange;
            if (i10 != 0) {
                if (i10 < 0) {
                    i11 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i11;
                } else {
                    i11 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i12 = i11;
                int i13 = downNestedPreScrollRange;
                if (i12 != i13) {
                    iArr[1] = mo8563z(coordinatorLayout, appBarLayout, mo8558t() - i10, i12, i13);
                }
            }
            if (appBarLayout.f14685l) {
                appBarLayout.m8546e(appBarLayout.m8547f(view));
            }
        }

        /* JADX INFO: renamed from: F */
        public final SavedState m8555F(Parcelable parcelable, T t10) {
            int iM13071s = m13071s();
            int childCount = t10.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = t10.getChildAt(i10);
                int bottom = childAt.getBottom() + iM13071s;
                if (childAt.getTop() + iM13071s <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f5634b;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z10 = iM13071s == 0;
                    savedState.f14694d = z10;
                    savedState.f14693c = !z10 && (-iM13071s) >= t10.getTotalScrollRange();
                    savedState.f14695e = i10;
                    WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                    savedState.f14697g = bottom == t10.getTopInset() + C10029b0.d.m18667d(childAt);
                    savedState.f14696f = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: G */
        public final void m8556G(CoordinatorLayout coordinatorLayout, T t10) {
            int paddingTop = t10.getPaddingTop() + t10.getTopInset();
            int iMo8558t = mo8558t() - paddingTop;
            int childCount = t10.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    i10 = -1;
                    break;
                }
                View childAt = t10.getChildAt(i10);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C2941d c2941d = (C2941d) childAt.getLayoutParams();
                if ((c2941d.f14701a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) c2941d).topMargin;
                    bottom += ((LinearLayout.LayoutParams) c2941d).bottomMargin;
                }
                int i11 = -iMo8558t;
                if (top <= i11 && bottom >= i11) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 >= 0) {
                View childAt2 = t10.getChildAt(i10);
                C2941d c2941d2 = (C2941d) childAt2.getLayoutParams();
                int i12 = c2941d2.f14701a;
                if ((i12 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int iM18667d = -childAt2.getBottom();
                    if (i10 == 0) {
                        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                        if (C10029b0.d.m18665b(t10) && C10029b0.d.m18665b(childAt2)) {
                            topInset -= t10.getTopInset();
                        }
                    }
                    if ((i12 & 2) == 2) {
                        WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
                        iM18667d += C10029b0.d.m18667d(childAt2);
                    } else {
                        if ((i12 & 5) == 5) {
                            WeakHashMap<View, C10049l0> weakHashMap3 = C10029b0.f50993a;
                            int iM18667d2 = C10029b0.d.m18667d(childAt2) + iM18667d;
                            if (iMo8558t < iM18667d2) {
                                topInset = iM18667d2;
                            } else {
                                iM18667d = iM18667d2;
                            }
                        }
                    }
                    if ((i12 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) c2941d2).topMargin;
                        iM18667d -= ((LinearLayout.LayoutParams) c2941d2).bottomMargin;
                    }
                    if (iMo8558t < (iM18667d + topInset) / 2) {
                        topInset = iM18667d;
                    }
                    m8553B(coordinatorLayout, t10, C8573r0.m16699T(topInset + paddingTop, -t10.getTotalScrollRange(), 0));
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00d6  */
        /* JADX INFO: renamed from: H */
        public final void m8557H(CoordinatorLayout coordinatorLayout, T t10) {
            View childAt;
            boolean z10;
            boolean z11;
            C10029b0.m18655k(coordinatorLayout, C10284f.a.f51745h.m19273a());
            boolean z12 = false;
            C10029b0.m18652h(coordinatorLayout, 0);
            C10029b0.m18655k(coordinatorLayout, C10284f.a.f51746i.m19273a());
            C10029b0.m18652h(coordinatorLayout, 0);
            if (t10.getTotalScrollRange() == 0) {
                return;
            }
            int childCount = coordinatorLayout.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.C0771f) childAt.getLayoutParams()).f5550a instanceof ScrollingViewBehavior) {
                    break;
                } else {
                    i10++;
                }
            }
            View view = childAt;
            if (view == null) {
                return;
            }
            int childCount2 = t10.getChildCount();
            int i11 = 0;
            while (true) {
                z10 = true;
                if (i11 >= childCount2) {
                    z11 = false;
                    break;
                } else {
                    if (((C2941d) t10.getChildAt(i11).getLayoutParams()).f14701a != 0) {
                        z11 = true;
                        break;
                    }
                    i11++;
                }
            }
            if (z11) {
                if (!(C10029b0.m18648d(coordinatorLayout) != null)) {
                    C10029b0.m18658n(coordinatorLayout, new C2935a());
                }
                if (mo8558t() != (-t10.getTotalScrollRange())) {
                    C10029b0.m18656l(coordinatorLayout, C10284f.a.f51745h, new C2945c(t10, false));
                    z12 = true;
                }
                if (mo8558t() == 0) {
                    z10 = z12;
                } else if (view.canScrollVertically(-1)) {
                    int i12 = -t10.getDownNestedPreScrollRange();
                    if (i12 != 0) {
                        C10029b0.m18656l(coordinatorLayout, C10284f.a.f51746i, new C2944b(this, coordinatorLayout, t10, view, i12));
                    } else {
                        z10 = z12;
                    }
                } else {
                    C10029b0.m18656l(coordinatorLayout, C10284f.a.f51746i, new C2945c(t10, true));
                }
                this.f14692p = z10;
            }
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:46:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:47:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:48:0x0107  */
        /* JADX WARN: Type inference failed for: r8v12, types: [jc.d] */
        @Override // p198jc.C6453h, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
        /* JADX INFO: renamed from: h */
        public final boolean mo2942h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            final View viewM8551D;
            int iRound;
            final AppBarLayout appBarLayout = (AppBarLayout) view;
            super.mo2942h(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.f14689m;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z10) {
                            m8553B(coordinatorLayout, appBarLayout, i11);
                        } else {
                            m13069A(coordinatorLayout, appBarLayout, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            m8553B(coordinatorLayout, appBarLayout, 0);
                        } else {
                            m13069A(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.f14693c) {
                m13069A(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.f14694d) {
                m13069A(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.f14695e);
                int i12 = -childAt.getBottom();
                if (this.f14689m.f14697g) {
                    WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                    iRound = appBarLayout.getTopInset() + C10029b0.d.m18667d(childAt) + i12;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.f14689m.f14696f) + i12;
                }
                m13069A(coordinatorLayout, appBarLayout, iRound);
            }
            appBarLayout.f14679f = 0;
            this.f14689m = null;
            int iM16699T = C8573r0.m16699T(m13071s(), -appBarLayout.getTotalScrollRange(), 0);
            C6454i c6454i = this.f37019a;
            if (c6454i != null) {
                if (c6454i.f37024d != iM16699T) {
                    c6454i.f37024d = iM16699T;
                    c6454i.m13072a();
                }
                m8552I(coordinatorLayout, appBarLayout, m13071s(), 0, true);
                appBarLayout.m8544c(m13071s());
                m8557H(coordinatorLayout, appBarLayout);
                viewM8551D = m8551D(coordinatorLayout);
                if (viewM8551D == null) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        viewM8551D.addOnUnhandledKeyEventListener(new View.OnUnhandledKeyEventListener() { // from class: jc.d
                            @Override // android.view.View.OnUnhandledKeyEventListener
                            public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                                AppBarLayout.BaseBehavior baseBehavior = this.f36999a;
                                View view3 = viewM8551D;
                                AppBarLayout appBarLayout2 = appBarLayout;
                                baseBehavior.getClass();
                                AppBarLayout.BaseBehavior.m8550C(keyEvent, view3, appBarLayout2);
                                return false;
                            }
                        });
                    } else {
                        viewM8551D.setOnKeyListener(new View.OnKeyListener() { // from class: jc.e
                            @Override // android.view.View.OnKeyListener
                            public final boolean onKey(View view2, int i13, KeyEvent keyEvent) {
                                this.f37002a.getClass();
                                AppBarLayout.BaseBehavior.m8550C(keyEvent, viewM8551D, appBarLayout);
                                return false;
                            }
                        });
                    }
                }
                return true;
            }
            this.f37020b = iM16699T;
            m8552I(coordinatorLayout, appBarLayout, m13071s(), 0, true);
            appBarLayout.m8544c(m13071s());
            m8557H(coordinatorLayout, appBarLayout);
            viewM8551D = m8551D(coordinatorLayout);
            if (viewM8551D == null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    viewM8551D.addOnUnhandledKeyEventListener(new View.OnUnhandledKeyEventListener() { // from class: jc.d
                        @Override // android.view.View.OnUnhandledKeyEventListener
                        public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                            AppBarLayout.BaseBehavior baseBehavior = this.f36999a;
                            View view3 = viewM8551D;
                            AppBarLayout appBarLayout2 = appBarLayout;
                            baseBehavior.getClass();
                            AppBarLayout.BaseBehavior.m8550C(keyEvent, view3, appBarLayout2);
                            return false;
                        }
                    });
                } else {
                    viewM8551D.setOnKeyListener(new View.OnKeyListener() { // from class: jc.e
                        @Override // android.view.View.OnKeyListener
                        public final boolean onKey(View view2, int i13, KeyEvent keyEvent) {
                            this.f37002a.getClass();
                            AppBarLayout.BaseBehavior.m8550C(keyEvent, viewM8551D, appBarLayout);
                            return false;
                        }
                    });
                }
            }
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
        /* JADX INFO: renamed from: i */
        public final boolean mo2943i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z10 = false;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0771f) appBarLayout.getLayoutParams())).height == -2) {
                coordinatorLayout.m2929r(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0));
                z10 = true;
            }
            return z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
        /* JADX INFO: renamed from: k */
        public final /* bridge */ /* synthetic */ void mo2945k(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            m8554E(coordinatorLayout, (AppBarLayout) view, view2, i11, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
        /* JADX INFO: renamed from: l */
        public final void mo2946l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i12 < 0) {
                iArr[1] = mo8563z(coordinatorLayout, appBarLayout, mo8558t() - i12, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i12 == 0) {
                m8557H(coordinatorLayout, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
        /* JADX INFO: renamed from: n */
        public final void mo2948n(View view, Parcelable parcelable) {
            if (!(parcelable instanceof SavedState)) {
                this.f14689m = null;
            } else {
                SavedState savedState = this.f14689m;
                this.f14689m = (SavedState) parcelable;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
        /* JADX INFO: renamed from: o */
        public final Parcelable mo2949o(View view) {
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            SavedState savedStateM8555F = m8555F(absSavedState, (AppBarLayout) view);
            return savedStateM8555F == null ? absSavedState : savedStateM8555F;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0033  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
        /* JADX INFO: renamed from: p */
        public final boolean mo2950p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int i12 = i10 & 2;
            boolean z10 = false;
            if (i12 != 0) {
                if (appBarLayout.f14685l) {
                    z10 = true;
                } else {
                    if ((appBarLayout.getTotalScrollRange() != 0) && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()) {
                        z10 = true;
                    }
                }
            }
            if (z10 && (valueAnimator = this.f14688l) != null) {
                valueAnimator.cancel();
            }
            this.f14690n = null;
            this.f14687k = i11;
            return z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
        /* JADX INFO: renamed from: q */
        public final void mo2951q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f14687k == 0 || i10 == 1) {
                m8556G(coordinatorLayout, appBarLayout);
                if (appBarLayout.f14685l) {
                    appBarLayout.m8546e(appBarLayout.m8547f(view2));
                }
            }
            this.f14690n = new WeakReference<>(view2);
        }

        @Override // p198jc.C6453h
        /* JADX INFO: renamed from: t */
        public final int mo8558t() {
            return m13071s() + this.f14686j;
        }

        @Override // p198jc.AbstractC6451f
        /* JADX INFO: renamed from: v */
        public final boolean mo8559v(View view) {
            View view2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbstractC2936b abstractC2936b = this.f14691o;
            if (abstractC2936b != null) {
                abstractC2936b.mo8564a(appBarLayout);
                return false;
            }
            WeakReference<View> weakReference = this.f14690n;
            return weakReference == null || !((view2 = weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1));
        }

        @Override // p198jc.AbstractC6451f
        /* JADX INFO: renamed from: w */
        public final int mo8560w(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        @Override // p198jc.AbstractC6451f
        /* JADX INFO: renamed from: x */
        public final int mo8561x(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // p198jc.AbstractC6451f
        /* JADX INFO: renamed from: y */
        public final void mo8562y(View view, CoordinatorLayout coordinatorLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            m8556G(coordinatorLayout, appBarLayout);
            if (appBarLayout.f14685l) {
                appBarLayout.m8546e(appBarLayout.m8547f(m8551D(coordinatorLayout)));
            }
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:43:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:69:0x0160  */
        /* JADX WARN: Code duplicated, block: B:71:0x0170  */
        /* JADX WARN: Code duplicated, block: B:75:0x017f  */
        /* JADX WARN: Code duplicated, block: B:76:0x0182  */
        /* JADX WARN: Code duplicated, block: B:92:0x0173 A[SYNTHETIC] */
        @Override // p198jc.AbstractC6451f
        /* JADX INFO: renamed from: z */
        public final int mo8563z(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            int top;
            boolean z10;
            int i13;
            List list;
            int i14;
            View view2;
            CoordinatorLayout.AbstractC0768c abstractC0768c;
            int i15;
            C2940c c2940c;
            int topInset;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iMo8558t = mo8558t();
            int i16 = 0;
            if (i11 == 0 || iMo8558t < i11 || iMo8558t > i12) {
                this.f14686j = 0;
            } else {
                int iM16699T = C8573r0.m16699T(i10, i11, i12);
                if (iMo8558t != iM16699T) {
                    if (!appBarLayout.f14678e) {
                        top = iM16699T;
                        break;
                    }
                    int iAbs = Math.abs(iM16699T);
                    int childCount = appBarLayout.getChildCount();
                    int i17 = 0;
                    while (true) {
                        if (i17 < childCount) {
                            View childAt = appBarLayout.getChildAt(i17);
                            C2941d c2941d = (C2941d) childAt.getLayoutParams();
                            Interpolator interpolator = c2941d.f14703c;
                            if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                                i17++;
                            } else if (interpolator != null) {
                                int i18 = c2941d.f14701a;
                                if ((i18 & 1) != 0) {
                                    topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) c2941d).topMargin + ((LinearLayout.LayoutParams) c2941d).bottomMargin + 0;
                                    if ((i18 & 2) != 0) {
                                        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                                        topInset -= C10029b0.d.m18667d(childAt);
                                    }
                                } else {
                                    topInset = 0;
                                }
                                WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
                                if (C10029b0.d.m18665b(childAt)) {
                                    topInset -= appBarLayout.getTopInset();
                                }
                                if (topInset > 0) {
                                    float f3 = topInset;
                                    top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f3) * f3)) * Integer.signum(iM16699T);
                                    break;
                                }
                            }
                        }
                        top = iM16699T;
                        break;
                    }
                    C6454i c6454i = this.f37019a;
                    int i19 = 1;
                    if (c6454i != null) {
                        if (c6454i.f37024d != top) {
                            c6454i.f37024d = top;
                            c6454i.m13072a();
                            z10 = true;
                        }
                        int i20 = iMo8558t - iM16699T;
                        this.f14686j = iM16699T - top;
                        if (z10) {
                            i15 = 0;
                            while (i15 < appBarLayout.getChildCount()) {
                                C2941d c2941d2 = (C2941d) appBarLayout.getChildAt(i15).getLayoutParams();
                                c2940c = c2941d2.f14702b;
                                if (c2940c == null && (c2941d2.f14701a & i19) != 0) {
                                    View childAt2 = appBarLayout.getChildAt(i15);
                                    float fM13071s = m13071s();
                                    Rect rect = c2940c.f14699a;
                                    childAt2.getDrawingRect(rect);
                                    appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                    rect.offset(0, -appBarLayout.getTopInset());
                                    float fAbs = rect.top - Math.abs(fM13071s);
                                    if (fAbs <= 0.0f) {
                                        float fAbs2 = Math.abs(fAbs / rect.height());
                                        float f10 = 1.0f - (fAbs2 >= 0.0f ? fAbs2 > 1.0f ? 1.0f : fAbs2 : 0.0f);
                                        float fHeight = (-fAbs) - ((rect.height() * 0.3f) * (1.0f - (f10 * f10)));
                                        childAt2.setTranslationY(fHeight);
                                        Rect rect2 = c2940c.f14700b;
                                        childAt2.getDrawingRect(rect2);
                                        rect2.offset(0, (int) (-fHeight));
                                        WeakHashMap<View, C10049l0> weakHashMap3 = C10029b0.f50993a;
                                        C10029b0.f.m18696c(childAt2, rect2);
                                    } else {
                                        WeakHashMap<View, C10049l0> weakHashMap4 = C10029b0.f50993a;
                                        C10029b0.f.m18696c(childAt2, null);
                                        childAt2.setTranslationY(0.0f);
                                    }
                                }
                                i15++;
                                i19 = 1;
                            }
                        }
                        if (!z10 && appBarLayout.f14678e && (list = (List) ((C8452h) coordinatorLayout.f5536b.f8004b).getOrDefault(appBarLayout, null)) != null && !list.isEmpty()) {
                            for (i14 = 0; i14 < list.size(); i14++) {
                                view2 = (View) list.get(i14);
                                abstractC0768c = ((CoordinatorLayout.C0771f) view2.getLayoutParams()).f5550a;
                                if (abstractC0768c != null) {
                                    abstractC0768c.mo2938d(coordinatorLayout, view2, appBarLayout);
                                }
                            }
                        }
                        appBarLayout.m8544c(m13071s());
                        if (iM16699T < iMo8558t) {
                            i13 = -1;
                        } else {
                            i13 = 1;
                        }
                        m8552I(coordinatorLayout, appBarLayout, iM16699T, i13, false);
                        i16 = i20;
                    } else {
                        this.f37020b = top;
                    }
                    z10 = false;
                    int i21 = iMo8558t - iM16699T;
                    this.f14686j = iM16699T - top;
                    if (z10) {
                        i15 = 0;
                        while (i15 < appBarLayout.getChildCount()) {
                            C2941d c2941d3 = (C2941d) appBarLayout.getChildAt(i15).getLayoutParams();
                            c2940c = c2941d3.f14702b;
                            if (c2940c == null) {
                            }
                            i15++;
                            i19 = 1;
                        }
                    }
                    if (!z10) {
                        while (i14 < list.size()) {
                            view2 = (View) list.get(i14);
                            abstractC0768c = ((CoordinatorLayout.C0771f) view2.getLayoutParams()).f5550a;
                            if (abstractC0768c != null) {
                                abstractC0768c.mo2938d(coordinatorLayout, view2, appBarLayout);
                            }
                        }
                    }
                    appBarLayout.m8544c(m13071s());
                    if (iM16699T < iMo8558t) {
                        i13 = -1;
                    } else {
                        i13 = 1;
                    }
                    m8552I(coordinatorLayout, appBarLayout, iM16699T, i13, false);
                    i16 = i21;
                }
            }
            m8557H(coordinatorLayout, appBarLayout);
            return i16;
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$Behavior$a */
        public static abstract class AbstractC2937a extends BaseBehavior.AbstractC2936b<AppBarLayout> {
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends AbstractC6452g {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6031a.f35638G);
            this.f37018f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
        /* JADX INFO: renamed from: b */
        public final boolean mo2936b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
        /* JADX INFO: renamed from: d */
        public boolean mo2938d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int iM16699T;
            CoordinatorLayout.AbstractC0768c abstractC0768c = ((CoordinatorLayout.C0771f) view2.getLayoutParams()).f5550a;
            if (abstractC0768c instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) abstractC0768c).f14686j + this.f37017e;
                if (this.f37018f == 0) {
                    iM16699T = 0;
                } else {
                    float fMo8566w = mo8566w(view2);
                    int i10 = this.f37018f;
                    iM16699T = C8573r0.m16699T((int) (fMo8566w * i10), 0, i10);
                }
                int i11 = bottom - iM16699T;
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                view.offsetTopAndBottom(i11);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f14685l) {
                    appBarLayout.m8546e(appBarLayout.m8547f(view));
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
        /* JADX INFO: renamed from: e */
        public final void mo2939e(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                C10029b0.m18655k(coordinatorLayout, C10284f.a.f51745h.m19273a());
                C10029b0.m18652h(coordinatorLayout, 0);
                C10029b0.m18655k(coordinatorLayout, C10284f.a.f51746i.m19273a());
                C10029b0.m18652h(coordinatorLayout, 0);
                C10029b0.m18658n(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
        /* JADX INFO: renamed from: m */
        public final boolean mo2947m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout appBarLayout;
            ArrayList arrayListM2923d = coordinatorLayout.m2923d(view);
            int size = arrayListM2923d.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = (View) arrayListM2923d.get(i10);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i10++;
            }
            if (appBarLayout != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f37015c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayout.m8545d(false, !z10, true);
                    return true;
                }
            }
            return false;
        }

        @Override // p198jc.AbstractC6452g
        /* JADX INFO: renamed from: v */
        public final AppBarLayout mo8565v(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) arrayList.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // p198jc.AbstractC6452g
        /* JADX INFO: renamed from: w */
        public final float mo8566w(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.AbstractC0768c abstractC0768c = ((CoordinatorLayout.C0771f) appBarLayout.getLayoutParams()).f5550a;
                int iMo8558t = abstractC0768c instanceof BaseBehavior ? ((BaseBehavior) abstractC0768c).mo8558t() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iMo8558t > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iMo8558t / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // p198jc.AbstractC6452g
        /* JADX INFO: renamed from: x */
        public final int mo8567x(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$a */
    public interface InterfaceC2938a<T extends AppBarLayout> {
        /* JADX INFO: renamed from: a */
        void mo8568a(T t10, int i10);
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$b */
    public static abstract class AbstractC2939b {
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public static class C2940c extends AbstractC2939b {

        /* JADX INFO: renamed from: a */
        public final Rect f14699a = new Rect();

        /* JADX INFO: renamed from: b */
        public final Rect f14700b = new Rect();
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$d */
    public static class C2941d extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a */
        public int f14701a;

        /* JADX INFO: renamed from: b */
        public C2940c f14702b;

        /* JADX INFO: renamed from: c */
        public final Interpolator f14703c;

        public C2941d() {
            super(-1, -2);
            this.f14701a = 1;
        }

        public C2941d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f14701a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6031a.f35652b);
            this.f14701a = typedArrayObtainStyledAttributes.getInt(1, 0);
            this.f14702b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new C2940c();
            if (typedArrayObtainStyledAttributes.hasValue(2)) {
                this.f14703c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public C2941d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f14701a = 1;
        }

        public C2941d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f14701a = 1;
        }

        public C2941d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f14701a = 1;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$e */
    public interface InterfaceC2942e {
        /* JADX INFO: renamed from: a */
        void m8569a();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(C7542a.m15048a(context, attributeSet, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout), attributeSet, R.attr.appBarLayoutStyle);
        this.f14675b = -1;
        this.f14676c = -1;
        this.f14677d = -1;
        this.f14679f = 0;
        this.f14667M = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayM19357d = C10344k.m19357d(context3, attributeSet, C6455j.f37025a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayM19357d.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayM19357d.getResourceId(0, 0)));
            }
            typedArrayM19357d.recycle();
            TypedArray typedArrayM19357d2 = C10344k.m19357d(context2, attributeSet, C6031a.f35651a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
            Drawable drawable = typedArrayM19357d2.getDrawable(0);
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.d.m18680q(this, drawable);
            ColorStateList colorStateListM10925a = C5150c.m10925a(context2, typedArrayM19357d2, 6);
            this.f14664J = colorStateListM10925a;
            if (getBackground() instanceof ColorDrawable) {
                ColorDrawable colorDrawable = (ColorDrawable) getBackground();
                final C5768g c5768g = new C5768g();
                c5768g.m12141m(ColorStateList.valueOf(colorDrawable.getColor()));
                if (colorStateListM10925a != null) {
                    c5768g.setAlpha(this.f14684k ? 255 : 0);
                    c5768g.m12141m(colorStateListM10925a);
                    this.f14666L = new ValueAnimator.AnimatorUpdateListener() { // from class: jc.a
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int i10 = AppBarLayout.f14661T;
                            AppBarLayout appBarLayout = this.f36994a;
                            appBarLayout.getClass();
                            int iFloatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            C5768g c5768g2 = c5768g;
                            c5768g2.setAlpha(iFloatValue);
                            for (AppBarLayout.InterfaceC2942e interfaceC2942e : appBarLayout.f14667M) {
                                ColorStateList colorStateList = c5768g2.f34857a.f34872c;
                                if (colorStateList != null) {
                                    colorStateList.withAlpha(iFloatValue).getDefaultColor();
                                    interfaceC2942e.m8569a();
                                }
                            }
                        }
                    };
                } else {
                    c5768g.m12138j(context2);
                    this.f14666L = new ValueAnimator.AnimatorUpdateListener() { // from class: jc.b
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int i10 = AppBarLayout.f14661T;
                            AppBarLayout appBarLayout = this.f36996a;
                            appBarLayout.getClass();
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            c5768g.m12140l(fFloatValue);
                            Drawable drawable2 = appBarLayout.f14671Q;
                            if (drawable2 instanceof C5768g) {
                                ((C5768g) drawable2).m12140l(fFloatValue);
                            }
                            Iterator it = appBarLayout.f14667M.iterator();
                            while (it.hasNext()) {
                                ((AppBarLayout.InterfaceC2942e) it.next()).m8569a();
                            }
                        }
                    };
                }
                C10029b0.d.m18680q(this, c5768g);
            }
            this.f14668N = C10477a.m19428c(R.attr.motionDurationMedium2, context2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f14669O = C10477a.m19429d(context2, R.attr.motionEasingStandardInterpolator, C6308a.f36523a);
            if (typedArrayM19357d2.hasValue(4)) {
                m8545d(typedArrayM19357d2.getBoolean(4, false), false, false);
            }
            if (typedArrayM19357d2.hasValue(3)) {
                C6455j.m13073a(this, typedArrayM19357d2.getDimensionPixelSize(3, 0));
            }
            if (typedArrayM19357d2.hasValue(2)) {
                setKeyboardNavigationCluster(typedArrayM19357d2.getBoolean(2, false));
            }
            if (typedArrayM19357d2.hasValue(1)) {
                setTouchscreenBlocksFocus(typedArrayM19357d2.getBoolean(1, false));
            }
            this.f14672R = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.f14685l = typedArrayM19357d2.getBoolean(5, false);
            this.f14662H = typedArrayM19357d2.getResourceId(7, -1);
            setStatusBarForeground(typedArrayM19357d2.getDrawable(8));
            typedArrayM19357d2.recycle();
            C10029b0.i.m18727u(this, new C6448c(this));
        } finally {
            typedArrayM19357d.recycle();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C2941d m8542a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new C2941d((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2941d((ViewGroup.MarginLayoutParams) layoutParams) : new C2941d(layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public final void m8543b() {
        Behavior behavior = this.f14673S;
        BaseBehavior.SavedState savedStateM8555F = (behavior == null || this.f14675b == -1 || this.f14679f != 0) ? null : behavior.m8555F(AbsSavedState.f5634b, this);
        this.f14675b = -1;
        this.f14676c = -1;
        this.f14677d = -1;
        if (savedStateM8555F != null) {
            Behavior behavior2 = this.f14673S;
            if (behavior2.f14689m != null) {
                return;
            }
            behavior2.f14689m = savedStateM8555F;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8544c(int i10) {
        this.f14674a = i10;
        if (!willNotDraw()) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.d.m18674k(this);
        }
        ArrayList arrayList = this.f14681h;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                InterfaceC2938a interfaceC2938a = (InterfaceC2938a) this.f14681h.get(i11);
                if (interfaceC2938a != null) {
                    interfaceC2938a.mo8568a(this, i10);
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2941d;
    }

    /* JADX INFO: renamed from: d */
    public final void m8545d(boolean z10, boolean z11, boolean z12) {
        this.f14679f = (z10 ? 1 : 2) | (z11 ? 4 : 0) | (z12 ? 8 : 0);
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f14671Q != null && getTopInset() > 0) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f14674a);
            this.f14671Q.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f14671Q;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m8546e(boolean z10) {
        if (!(!this.f14682i) || this.f14684k == z10) {
            return false;
        }
        this.f14684k = z10;
        refreshDrawableState();
        if (!this.f14685l || !(getBackground() instanceof C5768g)) {
            return true;
        }
        if (this.f14664J != null) {
            m8549h(z10 ? 0.0f : 255.0f, z10 ? 255.0f : 0.0f);
            return true;
        }
        float f3 = this.f14672R;
        m8549h(z10 ? 0.0f : f3, z10 ? f3 : 0.0f);
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m8547f(View view) {
        int i10;
        if (this.f14663I == null && (i10 = this.f14662H) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i10) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f14662H);
            }
            if (viewFindViewById != null) {
                this.f14663I = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.f14663I;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m8548g() {
        boolean z10 = false;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8) {
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                if (!C10029b0.d.m18665b(childAt)) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2941d();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new C2941d();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2941d(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m8542a(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2941d(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m8542a(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0767b
    public CoordinatorLayout.AbstractC0768c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f14673S = behavior;
        return behavior;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    public int getDownNestedPreScrollRange() {
        int iMin;
        int iM18667d;
        int i10 = this.f14676c;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                C2941d c2941d = (C2941d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = c2941d.f14701a;
                if ((i12 & 5) != 5) {
                    if (i11 > 0) {
                        break;
                    }
                } else {
                    int i13 = ((LinearLayout.LayoutParams) c2941d).topMargin + ((LinearLayout.LayoutParams) c2941d).bottomMargin;
                    if ((i12 & 8) != 0) {
                        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                        iM18667d = C10029b0.d.m18667d(childAt);
                    } else {
                        if ((i12 & 2) != 0) {
                            WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
                            iM18667d = measuredHeight - C10029b0.d.m18667d(childAt);
                        } else {
                            iMin = i13 + measuredHeight;
                        }
                        if (childCount == 0) {
                            WeakHashMap<View, C10049l0> weakHashMap3 = C10029b0.f50993a;
                            if (C10029b0.d.m18665b(childAt)) {
                                iMin = Math.min(iMin, measuredHeight - getTopInset());
                            }
                        }
                        i11 += iMin;
                    }
                    iMin = iM18667d + i13;
                    if (childCount == 0) {
                        WeakHashMap<View, C10049l0> weakHashMap4 = C10029b0.f50993a;
                        if (C10029b0.d.m18665b(childAt)) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                    }
                    i11 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i11);
        this.f14676c = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i10 = this.f14677d;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int iM18667d = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C2941d c2941d = (C2941d) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) c2941d).topMargin + ((LinearLayout.LayoutParams) c2941d).bottomMargin + childAt.getMeasuredHeight();
                int i12 = c2941d.f14701a;
                if ((i12 & 1) == 0) {
                    break;
                }
                iM18667d += measuredHeight;
                if ((i12 & 2) != 0) {
                    WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                    iM18667d -= C10029b0.d.m18667d(childAt);
                }
                int iMax = Math.max(0, iM18667d);
                this.f14677d = iMax;
                return iMax;
            }
        }
        int iMax2 = Math.max(0, iM18667d);
        this.f14677d = iMax2;
        return iMax2;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f14662H;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        int iM18667d = C10029b0.d.m18667d(this);
        if (iM18667d == 0) {
            int childCount = getChildCount();
            iM18667d = childCount >= 1 ? C10029b0.d.m18667d(getChildAt(childCount - 1)) : 0;
            if (iM18667d == 0) {
                return getHeight() / 3;
            }
        }
        return (iM18667d * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f14679f;
    }

    public Drawable getStatusBarForeground() {
        return this.f14671Q;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        C10063s0 c10063s0 = this.f14680g;
        if (c10063s0 != null) {
            return c10063s0.m18868e();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f14675b;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int iM18667d = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C2941d c2941d = (C2941d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = c2941d.f14701a;
                if ((i12 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) c2941d).topMargin + ((LinearLayout.LayoutParams) c2941d).bottomMargin + iM18667d;
                if (i11 == 0) {
                    WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                    if (C10029b0.d.m18665b(childAt)) {
                        topInset -= getTopInset();
                    }
                }
                iM18667d = topInset;
                if ((i12 & 2) != 0) {
                    WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
                    iM18667d -= C10029b0.d.m18667d(childAt);
                    break;
                }
            }
        }
        int iMax = Math.max(0, iM18667d);
        this.f14675b = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* JADX INFO: renamed from: h */
    public final void m8549h(float f3, float f10) {
        ValueAnimator valueAnimator = this.f14665K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f3, f10);
        this.f14665K = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f14668N);
        this.f14665K.setInterpolator(this.f14669O);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f14666L;
        if (animatorUpdateListener != null) {
            this.f14665K.addUpdateListener(animatorUpdateListener);
        }
        this.f14665K.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0062b.m335b2(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        if (this.f14670P == null) {
            this.f14670P = new int[4];
        }
        int[] iArr = this.f14670P;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f14683j;
        iArr[0] = z10 ? R.attr.state_liftable : -2130969795;
        iArr[1] = (z10 && this.f14684k) ? R.attr.state_lifted : -2130969796;
        iArr[2] = z10 ? R.attr.state_collapsible : -2130969791;
        iArr[3] = (z10 && this.f14684k) ? R.attr.state_collapsed : -2130969790;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f14663I;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f14663I = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        super.onLayout(z10, i10, i11, i12, i13);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        boolean z12 = true;
        if (C10029b0.d.m18665b(this) && m8548g()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        m8543b();
        this.f14678e = false;
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            if (((C2941d) getChildAt(i14).getLayoutParams()).f14703c != null) {
                this.f14678e = true;
                break;
            }
        }
        Drawable drawable = this.f14671Q;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f14682i) {
            if (!this.f14685l) {
                int childCount3 = getChildCount();
                int i15 = 0;
                while (true) {
                    if (i15 >= childCount3) {
                        z11 = false;
                        break;
                    }
                    int i16 = ((C2941d) getChildAt(i15).getLayoutParams()).f14701a;
                    if ((i16 & 1) == 1 && (i16 & 10) != 0) {
                        z11 = true;
                        break;
                    }
                    i15++;
                }
                if (!z11) {
                    z12 = false;
                }
            }
            if (this.f14683j != z12) {
                this.f14683j = z12;
                refreshDrawableState();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            if (C10029b0.d.m18665b(this) && m8548g()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = C8573r0.m16699T(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i11));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        m8543b();
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        C0062b.m332a2(this, f3);
    }

    public void setExpanded(boolean z10) {
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        m8545d(z10, C10029b0.g.m18699c(this), true);
    }

    public void setLiftOnScroll(boolean z10) {
        this.f14685l = z10;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f14662H = -1;
        if (view != null) {
            this.f14663I = new WeakReference<>(view);
            return;
        }
        WeakReference<View> weakReference = this.f14663I;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f14663I = null;
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f14662H = i10;
        WeakReference<View> weakReference = this.f14663I;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f14663I = null;
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f14682i = z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f14671Q;
        if (drawable2 != drawable) {
            Drawable drawableMutate = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawableMutate = drawable.mutate();
            }
            this.f14671Q = drawableMutate;
            boolean z10 = false;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f14671Q.setState(getDrawableState());
                }
                Drawable drawable3 = this.f14671Q;
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                C8488a.c.m16573b(drawable3, C10029b0.e.m18686d(this));
                this.f14671Q.setVisible(getVisibility() == 0, false);
                this.f14671Q.setCallback(this);
            }
            if (this.f14671Q != null && getTopInset() > 0) {
                z10 = true;
            }
            setWillNotDraw(!z10);
            WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
            C10029b0.d.m18674k(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(C5452a.m11672a(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f3) {
        C6455j.m13073a(this, f3);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f14671Q;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f14671Q) {
            return false;
        }
        return true;
    }
}
