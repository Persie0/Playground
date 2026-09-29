package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
import p000.C0797b4;
import p000.C3386nv;
import p000.C3665uy;
import p000.C3671v3;
import p000.dd5;
import p000.fd5;
import p000.g38;
import p000.j38;
import p000.k38;
import p000.lq2;
import p000.o38;
import p000.ow2;
import p000.p28;
import p000.pj3;
import p000.ss5;
import p000.ux5;
import p000.x28;
import p000.y28;
import p000.ya4;
import p000.z28;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends y28 implements ya4, j38 {

    /* JADX INFO: renamed from: A */
    public final ow2 f6577A;

    /* JADX INFO: renamed from: B */
    public final C3665uy f6578B;

    /* JADX INFO: renamed from: C */
    public final int f6579C;

    /* JADX INFO: renamed from: D */
    public final int[] f6580D;

    /* JADX INFO: renamed from: p */
    public int f6581p;

    /* JADX INFO: renamed from: q */
    public dd5 f6582q;

    /* JADX INFO: renamed from: r */
    public lq2 f6583r;

    /* JADX INFO: renamed from: s */
    public boolean f6584s;

    /* JADX INFO: renamed from: t */
    public final boolean f6585t;

    /* JADX INFO: renamed from: u */
    public boolean f6586u;

    /* JADX INFO: renamed from: v */
    public boolean f6587v;

    /* JADX INFO: renamed from: w */
    public final boolean f6588w;

    /* JADX INFO: renamed from: x */
    public int f6589x;

    /* JADX INFO: renamed from: y */
    public int f6590y;

    /* JADX INFO: renamed from: z */
    public SavedState f6591z;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0725a();

        /* JADX INFO: renamed from: a */
        public int f6592a;

        /* JADX INFO: renamed from: b */
        public int f6593b;

        /* JADX INFO: renamed from: c */
        public boolean f6594c;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f6592a);
            parcel.writeInt(this.f6593b);
            parcel.writeInt(this.f6594c ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f6581p = 1;
        this.f6585t = false;
        this.f6586u = false;
        this.f6587v = false;
        this.f6588w = true;
        this.f6589x = -1;
        this.f6590y = Integer.MIN_VALUE;
        this.f6591z = null;
        this.f6577A = new ow2();
        this.f6578B = new C3665uy();
        this.f6579C = 2;
        this.f6580D = new int[2];
        x28 x28VarM24879L = y28.m24879L(context, attributeSet, i, i2);
        m2691k1(x28VarM24879L.f67679a);
        boolean z = x28VarM24879L.f67681c;
        mo2677c(null);
        if (z != this.f6585t) {
            this.f6585t = z;
            m24905u0();
        }
        mo2632l1(x28VarM24879L.f67682d);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: E0 */
    public final boolean mo2653E0() {
        if (this.f69183m != 1073741824 && this.f69182l != 1073741824) {
            int iM24906v = m24906v();
            for (int i = 0; i < iM24906v; i++) {
                ViewGroup.LayoutParams layoutParams = m24904u(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: G0 */
    public void mo2654G0(RecyclerView recyclerView, int i) {
        fd5 fd5Var = new fd5(recyclerView.getContext());
        fd5Var.m11785m(i);
        m24892H0(fd5Var);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: I0 */
    public boolean mo2613I0() {
        return this.f6591z == null && this.f6584s == this.f6587v;
    }

    /* JADX INFO: renamed from: J0 */
    public void mo2655J0(k38 k38Var, int[] iArr) {
        int i;
        int iMo16456n = k38Var.f46627a != -1 ? this.f6583r.mo16456n() : 0;
        if (this.f6582q.f35441f == -1) {
            i = 0;
        } else {
            i = iMo16456n;
            iMo16456n = 0;
        }
        iArr[0] = iMo16456n;
        iArr[1] = i;
    }

    /* JADX INFO: renamed from: K0 */
    public void mo2614K0(k38 k38Var, dd5 dd5Var, pj3 pj3Var) {
        int i = dd5Var.f35439d;
        if (i < 0 || i >= k38Var.m14789b()) {
            return;
        }
        pj3Var.m19195a(i, Math.max(0, dd5Var.f35442g));
    }

    /* JADX INFO: renamed from: L0 */
    public final int m2656L0(k38 k38Var) {
        if (m24906v() == 0) {
            return 0;
        }
        m2662P0();
        lq2 lq2Var = this.f6583r;
        boolean z = !this.f6588w;
        return ss5.m21719p(k38Var, lq2Var, m2665S0(z), m2664R0(z), this, this.f6588w);
    }

    /* JADX INFO: renamed from: M0 */
    public final int m2657M0(k38 k38Var) {
        if (m24906v() == 0) {
            return 0;
        }
        m2662P0();
        lq2 lq2Var = this.f6583r;
        boolean z = !this.f6588w;
        return ss5.m21720q(k38Var, lq2Var, m2665S0(z), m2664R0(z), this, this.f6588w, this.f6586u);
    }

    /* JADX INFO: renamed from: N0 */
    public final int m2658N0(k38 k38Var) {
        if (m24906v() == 0) {
            return 0;
        }
        m2662P0();
        lq2 lq2Var = this.f6583r;
        boolean z = !this.f6588w;
        return ss5.m21721r(k38Var, lq2Var, m2665S0(z), m2664R0(z), this, this.f6588w);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: O */
    public final boolean mo2659O() {
        return true;
    }

    /* JADX INFO: renamed from: O0 */
    public final int m2660O0(int i) {
        if (i == 1) {
            return (this.f6581p != 1 && m2678c1()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f6581p != 1 && m2678c1()) ? -1 : 1;
        }
        if (i == 17) {
            return this.f6581p == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.f6581p == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.f6581p == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f6581p == 0 ? 1 : Integer.MIN_VALUE;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: P */
    public final boolean mo2661P() {
        return this.f6585t;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m2662P0() {
        if (this.f6582q == null) {
            dd5 dd5Var = new dd5();
            dd5Var.f35436a = true;
            dd5Var.f35443h = 0;
            dd5Var.f35444i = 0;
            dd5Var.f35446k = null;
            this.f6582q = dd5Var;
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final int m2663Q0(g38 g38Var, dd5 dd5Var, k38 k38Var, boolean z) {
        int i;
        int i2 = dd5Var.f35438c;
        int i3 = dd5Var.f35442g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                dd5Var.f35442g = i3 + i2;
            }
            m2681f1(g38Var, dd5Var);
        }
        int i4 = dd5Var.f35438c + dd5Var.f35443h;
        while (true) {
            if ((!dd5Var.f35447l && i4 <= 0) || (i = dd5Var.f35439d) < 0 || i >= k38Var.m14789b()) {
                break;
            }
            C3665uy c3665uy = this.f6578B;
            c3665uy.f64497a = 0;
            c3665uy.f64498b = false;
            c3665uy.f64499c = false;
            c3665uy.f64500d = false;
            mo2622d1(g38Var, k38Var, dd5Var, c3665uy);
            if (!c3665uy.f64498b) {
                int i5 = dd5Var.f35437b;
                int i6 = c3665uy.f64497a;
                dd5Var.f35437b = (dd5Var.f35441f * i6) + i5;
                if (!c3665uy.f64499c || dd5Var.f35446k != null || !k38Var.f46633g) {
                    dd5Var.f35438c -= i6;
                    i4 -= i6;
                }
                int i7 = dd5Var.f35442g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    dd5Var.f35442g = i8;
                    int i9 = dd5Var.f35438c;
                    if (i9 < 0) {
                        dd5Var.f35442g = i8 + i9;
                    }
                    m2681f1(g38Var, dd5Var);
                }
                if (z && c3665uy.f64500d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - dd5Var.f35438c;
    }

    /* JADX INFO: renamed from: R0 */
    public final View m2664R0(boolean z) {
        return this.f6586u ? m2670W0(0, m24906v(), z) : m2670W0(m24906v() - 1, -1, z);
    }

    /* JADX INFO: renamed from: S0 */
    public final View m2665S0(boolean z) {
        return this.f6586u ? m2670W0(m24906v() - 1, -1, z) : m2670W0(0, m24906v(), z);
    }

    /* JADX INFO: renamed from: T0 */
    public final int m2666T0() {
        View viewM2670W0 = m2670W0(0, m24906v(), false);
        if (viewM2670W0 == null) {
            return -1;
        }
        return y28.m24878K(viewM2670W0);
    }

    /* JADX INFO: renamed from: U0 */
    public final int m2667U0() {
        View viewM2670W0 = m2670W0(m24906v() - 1, -1, false);
        if (viewM2670W0 == null) {
            return -1;
        }
        return y28.m24878K(viewM2670W0);
    }

    /* JADX INFO: renamed from: V0 */
    public final View m2668V0(int i, int i2) {
        int i3;
        int i4;
        m2662P0();
        if (i2 <= i && i2 >= i) {
            return m24904u(i);
        }
        if (this.f6583r.mo16449g(m24904u(i)) < this.f6583r.mo16455m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.f6581p == 0 ? this.f69173c.m19907e(i, i2, i3, i4) : this.f69174d.m19907e(i, i2, i3, i4);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: W */
    public final void mo2669W(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: W0 */
    public final View m2670W0(int i, int i2, boolean z) {
        m2662P0();
        int i3 = z ? 24579 : 320;
        return this.f6581p == 0 ? this.f69173c.m19907e(i, i2, i3, 320) : this.f69174d.m19907e(i, i2, i3, 320);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: X */
    public View mo2616X(View view, int i, g38 g38Var, k38 k38Var) {
        int iM2660O0;
        View viewM2668V0;
        m2684h1();
        if (m24906v() != 0 && (iM2660O0 = m2660O0(i)) != Integer.MIN_VALUE) {
            m2662P0();
            m2693m1(iM2660O0, (int) (this.f6583r.mo16456n() * 0.33333334f), false, k38Var);
            dd5 dd5Var = this.f6582q;
            dd5Var.f35442g = Integer.MIN_VALUE;
            dd5Var.f35436a = false;
            m2663Q0(g38Var, dd5Var, k38Var, true);
            boolean z = this.f6586u;
            if (iM2660O0 == -1) {
                viewM2668V0 = z ? m2668V0(m24906v() - 1, -1) : m2668V0(0, m24906v());
            } else {
                viewM2668V0 = z ? m2668V0(0, m24906v()) : m2668V0(m24906v() - 1, -1);
            }
            View viewM2676b1 = iM2660O0 == -1 ? m2676b1() : m2675a1();
            if (!viewM2676b1.hasFocusable()) {
                return viewM2668V0;
            }
            if (viewM2668V0 != null) {
                return viewM2676b1;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX INFO: renamed from: X0 */
    public View mo2617X0(g38 g38Var, k38 k38Var, boolean z, boolean z2) {
        int i;
        int iM24906v;
        int i2;
        m2662P0();
        int iM24906v2 = m24906v();
        if (z2) {
            iM24906v = m24906v() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iM24906v2;
            iM24906v = 0;
            i2 = 1;
        }
        int iM14789b = k38Var.m14789b();
        int iMo16455m = this.f6583r.mo16455m();
        int iMo16451i = this.f6583r.mo16451i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iM24906v != i) {
            View viewM24904u = m24904u(iM24906v);
            int iM24878K = y28.m24878K(viewM24904u);
            int iMo16449g = this.f6583r.mo16449g(viewM24904u);
            int iMo16446d = this.f6583r.mo16446d(viewM24904u);
            if (iM24878K >= 0 && iM24878K < iM14789b) {
                if (!((z28) viewM24904u.getLayoutParams()).f70799a.m17790j()) {
                    boolean z3 = iMo16446d <= iMo16455m && iMo16449g < iMo16455m;
                    boolean z4 = iMo16449g >= iMo16451i && iMo16446d > iMo16451i;
                    if (!z3 && !z4) {
                        return viewM24904u;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewM24904u;
                        } else if (view == null) {
                            view = viewM24904u;
                        }
                    } else if (z3) {
                        view2 = viewM24904u;
                    } else if (view == null) {
                        view = viewM24904u;
                    }
                } else if (view3 == null) {
                    view3 = viewM24904u;
                }
            }
            iM24906v += i2;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: Y */
    public final void mo2671Y(AccessibilityEvent accessibilityEvent) {
        super.mo2671Y(accessibilityEvent);
        if (m24906v() > 0) {
            accessibilityEvent.setFromIndex(m2666T0());
            accessibilityEvent.setToIndex(m2667U0());
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final int m2672Y0(int i, g38 g38Var, k38 k38Var, boolean z) {
        int iMo16451i;
        int iMo16451i2 = this.f6583r.mo16451i() - i;
        if (iMo16451i2 <= 0) {
            return 0;
        }
        int i2 = -m2686i1(-iMo16451i2, g38Var, k38Var);
        int i3 = i + i2;
        if (!z || (iMo16451i = this.f6583r.mo16451i() - i3) <= 0) {
            return i2;
        }
        this.f6583r.mo16459q(iMo16451i);
        return iMo16451i + i2;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: Z */
    public void mo2618Z(g38 g38Var, k38 k38Var, C0797b4 c0797b4) {
        super.mo2618Z(g38Var, k38Var, c0797b4);
        p28 p28Var = this.f69172b.f6611H;
        if (p28Var == null || p28Var.mo6133a() <= 0) {
            return;
        }
        c0797b4.m3272b(C3671v3.f64762l);
    }

    /* JADX INFO: renamed from: Z0 */
    public final int m2673Z0(int i, g38 g38Var, k38 k38Var, boolean z) {
        int iMo16455m;
        int iMo16455m2 = i - this.f6583r.mo16455m();
        if (iMo16455m2 <= 0) {
            return 0;
        }
        int i2 = -m2686i1(iMo16455m2, g38Var, k38Var);
        int i3 = i + i2;
        if (!z || (iMo16455m = i3 - this.f6583r.mo16455m()) <= 0) {
            return i2;
        }
        this.f6583r.mo16459q(-iMo16455m);
        return i2 - iMo16455m;
    }

    @Override // p000.j38
    /* JADX INFO: renamed from: a */
    public final PointF mo2674a(int i) {
        if (m24906v() == 0) {
            return null;
        }
        int i2 = (i < y28.m24878K(m24904u(0))) != this.f6586u ? -1 : 1;
        return this.f6581p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    /* JADX INFO: renamed from: a1 */
    public final View m2675a1() {
        return m24904u(this.f6586u ? 0 : m24906v() - 1);
    }

    /* JADX INFO: renamed from: b1 */
    public final View m2676b1() {
        return m24904u(this.f6586u ? m24906v() - 1 : 0);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: c */
    public final void mo2677c(String str) {
        if (this.f6591z == null) {
            super.mo2677c(str);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final boolean m2678c1() {
        return this.f69172b.getLayoutDirection() == 1;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: d */
    public final boolean mo2679d() {
        return this.f6581p == 0;
    }

    /* JADX INFO: renamed from: d1 */
    public void mo2622d1(g38 g38Var, k38 k38Var, dd5 dd5Var, C3665uy c3665uy) {
        int i;
        int iMo16448f;
        int i2;
        int iMo16448f2;
        View viewM10295b = dd5Var.m10295b(g38Var);
        if (viewM10295b == null) {
            c3665uy.f64498b = true;
            return;
        }
        z28 z28Var = (z28) viewM10295b.getLayoutParams();
        List list = dd5Var.f35446k;
        boolean z = this.f6586u;
        int i3 = dd5Var.f35441f;
        if (list == null) {
            if (z == (i3 == -1)) {
                m24896b(viewM10295b, -1, false);
            } else {
                m24896b(viewM10295b, 0, false);
            }
        } else {
            if (z == (i3 == -1)) {
                m24896b(viewM10295b, -1, true);
            } else {
                m24896b(viewM10295b, 0, true);
            }
        }
        z28 z28Var2 = (z28) viewM10295b.getLayoutParams();
        Rect rectM2720O = this.f69172b.m2720O(viewM10295b);
        int i4 = rectM2720O.left + rectM2720O.right;
        int i5 = rectM2720O.top + rectM2720O.bottom;
        int iM24883w = y28.m24883w(mo2679d(), this.f69184n, this.f69182l, m24893I() + m24891H() + ((ViewGroup.MarginLayoutParams) z28Var2).leftMargin + ((ViewGroup.MarginLayoutParams) z28Var2).rightMargin + i4, ((ViewGroup.MarginLayoutParams) z28Var2).width);
        int iM24883w2 = y28.m24883w(mo2680e(), this.f69185o, this.f69183m, m24890G() + m24894J() + ((ViewGroup.MarginLayoutParams) z28Var2).topMargin + ((ViewGroup.MarginLayoutParams) z28Var2).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) z28Var2).height);
        if (m24887D0(viewM10295b, iM24883w, iM24883w2, z28Var2)) {
            viewM10295b.measure(iM24883w, iM24883w2);
        }
        c3665uy.f64497a = this.f6583r.mo16447e(viewM10295b);
        if (this.f6581p == 1) {
            if (m2678c1()) {
                iMo16448f2 = this.f69184n - m24893I();
                iMo16448f = iMo16448f2 - this.f6583r.mo16448f(viewM10295b);
            } else {
                int iM24891H = m24891H();
                iMo16448f2 = this.f6583r.mo16448f(viewM10295b) + iM24891H;
                iMo16448f = iM24891H;
            }
            int i6 = dd5Var.f35441f;
            i2 = dd5Var.f35437b;
            int i7 = c3665uy.f64497a;
            if (i6 == -1) {
                int i8 = i2 - i7;
                i = i2;
                i2 = i8;
            } else {
                i = i7 + i2;
            }
        } else {
            int iM24894J = m24894J();
            int iMo16448f3 = this.f6583r.mo16448f(viewM10295b) + iM24894J;
            int i9 = dd5Var.f35441f;
            int i10 = dd5Var.f35437b;
            int i11 = c3665uy.f64497a;
            if (i9 == -1) {
                int i12 = i10 - i11;
                iMo16448f2 = i10;
                i2 = iM24894J;
                i = iMo16448f3;
                iMo16448f = i12;
            } else {
                int i13 = i10 + i11;
                i = iMo16448f3;
                iMo16448f = i10;
                i2 = iM24894J;
                iMo16448f2 = i13;
            }
        }
        y28.m24881R(viewM10295b, iMo16448f, i2, iMo16448f2, i);
        if (z28Var.f70799a.m17790j() || z28Var.f70799a.m17793m()) {
            c3665uy.f64499c = true;
        }
        c3665uy.f64500d = viewM10295b.hasFocusable();
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: e */
    public final boolean mo2680e() {
        return this.f6581p == 1;
    }

    /* JADX INFO: renamed from: e1 */
    public void mo2624e1(g38 g38Var, k38 k38Var, ow2 ow2Var, int i) {
    }

    /* JADX INFO: renamed from: f1 */
    public final void m2681f1(g38 g38Var, dd5 dd5Var) {
        if (!dd5Var.f35436a || dd5Var.f35447l) {
            return;
        }
        int i = dd5Var.f35442g;
        int i2 = dd5Var.f35444i;
        if (dd5Var.f35441f == -1) {
            int iM24906v = m24906v();
            if (i < 0) {
                return;
            }
            int iMo16450h = (this.f6583r.mo16450h() - i) + i2;
            if (this.f6586u) {
                for (int i3 = 0; i3 < iM24906v; i3++) {
                    View viewM24904u = m24904u(i3);
                    if (this.f6583r.mo16449g(viewM24904u) < iMo16450h || this.f6583r.mo16458p(viewM24904u) < iMo16450h) {
                        m2682g1(g38Var, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iM24906v - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewM24904u2 = m24904u(i5);
                if (this.f6583r.mo16449g(viewM24904u2) < iMo16450h || this.f6583r.mo16458p(viewM24904u2) < iMo16450h) {
                    m2682g1(g38Var, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iM24906v2 = m24906v();
        if (!this.f6586u) {
            for (int i7 = 0; i7 < iM24906v2; i7++) {
                View viewM24904u3 = m24904u(i7);
                if (this.f6583r.mo16446d(viewM24904u3) > i6 || this.f6583r.mo16457o(viewM24904u3) > i6) {
                    m2682g1(g38Var, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iM24906v2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewM24904u4 = m24904u(i9);
            if (this.f6583r.mo16446d(viewM24904u4) > i6 || this.f6583r.mo16457o(viewM24904u4) > i6) {
                m2682g1(g38Var, i8, i9);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final void m2682g1(g38 g38Var, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                m24902r0(i, g38Var);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                m24902r0(i3, g38Var);
            }
        }
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: h */
    public final void mo2683h(int i, int i2, k38 k38Var, pj3 pj3Var) {
        if (this.f6581p != 0) {
            i = i2;
        }
        if (m24906v() == 0 || i == 0) {
            return;
        }
        m2662P0();
        m2693m1(i > 0 ? 1 : -1, Math.abs(i), true, k38Var);
        mo2614K0(k38Var, this.f6582q, pj3Var);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:114:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:121:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:123:0x0206  */
    /* JADX WARN: Code duplicated, block: B:126:0x0212  */
    /* JADX WARN: Code duplicated, block: B:130:0x0232 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x0236  */
    /* JADX WARN: Code duplicated, block: B:134:0x0239 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x023d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0240 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x0242  */
    /* JADX WARN: Code duplicated, block: B:141:0x0246  */
    /* JADX WARN: Code duplicated, block: B:143:0x024a  */
    /* JADX WARN: Code duplicated, block: B:145:0x0251  */
    /* JADX WARN: Code duplicated, block: B:146:0x0257  */
    /* JADX WARN: Code duplicated, block: B:95:0x018c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // p000.y28
    /* JADX INFO: renamed from: h0 */
    public void mo2628h0(g38 g38Var, k38 k38Var) {
        View focusedChild;
        int iM14789b;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z;
        boolean z2;
        View viewMo2617X0;
        boolean z3;
        lq2 lq2Var;
        int iMo16449g;
        int iMo16446d;
        int iMo16455m;
        int iMo16451i;
        boolean z4;
        boolean z5;
        lq2 lq2Var2;
        int iMo16456n;
        z28 z28Var;
        int i;
        int iMo16449g2;
        int i2;
        int i3;
        ?? r4;
        List list;
        int i4;
        int i5;
        int iM2672Y0;
        int i6;
        View viewMo2696q;
        int iMo16449g3;
        int iMo16451i2;
        int i7;
        int i8 = -1;
        if (!(this.f6591z == null && this.f6589x == -1) && k38Var.m14789b() == 0) {
            m24898o0(g38Var);
            return;
        }
        SavedState savedState = this.f6591z;
        if (savedState != null && (i7 = savedState.f6592a) >= 0) {
            this.f6589x = i7;
        }
        m2662P0();
        boolean z6 = false;
        this.f6582q.f35436a = false;
        m2684h1();
        RecyclerView recyclerView2 = this.f69172b;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f69171a.f63596e).contains(focusedChild)) {
            focusedChild = null;
        }
        ow2 ow2Var = this.f6577A;
        if (!ow2Var.f55061e || this.f6589x != -1 || this.f6591z != null) {
            ow2Var.m18533d();
            ow2Var.f55060d = this.f6586u ^ this.f6587v;
            if (k38Var.f46633g || (i = this.f6589x) == -1) {
                if (m24906v() != 0) {
                    recyclerView = this.f69172b;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f69171a.f63596e).contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        z28Var = (z28) focusedChild2.getLayoutParams();
                        if (!z28Var.f70799a.m17790j() || z28Var.f70799a.m17784d() < 0 || z28Var.f70799a.m17784d() >= k38Var.m14789b()) {
                            z = this.f6584s;
                            z2 = this.f6587v;
                            if (z == z2 || (viewMo2617X0 = mo2617X0(g38Var, k38Var, ow2Var.f55060d, z2)) == null) {
                                ow2Var.m18530a();
                                if (this.f6587v) {
                                    iM14789b = k38Var.m14789b() - 1;
                                } else {
                                    iM14789b = 0;
                                }
                                ow2Var.f55058b = iM14789b;
                            } else {
                                int iM24878K = y28.m24878K(viewMo2617X0);
                                z3 = ow2Var.f55060d;
                                lq2Var = (lq2) ow2Var.f55062f;
                                if (z3) {
                                    int iMo16446d2 = lq2Var.mo16446d(viewMo2617X0);
                                    lq2Var2 = (lq2) ow2Var.f55062f;
                                    if (Integer.MIN_VALUE == lq2Var2.f49997a) {
                                        iMo16456n = 0;
                                    } else {
                                        iMo16456n = lq2Var2.mo16456n() - lq2Var2.f49997a;
                                    }
                                    ow2Var.f55059c = iMo16456n + iMo16446d2;
                                } else {
                                    ow2Var.f55059c = lq2Var.mo16449g(viewMo2617X0);
                                }
                                ow2Var.f55058b = iM24878K;
                                if (!k38Var.f46633g && mo2613I0()) {
                                    iMo16449g = this.f6583r.mo16449g(viewMo2617X0);
                                    iMo16446d = this.f6583r.mo16446d(viewMo2617X0);
                                    iMo16455m = this.f6583r.mo16455m();
                                    iMo16451i = this.f6583r.mo16451i();
                                    if (iMo16446d <= iMo16455m || iMo16449g >= iMo16455m) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (iMo16449g >= iMo16451i || iMo16446d <= iMo16451i) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z4 || z5) {
                                        if (ow2Var.f55060d) {
                                            iMo16455m = iMo16451i;
                                        }
                                        ow2Var.f55059c = iMo16455m;
                                    }
                                }
                            }
                        } else {
                            ow2Var.m18531b(focusedChild2, y28.m24878K(focusedChild2));
                        }
                    } else {
                        z = this.f6584s;
                        z2 = this.f6587v;
                        if (z == z2) {
                            ow2Var.m18530a();
                            if (this.f6587v) {
                                iM14789b = k38Var.m14789b() - 1;
                            } else {
                                iM14789b = 0;
                            }
                            ow2Var.f55058b = iM14789b;
                        } else {
                            int iM24878K2 = y28.m24878K(viewMo2617X0);
                            z3 = ow2Var.f55060d;
                            lq2Var = (lq2) ow2Var.f55062f;
                            if (z3) {
                                int iMo16446d3 = lq2Var.mo16446d(viewMo2617X0);
                                lq2Var2 = (lq2) ow2Var.f55062f;
                                if (Integer.MIN_VALUE == lq2Var2.f49997a) {
                                    iMo16456n = 0;
                                } else {
                                    iMo16456n = lq2Var2.mo16456n() - lq2Var2.f49997a;
                                }
                                ow2Var.f55059c = iMo16456n + iMo16446d3;
                            } else {
                                ow2Var.f55059c = lq2Var.mo16449g(viewMo2617X0);
                            }
                            ow2Var.f55058b = iM24878K2;
                            if (!k38Var.f46633g) {
                                iMo16449g = this.f6583r.mo16449g(viewMo2617X0);
                                iMo16446d = this.f6583r.mo16446d(viewMo2617X0);
                                iMo16455m = this.f6583r.mo16455m();
                                iMo16451i = this.f6583r.mo16451i();
                                if (iMo16446d <= iMo16455m) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (iMo16449g >= iMo16451i) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (ow2Var.f55060d) {
                                        iMo16455m = iMo16451i;
                                    }
                                    ow2Var.f55059c = iMo16455m;
                                } else {
                                    if (ow2Var.f55060d) {
                                        iMo16455m = iMo16451i;
                                    }
                                    ow2Var.f55059c = iMo16455m;
                                }
                            }
                        }
                    }
                } else {
                    ow2Var.m18530a();
                    if (this.f6587v) {
                        iM14789b = k38Var.m14789b() - 1;
                    } else {
                        iM14789b = 0;
                    }
                    ow2Var.f55058b = iM14789b;
                }
            } else if (i < 0 || i >= k38Var.m14789b()) {
                this.f6589x = -1;
                this.f6590y = Integer.MIN_VALUE;
                if (m24906v() != 0) {
                    recyclerView = this.f69172b;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        z28Var = (z28) focusedChild2.getLayoutParams();
                        if (z28Var.f70799a.m17790j()) {
                            z = this.f6584s;
                            z2 = this.f6587v;
                            if (z == z2) {
                                ow2Var.m18530a();
                                if (this.f6587v) {
                                    iM14789b = k38Var.m14789b() - 1;
                                } else {
                                    iM14789b = 0;
                                }
                                ow2Var.f55058b = iM14789b;
                            } else {
                                int iM24878K3 = y28.m24878K(viewMo2617X0);
                                z3 = ow2Var.f55060d;
                                lq2Var = (lq2) ow2Var.f55062f;
                                if (z3) {
                                    int iMo16446d4 = lq2Var.mo16446d(viewMo2617X0);
                                    lq2Var2 = (lq2) ow2Var.f55062f;
                                    if (Integer.MIN_VALUE == lq2Var2.f49997a) {
                                        iMo16456n = 0;
                                    } else {
                                        iMo16456n = lq2Var2.mo16456n() - lq2Var2.f49997a;
                                    }
                                    ow2Var.f55059c = iMo16456n + iMo16446d4;
                                } else {
                                    ow2Var.f55059c = lq2Var.mo16449g(viewMo2617X0);
                                }
                                ow2Var.f55058b = iM24878K3;
                                if (!k38Var.f46633g) {
                                    iMo16449g = this.f6583r.mo16449g(viewMo2617X0);
                                    iMo16446d = this.f6583r.mo16446d(viewMo2617X0);
                                    iMo16455m = this.f6583r.mo16455m();
                                    iMo16451i = this.f6583r.mo16451i();
                                    if (iMo16446d <= iMo16455m) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iMo16449g >= iMo16451i) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4) {
                                        if (ow2Var.f55060d) {
                                            iMo16455m = iMo16451i;
                                        }
                                        ow2Var.f55059c = iMo16455m;
                                    } else {
                                        if (ow2Var.f55060d) {
                                            iMo16455m = iMo16451i;
                                        }
                                        ow2Var.f55059c = iMo16455m;
                                    }
                                }
                            }
                        } else {
                            z = this.f6584s;
                            z2 = this.f6587v;
                            if (z == z2) {
                                ow2Var.m18530a();
                                if (this.f6587v) {
                                    iM14789b = k38Var.m14789b() - 1;
                                } else {
                                    iM14789b = 0;
                                }
                                ow2Var.f55058b = iM14789b;
                            } else {
                                int iM24878K4 = y28.m24878K(viewMo2617X0);
                                z3 = ow2Var.f55060d;
                                lq2Var = (lq2) ow2Var.f55062f;
                                if (z3) {
                                    int iMo16446d5 = lq2Var.mo16446d(viewMo2617X0);
                                    lq2Var2 = (lq2) ow2Var.f55062f;
                                    if (Integer.MIN_VALUE == lq2Var2.f49997a) {
                                        iMo16456n = 0;
                                    } else {
                                        iMo16456n = lq2Var2.mo16456n() - lq2Var2.f49997a;
                                    }
                                    ow2Var.f55059c = iMo16456n + iMo16446d5;
                                } else {
                                    ow2Var.f55059c = lq2Var.mo16449g(viewMo2617X0);
                                }
                                ow2Var.f55058b = iM24878K4;
                                if (!k38Var.f46633g) {
                                    iMo16449g = this.f6583r.mo16449g(viewMo2617X0);
                                    iMo16446d = this.f6583r.mo16446d(viewMo2617X0);
                                    iMo16455m = this.f6583r.mo16455m();
                                    iMo16451i = this.f6583r.mo16451i();
                                    if (iMo16446d <= iMo16455m) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iMo16449g >= iMo16451i) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4) {
                                        if (ow2Var.f55060d) {
                                            iMo16455m = iMo16451i;
                                        }
                                        ow2Var.f55059c = iMo16455m;
                                    } else {
                                        if (ow2Var.f55060d) {
                                            iMo16455m = iMo16451i;
                                        }
                                        ow2Var.f55059c = iMo16455m;
                                    }
                                }
                            }
                        }
                    } else {
                        z = this.f6584s;
                        z2 = this.f6587v;
                        if (z == z2) {
                            ow2Var.m18530a();
                            if (this.f6587v) {
                                iM14789b = k38Var.m14789b() - 1;
                            } else {
                                iM14789b = 0;
                            }
                            ow2Var.f55058b = iM14789b;
                        } else {
                            int iM24878K5 = y28.m24878K(viewMo2617X0);
                            z3 = ow2Var.f55060d;
                            lq2Var = (lq2) ow2Var.f55062f;
                            if (z3) {
                                int iMo16446d6 = lq2Var.mo16446d(viewMo2617X0);
                                lq2Var2 = (lq2) ow2Var.f55062f;
                                if (Integer.MIN_VALUE == lq2Var2.f49997a) {
                                    iMo16456n = 0;
                                } else {
                                    iMo16456n = lq2Var2.mo16456n() - lq2Var2.f49997a;
                                }
                                ow2Var.f55059c = iMo16456n + iMo16446d6;
                            } else {
                                ow2Var.f55059c = lq2Var.mo16449g(viewMo2617X0);
                            }
                            ow2Var.f55058b = iM24878K5;
                            if (!k38Var.f46633g) {
                                iMo16449g = this.f6583r.mo16449g(viewMo2617X0);
                                iMo16446d = this.f6583r.mo16446d(viewMo2617X0);
                                iMo16455m = this.f6583r.mo16455m();
                                iMo16451i = this.f6583r.mo16451i();
                                if (iMo16446d <= iMo16455m) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (iMo16449g >= iMo16451i) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (ow2Var.f55060d) {
                                        iMo16455m = iMo16451i;
                                    }
                                    ow2Var.f55059c = iMo16455m;
                                } else {
                                    if (ow2Var.f55060d) {
                                        iMo16455m = iMo16451i;
                                    }
                                    ow2Var.f55059c = iMo16455m;
                                }
                            }
                        }
                    }
                } else {
                    ow2Var.m18530a();
                    if (this.f6587v) {
                        iM14789b = k38Var.m14789b() - 1;
                    } else {
                        iM14789b = 0;
                    }
                    ow2Var.f55058b = iM14789b;
                }
            } else {
                int i9 = this.f6589x;
                ow2Var.f55058b = i9;
                SavedState savedState2 = this.f6591z;
                if (savedState2 != null && savedState2.f6592a >= 0) {
                    boolean z7 = savedState2.f6594c;
                    ow2Var.f55060d = z7;
                    lq2 lq2Var3 = this.f6583r;
                    if (z7) {
                        ow2Var.f55059c = lq2Var3.mo16451i() - this.f6591z.f6593b;
                    } else {
                        ow2Var.f55059c = lq2Var3.mo16455m() + this.f6591z.f6593b;
                    }
                } else if (this.f6590y == Integer.MIN_VALUE) {
                    View viewMo2696q2 = mo2696q(i9);
                    if (viewMo2696q2 == null) {
                        if (m24906v() > 0) {
                            ow2Var.f55060d = (this.f6589x < y28.m24878K(m24904u(0))) == this.f6586u;
                        }
                        ow2Var.m18530a();
                    } else if (this.f6583r.mo16447e(viewMo2696q2) > this.f6583r.mo16456n()) {
                        ow2Var.m18530a();
                    } else {
                        int iMo16449g4 = this.f6583r.mo16449g(viewMo2696q2) - this.f6583r.mo16455m();
                        lq2 lq2Var4 = this.f6583r;
                        if (iMo16449g4 < 0) {
                            ow2Var.f55059c = lq2Var4.mo16455m();
                            ow2Var.f55060d = false;
                        } else if (lq2Var4.mo16451i() - this.f6583r.mo16446d(viewMo2696q2) < 0) {
                            ow2Var.f55059c = this.f6583r.mo16451i();
                            ow2Var.f55060d = true;
                        } else {
                            boolean z8 = ow2Var.f55060d;
                            lq2 lq2Var5 = this.f6583r;
                            if (z8) {
                                int iMo16446d7 = lq2Var5.mo16446d(viewMo2696q2);
                                lq2 lq2Var6 = this.f6583r;
                                iMo16449g2 = (Integer.MIN_VALUE == lq2Var6.f49997a ? 0 : lq2Var6.mo16456n() - lq2Var6.f49997a) + iMo16446d7;
                            } else {
                                iMo16449g2 = lq2Var5.mo16449g(viewMo2696q2);
                            }
                            ow2Var.f55059c = iMo16449g2;
                        }
                    }
                } else {
                    boolean z9 = this.f6586u;
                    ow2Var.f55060d = z9;
                    lq2 lq2Var7 = this.f6583r;
                    if (z9) {
                        ow2Var.f55059c = lq2Var7.mo16451i() - this.f6590y;
                    } else {
                        ow2Var.f55059c = lq2Var7.mo16455m() + this.f6590y;
                    }
                }
            }
            ow2Var.f55061e = true;
        } else if (focusedChild != null && (this.f6583r.mo16449g(focusedChild) >= this.f6583r.mo16451i() || this.f6583r.mo16446d(focusedChild) <= this.f6583r.mo16455m())) {
            ow2Var.m18531b(focusedChild, y28.m24878K(focusedChild));
        }
        dd5 dd5Var = this.f6582q;
        dd5Var.f35441f = dd5Var.f35445j >= 0 ? 1 : -1;
        int[] iArr = this.f6580D;
        iArr[0] = 0;
        iArr[1] = 0;
        mo2655J0(k38Var, iArr);
        int iMo16455m2 = this.f6583r.mo16455m() + Math.max(0, iArr[0]);
        int iMo16452j = this.f6583r.mo16452j() + Math.max(0, iArr[1]);
        if (k38Var.f46633g && (i6 = this.f6589x) != -1 && this.f6590y != Integer.MIN_VALUE && (viewMo2696q = mo2696q(i6)) != null) {
            boolean z10 = this.f6586u;
            lq2 lq2Var8 = this.f6583r;
            if (z10) {
                iMo16451i2 = lq2Var8.mo16451i() - this.f6583r.mo16446d(viewMo2696q);
                iMo16449g3 = this.f6590y;
            } else {
                iMo16449g3 = lq2Var8.mo16449g(viewMo2696q) - this.f6583r.mo16455m();
                iMo16451i2 = this.f6590y;
            }
            int i10 = iMo16451i2 - iMo16449g3;
            if (i10 > 0) {
                iMo16455m2 += i10;
            } else {
                iMo16452j -= i10;
            }
        }
        boolean z11 = ow2Var.f55060d;
        boolean z12 = this.f6586u;
        if (!z11 ? !z12 : z12) {
            i8 = 1;
        }
        mo2624e1(g38Var, k38Var, ow2Var, i8);
        m24899p(g38Var);
        this.f6582q.f35447l = this.f6583r.mo16453k() == 0 && this.f6583r.mo16450h() == 0;
        this.f6582q.getClass();
        this.f6582q.f35444i = 0;
        boolean z13 = ow2Var.f55060d;
        int i11 = ow2Var.f55058b;
        if (z13) {
            m2695o1(i11, ow2Var.f55059c);
            dd5 dd5Var2 = this.f6582q;
            dd5Var2.f35443h = iMo16455m2;
            m2663Q0(g38Var, dd5Var2, k38Var, false);
            dd5 dd5Var3 = this.f6582q;
            i3 = dd5Var3.f35437b;
            int i12 = dd5Var3.f35439d;
            int i13 = dd5Var3.f35438c;
            if (i13 > 0) {
                iMo16452j += i13;
            }
            m2694n1(ow2Var.f55058b, ow2Var.f55059c);
            dd5 dd5Var4 = this.f6582q;
            dd5Var4.f35443h = iMo16452j;
            dd5Var4.f35439d += dd5Var4.f35440e;
            m2663Q0(g38Var, dd5Var4, k38Var, false);
            dd5 dd5Var5 = this.f6582q;
            i2 = dd5Var5.f35437b;
            int i14 = dd5Var5.f35438c;
            if (i14 > 0) {
                m2695o1(i12, i3);
                dd5 dd5Var6 = this.f6582q;
                dd5Var6.f35443h = i14;
                m2663Q0(g38Var, dd5Var6, k38Var, false);
                i3 = this.f6582q.f35437b;
            }
        } else {
            m2694n1(i11, ow2Var.f55059c);
            dd5 dd5Var7 = this.f6582q;
            dd5Var7.f35443h = iMo16452j;
            m2663Q0(g38Var, dd5Var7, k38Var, false);
            dd5 dd5Var8 = this.f6582q;
            i2 = dd5Var8.f35437b;
            int i15 = dd5Var8.f35439d;
            int i16 = dd5Var8.f35438c;
            if (i16 > 0) {
                iMo16455m2 += i16;
            }
            m2695o1(ow2Var.f55058b, ow2Var.f55059c);
            dd5 dd5Var9 = this.f6582q;
            dd5Var9.f35443h = iMo16455m2;
            dd5Var9.f35439d += dd5Var9.f35440e;
            m2663Q0(g38Var, dd5Var9, k38Var, false);
            dd5 dd5Var10 = this.f6582q;
            int i17 = dd5Var10.f35437b;
            int i18 = dd5Var10.f35438c;
            if (i18 > 0) {
                m2694n1(i15, i2);
                dd5 dd5Var11 = this.f6582q;
                dd5Var11.f35443h = i18;
                m2663Q0(g38Var, dd5Var11, k38Var, false);
                i2 = this.f6582q.f35437b;
            }
            i3 = i17;
        }
        if (m24906v() > 0) {
            if (this.f6586u ^ this.f6587v) {
                int iM2672Y1 = m2672Y0(i2, g38Var, k38Var, true);
                i4 = i3 + iM2672Y1;
                i5 = i2 + iM2672Y1;
                iM2672Y0 = m2673Z0(i4, g38Var, k38Var, false);
            } else {
                int iM2673Z0 = m2673Z0(i3, g38Var, k38Var, true);
                i4 = i3 + iM2673Z0;
                i5 = i2 + iM2673Z0;
                iM2672Y0 = m2672Y0(i5, g38Var, k38Var, false);
            }
            i3 = i4 + iM2672Y0;
            i2 = i5 + iM2672Y0;
        }
        if (k38Var.f46637k && m24906v() != 0 && !k38Var.f46633g && mo2613I0()) {
            List list2 = g38Var.f40126d;
            int size = list2.size();
            int iM24878K6 = y28.m24878K(m24904u(0));
            int i19 = 0;
            int iMo16447e = 0;
            int iMo16447e2 = 0;
            while (i19 < size) {
                o38 o38Var = (o38) list2.get(i19);
                boolean zM17790j = o38Var.m17790j();
                View view = o38Var.f53781a;
                if (!zM17790j) {
                    boolean z14 = o38Var.m17784d() < iM24878K6 ? true : z6;
                    boolean z15 = this.f6586u;
                    lq2 lq2Var9 = this.f6583r;
                    if (z14 != z15) {
                        iMo16447e += lq2Var9.mo16447e(view);
                    } else {
                        iMo16447e2 += lq2Var9.mo16447e(view);
                    }
                }
                i19++;
                z6 = false;
            }
            this.f6582q.f35446k = list2;
            if (iMo16447e > 0) {
                m2695o1(y28.m24878K(m2676b1()), i3);
                dd5 dd5Var12 = this.f6582q;
                dd5Var12.f35443h = iMo16447e;
                r4 = 0;
                dd5Var12.f35438c = 0;
                dd5Var12.m10294a(null);
                m2663Q0(g38Var, this.f6582q, k38Var, false);
            } else {
                r4 = 0;
            }
            if (iMo16447e2 > 0) {
                m2694n1(y28.m24878K(m2675a1()), i2);
                dd5 dd5Var13 = this.f6582q;
                dd5Var13.f35443h = iMo16447e2;
                dd5Var13.f35438c = r4;
                list = null;
                dd5Var13.m10294a(null);
                m2663Q0(g38Var, this.f6582q, k38Var, r4);
            } else {
                list = null;
            }
            this.f6582q.f35446k = list;
        }
        if (k38Var.f46633g) {
            ow2Var.m18533d();
        } else {
            lq2 lq2Var10 = this.f6583r;
            lq2Var10.f49997a = lq2Var10.mo16456n();
        }
        this.f6584s = this.f6587v;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m2684h1() {
        if (this.f6581p == 1 || !m2678c1()) {
            this.f6586u = this.f6585t;
        } else {
            this.f6586u = !this.f6585t;
        }
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: i */
    public final void mo2685i(int i, pj3 pj3Var) {
        boolean z;
        int i2;
        SavedState savedState = this.f6591z;
        if (savedState == null || (i2 = savedState.f6592a) < 0) {
            m2684h1();
            z = this.f6586u;
            i2 = this.f6589x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = savedState.f6594c;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f6579C && i2 >= 0 && i2 < i; i4++) {
            pj3Var.m19195a(i2, 0);
            i2 += i3;
        }
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: i0 */
    public void mo2629i0(k38 k38Var) {
        this.f6591z = null;
        this.f6589x = -1;
        this.f6590y = Integer.MIN_VALUE;
        this.f6577A.m18533d();
    }

    /* JADX INFO: renamed from: i1 */
    public final int m2686i1(int i, g38 g38Var, k38 k38Var) {
        if (m24906v() != 0 && i != 0) {
            m2662P0();
            this.f6582q.f35436a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            m2693m1(i2, iAbs, true, k38Var);
            dd5 dd5Var = this.f6582q;
            int iM2663Q0 = m2663Q0(g38Var, dd5Var, k38Var, false) + dd5Var.f35442g;
            if (iM2663Q0 >= 0) {
                if (iAbs > iM2663Q0) {
                    i = i2 * iM2663Q0;
                }
                this.f6583r.mo16459q(-i);
                this.f6582q.f35445j = i;
                return i;
            }
        }
        return 0;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: j */
    public final int mo2687j(k38 k38Var) {
        return m2656L0(k38Var);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: j0 */
    public final void mo2688j0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f6591z = savedState;
            if (this.f6589x != -1) {
                savedState.f6592a = -1;
            }
            m24905u0();
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final void m2689j1(int i, int i2) {
        this.f6589x = i;
        this.f6590y = i2;
        SavedState savedState = this.f6591z;
        if (savedState != null) {
            savedState.f6592a = -1;
        }
        m24905u0();
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: k */
    public int mo2630k(k38 k38Var) {
        return m2657M0(k38Var);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: k0 */
    public final Parcelable mo2690k0() {
        SavedState savedState = this.f6591z;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f6592a = savedState.f6592a;
            savedState2.f6593b = savedState.f6593b;
            savedState2.f6594c = savedState.f6594c;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (m24906v() <= 0) {
            savedState3.f6592a = -1;
            return savedState3;
        }
        m2662P0();
        boolean z = this.f6584s ^ this.f6586u;
        savedState3.f6594c = z;
        if (z) {
            View viewM2675a1 = m2675a1();
            savedState3.f6593b = this.f6583r.mo16451i() - this.f6583r.mo16446d(viewM2675a1);
            savedState3.f6592a = y28.m24878K(viewM2675a1);
            return savedState3;
        }
        View viewM2676b1 = m2676b1();
        savedState3.f6592a = y28.m24878K(viewM2676b1);
        savedState3.f6593b = this.f6583r.mo16449g(viewM2676b1) - this.f6583r.mo16455m();
        return savedState3;
    }

    /* JADX INFO: renamed from: k1 */
    public final void m2691k1(int i) {
        if (i != 0 && i != 1) {
            C3386nv.m17626m(ux5.m22988k(i, "invalid orientation:"));
            return;
        }
        mo2677c(null);
        if (i != this.f6581p || this.f6583r == null) {
            lq2 lq2VarM16443b = lq2.m16443b(this, i);
            this.f6583r = lq2VarM16443b;
            this.f6577A.f55062f = lq2VarM16443b;
            this.f6581p = i;
            m24905u0();
        }
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: l */
    public int mo2631l(k38 k38Var) {
        return m2658N0(k38Var);
    }

    /* JADX INFO: renamed from: l1 */
    public void mo2632l1(boolean z) {
        mo2677c(null);
        if (this.f6587v == z) {
            return;
        }
        this.f6587v = z;
        m24905u0();
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: m */
    public final int mo2692m(k38 k38Var) {
        return m2656L0(k38Var);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: m0 */
    public boolean mo2633m0(int i, Bundle bundle) {
        int iMin;
        if (super.mo2633m0(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.f6581p == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.f69172b;
                iMin = Math.min(i2, mo2615M(recyclerView.f6647c, recyclerView.f6606C0) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.f69172b;
                iMin = Math.min(i3, mo2648x(recyclerView2.f6647c, recyclerView2.f6606C0) - 1);
            }
            if (iMin >= 0) {
                m2689j1(iMin, 0);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m1 */
    public final void m2693m1(int i, int i2, boolean z, k38 k38Var) {
        int iMo16455m;
        this.f6582q.f35447l = this.f6583r.mo16453k() == 0 && this.f6583r.mo16450h() == 0;
        this.f6582q.f35441f = i;
        int[] iArr = this.f6580D;
        iArr[0] = 0;
        iArr[1] = 0;
        mo2655J0(k38Var, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        dd5 dd5Var = this.f6582q;
        int i3 = z2 ? iMax2 : iMax;
        dd5Var.f35443h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        dd5Var.f35444i = iMax;
        if (z2) {
            dd5Var.f35443h = this.f6583r.mo16452j() + i3;
            View viewM2675a1 = m2675a1();
            dd5 dd5Var2 = this.f6582q;
            dd5Var2.f35440e = this.f6586u ? -1 : 1;
            int iM24878K = y28.m24878K(viewM2675a1);
            dd5 dd5Var3 = this.f6582q;
            dd5Var2.f35439d = iM24878K + dd5Var3.f35440e;
            dd5Var3.f35437b = this.f6583r.mo16446d(viewM2675a1);
            iMo16455m = this.f6583r.mo16446d(viewM2675a1) - this.f6583r.mo16451i();
        } else {
            View viewM2676b1 = m2676b1();
            dd5 dd5Var4 = this.f6582q;
            dd5Var4.f35443h = this.f6583r.mo16455m() + dd5Var4.f35443h;
            dd5 dd5Var5 = this.f6582q;
            dd5Var5.f35440e = this.f6586u ? 1 : -1;
            int iM24878K2 = y28.m24878K(viewM2676b1);
            dd5 dd5Var6 = this.f6582q;
            dd5Var5.f35439d = iM24878K2 + dd5Var6.f35440e;
            dd5Var6.f35437b = this.f6583r.mo16449g(viewM2676b1);
            iMo16455m = (-this.f6583r.mo16449g(viewM2676b1)) + this.f6583r.mo16455m();
        }
        dd5 dd5Var7 = this.f6582q;
        dd5Var7.f35438c = i2;
        if (z) {
            dd5Var7.f35438c = i2 - iMo16455m;
        }
        dd5Var7.f35442g = iMo16455m;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: n */
    public int mo2634n(k38 k38Var) {
        return m2657M0(k38Var);
    }

    /* JADX INFO: renamed from: n1 */
    public final void m2694n1(int i, int i2) {
        this.f6582q.f35438c = this.f6583r.mo16451i() - i2;
        dd5 dd5Var = this.f6582q;
        dd5Var.f35440e = this.f6586u ? -1 : 1;
        dd5Var.f35439d = i;
        dd5Var.f35441f = 1;
        dd5Var.f35437b = i2;
        dd5Var.f35442g = Integer.MIN_VALUE;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: o */
    public int mo2635o(k38 k38Var) {
        return m2658N0(k38Var);
    }

    /* JADX INFO: renamed from: o1 */
    public final void m2695o1(int i, int i2) {
        this.f6582q.f35438c = i2 - this.f6583r.mo16455m();
        dd5 dd5Var = this.f6582q;
        dd5Var.f35439d = i;
        dd5Var.f35440e = this.f6586u ? 1 : -1;
        dd5Var.f35441f = -1;
        dd5Var.f35437b = i2;
        dd5Var.f35442g = Integer.MIN_VALUE;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: q */
    public final View mo2696q(int i) {
        int iM24906v = m24906v();
        if (iM24906v == 0) {
            return null;
        }
        int iM24878K = i - y28.m24878K(m24904u(0));
        if (iM24878K >= 0 && iM24878K < iM24906v) {
            View viewM24904u = m24904u(iM24878K);
            if (y28.m24878K(viewM24904u) == i) {
                return viewM24904u;
            }
        }
        return super.mo2696q(i);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: r */
    public z28 mo2638r() {
        return new z28(-2, -2);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: v0 */
    public int mo2645v0(int i, g38 g38Var, k38 k38Var) {
        if (this.f6581p == 1) {
            return 0;
        }
        return m2686i1(i, g38Var, k38Var);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: w0 */
    public final void mo2697w0(int i) {
        this.f6589x = i;
        this.f6590y = Integer.MIN_VALUE;
        SavedState savedState = this.f6591z;
        if (savedState != null) {
            savedState.f6592a = -1;
        }
        m24905u0();
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: x0 */
    public int mo2649x0(int i, g38 g38Var, k38 k38Var) {
        if (this.f6581p == 0) {
            return 0;
        }
        return m2686i1(i, g38Var, k38Var);
    }

    public LinearLayoutManager(int i) {
        this.f6581p = 1;
        this.f6585t = false;
        this.f6586u = false;
        this.f6587v = false;
        this.f6588w = true;
        this.f6589x = -1;
        this.f6590y = Integer.MIN_VALUE;
        this.f6591z = null;
        this.f6577A = new ow2();
        this.f6578B = new C3665uy();
        this.f6579C = 2;
        this.f6580D = new int[2];
        m2691k1(i);
        mo2677c(null);
        if (this.f6585t) {
            this.f6585t = false;
            m24905u0();
        }
    }
}
