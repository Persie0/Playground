package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import p000.C0797b4;
import p000.C3386nv;
import p000.C3665uy;
import p000.C3671v3;
import p000.bq3;
import p000.dd5;
import p000.dta;
import p000.g38;
import p000.k38;
import p000.m58;
import p000.o38;
import p000.ow2;
import p000.p28;
import p000.p33;
import p000.pj3;
import p000.ux5;
import p000.wq1;
import p000.y28;
import p000.z28;

/* JADX INFO: loaded from: classes2.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: P */
    public static final Set f6565P = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));

    /* JADX INFO: renamed from: E */
    public boolean f6566E;

    /* JADX INFO: renamed from: F */
    public int f6567F;

    /* JADX INFO: renamed from: G */
    public int[] f6568G;

    /* JADX INFO: renamed from: H */
    public View[] f6569H;

    /* JADX INFO: renamed from: I */
    public final SparseIntArray f6570I;

    /* JADX INFO: renamed from: J */
    public final SparseIntArray f6571J;

    /* JADX INFO: renamed from: K */
    public final p33 f6572K;

    /* JADX INFO: renamed from: L */
    public final Rect f6573L;

    /* JADX INFO: renamed from: M */
    public int f6574M;

    /* JADX INFO: renamed from: N */
    public int f6575N;

    /* JADX INFO: renamed from: O */
    public int f6576O;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f6566E = false;
        this.f6567F = -1;
        this.f6570I = new SparseIntArray();
        this.f6571J = new SparseIntArray();
        this.f6572K = new p33(5);
        this.f6573L = new Rect();
        this.f6574M = -1;
        this.f6575N = -1;
        this.f6576O = -1;
        m2611A1(y28.m24879L(context, attributeSet, i, i2).f67680b);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: A0 */
    public final void mo2610A0(Rect rect, int i, int i2) {
        int iM24882g;
        int iM24882g2;
        if (this.f6568G == null) {
            super.mo2610A0(rect, i, i2);
        }
        int iM24893I = m24893I() + m24891H();
        int iM24890G = m24890G() + m24894J();
        if (this.f6581p == 1) {
            int iHeight = rect.height() + iM24890G;
            RecyclerView recyclerView = this.f69172b;
            WeakHashMap weakHashMap = dta.f36217a;
            iM24882g2 = y28.m24882g(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.f6568G;
            iM24882g = y28.m24882g(i, iArr[iArr.length - 1] + iM24893I, this.f69172b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM24893I;
            RecyclerView recyclerView2 = this.f69172b;
            WeakHashMap weakHashMap2 = dta.f36217a;
            iM24882g = y28.m24882g(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f6568G;
            iM24882g2 = y28.m24882g(i2, iArr2[iArr2.length - 1] + iM24890G, this.f69172b.getMinimumHeight());
        }
        this.f69172b.setMeasuredDimension(iM24882g, iM24882g2);
    }

    /* JADX INFO: renamed from: A1 */
    public final void m2611A1(int i) {
        if (i == this.f6567F) {
            return;
        }
        this.f6566E = true;
        if (i < 1) {
            C3386nv.m17626m(ux5.m22988k(i, "Span count should be at least 1. Provided "));
            return;
        }
        this.f6567F = i;
        this.f6572K.m18871O();
        m24905u0();
    }

    /* JADX INFO: renamed from: B1 */
    public final void m2612B1() {
        int iM24890G;
        int iM24894J;
        if (this.f6581p == 1) {
            iM24890G = this.f69184n - m24893I();
            iM24894J = m24891H();
        } else {
            iM24890G = this.f69185o - m24890G();
            iM24894J = m24894J();
        }
        m2636p1(iM24890G - iM24894J);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.y28
    /* JADX INFO: renamed from: I0 */
    public final boolean mo2613I0() {
        return this.f6591z == null && !this.f6566E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: K0 */
    public final void mo2614K0(k38 k38Var, dd5 dd5Var, pj3 pj3Var) {
        int i;
        int i2 = this.f6567F;
        for (int i3 = 0; i3 < this.f6567F && (i = dd5Var.f35439d) >= 0 && i < k38Var.m14789b() && i2 > 0; i3++) {
            pj3Var.m19195a(dd5Var.f35439d, Math.max(0, dd5Var.f35442g));
            this.f6572K.getClass();
            i2--;
            dd5Var.f35439d += dd5Var.f35440e;
        }
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: M */
    public final int mo2615M(g38 g38Var, k38 k38Var) {
        if (this.f6581p == 0) {
            return Math.min(this.f6567F, m24888F());
        }
        if (k38Var.m14789b() < 1) {
            return 0;
        }
        return m2647w1(k38Var.m14789b() - 1, g38Var, k38Var) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.y28
    /* JADX INFO: renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo2616X(View view, int i, g38 g38Var, k38 k38Var) {
        View viewM2712E;
        int iM24906v;
        int i2;
        int iM24906v2;
        View view2;
        View view3;
        int i3;
        int i4;
        g38 g38Var2 = g38Var;
        k38 k38Var2 = k38Var;
        RecyclerView recyclerView = this.f69172b;
        if (recyclerView == null || (viewM2712E = recyclerView.m2712E(view)) == null || ((ArrayList) this.f69171a.f63596e).contains(viewM2712E)) {
            viewM2712E = null;
        }
        if (viewM2712E != null) {
            bq3 bq3Var = (bq3) viewM2712E.getLayoutParams();
            int i5 = bq3Var.f8865e;
            int i6 = bq3Var.f8866f + i5;
            if (super.mo2616X(view, i, g38Var, k38Var) != null) {
                if ((m2660O0(i) == 1) != this.f6586u) {
                    iM24906v2 = m24906v() - 1;
                    iM24906v = -1;
                    i2 = -1;
                } else {
                    iM24906v = m24906v();
                    i2 = 1;
                    iM24906v2 = 0;
                }
                boolean z = this.f6581p == 1 && m2678c1();
                int iM2647w1 = m2647w1(iM24906v2, g38Var2, k38Var2);
                View view4 = null;
                int i7 = -1;
                int i8 = -1;
                int iMin = 0;
                int i9 = iM24906v2;
                int iMin2 = 0;
                View view5 = null;
                while (true) {
                    view2 = view5;
                    if (i9 == iM24906v) {
                        break;
                    }
                    int iM2647w2 = m2647w1(i9, g38Var2, k38Var2);
                    View viewM24904u = m24904u(i9);
                    if (viewM24904u == viewM2712E) {
                        break;
                    }
                    if (!viewM24904u.hasFocusable() || iM2647w2 == iM2647w1) {
                        bq3 bq3Var2 = (bq3) viewM24904u.getLayoutParams();
                        int i10 = bq3Var2.f8865e;
                        view3 = viewM2712E;
                        int i11 = bq3Var2.f8866f + i10;
                        if (viewM24904u.hasFocusable() && i10 == i5 && i11 == i6) {
                            return viewM24904u;
                        }
                        if (!(viewM24904u.hasFocusable() && view4 == null) && (viewM24904u.hasFocusable() || view2 != null)) {
                            i3 = iM24906v;
                            int iMin3 = Math.min(i11, i6) - Math.max(i10, i5);
                            if (viewM24904u.hasFocusable()) {
                                if (iMin3 <= iMin) {
                                    if (iMin3 == iMin) {
                                    }
                                    i4 = iMin;
                                }
                                i4 = iMin;
                            } else if (view4 == null) {
                                i4 = iMin;
                                if (!this.f69173c.m19908g(viewM24904u) || !this.f69174d.m19908g(viewM24904u)) {
                                    if (iMin3 <= iMin2) {
                                        if (iMin3 == iMin2) {
                                            if (z == (i10 > i7)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                i4 = iMin;
                            }
                            i9 += i2;
                            g38Var2 = g38Var;
                            k38Var2 = k38Var;
                            viewM2712E = view3;
                            iM24906v = i3;
                        } else {
                            i4 = iMin;
                            i3 = iM24906v;
                        }
                        boolean zHasFocusable = viewM24904u.hasFocusable();
                        int i12 = bq3Var2.f8865e;
                        if (zHasFocusable) {
                            iMin = Math.min(i11, i6) - Math.max(i10, i5);
                            view4 = viewM24904u;
                            i8 = i12;
                            view5 = view2;
                        } else {
                            iMin2 = Math.min(i11, i6) - Math.max(i10, i5);
                            i7 = i12;
                            iMin = i4;
                            view5 = viewM24904u;
                        }
                        i9 += i2;
                        g38Var2 = g38Var;
                        k38Var2 = k38Var;
                        viewM2712E = view3;
                        iM24906v = i3;
                    } else {
                        if (view4 != null) {
                            break;
                        }
                        view3 = viewM2712E;
                        i4 = iMin;
                        i3 = iM24906v;
                    }
                    view5 = view2;
                    iMin = i4;
                    i9 += i2;
                    g38Var2 = g38Var;
                    k38Var2 = k38Var;
                    viewM2712E = view3;
                    iM24906v = i3;
                }
                return view4 != null ? view4 : view2;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: X0 */
    public final View mo2617X0(g38 g38Var, k38 k38Var, boolean z, boolean z2) {
        int i;
        int iM24906v;
        int iM24906v2 = m24906v();
        int i2 = 1;
        if (z2) {
            iM24906v = m24906v() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iM24906v2;
            iM24906v = 0;
        }
        int iM14789b = k38Var.m14789b();
        m2662P0();
        int iMo16455m = this.f6583r.mo16455m();
        int iMo16451i = this.f6583r.mo16451i();
        View view = null;
        View view2 = null;
        while (iM24906v != i) {
            View viewM24904u = m24904u(iM24906v);
            int iM24878K = y28.m24878K(viewM24904u);
            if (iM24878K >= 0 && iM24878K < iM14789b && m2650x1(iM24878K, g38Var, k38Var) == 0) {
                if (((z28) viewM24904u.getLayoutParams()).f70799a.m17790j()) {
                    if (view2 == null) {
                        view2 = viewM24904u;
                    }
                } else {
                    if (this.f6583r.mo16449g(viewM24904u) < iMo16451i && this.f6583r.mo16446d(viewM24904u) >= iMo16455m) {
                        return viewM24904u;
                    }
                    if (view == null) {
                        view = viewM24904u;
                    }
                }
            }
            iM24906v += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.y28
    /* JADX INFO: renamed from: Z */
    public final void mo2618Z(g38 g38Var, k38 k38Var, C0797b4 c0797b4) {
        super.mo2618Z(g38Var, k38Var, c0797b4);
        c0797b4.m3279j(GridView.class.getName());
        p28 p28Var = this.f69172b.f6611H;
        if (p28Var == null || p28Var.mo6133a() <= 1) {
            return;
        }
        c0797b4.m3272b(C3671v3.f64768r);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: a0 */
    public final void mo2619a0(g38 g38Var, k38 k38Var, View view, C0797b4 c0797b4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof bq3)) {
            m24897b0(view, c0797b4);
            return;
        }
        bq3 bq3Var = (bq3) layoutParams;
        int iM2647w1 = m2647w1(bq3Var.f70799a.m17784d(), g38Var, k38Var);
        int i = this.f6581p;
        int i2 = bq3Var.f8865e;
        int i3 = bq3Var.f8866f;
        if (i == 0) {
            c0797b4.m3281l(m58.m16638l(false, i2, i3, iM2647w1, 1));
        } else {
            c0797b4.m3281l(m58.m16638l(false, iM2647w1, 1, i2, i3));
        }
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: c0 */
    public final void mo2620c0(int i, int i2) {
        p33 p33Var = this.f6572K;
        p33Var.m18871O();
        ((SparseIntArray) p33Var.f55514c).clear();
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: d0 */
    public final void mo2621d0() {
        p33 p33Var = this.f6572K;
        p33Var.m18871O();
        ((SparseIntArray) p33Var.f55514c).clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v31 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: d1 */
    public final void mo2622d1(g38 g38Var, k38 k38Var, dd5 dd5Var, C3665uy c3665uy) {
        int i;
        int i2;
        int i3;
        int iMo16448f;
        int iM24891H;
        int iM24883w;
        int iM24883w2;
        ?? r12;
        int i4;
        View viewM10295b;
        int iMo16454l = this.f6583r.mo16454l();
        boolean z = iMo16454l != 1073741824;
        int i5 = m24906v() > 0 ? this.f6568G[this.f6567F] : 0;
        if (z) {
            m2612B1();
        }
        boolean z2 = dd5Var.f35440e == 1;
        int iM2650x1 = this.f6567F;
        if (!z2) {
            iM2650x1 = m2650x1(dd5Var.f35439d, g38Var, k38Var) + m2651y1(dd5Var.f35439d, g38Var, k38Var);
        }
        int i6 = 0;
        while (i6 < this.f6567F && (i4 = dd5Var.f35439d) >= 0 && i4 < k38Var.m14789b() && iM2650x1 > 0) {
            int i7 = dd5Var.f35439d;
            int iM2651y1 = m2651y1(i7, g38Var, k38Var);
            if (iM2651y1 > this.f6567F) {
                C3386nv.m17626m(wq1.m24123s(ux5.m22994q(i7, iM2651y1, "Item at position ", " requires ", " spans but GridLayoutManager has only "), this.f6567F, " spans."));
                return;
            }
            iM2650x1 -= iM2651y1;
            if (iM2650x1 < 0 || (viewM10295b = dd5Var.m10295b(g38Var)) == null) {
                break;
            }
            this.f6569H[i6] = viewM10295b;
            i6++;
        }
        if (i6 == 0) {
            c3665uy.f64498b = true;
            return;
        }
        if (z2) {
            i3 = 1;
            i2 = i6;
            i = 0;
        } else {
            i = i6 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i8 = 0;
        while (i != i2) {
            View view = this.f6569H[i];
            bq3 bq3Var = (bq3) view.getLayoutParams();
            int iM2651y2 = m2651y1(y28.m24878K(view), g38Var, k38Var);
            bq3Var.f8866f = iM2651y2;
            bq3Var.f8865e = i8;
            i8 += iM2651y2;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.f6569H[i10];
            if (dd5Var.f35446k != null) {
                r12 = 0;
                r12 = 0;
                if (z2) {
                    m24896b(view2, -1, true);
                } else {
                    m24896b(view2, 0, true);
                }
            } else if (z2) {
                r12 = 0;
                m24896b(view2, -1, false);
            } else {
                r12 = 0;
                m24896b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f69172b;
            Rect rect = this.f6573L;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.m2720O(view2));
            }
            m2652z1(view2, iMo16454l, r12);
            int iMo16447e = this.f6583r.mo16447e(view2);
            if (iMo16447e > i9) {
                i9 = iMo16447e;
            }
            float fMo16448f = (this.f6583r.mo16448f(view2) * 1.0f) / ((bq3) view2.getLayoutParams()).f8866f;
            if (fMo16448f > f) {
                f = fMo16448f;
            }
        }
        if (z) {
            m2636p1(Math.max(Math.round(f * this.f6567F), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.f6569H[i11];
                m2652z1(view3, 1073741824, true);
                int iMo16447e2 = this.f6583r.mo16447e(view3);
                if (iMo16447e2 > i9) {
                    i9 = iMo16447e2;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.f6569H[i12];
            if (this.f6583r.mo16447e(view4) != i9) {
                bq3 bq3Var2 = (bq3) view4.getLayoutParams();
                Rect rect2 = bq3Var2.f70800b;
                int i13 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) bq3Var2).topMargin + ((ViewGroup.MarginLayoutParams) bq3Var2).bottomMargin;
                int i14 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) bq3Var2).leftMargin + ((ViewGroup.MarginLayoutParams) bq3Var2).rightMargin;
                int iM2646v1 = m2646v1(bq3Var2.f8865e, bq3Var2.f8866f);
                if (this.f6581p == 1) {
                    iM24883w2 = y28.m24883w(false, iM2646v1, 1073741824, i14, ((ViewGroup.MarginLayoutParams) bq3Var2).width);
                    iM24883w = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iM24883w = y28.m24883w(false, iM2646v1, 1073741824, i13, ((ViewGroup.MarginLayoutParams) bq3Var2).height);
                    iM24883w2 = iMakeMeasureSpec;
                }
                if (m24889F0(view4, iM24883w2, iM24883w, (z28) view4.getLayoutParams())) {
                    view4.measure(iM24883w2, iM24883w);
                }
            }
        }
        int iM24894J = 0;
        c3665uy.f64497a = i9;
        int i15 = this.f6581p;
        int i16 = dd5Var.f35441f;
        int iMo16448f2 = dd5Var.f35437b;
        if (i15 != 1) {
            if (i16 == -1) {
                iM24891H = iMo16448f2 - i9;
                iMo16448f = iMo16448f2;
            } else {
                iMo16448f = iMo16448f2 + i9;
                iM24891H = iMo16448f2;
            }
            iMo16448f2 = iM24894J;
        } else if (i16 == -1) {
            iM24894J = iMo16448f2 - i9;
            iM24891H = 0;
            iMo16448f = 0;
        } else {
            iMo16448f = 0;
            iM24894J = iMo16448f2;
            iMo16448f2 += i9;
            iM24891H = 0;
        }
        int i17 = 0;
        while (true) {
            View[] viewArr = this.f6569H;
            if (i17 >= i6) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            View view5 = viewArr[i17];
            bq3 bq3Var3 = (bq3) view5.getLayoutParams();
            if (this.f6581p != 1) {
                iM24894J = m24894J() + this.f6568G[bq3Var3.f8865e];
                iMo16448f2 = this.f6583r.mo16448f(view5) + iM24894J;
            } else if (m2678c1()) {
                int iM24891H2 = m24891H() + this.f6568G[this.f6567F - bq3Var3.f8865e];
                iMo16448f = iM24891H2;
                iM24891H = iM24891H2 - this.f6583r.mo16448f(view5);
            } else {
                iM24891H = m24891H() + this.f6568G[bq3Var3.f8865e];
                iMo16448f = this.f6583r.mo16448f(view5) + iM24891H;
            }
            y28.m24881R(view5, iM24891H, iM24894J, iMo16448f, iMo16448f2);
            if (bq3Var3.f70799a.m17790j() || bq3Var3.f70799a.m17793m()) {
                c3665uy.f64499c = true;
            }
            c3665uy.f64500d = view5.hasFocusable() | c3665uy.f64500d;
            i17++;
        }
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: e0 */
    public final void mo2623e0(int i, int i2) {
        p33 p33Var = this.f6572K;
        p33Var.m18871O();
        ((SparseIntArray) p33Var.f55514c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: e1 */
    public final void mo2624e1(g38 g38Var, k38 k38Var, ow2 ow2Var, int i) {
        m2612B1();
        if (k38Var.m14789b() > 0 && !k38Var.f46633g) {
            boolean z = i == 1;
            int iM2650x1 = m2650x1(ow2Var.f55058b, g38Var, k38Var);
            if (z) {
                while (iM2650x1 > 0) {
                    int i2 = ow2Var.f55058b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    ow2Var.f55058b = i3;
                    iM2650x1 = m2650x1(i3, g38Var, k38Var);
                }
            } else {
                int iM14789b = k38Var.m14789b() - 1;
                int i4 = ow2Var.f55058b;
                while (i4 < iM14789b) {
                    int i5 = i4 + 1;
                    int iM2650x2 = m2650x1(i5, g38Var, k38Var);
                    if (iM2650x2 <= iM2650x1) {
                        break;
                    }
                    i4 = i5;
                    iM2650x1 = iM2650x2;
                }
                ow2Var.f55058b = i4;
            }
        }
        m2637q1();
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: f */
    public final boolean mo2625f(z28 z28Var) {
        return z28Var instanceof bq3;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: f0 */
    public final void mo2626f0(int i, int i2) {
        p33 p33Var = this.f6572K;
        p33Var.m18871O();
        ((SparseIntArray) p33Var.f55514c).clear();
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: g0 */
    public final void mo2627g0(int i, int i2) {
        p33 p33Var = this.f6572K;
        p33Var.m18871O();
        ((SparseIntArray) p33Var.f55514c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.y28
    /* JADX INFO: renamed from: h0 */
    public void mo2628h0(g38 g38Var, k38 k38Var) {
        boolean z = k38Var.f46633g;
        SparseIntArray sparseIntArray = this.f6571J;
        SparseIntArray sparseIntArray2 = this.f6570I;
        if (z) {
            int iM24906v = m24906v();
            for (int i = 0; i < iM24906v; i++) {
                bq3 bq3Var = (bq3) m24904u(i).getLayoutParams();
                int iM17784d = bq3Var.f70799a.m17784d();
                sparseIntArray2.put(iM17784d, bq3Var.f8866f);
                sparseIntArray.put(iM17784d, bq3Var.f8865e);
            }
        }
        super.mo2628h0(g38Var, k38Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.y28
    /* JADX INFO: renamed from: i0 */
    public final void mo2629i0(k38 k38Var) {
        View viewMo2696q;
        super.mo2629i0(k38Var);
        this.f6566E = false;
        int i = this.f6574M;
        if (i == -1 || (viewMo2696q = mo2696q(i)) == null) {
            return;
        }
        viewMo2696q.sendAccessibilityEvent(67108864);
        this.f6574M = -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.y28
    /* JADX INFO: renamed from: k */
    public final int mo2630k(k38 k38Var) {
        return m2657M0(k38Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.y28
    /* JADX INFO: renamed from: l */
    public final int mo2631l(k38 k38Var) {
        return m2658N0(k38Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: l1 */
    public final void mo2632l1(boolean z) {
        if (z) {
            C3386nv.m17636w("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.mo2632l1(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a9 A[EDGE_INSN: B:122:0x01a9->B:166:0x027c BREAK  A[LOOP:2: B:126:0x01b9->B:135:0x01e2, LOOP_LABEL: LOOP:2: B:126:0x01b9->B:135:0x01e2]] */
    /* JADX WARN: Code duplicated, block: B:123:0x01ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:131:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:134:0x01da A[LOOP:3: B:129:0x01c7->B:134:0x01da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:142:0x0213  */
    /* JADX WARN: Code duplicated, block: B:143:0x0215  */
    /* JADX WARN: Code duplicated, block: B:145:0x0218 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x0227  */
    /* JADX WARN: Code duplicated, block: B:153:0x0235  */
    /* JADX WARN: Code duplicated, block: B:156:0x0243  */
    /* JADX WARN: Code duplicated, block: B:163:0x0262  */
    /* JADX WARN: Code duplicated, block: B:167:0x027e  */
    /* JADX WARN: Code duplicated, block: B:206:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:? A[LOOP:4: B:137:0x01ed->B:211:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:? A[LOOP:7: B:161:0x025c->B:221:?, LOOP_END, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.y28
    /* JADX INFO: renamed from: m0 */
    public final boolean mo2633m0(int i, Bundle bundle) {
        View viewM24904u;
        o38 o38VarM2719M;
        int iIntValue;
        int i2;
        TreeMap treeMap;
        int i3;
        Iterator it;
        Integer num;
        int iIntValue2;
        Iterator it2;
        Integer num2;
        TreeMap treeMap2;
        int i4;
        Iterator it3;
        Integer num3;
        int iIntValue3;
        Iterator it4;
        Integer num4;
        if (i == C3671v3.f64768r.m23075a() && i != -1) {
            int i5 = 0;
            while (true) {
                if (i5 >= m24906v()) {
                    viewM24904u = null;
                    break;
                }
                View viewM24904u2 = m24904u(i5);
                Objects.requireNonNull(viewM24904u2);
                if (viewM24904u2.isAccessibilityFocused()) {
                    viewM24904u = m24904u(i5);
                    break;
                }
                i5++;
            }
            if (viewM24904u != null && bundle != null) {
                int i6 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (f6565P.contains(Integer.valueOf(i6)) && (o38VarM2719M = this.f69172b.m2719M(viewM24904u)) != null) {
                    int iM17782b = o38VarM2719M.m17782b();
                    int iM2641s1 = m2641s1(iM17782b);
                    int iM2639r1 = m2639r1(iM17782b);
                    if (iM2641s1 >= 0 && iM2639r1 >= 0) {
                        if (!m2643t1(iM17782b).contains(Integer.valueOf(this.f6575N)) || !m2644u1(m2639r1(iM17782b), iM17782b).contains(Integer.valueOf(this.f6576O))) {
                            this.f6575N = iM2641s1;
                            this.f6576O = iM2639r1;
                        }
                        int i7 = this.f6575N;
                        if (i7 == -1) {
                            i7 = iM2641s1;
                        }
                        int i8 = this.f6576O;
                        if (i8 != -1) {
                            iM2639r1 = i8;
                        }
                        if (i6 == 17) {
                            iIntValue = iM17782b - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iM2641s2 = m2641s1(iIntValue);
                                    int iM2639r2 = m2639r1(iIntValue);
                                    if (iM2641s2 >= 0 && iM2639r2 >= 0) {
                                        if (this.f6581p != 1) {
                                            if (m2643t1(iIntValue).contains(Integer.valueOf(i7)) && iM2639r2 < iM2639r1) {
                                                this.f6576O = iM2639r2;
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if ((iM2641s2 == i7 && iM2639r2 < iM2639r1) || iM2641s2 < i7) {
                                                this.f6575N = iM2641s2;
                                                this.f6576O = iM2639r2;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iM2641s1 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < m24888F()) {
                                                    it2 = m2643t1(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iM2641s1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.f6575N = iIntValue2;
                                                                this.f6576O = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iM2641s1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < m24888F()) {
                                                it4 = m2643t1(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iM2641s1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.f6575N = iIntValue3;
                                                            this.f6576O = m2639r1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                mo2697w0(iIntValue);
                                this.f6574M = iIntValue;
                                return true;
                            }
                        } else if (i6 == 33) {
                            iIntValue = iM17782b - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iM2641s3 = m2641s1(iIntValue);
                                    int iM2639r3 = m2639r1(iIntValue);
                                    if (iM2641s3 >= 0 && iM2639r3 >= 0) {
                                        if (this.f6581p != 1) {
                                            if (iM2641s3 < i7 && iM2639r3 == iM2639r1) {
                                                this.f6575N = ((Integer) Collections.max(m2643t1(iIntValue))).intValue();
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if (iM2641s3 < i7 && m2644u1(m2639r1(iIntValue), iIntValue).contains(Integer.valueOf(iM2639r1))) {
                                                this.f6575N = iM2641s3;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iM2641s1 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < m24888F()) {
                                                    it2 = m2643t1(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iM2641s1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.f6575N = iIntValue2;
                                                                this.f6576O = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iM2641s1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < m24888F()) {
                                                it4 = m2643t1(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iM2641s1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.f6575N = iIntValue3;
                                                            this.f6576O = m2639r1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                mo2697w0(iIntValue);
                                this.f6574M = iIntValue;
                                return true;
                            }
                        } else if (i6 == 66) {
                            iIntValue = iM17782b + 1;
                            while (true) {
                                if (iIntValue < m24888F()) {
                                    int iM2641s4 = m2641s1(iIntValue);
                                    int iM2639r4 = m2639r1(iIntValue);
                                    if (iM2641s4 >= 0 && iM2639r4 >= 0) {
                                        if (this.f6581p != 1) {
                                            if (iM2639r4 > iM2639r1 && m2643t1(iIntValue).contains(Integer.valueOf(i7))) {
                                                this.f6576O = iM2639r4;
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if ((iM2641s4 == i7 && iM2639r4 > iM2639r1) || iM2641s4 > i7) {
                                                this.f6575N = iM2641s4;
                                                this.f6576O = iM2639r4;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iM2641s1 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < m24888F()) {
                                                    it2 = m2643t1(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iM2641s1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.f6575N = iIntValue2;
                                                                this.f6576O = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iM2641s1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < m24888F()) {
                                                it4 = m2643t1(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iM2641s1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.f6575N = iIntValue3;
                                                            this.f6576O = m2639r1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                mo2697w0(iIntValue);
                                this.f6574M = iIntValue;
                                return true;
                            }
                        } else if (i6 == 130) {
                            iIntValue = iM17782b + 1;
                            while (true) {
                                if (iIntValue < m24888F()) {
                                    int iM2641s5 = m2641s1(iIntValue);
                                    int iM2639r5 = m2639r1(iIntValue);
                                    if (iM2641s5 >= 0 && iM2639r5 >= 0) {
                                        if (this.f6581p != 1) {
                                            if (iM2641s5 > i7 && iM2639r5 == iM2639r1) {
                                                this.f6575N = m2641s1(iIntValue);
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if (iM2641s5 > i7 && (iM2639r5 == iM2639r1 || m2644u1(m2639r1(iIntValue), iIntValue).contains(Integer.valueOf(iM2639r1)))) {
                                                this.f6575N = iM2641s5;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1 && (i2 = this.f6581p) == 0) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iM2641s1 < 0 || i2 == 1) {
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                        treeMap = new TreeMap();
                                        i3 = 0;
                                        loop5: while (true) {
                                            if (i3 < m24888F()) {
                                                it2 = m2643t1(i3).iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        num2 = (Integer) it2.next();
                                                        if (num2.intValue() < 0) {
                                                            if (!treeMap.containsKey(num2)) {
                                                                treeMap.put(num2, Integer.valueOf(i3));
                                                            }
                                                        }
                                                    } else {
                                                        i3++;
                                                    }
                                                }
                                            } else {
                                                it = treeMap.keySet().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        num = (Integer) it.next();
                                                        iIntValue2 = num.intValue();
                                                        if (iIntValue2 > iM2641s1) {
                                                            iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                            this.f6575N = iIntValue2;
                                                            this.f6576O = 0;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                } else {
                                    if (iM2641s1 < 0 || i2 == 1) {
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                    treeMap2 = new TreeMap(Collections.reverseOrder());
                                    i4 = 0;
                                    loop2: while (true) {
                                        if (i4 < m24888F()) {
                                            it4 = m2643t1(i4).iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    num4 = (Integer) it4.next();
                                                    if (num4.intValue() < 0) {
                                                        treeMap2.put(num4, Integer.valueOf(i4));
                                                    }
                                                } else {
                                                    i4++;
                                                }
                                            }
                                        } else {
                                            it3 = treeMap2.keySet().iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    num3 = (Integer) it3.next();
                                                    iIntValue3 = num3.intValue();
                                                    if (iIntValue3 < iM2641s1) {
                                                        iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                        this.f6575N = iIntValue3;
                                                        this.f6576O = m2639r1(iIntValue);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                }
                            }
                            if (iIntValue != -1) {
                                mo2697w0(iIntValue);
                                this.f6574M = iIntValue;
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            if (i != 16908343 || bundle == null) {
                return super.mo2633m0(i, bundle);
            }
            int i9 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i9 != -1 && i10 != -1) {
                int iMo6133a = this.f69172b.f6611H.mo6133a();
                int i11 = 0;
                while (true) {
                    if (i11 >= iMo6133a) {
                        i11 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.f69172b;
                    int iM2650x1 = m2650x1(i11, recyclerView.f6647c, recyclerView.f6606C0);
                    RecyclerView recyclerView2 = this.f69172b;
                    int iM2647w1 = m2647w1(i11, recyclerView2.f6647c, recyclerView2.f6606C0);
                    if (this.f6581p != 1) {
                        if (iM2650x1 == i9 && iM2647w1 == i10) {
                            break;
                        }
                        i11++;
                    } else {
                        if (iM2650x1 == i10 && iM2647w1 == i9) {
                            break;
                        }
                        i11++;
                    }
                }
                if (i11 > -1) {
                    m2689j1(i11, 0);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.y28
    /* JADX INFO: renamed from: n */
    public final int mo2634n(k38 k38Var) {
        return m2657M0(k38Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.y28
    /* JADX INFO: renamed from: o */
    public final int mo2635o(k38 k38Var) {
        return m2658N0(k38Var);
    }

    /* JADX INFO: renamed from: p1 */
    public final void m2636p1(int i) {
        int i2;
        int[] iArr = this.f6568G;
        int i3 = this.f6567F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f6568G = iArr;
    }

    /* JADX INFO: renamed from: q1 */
    public final void m2637q1() {
        View[] viewArr = this.f6569H;
        if (viewArr == null || viewArr.length != this.f6567F) {
            this.f6569H = new View[this.f6567F];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.y28
    /* JADX INFO: renamed from: r */
    public final z28 mo2638r() {
        return this.f6581p == 0 ? new bq3(-2, -1) : new bq3(-1, -2);
    }

    /* JADX INFO: renamed from: r1 */
    public final int m2639r1(int i) {
        int i2 = this.f6581p;
        RecyclerView recyclerView = this.f69172b;
        return i2 == 0 ? m2647w1(i, recyclerView.f6647c, recyclerView.f6606C0) : m2650x1(i, recyclerView.f6647c, recyclerView.f6606C0);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: s */
    public final z28 mo2640s(Context context, AttributeSet attributeSet) {
        bq3 bq3Var = new bq3(context, attributeSet);
        bq3Var.f8865e = -1;
        bq3Var.f8866f = 0;
        return bq3Var;
    }

    /* JADX INFO: renamed from: s1 */
    public final int m2641s1(int i) {
        int i2 = this.f6581p;
        RecyclerView recyclerView = this.f69172b;
        return i2 == 1 ? m2647w1(i, recyclerView.f6647c, recyclerView.f6606C0) : m2650x1(i, recyclerView.f6647c, recyclerView.f6606C0);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: t */
    public final z28 mo2642t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            bq3 bq3Var = new bq3((ViewGroup.MarginLayoutParams) layoutParams);
            bq3Var.f8865e = -1;
            bq3Var.f8866f = 0;
            return bq3Var;
        }
        bq3 bq3Var2 = new bq3(layoutParams);
        bq3Var2.f8865e = -1;
        bq3Var2.f8866f = 0;
        return bq3Var2;
    }

    /* JADX INFO: renamed from: t1 */
    public final HashSet m2643t1(int i) {
        return m2644u1(m2641s1(i), i);
    }

    /* JADX INFO: renamed from: u1 */
    public final HashSet m2644u1(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.f69172b;
        int iM2651y1 = m2651y1(i2, recyclerView.f6647c, recyclerView.f6606C0);
        for (int i3 = i; i3 < i + iM2651y1; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.y28
    /* JADX INFO: renamed from: v0 */
    public final int mo2645v0(int i, g38 g38Var, k38 k38Var) {
        m2612B1();
        m2637q1();
        return super.mo2645v0(i, g38Var, k38Var);
    }

    /* JADX INFO: renamed from: v1 */
    public final int m2646v1(int i, int i2) {
        if (this.f6581p != 1 || !m2678c1()) {
            int[] iArr = this.f6568G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f6568G;
        int i3 = this.f6567F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* JADX INFO: renamed from: w1 */
    public final int m2647w1(int i, g38 g38Var, k38 k38Var) {
        boolean z = k38Var.f46633g;
        p33 p33Var = this.f6572K;
        if (!z) {
            int i2 = this.f6567F;
            p33Var.getClass();
            return p33.m18863L(i, i2);
        }
        int iM12330b = g38Var.m12330b(i);
        if (iM12330b != -1) {
            int i3 = this.f6567F;
            p33Var.getClass();
            return p33.m18863L(iM12330b, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: x */
    public final int mo2648x(g38 g38Var, k38 k38Var) {
        if (this.f6581p == 1) {
            return Math.min(this.f6567F, m24888F());
        }
        if (k38Var.m14789b() < 1) {
            return 0;
        }
        return m2647w1(k38Var.m14789b() - 1, g38Var, k38Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.y28
    /* JADX INFO: renamed from: x0 */
    public final int mo2649x0(int i, g38 g38Var, k38 k38Var) {
        m2612B1();
        m2637q1();
        return super.mo2649x0(i, g38Var, k38Var);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m2650x1(int i, g38 g38Var, k38 k38Var) {
        boolean z = k38Var.f46633g;
        p33 p33Var = this.f6572K;
        if (!z) {
            int i2 = this.f6567F;
            p33Var.getClass();
            return i % i2;
        }
        int i3 = this.f6571J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iM12330b = g38Var.m12330b(i);
        if (iM12330b != -1) {
            int i4 = this.f6567F;
            p33Var.getClass();
            return iM12330b % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* JADX INFO: renamed from: y1 */
    public final int m2651y1(int i, g38 g38Var, k38 k38Var) {
        boolean z = k38Var.f46633g;
        p33 p33Var = this.f6572K;
        if (!z) {
            p33Var.getClass();
            return 1;
        }
        int i2 = this.f6570I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (g38Var.m12330b(i) != -1) {
            p33Var.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* JADX INFO: renamed from: z1 */
    public final void m2652z1(View view, int i, boolean z) {
        int iM24883w;
        int iM24883w2;
        bq3 bq3Var = (bq3) view.getLayoutParams();
        Rect rect = bq3Var.f70800b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bq3Var).topMargin + ((ViewGroup.MarginLayoutParams) bq3Var).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bq3Var).leftMargin + ((ViewGroup.MarginLayoutParams) bq3Var).rightMargin;
        int iM2646v1 = m2646v1(bq3Var.f8865e, bq3Var.f8866f);
        if (this.f6581p == 1) {
            iM24883w2 = y28.m24883w(false, iM2646v1, i, i3, ((ViewGroup.MarginLayoutParams) bq3Var).width);
            iM24883w = y28.m24883w(true, this.f6583r.mo16456n(), this.f69183m, i2, ((ViewGroup.MarginLayoutParams) bq3Var).height);
        } else {
            int iM24883w3 = y28.m24883w(false, iM2646v1, i, i2, ((ViewGroup.MarginLayoutParams) bq3Var).height);
            int iM24883w4 = y28.m24883w(true, this.f6583r.mo16456n(), this.f69182l, i3, ((ViewGroup.MarginLayoutParams) bq3Var).width);
            iM24883w = iM24883w3;
            iM24883w2 = iM24883w4;
        }
        z28 z28Var = (z28) view.getLayoutParams();
        if (z ? m24889F0(view, iM24883w2, iM24883w, z28Var) : m24887D0(view, iM24883w2, iM24883w, z28Var)) {
            view.measure(iM24883w2, iM24883w);
        }
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f6566E = false;
        this.f6567F = -1;
        this.f6570I = new SparseIntArray();
        this.f6571J = new SparseIntArray();
        this.f6572K = new p33(5);
        this.f6573L = new Rect();
        this.f6574M = -1;
        this.f6575N = -1;
        this.f6576O = -1;
        m2611A1(i);
    }
}
