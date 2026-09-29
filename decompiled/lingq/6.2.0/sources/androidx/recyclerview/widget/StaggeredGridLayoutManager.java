package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import p000.AbstractC3393o1;
import p000.C0797b4;
import p000.C3386nv;
import p000.RunnableC3468pp;
import p000.dta;
import p000.fd5;
import p000.g38;
import p000.j38;
import p000.k38;
import p000.lg9;
import p000.lq2;
import p000.m58;
import p000.mg9;
import p000.ng9;
import p000.pj3;
import p000.ss5;
import p000.x28;
import p000.y28;
import p000.yr4;
import p000.z28;

/* JADX INFO: loaded from: classes2.dex */
public class StaggeredGridLayoutManager extends y28 implements j38 {

    /* JADX INFO: renamed from: B */
    public final C0729e f6683B;

    /* JADX INFO: renamed from: C */
    public final int f6684C;

    /* JADX INFO: renamed from: D */
    public boolean f6685D;

    /* JADX INFO: renamed from: E */
    public boolean f6686E;

    /* JADX INFO: renamed from: F */
    public SavedState f6687F;

    /* JADX INFO: renamed from: G */
    public final Rect f6688G;

    /* JADX INFO: renamed from: H */
    public final lg9 f6689H;

    /* JADX INFO: renamed from: I */
    public final boolean f6690I;

    /* JADX INFO: renamed from: J */
    public int[] f6691J;

    /* JADX INFO: renamed from: K */
    public final RunnableC3468pp f6692K;

    /* JADX INFO: renamed from: p */
    public final int f6693p;

    /* JADX INFO: renamed from: q */
    public final ng9[] f6694q;

    /* JADX INFO: renamed from: r */
    public final lq2 f6695r;

    /* JADX INFO: renamed from: s */
    public final lq2 f6696s;

    /* JADX INFO: renamed from: t */
    public final int f6697t;

    /* JADX INFO: renamed from: u */
    public int f6698u;

    /* JADX INFO: renamed from: v */
    public final yr4 f6699v;

    /* JADX INFO: renamed from: w */
    public boolean f6700w;

    /* JADX INFO: renamed from: y */
    public final BitSet f6702y;

    /* JADX INFO: renamed from: x */
    public boolean f6701x = false;

    /* JADX INFO: renamed from: z */
    public int f6703z = -1;

    /* JADX INFO: renamed from: A */
    public int f6682A = Integer.MIN_VALUE;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0730f();

        /* JADX INFO: renamed from: a */
        public int f6708a;

        /* JADX INFO: renamed from: b */
        public int f6709b;

        /* JADX INFO: renamed from: c */
        public int f6710c;

        /* JADX INFO: renamed from: d */
        public int[] f6711d;

        /* JADX INFO: renamed from: e */
        public int f6712e;

        /* JADX INFO: renamed from: f */
        public int[] f6713f;

        /* JADX INFO: renamed from: g */
        public ArrayList f6714g;

        /* JADX INFO: renamed from: h */
        public boolean f6715h;

        /* JADX INFO: renamed from: i */
        public boolean f6716i;

        /* JADX INFO: renamed from: j */
        public boolean f6717j;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f6708a);
            parcel.writeInt(this.f6709b);
            parcel.writeInt(this.f6710c);
            if (this.f6710c > 0) {
                parcel.writeIntArray(this.f6711d);
            }
            parcel.writeInt(this.f6712e);
            if (this.f6712e > 0) {
                parcel.writeIntArray(this.f6713f);
            }
            parcel.writeInt(this.f6715h ? 1 : 0);
            parcel.writeInt(this.f6716i ? 1 : 0);
            parcel.writeInt(this.f6717j ? 1 : 0);
            parcel.writeList(this.f6714g);
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f6693p = -1;
        this.f6700w = false;
        C0729e c0729e = new C0729e();
        this.f6683B = c0729e;
        this.f6684C = 2;
        this.f6688G = new Rect();
        this.f6689H = new lg9(this);
        this.f6690I = true;
        this.f6692K = new RunnableC3468pp(this, 16);
        x28 x28VarM24879L = y28.m24879L(context, attributeSet, i, i2);
        int i3 = x28VarM24879L.f67679a;
        if (i3 != 0 && i3 != 1) {
            C3386nv.m17626m("invalid orientation.");
            throw null;
        }
        mo2677c(null);
        if (i3 != this.f6697t) {
            this.f6697t = i3;
            lq2 lq2Var = this.f6695r;
            this.f6695r = this.f6696s;
            this.f6696s = lq2Var;
            m24905u0();
        }
        int i4 = x28VarM24879L.f67680b;
        mo2677c(null);
        if (i4 != this.f6693p) {
            c0729e.m2804a();
            m24905u0();
            this.f6693p = i4;
            this.f6702y = new BitSet(this.f6693p);
            this.f6694q = new ng9[this.f6693p];
            for (int i5 = 0; i5 < this.f6693p; i5++) {
                this.f6694q[i5] = new ng9(this, i5);
            }
            m24905u0();
        }
        boolean z = x28VarM24879L.f67681c;
        mo2677c(null);
        SavedState savedState = this.f6687F;
        if (savedState != null && savedState.f6715h != z) {
            savedState.f6715h = z;
        }
        this.f6700w = z;
        m24905u0();
        yr4 yr4Var = new yr4();
        yr4Var.f70315a = true;
        yr4Var.f70320f = 0;
        yr4Var.f70321g = 0;
        this.f6699v = yr4Var;
        this.f6695r = lq2.m16443b(this, this.f6697t);
        this.f6696s = lq2.m16443b(this, 1 - this.f6697t);
    }

    /* JADX INFO: renamed from: j1 */
    public static int m2766j1(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: A0 */
    public final void mo2610A0(Rect rect, int i, int i2) {
        int iM24882g;
        int iM24882g2;
        int iM24893I = m24893I() + m24891H();
        int iM24890G = m24890G() + m24894J();
        int i3 = this.f6697t;
        int i4 = this.f6693p;
        if (i3 == 1) {
            int iHeight = rect.height() + iM24890G;
            RecyclerView recyclerView = this.f69172b;
            WeakHashMap weakHashMap = dta.f36217a;
            iM24882g2 = y28.m24882g(i2, iHeight, recyclerView.getMinimumHeight());
            iM24882g = y28.m24882g(i, (this.f6698u * i4) + iM24893I, this.f69172b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM24893I;
            RecyclerView recyclerView2 = this.f69172b;
            WeakHashMap weakHashMap2 = dta.f36217a;
            iM24882g = y28.m24882g(i, iWidth, recyclerView2.getMinimumWidth());
            iM24882g2 = y28.m24882g(i2, (this.f6698u * i4) + iM24890G, this.f69172b.getMinimumHeight());
        }
        this.f69172b.setMeasuredDimension(iM24882g, iM24882g2);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: G0 */
    public final void mo2654G0(RecyclerView recyclerView, int i) {
        fd5 fd5Var = new fd5(recyclerView.getContext());
        fd5Var.f38889a = i;
        m24892H0(fd5Var);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: I0 */
    public final boolean mo2613I0() {
        return this.f6687F == null;
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m2767J0() {
        int iM2774Q0;
        if (m24906v() != 0 && this.f6684C != 0 && this.f69177g) {
            if (this.f6701x) {
                iM2774Q0 = m2775R0();
                m2774Q0();
            } else {
                iM2774Q0 = m2774Q0();
                m2775R0();
            }
            if (iM2774Q0 == 0 && m2782V0() != null) {
                this.f6683B.m2804a();
                this.f69176f = true;
                m24905u0();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: K0 */
    public final int m2768K0(k38 k38Var) {
        if (m24906v() == 0) {
            return 0;
        }
        boolean z = !this.f6690I;
        return ss5.m21720q(k38Var, this.f6695r, m2771N0(z), m2770M0(z), this, this.f6690I, this.f6701x);
    }

    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /* JADX INFO: renamed from: L0 */
    public final int m2769L0(g38 g38Var, yr4 yr4Var, k38 k38Var) {
        int i;
        ng9[] ng9VarArr;
        int iM2777S0;
        BitSet bitSet;
        ng9[] ng9VarArr2;
        ng9 ng9Var;
        ?? r5;
        int iM17419h;
        int iMo16447e;
        int iMo16447e2;
        int iMo16451i;
        BitSet bitSet2;
        int i2;
        int i3;
        g38 g38Var2 = g38Var;
        BitSet bitSet3 = this.f6702y;
        int i4 = this.f6693p;
        bitSet3.set(0, i4, true);
        yr4 yr4Var2 = this.f6699v;
        if (yr4Var2.f70323i) {
            i = yr4Var.f70319e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = yr4Var.f70319e == 1 ? yr4Var.f70321g + yr4Var.f70316b : yr4Var.f70320f - yr4Var.f70316b;
        }
        int i5 = yr4Var.f70319e;
        int i6 = 0;
        while (true) {
            ng9VarArr = this.f6694q;
            if (i6 >= i4) {
                break;
            }
            if (!ng9VarArr[i6].f52710a.isEmpty()) {
                m2795i1(ng9VarArr[i6], i5, i);
            }
            i6++;
        }
        boolean z = this.f6701x;
        lq2 lq2Var = this.f6695r;
        int iMo16451i2 = z ? lq2Var.mo16451i() : lq2Var.mo16455m();
        boolean z2 = false;
        while (true) {
            int i7 = yr4Var.f70317c;
            if (i7 < 0 || i7 >= k38Var.m14789b() || (!yr4Var2.f70323i && bitSet3.isEmpty())) {
                break;
            }
            View viewM12332d = g38Var2.m12332d(yr4Var.f70317c);
            yr4Var.f70317c += yr4Var.f70318d;
            mg9 mg9Var = (mg9) viewM12332d.getLayoutParams();
            int iM17784d = mg9Var.f70799a.m17784d();
            C0729e c0729e = this.f6683B;
            int[] iArr = c0729e.f6719a;
            int i8 = (iArr == null || iM17784d >= iArr.length) ? -1 : iArr[iM17784d];
            if (i8 == -1) {
                if (m2786Z0(yr4Var.f70319e)) {
                    i3 = i4 - 1;
                    i4 = -1;
                    i2 = -1;
                } else {
                    i2 = 1;
                    i3 = 0;
                }
                ng9 ng9Var2 = null;
                int i9 = i2;
                if (yr4Var.f70319e == 1) {
                    int iMo16455m = lq2Var.mo16455m();
                    ng9VarArr2 = ng9VarArr;
                    int i10 = i3;
                    int i11 = Integer.MAX_VALUE;
                    while (i10 != i4) {
                        int i12 = i10;
                        ng9 ng9Var3 = ng9VarArr2[i12];
                        BitSet bitSet4 = bitSet3;
                        int iM17417f = ng9Var3.m17417f(iMo16455m);
                        if (iM17417f < i11) {
                            i11 = iM17417f;
                            ng9Var2 = ng9Var3;
                        }
                        i10 = i12 + i9;
                        bitSet3 = bitSet4;
                    }
                    bitSet = bitSet3;
                } else {
                    bitSet = bitSet3;
                    ng9VarArr2 = ng9VarArr;
                    int iMo16451i3 = lq2Var.mo16451i();
                    int i13 = i3;
                    int i14 = Integer.MIN_VALUE;
                    while (i13 != i4) {
                        ng9 ng9Var4 = ng9VarArr2[i13];
                        int i15 = i4;
                        int iM17419h2 = ng9Var4.m17419h(iMo16451i3);
                        if (iM17419h2 > i14) {
                            i14 = iM17419h2;
                            ng9Var2 = ng9Var4;
                        }
                        i13 += i9;
                        i4 = i15;
                    }
                }
                ng9Var = ng9Var2;
                c0729e.m2805b(iM17784d);
                c0729e.f6719a[iM17784d] = ng9Var.f52714e;
            } else {
                bitSet = bitSet3;
                i4 = i4;
                ng9VarArr2 = ng9VarArr;
                ng9Var = ng9VarArr2[i8];
            }
            mg9Var.f51307e = ng9Var;
            if (yr4Var.f70319e == 1) {
                r5 = 0;
                m24896b(viewM12332d, -1, false);
            } else {
                r5 = 0;
                m24896b(viewM12332d, 0, false);
            }
            int i16 = this.f6697t;
            if (i16 == 1) {
                m2784X0(viewM12332d, y28.m24883w(r5, this.f6698u, this.f69182l, r5, ((ViewGroup.MarginLayoutParams) mg9Var).width), y28.m24883w(true, this.f69185o, this.f69183m, m24890G() + m24894J(), ((ViewGroup.MarginLayoutParams) mg9Var).height));
            } else {
                m2784X0(viewM12332d, y28.m24883w(true, this.f69184n, this.f69182l, m24893I() + m24891H(), ((ViewGroup.MarginLayoutParams) mg9Var).width), y28.m24883w(false, this.f6698u, this.f69183m, 0, ((ViewGroup.MarginLayoutParams) mg9Var).height));
            }
            if (yr4Var.f70319e == 1) {
                iMo16447e = ng9Var.m17417f(iMo16451i2);
                iM17419h = lq2Var.mo16447e(viewM12332d) + iMo16447e;
            } else {
                iM17419h = ng9Var.m17419h(iMo16451i2);
                iMo16447e = iM17419h - lq2Var.mo16447e(viewM12332d);
            }
            int i17 = yr4Var.f70319e;
            ng9 ng9Var5 = mg9Var.f51307e;
            if (i17 == 1) {
                ng9Var5.getClass();
                mg9 mg9Var2 = (mg9) viewM12332d.getLayoutParams();
                mg9Var2.f51307e = ng9Var5;
                ArrayList arrayList = ng9Var5.f52710a;
                arrayList.add(viewM12332d);
                ng9Var5.f52712c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    ng9Var5.f52711b = Integer.MIN_VALUE;
                }
                if (mg9Var2.f70799a.m17790j() || mg9Var2.f70799a.m17793m()) {
                    ng9Var5.f52713d = ng9Var5.f52715f.f6695r.mo16447e(viewM12332d) + ng9Var5.f52713d;
                }
            } else {
                ng9Var5.getClass();
                mg9 mg9Var3 = (mg9) viewM12332d.getLayoutParams();
                mg9Var3.f51307e = ng9Var5;
                ArrayList arrayList2 = ng9Var5.f52710a;
                arrayList2.add(0, viewM12332d);
                ng9Var5.f52711b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    ng9Var5.f52712c = Integer.MIN_VALUE;
                }
                if (mg9Var3.f70799a.m17790j() || mg9Var3.f70799a.m17793m()) {
                    ng9Var5.f52713d = ng9Var5.f52715f.f6695r.mo16447e(viewM12332d) + ng9Var5.f52713d;
                }
            }
            boolean zM2783W0 = m2783W0();
            lq2 lq2Var2 = this.f6696s;
            if (zM2783W0 && i16 == 1) {
                iMo16451i = lq2Var2.mo16451i() - (((i4 - 1) - ng9Var.f52714e) * this.f6698u);
                iMo16447e2 = iMo16451i - lq2Var2.mo16447e(viewM12332d);
            } else {
                int iMo16455m2 = (ng9Var.f52714e * this.f6698u) + lq2Var2.mo16455m();
                int iMo16447e3 = lq2Var2.mo16447e(viewM12332d) + iMo16455m2;
                iMo16447e2 = iMo16455m2;
                iMo16451i = iMo16447e3;
            }
            z2 = true;
            if (i16 == 1) {
                y28.m24881R(viewM12332d, iMo16447e2, iMo16447e, iMo16451i, iM17419h);
            } else {
                y28.m24881R(viewM12332d, iMo16447e, iMo16447e2, iM17419h, iMo16451i);
            }
            m2795i1(ng9Var, yr4Var2.f70319e, i);
            g38Var2 = g38Var;
            m2788b1(g38Var2, yr4Var2);
            if (yr4Var2.f70322h && viewM12332d.hasFocusable()) {
                bitSet2 = bitSet;
                bitSet2.set(ng9Var.f52714e, false);
            } else {
                bitSet2 = bitSet;
            }
            bitSet3 = bitSet2;
            i4 = i4;
            ng9VarArr = ng9VarArr2;
        }
        if (!z2) {
            m2788b1(g38Var2, yr4Var2);
        }
        if (yr4Var2.f70319e == -1) {
            iM2777S0 = lq2Var.mo16455m() - m2779T0(lq2Var.mo16455m());
        } else {
            iM2777S0 = m2777S0(lq2Var.mo16451i()) - lq2Var.mo16451i();
        }
        if (iM2777S0 > 0) {
            return Math.min(yr4Var.f70316b, iM2777S0);
        }
        return 0;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: M */
    public final int mo2615M(g38 g38Var, k38 k38Var) {
        if (this.f6697t == 0) {
            return Math.min(this.f6693p, k38Var.m14789b());
        }
        return -1;
    }

    /* JADX INFO: renamed from: M0 */
    public final View m2770M0(boolean z) {
        lq2 lq2Var = this.f6695r;
        int iMo16455m = lq2Var.mo16455m();
        int iMo16451i = lq2Var.mo16451i();
        View view = null;
        for (int iM24906v = m24906v() - 1; iM24906v >= 0; iM24906v--) {
            View viewM24904u = m24904u(iM24906v);
            int iMo16449g = lq2Var.mo16449g(viewM24904u);
            int iMo16446d = lq2Var.mo16446d(viewM24904u);
            if (iMo16446d > iMo16455m && iMo16449g < iMo16451i) {
                if (iMo16446d <= iMo16451i || !z) {
                    return viewM24904u;
                }
                if (view == null) {
                    view = viewM24904u;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: N0 */
    public final View m2771N0(boolean z) {
        lq2 lq2Var = this.f6695r;
        int iMo16455m = lq2Var.mo16455m();
        int iMo16451i = lq2Var.mo16451i();
        int iM24906v = m24906v();
        View view = null;
        for (int i = 0; i < iM24906v; i++) {
            View viewM24904u = m24904u(i);
            int iMo16449g = lq2Var.mo16449g(viewM24904u);
            if (lq2Var.mo16446d(viewM24904u) > iMo16455m && iMo16449g < iMo16451i) {
                if (iMo16449g >= iMo16455m || !z) {
                    return viewM24904u;
                }
                if (view == null) {
                    view = viewM24904u;
                }
            }
        }
        return view;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: O */
    public final boolean mo2659O() {
        return this.f6684C != 0;
    }

    /* JADX INFO: renamed from: O0 */
    public final void m2772O0(g38 g38Var, k38 k38Var, boolean z) {
        int iMo16451i;
        int iM2777S0 = m2777S0(Integer.MIN_VALUE);
        if (iM2777S0 != Integer.MIN_VALUE && (iMo16451i = this.f6695r.mo16451i() - iM2777S0) > 0) {
            int i = iMo16451i - (-m2792f1(-iMo16451i, g38Var, k38Var));
            if (!z || i <= 0) {
                return;
            }
            this.f6695r.mo16459q(i);
        }
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: P */
    public final boolean mo2661P() {
        return this.f6700w;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m2773P0(g38 g38Var, k38 k38Var, boolean z) {
        int iMo16455m;
        int iM2779T0 = m2779T0(Integer.MAX_VALUE);
        if (iM2779T0 != Integer.MAX_VALUE && (iMo16455m = iM2779T0 - this.f6695r.mo16455m()) > 0) {
            int iM2792f1 = iMo16455m - m2792f1(iMo16455m, g38Var, k38Var);
            if (!z || iM2792f1 <= 0) {
                return;
            }
            this.f6695r.mo16459q(-iM2792f1);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final int m2774Q0() {
        if (m24906v() == 0) {
            return 0;
        }
        return y28.m24878K(m24904u(0));
    }

    /* JADX INFO: renamed from: R0 */
    public final int m2775R0() {
        int iM24906v = m24906v();
        if (iM24906v == 0) {
            return 0;
        }
        return y28.m24878K(m24904u(iM24906v - 1));
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: S */
    public final void mo2776S(int i) {
        super.mo2776S(i);
        for (int i2 = 0; i2 < this.f6693p; i2++) {
            ng9 ng9Var = this.f6694q[i2];
            int i3 = ng9Var.f52711b;
            if (i3 != Integer.MIN_VALUE) {
                ng9Var.f52711b = i3 + i;
            }
            int i4 = ng9Var.f52712c;
            if (i4 != Integer.MIN_VALUE) {
                ng9Var.f52712c = i4 + i;
            }
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final int m2777S0(int i) {
        int iM17417f = this.f6694q[0].m17417f(i);
        for (int i2 = 1; i2 < this.f6693p; i2++) {
            int iM17417f2 = this.f6694q[i2].m17417f(i);
            if (iM17417f2 > iM17417f) {
                iM17417f = iM17417f2;
            }
        }
        return iM17417f;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: T */
    public final void mo2778T(int i) {
        super.mo2778T(i);
        for (int i2 = 0; i2 < this.f6693p; i2++) {
            ng9 ng9Var = this.f6694q[i2];
            int i3 = ng9Var.f52711b;
            if (i3 != Integer.MIN_VALUE) {
                ng9Var.f52711b = i3 + i;
            }
            int i4 = ng9Var.f52712c;
            if (i4 != Integer.MIN_VALUE) {
                ng9Var.f52712c = i4 + i;
            }
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final int m2779T0(int i) {
        int iM17419h = this.f6694q[0].m17419h(i);
        for (int i2 = 1; i2 < this.f6693p; i2++) {
            int iM17419h2 = this.f6694q[i2].m17419h(i);
            if (iM17419h2 < iM17419h) {
                iM17419h = iM17419h2;
            }
        }
        return iM17419h;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: U */
    public final void mo2780U() {
        this.f6683B.m2804a();
        for (int i = 0; i < this.f6693p; i++) {
            this.f6694q[i].m17413b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0031  */
    /* JADX WARN: Code duplicated, block: B:22:0x0033  */
    /* JADX WARN: Code duplicated, block: B:24:0x003a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047 A[LOOP:0: B:23:0x0038->B:27:0x0047, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068 A[LOOP:1: B:32:0x0059->B:36:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x0089  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX WARN: Code duplicated, block: B:47:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x009c  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:61:0x004a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x004b A[EDGE_INSN: B:62:0x004b->B:29:0x004b BREAK  A[LOOP:0: B:23:0x0038->B:27:0x0047], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x006c A[EDGE_INSN: B:64:0x006c->B:38:0x006c BREAK  A[LOOP:1: B:32:0x0059->B:36:0x0068], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: U0 */
    public final void m2781U0(int i, int i2, int i3) {
        int i4;
        int i5;
        C0729e c0729e;
        int[] iArr;
        int iM2775R0;
        ArrayList arrayList;
        int size;
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
        int size2;
        int i6;
        int i7;
        int[] iArr2;
        int iM2775R1 = this.f6701x ? m2775R0() : m2774Q0();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            c0729e = this.f6683B;
            iArr = c0729e.f6719a;
            if (iArr != null && i5 < iArr.length) {
                arrayList = c0729e.f6720b;
                if (arrayList == null) {
                    i7 = -1;
                } else {
                    size = arrayList.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = null;
                            break;
                        }
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) c0729e.f6720b.get(size);
                        if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f6704a == i5) {
                            break;
                        } else {
                            size--;
                        }
                    }
                    if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem != null) {
                        c0729e.f6720b.remove(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                    }
                    size2 = c0729e.f6720b.size();
                    i6 = 0;
                    while (true) {
                        if (i6 < size2) {
                            i6 = -1;
                            break;
                        } else if (((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) c0729e.f6720b.get(i6)).f6704a >= i5) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    if (i6 != -1) {
                        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) c0729e.f6720b.get(i6);
                        c0729e.f6720b.remove(i6);
                        i7 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.f6704a;
                    } else {
                        i7 = -1;
                    }
                }
                iArr2 = c0729e.f6719a;
                if (i7 == -1) {
                    Arrays.fill(iArr2, i5, iArr2.length, -1);
                    int length = c0729e.f6719a.length;
                } else {
                    Arrays.fill(c0729e.f6719a, i5, Math.min(i7 + 1, iArr2.length), -1);
                }
            }
            if (i3 != 1) {
                c0729e.m2806c(i, i2);
            } else if (i3 != 2) {
                c0729e.m2807d(i, i2);
            } else if (i3 == 8) {
                c0729e.m2807d(i, 1);
                c0729e.m2806c(i2, 1);
            }
            if (i4 <= iM2775R1) {
                return;
            }
            if (this.f6701x) {
                iM2775R0 = m2774Q0();
            } else {
                iM2775R0 = m2775R0();
            }
            if (i5 <= iM2775R0) {
                m24905u0();
            }
        }
        i4 = i + i2;
        i5 = i;
        c0729e = this.f6683B;
        iArr = c0729e.f6719a;
        if (iArr != null) {
            arrayList = c0729e.f6720b;
            if (arrayList == null) {
                i7 = -1;
            } else {
                size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = null;
                        break;
                    }
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) c0729e.f6720b.get(size);
                    if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f6704a == i5) {
                        break;
                        break;
                    }
                    size--;
                }
                if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem != null) {
                    c0729e.f6720b.remove(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                }
                size2 = c0729e.f6720b.size();
                i6 = 0;
                while (true) {
                    if (i6 < size2) {
                        i6 = -1;
                        break;
                    } else {
                        if (((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) c0729e.f6720b.get(i6)).f6704a >= i5) {
                            break;
                            break;
                        }
                        i6++;
                    }
                }
                if (i6 != -1) {
                    StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem3 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) c0729e.f6720b.get(i6);
                    c0729e.f6720b.remove(i6);
                    i7 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem3.f6704a;
                } else {
                    i7 = -1;
                }
            }
            iArr2 = c0729e.f6719a;
            if (i7 == -1) {
                Arrays.fill(iArr2, i5, iArr2.length, -1);
                int length2 = c0729e.f6719a.length;
            } else {
                Arrays.fill(c0729e.f6719a, i5, Math.min(i7 + 1, iArr2.length), -1);
            }
        }
        if (i3 != 1) {
            c0729e.m2806c(i, i2);
        } else if (i3 != 2) {
            c0729e.m2807d(i, i2);
        } else if (i3 == 8) {
            c0729e.m2807d(i, 1);
            c0729e.m2806c(i2, 1);
        }
        if (i4 <= iM2775R1) {
            return;
        }
        if (this.f6701x) {
            iM2775R0 = m2774Q0();
        } else {
            iM2775R0 = m2775R0();
        }
        if (i5 <= iM2775R0) {
            m24905u0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002a A[SYNTHETIC] */
    /* JADX INFO: renamed from: V0 */
    public final View m2782V0() {
        boolean z;
        boolean z2;
        int iM24906v = m24906v();
        int i = iM24906v - 1;
        int i2 = this.f6693p;
        BitSet bitSet = new BitSet(i2);
        bitSet.set(0, i2, true);
        byte b = (this.f6697t == 1 && m2783W0()) ? (byte) 1 : (byte) -1;
        if (this.f6701x) {
            iM24906v = -1;
        } else {
            i = 0;
        }
        int i3 = i < iM24906v ? 1 : -1;
        while (i != iM24906v) {
            View viewM24904u = m24904u(i);
            mg9 mg9Var = (mg9) viewM24904u.getLayoutParams();
            boolean z3 = bitSet.get(mg9Var.f51307e.f52714e);
            lq2 lq2Var = this.f6695r;
            if (z3) {
                ng9 ng9Var = mg9Var.f51307e;
                if (this.f6701x) {
                    int i4 = ng9Var.f52712c;
                    if (i4 == Integer.MIN_VALUE) {
                        ng9Var.m17412a();
                        i4 = ng9Var.f52712c;
                    }
                    if (i4 < lq2Var.mo16451i()) {
                        ((mg9) ((View) AbstractC3393o1.m17731f(1, ng9Var.f52710a)).getLayoutParams()).getClass();
                        return viewM24904u;
                    }
                } else {
                    int i5 = ng9Var.f52711b;
                    ArrayList arrayList = ng9Var.f52710a;
                    if (i5 == Integer.MIN_VALUE) {
                        View view = (View) arrayList.get(0);
                        mg9 mg9Var2 = (mg9) view.getLayoutParams();
                        ng9Var.f52711b = ng9Var.f52715f.f6695r.mo16449g(view);
                        mg9Var2.getClass();
                        i5 = ng9Var.f52711b;
                    }
                    if (i5 > lq2Var.mo16455m()) {
                        ((mg9) ((View) arrayList.get(0)).getLayoutParams()).getClass();
                        return viewM24904u;
                    }
                }
                bitSet.clear(mg9Var.f51307e.f52714e);
            }
            i += i3;
            if (i != iM24906v) {
                View viewM24904u2 = m24904u(i);
                if (this.f6701x) {
                    int iMo16446d = lq2Var.mo16446d(viewM24904u);
                    int iMo16446d2 = lq2Var.mo16446d(viewM24904u2);
                    if (iMo16446d >= iMo16446d2) {
                        if (iMo16446d == iMo16446d2) {
                            if (mg9Var.f51307e.f52714e - ((mg9) viewM24904u2.getLayoutParams()).f51307e.f52714e < 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (b < 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z != z2) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return viewM24904u;
                }
                int iMo16449g = lq2Var.mo16449g(viewM24904u);
                int iMo16449g2 = lq2Var.mo16449g(viewM24904u2);
                if (iMo16449g <= iMo16449g2) {
                    if (iMo16449g == iMo16449g2) {
                        if (mg9Var.f51307e.f52714e - ((mg9) viewM24904u2.getLayoutParams()).f51307e.f52714e < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z != z2) {
                        }
                    } else {
                        continue;
                    }
                }
                return viewM24904u;
            }
        }
        return null;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: W */
    public final void mo2669W(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f69172b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f6692K);
        }
        for (int i = 0; i < this.f6693p; i++) {
            this.f6694q[i].m17413b();
        }
        recyclerView.requestLayout();
    }

    /* JADX INFO: renamed from: W0 */
    public final boolean m2783W0() {
        return this.f69172b.getLayoutDirection() == 1;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0048  */
    /* JADX WARN: Code duplicated, block: B:34:0x004f  */
    @Override // p000.y28
    /* JADX INFO: renamed from: X */
    public final View mo2616X(View view, int i, g38 g38Var, k38 k38Var) {
        View viewM2712E;
        int i2;
        if (m24906v() != 0) {
            RecyclerView recyclerView = this.f69172b;
            if (recyclerView == null || (viewM2712E = recyclerView.m2712E(view)) == null || ((ArrayList) this.f69171a.f63596e).contains(viewM2712E)) {
                viewM2712E = null;
            }
            if (viewM2712E != null) {
                m2791e1();
                int i3 = this.f6697t;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i == 66 ? i3 == 0 : !(i != 130 || i3 != 1)) {
                                    i2 = 1;
                                }
                            } else if (i3 == 1) {
                                i2 = -1;
                            }
                            i2 = Integer.MIN_VALUE;
                        } else if (i3 == 0) {
                            i2 = -1;
                        } else {
                            i2 = Integer.MIN_VALUE;
                        }
                    } else if (i3 != 1 && m2783W0()) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                } else if (i3 != 1 && m2783W0()) {
                    i2 = 1;
                } else {
                    i2 = -1;
                }
                if (i2 != Integer.MIN_VALUE) {
                    mg9 mg9Var = (mg9) viewM2712E.getLayoutParams();
                    mg9Var.getClass();
                    ng9 ng9Var = mg9Var.f51307e;
                    int iM2775R0 = i2 == 1 ? m2775R0() : m2774Q0();
                    m2794h1(iM2775R0, k38Var);
                    m2793g1(i2);
                    yr4 yr4Var = this.f6699v;
                    yr4Var.f70317c = yr4Var.f70318d + iM2775R0;
                    yr4Var.f70316b = (int) (this.f6695r.mo16456n() * 0.33333334f);
                    yr4Var.f70322h = true;
                    yr4Var.f70315a = false;
                    m2769L0(g38Var, yr4Var, k38Var);
                    this.f6685D = this.f6701x;
                    View viewM17418g = ng9Var.m17418g(iM2775R0, i2);
                    if (viewM17418g != null && viewM17418g != viewM2712E) {
                        return viewM17418g;
                    }
                    boolean zM2786Z0 = m2786Z0(i2);
                    ng9[] ng9VarArr = this.f6694q;
                    int i4 = this.f6693p;
                    if (zM2786Z0) {
                        for (int i5 = i4 - 1; i5 >= 0; i5--) {
                            View viewM17418g2 = ng9VarArr[i5].m17418g(iM2775R0, i2);
                            if (viewM17418g2 != null && viewM17418g2 != viewM2712E) {
                                return viewM17418g2;
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < i4; i6++) {
                            View viewM17418g3 = ng9VarArr[i6].m17418g(iM2775R0, i2);
                            if (viewM17418g3 != null && viewM17418g3 != viewM2712E) {
                                return viewM17418g3;
                            }
                        }
                    }
                    boolean z = (this.f6700w ^ true) == (i2 == -1);
                    View viewMo2696q = mo2696q(z ? ng9Var.m17414c() : ng9Var.m17415d());
                    if (viewMo2696q != null && viewMo2696q != viewM2712E) {
                        return viewMo2696q;
                    }
                    if (m2786Z0(i2)) {
                        for (int i7 = i4 - 1; i7 >= 0; i7--) {
                            if (i7 != ng9Var.f52714e) {
                                View viewMo2696q2 = mo2696q(z ? ng9VarArr[i7].m17414c() : ng9VarArr[i7].m17415d());
                                if (viewMo2696q2 != null && viewMo2696q2 != viewM2712E) {
                                    return viewMo2696q2;
                                }
                            }
                        }
                    } else {
                        for (int i8 = 0; i8 < i4; i8++) {
                            View viewMo2696q3 = mo2696q(z ? ng9VarArr[i8].m17414c() : ng9VarArr[i8].m17415d());
                            if (viewMo2696q3 != null && viewMo2696q3 != viewM2712E) {
                                return viewMo2696q3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m2784X0(View view, int i, int i2) {
        RecyclerView recyclerView = this.f69172b;
        Rect rect = this.f6688G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m2720O(view));
        }
        mg9 mg9Var = (mg9) view.getLayoutParams();
        int iM2766j1 = m2766j1(i, ((ViewGroup.MarginLayoutParams) mg9Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) mg9Var).rightMargin + rect.right);
        int iM2766j2 = m2766j1(i2, ((ViewGroup.MarginLayoutParams) mg9Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) mg9Var).bottomMargin + rect.bottom);
        if (m24887D0(view, iM2766j1, iM2766j2, mg9Var)) {
            view.measure(iM2766j1, iM2766j2);
        }
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: Y */
    public final void mo2671Y(AccessibilityEvent accessibilityEvent) {
        super.mo2671Y(accessibilityEvent);
        if (m24906v() > 0) {
            View viewM2771N0 = m2771N0(false);
            View viewM2770M0 = m2770M0(false);
            if (viewM2771N0 == null || viewM2770M0 == null) {
                return;
            }
            int iM24878K = y28.m24878K(viewM2771N0);
            int iM24878K2 = y28.m24878K(viewM2770M0);
            if (iM24878K < iM24878K2) {
                accessibilityEvent.setFromIndex(iM24878K);
                accessibilityEvent.setToIndex(iM24878K2);
            } else {
                accessibilityEvent.setFromIndex(iM24878K2);
                accessibilityEvent.setToIndex(iM24878K);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0189  */
    /* JADX WARN: Code duplicated, block: B:108:0x018b  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:133:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:254:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:265:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x01de A[SYNTHETIC] */
    /* JADX INFO: renamed from: Y0 */
    public final void m2785Y0(g38 g38Var, k38 k38Var, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        SavedState savedState;
        int iM24906v;
        int i2;
        int iM24878K;
        int iM24878K2;
        int iM24906v2;
        boolean z4;
        int i3;
        boolean z5;
        SavedState savedState2 = this.f6687F;
        lg9 lg9Var = this.f6689H;
        if (!(savedState2 == null && this.f6703z == -1) && k38Var.m14789b() == 0) {
            m24898o0(g38Var);
            lg9Var.m16180a();
            return;
        }
        boolean z6 = lg9Var.f49644e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = lg9Var.f49646g;
        boolean z7 = (z6 && this.f6703z == -1 && this.f6687F == null) ? false : true;
        ng9[] ng9VarArr = this.f6694q;
        int i4 = this.f6693p;
        C0729e c0729e = this.f6683B;
        if (z7) {
            lg9Var.m16180a();
            SavedState savedState3 = this.f6687F;
            lq2 lq2Var = this.f6695r;
            if (savedState3 != null) {
                int i5 = savedState3.f6710c;
                if (i5 > 0) {
                    if (i5 == i4) {
                        for (int i6 = 0; i6 < i4; i6++) {
                            ng9VarArr[i6].m17413b();
                            SavedState savedState4 = this.f6687F;
                            int iMo16451i = savedState4.f6711d[i6];
                            if (iMo16451i != Integer.MIN_VALUE) {
                                iMo16451i += savedState4.f6716i ? lq2Var.mo16451i() : lq2Var.mo16455m();
                            }
                            ng9 ng9Var = ng9VarArr[i6];
                            ng9Var.f52711b = iMo16451i;
                            ng9Var.f52712c = iMo16451i;
                        }
                    } else {
                        savedState3.f6711d = null;
                        savedState3.f6710c = 0;
                        savedState3.f6712e = 0;
                        savedState3.f6713f = null;
                        savedState3.f6714g = null;
                        savedState3.f6708a = savedState3.f6709b;
                    }
                }
                SavedState savedState5 = this.f6687F;
                this.f6686E = savedState5.f6717j;
                boolean z8 = savedState5.f6715h;
                mo2677c(null);
                SavedState savedState6 = this.f6687F;
                if (savedState6 != null && savedState6.f6715h != z8) {
                    savedState6.f6715h = z8;
                }
                this.f6700w = z8;
                m24905u0();
                m2791e1();
                SavedState savedState7 = this.f6687F;
                int i7 = savedState7.f6708a;
                if (i7 != -1) {
                    this.f6703z = i7;
                    lg9Var.f49642c = savedState7.f6716i;
                } else {
                    lg9Var.f49642c = this.f6701x;
                }
                if (savedState7.f6712e > 1) {
                    c0729e.f6719a = savedState7.f6713f;
                    c0729e.f6720b = savedState7.f6714g;
                }
            } else {
                m2791e1();
                lg9Var.f49642c = this.f6701x;
            }
            if (k38Var.f46633g || (i3 = this.f6703z) == -1) {
                if (this.f6685D) {
                    int iM14789b = k38Var.m14789b();
                    iM24906v2 = m24906v() - 1;
                    while (true) {
                        if (iM24906v2 < 0) {
                            iM24878K2 = 0;
                            break;
                        }
                        iM24878K2 = y28.m24878K(m24904u(iM24906v2));
                        if (iM24878K2 < 0 && iM24878K2 < iM14789b) {
                            break;
                        } else {
                            iM24906v2--;
                        }
                    }
                } else {
                    int iM14789b2 = k38Var.m14789b();
                    iM24906v = m24906v();
                    i2 = 0;
                    while (true) {
                        if (i2 >= iM24906v) {
                            iM24878K2 = 0;
                            break;
                        }
                        iM24878K = y28.m24878K(m24904u(i2));
                        if (iM24878K < 0 && iM24878K < iM14789b2) {
                            iM24878K2 = iM24878K;
                            break;
                        }
                        i2++;
                    }
                }
                lg9Var.f49640a = iM24878K2;
                lg9Var.f49641b = Integer.MIN_VALUE;
                z4 = true;
            } else if (i3 < 0 || i3 >= k38Var.m14789b()) {
                this.f6703z = -1;
                this.f6682A = Integer.MIN_VALUE;
                if (this.f6685D) {
                    int iM14789b3 = k38Var.m14789b();
                    iM24906v2 = m24906v() - 1;
                    while (true) {
                        if (iM24906v2 < 0) {
                            iM24878K2 = 0;
                            break;
                        } else {
                            iM24878K2 = y28.m24878K(m24904u(iM24906v2));
                            if (iM24878K2 < 0) {
                            }
                            iM24906v2--;
                        }
                    }
                } else {
                    int iM14789b4 = k38Var.m14789b();
                    iM24906v = m24906v();
                    i2 = 0;
                    while (true) {
                        if (i2 >= iM24906v) {
                            iM24878K2 = 0;
                            break;
                        } else {
                            iM24878K = y28.m24878K(m24904u(i2));
                            if (iM24878K < 0) {
                            }
                            i2++;
                        }
                    }
                }
                lg9Var.f49640a = iM24878K2;
                lg9Var.f49641b = Integer.MIN_VALUE;
                z4 = true;
            } else {
                SavedState savedState8 = this.f6687F;
                if (savedState8 == null || savedState8.f6708a == -1 || savedState8.f6710c < 1) {
                    View viewMo2696q = mo2696q(this.f6703z);
                    if (viewMo2696q != null) {
                        lg9Var.f49640a = this.f6701x ? m2775R0() : m2774Q0();
                        if (this.f6682A != Integer.MIN_VALUE) {
                            if (lg9Var.f49642c) {
                                lg9Var.f49641b = (lq2Var.mo16451i() - this.f6682A) - lq2Var.mo16446d(viewMo2696q);
                            } else {
                                lg9Var.f49641b = (lq2Var.mo16455m() + this.f6682A) - lq2Var.mo16449g(viewMo2696q);
                            }
                        } else if (lq2Var.mo16447e(viewMo2696q) > lq2Var.mo16456n()) {
                            lg9Var.f49641b = lg9Var.f49642c ? lq2Var.mo16451i() : lq2Var.mo16455m();
                        } else {
                            int iMo16449g = lq2Var.mo16449g(viewMo2696q) - lq2Var.mo16455m();
                            if (iMo16449g < 0) {
                                lg9Var.f49641b = -iMo16449g;
                            } else {
                                int iMo16451i2 = lq2Var.mo16451i() - lq2Var.mo16446d(viewMo2696q);
                                if (iMo16451i2 < 0) {
                                    lg9Var.f49641b = iMo16451i2;
                                } else {
                                    lg9Var.f49641b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i8 = this.f6703z;
                        lg9Var.f49640a = i8;
                        int i9 = this.f6682A;
                        if (i9 == Integer.MIN_VALUE) {
                            if (m24906v() != 0) {
                                if ((i8 < m2774Q0()) != this.f6701x) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                            } else if (this.f6701x) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            lg9Var.f49642c = z5;
                            lq2 lq2Var2 = staggeredGridLayoutManager.f6695r;
                            lg9Var.f49641b = z5 ? lq2Var2.mo16451i() : lq2Var2.mo16455m();
                        } else {
                            boolean z9 = lg9Var.f49642c;
                            lq2 lq2Var3 = staggeredGridLayoutManager.f6695r;
                            if (z9) {
                                lg9Var.f49641b = lq2Var3.mo16451i() - i9;
                            } else {
                                lg9Var.f49641b = lq2Var3.mo16455m() + i9;
                            }
                        }
                        z4 = true;
                        lg9Var.f49643d = true;
                    }
                } else {
                    lg9Var.f49641b = Integer.MIN_VALUE;
                    lg9Var.f49640a = this.f6703z;
                }
                z4 = true;
            }
            lg9Var.f49644e = z4;
        }
        if (this.f6687F == null && this.f6703z == -1 && !(lg9Var.f49642c == this.f6685D && m2783W0() == this.f6686E)) {
            c0729e.m2804a();
            i = 1;
            lg9Var.f49643d = true;
        } else {
            i = 1;
        }
        if (m24906v() > 0 && ((savedState = this.f6687F) == null || savedState.f6710c < i)) {
            if (lg9Var.f49643d) {
                for (int i10 = 0; i10 < i4; i10++) {
                    ng9VarArr[i10].m17413b();
                    int i11 = lg9Var.f49641b;
                    if (i11 != Integer.MIN_VALUE) {
                        ng9 ng9Var2 = ng9VarArr[i10];
                        ng9Var2.f52711b = i11;
                        ng9Var2.f52712c = i11;
                    }
                }
            } else if (z7 || lg9Var.f49645f == null) {
                for (int i12 = 0; i12 < i4; i12++) {
                    ng9 ng9Var3 = ng9VarArr[i12];
                    boolean z10 = this.f6701x;
                    int i13 = lg9Var.f49641b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = ng9Var3.f52715f;
                    int iM17417f = z10 ? ng9Var3.m17417f(Integer.MIN_VALUE) : ng9Var3.m17419h(Integer.MIN_VALUE);
                    ng9Var3.m17413b();
                    if (iM17417f != Integer.MIN_VALUE && ((!z10 || iM17417f >= staggeredGridLayoutManager2.f6695r.mo16451i()) && (z10 || iM17417f <= staggeredGridLayoutManager2.f6695r.mo16455m()))) {
                        if (i13 != Integer.MIN_VALUE) {
                            iM17417f += i13;
                        }
                        ng9Var3.f52712c = iM17417f;
                        ng9Var3.f52711b = iM17417f;
                    }
                }
                int length = ng9VarArr.length;
                int[] iArr = lg9Var.f49645f;
                if (iArr == null || iArr.length < length) {
                    lg9Var.f49645f = new int[staggeredGridLayoutManager.f6694q.length];
                }
                for (int i14 = 0; i14 < length; i14++) {
                    lg9Var.f49645f[i14] = ng9VarArr[i14].m17419h(Integer.MIN_VALUE);
                }
            } else {
                for (int i15 = 0; i15 < i4; i15++) {
                    ng9 ng9Var4 = ng9VarArr[i15];
                    ng9Var4.m17413b();
                    int i16 = lg9Var.f49645f[i15];
                    ng9Var4.f52711b = i16;
                    ng9Var4.f52712c = i16;
                }
            }
        }
        m24899p(g38Var);
        yr4 yr4Var = this.f6699v;
        yr4Var.f70315a = false;
        lq2 lq2Var4 = this.f6696s;
        int iMo16456n = lq2Var4.mo16456n();
        this.f6698u = iMo16456n / i4;
        View.MeasureSpec.makeMeasureSpec(iMo16456n, lq2Var4.mo16453k());
        m2794h1(lg9Var.f49640a, k38Var);
        if (lg9Var.f49642c) {
            m2793g1(-1);
            m2769L0(g38Var, yr4Var, k38Var);
            m2793g1(1);
            yr4Var.f70317c = lg9Var.f49640a + yr4Var.f70318d;
            m2769L0(g38Var, yr4Var, k38Var);
        } else {
            m2793g1(1);
            m2769L0(g38Var, yr4Var, k38Var);
            m2793g1(-1);
            yr4Var.f70317c = lg9Var.f49640a + yr4Var.f70318d;
            m2769L0(g38Var, yr4Var, k38Var);
        }
        if (lq2Var4.mo16453k() != 1073741824) {
            int iM24906v3 = m24906v();
            float fMax = 0.0f;
            for (int i17 = 0; i17 < iM24906v3; i17++) {
                View viewM24904u = m24904u(i17);
                float fMo16447e = lq2Var4.mo16447e(viewM24904u);
                if (fMo16447e >= fMax) {
                    ((mg9) viewM24904u.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fMo16447e);
                }
            }
            int i18 = this.f6698u;
            int iRound = Math.round(fMax * i4);
            if (lq2Var4.mo16453k() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, lq2Var4.mo16456n());
            }
            this.f6698u = iRound / i4;
            View.MeasureSpec.makeMeasureSpec(iRound, lq2Var4.mo16453k());
            if (this.f6698u != i18) {
                for (int i19 = 0; i19 < iM24906v3; i19++) {
                    View viewM24904u2 = m24904u(i19);
                    mg9 mg9Var = (mg9) viewM24904u2.getLayoutParams();
                    mg9Var.getClass();
                    boolean zM2783W0 = m2783W0();
                    int i20 = this.f6697t;
                    if (zM2783W0 && i20 == 1) {
                        int i21 = -((i4 - 1) - mg9Var.f51307e.f52714e);
                        viewM24904u2.offsetLeftAndRight((this.f6698u * i21) - (i21 * i18));
                    } else {
                        int i22 = mg9Var.f51307e.f52714e;
                        int i23 = this.f6698u * i22;
                        int i24 = i22 * i18;
                        if (i20 == 1) {
                            viewM24904u2.offsetLeftAndRight(i23 - i24);
                        } else {
                            viewM24904u2.offsetTopAndBottom(i23 - i24);
                        }
                    }
                }
            }
        }
        if (m24906v() <= 0) {
            z2 = true;
        } else if (this.f6701x) {
            z2 = true;
            m2772O0(g38Var, k38Var, true);
            m2773P0(g38Var, k38Var, false);
        } else {
            z2 = true;
            m2773P0(g38Var, k38Var, true);
            m2772O0(g38Var, k38Var, false);
        }
        if (!z || k38Var.f46633g || this.f6684C == 0 || m24906v() <= 0 || m2782V0() == null) {
            z3 = false;
        } else {
            RecyclerView recyclerView = this.f69172b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f6692K);
            }
            if (m2767J0()) {
                z3 = z2;
            } else {
                z3 = false;
            }
        }
        if (k38Var.f46633g) {
            lg9Var.m16180a();
        }
        this.f6685D = lg9Var.f49642c;
        this.f6686E = m2783W0();
        if (z3) {
            lg9Var.m16180a();
            m2785Y0(g38Var, k38Var, false);
        }
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: Z */
    public final void mo2618Z(g38 g38Var, k38 k38Var, C0797b4 c0797b4) {
        super.mo2618Z(g38Var, k38Var, c0797b4);
        c0797b4.m3279j("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    /* JADX INFO: renamed from: Z0 */
    public final boolean m2786Z0(int i) {
        if (this.f6697t == 0) {
            return (i == -1) != this.f6701x;
        }
        return ((i == -1) == this.f6701x) == m2783W0();
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    @Override // p000.j38
    /* JADX INFO: renamed from: a */
    public final PointF mo2674a(int i) {
        int i2 = -1;
        if (m24906v() != 0) {
            if ((i < m2774Q0()) == this.f6701x) {
                i2 = 1;
            }
        } else if (this.f6701x) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.f6697t == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: a0 */
    public final void mo2619a0(g38 g38Var, k38 k38Var, View view, C0797b4 c0797b4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof mg9)) {
            m24897b0(view, c0797b4);
            return;
        }
        ng9 ng9Var = ((mg9) layoutParams).f51307e;
        if (this.f6697t == 0) {
            c0797b4.m3281l(m58.m16638l(false, ng9Var == null ? -1 : ng9Var.f52714e, 1, -1, -1));
        } else {
            c0797b4.m3281l(m58.m16638l(false, -1, -1, ng9Var == null ? -1 : ng9Var.f52714e, 1));
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final void m2787a1(int i, k38 k38Var) {
        int iM2774Q0;
        int i2;
        if (i > 0) {
            iM2774Q0 = m2775R0();
            i2 = 1;
        } else {
            iM2774Q0 = m2774Q0();
            i2 = -1;
        }
        yr4 yr4Var = this.f6699v;
        yr4Var.f70315a = true;
        m2794h1(iM2774Q0, k38Var);
        m2793g1(i2);
        yr4Var.f70317c = iM2774Q0 + yr4Var.f70318d;
        yr4Var.f70316b = Math.abs(i);
    }

    /* JADX INFO: renamed from: b1 */
    public final void m2788b1(g38 g38Var, yr4 yr4Var) {
        if (!yr4Var.f70315a || yr4Var.f70323i) {
            return;
        }
        int i = yr4Var.f70316b;
        int i2 = yr4Var.f70319e;
        if (i == 0) {
            if (i2 == -1) {
                m2789c1(yr4Var.f70321g, g38Var);
                return;
            } else {
                m2790d1(yr4Var.f70320f, g38Var);
                return;
            }
        }
        int i3 = this.f6693p;
        ng9[] ng9VarArr = this.f6694q;
        int i4 = 1;
        if (i2 == -1) {
            int i5 = yr4Var.f70320f;
            int iM17419h = ng9VarArr[0].m17419h(i5);
            while (i4 < i3) {
                int iM17419h2 = ng9VarArr[i4].m17419h(i5);
                if (iM17419h2 > iM17419h) {
                    iM17419h = iM17419h2;
                }
                i4++;
            }
            int i6 = i5 - iM17419h;
            int iMin = yr4Var.f70321g;
            if (i6 >= 0) {
                iMin -= Math.min(i6, yr4Var.f70316b);
            }
            m2789c1(iMin, g38Var);
            return;
        }
        int i7 = yr4Var.f70321g;
        int iM17417f = ng9VarArr[0].m17417f(i7);
        while (i4 < i3) {
            int iM17417f2 = ng9VarArr[i4].m17417f(i7);
            if (iM17417f2 < iM17417f) {
                iM17417f = iM17417f2;
            }
            i4++;
        }
        int i8 = iM17417f - yr4Var.f70321g;
        int iMin2 = yr4Var.f70320f;
        if (i8 >= 0) {
            iMin2 += Math.min(i8, yr4Var.f70316b);
        }
        m2790d1(iMin2, g38Var);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: c */
    public final void mo2677c(String str) {
        if (this.f6687F == null) {
            super.mo2677c(str);
        }
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: c0 */
    public final void mo2620c0(int i, int i2) {
        m2781U0(i, i2, 1);
    }

    /* JADX INFO: renamed from: c1 */
    public final void m2789c1(int i, g38 g38Var) {
        for (int iM24906v = m24906v() - 1; iM24906v >= 0; iM24906v--) {
            View viewM24904u = m24904u(iM24906v);
            lq2 lq2Var = this.f6695r;
            if (lq2Var.mo16449g(viewM24904u) < i || lq2Var.mo16458p(viewM24904u) < i) {
                return;
            }
            mg9 mg9Var = (mg9) viewM24904u.getLayoutParams();
            mg9Var.getClass();
            if (mg9Var.f51307e.f52710a.size() == 1) {
                return;
            }
            ng9 ng9Var = mg9Var.f51307e;
            ArrayList arrayList = ng9Var.f52710a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            mg9 mg9Var2 = (mg9) view.getLayoutParams();
            mg9Var2.f51307e = null;
            if (mg9Var2.f70799a.m17790j() || mg9Var2.f70799a.m17793m()) {
                ng9Var.f52713d -= ng9Var.f52715f.f6695r.mo16447e(view);
            }
            if (size == 1) {
                ng9Var.f52711b = Integer.MIN_VALUE;
            }
            ng9Var.f52712c = Integer.MIN_VALUE;
            m24901q0(viewM24904u, g38Var);
        }
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: d */
    public final boolean mo2679d() {
        return this.f6697t == 0;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: d0 */
    public final void mo2621d0() {
        this.f6683B.m2804a();
        m24905u0();
    }

    /* JADX INFO: renamed from: d1 */
    public final void m2790d1(int i, g38 g38Var) {
        while (m24906v() > 0) {
            View viewM24904u = m24904u(0);
            lq2 lq2Var = this.f6695r;
            if (lq2Var.mo16446d(viewM24904u) > i || lq2Var.mo16457o(viewM24904u) > i) {
                return;
            }
            mg9 mg9Var = (mg9) viewM24904u.getLayoutParams();
            mg9Var.getClass();
            if (mg9Var.f51307e.f52710a.size() == 1) {
                return;
            }
            ng9 ng9Var = mg9Var.f51307e;
            ArrayList arrayList = ng9Var.f52710a;
            View view = (View) arrayList.remove(0);
            mg9 mg9Var2 = (mg9) view.getLayoutParams();
            mg9Var2.f51307e = null;
            if (arrayList.size() == 0) {
                ng9Var.f52712c = Integer.MIN_VALUE;
            }
            if (mg9Var2.f70799a.m17790j() || mg9Var2.f70799a.m17793m()) {
                ng9Var.f52713d -= ng9Var.f52715f.f6695r.mo16447e(view);
            }
            ng9Var.f52711b = Integer.MIN_VALUE;
            m24901q0(viewM24904u, g38Var);
        }
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: e */
    public final boolean mo2680e() {
        return this.f6697t == 1;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: e0 */
    public final void mo2623e0(int i, int i2) {
        m2781U0(i, i2, 8);
    }

    /* JADX INFO: renamed from: e1 */
    public final void m2791e1() {
        if (this.f6697t == 1 || !m2783W0()) {
            this.f6701x = this.f6700w;
        } else {
            this.f6701x = !this.f6700w;
        }
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: f */
    public final boolean mo2625f(z28 z28Var) {
        return z28Var instanceof mg9;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: f0 */
    public final void mo2626f0(int i, int i2) {
        m2781U0(i, i2, 2);
    }

    /* JADX INFO: renamed from: f1 */
    public final int m2792f1(int i, g38 g38Var, k38 k38Var) {
        if (m24906v() == 0 || i == 0) {
            return 0;
        }
        m2787a1(i, k38Var);
        yr4 yr4Var = this.f6699v;
        int iM2769L0 = m2769L0(g38Var, yr4Var, k38Var);
        if (yr4Var.f70316b >= iM2769L0) {
            i = i < 0 ? -iM2769L0 : iM2769L0;
        }
        this.f6695r.mo16459q(-i);
        this.f6685D = this.f6701x;
        yr4Var.f70316b = 0;
        m2788b1(g38Var, yr4Var);
        return i;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: g0 */
    public final void mo2627g0(int i, int i2) {
        m2781U0(i, i2, 4);
    }

    /* JADX INFO: renamed from: g1 */
    public final void m2793g1(int i) {
        yr4 yr4Var = this.f6699v;
        yr4Var.f70319e = i;
        yr4Var.f70318d = this.f6701x != (i == -1) ? -1 : 1;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: h */
    public final void mo2683h(int i, int i2, k38 k38Var, pj3 pj3Var) {
        yr4 yr4Var;
        int iM17417f;
        if (this.f6697t != 0) {
            i = i2;
        }
        if (m24906v() == 0 || i == 0) {
            return;
        }
        m2787a1(i, k38Var);
        int[] iArr = this.f6691J;
        int i3 = this.f6693p;
        if (iArr == null || iArr.length < i3) {
            this.f6691J = new int[i3];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            yr4Var = this.f6699v;
            if (i4 >= i3) {
                break;
            }
            int i6 = yr4Var.f70318d;
            ng9[] ng9VarArr = this.f6694q;
            if (i6 == -1) {
                int i7 = yr4Var.f70320f;
                iM17417f = i7 - ng9VarArr[i4].m17419h(i7);
            } else {
                iM17417f = ng9VarArr[i4].m17417f(yr4Var.f70321g) - yr4Var.f70321g;
            }
            if (iM17417f >= 0) {
                this.f6691J[i5] = iM17417f;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.f6691J, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = yr4Var.f70317c;
            if (i9 < 0 || i9 >= k38Var.m14789b()) {
                return;
            }
            pj3Var.m19195a(yr4Var.f70317c, this.f6691J[i8]);
            yr4Var.f70317c += yr4Var.f70318d;
        }
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: h0 */
    public final void mo2628h0(g38 g38Var, k38 k38Var) {
        m2785Y0(g38Var, k38Var, true);
    }

    /* JADX INFO: renamed from: h1 */
    public final void m2794h1(int i, k38 k38Var) {
        int iMo16456n;
        int iMo16456n2;
        int i2;
        yr4 yr4Var = this.f6699v;
        boolean z = false;
        yr4Var.f70316b = 0;
        yr4Var.f70317c = i;
        fd5 fd5Var = this.f69175e;
        lq2 lq2Var = this.f6695r;
        if (fd5Var == null || !fd5Var.m11781i() || (i2 = k38Var.f46627a) == -1) {
            iMo16456n = 0;
            iMo16456n2 = 0;
        } else {
            if (this.f6701x == (i2 < i)) {
                iMo16456n = lq2Var.mo16456n();
                iMo16456n2 = 0;
            } else {
                iMo16456n2 = lq2Var.mo16456n();
                iMo16456n = 0;
            }
        }
        RecyclerView recyclerView = this.f69172b;
        if (recyclerView == null || !recyclerView.f6657h) {
            yr4Var.f70321g = lq2Var.mo16450h() + iMo16456n;
            yr4Var.f70320f = -iMo16456n2;
        } else {
            yr4Var.f70320f = lq2Var.mo16455m() - iMo16456n2;
            yr4Var.f70321g = lq2Var.mo16451i() + iMo16456n;
        }
        yr4Var.f70322h = false;
        yr4Var.f70315a = true;
        if (lq2Var.mo16453k() == 0 && lq2Var.mo16450h() == 0) {
            z = true;
        }
        yr4Var.f70323i = z;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: i0 */
    public final void mo2629i0(k38 k38Var) {
        this.f6703z = -1;
        this.f6682A = Integer.MIN_VALUE;
        this.f6687F = null;
        this.f6689H.m16180a();
    }

    /* JADX INFO: renamed from: i1 */
    public final void m2795i1(ng9 ng9Var, int i, int i2) {
        int i3 = ng9Var.f52713d;
        int i4 = ng9Var.f52714e;
        BitSet bitSet = this.f6702y;
        if (i != -1) {
            int i5 = ng9Var.f52712c;
            if (i5 == Integer.MIN_VALUE) {
                ng9Var.m17412a();
                i5 = ng9Var.f52712c;
            }
            if (i5 - i3 >= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = ng9Var.f52711b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) ng9Var.f52710a.get(0);
            mg9 mg9Var = (mg9) view.getLayoutParams();
            ng9Var.f52711b = ng9Var.f52715f.f6695r.mo16449g(view);
            mg9Var.getClass();
            i6 = ng9Var.f52711b;
        }
        if (i6 + i3 <= i2) {
            bitSet.set(i4, false);
        }
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: j */
    public final int mo2687j(k38 k38Var) {
        if (m24906v() == 0) {
            return 0;
        }
        boolean z = !this.f6690I;
        return ss5.m21719p(k38Var, this.f6695r, m2771N0(z), m2770M0(z), this, this.f6690I);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: j0 */
    public final void mo2688j0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f6687F = savedState;
            if (this.f6703z != -1) {
                savedState.f6708a = -1;
                savedState.f6709b = -1;
                savedState.f6711d = null;
                savedState.f6710c = 0;
                savedState.f6712e = 0;
                savedState.f6713f = null;
                savedState.f6714g = null;
            }
            m24905u0();
        }
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: k */
    public final int mo2630k(k38 k38Var) {
        return m2768K0(k38Var);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: k0 */
    public final Parcelable mo2690k0() {
        int iM17419h;
        int iMo16455m;
        int[] iArr;
        SavedState savedState = this.f6687F;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f6710c = savedState.f6710c;
            savedState2.f6708a = savedState.f6708a;
            savedState2.f6709b = savedState.f6709b;
            savedState2.f6711d = savedState.f6711d;
            savedState2.f6712e = savedState.f6712e;
            savedState2.f6713f = savedState.f6713f;
            savedState2.f6715h = savedState.f6715h;
            savedState2.f6716i = savedState.f6716i;
            savedState2.f6717j = savedState.f6717j;
            savedState2.f6714g = savedState.f6714g;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        savedState3.f6715h = this.f6700w;
        savedState3.f6716i = this.f6685D;
        savedState3.f6717j = this.f6686E;
        C0729e c0729e = this.f6683B;
        if (c0729e == null || (iArr = c0729e.f6719a) == null) {
            savedState3.f6712e = 0;
        } else {
            savedState3.f6713f = iArr;
            savedState3.f6712e = iArr.length;
            savedState3.f6714g = c0729e.f6720b;
        }
        if (m24906v() <= 0) {
            savedState3.f6708a = -1;
            savedState3.f6709b = -1;
            savedState3.f6710c = 0;
            return savedState3;
        }
        savedState3.f6708a = this.f6685D ? m2775R0() : m2774Q0();
        View viewM2770M0 = this.f6701x ? m2770M0(true) : m2771N0(true);
        savedState3.f6709b = viewM2770M0 != null ? y28.m24878K(viewM2770M0) : -1;
        int i = this.f6693p;
        savedState3.f6710c = i;
        savedState3.f6711d = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = this.f6685D;
            lq2 lq2Var = this.f6695r;
            ng9[] ng9VarArr = this.f6694q;
            if (z) {
                iM17419h = ng9VarArr[i2].m17417f(Integer.MIN_VALUE);
                if (iM17419h != Integer.MIN_VALUE) {
                    iMo16455m = lq2Var.mo16451i();
                    iM17419h -= iMo16455m;
                }
            } else {
                iM17419h = ng9VarArr[i2].m17419h(Integer.MIN_VALUE);
                if (iM17419h != Integer.MIN_VALUE) {
                    iMo16455m = lq2Var.mo16455m();
                    iM17419h -= iMo16455m;
                }
            }
            savedState3.f6711d[i2] = iM17419h;
        }
        return savedState3;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: l */
    public final int mo2631l(k38 k38Var) {
        if (m24906v() == 0) {
            return 0;
        }
        boolean z = !this.f6690I;
        return ss5.m21721r(k38Var, this.f6695r, m2771N0(z), m2770M0(z), this, this.f6690I);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: l0 */
    public final void mo2796l0(int i) {
        if (i == 0) {
            m2767J0();
        }
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: m */
    public final int mo2692m(k38 k38Var) {
        if (m24906v() == 0) {
            return 0;
        }
        boolean z = !this.f6690I;
        return ss5.m21719p(k38Var, this.f6695r, m2771N0(z), m2770M0(z), this, this.f6690I);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: n */
    public final int mo2634n(k38 k38Var) {
        return m2768K0(k38Var);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: o */
    public final int mo2635o(k38 k38Var) {
        if (m24906v() == 0) {
            return 0;
        }
        boolean z = !this.f6690I;
        return ss5.m21721r(k38Var, this.f6695r, m2771N0(z), m2770M0(z), this, this.f6690I);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: r */
    public final z28 mo2638r() {
        return this.f6697t == 0 ? new mg9(-2, -1) : new mg9(-1, -2);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: s */
    public final z28 mo2640s(Context context, AttributeSet attributeSet) {
        return new mg9(context, attributeSet);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: t */
    public final z28 mo2642t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new mg9((ViewGroup.MarginLayoutParams) layoutParams) : new mg9(layoutParams);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: v0 */
    public final int mo2645v0(int i, g38 g38Var, k38 k38Var) {
        return m2792f1(i, g38Var, k38Var);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: w0 */
    public final void mo2697w0(int i) {
        SavedState savedState = this.f6687F;
        if (savedState != null && savedState.f6708a != i) {
            savedState.f6711d = null;
            savedState.f6710c = 0;
            savedState.f6708a = -1;
            savedState.f6709b = -1;
        }
        this.f6703z = i;
        this.f6682A = Integer.MIN_VALUE;
        m24905u0();
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: x */
    public final int mo2648x(g38 g38Var, k38 k38Var) {
        if (this.f6697t == 1) {
            return Math.min(this.f6693p, k38Var.m14789b());
        }
        return -1;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: x0 */
    public final int mo2649x0(int i, g38 g38Var, k38 k38Var) {
        return m2792f1(i, g38Var, k38Var);
    }
}
