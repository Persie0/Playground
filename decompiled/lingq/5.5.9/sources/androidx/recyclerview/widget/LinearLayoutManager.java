package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.AbstractC1120m implements C1165p.g, RecyclerView.AbstractC1130w.b {

    /* JADX INFO: renamed from: A */
    public final C1102a f6917A;

    /* JADX INFO: renamed from: B */
    public final C1103b f6918B;

    /* JADX INFO: renamed from: C */
    public final int f6919C;

    /* JADX INFO: renamed from: D */
    public final int[] f6920D;

    /* JADX INFO: renamed from: p */
    public int f6921p;

    /* JADX INFO: renamed from: q */
    public C1104c f6922q;

    /* JADX INFO: renamed from: r */
    public AbstractC1175z f6923r;

    /* JADX INFO: renamed from: s */
    public boolean f6924s;

    /* JADX INFO: renamed from: t */
    public boolean f6925t;

    /* JADX INFO: renamed from: u */
    public boolean f6926u;

    /* JADX INFO: renamed from: v */
    public boolean f6927v;

    /* JADX INFO: renamed from: w */
    public final boolean f6928w;

    /* JADX INFO: renamed from: x */
    public int f6929x;

    /* JADX INFO: renamed from: y */
    public int f6930y;

    /* JADX INFO: renamed from: z */
    public SavedState f6931z;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1101a();

        /* JADX INFO: renamed from: a */
        public int f6932a;

        /* JADX INFO: renamed from: b */
        public int f6933b;

        /* JADX INFO: renamed from: c */
        public boolean f6934c;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$a */
        public class C1101a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f6932a = parcel.readInt();
            this.f6933b = parcel.readInt();
            boolean z10 = true;
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            this.f6934c = z10;
        }

        @SuppressLint({"UnknownNullness"})
        public SavedState(SavedState savedState) {
            this.f6932a = savedState.f6932a;
            this.f6933b = savedState.f6933b;
            this.f6934c = savedState.f6934c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f6932a);
            parcel.writeInt(this.f6933b);
            parcel.writeInt(this.f6934c ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    public static class C1102a {

        /* JADX INFO: renamed from: a */
        public AbstractC1175z f6935a;

        /* JADX INFO: renamed from: b */
        public int f6936b;

        /* JADX INFO: renamed from: c */
        public int f6937c;

        /* JADX INFO: renamed from: d */
        public boolean f6938d;

        /* JADX INFO: renamed from: e */
        public boolean f6939e;

        public C1102a() {
            m4157d();
        }

        /* JADX INFO: renamed from: a */
        public final void m4154a() {
            this.f6937c = this.f6938d ? this.f6935a.mo4535g() : this.f6935a.mo4539k();
        }

        /* JADX INFO: renamed from: b */
        public final void m4155b(View view, int i10) {
            if (this.f6938d) {
                int iMo4530b = this.f6935a.mo4530b(view);
                AbstractC1175z abstractC1175z = this.f6935a;
                this.f6937c = (Integer.MIN_VALUE == abstractC1175z.f7475b ? 0 : abstractC1175z.mo4540l() - abstractC1175z.f7475b) + iMo4530b;
            } else {
                this.f6937c = this.f6935a.mo4533e(view);
            }
            this.f6936b = i10;
        }

        /* JADX INFO: renamed from: c */
        public final void m4156c(View view, int i10) {
            AbstractC1175z abstractC1175z = this.f6935a;
            int iMo4540l = Integer.MIN_VALUE == abstractC1175z.f7475b ? 0 : abstractC1175z.mo4540l() - abstractC1175z.f7475b;
            if (iMo4540l >= 0) {
                m4155b(view, i10);
                return;
            }
            this.f6936b = i10;
            if (this.f6938d) {
                int iMo4535g = (this.f6935a.mo4535g() - iMo4540l) - this.f6935a.mo4530b(view);
                this.f6937c = this.f6935a.mo4535g() - iMo4535g;
                if (iMo4535g > 0) {
                    int iMo4531c = this.f6937c - this.f6935a.mo4531c(view);
                    int iMo4539k = this.f6935a.mo4539k();
                    int iMin = iMo4531c - (Math.min(this.f6935a.mo4533e(view) - iMo4539k, 0) + iMo4539k);
                    if (iMin < 0) {
                        this.f6937c = Math.min(iMo4535g, -iMin) + this.f6937c;
                    }
                }
            } else {
                int iMo4533e = this.f6935a.mo4533e(view);
                int iMo4539k2 = iMo4533e - this.f6935a.mo4539k();
                this.f6937c = iMo4533e;
                if (iMo4539k2 > 0) {
                    int iMo4535g2 = (this.f6935a.mo4535g() - Math.min(0, (this.f6935a.mo4535g() - iMo4540l) - this.f6935a.mo4530b(view))) - (this.f6935a.mo4531c(view) + iMo4533e);
                    if (iMo4535g2 < 0) {
                        this.f6937c -= Math.min(iMo4539k2, -iMo4535g2);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m4157d() {
            this.f6936b = -1;
            this.f6937c = Integer.MIN_VALUE;
            this.f6938d = false;
            this.f6939e = false;
        }

        public final String toString() {
            return "AnchorInfo{mPosition=" + this.f6936b + ", mCoordinate=" + this.f6937c + ", mLayoutFromEnd=" + this.f6938d + ", mValid=" + this.f6939e + '}';
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    public static class C1103b {

        /* JADX INFO: renamed from: a */
        public int f6940a;

        /* JADX INFO: renamed from: b */
        public boolean f6941b;

        /* JADX INFO: renamed from: c */
        public boolean f6942c;

        /* JADX INFO: renamed from: d */
        public boolean f6943d;
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    public static class C1104c {

        /* JADX INFO: renamed from: b */
        public int f6945b;

        /* JADX INFO: renamed from: c */
        public int f6946c;

        /* JADX INFO: renamed from: d */
        public int f6947d;

        /* JADX INFO: renamed from: e */
        public int f6948e;

        /* JADX INFO: renamed from: f */
        public int f6949f;

        /* JADX INFO: renamed from: g */
        public int f6950g;

        /* JADX INFO: renamed from: j */
        public int f6953j;

        /* JADX INFO: renamed from: l */
        public boolean f6955l;

        /* JADX INFO: renamed from: a */
        public boolean f6944a = true;

        /* JADX INFO: renamed from: h */
        public int f6951h = 0;

        /* JADX INFO: renamed from: i */
        public int f6952i = 0;

        /* JADX INFO: renamed from: k */
        public List<RecyclerView.AbstractC1109b0> f6954k = null;

        /* JADX INFO: renamed from: a */
        public final void m4158a(View view) {
            int iM4333a;
            int size = this.f6954k.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f6954k.get(i11).f7054a;
                RecyclerView.C1121n c1121n = (RecyclerView.C1121n) view3.getLayoutParams();
                if (view3 != view && !c1121n.m4335c() && (iM4333a = (c1121n.m4333a() - this.f6947d) * this.f6948e) >= 0 && iM4333a < i10) {
                    view2 = view3;
                    if (iM4333a == 0) {
                        break;
                    } else {
                        i10 = iM4333a;
                    }
                }
            }
            if (view2 == null) {
                this.f6947d = -1;
            } else {
                this.f6947d = ((RecyclerView.C1121n) view2.getLayoutParams()).m4333a();
            }
        }

        /* JADX INFO: renamed from: b */
        public final View m4159b(RecyclerView.C1127t c1127t) {
            List<RecyclerView.AbstractC1109b0> list = this.f6954k;
            if (list == null) {
                View viewM4345d = c1127t.m4345d(this.f6947d);
                this.f6947d += this.f6948e;
                return viewM4345d;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = this.f6954k.get(i10).f7054a;
                RecyclerView.C1121n c1121n = (RecyclerView.C1121n) view.getLayoutParams();
                if (!c1121n.m4335c() && this.f6947d == c1121n.m4333a()) {
                    m4158a(view);
                    return view;
                }
            }
            return null;
        }
    }

    public LinearLayoutManager() {
        this(1);
    }

    public LinearLayoutManager(int i10) {
        this.f6921p = 1;
        this.f6925t = false;
        this.f6926u = false;
        this.f6927v = false;
        this.f6928w = true;
        this.f6929x = -1;
        this.f6930y = Integer.MIN_VALUE;
        this.f6931z = null;
        this.f6917A = new C1102a();
        this.f6918B = new C1103b();
        this.f6919C = 2;
        this.f6920D = new int[2];
        m4143i1(i10);
        mo4134d(null);
        if (this.f6925t) {
            this.f6925t = false;
            m4322s0();
        }
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f6921p = 1;
        this.f6925t = false;
        this.f6926u = false;
        this.f6927v = false;
        this.f6928w = true;
        this.f6929x = -1;
        this.f6930y = Integer.MIN_VALUE;
        this.f6931z = null;
        this.f6917A = new C1102a();
        this.f6918B = new C1103b();
        this.f6919C = 2;
        this.f6920D = new int[2];
        RecyclerView.AbstractC1120m.d dVarM4287K = RecyclerView.AbstractC1120m.m4287K(context, attributeSet, i10, i11);
        m4143i1(dVarM4287K.f7101a);
        boolean z10 = dVarM4287K.f7103c;
        mo4134d(null);
        if (z10 != this.f6925t) {
            this.f6925t = z10;
            m4322s0();
        }
        mo4088j1(dVarM4287K.f7104d);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: C0 */
    public final boolean mo4109C0() {
        boolean z10;
        if (this.f7096m == 1073741824 || this.f7095l == 1073741824) {
            return false;
        }
        int iM4326y = m4326y();
        for (int i10 = 0; i10 < iM4326y; i10++) {
            ViewGroup.LayoutParams layoutParams = m4324x(i10).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                z10 = true;
                if (z10) {
                    return true;
                }
                return false;
            }
        }
        z10 = false;
        if (z10) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: E0 */
    public void mo4110E0(RecyclerView recyclerView, int i10) {
        C1169t c1169t = new C1169t(recyclerView.getContext());
        c1169t.f7125a = i10;
        m4302F0(c1169t);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: G0 */
    public boolean mo4071G0() {
        return this.f6931z == null && this.f6924s == this.f6927v;
    }

    /* JADX INFO: renamed from: H0 */
    public void mo4111H0(RecyclerView.C1131x c1131x, int[] iArr) {
        int i10;
        int iMo4540l = c1131x.f7140a != -1 ? this.f6923r.mo4540l() : 0;
        if (this.f6922q.f6949f == -1) {
            i10 = 0;
        } else {
            i10 = iMo4540l;
            iMo4540l = 0;
        }
        iArr[0] = iMo4540l;
        iArr[1] = i10;
    }

    /* JADX INFO: renamed from: I0 */
    public void mo4072I0(RecyclerView.C1131x c1131x, C1104c c1104c, RecyclerView.AbstractC1120m.c cVar) {
        int i10 = c1104c.f6947d;
        if (i10 < 0 || i10 >= c1131x.m4364b()) {
            return;
        }
        ((RunnableC1164o.b) cVar).m4505a(i10, Math.max(0, c1104c.f6950g));
    }

    /* JADX INFO: renamed from: J0 */
    public final int m4112J0(RecyclerView.C1131x c1131x) {
        if (m4326y() == 0) {
            return 0;
        }
        m4116N0();
        AbstractC1175z abstractC1175z = this.f6923r;
        boolean z10 = !this.f6928w;
        return C1151f0.m4474a(c1131x, abstractC1175z, m4120Q0(z10), m4119P0(z10), this, this.f6928w);
    }

    /* JADX INFO: renamed from: K0 */
    public final int m4113K0(RecyclerView.C1131x c1131x) {
        if (m4326y() == 0) {
            return 0;
        }
        m4116N0();
        AbstractC1175z abstractC1175z = this.f6923r;
        boolean z10 = !this.f6928w;
        return C1151f0.m4475b(c1131x, abstractC1175z, m4120Q0(z10), m4119P0(z10), this, this.f6928w, this.f6926u);
    }

    /* JADX INFO: renamed from: L0 */
    public final int m4114L0(RecyclerView.C1131x c1131x) {
        if (m4326y() == 0) {
            return 0;
        }
        m4116N0();
        AbstractC1175z abstractC1175z = this.f6923r;
        boolean z10 = !this.f6928w;
        return C1151f0.m4476c(c1131x, abstractC1175z, m4120Q0(z10), m4119P0(z10), this, this.f6928w);
    }

    /* JADX INFO: renamed from: M0 */
    public final int m4115M0(int i10) {
        if (i10 == 1) {
            if (this.f6921p != 1 && m4132a1()) {
                return 1;
            }
            return -1;
        }
        if (i10 == 2) {
            return (this.f6921p != 1 && m4132a1()) ? -1 : 1;
        }
        if (i10 == 17) {
            return this.f6921p == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return this.f6921p == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 66) {
            return this.f6921p == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i10 == 130 && this.f6921p == 1) {
            return 1;
        }
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: N0 */
    public final void m4116N0() {
        if (this.f6922q == null) {
            this.f6922q = new C1104c();
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final int m4117O0(RecyclerView.C1127t c1127t, C1104c c1104c, RecyclerView.C1131x c1131x, boolean z10) {
        int i10 = c1104c.f6946c;
        int i11 = c1104c.f6950g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                c1104c.f6950g = i11 + i10;
            }
            m4135d1(c1127t, c1104c);
        }
        int i12 = c1104c.f6946c + c1104c.f6951h;
        while (true) {
            if (!c1104c.f6955l && i12 <= 0) {
                break;
            }
            int i13 = c1104c.f6947d;
            if (!(i13 >= 0 && i13 < c1131x.m4364b())) {
                break;
            }
            C1103b c1103b = this.f6918B;
            c1103b.f6940a = 0;
            c1103b.f6941b = false;
            c1103b.f6942c = false;
            c1103b.f6943d = false;
            mo4079b1(c1127t, c1131x, c1104c, c1103b);
            if (!c1103b.f6941b) {
                int i14 = c1104c.f6945b;
                int i15 = c1103b.f6940a;
                c1104c.f6945b = (c1104c.f6949f * i15) + i14;
                if (!c1103b.f6942c || c1104c.f6954k != null || !c1131x.f7146g) {
                    c1104c.f6946c -= i15;
                    i12 -= i15;
                }
                int i16 = c1104c.f6950g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + i15;
                    c1104c.f6950g = i17;
                    int i18 = c1104c.f6946c;
                    if (i18 < 0) {
                        c1104c.f6950g = i17 + i18;
                    }
                    m4135d1(c1127t, c1104c);
                }
                if (z10 && c1103b.f6943d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - c1104c.f6946c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: P */
    public final boolean mo4118P() {
        return true;
    }

    /* JADX INFO: renamed from: P0 */
    public final View m4119P0(boolean z10) {
        return this.f6926u ? m4124U0(0, m4326y(), z10, true) : m4124U0(m4326y() - 1, -1, z10, true);
    }

    /* JADX INFO: renamed from: Q0 */
    public final View m4120Q0(boolean z10) {
        return this.f6926u ? m4124U0(m4326y() - 1, -1, z10, true) : m4124U0(0, m4326y(), z10, true);
    }

    /* JADX INFO: renamed from: R0 */
    public final int m4121R0() {
        View viewM4124U0 = m4124U0(0, m4326y(), false, true);
        if (viewM4124U0 == null) {
            return -1;
        }
        return RecyclerView.AbstractC1120m.m4286J(viewM4124U0);
    }

    /* JADX INFO: renamed from: S0 */
    public final int m4122S0() {
        View viewM4124U0 = m4124U0(m4326y() - 1, -1, false, true);
        if (viewM4124U0 == null) {
            return -1;
        }
        return RecyclerView.AbstractC1120m.m4286J(viewM4124U0);
    }

    /* JADX INFO: renamed from: T0 */
    public final View m4123T0(int i10, int i11) {
        byte b10;
        int i12;
        int i13;
        m4116N0();
        if (i11 > i10) {
            b10 = 1;
        } else {
            b10 = i11 < i10 ? (byte) -1 : (byte) 0;
        }
        if (b10 == 0) {
            return m4324x(i10);
        }
        if (this.f6923r.mo4533e(m4324x(i10)) < this.f6923r.mo4539k()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.f6921p == 0 ? this.f7086c.m4488a(i10, i11, i12, i13) : this.f7087d.m4488a(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: U0 */
    public final View m4124U0(int i10, int i11, boolean z10, boolean z11) {
        m4116N0();
        int i12 = 320;
        int i13 = z10 ? 24579 : 320;
        if (!z11) {
            i12 = 0;
        }
        return this.f6921p == 0 ? this.f7086c.m4488a(i10, i11, i13, i12) : this.f7087d.m4488a(i10, i11, i13, i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: V */
    public final void mo4125V(RecyclerView recyclerView) {
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX INFO: renamed from: V0 */
    public View mo4074V0(RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x, boolean z10, boolean z11) {
        int i10;
        int iM4326y;
        int i11;
        m4116N0();
        int iM4326y2 = m4326y();
        if (z11) {
            iM4326y = m4326y() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iM4326y2;
            iM4326y = 0;
            i11 = 1;
        }
        int iM4364b = c1131x.m4364b();
        int iMo4539k = this.f6923r.mo4539k();
        int iMo4535g = this.f6923r.mo4535g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iM4326y != i10) {
            View viewM4324x = m4324x(iM4326y);
            int iM4286J = RecyclerView.AbstractC1120m.m4286J(viewM4324x);
            int iMo4533e = this.f6923r.mo4533e(viewM4324x);
            int iMo4530b = this.f6923r.mo4530b(viewM4324x);
            if (iM4286J >= 0 && iM4286J < iM4364b) {
                if (!((RecyclerView.C1121n) viewM4324x.getLayoutParams()).m4335c()) {
                    boolean z12 = iMo4530b <= iMo4539k && iMo4533e < iMo4539k;
                    boolean z13 = iMo4533e >= iMo4535g && iMo4530b > iMo4535g;
                    if (!z12 && !z13) {
                        return viewM4324x;
                    }
                    if (z10) {
                        if (z13) {
                            view2 = viewM4324x;
                        } else if (view == null) {
                            view = viewM4324x;
                        }
                    } else if (z12) {
                        view2 = viewM4324x;
                    } else if (view == null) {
                        view = viewM4324x;
                    }
                } else if (view3 == null) {
                    view3 = viewM4324x;
                }
            }
            iM4326y += i11;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: W */
    public View mo4075W(View view, int i10, RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x) {
        int iM4115M0;
        View viewM4123T0;
        m4138f1();
        if (m4326y() != 0 && (iM4115M0 = m4115M0(i10)) != Integer.MIN_VALUE) {
            m4116N0();
            m4147k1(iM4115M0, (int) (this.f6923r.mo4540l() * 0.33333334f), false, c1131x);
            C1104c c1104c = this.f6922q;
            c1104c.f6950g = Integer.MIN_VALUE;
            c1104c.f6944a = false;
            m4117O0(c1127t, c1104c, c1131x, true);
            if (iM4115M0 == -1) {
                viewM4123T0 = this.f6926u ? m4123T0(m4326y() - 1, -1) : m4123T0(0, m4326y());
            } else {
                viewM4123T0 = this.f6926u ? m4123T0(0, m4326y()) : m4123T0(m4326y() - 1, -1);
            }
            View viewM4130Z0 = iM4115M0 == -1 ? m4130Z0() : m4129Y0();
            if (!viewM4130Z0.hasFocusable()) {
                return viewM4123T0;
            }
            if (viewM4123T0 == null) {
                return null;
            }
            return viewM4130Z0;
        }
        return null;
    }

    /* JADX INFO: renamed from: W0 */
    public final int m4126W0(int i10, RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x, boolean z10) {
        int iMo4535g;
        int iMo4535g2 = this.f6923r.mo4535g() - i10;
        if (iMo4535g2 <= 0) {
            return 0;
        }
        int i11 = -m4140g1(-iMo4535g2, c1127t, c1131x);
        int i12 = i10 + i11;
        if (!z10 || (iMo4535g = this.f6923r.mo4535g() - i12) <= 0) {
            return i11;
        }
        this.f6923r.mo4543o(iMo4535g);
        return iMo4535g + i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: X */
    public final void mo4127X(AccessibilityEvent accessibilityEvent) {
        super.mo4127X(accessibilityEvent);
        if (m4326y() > 0) {
            accessibilityEvent.setFromIndex(m4121R0());
            accessibilityEvent.setToIndex(m4122S0());
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final int m4128X0(int i10, RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x, boolean z10) {
        int iMo4539k;
        int iMo4539k2 = i10 - this.f6923r.mo4539k();
        if (iMo4539k2 <= 0) {
            return 0;
        }
        int i11 = -m4140g1(iMo4539k2, c1127t, c1131x);
        int i12 = i10 + i11;
        if (z10 && (iMo4539k = i12 - this.f6923r.mo4539k()) > 0) {
            this.f6923r.mo4543o(-iMo4539k);
            i11 -= iMo4539k;
        }
        return i11;
    }

    /* JADX INFO: renamed from: Y0 */
    public final View m4129Y0() {
        return m4324x(this.f6926u ? 0 : m4326y() - 1);
    }

    /* JADX INFO: renamed from: Z0 */
    public final View m4130Z0() {
        return m4324x(this.f6926u ? m4326y() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1130w.b
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: a */
    public final PointF mo4131a(int i10) {
        if (m4326y() == 0) {
            return null;
        }
        int i11 = (i10 < RecyclerView.AbstractC1120m.m4286J(m4324x(0))) != this.f6926u ? -1 : 1;
        return this.f6921p == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    /* JADX INFO: renamed from: a1 */
    public final boolean m4132a1() {
        return m4299D() == 1;
    }

    @Override // androidx.recyclerview.widget.C1165p.g
    /* JADX INFO: renamed from: b */
    public final void mo4133b(View view, View view2) {
        mo4134d("Cannot drop a view during a scroll or layout calculation");
        m4116N0();
        m4138f1();
        int iM4286J = RecyclerView.AbstractC1120m.m4286J(view);
        int iM4286J2 = RecyclerView.AbstractC1120m.m4286J(view2);
        byte b10 = iM4286J < iM4286J2 ? (byte) 1 : (byte) -1;
        if (this.f6926u) {
            if (b10 == 1) {
                m4141h1(iM4286J2, this.f6923r.mo4535g() - (this.f6923r.mo4531c(view) + this.f6923r.mo4533e(view2)));
                return;
            } else {
                m4141h1(iM4286J2, this.f6923r.mo4535g() - this.f6923r.mo4530b(view2));
                return;
            }
        }
        if (b10 == -1) {
            m4141h1(iM4286J2, this.f6923r.mo4533e(view2));
        } else {
            m4141h1(iM4286J2, this.f6923r.mo4530b(view2) - this.f6923r.mo4531c(view));
        }
    }

    /* JADX INFO: renamed from: b1 */
    public void mo4079b1(RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x, C1104c c1104c, C1103b c1103b) {
        int iM4303G;
        int i10;
        int i11;
        int iMo4532d;
        View viewM4159b = c1104c.m4159b(c1127t);
        if (viewM4159b == null) {
            c1103b.f6941b = true;
            return;
        }
        RecyclerView.C1121n c1121n = (RecyclerView.C1121n) viewM4159b.getLayoutParams();
        if (c1104c.f6954k == null) {
            if (this.f6926u == (c1104c.f6949f == -1)) {
                m4311c(viewM4159b, -1, false);
            } else {
                m4311c(viewM4159b, 0, false);
            }
        } else {
            if (this.f6926u == (c1104c.f6949f == -1)) {
                m4311c(viewM4159b, -1, true);
            } else {
                m4311c(viewM4159b, 0, true);
            }
        }
        RecyclerView.C1121n c1121n2 = (RecyclerView.C1121n) viewM4159b.getLayoutParams();
        Rect rectM4179M = this.f7085b.m4179M(viewM4159b);
        int i12 = rectM4179M.left + rectM4179M.right + 0;
        int i13 = rectM4179M.top + rectM4179M.bottom + 0;
        int iM4294z = RecyclerView.AbstractC1120m.m4294z(mo4137f(), this.f7097n, this.f7095l, m4304H() + m4303G() + ((ViewGroup.MarginLayoutParams) c1121n2).leftMargin + ((ViewGroup.MarginLayoutParams) c1121n2).rightMargin + i12, ((ViewGroup.MarginLayoutParams) c1121n2).width);
        int iM4294z2 = RecyclerView.AbstractC1120m.m4294z(mo4139g(), this.f7098o, this.f7096m, m4301F() + m4305I() + ((ViewGroup.MarginLayoutParams) c1121n2).topMargin + ((ViewGroup.MarginLayoutParams) c1121n2).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) c1121n2).height);
        if (m4297B0(viewM4159b, iM4294z, iM4294z2, c1121n2)) {
            viewM4159b.measure(iM4294z, iM4294z2);
        }
        c1103b.f6940a = this.f6923r.mo4531c(viewM4159b);
        if (this.f6921p == 1) {
            if (m4132a1()) {
                iMo4532d = this.f7097n - m4304H();
                iM4303G = iMo4532d - this.f6923r.mo4532d(viewM4159b);
            } else {
                iM4303G = m4303G();
                iMo4532d = this.f6923r.mo4532d(viewM4159b) + iM4303G;
            }
            if (c1104c.f6949f == -1) {
                i10 = c1104c.f6945b;
                i11 = i10 - c1103b.f6940a;
            } else {
                i11 = c1104c.f6945b;
                i10 = c1103b.f6940a + i11;
            }
        } else {
            int iM4305I = m4305I();
            int iMo4532d2 = this.f6923r.mo4532d(viewM4159b) + iM4305I;
            if (c1104c.f6949f == -1) {
                int i14 = c1104c.f6945b;
                int i15 = i14 - c1103b.f6940a;
                iMo4532d = i14;
                i10 = iMo4532d2;
                iM4303G = i15;
                i11 = iM4305I;
            } else {
                int i16 = c1104c.f6945b;
                int i17 = c1103b.f6940a + i16;
                iM4303G = i16;
                i10 = iMo4532d2;
                i11 = iM4305I;
                iMo4532d = i17;
            }
        }
        RecyclerView.AbstractC1120m.m4291R(viewM4159b, iM4303G, i11, iMo4532d, i10);
        if (c1121n.m4335c() || c1121n.m4334b()) {
            c1103b.f6942c = true;
        }
        c1103b.f6943d = viewM4159b.hasFocusable();
    }

    /* JADX INFO: renamed from: c1 */
    public void mo4081c1(RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x, C1102a c1102a, int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: d */
    public final void mo4134d(String str) {
        if (this.f6931z == null) {
            super.mo4134d(str);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final void m4135d1(RecyclerView.C1127t c1127t, C1104c c1104c) {
        int i10;
        int i11;
        if (!c1104c.f6944a || c1104c.f6955l) {
            return;
        }
        int i12 = c1104c.f6950g;
        int i13 = c1104c.f6952i;
        if (c1104c.f6949f == -1) {
            int iM4326y = m4326y();
            if (i12 < 0) {
                return;
            }
            int iMo4534f = (this.f6923r.mo4534f() - i12) + i13;
            if (this.f6926u) {
                for (0; i11 < iM4326y; i11 + 1) {
                    View viewM4324x = m4324x(i11);
                    i11 = (this.f6923r.mo4533e(viewM4324x) >= iMo4534f && this.f6923r.mo4542n(viewM4324x) >= iMo4534f) ? i11 + 1 : 0;
                    m4136e1(c1127t, 0, i11);
                    return;
                }
                return;
            }
            int i14 = iM4326y - 1;
            for (int i15 = i14; i15 >= 0; i15--) {
                View viewM4324x2 = m4324x(i15);
                if (this.f6923r.mo4533e(viewM4324x2) < iMo4534f || this.f6923r.mo4542n(viewM4324x2) < iMo4534f) {
                    m4136e1(c1127t, i14, i15);
                    return;
                }
            }
            return;
        }
        if (i12 < 0) {
            return;
        }
        int i16 = i12 - i13;
        int iM4326y2 = m4326y();
        if (!this.f6926u) {
            for (0; i10 < iM4326y2; i10 + 1) {
                View viewM4324x3 = m4324x(i10);
                i10 = (this.f6923r.mo4530b(viewM4324x3) <= i16 && this.f6923r.mo4541m(viewM4324x3) <= i16) ? i10 + 1 : 0;
                m4136e1(c1127t, 0, i10);
                return;
            }
            return;
        }
        int i17 = iM4326y2 - 1;
        for (int i18 = i17; i18 >= 0; i18--) {
            View viewM4324x4 = m4324x(i18);
            if (this.f6923r.mo4530b(viewM4324x4) > i16 || this.f6923r.mo4541m(viewM4324x4) > i16) {
                m4136e1(c1127t, i17, i18);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final void m4136e1(RecyclerView.C1127t c1127t, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                m4318p0(i10, c1127t);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                m4318p0(i12, c1127t);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: f */
    public final boolean mo4137f() {
        return this.f6921p == 0;
    }

    /* JADX INFO: renamed from: f1 */
    public final void m4138f1() {
        if (this.f6921p != 1 && m4132a1()) {
            this.f6926u = !this.f6925t;
            return;
        }
        this.f6926u = this.f6925t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: g */
    public final boolean mo4139g() {
        return this.f6921p == 1;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:137:0x021e  */
    /* JADX WARN: Code duplicated, block: B:141:0x0225  */
    /* JADX WARN: Code duplicated, block: B:144:0x022a  */
    /* JADX WARN: Code duplicated, block: B:146:0x022e  */
    /* JADX WARN: Code duplicated, block: B:149:0x0233  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00db  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:68:0x0103  */
    /* JADX WARN: Code duplicated, block: B:69:0x010f  */
    /* JADX WARN: Code duplicated, block: B:71:0x011e  */
    /* JADX WARN: Code duplicated, block: B:72:0x012a  */
    /* JADX WARN: Code duplicated, block: B:74:0x012e  */
    /* JADX WARN: Code duplicated, block: B:76:0x013a  */
    /* JADX WARN: Code duplicated, block: B:77:0x013c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0145  */
    /* JADX WARN: Code duplicated, block: B:81:0x014e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0154  */
    /* JADX WARN: Code duplicated, block: B:85:0x0160  */
    /* JADX WARN: Code duplicated, block: B:86:0x0162  */
    /* JADX WARN: Code duplicated, block: B:89:0x0167  */
    /* JADX WARN: Code duplicated, block: B:90:0x0169  */
    /* JADX WARN: Code duplicated, block: B:93:0x0170  */
    /* JADX WARN: Code duplicated, block: B:95:0x0176  */
    /* JADX WARN: Code duplicated, block: B:96:0x0182  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: g0 */
    public void mo4085g0(RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x) {
        View focusedChild;
        boolean z10;
        boolean z11;
        View focusedChild2;
        boolean z12;
        boolean z13;
        View viewMo4074V0;
        int iMo4533e;
        int iMo4530b;
        int iMo4539k;
        int iMo4535g;
        boolean z14;
        boolean z15;
        int i10;
        boolean z16;
        View viewMo4152s;
        boolean z17;
        boolean z18;
        int iMo4533e2;
        AbstractC1175z abstractC1175z;
        int iMo4540l;
        int i11;
        int i12;
        ?? r10;
        List<RecyclerView.AbstractC1109b0> list;
        int i13;
        int i14;
        int iM4126W0;
        int i15;
        View viewMo4152s2;
        int iMo4533e3;
        int iMo4535g2;
        if (!(this.f6931z == null && this.f6929x == -1) && c1131x.m4364b() == 0) {
            m4315m0(c1127t);
            return;
        }
        SavedState savedState = this.f6931z;
        boolean z19 = false;
        if (savedState != null) {
            int i16 = savedState.f6932a;
            if (i16 >= 0) {
                this.f6929x = i16;
            }
        }
        m4116N0();
        this.f6922q.f6944a = false;
        m4138f1();
        RecyclerView recyclerView = this.f7085b;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f7084a.m4464j(focusedChild)) {
            focusedChild = null;
        }
        C1102a c1102a = this.f6917A;
        if (!c1102a.f6939e || this.f6929x != -1 || this.f6931z != null) {
            c1102a.m4157d();
            c1102a.f6938d = this.f6926u ^ this.f6927v;
            if (c1131x.f7146g || (i10 = this.f6929x) == -1) {
                z10 = false;
            } else if (i10 < 0 || i10 >= c1131x.m4364b()) {
                this.f6929x = -1;
                this.f6930y = Integer.MIN_VALUE;
                z10 = false;
            } else {
                int i17 = this.f6929x;
                c1102a.f6936b = i17;
                SavedState savedState2 = this.f6931z;
                if (savedState2 != null) {
                    if (savedState2.f6932a >= 0) {
                        boolean z20 = savedState2.f6934c;
                        c1102a.f6938d = z20;
                        if (z20) {
                            c1102a.f6937c = this.f6923r.mo4535g() - this.f6931z.f6933b;
                        } else {
                            c1102a.f6937c = this.f6923r.mo4539k() + this.f6931z.f6933b;
                        }
                    } else if (this.f6930y == Integer.MIN_VALUE) {
                        viewMo4152s = mo4152s(i17);
                        if (viewMo4152s != null) {
                            if (m4326y() > 0) {
                                if (this.f6929x < RecyclerView.AbstractC1120m.m4286J(m4324x(0))) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if (z17 == this.f6926u) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                c1102a.f6938d = z18;
                            }
                            c1102a.m4154a();
                        } else if (this.f6923r.mo4531c(viewMo4152s) > this.f6923r.mo4540l()) {
                            c1102a.m4154a();
                        } else if (this.f6923r.mo4533e(viewMo4152s) - this.f6923r.mo4539k() < 0) {
                            c1102a.f6937c = this.f6923r.mo4539k();
                            c1102a.f6938d = false;
                        } else if (this.f6923r.mo4535g() - this.f6923r.mo4530b(viewMo4152s) < 0) {
                            c1102a.f6937c = this.f6923r.mo4535g();
                            c1102a.f6938d = true;
                        } else {
                            if (c1102a.f6938d) {
                                int iMo4530b2 = this.f6923r.mo4530b(viewMo4152s);
                                abstractC1175z = this.f6923r;
                                if (Integer.MIN_VALUE == abstractC1175z.f7475b) {
                                    iMo4540l = 0;
                                } else {
                                    iMo4540l = abstractC1175z.mo4540l() - abstractC1175z.f7475b;
                                }
                                iMo4533e2 = iMo4540l + iMo4530b2;
                            } else {
                                iMo4533e2 = this.f6923r.mo4533e(viewMo4152s);
                            }
                            c1102a.f6937c = iMo4533e2;
                        }
                    } else {
                        z16 = this.f6926u;
                        c1102a.f6938d = z16;
                        if (z16) {
                            c1102a.f6937c = this.f6923r.mo4535g() - this.f6930y;
                        } else {
                            c1102a.f6937c = this.f6923r.mo4539k() + this.f6930y;
                        }
                    }
                } else if (this.f6930y == Integer.MIN_VALUE) {
                    viewMo4152s = mo4152s(i17);
                    if (viewMo4152s != null) {
                        if (m4326y() > 0) {
                            if (this.f6929x < RecyclerView.AbstractC1120m.m4286J(m4324x(0))) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (z17 == this.f6926u) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            c1102a.f6938d = z18;
                        }
                        c1102a.m4154a();
                    } else if (this.f6923r.mo4531c(viewMo4152s) > this.f6923r.mo4540l()) {
                        c1102a.m4154a();
                    } else if (this.f6923r.mo4533e(viewMo4152s) - this.f6923r.mo4539k() < 0) {
                        c1102a.f6937c = this.f6923r.mo4539k();
                        c1102a.f6938d = false;
                    } else if (this.f6923r.mo4535g() - this.f6923r.mo4530b(viewMo4152s) < 0) {
                        c1102a.f6937c = this.f6923r.mo4535g();
                        c1102a.f6938d = true;
                    } else {
                        if (c1102a.f6938d) {
                            int iMo4530b3 = this.f6923r.mo4530b(viewMo4152s);
                            abstractC1175z = this.f6923r;
                            if (Integer.MIN_VALUE == abstractC1175z.f7475b) {
                                iMo4540l = 0;
                            } else {
                                iMo4540l = abstractC1175z.mo4540l() - abstractC1175z.f7475b;
                            }
                            iMo4533e2 = iMo4540l + iMo4530b3;
                        } else {
                            iMo4533e2 = this.f6923r.mo4533e(viewMo4152s);
                        }
                        c1102a.f6937c = iMo4533e2;
                    }
                } else {
                    z16 = this.f6926u;
                    c1102a.f6938d = z16;
                    if (z16) {
                        c1102a.f6937c = this.f6923r.mo4535g() - this.f6930y;
                    } else {
                        c1102a.f6937c = this.f6923r.mo4539k() + this.f6930y;
                    }
                }
                z10 = true;
            }
            if (!z10) {
                if (m4326y() != 0) {
                    RecyclerView recyclerView2 = this.f7085b;
                    if (recyclerView2 == null || (focusedChild2 = recyclerView2.getFocusedChild()) == null || this.f7084a.m4464j(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        RecyclerView.C1121n c1121n = (RecyclerView.C1121n) focusedChild2.getLayoutParams();
                        if (!c1121n.m4335c() && c1121n.m4333a() >= 0 && c1121n.m4333a() < c1131x.m4364b()) {
                            c1102a.m4156c(focusedChild2, RecyclerView.AbstractC1120m.m4286J(focusedChild2));
                        } else {
                            z12 = this.f6924s;
                            z13 = this.f6927v;
                            if (z12 == z13 && (viewMo4074V0 = mo4074V0(c1127t, c1131x, c1102a.f6938d, z13)) != null) {
                                c1102a.m4155b(viewMo4074V0, RecyclerView.AbstractC1120m.m4286J(viewMo4074V0));
                                if (!c1131x.f7146g && mo4071G0()) {
                                    iMo4533e = this.f6923r.mo4533e(viewMo4074V0);
                                    iMo4530b = this.f6923r.mo4530b(viewMo4074V0);
                                    iMo4539k = this.f6923r.mo4539k();
                                    iMo4535g = this.f6923r.mo4535g();
                                    if (iMo4530b <= iMo4539k || iMo4533e >= iMo4539k) {
                                        z14 = false;
                                    } else {
                                        z14 = true;
                                    }
                                    if (iMo4533e >= iMo4535g || iMo4530b <= iMo4535g) {
                                        z15 = false;
                                    } else {
                                        z15 = true;
                                    }
                                    if (z14 || z15) {
                                        if (c1102a.f6938d) {
                                            iMo4539k = iMo4535g;
                                        }
                                        c1102a.f6937c = iMo4539k;
                                    }
                                }
                            } else {
                                z11 = false;
                            }
                        }
                        z11 = true;
                    } else {
                        z12 = this.f6924s;
                        z13 = this.f6927v;
                        if (z12 == z13) {
                            c1102a.m4155b(viewMo4074V0, RecyclerView.AbstractC1120m.m4286J(viewMo4074V0));
                            if (!c1131x.f7146g) {
                                iMo4533e = this.f6923r.mo4533e(viewMo4074V0);
                                iMo4530b = this.f6923r.mo4530b(viewMo4074V0);
                                iMo4539k = this.f6923r.mo4539k();
                                iMo4535g = this.f6923r.mo4535g();
                                if (iMo4530b <= iMo4539k) {
                                    z14 = false;
                                } else {
                                    z14 = false;
                                }
                                if (iMo4533e >= iMo4535g) {
                                    z15 = false;
                                } else {
                                    z15 = false;
                                }
                                if (z14) {
                                    if (c1102a.f6938d) {
                                        iMo4539k = iMo4535g;
                                    }
                                    c1102a.f6937c = iMo4539k;
                                } else {
                                    if (c1102a.f6938d) {
                                        iMo4539k = iMo4535g;
                                    }
                                    c1102a.f6937c = iMo4539k;
                                }
                            }
                            z11 = true;
                        }
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
                if (!z11) {
                    c1102a.m4154a();
                    c1102a.f6936b = this.f6927v ? c1131x.m4364b() - 1 : 0;
                }
            }
            c1102a.f6939e = true;
        } else if (focusedChild != null && (this.f6923r.mo4533e(focusedChild) >= this.f6923r.mo4535g() || this.f6923r.mo4530b(focusedChild) <= this.f6923r.mo4539k())) {
            c1102a.m4156c(focusedChild, RecyclerView.AbstractC1120m.m4286J(focusedChild));
        }
        C1104c c1104c = this.f6922q;
        c1104c.f6949f = c1104c.f6953j >= 0 ? 1 : -1;
        int[] iArr = this.f6920D;
        iArr[0] = 0;
        iArr[1] = 0;
        mo4111H0(c1131x, iArr);
        int iMo4539k2 = this.f6923r.mo4539k() + Math.max(0, iArr[0]);
        int iMo4536h = this.f6923r.mo4536h() + Math.max(0, iArr[1]);
        if (c1131x.f7146g && (i15 = this.f6929x) != -1 && this.f6930y != Integer.MIN_VALUE && (viewMo4152s2 = mo4152s(i15)) != null) {
            if (this.f6926u) {
                iMo4535g2 = this.f6923r.mo4535g() - this.f6923r.mo4530b(viewMo4152s2);
                iMo4533e3 = this.f6930y;
            } else {
                iMo4533e3 = this.f6923r.mo4533e(viewMo4152s2) - this.f6923r.mo4539k();
                iMo4535g2 = this.f6930y;
            }
            int i18 = iMo4535g2 - iMo4533e3;
            if (i18 > 0) {
                iMo4539k2 += i18;
            } else {
                iMo4536h -= i18;
            }
        }
        mo4081c1(c1127t, c1131x, c1102a, (!c1102a.f6938d ? this.f6926u : !this.f6926u) ? 1 : -1);
        m4320r(c1127t);
        this.f6922q.f6955l = this.f6923r.mo4537i() == 0 && this.f6923r.mo4534f() == 0;
        this.f6922q.getClass();
        this.f6922q.f6952i = 0;
        if (c1102a.f6938d) {
            m4150m1(c1102a.f6936b, c1102a.f6937c);
            C1104c c1104c2 = this.f6922q;
            c1104c2.f6951h = iMo4539k2;
            m4117O0(c1127t, c1104c2, c1131x, false);
            C1104c c1104c3 = this.f6922q;
            i12 = c1104c3.f6945b;
            int i19 = c1104c3.f6947d;
            int i20 = c1104c3.f6946c;
            if (i20 > 0) {
                iMo4536h += i20;
            }
            m4149l1(c1102a.f6936b, c1102a.f6937c);
            C1104c c1104c4 = this.f6922q;
            c1104c4.f6951h = iMo4536h;
            c1104c4.f6947d += c1104c4.f6948e;
            m4117O0(c1127t, c1104c4, c1131x, false);
            C1104c c1104c5 = this.f6922q;
            i11 = c1104c5.f6945b;
            int i21 = c1104c5.f6946c;
            if (i21 > 0) {
                m4150m1(i19, i12);
                C1104c c1104c6 = this.f6922q;
                c1104c6.f6951h = i21;
                m4117O0(c1127t, c1104c6, c1131x, false);
                i12 = this.f6922q.f6945b;
            }
        } else {
            m4149l1(c1102a.f6936b, c1102a.f6937c);
            C1104c c1104c7 = this.f6922q;
            c1104c7.f6951h = iMo4536h;
            m4117O0(c1127t, c1104c7, c1131x, false);
            C1104c c1104c8 = this.f6922q;
            i11 = c1104c8.f6945b;
            int i22 = c1104c8.f6947d;
            int i23 = c1104c8.f6946c;
            if (i23 > 0) {
                iMo4539k2 += i23;
            }
            m4150m1(c1102a.f6936b, c1102a.f6937c);
            C1104c c1104c9 = this.f6922q;
            c1104c9.f6951h = iMo4539k2;
            c1104c9.f6947d += c1104c9.f6948e;
            m4117O0(c1127t, c1104c9, c1131x, false);
            C1104c c1104c10 = this.f6922q;
            int i24 = c1104c10.f6945b;
            int i25 = c1104c10.f6946c;
            if (i25 > 0) {
                m4149l1(i22, i11);
                C1104c c1104c11 = this.f6922q;
                c1104c11.f6951h = i25;
                m4117O0(c1127t, c1104c11, c1131x, false);
                i11 = this.f6922q.f6945b;
            }
            i12 = i24;
        }
        if (m4326y() > 0) {
            if (this.f6926u ^ this.f6927v) {
                int iM4126W1 = m4126W0(i11, c1127t, c1131x, true);
                i13 = i12 + iM4126W1;
                i14 = i11 + iM4126W1;
                iM4126W0 = m4128X0(i13, c1127t, c1131x, false);
            } else {
                int iM4128X0 = m4128X0(i12, c1127t, c1131x, true);
                i13 = i12 + iM4128X0;
                i14 = i11 + iM4128X0;
                iM4126W0 = m4126W0(i14, c1127t, c1131x, false);
            }
            i12 = i13 + iM4126W0;
            i11 = i14 + iM4126W0;
        }
        if (c1131x.f7150k && m4326y() != 0 && !c1131x.f7146g && mo4071G0()) {
            List<RecyclerView.AbstractC1109b0> list2 = c1127t.f7119d;
            int size = list2.size();
            int iM4286J = RecyclerView.AbstractC1120m.m4286J(m4324x(0));
            int i26 = 0;
            int iMo4531c = 0;
            int iMo4531c2 = 0;
            while (i26 < size) {
                RecyclerView.AbstractC1109b0 abstractC1109b0 = list2.get(i26);
                if (!abstractC1109b0.m4248k()) {
                    byte b10 = (abstractC1109b0.m4242e() < iM4286J ? true : z19) != this.f6926u ? (byte) -1 : (byte) 1;
                    View view = abstractC1109b0.f7054a;
                    if (b10 == -1) {
                        iMo4531c += this.f6923r.mo4531c(view);
                    } else {
                        iMo4531c2 += this.f6923r.mo4531c(view);
                    }
                }
                i26++;
                z19 = false;
            }
            this.f6922q.f6954k = list2;
            if (iMo4531c > 0) {
                m4150m1(RecyclerView.AbstractC1120m.m4286J(m4130Z0()), i12);
                C1104c c1104c12 = this.f6922q;
                c1104c12.f6951h = iMo4531c;
                r10 = 0;
                c1104c12.f6946c = 0;
                c1104c12.m4158a(null);
                m4117O0(c1127t, this.f6922q, c1131x, false);
            } else {
                r10 = 0;
            }
            if (iMo4531c2 > 0) {
                m4149l1(RecyclerView.AbstractC1120m.m4286J(m4129Y0()), i11);
                C1104c c1104c13 = this.f6922q;
                c1104c13.f6951h = iMo4531c2;
                c1104c13.f6946c = r10;
                list = null;
                c1104c13.m4158a(null);
                m4117O0(c1127t, this.f6922q, c1131x, r10);
            } else {
                list = null;
            }
            this.f6922q.f6954k = list;
        }
        if (c1131x.f7146g) {
            c1102a.m4157d();
        } else {
            AbstractC1175z abstractC1175z2 = this.f6923r;
            abstractC1175z2.f7475b = abstractC1175z2.mo4540l();
        }
        this.f6924s = this.f6927v;
    }

    /* JADX INFO: renamed from: g1 */
    public final int m4140g1(int i10, RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x) {
        if (m4326y() == 0 || i10 == 0) {
            return 0;
        }
        m4116N0();
        this.f6922q.f6944a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int iAbs = Math.abs(i10);
        m4147k1(i11, iAbs, true, c1131x);
        C1104c c1104c = this.f6922q;
        int iM4117O0 = m4117O0(c1127t, c1104c, c1131x, false) + c1104c.f6950g;
        if (iM4117O0 < 0) {
            return 0;
        }
        if (iAbs > iM4117O0) {
            i10 = i11 * iM4117O0;
        }
        this.f6923r.mo4543o(-i10);
        this.f6922q.f6953j = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: h0 */
    public void mo4087h0(RecyclerView.C1131x c1131x) {
        this.f6931z = null;
        this.f6929x = -1;
        this.f6930y = Integer.MIN_VALUE;
        this.f6917A.m4157d();
    }

    /* JADX INFO: renamed from: h1 */
    public final void m4141h1(int i10, int i11) {
        this.f6929x = i10;
        this.f6930y = i11;
        SavedState savedState = this.f6931z;
        if (savedState != null) {
            savedState.f6932a = -1;
        }
        m4322s0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: i0 */
    public final void mo4142i0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f6931z = savedState;
            if (this.f6929x != -1) {
                savedState.f6932a = -1;
            }
            m4322s0();
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final void m4143i1(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(C0166e.m761g("invalid orientation:", i10));
        }
        mo4134d(null);
        if (i10 != this.f6921p || this.f6923r == null) {
            AbstractC1175z abstractC1175zM4544a = AbstractC1175z.m4544a(this, i10);
            this.f6923r = abstractC1175zM4544a;
            this.f6917A.f6935a = abstractC1175zM4544a;
            this.f6921p = i10;
            m4322s0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: j */
    public final void mo4144j(int i10, int i11, RecyclerView.C1131x c1131x, RecyclerView.AbstractC1120m.c cVar) {
        if (this.f6921p != 0) {
            i10 = i11;
        }
        if (m4326y() != 0) {
            if (i10 == 0) {
                return;
            }
            m4116N0();
            m4147k1(i10 > 0 ? 1 : -1, Math.abs(i10), true, c1131x);
            mo4072I0(c1131x, this.f6922q, cVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: j0 */
    public final Parcelable mo4145j0() {
        SavedState savedState = this.f6931z;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (m4326y() > 0) {
            m4116N0();
            boolean z10 = this.f6924s ^ this.f6926u;
            savedState2.f6934c = z10;
            if (z10) {
                View viewM4129Y0 = m4129Y0();
                savedState2.f6933b = this.f6923r.mo4535g() - this.f6923r.mo4530b(viewM4129Y0);
                savedState2.f6932a = RecyclerView.AbstractC1120m.m4286J(viewM4129Y0);
            } else {
                View viewM4130Z0 = m4130Z0();
                savedState2.f6932a = RecyclerView.AbstractC1120m.m4286J(viewM4130Z0);
                savedState2.f6933b = this.f6923r.mo4533e(viewM4130Z0) - this.f6923r.mo4539k();
            }
        } else {
            savedState2.f6932a = -1;
        }
        return savedState2;
    }

    /* JADX INFO: renamed from: j1 */
    public void mo4088j1(boolean z10) {
        mo4134d(null);
        if (this.f6927v == z10) {
            return;
        }
        this.f6927v = z10;
        m4322s0();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    /* JADX WARN: Code duplicated, block: B:16:0x002d A[PHI: r4
      0x002d: PHI (r4v1 int) = (r4v0 int), (r4v2 int) binds: [B:11:0x0024, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: k */
    public final void mo4146k(int i10, RecyclerView.AbstractC1120m.c cVar) {
        boolean z10;
        int i11;
        SavedState savedState = this.f6931z;
        if (savedState == null) {
            m4138f1();
            z10 = this.f6926u;
            i11 = this.f6929x;
            if (i11 != -1) {
                if (z10) {
                    i11 = i10 - 1;
                } else {
                    i11 = 0;
                }
            }
        } else {
            i11 = savedState.f6932a;
            if (i11 >= 0) {
                z10 = savedState.f6934c;
            } else {
                m4138f1();
                z10 = this.f6926u;
                i11 = this.f6929x;
                if (i11 != -1) {
                    if (z10) {
                        i11 = i10 - 1;
                    } else {
                        i11 = 0;
                    }
                }
            }
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.f6919C && i11 >= 0 && i11 < i10; i13++) {
            ((RunnableC1164o.b) cVar).m4505a(i11, 0);
            i11 += i12;
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final void m4147k1(int i10, int i11, boolean z10, RecyclerView.C1131x c1131x) {
        int iMo4539k;
        int i12 = 1;
        boolean z11 = false;
        this.f6922q.f6955l = this.f6923r.mo4537i() == 0 && this.f6923r.mo4534f() == 0;
        this.f6922q.f6949f = i10;
        int[] iArr = this.f6920D;
        iArr[0] = 0;
        iArr[1] = 0;
        mo4111H0(c1131x, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        if (i10 == 1) {
            z11 = true;
        }
        C1104c c1104c = this.f6922q;
        int i13 = z11 ? iMax2 : iMax;
        c1104c.f6951h = i13;
        if (!z11) {
            iMax = iMax2;
        }
        c1104c.f6952i = iMax;
        if (z11) {
            c1104c.f6951h = this.f6923r.mo4536h() + i13;
            View viewM4129Y0 = m4129Y0();
            C1104c c1104c2 = this.f6922q;
            if (this.f6926u) {
                i12 = -1;
            }
            c1104c2.f6948e = i12;
            int iM4286J = RecyclerView.AbstractC1120m.m4286J(viewM4129Y0);
            C1104c c1104c3 = this.f6922q;
            c1104c2.f6947d = iM4286J + c1104c3.f6948e;
            c1104c3.f6945b = this.f6923r.mo4530b(viewM4129Y0);
            iMo4539k = this.f6923r.mo4530b(viewM4129Y0) - this.f6923r.mo4535g();
        } else {
            View viewM4130Z0 = m4130Z0();
            C1104c c1104c4 = this.f6922q;
            c1104c4.f6951h = this.f6923r.mo4539k() + c1104c4.f6951h;
            C1104c c1104c5 = this.f6922q;
            if (!this.f6926u) {
                i12 = -1;
            }
            c1104c5.f6948e = i12;
            int iM4286J2 = RecyclerView.AbstractC1120m.m4286J(viewM4130Z0);
            C1104c c1104c6 = this.f6922q;
            c1104c5.f6947d = iM4286J2 + c1104c6.f6948e;
            c1104c6.f6945b = this.f6923r.mo4533e(viewM4130Z0);
            iMo4539k = (-this.f6923r.mo4533e(viewM4130Z0)) + this.f6923r.mo4539k();
        }
        C1104c c1104c7 = this.f6922q;
        c1104c7.f6946c = i11;
        if (z10) {
            c1104c7.f6946c = i11 - iMo4539k;
        }
        c1104c7.f6950g = iMo4539k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: l */
    public final int mo4148l(RecyclerView.C1131x c1131x) {
        return m4112J0(c1131x);
    }

    /* JADX INFO: renamed from: l1 */
    public final void m4149l1(int i10, int i11) {
        this.f6922q.f6946c = this.f6923r.mo4535g() - i11;
        C1104c c1104c = this.f6922q;
        c1104c.f6948e = this.f6926u ? -1 : 1;
        c1104c.f6947d = i10;
        c1104c.f6949f = 1;
        c1104c.f6945b = i11;
        c1104c.f6950g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: m */
    public int mo4089m(RecyclerView.C1131x c1131x) {
        return m4113K0(c1131x);
    }

    /* JADX INFO: renamed from: m1 */
    public final void m4150m1(int i10, int i11) {
        this.f6922q.f6946c = i11 - this.f6923r.mo4539k();
        C1104c c1104c = this.f6922q;
        c1104c.f6947d = i10;
        c1104c.f6948e = this.f6926u ? 1 : -1;
        c1104c.f6949f = -1;
        c1104c.f6945b = i11;
        c1104c.f6950g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: n */
    public int mo4090n(RecyclerView.C1131x c1131x) {
        return m4114L0(c1131x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: o */
    public final int mo4151o(RecyclerView.C1131x c1131x) {
        return m4112J0(c1131x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: p */
    public int mo4093p(RecyclerView.C1131x c1131x) {
        return m4113K0(c1131x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: q */
    public int mo4095q(RecyclerView.C1131x c1131x) {
        return m4114L0(c1131x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: s */
    public final View mo4152s(int i10) {
        int iM4326y = m4326y();
        if (iM4326y == 0) {
            return null;
        }
        int iM4286J = i10 - RecyclerView.AbstractC1120m.m4286J(m4324x(0));
        if (iM4286J >= 0 && iM4286J < iM4326y) {
            View viewM4324x = m4324x(iM4286J);
            if (RecyclerView.AbstractC1120m.m4286J(viewM4324x) == i10) {
                return viewM4324x;
            }
        }
        return super.mo4152s(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: t */
    public RecyclerView.C1121n mo4099t() {
        return new RecyclerView.C1121n(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: t0 */
    public int mo4100t0(int i10, RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x) {
        if (this.f6921p == 1) {
            return 0;
        }
        return m4140g1(i10, c1127t, c1131x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: u0 */
    public final void mo4153u0(int i10) {
        this.f6929x = i10;
        this.f6930y = Integer.MIN_VALUE;
        SavedState savedState = this.f6931z;
        if (savedState != null) {
            savedState.f6932a = -1;
        }
        m4322s0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: v0 */
    public int mo4105v0(int i10, RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x) {
        if (this.f6921p == 0) {
            return 0;
        }
        return m4140g1(i10, c1127t, c1131x);
    }
}
