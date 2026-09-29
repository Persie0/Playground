package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.R$styleable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class y28 {

    /* JADX INFO: renamed from: a */
    public u8a f69171a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f69172b;

    /* JADX INFO: renamed from: c */
    public final qfa f69173c;

    /* JADX INFO: renamed from: d */
    public final qfa f69174d;

    /* JADX INFO: renamed from: e */
    public fd5 f69175e;

    /* JADX INFO: renamed from: f */
    public boolean f69176f;

    /* JADX INFO: renamed from: g */
    public boolean f69177g;

    /* JADX INFO: renamed from: h */
    public final boolean f69178h;

    /* JADX INFO: renamed from: i */
    public final boolean f69179i;

    /* JADX INFO: renamed from: j */
    public int f69180j;

    /* JADX INFO: renamed from: k */
    public boolean f69181k;

    /* JADX INFO: renamed from: l */
    public int f69182l;

    /* JADX INFO: renamed from: m */
    public int f69183m;

    /* JADX INFO: renamed from: n */
    public int f69184n;

    /* JADX INFO: renamed from: o */
    public int f69185o;

    public y28() {
        cc4 cc4Var = new cc4(this);
        or3 or3Var = new or3(this);
        this.f69173c = new qfa(cc4Var);
        this.f69174d = new qfa(or3Var);
        this.f69176f = false;
        this.f69177g = false;
        this.f69178h = true;
        this.f69179i = true;
    }

    /* JADX INFO: renamed from: A */
    public static int m24873A(View view) {
        return view.getLeft() - ((z28) view.getLayoutParams()).f70800b.left;
    }

    /* JADX INFO: renamed from: B */
    public static int m24874B(View view) {
        Rect rect = ((z28) view.getLayoutParams()).f70800b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    /* JADX INFO: renamed from: C */
    public static int m24875C(View view) {
        Rect rect = ((z28) view.getLayoutParams()).f70800b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    /* JADX INFO: renamed from: D */
    public static int m24876D(View view) {
        return view.getRight() + ((z28) view.getLayoutParams()).f70800b.right;
    }

    /* JADX INFO: renamed from: E */
    public static int m24877E(View view) {
        return view.getTop() - ((z28) view.getLayoutParams()).f70800b.top;
    }

    /* JADX INFO: renamed from: K */
    public static int m24878K(View view) {
        return ((z28) view.getLayoutParams()).f70799a.m17784d();
    }

    /* JADX INFO: renamed from: L */
    public static x28 m24879L(Context context, AttributeSet attributeSet, int i, int i2) {
        x28 x28Var = new x28();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RecyclerView, i, i2);
        x28Var.f67679a = typedArrayObtainStyledAttributes.getInt(R$styleable.RecyclerView_android_orientation, 1);
        x28Var.f67680b = typedArrayObtainStyledAttributes.getInt(R$styleable.RecyclerView_spanCount, 1);
        x28Var.f67681c = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RecyclerView_reverseLayout, false);
        x28Var.f67682d = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RecyclerView_stackFromEnd, false);
        typedArrayObtainStyledAttributes.recycle();
        return x28Var;
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m24880Q(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    /* JADX INFO: renamed from: R */
    public static void m24881R(View view, int i, int i2, int i3, int i4) {
        z28 z28Var = (z28) view.getLayoutParams();
        Rect rect = z28Var.f70800b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) z28Var).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) z28Var).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) z28Var).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) z28Var).bottomMargin);
    }

    /* JADX INFO: renamed from: g */
    public static int m24882g(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    /* JADX INFO: renamed from: w */
    public static int m24883w(boolean z, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                i2 = 0;
                i4 = 0;
            } else {
                i4 = iMax;
            }
        } else if (i4 >= 0) {
            i2 = 1073741824;
        } else if (i4 == -1) {
            i4 = iMax;
        } else if (i4 != -2) {
            i2 = 0;
            i4 = 0;
        } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
            i4 = iMax;
            i2 = Integer.MIN_VALUE;
        } else {
            i4 = iMax;
            i2 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    /* JADX INFO: renamed from: y */
    public static int m24884y(View view) {
        return view.getBottom() + ((z28) view.getLayoutParams()).f70800b.bottom;
    }

    /* JADX INFO: renamed from: A0 */
    public void mo2610A0(Rect rect, int i, int i2) {
        int iM24893I = m24893I() + m24891H() + rect.width();
        int iM24890G = m24890G() + m24894J() + rect.height();
        RecyclerView recyclerView = this.f69172b;
        WeakHashMap weakHashMap = dta.f36217a;
        this.f69172b.setMeasuredDimension(m24882g(i, iM24893I, recyclerView.getMinimumWidth()), m24882g(i2, iM24890G, this.f69172b.getMinimumHeight()));
    }

    /* JADX INFO: renamed from: B0 */
    public final void m24885B0(int i, int i2) {
        int iM24906v = m24906v();
        if (iM24906v == 0) {
            this.f69172b.m2755q(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iM24906v; i7++) {
            View viewM24904u = m24904u(i7);
            Rect rect = this.f69172b.f6661j;
            mo6097z(viewM24904u, rect);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.f69172b.f6661j.set(i6, i4, i3, i5);
        mo2610A0(this.f69172b.f6661j, i, i2);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m24886C0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f69172b = null;
            this.f69171a = null;
            this.f69184n = 0;
            this.f69185o = 0;
        } else {
            this.f69172b = recyclerView;
            this.f69171a = recyclerView.f6653f;
            this.f69184n = recyclerView.getWidth();
            this.f69185o = recyclerView.getHeight();
        }
        this.f69182l = 1073741824;
        this.f69183m = 1073741824;
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m24887D0(View view, int i, int i2, z28 z28Var) {
        return (!view.isLayoutRequested() && this.f69178h && m24880Q(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) z28Var).width) && m24880Q(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) z28Var).height)) ? false : true;
    }

    /* JADX INFO: renamed from: E0 */
    public boolean mo2653E0() {
        return false;
    }

    /* JADX INFO: renamed from: F */
    public final int m24888F() {
        RecyclerView recyclerView = this.f69172b;
        p28 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.mo6133a();
        }
        return 0;
    }

    /* JADX INFO: renamed from: F0 */
    public final boolean m24889F0(View view, int i, int i2, z28 z28Var) {
        return (this.f69178h && m24880Q(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) z28Var).width) && m24880Q(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) z28Var).height)) ? false : true;
    }

    /* JADX INFO: renamed from: G */
    public final int m24890G() {
        RecyclerView recyclerView = this.f69172b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    /* JADX INFO: renamed from: G0 */
    public abstract void mo2654G0(RecyclerView recyclerView, int i);

    /* JADX INFO: renamed from: H */
    public final int m24891H() {
        RecyclerView recyclerView = this.f69172b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    /* JADX INFO: renamed from: H0 */
    public final void m24892H0(fd5 fd5Var) {
        fd5 fd5Var2 = this.f69175e;
        if (fd5Var2 != null && fd5Var != fd5Var2 && fd5Var2.m11781i()) {
            this.f69175e.m11787o();
        }
        this.f69175e = fd5Var;
        fd5Var.m11786n(this.f69172b, this);
    }

    /* JADX INFO: renamed from: I */
    public final int m24893I() {
        RecyclerView recyclerView = this.f69172b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: I0 */
    public boolean mo2613I0() {
        return false;
    }

    /* JADX INFO: renamed from: J */
    public final int m24894J() {
        RecyclerView recyclerView = this.f69172b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: M */
    public int mo2615M(g38 g38Var, k38 k38Var) {
        RecyclerView recyclerView = this.f69172b;
        if (recyclerView == null || recyclerView.f6611H == null || !mo2680e()) {
            return 1;
        }
        return this.f69172b.f6611H.mo6133a();
    }

    /* JADX INFO: renamed from: N */
    public final void m24895N(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((z28) view.getLayoutParams()).f70800b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f69172b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f69172b.f6665l;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* JADX INFO: renamed from: O */
    public abstract boolean mo2659O();

    /* JADX INFO: renamed from: P */
    public boolean mo2661P() {
        return false;
    }

    /* JADX INFO: renamed from: S */
    public void mo2776S(int i) {
        RecyclerView recyclerView = this.f69172b;
        if (recyclerView != null) {
            int iM22544e = recyclerView.f6653f.m22544e();
            for (int i2 = 0; i2 < iM22544e; i2++) {
                recyclerView.f6653f.m22543d(i2).offsetLeftAndRight(i);
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public void mo2778T(int i) {
        RecyclerView recyclerView = this.f69172b;
        if (recyclerView != null) {
            int iM22544e = recyclerView.f6653f.m22544e();
            for (int i2 = 0; i2 < iM22544e; i2++) {
                recyclerView.f6653f.m22543d(i2).offsetTopAndBottom(i);
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public void mo2780U() {
    }

    /* JADX INFO: renamed from: V */
    public void mo6095V(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: W */
    public abstract void mo2669W(RecyclerView recyclerView);

    /* JADX INFO: renamed from: X */
    public abstract View mo2616X(View view, int i, g38 g38Var, k38 k38Var);

    /* JADX INFO: renamed from: Y */
    public void mo2671Y(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f69172b;
        g38 g38Var = recyclerView.f6647c;
        k38 k38Var = recyclerView.f6606C0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.f69172b.canScrollVertically(-1) && !this.f69172b.canScrollHorizontally(-1) && !this.f69172b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        p28 p28Var = this.f69172b.f6611H;
        if (p28Var != null) {
            accessibilityEvent.setItemCount(p28Var.mo6133a());
        }
    }

    /* JADX INFO: renamed from: Z */
    public void mo2618Z(g38 g38Var, k38 k38Var, C0797b4 c0797b4) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0797b4.f7900a;
        if (this.f69172b.canScrollVertically(-1) || this.f69172b.canScrollHorizontally(-1)) {
            c0797b4.m3271a(8192);
            c0797b4.m3282m(true);
            Bundle extras = accessibilityNodeInfo.getExtras();
            if (extras != null) {
                extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-67108865)) | 67108864);
            }
        }
        if (this.f69172b.canScrollVertically(1) || this.f69172b.canScrollHorizontally(1)) {
            c0797b4.m3271a(4096);
            c0797b4.m3282m(true);
            Bundle extras2 = accessibilityNodeInfo.getExtras();
            if (extras2 != null) {
                extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-67108865)) | 67108864);
            }
        }
        c0797b4.m3280k(C0006a4.m94b(mo2615M(g38Var, k38Var), mo2648x(g38Var, k38Var), 0));
    }

    /* JADX INFO: renamed from: a0 */
    public void mo2619a0(g38 g38Var, k38 k38Var, View view, C0797b4 c0797b4) {
        c0797b4.m3281l(m58.m16638l(false, mo2680e() ? m24878K(view) : 0, 1, mo2679d() ? m24878K(view) : 0, 1));
    }

    /* JADX INFO: renamed from: b */
    public final void m24896b(View view, int i, boolean z) {
        o38 o38VarM2699N = RecyclerView.m2699N(view);
        if (z || o38VarM2699N.m17790j()) {
            l79 l79Var = (l79) this.f69172b.f6655g.f57705a;
            qta qtaVarM20161a = (qta) l79Var.get(o38VarM2699N);
            if (qtaVarM20161a == null) {
                qtaVarM20161a = qta.m20161a();
                l79Var.put(o38VarM2699N, qtaVarM20161a);
            }
            qtaVarM20161a.f58200a |= 1;
        } else {
            this.f69172b.f6655g.m19910j(o38VarM2699N);
        }
        z28 z28Var = (z28) view.getLayoutParams();
        if (o38VarM2699N.m17798r() || o38VarM2699N.m17791k()) {
            if (o38VarM2699N.m17791k()) {
                o38VarM2699N.f53794n.m12341m(o38VarM2699N);
            } else {
                o38VarM2699N.f53790j &= -33;
            }
            this.f69171a.m22541b(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.f69172b;
            u8a u8aVar = this.f69171a;
            if (parent == recyclerView) {
                s01 s01Var = (s01) u8aVar.f63595d;
                int iIndexOfChild = ((n28) u8aVar.f63594c).f52241a.indexOfChild(view);
                int iM20991b = (iIndexOfChild == -1 || s01Var.m20993d(iIndexOfChild)) ? -1 : iIndexOfChild - s01Var.m20991b(iIndexOfChild);
                if (i == -1) {
                    i = this.f69171a.m22544e();
                }
                if (iM20991b == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f69172b.indexOfChild(view) + this.f69172b.m2710C());
                }
                if (iM20991b != i) {
                    y28 y28Var = this.f69172b.f6613I;
                    View viewM24904u = y28Var.m24904u(iM20991b);
                    if (viewM24904u == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iM20991b + y28Var.f69172b.toString());
                    }
                    y28Var.m24904u(iM20991b);
                    y28Var.f69171a.m22542c(iM20991b);
                    z28 z28Var2 = (z28) viewM24904u.getLayoutParams();
                    o38 o38VarM2699N2 = RecyclerView.m2699N(viewM24904u);
                    boolean zM17790j = o38VarM2699N2.m17790j();
                    RecyclerView recyclerView2 = y28Var.f69172b;
                    if (zM17790j) {
                        l79 l79Var2 = (l79) recyclerView2.f6655g.f57705a;
                        qta qtaVarM20161a2 = (qta) l79Var2.get(o38VarM2699N2);
                        if (qtaVarM20161a2 == null) {
                            qtaVarM20161a2 = qta.m20161a();
                            l79Var2.put(o38VarM2699N2, qtaVarM20161a2);
                        }
                        qtaVarM20161a2.f58200a = 1 | qtaVarM20161a2.f58200a;
                    } else {
                        recyclerView2.f6655g.m19910j(o38VarM2699N2);
                    }
                    y28Var.f69171a.m22541b(viewM24904u, i, z28Var2, o38VarM2699N2.m17790j());
                }
            } else {
                u8aVar.m22540a(view, i, false);
                z28Var.f70801c = true;
                fd5 fd5Var = this.f69175e;
                if (fd5Var != null && fd5Var.m11781i()) {
                    this.f69175e.m11783k(view);
                }
            }
        }
        if (z28Var.f70802d) {
            if (RecyclerView.f6596Y0) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + z28Var.f70799a);
            }
            o38VarM2699N.f53781a.invalidate();
            z28Var.f70802d = false;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m24897b0(View view, C0797b4 c0797b4) {
        o38 o38VarM2699N = RecyclerView.m2699N(view);
        if (o38VarM2699N == null || o38VarM2699N.m17790j()) {
            return;
        }
        u8a u8aVar = this.f69171a;
        if (((ArrayList) u8aVar.f63596e).contains(o38VarM2699N.f53781a)) {
            return;
        }
        RecyclerView recyclerView = this.f69172b;
        mo2619a0(recyclerView.f6647c, recyclerView.f6606C0, view, c0797b4);
    }

    /* JADX INFO: renamed from: c */
    public void mo2677c(String str) {
        RecyclerView recyclerView = this.f69172b;
        if (recyclerView != null) {
            recyclerView.m2745k(str);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void mo2620c0(int i, int i2) {
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo2679d();

    /* JADX INFO: renamed from: d0 */
    public void mo2621d0() {
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo2680e();

    /* JADX INFO: renamed from: e0 */
    public void mo2623e0(int i, int i2) {
    }

    /* JADX INFO: renamed from: f */
    public boolean mo2625f(z28 z28Var) {
        return z28Var != null;
    }

    /* JADX INFO: renamed from: f0 */
    public void mo2626f0(int i, int i2) {
    }

    /* JADX INFO: renamed from: g0 */
    public void mo2627g0(int i, int i2) {
    }

    /* JADX INFO: renamed from: h */
    public void mo2683h(int i, int i2, k38 k38Var, pj3 pj3Var) {
    }

    /* JADX INFO: renamed from: h0 */
    public abstract void mo2628h0(g38 g38Var, k38 k38Var);

    /* JADX INFO: renamed from: i */
    public void mo2685i(int i, pj3 pj3Var) {
    }

    /* JADX INFO: renamed from: i0 */
    public abstract void mo2629i0(k38 k38Var);

    /* JADX INFO: renamed from: j */
    public abstract int mo2687j(k38 k38Var);

    /* JADX INFO: renamed from: j0 */
    public void mo2688j0(Parcelable parcelable) {
    }

    /* JADX INFO: renamed from: k */
    public abstract int mo2630k(k38 k38Var);

    /* JADX INFO: renamed from: k0 */
    public Parcelable mo2690k0() {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public abstract int mo2631l(k38 k38Var);

    /* JADX INFO: renamed from: l0 */
    public void mo2796l0(int i) {
    }

    /* JADX INFO: renamed from: m */
    public abstract int mo2692m(k38 k38Var);

    /* JADX INFO: renamed from: m0 */
    public boolean mo2633m0(int i, Bundle bundle) {
        RecyclerView recyclerView = this.f69172b;
        return mo20179n0(recyclerView.f6647c, recyclerView.f6606C0, i, bundle);
    }

    /* JADX INFO: renamed from: n */
    public abstract int mo2634n(k38 k38Var);

    /* JADX WARN: Code duplicated, block: B:21:0x0062 A[PHI: r8
      0x0062: PHI (r8v8 int) = (r8v5 int), (r8v20 int) binds: [B:27:0x007e, B:19:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: n0 */
    public boolean mo20179n0(g38 g38Var, k38 k38Var, int i, Bundle bundle) {
        int iM24894J;
        int iM24891H;
        float f;
        if (this.f69172b != null) {
            int iHeight = this.f69185o;
            int iWidth = this.f69184n;
            Rect rect = new Rect();
            if (this.f69172b.getMatrix().isIdentity() && this.f69172b.getGlobalVisibleRect(rect)) {
                iHeight = rect.height();
                iWidth = rect.width();
            }
            if (i == 4096) {
                iM24894J = this.f69172b.canScrollVertically(1) ? (iHeight - m24894J()) - m24890G() : 0;
                if (this.f69172b.canScrollHorizontally(1)) {
                    iM24891H = (iWidth - m24891H()) - m24893I();
                } else {
                    iM24891H = 0;
                }
            } else if (i != 8192) {
                iM24894J = 0;
                iM24891H = 0;
            } else {
                iM24894J = this.f69172b.canScrollVertically(-1) ? -((iHeight - m24894J()) - m24890G()) : 0;
                if (this.f69172b.canScrollHorizontally(-1)) {
                    iM24891H = -((iWidth - m24891H()) - m24893I());
                } else {
                    iM24891H = 0;
                }
            }
            if (iM24894J != 0 || iM24891H != 0) {
                if (bundle != null) {
                    f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                    if (f < 0.0f) {
                        if (RecyclerView.f6595X0) {
                            throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f + ")");
                        }
                    }
                } else {
                    f = 1.0f;
                }
                if (Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
                    if (Float.compare(1.0f, f) != 0 && Float.compare(0.0f, f) != 0) {
                        iM24891H = (int) (iM24891H * f);
                        iM24894J = (int) (iM24894J * f);
                    }
                    this.f69172b.m2746k0(iM24891H, iM24894J, true);
                    return true;
                }
                RecyclerView recyclerView = this.f69172b;
                p28 p28Var = recyclerView.f6611H;
                if (p28Var != null) {
                    if (i == 4096) {
                        recyclerView.m2747l0(p28Var.mo6133a() - 1);
                        return true;
                    }
                    if (i != 8192) {
                        return true;
                    }
                    recyclerView.m2747l0(0);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public abstract int mo2635o(k38 k38Var);

    /* JADX INFO: renamed from: o0 */
    public final void m24898o0(g38 g38Var) {
        for (int iM24906v = m24906v() - 1; iM24906v >= 0; iM24906v--) {
            if (!RecyclerView.m2699N(m24904u(iM24906v)).m17797q()) {
                m24902r0(iM24906v, g38Var);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m24899p(g38 g38Var) {
        for (int iM24906v = m24906v() - 1; iM24906v >= 0; iM24906v--) {
            View viewM24904u = m24904u(iM24906v);
            o38 o38VarM2699N = RecyclerView.m2699N(viewM24904u);
            if (o38VarM2699N.m17797q()) {
                if (RecyclerView.f6596Y0) {
                    Log.d("RecyclerView", "ignoring view " + o38VarM2699N);
                }
            } else if (!o38VarM2699N.m17788h() || o38VarM2699N.m17790j() || this.f69172b.f6611H.f55487b) {
                m24904u(iM24906v);
                this.f69171a.m22542c(iM24906v);
                g38Var.m12339k(viewM24904u);
                this.f69172b.f6655g.m19910j(o38VarM2699N);
            } else {
                m24903s0(iM24906v);
                g38Var.m12338j(o38VarM2699N);
            }
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m24900p0(g38 g38Var) {
        ArrayList arrayList;
        int size = g38Var.f40123a.size();
        int i = size - 1;
        while (true) {
            arrayList = g38Var.f40123a;
            if (i < 0) {
                break;
            }
            View view = ((o38) arrayList.get(i)).f53781a;
            o38 o38VarM2699N = RecyclerView.m2699N(view);
            if (!o38VarM2699N.m17797q()) {
                o38VarM2699N.m17796p(false);
                if (o38VarM2699N.m17792l()) {
                    this.f69172b.removeDetachedView(view, false);
                }
                v28 v28Var = this.f69172b.f6664k0;
                if (v28Var != null) {
                    v28Var.mo151d(o38VarM2699N);
                }
                o38VarM2699N.m17796p(true);
                o38 o38VarM2699N2 = RecyclerView.m2699N(view);
                o38VarM2699N2.f53794n = null;
                o38VarM2699N2.f53795o = false;
                o38VarM2699N2.f53790j &= -33;
                g38Var.m12338j(o38VarM2699N2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = g38Var.f40124b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f69172b.invalidate();
        }
    }

    /* JADX INFO: renamed from: q */
    public View mo2696q(int i) {
        int iM24906v = m24906v();
        for (int i2 = 0; i2 < iM24906v; i2++) {
            View viewM24904u = m24904u(i2);
            o38 o38VarM2699N = RecyclerView.m2699N(viewM24904u);
            if (o38VarM2699N != null && o38VarM2699N.m17784d() == i && !o38VarM2699N.m17797q() && (this.f69172b.f6606C0.f46633g || !o38VarM2699N.m17790j())) {
                return viewM24904u;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m24901q0(View view, g38 g38Var) {
        u8a u8aVar = this.f69171a;
        n28 n28Var = (n28) u8aVar.f63594c;
        int i = u8aVar.f63593b;
        if (i == 1) {
            C3386nv.m17633t("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (i == 2) {
            C3386nv.m17633t("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            u8aVar.f63593b = 1;
            u8aVar.f63597f = view;
            int iIndexOfChild = n28Var.f52241a.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (((s01) u8aVar.f63595d).m20996h(iIndexOfChild)) {
                    u8aVar.m22564y(view);
                }
                n28Var.m17191c(iIndexOfChild);
            }
            u8aVar.f63593b = 0;
            u8aVar.f63597f = null;
            g38Var.m12337i(view);
        } catch (Throwable th) {
            u8aVar.f63593b = 0;
            u8aVar.f63597f = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: r */
    public abstract z28 mo2638r();

    /* JADX INFO: renamed from: r0 */
    public final void m24902r0(int i, g38 g38Var) {
        View viewM24904u = m24904u(i);
        m24903s0(i);
        g38Var.m12337i(viewM24904u);
    }

    /* JADX INFO: renamed from: s */
    public z28 mo2640s(Context context, AttributeSet attributeSet) {
        return new z28(context, attributeSet);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m24903s0(int i) {
        if (m24904u(i) != null) {
            u8a u8aVar = this.f69171a;
            n28 n28Var = (n28) u8aVar.f63594c;
            int i2 = u8aVar.f63593b;
            if (i2 == 1) {
                C3386nv.m17633t("Cannot call removeView(At) within removeView(At)");
                return;
            }
            if (i2 == 2) {
                C3386nv.m17633t("Cannot call removeView(At) within removeViewIfHidden");
                return;
            }
            try {
                int iM22545f = u8aVar.m22545f(i);
                View childAt = n28Var.f52241a.getChildAt(iM22545f);
                if (childAt == null) {
                    return;
                }
                u8aVar.f63593b = 1;
                u8aVar.f63597f = childAt;
                if (((s01) u8aVar.f63595d).m20996h(iM22545f)) {
                    u8aVar.m22564y(childAt);
                }
                n28Var.m17191c(iM22545f);
            } finally {
                u8aVar.f63593b = 0;
                u8aVar.f63597f = null;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public z28 mo2642t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof z28) {
            return new z28((z28) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new z28((ViewGroup.MarginLayoutParams) layoutParams) : new z28(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    /* JADX INFO: renamed from: t0 */
    public boolean mo6096t0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int iM24891H = m24891H();
        int iM24894J = m24894J();
        int iM24893I = this.f69184n - m24893I();
        int iM24890G = this.f69185o - m24890G();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - iM24891H;
        int iMin = Math.min(0, i);
        int i2 = top - iM24894J;
        int iMin2 = Math.min(0, i2);
        int i3 = iWidth - iM24893I;
        int iMax = Math.max(0, i3);
        int iMax2 = Math.max(0, iHeight - iM24890G);
        if (this.f69172b.getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i3);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i2, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iM24891H2 = m24891H();
                int iM24894J2 = m24894J();
                int iM24893I2 = this.f69184n - m24893I();
                int iM24890G2 = this.f69185o - m24890G();
                Rect rect2 = this.f69172b.f6661j;
                mo6097z(focusedChild, rect2);
                if (rect2.left - i4 < iM24893I2 && rect2.right - i4 > iM24891H2 && rect2.top - i5 < iM24890G2 && rect2.bottom - i5 > iM24894J2) {
                    if (i4 == 0) {
                    }
                    if (z) {
                        recyclerView.scrollBy(i4, i5);
                        return true;
                    }
                    recyclerView.m2746k0(i4, i5, false);
                    return true;
                }
            }
        } else if (i4 == 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
                return true;
            }
            recyclerView.m2746k0(i4, i5, false);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final View m24904u(int i) {
        u8a u8aVar = this.f69171a;
        if (u8aVar != null) {
            return u8aVar.m22543d(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m24905u0() {
        RecyclerView recyclerView = this.f69172b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* JADX INFO: renamed from: v */
    public final int m24906v() {
        u8a u8aVar = this.f69171a;
        if (u8aVar != null) {
            return u8aVar.m22544e();
        }
        return 0;
    }

    /* JADX INFO: renamed from: v0 */
    public abstract int mo2645v0(int i, g38 g38Var, k38 k38Var);

    /* JADX INFO: renamed from: w0 */
    public abstract void mo2697w0(int i);

    /* JADX INFO: renamed from: x */
    public int mo2648x(g38 g38Var, k38 k38Var) {
        RecyclerView recyclerView = this.f69172b;
        if (recyclerView == null || recyclerView.f6611H == null || !mo2679d()) {
            return 1;
        }
        return this.f69172b.f6611H.mo6133a();
    }

    /* JADX INFO: renamed from: x0 */
    public abstract int mo2649x0(int i, g38 g38Var, k38 k38Var);

    /* JADX INFO: renamed from: y0 */
    public final void m24907y0(RecyclerView recyclerView) {
        m24908z0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* JADX INFO: renamed from: z */
    public void mo6097z(View view, Rect rect) {
        boolean z = RecyclerView.f6595X0;
        z28 z28Var = (z28) view.getLayoutParams();
        Rect rect2 = z28Var.f70800b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) z28Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) z28Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) z28Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) z28Var).bottomMargin);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m24908z0(int i, int i2) {
        this.f69184n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f69182l = mode;
        if (mode == 0 && !RecyclerView.f6599b1) {
            this.f69184n = 0;
        }
        this.f69185o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f69183m = mode2;
        if (mode2 != 0 || RecyclerView.f6599b1) {
            return;
        }
        this.f69185o = 0;
    }
}
