package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.aai;
import p000.aal;
import p000.afb;
import p000.afc;
import p000.afe;
import p000.aff;
import p000.afh;
import p000.afq;
import p000.agr;
import p000.ahc;
import p000.ahz;
import p000.aia;
import p000.mgr;
import p000.mgs;
import p000.mgt;
import p000.mgu;
import p000.mgv;
import p000.mgx;
import p000.mgy;
import p000.mhd;
import p000.mjc;
import p000.mjd;
import p000.mje;
import p000.mkv;
import p000.mkx;
import p000.mlc;
import p000.ogp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior extends aai {

    /* JADX INFO: renamed from: A */
    public int f8075A;

    /* JADX INFO: renamed from: B */
    public WeakReference f8076B;

    /* JADX INFO: renamed from: C */
    public WeakReference f8077C;

    /* JADX INFO: renamed from: D */
    public final ArrayList f8078D;

    /* JADX INFO: renamed from: E */
    public int f8079E;

    /* JADX INFO: renamed from: F */
    public boolean f8080F;

    /* JADX INFO: renamed from: G */
    final SparseIntArray f8081G;

    /* JADX INFO: renamed from: H */
    private int f8082H;

    /* JADX INFO: renamed from: I */
    private float f8083I;

    /* JADX INFO: renamed from: J */
    private boolean f8084J;

    /* JADX INFO: renamed from: K */
    private int f8085K;

    /* JADX INFO: renamed from: L */
    private int f8086L;

    /* JADX INFO: renamed from: M */
    private ColorStateList f8087M;

    /* JADX INFO: renamed from: N */
    private int f8088N;

    /* JADX INFO: renamed from: O */
    private boolean f8089O;

    /* JADX INFO: renamed from: P */
    private boolean f8090P;

    /* JADX INFO: renamed from: Q */
    private boolean f8091Q;

    /* JADX INFO: renamed from: R */
    private mlc f8092R;

    /* JADX INFO: renamed from: S */
    private boolean f8093S;

    /* JADX INFO: renamed from: T */
    private final mgy f8094T;

    /* JADX INFO: renamed from: U */
    private ValueAnimator f8095U;

    /* JADX INFO: renamed from: V */
    private boolean f8096V;

    /* JADX INFO: renamed from: W */
    private int f8097W;

    /* JADX INFO: renamed from: X */
    private boolean f8098X;

    /* JADX INFO: renamed from: Y */
    private final float f8099Y;

    /* JADX INFO: renamed from: Z */
    private int f8100Z;

    /* JADX INFO: renamed from: a */
    public boolean f8101a;

    /* JADX INFO: renamed from: aa */
    private VelocityTracker f8102aa;

    /* JADX INFO: renamed from: ab */
    private int f8103ab;

    /* JADX INFO: renamed from: ac */
    private Map f8104ac;

    /* JADX INFO: renamed from: ad */
    private final ahz f8105ad;

    /* JADX INFO: renamed from: b */
    public int f8106b;

    /* JADX INFO: renamed from: c */
    public int f8107c;

    /* JADX INFO: renamed from: d */
    public mkx f8108d;

    /* JADX INFO: renamed from: e */
    public int f8109e;

    /* JADX INFO: renamed from: f */
    public int f8110f;

    /* JADX INFO: renamed from: g */
    public boolean f8111g;

    /* JADX INFO: renamed from: h */
    public boolean f8112h;

    /* JADX INFO: renamed from: i */
    public boolean f8113i;

    /* JADX INFO: renamed from: j */
    public boolean f8114j;

    /* JADX INFO: renamed from: k */
    public boolean f8115k;

    /* JADX INFO: renamed from: l */
    public boolean f8116l;

    /* JADX INFO: renamed from: m */
    public int f8117m;

    /* JADX INFO: renamed from: n */
    public int f8118n;

    /* JADX INFO: renamed from: o */
    int f8119o;

    /* JADX INFO: renamed from: p */
    public int f8120p;

    /* JADX INFO: renamed from: q */
    public int f8121q;

    /* JADX INFO: renamed from: r */
    float f8122r;

    /* JADX INFO: renamed from: s */
    public int f8123s;

    /* JADX INFO: renamed from: t */
    float f8124t;

    /* JADX INFO: renamed from: u */
    public boolean f8125u;

    /* JADX INFO: renamed from: v */
    public boolean f8126v;

    /* JADX INFO: renamed from: w */
    public boolean f8127w;

    /* JADX INFO: renamed from: x */
    public int f8128x;

    /* JADX INFO: renamed from: y */
    public aia f8129y;

    /* JADX INFO: renamed from: z */
    int f8130z;

    public BottomSheetBehavior() {
        this.f8082H = 0;
        this.f8101a = true;
        this.f8088N = -1;
        this.f8109e = -1;
        this.f8094T = new mgy(this);
        this.f8122r = 0.5f;
        this.f8124t = -1.0f;
        this.f8127w = true;
        this.f8128x = 4;
        this.f8099Y = 0.1f;
        this.f8078D = new ArrayList();
        this.f8081G = new SparseIntArray();
        this.f8105ad = new mgt(this);
    }

    /* JADX INFO: renamed from: I */
    private final int m4793I() {
        int i;
        if (this.f8084J) {
            return Math.min(Math.max(this.f8085K, this.f8075A - ((this.f8130z * 9) / 16)), this.f8100Z) + this.f8117m;
        }
        return (this.f8089O || this.f8111g || (i = this.f8110f) <= 0) ? this.f8107c + this.f8117m : Math.max(this.f8107c, i + this.f8086L);
    }

    /* JADX INFO: renamed from: J */
    private final int m4794J(int i) {
        switch (i) {
            case 3:
                return m4814u();
            case 4:
                return this.f8123s;
            case 5:
                return this.f8075A;
            default:
                return this.f8121q;
        }
    }

    /* JADX INFO: renamed from: K */
    private final ahc m4795K(int i) {
        return new mgu(this, i);
    }

    /* JADX INFO: renamed from: L */
    private final void m4796L() {
        int iM4793I = m4793I();
        if (this.f8101a) {
            this.f8123s = Math.max(this.f8075A - iM4793I, this.f8120p);
        } else {
            this.f8123s = this.f8075A - iM4793I;
        }
    }

    /* JADX INFO: renamed from: M */
    private final void m4797M() {
        this.f8121q = (int) (this.f8075A * (1.0f - this.f8122r));
    }

    /* JADX INFO: renamed from: N */
    private final void m4798N(View view, agr agrVar, int i) {
        afq.m549i(view, agrVar, m4795K(i));
    }

    /* JADX INFO: renamed from: O */
    private final void m4799O() {
        this.f8079E = -1;
        VelocityTracker velocityTracker = this.f8102aa;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f8102aa = null;
        }
    }

    /* JADX INFO: renamed from: P */
    private final void m4800P() {
        View view;
        int iM619a;
        WeakReference weakReference = this.f8076B;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        afq.m546f(view, 524288);
        afq.m546f(view, 262144);
        afq.m546f(view, 1048576);
        int i = this.f8081G.get(0, -1);
        if (i != -1) {
            afq.m546f(view, i);
            this.f8081G.delete(0);
        }
        if (!this.f8101a && this.f8128x != 6) {
            SparseIntArray sparseIntArray = this.f8081G;
            String string = view.getResources().getString(C0100R.string.bottomsheet_action_expand_halfway);
            ahc ahcVarM4795K = m4795K(6);
            List listM544d = afq.m544d(view);
            int i2 = 0;
            while (true) {
                if (i2 >= listM544d.size()) {
                    int i3 = -1;
                    int i4 = 0;
                    while (true) {
                        int[] iArr = afq.f274a;
                        int length = iArr.length;
                        if (i4 >= 32 || i3 != -1) {
                            break;
                        }
                        i3 = iArr[i4];
                        boolean z = true;
                        for (int i5 = 0; i5 < listM544d.size(); i5++) {
                            z &= ((agr) listM544d.get(i5)).m619a() != i3;
                        }
                        if (true != z) {
                            i3 = -1;
                        }
                        i4++;
                    }
                    iM619a = i3;
                    break;
                }
                if (TextUtils.equals(string, ((agr) listM544d.get(i2)).m620b())) {
                    iM619a = ((agr) listM544d.get(i2)).m619a();
                    break;
                }
                i2++;
            }
            if (iM619a != -1) {
                afq.m545e(view, new agr(null, iM619a, string, ahcVarM4795K, null));
            }
            sparseIntArray.put(0, iM619a);
        }
        if (this.f8125u && this.f8128x != 5) {
            m4798N(view, agr.f345u, 5);
        }
        switch (this.f8128x) {
            case 3:
                m4798N(view, agr.f344t, true == this.f8101a ? 4 : 6);
                break;
            case 4:
                m4798N(view, agr.f343s, true == this.f8101a ? 3 : 6);
                break;
            case 6:
                m4798N(view, agr.f344t, 4);
                m4798N(view, agr.f343s, 3);
                break;
        }
    }

    /* JADX INFO: renamed from: Q */
    private final void m4801Q(int i, boolean z) {
        ValueAnimator valueAnimator;
        if (i != 2) {
            boolean z2 = this.f8128x == 3 && (this.f8091Q || m4814u() == 0);
            if (this.f8093S == z2 || this.f8108d == null) {
                return;
            }
            this.f8093S = z2;
            if (!z || (valueAnimator = this.f8095U) == null) {
                ValueAnimator valueAnimator2 = this.f8095U;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.f8095U.cancel();
                }
                this.f8108d.m16580j(true != this.f8093S ? 1.0f : 0.0f);
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f8095U.reverse();
                return;
            }
            float f = true != z2 ? 1.0f : 0.0f;
            this.f8095U.setFloatValues(1.0f - f, f);
            this.f8095U.start();
        }
    }

    /* JADX INFO: renamed from: R */
    private final void m4802R(boolean z) {
        WeakReference weakReference = this.f8076B;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f8104ac != null) {
                    return;
                } else {
                    this.f8104ac = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f8076B.get() && z) {
                    this.f8104ac.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.f8104ac = null;
        }
    }

    /* JADX INFO: renamed from: S */
    private final boolean m4803S() {
        if (this.f8129y != null) {
            return this.f8127w || this.f8128x == 1;
        }
        return false;
    }

    /* JADX INFO: renamed from: T */
    private static final int m4804T(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        switch (mode) {
            case 1073741824:
                return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
            default:
                if (size != 0) {
                    i3 = Math.min(size, i3);
                }
                return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
    }

    /* JADX INFO: renamed from: w */
    public static BottomSheetBehavior m4805w(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof aal)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        aai aaiVar = ((aal) layoutParams).f14a;
        if (aaiVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) aaiVar;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    /* JADX INFO: renamed from: A */
    public final void m4806A(boolean z) {
        if (this.f8125u != z) {
            this.f8125u = z;
            if (!z && this.f8128x == 5) {
                m4808C(4);
            }
            m4800P();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m4808C(int i) {
        if (!this.f8125u && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: 5");
            return;
        }
        int i2 = (i == 6 && this.f8101a && m4794J(6) <= this.f8120p) ? 3 : i;
        WeakReference weakReference = this.f8076B;
        if (weakReference == null || weakReference.get() == null) {
            m4809D(i);
            return;
        }
        View view = (View) this.f8076B.get();
        ogp ogpVar = new ogp(this, view, i2, 1);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && afe.m461e(view)) {
            view.post(ogpVar);
        } else {
            ogpVar.run();
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m4809D(int i) {
        View view;
        if (this.f8128x == i) {
            return;
        }
        this.f8128x = i;
        int i2 = 4;
        if (i != 4 && i != 3 && i != 6 && this.f8125u && i == 5) {
            i = 5;
        }
        WeakReference weakReference = this.f8076B;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            m4802R(true);
        } else {
            if (i == 6 || i == 5) {
                i2 = i;
            } else if (i == 4) {
            }
            m4802R(false);
            i = i2;
        }
        m4801Q(i, true);
        for (int i3 = 0; i3 < this.f8078D.size(); i3++) {
            ((mgv) this.f8078D.get(i3)).mo16362b(view, i);
        }
        m4800P();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.m748i(r3.getLeft(), r0) != false) goto L15;
     */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4810E(View view, int i, boolean z) {
        int iM4794J = m4794J(i);
        aia aiaVar = this.f8129y;
        if (aiaVar != null) {
            if (!z) {
                int left = view.getLeft();
                aiaVar.f405d = view;
                aiaVar.f404c = -1;
                if (!aiaVar.m746g(left, iM4794J, 0, 0)) {
                    if (aiaVar.f402a == 0 && aiaVar.f405d != null) {
                        aiaVar.f405d = null;
                    }
                }
                m4809D(2);
                m4801Q(i, true);
                this.f8094T.m16364a(i);
                return;
            }
        }
        m4809D(i);
    }

    /* JADX INFO: renamed from: F */
    public final boolean m4811F() {
        return this.f8125u;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m4812G(View view, float f) {
        if (this.f8126v) {
            return true;
        }
        if (view.getTop() < this.f8123s) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f * this.f8099Y)) - ((float) this.f8123s)) / ((float) m4793I()) > 0.5f;
    }

    /* JADX INFO: renamed from: H */
    public final void m4813H() {
        View view;
        if (this.f8076B != null) {
            m4796L();
            if (this.f8128x != 4 || (view = (View) this.f8076B.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // p000.aai
    /* JADX INFO: renamed from: a */
    public final void mo4a(aal aalVar) {
        this.f8076B = null;
        this.f8129y = null;
    }

    @Override // p000.aai
    /* JADX INFO: renamed from: b */
    public final void mo5b() {
        this.f8076B = null;
        this.f8129y = null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x0088  */
    /* JADX WARN: Code duplicated, block: B:46:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x0099  */
    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    /* JADX WARN: Code duplicated, block: B:50:0x009f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b6  */
    @Override // p000.aai
    /* JADX INFO: renamed from: c */
    public final void mo6c(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        int top;
        int top2;
        int i2;
        float yVelocity;
        int i3 = 3;
        if (view.getTop() == m4814u()) {
            m4809D(3);
            return;
        }
        WeakReference weakReference = this.f8077C;
        if (weakReference != null && view2 == weakReference.get() && this.f8098X) {
            if (this.f8097W > 0) {
                if (!this.f8101a && view.getTop() > this.f8121q) {
                    i3 = 6;
                }
            } else if (this.f8125u) {
                VelocityTracker velocityTracker = this.f8102aa;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f8083I);
                    yVelocity = this.f8102aa.getYVelocity(this.f8079E);
                }
                if (m4812G(view, yVelocity)) {
                    i3 = 5;
                } else if (this.f8097W == 0) {
                    top2 = view.getTop();
                    if (this.f8101a) {
                        i2 = this.f8121q;
                        if (top2 < i2) {
                            if (top2 >= Math.abs(top2 - this.f8123s)) {
                                i3 = 6;
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.f8123s)) {
                            i3 = 6;
                        } else {
                            i3 = 4;
                        }
                    } else if (Math.abs(top2 - this.f8120p) >= Math.abs(top2 - this.f8123s)) {
                        i3 = 4;
                    }
                } else if (this.f8101a) {
                    i3 = 4;
                } else {
                    top = view.getTop();
                    if (Math.abs(top - this.f8121q) < Math.abs(top - this.f8123s)) {
                        i3 = 6;
                    } else {
                        i3 = 4;
                    }
                }
            } else if (this.f8097W == 0) {
                top2 = view.getTop();
                if (this.f8101a) {
                    i2 = this.f8121q;
                    if (top2 < i2) {
                        if (top2 >= Math.abs(top2 - this.f8123s)) {
                            i3 = 6;
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.f8123s)) {
                        i3 = 6;
                    } else {
                        i3 = 4;
                    }
                } else if (Math.abs(top2 - this.f8120p) >= Math.abs(top2 - this.f8123s)) {
                    i3 = 4;
                }
            } else if (this.f8101a) {
                i3 = 4;
            } else {
                top = view.getTop();
                if (Math.abs(top - this.f8121q) < Math.abs(top - this.f8123s)) {
                    i3 = 6;
                } else {
                    i3 = 4;
                }
            }
            m4810E(view, i3, false);
            this.f8098X = false;
        }
    }

    @Override // p000.aai
    /* JADX INFO: renamed from: d */
    public final boolean mo7d(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        aia aiaVar;
        if (!view.isShown() || !this.f8127w) {
            this.f8096V = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m4799O();
            actionMasked = 0;
        }
        if (this.f8102aa == null) {
            this.f8102aa = VelocityTracker.obtain();
        }
        this.f8102aa.addMovement(motionEvent);
        switch (actionMasked) {
            case 0:
                int x = (int) motionEvent.getX();
                this.f8103ab = (int) motionEvent.getY();
                if (this.f8128x != 2) {
                    WeakReference weakReference = this.f8077C;
                    View view2 = weakReference != null ? (View) weakReference.get() : null;
                    if (view2 != null && coordinatorLayout.m1427k(view2, x, this.f8103ab)) {
                        this.f8079E = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f8080F = true;
                    }
                }
                this.f8096V = this.f8079E == -1 && !coordinatorLayout.m1427k(view, x, this.f8103ab);
                break;
            case 1:
            case 3:
                this.f8080F = false;
                this.f8079E = -1;
                if (this.f8096V) {
                    this.f8096V = false;
                    return false;
                }
                break;
        }
        if (!this.f8096V && (aiaVar = this.f8129y) != null && aiaVar.m749j(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f8077C;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f8096V || this.f8128x == 1 || coordinatorLayout.m1427k(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f8129y == null || Math.abs(((float) this.f8103ab) - motionEvent.getY()) <= ((float) this.f8129y.f403b)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    @Override // p000.aai
    /* JADX INFO: renamed from: e */
    public final boolean mo8e(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (afb.m435p(coordinatorLayout) && !afb.m435p(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f8076B == null) {
            this.f8085K = coordinatorLayout.getResources().getDimensionPixelSize(C0100R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (this.f8089O || this.f8084J) ? false : true;
            if (this.f8111g || this.f8112h || this.f8113i || this.f8114j || this.f8115k || this.f8116l) {
                afh.m483n(view, new mjc(new mgs(this, z), new mje(afc.m444e(view), view.getPaddingTop(), afc.m443d(view), view.getPaddingBottom())));
                if (afe.m461e(view)) {
                    aff.m467c(view);
                } else {
                    view.addOnAttachStateChangeListener(new mjd());
                }
            } else if (z) {
                z = true;
                afh.m483n(view, new mjc(new mgs(this, z), new mje(afc.m444e(view), view.getPaddingTop(), afc.m443d(view), view.getPaddingBottom())));
                if (afe.m461e(view)) {
                    aff.m467c(view);
                } else {
                    view.addOnAttachStateChangeListener(new mjd());
                }
            }
            this.f8076B = new WeakReference(view);
            mkx mkxVar = this.f8108d;
            if (mkxVar != null) {
                afb.m432m(view, mkxVar);
                mkx mkxVar2 = this.f8108d;
                float fM470a = this.f8124t;
                if (fM470a == -1.0f) {
                    fM470a = afh.m470a(view);
                }
                mkxVar2.m16578h(fM470a);
            } else {
                ColorStateList colorStateList = this.f8087M;
                if (colorStateList != null) {
                    afh.m479j(view, colorStateList);
                }
            }
            m4800P();
            if (afb.m420a(view) == 0) {
                afb.m434o(view, 1);
            }
        }
        if (this.f8129y == null) {
            this.f8129y = aia.m728b(coordinatorLayout, this.f8105ad);
        }
        int top = view.getTop();
        coordinatorLayout.m1426j(view, i);
        this.f8130z = coordinatorLayout.getWidth();
        this.f8075A = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f8100Z = height;
        int i2 = this.f8075A;
        int i3 = i2 - height;
        int i4 = this.f8118n;
        if (i3 < i4) {
            if (this.f8090P) {
                this.f8100Z = i2;
                height = i2;
            } else {
                height = i2 - i4;
                this.f8100Z = height;
            }
        }
        this.f8120p = Math.max(0, i2 - height);
        m4797M();
        m4796L();
        int i5 = this.f8128x;
        if (i5 == 3) {
            view.offsetTopAndBottom(m4814u());
        } else if (i5 == 6) {
            view.offsetTopAndBottom(this.f8121q);
        } else if (this.f8125u && i5 == 5) {
            view.offsetTopAndBottom(this.f8075A);
        } else if (i5 == 4) {
            view.offsetTopAndBottom(this.f8123s);
        } else if (i5 == 1 || i5 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        m4801Q(this.f8128x, false);
        this.f8077C = new WeakReference(m4815v(view));
        for (int i6 = 0; i6 < this.f8078D.size(); i6++) {
            ((mgv) this.f8078D.get(i6)).mo16361a(view);
        }
        return true;
    }

    @Override // p000.aai
    /* JADX INFO: renamed from: g */
    public final boolean mo10g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f8128x == 1 && actionMasked == 0) {
            return true;
        }
        if (m4803S()) {
            this.f8129y.m744e(motionEvent);
        }
        if (actionMasked == 0) {
            m4799O();
        }
        if (this.f8102aa == null) {
            this.f8102aa = VelocityTracker.obtain();
        }
        this.f8102aa.addMovement(motionEvent);
        if (m4803S() && actionMasked == 2 && !this.f8096V) {
            float fAbs = Math.abs(this.f8103ab - motionEvent.getY());
            aia aiaVar = this.f8129y;
            if (fAbs > aiaVar.f403b) {
                aiaVar.m743d(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f8096V;
    }

    @Override // p000.aai
    /* JADX INFO: renamed from: k */
    public final boolean mo14k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m4804T(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f8088N, marginLayoutParams.width), m4804T(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f8109e, marginLayoutParams.height));
        return true;
    }

    @Override // p000.aai
    /* JADX INFO: renamed from: l */
    public final boolean mo15l(View view) {
        WeakReference weakReference = this.f8077C;
        return (weakReference == null || view != weakReference.get() || this.f8128x == 3) ? false : true;
    }

    @Override // p000.aai
    /* JADX INFO: renamed from: m */
    public final void mo16m(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
        if (i2 == 1) {
            return;
        }
        WeakReference weakReference = this.f8077C;
        if (view2 == (weakReference != null ? (View) weakReference.get() : null)) {
            int top = view.getTop();
            int i3 = top - i;
            if (i > 0) {
                if (i3 < m4814u()) {
                    int iM4814u = top - m4814u();
                    iArr[1] = iM4814u;
                    int[] iArr2 = afq.f274a;
                    view.offsetTopAndBottom(-iM4814u);
                    m4809D(3);
                } else {
                    if (!this.f8127w) {
                        return;
                    }
                    iArr[1] = i;
                    int[] iArr3 = afq.f274a;
                    view.offsetTopAndBottom(-i);
                    m4809D(1);
                }
            } else if (i < 0 && !view2.canScrollVertically(-1)) {
                int i4 = this.f8123s;
                if (i3 > i4 && !m4811F()) {
                    int i5 = top - i4;
                    iArr[1] = i5;
                    int[] iArr4 = afq.f274a;
                    view.offsetTopAndBottom(-i5);
                    m4809D(4);
                } else {
                    if (!this.f8127w) {
                        return;
                    }
                    iArr[1] = i;
                    int[] iArr5 = afq.f274a;
                    view.offsetTopAndBottom(-i);
                    m4809D(1);
                }
            }
            m4817y(view.getTop());
            this.f8097W = i;
            this.f8098X = true;
        }
    }

    @Override // p000.aai
    /* JADX INFO: renamed from: n */
    public final void mo17n(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // p000.aai
    /* JADX INFO: renamed from: o */
    public final void mo18o(View view, Parcelable parcelable) {
        mgx mgxVar = (mgx) parcelable;
        int i = this.f8082H;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f8107c = mgxVar.f40462b;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f8101a = mgxVar.f40463e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f8125u = mgxVar.f40464f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f8126v = mgxVar.f40465g;
            }
        }
        int i2 = mgxVar.f40461a;
        if (i2 == 1 || i2 == 2) {
            this.f8128x = 4;
        } else {
            this.f8128x = i2;
        }
    }

    @Override // p000.aai
    /* JADX INFO: renamed from: p */
    public final Parcelable mo19p(View view) {
        return new mgx(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // p000.aai
    /* JADX INFO: renamed from: q */
    public final boolean mo20q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        this.f8097W = 0;
        this.f8098X = false;
        return (i & 2) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final int m4814u() {
        if (this.f8101a) {
            return this.f8120p;
        }
        return Math.max(this.f8119o, this.f8090P ? 0 : this.f8118n);
    }

    /* JADX INFO: renamed from: v */
    final View m4815v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (afh.m494y(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewM4815v = m4815v(viewGroup.getChildAt(i));
                if (viewM4815v != null) {
                    return viewM4815v;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public final void m4816x(mgv mgvVar) {
        if (this.f8078D.contains(mgvVar)) {
            return;
        }
        this.f8078D.add(mgvVar);
    }

    /* JADX INFO: renamed from: y */
    public final void m4817y(int i) {
        View view = (View) this.f8076B.get();
        if (view == null || this.f8078D.isEmpty()) {
            return;
        }
        int i2 = this.f8123s;
        if (i <= i2 && i2 != m4814u()) {
            m4814u();
        }
        for (int i3 = 0; i3 < this.f8078D.size(); i3++) {
            ((mgv) this.f8078D.get(i3)).mo16363c(view);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m4818z(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f8119o = i;
        m4801Q(this.f8128x, true);
    }

    /* JADX INFO: renamed from: B */
    public final void m4807B(int i) {
        if (i == -1) {
            if (this.f8084J) {
                return;
            } else {
                this.f8084J = true;
            }
        } else {
            if (!this.f8084J && this.f8107c == i) {
                return;
            }
            this.f8084J = false;
            this.f8107c = Math.max(0, i);
        }
        m4813H();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8082H = 0;
        this.f8101a = true;
        this.f8088N = -1;
        this.f8109e = -1;
        this.f8094T = new mgy(this);
        this.f8122r = 0.5f;
        this.f8124t = -1.0f;
        this.f8127w = true;
        this.f8128x = 4;
        this.f8099Y = 0.1f;
        this.f8078D = new ArrayList();
        this.f8081G = new SparseIntArray();
        this.f8105ad = new mgt(this);
        this.f8086L = context.getResources().getDimensionPixelSize(C0100R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mhd.f40488a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f8087M = mkv.m16540d(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.f8092R = mlc.m16590a(context, attributeSet, C0100R.attr.bottomSheetStyle, C0100R.style.Widget_Design_BottomSheet_Modal).m16589a();
        }
        if (this.f8092R != null) {
            mkx mkxVar = new mkx(this.f8092R);
            this.f8108d = mkxVar;
            mkxVar.m16577g(context);
            ColorStateList colorStateList = this.f8087M;
            if (colorStateList != null) {
                this.f8108d.m16579i(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.f8108d.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f8095U = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f8095U.addUpdateListener(new mgr(this, 0));
        this.f8124t = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f8088N = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f8109e = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue == null || typedValuePeekValue.data != -1) {
            m4807B(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            m4807B(typedValuePeekValue.data);
        }
        m4806A(typedArrayObtainStyledAttributes.getBoolean(8, false));
        this.f8089O = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f8101a != z) {
            this.f8101a = z;
            if (this.f8076B != null) {
                m4796L();
            }
            m4809D((this.f8101a && this.f8128x == 6) ? 3 : this.f8128x);
            m4801Q(this.f8128x, true);
            m4800P();
        }
        this.f8126v = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.f8127w = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f8082H = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f8122r = f;
        if (this.f8076B != null) {
            m4797M();
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            m4818z(typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0));
        } else {
            m4818z(typedValuePeekValue2.data);
        }
        this.f8106b = typedArrayObtainStyledAttributes.getInt(11, 500);
        this.f8111g = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.f8112h = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.f8113i = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.f8090P = typedArrayObtainStyledAttributes.getBoolean(20, true);
        this.f8114j = typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f8115k = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.f8116l = typedArrayObtainStyledAttributes.getBoolean(16, false);
        this.f8091Q = typedArrayObtainStyledAttributes.getBoolean(23, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f8083I = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
