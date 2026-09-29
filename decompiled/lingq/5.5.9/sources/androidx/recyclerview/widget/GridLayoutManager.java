package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.media.session.C0166e;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.Arrays;
import java.util.WeakHashMap;
import p003a2.C0009a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p497y2.C10284f;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: E */
    public boolean f6905E;

    /* JADX INFO: renamed from: F */
    public int f6906F;

    /* JADX INFO: renamed from: G */
    public int[] f6907G;

    /* JADX INFO: renamed from: H */
    public View[] f6908H;

    /* JADX INFO: renamed from: I */
    public final SparseIntArray f6909I;

    /* JADX INFO: renamed from: J */
    public final SparseIntArray f6910J;

    /* JADX INFO: renamed from: K */
    public final C1098a f6911K;

    /* JADX INFO: renamed from: L */
    public final Rect f6912L;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C1098a extends AbstractC1100c {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C1099b extends RecyclerView.C1121n {

        /* JADX INFO: renamed from: e */
        public int f6913e;

        /* JADX INFO: renamed from: f */
        public int f6914f;

        public C1099b(int i10, int i11) {
            super(i10, i11);
            this.f6913e = -1;
            this.f6914f = 0;
        }

        public C1099b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6913e = -1;
            this.f6914f = 0;
        }

        public C1099b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6913e = -1;
            this.f6914f = 0;
        }

        public C1099b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f6913e = -1;
            this.f6914f = 0;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class AbstractC1100c {

        /* JADX INFO: renamed from: a */
        public final SparseIntArray f6915a = new SparseIntArray();

        /* JADX INFO: renamed from: b */
        public final SparseIntArray f6916b = new SparseIntArray();

        /* JADX INFO: renamed from: a */
        public static int m4107a(int i10, int i11) {
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                i12++;
                if (i12 == i11) {
                    i13++;
                    i12 = 0;
                } else if (i12 > i11) {
                    i13++;
                    i12 = 1;
                }
            }
            return i12 + 1 > i11 ? i13 + 1 : i13;
        }

        /* JADX INFO: renamed from: b */
        public final void m4108b() {
            this.f6915a.clear();
        }
    }

    public GridLayoutManager(int i10) {
        super(1);
        this.f6905E = false;
        this.f6906F = -1;
        this.f6909I = new SparseIntArray();
        this.f6910J = new SparseIntArray();
        this.f6911K = new C1098a();
        this.f6912L = new Rect();
        m4101t1(i10);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f6905E = false;
        this.f6906F = -1;
        this.f6909I = new SparseIntArray();
        this.f6910J = new SparseIntArray();
        this.f6911K = new C1098a();
        this.f6912L = new Rect();
        m4101t1(RecyclerView.AbstractC1120m.m4287K(context, attributeSet, i10, i11).f7102b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: A */
    public final int mo4070A(RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x) {
        if (this.f6921p == 1) {
            return this.f6906F;
        }
        if (c1131x.m4364b() < 1) {
            return 0;
        }
        return m4094p1(c1131x.m4364b() - 1, c1127t, c1131x) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: G0 */
    public final boolean mo4071G0() {
        return this.f6931z == null && !this.f6905E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: I0 */
    public final void mo4072I0(RecyclerView.C1131x c1131x, LinearLayoutManager.C1104c c1104c, RecyclerView.AbstractC1120m.c cVar) {
        int i10 = this.f6906F;
        for (int i11 = 0; i11 < this.f6906F; i11++) {
            int i12 = c1104c.f6947d;
            if (!(i12 >= 0 && i12 < c1131x.m4364b()) || i10 <= 0) {
                return;
            }
            ((RunnableC1164o.b) cVar).m4505a(c1104c.f6947d, Math.max(0, c1104c.f6950g));
            this.f6911K.getClass();
            i10--;
            c1104c.f6947d += c1104c.f6948e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: M */
    public final int mo4073M(RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x) {
        if (this.f6921p == 0) {
            return this.f6906F;
        }
        if (c1131x.m4364b() < 1) {
            return 0;
        }
        return m4094p1(c1131x.m4364b() - 1, c1127t, c1131x) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: V0 */
    public final View mo4074V0(RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x, boolean z10, boolean z11) {
        int i10;
        int iM4326y;
        int iM4326y2 = m4326y();
        int i11 = 1;
        if (z11) {
            iM4326y = m4326y() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iM4326y2;
            iM4326y = 0;
        }
        int iM4364b = c1131x.m4364b();
        m4116N0();
        int iMo4539k = this.f6923r.mo4539k();
        int iMo4535g = this.f6923r.mo4535g();
        View view = null;
        View view2 = null;
        while (iM4326y != i10) {
            View viewM4324x = m4324x(iM4326y);
            int iM4286J = RecyclerView.AbstractC1120m.m4286J(viewM4324x);
            if (iM4286J >= 0 && iM4286J < iM4364b) {
                if (m4096q1(iM4286J, c1127t, c1131x) != 0) {
                    continue;
                } else if (((RecyclerView.C1121n) viewM4324x.getLayoutParams()).m4335c()) {
                    if (view2 == null) {
                        view2 = viewM4324x;
                    }
                } else {
                    if (this.f6923r.mo4533e(viewM4324x) < iMo4535g && this.f6923r.mo4530b(viewM4324x) >= iMo4539k) {
                        return viewM4324x;
                    }
                    if (view == null) {
                        view = viewM4324x;
                    }
                }
            }
            iM4326y += i11;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code duplicated, block: B:88:0x012b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0131  */
    /* JADX WARN: Code duplicated, block: B:91:0x0142  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: W */
    public final View mo4075W(View view, int i10, RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x) {
        View viewM4172D;
        int iM4326y;
        int i11;
        int iM4326y2;
        View view2;
        View view3;
        int i12;
        boolean z10;
        RecyclerView.C1127t c1127t2 = c1127t;
        RecyclerView.C1131x c1131x2 = c1131x;
        RecyclerView recyclerView = this.f7085b;
        View view4 = null;
        if (recyclerView == null || (viewM4172D = recyclerView.m4172D(view)) == null || this.f7084a.m4464j(viewM4172D)) {
            viewM4172D = null;
        }
        if (viewM4172D == null) {
            return null;
        }
        C1099b c1099b = (C1099b) viewM4172D.getLayoutParams();
        int i13 = c1099b.f6913e;
        int i14 = c1099b.f6914f + i13;
        if (super.mo4075W(view, i10, c1127t, c1131x) == null) {
            return null;
        }
        if ((m4115M0(i10) == 1) != this.f6926u) {
            iM4326y2 = m4326y() - 1;
            iM4326y = -1;
            i11 = -1;
        } else {
            iM4326y = m4326y();
            i11 = 1;
            iM4326y2 = 0;
        }
        boolean z11 = this.f6921p == 1 && m4132a1();
        int iM4094p1 = m4094p1(iM4326y2, c1127t2, c1131x2);
        int i15 = -1;
        int i16 = -1;
        int i17 = i11;
        int iMin = 0;
        int iMin2 = 0;
        int i18 = iM4326y2;
        View view5 = null;
        while (i18 != iM4326y) {
            int i19 = iM4326y;
            int iM4094p2 = m4094p1(i18, c1127t2, c1131x2);
            View viewM4324x = m4324x(i18);
            if (viewM4324x == viewM4172D) {
                break;
            }
            if (!viewM4324x.hasFocusable() || iM4094p2 == iM4094p1) {
                C1099b c1099b2 = (C1099b) viewM4324x.getLayoutParams();
                int i20 = c1099b2.f6913e;
                view2 = viewM4172D;
                int i21 = c1099b2.f6914f + i20;
                if (viewM4324x.hasFocusable() && i20 == i13 && i21 == i14) {
                    return viewM4324x;
                }
                if (!(viewM4324x.hasFocusable() && view4 == null) && (viewM4324x.hasFocusable() || view5 != null)) {
                    view3 = view5;
                    int iMin3 = Math.min(i21, i14) - Math.max(i20, i13);
                    if (!viewM4324x.hasFocusable()) {
                        if (view4 == null) {
                            i12 = iMin;
                            if (!(this.f7086c.m4489b(viewM4324x) && this.f7087d.m4489b(viewM4324x))) {
                                if (iMin3 <= iMin2) {
                                    if (iMin3 == iMin2) {
                                        if (z11 == (i20 > i15)) {
                                        }
                                    }
                                }
                                z10 = true;
                            }
                            if (z10) {
                                if (viewM4324x.hasFocusable()) {
                                    int i22 = c1099b2.f6913e;
                                    iMin = Math.min(i21, i14) - Math.max(i20, i13);
                                    i16 = i22;
                                    view5 = view3;
                                    view4 = viewM4324x;
                                } else {
                                    int i23 = c1099b2.f6913e;
                                    iMin2 = Math.min(i21, i14) - Math.max(i20, i13);
                                    i15 = i23;
                                    iMin = i12;
                                    view5 = viewM4324x;
                                }
                            }
                            i18 += i17;
                            c1127t2 = c1127t;
                            c1131x2 = c1131x;
                            iM4326y = i19;
                            viewM4172D = view2;
                        }
                        z10 = false;
                        if (z10) {
                            if (viewM4324x.hasFocusable()) {
                                int i24 = c1099b2.f6913e;
                                iMin = Math.min(i21, i14) - Math.max(i20, i13);
                                i16 = i24;
                                view5 = view3;
                                view4 = viewM4324x;
                            } else {
                                int i25 = c1099b2.f6913e;
                                iMin2 = Math.min(i21, i14) - Math.max(i20, i13);
                                i15 = i25;
                                iMin = i12;
                                view5 = viewM4324x;
                            }
                        }
                        i18 += i17;
                        c1127t2 = c1127t;
                        c1131x2 = c1131x;
                        iM4326y = i19;
                        viewM4172D = view2;
                    } else if (iMin3 <= iMin) {
                        if (iMin3 == iMin) {
                            if (z11 == (i20 > i16)) {
                            }
                            if (z10) {
                                if (viewM4324x.hasFocusable()) {
                                    int i26 = c1099b2.f6913e;
                                    iMin = Math.min(i21, i14) - Math.max(i20, i13);
                                    i16 = i26;
                                    view5 = view3;
                                    view4 = viewM4324x;
                                } else {
                                    int i27 = c1099b2.f6913e;
                                    iMin2 = Math.min(i21, i14) - Math.max(i20, i13);
                                    i15 = i27;
                                    iMin = i12;
                                    view5 = viewM4324x;
                                }
                            }
                            i18 += i17;
                            c1127t2 = c1127t;
                            c1131x2 = c1131x;
                            iM4326y = i19;
                            viewM4172D = view2;
                        }
                    }
                    i12 = iMin;
                    z10 = false;
                    if (z10) {
                        if (viewM4324x.hasFocusable()) {
                            int i28 = c1099b2.f6913e;
                            iMin = Math.min(i21, i14) - Math.max(i20, i13);
                            i16 = i28;
                            view5 = view3;
                            view4 = viewM4324x;
                        } else {
                            int i29 = c1099b2.f6913e;
                            iMin2 = Math.min(i21, i14) - Math.max(i20, i13);
                            i15 = i29;
                            iMin = i12;
                            view5 = viewM4324x;
                        }
                    }
                    i18 += i17;
                    c1127t2 = c1127t;
                    c1131x2 = c1131x;
                    iM4326y = i19;
                    viewM4172D = view2;
                } else {
                    view3 = view5;
                }
                i12 = iMin;
                z10 = true;
                if (z10) {
                    if (viewM4324x.hasFocusable()) {
                        int i210 = c1099b2.f6913e;
                        iMin = Math.min(i21, i14) - Math.max(i20, i13);
                        i16 = i210;
                        view5 = view3;
                        view4 = viewM4324x;
                    } else {
                        int i211 = c1099b2.f6913e;
                        iMin2 = Math.min(i21, i14) - Math.max(i20, i13);
                        i15 = i211;
                        iMin = i12;
                        view5 = viewM4324x;
                    }
                }
                i18 += i17;
                c1127t2 = c1127t;
                c1131x2 = c1131x;
                iM4326y = i19;
                viewM4172D = view2;
            } else {
                if (view4 != null) {
                    break;
                }
                view2 = viewM4172D;
                view3 = view5;
                i12 = iMin;
            }
            iMin = i12;
            view5 = view3;
            i18 += i17;
            c1127t2 = c1127t;
            c1131x2 = c1131x;
            iM4326y = i19;
            viewM4172D = view2;
        }
        return view4 != null ? view4 : view5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: Y */
    public final void mo4076Y(RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x, C10284f c10284f) {
        super.mo4076Y(c1127t, c1131x, c10284f);
        c10284f.m19264i(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: a0 */
    public final void mo4077a0(RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x, View view, C10284f c10284f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1099b)) {
            m4310Z(view, c10284f);
            return;
        }
        C1099b c1099b = (C1099b) layoutParams;
        int iM4094p1 = m4094p1(c1099b.m4333a(), c1127t, c1131x);
        if (this.f6921p == 0) {
            c10284f.m19266k(C10284f.c.m19275a(c1099b.f6913e, c1099b.f6914f, iM4094p1, 1, false));
        } else {
            c10284f.m19266k(C10284f.c.m19275a(iM4094p1, 1, c1099b.f6913e, c1099b.f6914f, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: b0 */
    public final void mo4078b0(int i10, int i11) {
        C1098a c1098a = this.f6911K;
        c1098a.m4108b();
        c1098a.f6916b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: b1 */
    public final void mo4079b1(RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x, LinearLayoutManager.C1104c c1104c, LinearLayoutManager.C1103b c1103b) {
        int i10;
        int i11;
        int i12;
        int iMo4532d;
        int i13;
        int iM4303G;
        int iMo4532d2;
        int i14;
        int i15;
        int iM4294z;
        int iM4294z2;
        boolean z10;
        View viewM4159b;
        int iMo4538j = this.f6923r.mo4538j();
        int i16 = 1;
        boolean z11 = iMo4538j != 1073741824;
        int i17 = m4326y() > 0 ? this.f6907G[this.f6906F] : 0;
        if (z11) {
            m4103u1();
        }
        boolean z12 = c1104c.f6948e == 1;
        int iM4096q1 = this.f6906F;
        if (!z12) {
            iM4096q1 = m4096q1(c1104c.f6947d, c1127t, c1131x) + m4097r1(c1104c.f6947d, c1127t, c1131x);
        }
        int i18 = 0;
        while (i18 < this.f6906F) {
            int i19 = c1104c.f6947d;
            if (!(i19 >= 0 && i19 < c1131x.m4364b()) || iM4096q1 <= 0) {
                break;
            }
            int i20 = c1104c.f6947d;
            int iM4097r1 = m4097r1(i20, c1127t, c1131x);
            if (iM4097r1 > this.f6906F) {
                throw new IllegalArgumentException(C0166e.m768o(C0009a.m25n("Item at position ", i20, " requires ", iM4097r1, " spans but GridLayoutManager has only "), this.f6906F, " spans."));
            }
            iM4096q1 -= iM4097r1;
            if (iM4096q1 < 0 || (viewM4159b = c1104c.m4159b(c1127t)) == null) {
                break;
            }
            this.f6908H[i18] = viewM4159b;
            i18++;
        }
        if (i18 == 0) {
            c1103b.f6941b = true;
            return;
        }
        if (z12) {
            i10 = 0;
            i11 = i18;
        } else {
            i10 = i18 - 1;
            i16 = -1;
            i11 = -1;
        }
        int i21 = 0;
        while (i10 != i11) {
            View view = this.f6908H[i10];
            C1099b c1099b = (C1099b) view.getLayoutParams();
            int iM4097r2 = m4097r1(RecyclerView.AbstractC1120m.m4286J(view), c1127t, c1131x);
            c1099b.f6914f = iM4097r2;
            c1099b.f6913e = i21;
            i21 += iM4097r2;
            i10 += i16;
        }
        float f3 = 0.0f;
        int i22 = 0;
        for (int i23 = 0; i23 < i18; i23++) {
            View view2 = this.f6908H[i23];
            if (c1104c.f6954k != null) {
                z10 = false;
                if (z12) {
                    m4311c(view2, -1, true);
                } else {
                    m4311c(view2, 0, true);
                }
            } else if (z12) {
                z10 = false;
                m4311c(view2, -1, false);
            } else {
                z10 = false;
                m4311c(view2, 0, false);
            }
            m4312e(view2, this.f6912L);
            m4098s1(view2, iMo4538j, z10);
            int iMo4531c = this.f6923r.mo4531c(view2);
            if (iMo4531c > i22) {
                i22 = iMo4531c;
            }
            float fMo4532d = (this.f6923r.mo4532d(view2) * 1.0f) / ((C1099b) view2.getLayoutParams()).f6914f;
            if (fMo4532d > f3) {
                f3 = fMo4532d;
            }
        }
        if (z11) {
            m4091n1(Math.max(Math.round(f3 * this.f6906F), i17));
            i22 = 0;
            for (int i24 = 0; i24 < i18; i24++) {
                View view3 = this.f6908H[i24];
                m4098s1(view3, 1073741824, true);
                int iMo4531c2 = this.f6923r.mo4531c(view3);
                if (iMo4531c2 > i22) {
                    i22 = iMo4531c2;
                }
            }
        }
        for (int i25 = 0; i25 < i18; i25++) {
            View view4 = this.f6908H[i25];
            if (this.f6923r.mo4531c(view4) != i22) {
                C1099b c1099b2 = (C1099b) view4.getLayoutParams();
                Rect rect = c1099b2.f7106b;
                int i26 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1099b2).topMargin + ((ViewGroup.MarginLayoutParams) c1099b2).bottomMargin;
                int i27 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1099b2).leftMargin + ((ViewGroup.MarginLayoutParams) c1099b2).rightMargin;
                int iM4092o1 = m4092o1(c1099b2.f6913e, c1099b2.f6914f);
                if (this.f6921p == 1) {
                    iM4294z2 = RecyclerView.AbstractC1120m.m4294z(false, iM4092o1, 1073741824, i27, ((ViewGroup.MarginLayoutParams) c1099b2).width);
                    iM4294z = View.MeasureSpec.makeMeasureSpec(i22 - i26, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i22 - i27, 1073741824);
                    iM4294z = RecyclerView.AbstractC1120m.m4294z(false, iM4092o1, 1073741824, i26, ((ViewGroup.MarginLayoutParams) c1099b2).height);
                    iM4294z2 = iMakeMeasureSpec;
                }
                if (m4300D0(view4, iM4294z2, iM4294z, (RecyclerView.C1121n) view4.getLayoutParams())) {
                    view4.measure(iM4294z2, iM4294z);
                }
            }
        }
        c1103b.f6940a = i22;
        if (this.f6921p == 1) {
            if (c1104c.f6949f == -1) {
                i15 = c1104c.f6945b;
                i14 = i15 - i22;
            } else {
                i14 = c1104c.f6945b;
                i15 = i22 + i14;
            }
            iM4303G = 0;
            i13 = i14;
            iMo4532d2 = i15;
            iMo4532d = 0;
        } else {
            if (c1104c.f6949f == -1) {
                iMo4532d = c1104c.f6945b;
                i12 = iMo4532d - i22;
            } else {
                i12 = c1104c.f6945b;
                iMo4532d = i22 + i12;
            }
            i13 = 0;
            iM4303G = i12;
            iMo4532d2 = 0;
        }
        for (int i28 = 0; i28 < i18; i28++) {
            View view5 = this.f6908H[i28];
            C1099b c1099b3 = (C1099b) view5.getLayoutParams();
            if (this.f6921p != 1) {
                int iM4305I = m4305I() + this.f6907G[c1099b3.f6913e];
                i13 = iM4305I;
                iMo4532d2 = this.f6923r.mo4532d(view5) + iM4305I;
            } else if (m4132a1()) {
                iMo4532d = m4303G() + this.f6907G[this.f6906F - c1099b3.f6913e];
                iM4303G = iMo4532d - this.f6923r.mo4532d(view5);
            } else {
                iM4303G = this.f6907G[c1099b3.f6913e] + m4303G();
                iMo4532d = this.f6923r.mo4532d(view5) + iM4303G;
            }
            RecyclerView.AbstractC1120m.m4291R(view5, iM4303G, i13, iMo4532d, iMo4532d2);
            if (c1099b3.m4335c() || c1099b3.m4334b()) {
                c1103b.f6942c = true;
            }
            c1103b.f6943d = view5.hasFocusable() | c1103b.f6943d;
        }
        Arrays.fill(this.f6908H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: c0 */
    public final void mo4080c0() {
        C1098a c1098a = this.f6911K;
        c1098a.m4108b();
        c1098a.f6916b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: c1 */
    public final void mo4081c1(RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x, LinearLayoutManager.C1102a c1102a, int i10) {
        m4103u1();
        if (c1131x.m4364b() > 0 && !c1131x.f7146g) {
            boolean z10 = i10 == 1;
            int iM4096q1 = m4096q1(c1102a.f6936b, c1127t, c1131x);
            if (z10) {
                while (iM4096q1 > 0) {
                    int i11 = c1102a.f6936b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    c1102a.f6936b = i12;
                    iM4096q1 = m4096q1(i12, c1127t, c1131x);
                }
            } else {
                int iM4364b = c1131x.m4364b() - 1;
                int i13 = c1102a.f6936b;
                while (i13 < iM4364b) {
                    int i14 = i13 + 1;
                    int iM4096q2 = m4096q1(i14, c1127t, c1131x);
                    if (iM4096q2 <= iM4096q1) {
                        break;
                    }
                    i13 = i14;
                    iM4096q1 = iM4096q2;
                }
                c1102a.f6936b = i13;
            }
        }
        View[] viewArr = this.f6908H;
        if (viewArr == null || viewArr.length != this.f6906F) {
            this.f6908H = new View[this.f6906F];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: d0 */
    public final void mo4082d0(int i10, int i11) {
        C1098a c1098a = this.f6911K;
        c1098a.m4108b();
        c1098a.f6916b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: e0 */
    public final void mo4083e0(int i10, int i11) {
        C1098a c1098a = this.f6911K;
        c1098a.m4108b();
        c1098a.f6916b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: f0 */
    public final void mo4084f0(int i10, int i11) {
        C1098a c1098a = this.f6911K;
        c1098a.m4108b();
        c1098a.f6916b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: g0 */
    public void mo4085g0(RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x) {
        boolean z10 = c1131x.f7146g;
        SparseIntArray sparseIntArray = this.f6910J;
        SparseIntArray sparseIntArray2 = this.f6909I;
        if (z10) {
            int iM4326y = m4326y();
            for (int i10 = 0; i10 < iM4326y; i10++) {
                C1099b c1099b = (C1099b) m4324x(i10).getLayoutParams();
                int iM4333a = c1099b.m4333a();
                sparseIntArray2.put(iM4333a, c1099b.f6914f);
                sparseIntArray.put(iM4333a, c1099b.f6913e);
            }
        }
        super.mo4085g0(c1127t, c1131x);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: h */
    public final boolean mo4086h(RecyclerView.C1121n c1121n) {
        return c1121n instanceof C1099b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: h0 */
    public final void mo4087h0(RecyclerView.C1131x c1131x) {
        super.mo4087h0(c1131x);
        this.f6905E = false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: j1 */
    public final void mo4088j1(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo4088j1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: m */
    public final int mo4089m(RecyclerView.C1131x c1131x) {
        return m4113K0(c1131x);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: n */
    public final int mo4090n(RecyclerView.C1131x c1131x) {
        return m4114L0(c1131x);
    }

    /* JADX INFO: renamed from: n1 */
    public final void m4091n1(int i10) {
        int i11;
        int[] iArr = this.f6907G;
        int i12 = this.f6906F;
        if (iArr == null || iArr.length != i12 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i12 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i10 / i12;
        int i15 = i10 % i12;
        int i16 = 0;
        for (int i17 = 1; i17 <= i12; i17++) {
            i13 += i15;
            if (i13 <= 0 || i12 - i13 >= i15) {
                i11 = i14;
            } else {
                i11 = i14 + 1;
                i13 -= i12;
            }
            i16 += i11;
            iArr[i17] = i16;
        }
        this.f6907G = iArr;
    }

    /* JADX INFO: renamed from: o1 */
    public final int m4092o1(int i10, int i11) {
        if (this.f6921p != 1 || !m4132a1()) {
            int[] iArr = this.f6907G;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.f6907G;
        int i12 = this.f6906F;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: p */
    public final int mo4093p(RecyclerView.C1131x c1131x) {
        return m4113K0(c1131x);
    }

    /* JADX INFO: renamed from: p1 */
    public final int m4094p1(int i10, RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x) {
        boolean z10 = c1131x.f7146g;
        C1098a c1098a = this.f6911K;
        if (!z10) {
            int i11 = this.f6906F;
            c1098a.getClass();
            return AbstractC1100c.m4107a(i10, i11);
        }
        int iM4343b = c1127t.m4343b(i10);
        if (iM4343b != -1) {
            int i12 = this.f6906F;
            c1098a.getClass();
            return AbstractC1100c.m4107a(iM4343b, i12);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: q */
    public final int mo4095q(RecyclerView.C1131x c1131x) {
        return m4114L0(c1131x);
    }

    /* JADX INFO: renamed from: q1 */
    public final int m4096q1(int i10, RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x) {
        boolean z10 = c1131x.f7146g;
        C1098a c1098a = this.f6911K;
        if (!z10) {
            int i11 = this.f6906F;
            c1098a.getClass();
            return i10 % i11;
        }
        int i12 = this.f6910J.get(i10, -1);
        if (i12 != -1) {
            return i12;
        }
        int iM4343b = c1127t.m4343b(i10);
        if (iM4343b != -1) {
            int i13 = this.f6906F;
            c1098a.getClass();
            return iM4343b % i13;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    /* JADX INFO: renamed from: r1 */
    public final int m4097r1(int i10, RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x) {
        boolean z10 = c1131x.f7146g;
        C1098a c1098a = this.f6911K;
        if (!z10) {
            c1098a.getClass();
            return 1;
        }
        int i11 = this.f6909I.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        if (c1127t.m4343b(i10) != -1) {
            c1098a.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    /* JADX INFO: renamed from: s1 */
    public final void m4098s1(View view, int i10, boolean z10) {
        int iM4294z;
        int iM4294z2;
        C1099b c1099b = (C1099b) view.getLayoutParams();
        Rect rect = c1099b.f7106b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1099b).topMargin + ((ViewGroup.MarginLayoutParams) c1099b).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1099b).leftMargin + ((ViewGroup.MarginLayoutParams) c1099b).rightMargin;
        int iM4092o1 = m4092o1(c1099b.f6913e, c1099b.f6914f);
        if (this.f6921p == 1) {
            iM4294z2 = RecyclerView.AbstractC1120m.m4294z(false, iM4092o1, i10, i12, ((ViewGroup.MarginLayoutParams) c1099b).width);
            iM4294z = RecyclerView.AbstractC1120m.m4294z(true, this.f6923r.mo4540l(), this.f7096m, i11, ((ViewGroup.MarginLayoutParams) c1099b).height);
        } else {
            int iM4294z3 = RecyclerView.AbstractC1120m.m4294z(false, iM4092o1, i10, i11, ((ViewGroup.MarginLayoutParams) c1099b).height);
            int iM4294z4 = RecyclerView.AbstractC1120m.m4294z(true, this.f6923r.mo4540l(), this.f7095l, i12, ((ViewGroup.MarginLayoutParams) c1099b).width);
            iM4294z = iM4294z3;
            iM4294z2 = iM4294z4;
        }
        RecyclerView.C1121n c1121n = (RecyclerView.C1121n) view.getLayoutParams();
        if (z10 ? m4300D0(view, iM4294z2, iM4294z, c1121n) : m4297B0(view, iM4294z2, iM4294z, c1121n)) {
            view.measure(iM4294z2, iM4294z);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: t */
    public final RecyclerView.C1121n mo4099t() {
        return this.f6921p == 0 ? new C1099b(-2, -1) : new C1099b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: t0 */
    public final int mo4100t0(int i10, RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x) {
        m4103u1();
        View[] viewArr = this.f6908H;
        if (viewArr == null || viewArr.length != this.f6906F) {
            this.f6908H = new View[this.f6906F];
        }
        return super.mo4100t0(i10, c1127t, c1131x);
    }

    /* JADX INFO: renamed from: t1 */
    public final void m4101t1(int i10) {
        if (i10 == this.f6906F) {
            return;
        }
        this.f6905E = true;
        if (i10 < 1) {
            throw new IllegalArgumentException(C0166e.m761g("Span count should be at least 1. Provided ", i10));
        }
        this.f6906F = i10;
        this.f6911K.m4108b();
        m4322s0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: u */
    public final RecyclerView.C1121n mo4102u(Context context, AttributeSet attributeSet) {
        return new C1099b(context, attributeSet);
    }

    /* JADX INFO: renamed from: u1 */
    public final void m4103u1() {
        int iM4301F;
        int iM4305I;
        if (this.f6921p == 1) {
            iM4301F = this.f7097n - m4304H();
            iM4305I = m4303G();
        } else {
            iM4301F = this.f7098o - m4301F();
            iM4305I = m4305I();
        }
        m4091n1(iM4301F - iM4305I);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: v */
    public final RecyclerView.C1121n mo4104v(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1099b((ViewGroup.MarginLayoutParams) layoutParams) : new C1099b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: v0 */
    public final int mo4105v0(int i10, RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x) {
        m4103u1();
        View[] viewArr = this.f6908H;
        if (viewArr == null || viewArr.length != this.f6906F) {
            this.f6908H = new View[this.f6906F];
        }
        return super.mo4105v0(i10, c1127t, c1131x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: y0 */
    public final void mo4106y0(Rect rect, int i10, int i11) {
        int iM4292i;
        int iM4292i2;
        if (this.f6907G == null) {
            super.mo4106y0(rect, i10, i11);
        }
        int iM4304H = m4304H() + m4303G();
        int iM4301F = m4301F() + m4305I();
        if (this.f6921p == 1) {
            int iHeight = rect.height() + iM4301F;
            RecyclerView recyclerView = this.f7085b;
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            iM4292i2 = RecyclerView.AbstractC1120m.m4292i(i11, iHeight, C10029b0.d.m18667d(recyclerView));
            int[] iArr = this.f6907G;
            iM4292i = RecyclerView.AbstractC1120m.m4292i(i10, iArr[iArr.length - 1] + iM4304H, C10029b0.d.m18668e(this.f7085b));
        } else {
            int iWidth = rect.width() + iM4304H;
            RecyclerView recyclerView2 = this.f7085b;
            WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
            iM4292i = RecyclerView.AbstractC1120m.m4292i(i10, iWidth, C10029b0.d.m18668e(recyclerView2));
            int[] iArr2 = this.f6907G;
            iM4292i2 = RecyclerView.AbstractC1120m.m4292i(i11, iArr2[iArr2.length - 1] + iM4301F, C10029b0.d.m18667d(this.f7085b));
        }
        this.f7085b.setMeasuredDimension(iM4292i, iM4292i2);
    }
}
