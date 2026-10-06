package com.google.android.material.appbar;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
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
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.aah;
import p000.aai;
import p000.aal;
import p000.aax;
import p000.acw;
import p000.aer;
import p000.afb;
import p000.afc;
import p000.afd;
import p000.afe;
import p000.afh;
import p000.afn;
import p000.afq;
import p000.ago;
import p000.agr;
import p000.ahx;
import p000.ifo;
import p000.kxk;
import p000.lij;
import p000.mbb;
import p000.mfs;
import p000.mfx;
import p000.mfz;
import p000.mga;
import p000.mgb;
import p000.mgc;
import p000.mgd;
import p000.mgg;
import p000.mgi;
import p000.mgj;
import p000.mgk;
import p000.mgm;
import p000.mgn;
import p000.miu;
import p000.mjb;
import p000.mkv;
import p000.mkx;
import p000.mlz;
import p000.mmp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements aah {

    /* JADX INFO: renamed from: a */
    public boolean f7999a;

    /* JADX INFO: renamed from: b */
    public int f8000b;

    /* JADX INFO: renamed from: c */
    public ago f8001c;

    /* JADX INFO: renamed from: d */
    public List f8002d;

    /* JADX INFO: renamed from: e */
    public boolean f8003e;

    /* JADX INFO: renamed from: f */
    public final List f8004f;

    /* JADX INFO: renamed from: g */
    public Drawable f8005g;

    /* JADX INFO: renamed from: h */
    private int f8006h;

    /* JADX INFO: renamed from: i */
    private int f8007i;

    /* JADX INFO: renamed from: j */
    private int f8008j;

    /* JADX INFO: renamed from: k */
    private int f8009k;

    /* JADX INFO: renamed from: l */
    private boolean f8010l;

    /* JADX INFO: renamed from: m */
    private boolean f8011m;

    /* JADX INFO: renamed from: n */
    private int f8012n;

    /* JADX INFO: renamed from: o */
    private WeakReference f8013o;

    /* JADX INFO: renamed from: p */
    private final ColorStateList f8014p;

    /* JADX INFO: renamed from: q */
    private ValueAnimator f8015q;

    /* JADX INFO: renamed from: r */
    private ValueAnimator.AnimatorUpdateListener f8016r;

    /* JADX INFO: renamed from: s */
    private final long f8017s;

    /* JADX INFO: renamed from: t */
    private final TimeInterpolator f8018t;

    /* JADX INFO: renamed from: u */
    private int[] f8019u;

    /* JADX INFO: renamed from: v */
    private final float f8020v;

    /* JADX INFO: renamed from: w */
    private Behavior f8021w;

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes.dex */
    public class BaseBehavior extends mgi {

        /* JADX INFO: renamed from: a */
        public int f8022a;

        /* JADX INFO: renamed from: b */
        public boolean f8023b;

        /* JADX INFO: renamed from: c */
        public kxk f8024c;

        /* JADX INFO: renamed from: e */
        private int f8025e;

        /* JADX INFO: renamed from: f */
        private ValueAnimator f8026f;

        /* JADX INFO: renamed from: g */
        private mgc f8027g;

        /* JADX INFO: renamed from: h */
        private WeakReference f8028h;

        public BaseBehavior() {
        }

        /* JADX INFO: renamed from: H */
        private final void m4753H(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int iM4744e = appBarLayout.m4744e() + appBarLayout.getPaddingTop();
            int iMo4765w = mo4765w() - iM4744e;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                mgd mgdVar = (mgd) childAt.getLayoutParams();
                if (m4755J(mgdVar.f40417a, 32)) {
                    top -= mgdVar.topMargin;
                    bottom += mgdVar.bottomMargin;
                }
                int i2 = -iMo4765w;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                mgd mgdVar2 = (mgd) childAt2.getLayoutParams();
                int i3 = mgdVar2.f40417a;
                if ((i3 & 17) == 17) {
                    int iM4744e2 = -childAt2.getTop();
                    int iM421b = -childAt2.getBottom();
                    if (i == 0 && afb.m435p(appBarLayout) && afb.m435p(childAt2)) {
                        iM4744e2 -= appBarLayout.m4744e();
                    }
                    if (m4755J(i3, 2)) {
                        iM421b += afb.m421b(childAt2);
                    } else if (m4755J(i3, 5)) {
                        int iM421b2 = afb.m421b(childAt2) + iM421b;
                        if (iMo4765w < iM421b2) {
                            iM4744e2 = iM421b2;
                        } else {
                            iM421b = iM421b2;
                        }
                    }
                    if (m4755J(i3, 32)) {
                        iM4744e2 += mgdVar2.topMargin;
                        iM421b -= mgdVar2.bottomMargin;
                    }
                    if (iMo4765w < (iM421b + iM4744e2) / 2) {
                        iM4744e2 = iM421b;
                    }
                    m4756K(coordinatorLayout, appBarLayout, aax.m69d(iM4744e2 + iM4744e, -appBarLayout.m4745f(), 0));
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:32:0x009a  */
        /* JADX INFO: renamed from: I */
        private final void m4754I(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            View view;
            afq.m546f(coordinatorLayout, agr.f337m.m619a());
            afq.m546f(coordinatorLayout, agr.f338n.m619a());
            if (appBarLayout.m4745f() != 0) {
                int childCount = coordinatorLayout.getChildCount();
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        view = null;
                        break;
                    }
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (((aal) childAt.getLayoutParams()).f14a instanceof ScrollingViewBehavior) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
                if (view == null) {
                    return;
                }
                int childCount2 = appBarLayout.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    if (((mgd) appBarLayout.getChildAt(i2).getLayoutParams()).f40417a != 0) {
                        if (afn.m534a(coordinatorLayout) == null) {
                            afq.m547g(coordinatorLayout, new mfz(this));
                        }
                        boolean z2 = true;
                        if (mo4765w() != (-appBarLayout.m4745f())) {
                            m4758M(coordinatorLayout, appBarLayout, agr.f337m, false);
                            z = true;
                        }
                        if (mo4765w() == 0) {
                            z2 = z;
                        } else if (view.canScrollVertically(-1)) {
                            int i3 = -appBarLayout.m4741b();
                            if (i3 != 0) {
                                afq.m549i(coordinatorLayout, agr.f338n, new mga(this, coordinatorLayout, appBarLayout, view, i3));
                            } else {
                                z2 = z;
                            }
                        } else {
                            m4758M(coordinatorLayout, appBarLayout, agr.f338n, true);
                        }
                        this.f8023b = z2;
                        return;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: J */
        private static boolean m4755J(int i, int i2) {
            return (i & i2) == i2;
        }

        /* JADX INFO: renamed from: K */
        private final void m4756K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(mo4765w() - i);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iMo4765w = mo4765w();
            if (iMo4765w == i) {
                ValueAnimator valueAnimator = this.f8026f;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f8026f.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f8026f;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f8026f = valueAnimator3;
                valueAnimator3.setInterpolator(mfs.f40387e);
                this.f8026f.addUpdateListener(new mlz(this, coordinatorLayout, appBarLayout, 1));
            } else {
                valueAnimator2.cancel();
            }
            this.f8026f.setDuration(Math.min(iRound, 600));
            this.f8026f.setIntValues(iMo4765w, i);
            this.f8026f.start();
        }

        /* JADX INFO: renamed from: L */
        private static final View m4757L(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof aer) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: M */
        private static final void m4758M(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, agr agrVar, boolean z) {
            afq.m549i(coordinatorLayout, agrVar, new mgb(appBarLayout, z));
        }

        /* JADX WARN: Code duplicated, block: B:28:0x005d  */
        /* JADX INFO: renamed from: N */
        private static final void m4759N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View childAt;
            boolean zM4752m;
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i3);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (childAt != null) {
                int i4 = ((mgd) childAt.getLayoutParams()).f40417a;
                if ((i4 & 1) != 0) {
                    int iM421b = afb.m421b(childAt);
                    zM4752m = true;
                    if (i2 <= 0 || (i4 & 12) == 0) {
                        if ((i4 & 2) == 0 || (-i) < (childAt.getBottom() - iM421b) - appBarLayout.m4744e()) {
                            zM4752m = false;
                        }
                    } else if ((-i) < (childAt.getBottom() - iM421b) - appBarLayout.m4744e()) {
                        zM4752m = false;
                    }
                } else {
                    zM4752m = false;
                }
            } else {
                zM4752m = false;
            }
            if (appBarLayout.f8003e) {
                zM4752m = appBarLayout.m4752m(m4757L(coordinatorLayout));
            }
            boolean zM4751l = appBarLayout.m4751l(zM4752m);
            if (!z) {
                if (zM4751l) {
                    ArrayList arrayListM2181a = coordinatorLayout.f1453h.m2181a(appBarLayout);
                    List arrayList = arrayListM2181a != null ? new ArrayList(arrayListM2181a) : null;
                    if (arrayList == null) {
                        arrayList = Collections.emptyList();
                    }
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        aai aaiVar = ((aal) ((View) arrayList.get(i5)).getLayoutParams()).f14a;
                        if (aaiVar instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) aaiVar).f40436d == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            appBarLayout.jumpDrawablesToCurrentState();
        }

        /* JADX INFO: renamed from: A */
        final void m4760A(mgc mgcVar, boolean z) {
            if (this.f8027g == null || z) {
                this.f8027g = mgcVar;
            }
        }

        @Override // p000.mgi
        /* JADX INFO: renamed from: B */
        public final /* bridge */ /* synthetic */ boolean mo4761B(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f8024c != null) {
                return Build.VERSION.SDK_INT > 33 && appBarLayout.getResources().getConfiguration().orientation == 2;
            }
            WeakReference weakReference = this.f8028h;
            if (weakReference == null) {
                return true;
            }
            View view2 = (View) weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: renamed from: C */
        public final void m4762C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int iM4741b;
            if (i != 0) {
                if (i < 0) {
                    int i3 = -appBarLayout.m4745f();
                    i2 = i3;
                    iM4741b = appBarLayout.m4741b() + i3;
                } else {
                    i2 = -appBarLayout.m4745f();
                    iM4741b = 0;
                }
                if (i2 != iM4741b) {
                    iArr[1] = m16351D(coordinatorLayout, appBarLayout, i, i2, iM4741b);
                }
            }
            if (appBarLayout.f8003e) {
                appBarLayout.m4751l(appBarLayout.m4752m(view));
            }
        }

        @Override // p000.aai
        /* JADX INFO: renamed from: c */
        public final /* bridge */ /* synthetic */ void mo6c(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f8025e == 0 || i == 1) {
                m4753H(coordinatorLayout, appBarLayout);
                if (appBarLayout.f8003e) {
                    appBarLayout.m4751l(appBarLayout.m4752m(view2));
                }
            }
            this.f8028h = new WeakReference(view2);
        }

        @Override // p000.mgl, p000.aai
        /* JADX INFO: renamed from: e */
        public final /* bridge */ /* synthetic */ boolean mo8e(CoordinatorLayout coordinatorLayout, View view, int i) {
            final AppBarLayout appBarLayout = (AppBarLayout) view;
            super.mo8e(coordinatorLayout, appBarLayout, i);
            int i2 = appBarLayout.f8000b;
            mgc mgcVar = this.f8027g;
            if (mgcVar == null || (i2 & 8) != 0) {
                if (i2 != 0) {
                    int i3 = i2 & 4;
                    if ((i2 & 2) != 0) {
                        int i4 = -appBarLayout.m4745f();
                        if (i3 != 0) {
                            m4756K(coordinatorLayout, appBarLayout, i4);
                        } else {
                            m16352E(coordinatorLayout, appBarLayout, i4);
                        }
                    } else if ((i2 & 1) != 0) {
                        if (i3 != 0) {
                            m4756K(coordinatorLayout, appBarLayout, 0);
                        } else {
                            m16352E(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (mgcVar.f40412a) {
                m16352E(coordinatorLayout, appBarLayout, -appBarLayout.m4745f());
            } else if (mgcVar.f40413b) {
                m16352E(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(mgcVar.f40414e);
                int i5 = -childAt.getBottom();
                m16352E(coordinatorLayout, appBarLayout, this.f8027g.f40416g ? i5 + afb.m421b(childAt) + appBarLayout.m4744e() : i5 + Math.round(childAt.getHeight() * this.f8027g.f40415f));
            }
            appBarLayout.f8000b = 0;
            this.f8027g = null;
            m16356G(aax.m69d(m16355F(), -appBarLayout.m4745f(), 0));
            m4759N(coordinatorLayout, appBarLayout, m16355F(), 0, true);
            appBarLayout.m4747h(m16355F());
            m4754I(coordinatorLayout, appBarLayout);
            final View viewM4757L = m4757L(coordinatorLayout);
            if (viewM4757L != null) {
                viewM4757L.addOnUnhandledKeyEventListener(new View.OnUnhandledKeyEventListener() { // from class: mfy
                    @Override // android.view.View.OnUnhandledKeyEventListener
                    public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                        View view3 = viewM4757L;
                        AppBarLayout appBarLayout2 = appBarLayout;
                        if (keyEvent.getAction() == 0 || keyEvent.getAction() == 1) {
                            int keyCode = keyEvent.getKeyCode();
                            if (keyCode == 19 || keyCode == 280 || keyCode == 92) {
                                double scrollY = view3.getScrollY();
                                double measuredHeight = view3.getMeasuredHeight();
                                Double.isNaN(measuredHeight);
                                if (scrollY < measuredHeight * 0.1d) {
                                    appBarLayout2.m4748i(true);
                                }
                            } else if ((keyCode == 20 || keyCode == 281 || keyCode == 93) && view3.getScrollY() > 0) {
                                appBarLayout2.m4748i(false);
                            }
                        }
                        return false;
                    }
                });
            }
            return true;
        }

        @Override // p000.aai
        /* JADX INFO: renamed from: k */
        public final /* bridge */ /* synthetic */ boolean mo14k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((aal) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.m1428m(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // p000.aai
        /* JADX INFO: renamed from: m */
        public final /* bridge */ /* synthetic */ void mo16m(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
            m4762C(coordinatorLayout, (AppBarLayout) view, view2, i, iArr);
        }

        @Override // p000.aai
        /* JADX INFO: renamed from: n */
        public final /* bridge */ /* synthetic */ void mo17n(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                iArr[1] = m16351D(coordinatorLayout, appBarLayout, i3, -appBarLayout.m4742c(), 0);
            }
            if (i3 == 0) {
                m4754I(coordinatorLayout, appBarLayout);
            }
        }

        @Override // p000.aai
        /* JADX INFO: renamed from: o */
        public final /* bridge */ /* synthetic */ void mo18o(View view, Parcelable parcelable) {
            if (!(parcelable instanceof mgc)) {
                this.f8027g = null;
            } else {
                m4760A((mgc) parcelable, true);
                Parcelable parcelable2 = this.f8027g.f394d;
            }
        }

        @Override // p000.aai
        /* JADX INFO: renamed from: p */
        public final /* bridge */ /* synthetic */ Parcelable mo19p(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            mgc mgcVarM4767y = m4767y(absSavedState, (AppBarLayout) view);
            return mgcVarM4767y == null ? absSavedState : mgcVarM4767y;
        }

        @Override // p000.aai
        /* JADX INFO: renamed from: q */
        public final /* bridge */ /* synthetic */ boolean mo20q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = false;
            if ((i & 2) != 0) {
                if (appBarLayout.f8003e) {
                    z = true;
                } else if (appBarLayout.m4745f() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()) {
                    z = true;
                }
            }
            if (z && (valueAnimator = this.f8026f) != null) {
                valueAnimator.cancel();
            }
            this.f8028h = null;
            this.f8025e = i2;
            return z;
        }

        @Override // p000.mgi
        /* JADX INFO: renamed from: u */
        public final /* bridge */ /* synthetic */ int mo4763u(View view) {
            return -((AppBarLayout) view).m4742c();
        }

        @Override // p000.mgi
        /* JADX INFO: renamed from: v */
        public final /* synthetic */ int mo4764v(View view) {
            return ((AppBarLayout) view).m4745f();
        }

        @Override // p000.mgi
        /* JADX INFO: renamed from: w */
        public final int mo4765w() {
            return m16355F() + this.f8022a;
        }

        @Override // p000.mgi
        /* JADX INFO: renamed from: x */
        public final /* bridge */ /* synthetic */ int mo4766x(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int iSignum;
            int iM4744e;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iMo4765w = mo4765w();
            int i4 = 0;
            if (i2 == 0 || iMo4765w < i2 || iMo4765w > i3) {
                this.f8022a = 0;
            } else {
                int iM69d = aax.m69d(i, i2, i3);
                if (iMo4765w != iM69d) {
                    if (!appBarLayout.f7999a) {
                        iSignum = iM69d;
                        break;
                    }
                    int iAbs = Math.abs(iM69d);
                    int childCount = appBarLayout.getChildCount();
                    int i5 = 0;
                    while (true) {
                        if (i5 < childCount) {
                            View childAt = appBarLayout.getChildAt(i5);
                            mgd mgdVar = (mgd) childAt.getLayoutParams();
                            Interpolator interpolator = mgdVar.f40418b;
                            if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                                i5++;
                            } else if (interpolator != null) {
                                int i6 = mgdVar.f40417a;
                                if ((i6 & 1) != 0) {
                                    iM4744e = childAt.getHeight() + mgdVar.topMargin + mgdVar.bottomMargin;
                                    if ((i6 & 2) != 0) {
                                        iM4744e -= afb.m421b(childAt);
                                    }
                                } else {
                                    iM4744e = 0;
                                }
                                if (afb.m435p(childAt)) {
                                    iM4744e -= appBarLayout.m4744e();
                                }
                                if (iM4744e > 0) {
                                    float f = iM4744e;
                                    iSignum = Integer.signum(iM69d) * (childAt.getTop() + Math.round(f * interpolator.getInterpolation((iAbs - childAt.getTop()) / f)));
                                    break;
                                }
                            }
                        }
                        iSignum = iM69d;
                        break;
                    }
                    boolean zM16356G = m16356G(iSignum);
                    int i7 = iMo4765w - iM69d;
                    this.f8022a = iM69d - iSignum;
                    if (zM16356G) {
                        for (int i8 = 0; i8 < appBarLayout.getChildCount(); i8++) {
                            mgd mgdVar2 = (mgd) appBarLayout.getChildAt(i8).getLayoutParams();
                            mbb mbbVar = mgdVar2.f40419c;
                            if (mbbVar != null && (mgdVar2.f40417a & 1) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i8);
                                float fM16355F = m16355F();
                                Rect rect = (Rect) mbbVar.f39760a;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.m4744e());
                                float fAbs = ((Rect) mbbVar.f39760a).top - Math.abs(fM16355F);
                                if (fAbs <= 0.0f) {
                                    float fM70e = 1.0f - aax.m70e(Math.abs(fAbs / ((Rect) mbbVar.f39760a).height()), 1.0f);
                                    float fHeight = (-fAbs) - ((((Rect) mbbVar.f39760a).height() * 0.3f) * (1.0f - (fM70e * fM70e)));
                                    childAt2.setTranslationY(fHeight);
                                    childAt2.getDrawingRect((Rect) mbbVar.f39761b);
                                    ((Rect) mbbVar.f39761b).offset(0, (int) (-fHeight));
                                    afd.m454b(childAt2, (Rect) mbbVar.f39761b);
                                } else {
                                    afd.m454b(childAt2, null);
                                    childAt2.setTranslationY(0.0f);
                                }
                            }
                        }
                    } else if (appBarLayout.f7999a) {
                        coordinatorLayout.m1423b(appBarLayout);
                    }
                    appBarLayout.m4747h(m16355F());
                    m4759N(coordinatorLayout, appBarLayout, iM69d, iM69d < iMo4765w ? -1 : 1, false);
                    i4 = i7;
                }
            }
            m4754I(coordinatorLayout, appBarLayout);
            return i4;
        }

        /* JADX INFO: renamed from: y */
        final mgc m4767y(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iM16355F = m16355F();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iM16355F;
                if (childAt.getTop() + iM16355F <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = ahx.f393c;
                    }
                    mgc mgcVar = new mgc(parcelable);
                    boolean z = iM16355F == 0;
                    mgcVar.f40413b = z;
                    mgcVar.f40412a = !z && (-iM16355F) >= appBarLayout.m4745f();
                    mgcVar.f40414e = i;
                    mgcVar.f40416g = bottom == afb.m421b(childAt) + appBarLayout.m4744e();
                    mgcVar.f40415f = bottom / childAt.getHeight();
                    return mgcVar;
                }
            }
            return null;
        }

        @Override // p000.mgi
        /* JADX INFO: renamed from: z */
        public final /* bridge */ /* synthetic */ void mo4768z(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            m4753H(coordinatorLayout, appBarLayout);
            if (appBarLayout.f8003e) {
                appBarLayout.m4751l(appBarLayout.m4752m(m4757L(coordinatorLayout)));
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: compiled from: PG */
    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: compiled from: PG */
    public class ScrollingViewBehavior extends mgj {
        public ScrollingViewBehavior() {
        }

        /* JADX INFO: renamed from: x */
        static final AppBarLayout m4769x(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // p000.mgl, p000.aai
        /* JADX INFO: renamed from: e */
        public final /* bridge */ /* synthetic */ boolean mo8e(CoordinatorLayout coordinatorLayout, View view, int i) {
            super.mo8e(coordinatorLayout, view, i);
            return true;
        }

        @Override // p000.aai
        /* JADX INFO: renamed from: f */
        public final boolean mo9f(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutM4769x = m4769x(coordinatorLayout.m1422a(view));
            if (appBarLayoutM4769x != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f40433a;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutM4769x.m4749j(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // p000.aai
        /* JADX INFO: renamed from: h */
        public final boolean mo11h(View view) {
            return view instanceof AppBarLayout;
        }

        @Override // p000.aai
        /* JADX INFO: renamed from: i */
        public final void mo12i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            aai aaiVar = ((aal) view2.getLayoutParams()).f14a;
            if (aaiVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) aaiVar).f8022a) + this.f40435c) - m16354y(view2);
                int[] iArr = afq.f274a;
                view.offsetTopAndBottom(bottom);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f8003e) {
                    appBarLayout.m4751l(appBarLayout.m4752m(view));
                }
            }
        }

        @Override // p000.aai
        /* JADX INFO: renamed from: j */
        public final void mo13j(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                afq.m546f(coordinatorLayout, agr.f337m.m619a());
                afq.m546f(coordinatorLayout, agr.f338n.m619a());
                afq.m547g(coordinatorLayout, null);
            }
        }

        @Override // p000.aai
        /* JADX INFO: renamed from: k */
        public final /* bridge */ /* synthetic */ boolean mo14k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            ago agoVar;
            int i4 = view.getLayoutParams().height;
            if (i4 != -1) {
                if (i4 != -2) {
                    return false;
                }
                i4 = -2;
            }
            View viewMo4772w = mo4772w(coordinatorLayout.m1422a(view));
            if (viewMo4772w == null) {
                return false;
            }
            int size = View.MeasureSpec.getSize(i3);
            if (size <= 0) {
                size = coordinatorLayout.getHeight();
            } else if (afb.m435p(viewMo4772w) && (agoVar = coordinatorLayout.f1450e) != null) {
                size += agoVar.m606d() + agoVar.m603a();
            }
            int iMo4771v = size + mo4771v(viewMo4772w);
            int measuredHeight = viewMo4772w.getMeasuredHeight();
            view.setTranslationY(0.0f);
            coordinatorLayout.m1428m(view, i, i2, View.MeasureSpec.makeMeasureSpec(iMo4771v - measuredHeight, i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
            return true;
        }

        @Override // p000.mgj
        /* JADX INFO: renamed from: u */
        public final float mo4770u(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int iM4745f = appBarLayout.m4745f();
                int iM4741b = appBarLayout.m4741b();
                aai aaiVar = ((aal) appBarLayout.getLayoutParams()).f14a;
                int iMo4765w = aaiVar instanceof BaseBehavior ? ((BaseBehavior) aaiVar).mo4765w() : 0;
                if ((iM4741b == 0 || iM4745f + iMo4765w > iM4741b) && (i = iM4745f - iM4741b) != 0) {
                    return (iMo4765w / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // p000.mgj
        /* JADX INFO: renamed from: v */
        public final int mo4771v(View view) {
            return ((AppBarLayout) view).m4745f();
        }

        @Override // p000.mgj
        /* JADX INFO: renamed from: w */
        public final /* bridge */ /* synthetic */ View mo4772w(List list) {
            return m4769x(list);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mgk.f40441e);
            this.f40436d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: n */
    protected static final mgd m4734n() {
        return new mgd();
    }

    /* JADX INFO: renamed from: o */
    protected static final mgd m4735o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new mgd((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new mgd((ViewGroup.MarginLayoutParams) layoutParams) : new mgd(layoutParams);
    }

    /* JADX INFO: renamed from: q */
    private final void m4737q(boolean z, boolean z2, boolean z3) {
        this.f8000b = (true != z ? 2 : 1) | (true != z2 ? 0 : 4) | (true == z3 ? 8 : 0);
        requestLayout();
    }

    /* JADX INFO: renamed from: r */
    private final void m4738r(float f, float f2) {
        ValueAnimator valueAnimator = this.f8015q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.f8015q = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f8017s);
        this.f8015q.setInterpolator(this.f8018t);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f8016r;
        if (animatorUpdateListener != null) {
            this.f8015q.addUpdateListener(animatorUpdateListener);
        }
        this.f8015q.start();
    }

    /* JADX INFO: renamed from: s */
    private final boolean m4739s() {
        return this.f8005g != null && m4744e() > 0;
    }

    /* JADX INFO: renamed from: t */
    private final boolean m4740t() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !afb.m435p(childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.aah
    /* JADX INFO: renamed from: a */
    public final aai mo1a() {
        Behavior behavior = new Behavior();
        this.f8021w = behavior;
        return behavior;
    }

    /* JADX INFO: renamed from: b */
    final int m4741b() {
        int i = this.f8008j;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                mgd mgdVar = (mgd) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = mgdVar.f40417a;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = mgdVar.topMargin + mgdVar.bottomMargin;
                    int iM421b = (i3 & 8) != 0 ? i4 + afb.m421b(childAt) : (i3 & 2) != 0 ? i4 + (measuredHeight - afb.m421b(childAt)) : i4 + measuredHeight;
                    if (childCount == 0 && afb.m435p(childAt)) {
                        iM421b = Math.min(iM421b, measuredHeight - m4744e());
                    }
                    i2 += iM421b;
                }
            }
        }
        int iMax = Math.max(0, i2);
        this.f8008j = iMax;
        return iMax;
    }

    /* JADX INFO: renamed from: c */
    final int m4742c() {
        int i = this.f8009k;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int iM421b = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                mgd mgdVar = (mgd) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + mgdVar.topMargin + mgdVar.bottomMargin;
                int i3 = mgdVar.f40417a;
                if ((i3 & 1) == 0) {
                    break;
                }
                iM421b += measuredHeight;
                if ((i3 & 2) != 0) {
                    iM421b -= afb.m421b(childAt);
                    break;
                }
            }
        }
        int iMax = Math.max(0, iM421b);
        this.f8009k = iMax;
        return iMax;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof mgd;
    }

    /* JADX INFO: renamed from: d */
    public final int m4743d() {
        int iM4744e = m4744e();
        int iM421b = afb.m421b(this);
        if (iM421b != 0) {
            return iM421b + iM421b + iM4744e;
        }
        int childCount = getChildCount();
        int iM421b2 = childCount > 0 ? afb.m421b(getChildAt(childCount - 1)) : 0;
        return iM421b2 != 0 ? iM421b2 + iM421b2 + iM4744e : getHeight() / 3;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (m4739s()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f8006h);
            this.f8005g.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f8005g;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: e */
    final int m4744e() {
        ago agoVar = this.f8001c;
        if (agoVar != null) {
            return agoVar.m606d();
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public final int m4745f() {
        int i = this.f8007i;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int iM421b = 0;
        while (i2 < childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                mgd mgdVar = (mgd) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = mgdVar.f40417a;
                if ((i3 & 1) == 0) {
                    break;
                }
                iM421b += measuredHeight + mgdVar.topMargin + mgdVar.bottomMargin;
                if (i2 == 0) {
                    if (afb.m435p(childAt)) {
                        iM421b -= m4744e();
                        i2 = 0;
                    } else {
                        i2 = 0;
                    }
                }
                if ((i3 & 2) != 0) {
                    iM421b -= afb.m421b(childAt);
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, iM421b);
        this.f8007i = iMax;
        return iMax;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final mgd generateLayoutParams(AttributeSet attributeSet) {
        return new mgd(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m4734n();
    }

    /* JADX INFO: renamed from: h */
    final void m4747h(int i) {
        this.f8006h = i;
        if (!willNotDraw()) {
            afb.m426g(this);
        }
        List list = this.f8002d;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                AmbientMode.AmbientController ambientController = (AmbientMode.AmbientController) this.f8002d.get(i2);
                if (ambientController != null) {
                    CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) ambientController.f1697a;
                    collapsingToolbarLayout.f8037d = i;
                    ago agoVar = collapsingToolbarLayout.f8038e;
                    int iM606d = agoVar != null ? agoVar.m606d() : 0;
                    int childCount = ((CollapsingToolbarLayout) ambientController.f1697a).getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = ((CollapsingToolbarLayout) ambientController.f1697a).getChildAt(i3);
                        mgg mggVar = (mgg) childAt.getLayoutParams();
                        mgm mgmVarM4773c = CollapsingToolbarLayout.m4773c(childAt);
                        switch (mggVar.f40421a) {
                            case 1:
                                mgmVarM4773c.m16359c(aax.m69d(-i, 0, ((CollapsingToolbarLayout) ambientController.f1697a).m4783a(childAt)));
                                break;
                            case 2:
                                mgmVarM4773c.m16359c(Math.round((-i) * mggVar.f40422b));
                                break;
                        }
                    }
                    ((CollapsingToolbarLayout) ambientController.f1697a).m4788g();
                    Object obj = ambientController.f1697a;
                    if (((CollapsingToolbarLayout) obj).f8036c != null && iM606d > 0) {
                        afb.m426g((View) obj);
                    }
                    int height = ((CollapsingToolbarLayout) ambientController.f1697a).getHeight();
                    int iM421b = height - afb.m421b((View) ambientController.f1697a);
                    int iM4784b = height - ((CollapsingToolbarLayout) ambientController.f1697a).m4784b();
                    miu miuVar = ((CollapsingToolbarLayout) ambientController.f1697a).f8034a;
                    int i4 = iM421b - iM606d;
                    float f = iM4784b;
                    float f2 = i4;
                    miuVar.f40685d = Math.min(1.0f, f / f2);
                    miuVar.f40686e = miuVar.m16427a();
                    CollapsingToolbarLayout collapsingToolbarLayout2 = (CollapsingToolbarLayout) ambientController.f1697a;
                    miu miuVar2 = collapsingToolbarLayout2.f8034a;
                    miuVar2.f40687f = collapsingToolbarLayout2.f8037d + i4;
                    float fAbs = Math.abs(i);
                    float f3 = miuVar2.f40683b;
                    float fM70e = aax.m70e(fAbs / f2, 1.0f);
                    if (fM70e != f3) {
                        miuVar2.f40683b = fM70e;
                        miuVar2.m16429c();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m4748i(boolean z) {
        m4749j(z, afe.m462f(this));
    }

    /* JADX INFO: renamed from: j */
    public final void m4749j(boolean z, boolean z2) {
        m4737q(z, z2, true);
    }

    /* JADX INFO: renamed from: k */
    public final void m4750k() {
        setWillNotDraw(!m4739s());
    }

    /* JADX INFO: renamed from: l */
    final boolean m4751l(boolean z) {
        if (this.f8011m == z) {
            return false;
        }
        this.f8011m = z;
        refreshDrawableState();
        if (!this.f8003e || !(getBackground() instanceof mkx)) {
            return true;
        }
        if (this.f8014p != null) {
            m4738r(true != z ? 255.0f : 0.0f, true == z ? 255.0f : 0.0f);
            return true;
        }
        m4738r(z ? 0.0f : this.f8020v, z ? this.f8020v : 0.0f);
        return true;
    }

    /* JADX INFO: renamed from: m */
    final boolean m4752m(View view) {
        int i;
        if (this.f8013o == null && (i = this.f8012n) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f8012n);
            }
            if (viewFindViewById != null) {
                this.f8013o = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f8013o;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mkv.m16545j(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        boolean z;
        if (this.f8019u == null) {
            this.f8019u = new int[4];
        }
        int[] iArr = this.f8019u;
        int length = iArr.length;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 4);
        boolean z2 = this.f8010l;
        boolean z3 = false;
        iArr[0] = true != z2 ? -2130970108 : C0100R.attr.state_liftable;
        int i2 = -2130970109;
        if (!z2) {
            z = false;
            z3 = true;
        } else if (this.f8011m) {
            i2 = C0100R.attr.state_lifted;
            z = true;
        } else {
            z = true;
        }
        iArr[1] = i2;
        iArr[2] = true != z3 ? C0100R.attr.state_collapsible : -2130970104;
        int i3 = -2130970103;
        if (z && this.f8011m) {
            i3 = C0100R.attr.state_collapsed;
        }
        iArr[3] = i3;
        return mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.f8013o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f8013o = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (afb.m435p(this) && m4740t()) {
            int iM4744e = m4744e();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(iM4744e);
            }
        }
        m4736p();
        boolean z2 = false;
        this.f7999a = false;
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            if (((mgd) getChildAt(i5).getLayoutParams()).f40418b != null) {
                this.f7999a = true;
                break;
            }
        }
        Drawable drawable = this.f8005g;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), m4744e());
        }
        if (!this.f8003e) {
            int childCount3 = getChildCount();
            for (int i6 = 0; i6 < childCount3; i6++) {
                int i7 = ((mgd) getChildAt(i6).getLayoutParams()).f40417a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = true;
        }
        if (this.f8010l != z2) {
            this.f8010l = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && afb.m435p(this) && m4740t()) {
            int measuredHeight = getMeasuredHeight();
            switch (mode) {
                case Integer.MIN_VALUE:
                    measuredHeight = aax.m69d(getMeasuredHeight() + m4744e(), 0, View.MeasureSpec.getSize(i2));
                    break;
                case 0:
                    measuredHeight += m4744e();
                    break;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m4736p();
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        mkv.m16544i(this, f);
    }

    @Override // android.widget.LinearLayout
    public final void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(1);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.f8005g;
        if (drawable != null) {
            drawable.setVisible(i == 0, false);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f8005g;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0100R.attr.appBarLayoutStyle);
    }

    /* JADX INFO: renamed from: p */
    private final void m4736p() {
        Behavior behavior = this.f8021w;
        mgc mgcVarM4767y = null;
        if (behavior != null && this.f8007i != -1 && this.f8000b == 0) {
            mgcVarM4767y = behavior.m4767y(ahx.f393c, this);
        }
        this.f8007i = -1;
        this.f8008j = -1;
        this.f8009k = -1;
        if (mgcVarM4767y != null) {
            this.f8021w.m4760A(mgcVarM4767y, false);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return m4734n();
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(mmp.m16632a(context, attributeSet, i, C0100R.style.Widget_Design_AppBarLayout), attributeSet, i);
        this.f8007i = -1;
        this.f8008j = -1;
        this.f8009k = -1;
        this.f8000b = 0;
        this.f8004f = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            int[] iArr = mgn.f40448a;
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        int[] iArr2 = mgn.f40448a;
        Context context3 = getContext();
        TypedArray typedArrayM16438a = mjb.m16438a(context3, attributeSet, mgn.f40448a, i, C0100R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayM16438a.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayM16438a.getResourceId(0, 0)));
            }
            typedArrayM16438a.recycle();
            TypedArray typedArrayM16438a2 = mjb.m16438a(context2, attributeSet, mgk.f40437a, i, C0100R.style.Widget_Design_AppBarLayout, new int[0]);
            afb.m432m(this, typedArrayM16438a2.getDrawable(0));
            ColorStateList colorStateListM16540d = mkv.m16540d(context2, typedArrayM16438a2, 6);
            this.f8014p = colorStateListM16540d;
            int i2 = 3;
            int i3 = 4;
            if (getBackground() instanceof ColorDrawable) {
                ColorDrawable colorDrawable = (ColorDrawable) getBackground();
                mkx mkxVar = new mkx();
                mkxVar.m16579i(ColorStateList.valueOf(colorDrawable.getColor()));
                if (colorStateListM16540d != null) {
                    mkxVar.setAlpha(true != this.f8011m ? 0 : 255);
                    mkxVar.m16579i(colorStateListM16540d);
                    this.f8016r = new ifo(this, mkxVar, i2);
                } else {
                    mkxVar.m16577g(context2);
                    this.f8016r = new ifo(this, mkxVar, i3);
                }
                afb.m432m(this, mkxVar);
            }
            this.f8017s = lij.m15393A(context2, C0100R.attr.motionDurationMedium2, getResources().getInteger(C0100R.integer.app_bar_elevation_anim_duration));
            this.f8018t = lij.m15398F(context2, C0100R.attr.motionEasingStandardInterpolator, mfs.f40383a);
            if (typedArrayM16438a2.hasValue(4)) {
                m4737q(typedArrayM16438a2.getBoolean(4, false), false, false);
            }
            if (typedArrayM16438a2.hasValue(3)) {
                float dimensionPixelSize = typedArrayM16438a2.getDimensionPixelSize(3, 0);
                int integer = getResources().getInteger(C0100R.integer.app_bar_elevation_anim_duration);
                StateListAnimator stateListAnimator = new StateListAnimator();
                long j = integer;
                stateListAnimator.addState(new int[]{R.attr.state_enabled, C0100R.attr.state_liftable, -2130970109}, ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(j));
                stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(this, "elevation", dimensionPixelSize).setDuration(j));
                stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(0L));
                setStateListAnimator(stateListAnimator);
            }
            if (typedArrayM16438a2.hasValue(2)) {
                setKeyboardNavigationCluster(typedArrayM16438a2.getBoolean(2, false));
            }
            if (typedArrayM16438a2.hasValue(1)) {
                setTouchscreenBlocksFocus(typedArrayM16438a2.getBoolean(1, false));
            }
            this.f8020v = getResources().getDimension(C0100R.dimen.design_appbar_elevation);
            this.f8003e = typedArrayM16438a2.getBoolean(5, false);
            this.f8012n = typedArrayM16438a2.getResourceId(7, -1);
            Drawable drawable = typedArrayM16438a2.getDrawable(8);
            Drawable drawable2 = this.f8005g;
            if (drawable2 != drawable) {
                if (drawable2 != null) {
                    drawable2.setCallback(null);
                }
                Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
                this.f8005g = drawableMutate;
                if (drawableMutate != null) {
                    if (drawableMutate.isStateful()) {
                        this.f8005g.setState(getDrawableState());
                    }
                    acw.m245b(this.f8005g, afc.m442c(this));
                    this.f8005g.setVisible(getVisibility() == 0, false);
                    this.f8005g.setCallback(this);
                }
                m4750k();
                afb.m426g(this);
            }
            typedArrayM16438a2.recycle();
            afh.m483n(this, new mfx(this, 0));
        } catch (Throwable th) {
            typedArrayM16438a.recycle();
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m4735o(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m4735o(layoutParams);
    }
}
