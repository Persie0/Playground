package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
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
import java.util.List;
import java.util.WeakHashMap;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractC1120m implements RecyclerView.AbstractC1130w.b {

    /* JADX INFO: renamed from: A */
    public int f7154A;

    /* JADX INFO: renamed from: B */
    public final LazySpanLookup f7155B;

    /* JADX INFO: renamed from: C */
    public final int f7156C;

    /* JADX INFO: renamed from: D */
    public boolean f7157D;

    /* JADX INFO: renamed from: E */
    public boolean f7158E;

    /* JADX INFO: renamed from: F */
    public SavedState f7159F;

    /* JADX INFO: renamed from: G */
    public final Rect f7160G;

    /* JADX INFO: renamed from: H */
    public final C1137b f7161H;

    /* JADX INFO: renamed from: I */
    public final boolean f7162I;

    /* JADX INFO: renamed from: J */
    public int[] f7163J;

    /* JADX INFO: renamed from: K */
    public final RunnableC1136a f7164K;

    /* JADX INFO: renamed from: p */
    public int f7165p;

    /* JADX INFO: renamed from: q */
    public C1139d[] f7166q;

    /* JADX INFO: renamed from: r */
    public AbstractC1175z f7167r;

    /* JADX INFO: renamed from: s */
    public AbstractC1175z f7168s;

    /* JADX INFO: renamed from: t */
    public int f7169t;

    /* JADX INFO: renamed from: u */
    public int f7170u;

    /* JADX INFO: renamed from: v */
    public final C1168s f7171v;

    /* JADX INFO: renamed from: w */
    public boolean f7172w;

    /* JADX INFO: renamed from: x */
    public boolean f7173x;

    /* JADX INFO: renamed from: y */
    public BitSet f7174y;

    /* JADX INFO: renamed from: z */
    public int f7175z;

    public static class LazySpanLookup {

        /* JADX INFO: renamed from: a */
        public int[] f7176a;

        /* JADX INFO: renamed from: b */
        public List<FullSpanItem> f7177b;

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new C1134a();

            /* JADX INFO: renamed from: a */
            public int f7178a;

            /* JADX INFO: renamed from: b */
            public int f7179b;

            /* JADX INFO: renamed from: c */
            public int[] f7180c;

            /* JADX INFO: renamed from: d */
            public boolean f7181d;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a */
            public class C1134a implements Parcelable.Creator<FullSpanItem> {
                @Override // android.os.Parcelable.Creator
                public final FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final FullSpanItem[] newArray(int i10) {
                    return new FullSpanItem[i10];
                }
            }

            public FullSpanItem() {
            }

            public FullSpanItem(Parcel parcel) {
                this.f7178a = parcel.readInt();
                this.f7179b = parcel.readInt();
                boolean z10 = true;
                if (parcel.readInt() != 1) {
                    z10 = false;
                }
                this.f7181d = z10;
                int i10 = parcel.readInt();
                if (i10 > 0) {
                    int[] iArr = new int[i10];
                    this.f7180c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.f7178a + ", mGapDir=" + this.f7179b + ", mHasUnwantedGapAfter=" + this.f7181d + ", mGapPerSpan=" + Arrays.toString(this.f7180c) + '}';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f7178a);
                parcel.writeInt(this.f7179b);
                parcel.writeInt(this.f7181d ? 1 : 0);
                int[] iArr = this.f7180c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f7180c);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m4396a() {
            int[] iArr = this.f7176a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f7177b = null;
        }

        /* JADX INFO: renamed from: b */
        public final void m4397b(int i10) {
            int[] iArr = this.f7176a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f7176a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int length = iArr.length;
                while (length <= i10) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f7176a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f7176a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* JADX WARN: Code duplicated, block: B:35:0x007c  */
        /* JADX WARN: Code duplicated, block: B:37:0x0089  */
        /* JADX INFO: renamed from: c */
        public final int m4398c(int i10) {
            int i11;
            int[] iArr = this.f7176a;
            if (iArr != null && i10 < iArr.length) {
                List<FullSpanItem> list = this.f7177b;
                if (list != null) {
                    FullSpanItem fullSpanItem = null;
                    if (list != null) {
                        for (int size = list.size() - 1; size >= 0; size--) {
                            FullSpanItem fullSpanItem2 = this.f7177b.get(size);
                            if (fullSpanItem2.f7178a == i10) {
                                fullSpanItem = fullSpanItem2;
                                break;
                            }
                        }
                    }
                    if (fullSpanItem != null) {
                        this.f7177b.remove(fullSpanItem);
                    }
                    int size2 = this.f7177b.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            i12 = -1;
                            break;
                        }
                        if (this.f7177b.get(i12).f7178a >= i10) {
                            break;
                        }
                        i12++;
                    }
                    if (i12 != -1) {
                        FullSpanItem fullSpanItem3 = this.f7177b.get(i12);
                        this.f7177b.remove(i12);
                        i11 = fullSpanItem3.f7178a;
                    }
                    if (i11 == -1) {
                        int[] iArr2 = this.f7176a;
                        Arrays.fill(iArr2, i10, iArr2.length, -1);
                        return this.f7176a.length;
                    }
                    int iMin = Math.min(i11 + 1, this.f7176a.length);
                    Arrays.fill(this.f7176a, i10, iMin, -1);
                    return iMin;
                }
                i11 = -1;
                if (i11 == -1) {
                    int[] iArr3 = this.f7176a;
                    Arrays.fill(iArr3, i10, iArr3.length, -1);
                    return this.f7176a.length;
                }
                int iMin2 = Math.min(i11 + 1, this.f7176a.length);
                Arrays.fill(this.f7176a, i10, iMin2, -1);
                return iMin2;
            }
            return -1;
        }

        /* JADX INFO: renamed from: d */
        public final void m4399d(int i10, int i11) {
            int[] iArr = this.f7176a;
            if (iArr != null) {
                if (i10 >= iArr.length) {
                    return;
                }
                int i12 = i10 + i11;
                m4397b(i12);
                int[] iArr2 = this.f7176a;
                System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
                Arrays.fill(this.f7176a, i10, i12, -1);
                List<FullSpanItem> list = this.f7177b;
                if (list == null) {
                    return;
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f7177b.get(size);
                    int i13 = fullSpanItem.f7178a;
                    if (i13 >= i10) {
                        fullSpanItem.f7178a = i13 + i11;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m4400e(int i10, int i11) {
            int[] iArr = this.f7176a;
            if (iArr != null) {
                if (i10 >= iArr.length) {
                    return;
                }
                int i12 = i10 + i11;
                m4397b(i12);
                int[] iArr2 = this.f7176a;
                System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
                int[] iArr3 = this.f7176a;
                Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
                List<FullSpanItem> list = this.f7177b;
                if (list == null) {
                    return;
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f7177b.get(size);
                    int i13 = fullSpanItem.f7178a;
                    if (i13 >= i10) {
                        if (i13 < i12) {
                            this.f7177b.remove(size);
                        } else {
                            fullSpanItem.f7178a = i13 - i11;
                        }
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1135a();

        /* JADX INFO: renamed from: a */
        public int f7182a;

        /* JADX INFO: renamed from: b */
        public int f7183b;

        /* JADX INFO: renamed from: c */
        public int f7184c;

        /* JADX INFO: renamed from: d */
        public int[] f7185d;

        /* JADX INFO: renamed from: e */
        public int f7186e;

        /* JADX INFO: renamed from: f */
        public int[] f7187f;

        /* JADX INFO: renamed from: g */
        public List<LazySpanLookup.FullSpanItem> f7188g;

        /* JADX INFO: renamed from: h */
        public boolean f7189h;

        /* JADX INFO: renamed from: i */
        public boolean f7190i;

        /* JADX INFO: renamed from: j */
        public boolean f7191j;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a */
        public class C1135a implements Parcelable.Creator<SavedState> {
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
            this.f7182a = parcel.readInt();
            this.f7183b = parcel.readInt();
            int i10 = parcel.readInt();
            this.f7184c = i10;
            if (i10 > 0) {
                int[] iArr = new int[i10];
                this.f7185d = iArr;
                parcel.readIntArray(iArr);
            }
            int i11 = parcel.readInt();
            this.f7186e = i11;
            if (i11 > 0) {
                int[] iArr2 = new int[i11];
                this.f7187f = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z10 = false;
            this.f7189h = parcel.readInt() == 1;
            this.f7190i = parcel.readInt() == 1;
            this.f7191j = parcel.readInt() == 1 ? true : z10;
            this.f7188g = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f7184c = savedState.f7184c;
            this.f7182a = savedState.f7182a;
            this.f7183b = savedState.f7183b;
            this.f7185d = savedState.f7185d;
            this.f7186e = savedState.f7186e;
            this.f7187f = savedState.f7187f;
            this.f7189h = savedState.f7189h;
            this.f7190i = savedState.f7190i;
            this.f7191j = savedState.f7191j;
            this.f7188g = savedState.f7188g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f7182a);
            parcel.writeInt(this.f7183b);
            parcel.writeInt(this.f7184c);
            if (this.f7184c > 0) {
                parcel.writeIntArray(this.f7185d);
            }
            parcel.writeInt(this.f7186e);
            if (this.f7186e > 0) {
                parcel.writeIntArray(this.f7187f);
            }
            parcel.writeInt(this.f7189h ? 1 : 0);
            parcel.writeInt(this.f7190i ? 1 : 0);
            parcel.writeInt(this.f7191j ? 1 : 0);
            parcel.writeList(this.f7188g);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    public class RunnableC1136a implements Runnable {
        public RunnableC1136a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.m4367I0();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    public class C1137b {

        /* JADX INFO: renamed from: a */
        public int f7193a;

        /* JADX INFO: renamed from: b */
        public int f7194b;

        /* JADX INFO: renamed from: c */
        public boolean f7195c;

        /* JADX INFO: renamed from: d */
        public boolean f7196d;

        /* JADX INFO: renamed from: e */
        public boolean f7197e;

        /* JADX INFO: renamed from: f */
        public int[] f7198f;

        public C1137b() {
            m4401a();
        }

        /* JADX INFO: renamed from: a */
        public final void m4401a() {
            this.f7193a = -1;
            this.f7194b = Integer.MIN_VALUE;
            this.f7195c = false;
            this.f7196d = false;
            this.f7197e = false;
            int[] iArr = this.f7198f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C1138c extends RecyclerView.C1121n {

        /* JADX INFO: renamed from: e */
        public C1139d f7200e;

        public C1138c(int i10, int i11) {
            super(i10, i11);
        }

        public C1138c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C1138c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1138c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    public class C1139d {

        /* JADX INFO: renamed from: a */
        public final ArrayList<View> f7201a = new ArrayList<>();

        /* JADX INFO: renamed from: b */
        public int f7202b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c */
        public int f7203c = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: d */
        public int f7204d = 0;

        /* JADX INFO: renamed from: e */
        public final int f7205e;

        public C1139d(int i10) {
            this.f7205e = i10;
        }

        /* JADX INFO: renamed from: h */
        public static C1138c m4402h(View view) {
            return (C1138c) view.getLayoutParams();
        }

        /* JADX INFO: renamed from: a */
        public final void m4403a() {
            ArrayList<View> arrayList = this.f7201a;
            View view = arrayList.get(arrayList.size() - 1);
            C1138c c1138cM4402h = m4402h(view);
            this.f7203c = StaggeredGridLayoutManager.this.f7167r.mo4530b(view);
            c1138cM4402h.getClass();
        }

        /* JADX INFO: renamed from: b */
        public final void m4404b() {
            this.f7201a.clear();
            this.f7202b = Integer.MIN_VALUE;
            this.f7203c = Integer.MIN_VALUE;
            this.f7204d = 0;
        }

        /* JADX INFO: renamed from: c */
        public final int m4405c() {
            boolean z10 = StaggeredGridLayoutManager.this.f7172w;
            ArrayList<View> arrayList = this.f7201a;
            return z10 ? m4407e(arrayList.size() - 1, -1) : m4407e(0, arrayList.size());
        }

        /* JADX INFO: renamed from: d */
        public final int m4406d() {
            boolean z10 = StaggeredGridLayoutManager.this.f7172w;
            ArrayList<View> arrayList = this.f7201a;
            return z10 ? m4407e(0, arrayList.size()) : m4407e(arrayList.size() - 1, -1);
        }

        /* JADX INFO: renamed from: e */
        public final int m4407e(int i10, int i11) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int iMo4539k = staggeredGridLayoutManager.f7167r.mo4539k();
            int iMo4535g = staggeredGridLayoutManager.f7167r.mo4535g();
            int i12 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = this.f7201a.get(i10);
                int iMo4533e = staggeredGridLayoutManager.f7167r.mo4533e(view);
                int iMo4530b = staggeredGridLayoutManager.f7167r.mo4530b(view);
                boolean z10 = false;
                boolean z11 = iMo4533e <= iMo4535g;
                if (iMo4530b >= iMo4539k) {
                    z10 = true;
                }
                if (!z11 || !z10 || (iMo4533e >= iMo4539k && iMo4530b <= iMo4535g)) {
                    i10 += i12;
                }
                return RecyclerView.AbstractC1120m.m4286J(view);
            }
            return -1;
        }

        /* JADX INFO: renamed from: f */
        public final int m4408f(int i10) {
            int i11 = this.f7203c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f7201a.size() == 0) {
                return i10;
            }
            m4403a();
            return this.f7203c;
        }

        /* JADX INFO: renamed from: g */
        public final View m4409g(int i10, int i11) {
            ArrayList<View> arrayList = this.f7201a;
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            View view = null;
            if (i11 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = arrayList.get(size);
                    if (staggeredGridLayoutManager.f7172w && RecyclerView.AbstractC1120m.m4286J(view2) >= i10) {
                        break;
                    }
                    if ((!staggeredGridLayoutManager.f7172w && RecyclerView.AbstractC1120m.m4286J(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = arrayList.size();
                int i12 = 0;
                while (i12 < size2) {
                    View view3 = arrayList.get(i12);
                    if (staggeredGridLayoutManager.f7172w && RecyclerView.AbstractC1120m.m4286J(view3) <= i10) {
                        break;
                    }
                    if ((!staggeredGridLayoutManager.f7172w && RecyclerView.AbstractC1120m.m4286J(view3) >= i10) || !view3.hasFocusable()) {
                        break;
                        break;
                    }
                    i12++;
                    view = view3;
                }
            }
            return view;
        }

        /* JADX INFO: renamed from: i */
        public final int m4410i(int i10) {
            int i11 = this.f7202b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            ArrayList<View> arrayList = this.f7201a;
            if (arrayList.size() == 0) {
                return i10;
            }
            View view = arrayList.get(0);
            C1138c c1138cM4402h = m4402h(view);
            this.f7202b = StaggeredGridLayoutManager.this.f7167r.mo4533e(view);
            c1138cM4402h.getClass();
            return this.f7202b;
        }
    }

    public StaggeredGridLayoutManager() {
        this.f7165p = -1;
        this.f7172w = false;
        this.f7173x = false;
        this.f7175z = -1;
        this.f7154A = Integer.MIN_VALUE;
        this.f7155B = new LazySpanLookup();
        this.f7156C = 2;
        this.f7160G = new Rect();
        this.f7161H = new C1137b();
        this.f7162I = true;
        this.f7164K = new RunnableC1136a();
        this.f7169t = 1;
        m4393i1(2);
        this.f7171v = new C1168s();
        this.f7167r = AbstractC1175z.m4544a(this, this.f7169t);
        this.f7168s = AbstractC1175z.m4544a(this, 1 - this.f7169t);
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f7165p = -1;
        this.f7172w = false;
        this.f7173x = false;
        this.f7175z = -1;
        this.f7154A = Integer.MIN_VALUE;
        this.f7155B = new LazySpanLookup();
        this.f7156C = 2;
        this.f7160G = new Rect();
        this.f7161H = new C1137b();
        this.f7162I = true;
        this.f7164K = new RunnableC1136a();
        RecyclerView.AbstractC1120m.d dVarM4287K = RecyclerView.AbstractC1120m.m4287K(context, attributeSet, i10, i11);
        int i12 = dVarM4287K.f7101a;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo4134d(null);
        if (i12 != this.f7169t) {
            this.f7169t = i12;
            AbstractC1175z abstractC1175z = this.f7167r;
            this.f7167r = this.f7168s;
            this.f7168s = abstractC1175z;
            m4322s0();
        }
        m4393i1(dVarM4287K.f7102b);
        boolean z10 = dVarM4287K.f7103c;
        mo4134d(null);
        SavedState savedState = this.f7159F;
        if (savedState != null && savedState.f7189h != z10) {
            savedState.f7189h = z10;
        }
        this.f7172w = z10;
        m4322s0();
        this.f7171v = new C1168s();
        this.f7167r = AbstractC1175z.m4544a(this, this.f7169t);
        this.f7168s = AbstractC1175z.m4544a(this, 1 - this.f7169t);
    }

    /* JADX INFO: renamed from: l1 */
    public static int m4365l1(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: E0 */
    public final void mo4110E0(RecyclerView recyclerView, int i10) {
        C1169t c1169t = new C1169t(recyclerView.getContext());
        c1169t.f7125a = i10;
        m4302F0(c1169t);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: G0 */
    public final boolean mo4071G0() {
        return this.f7159F == null;
    }

    /* JADX INFO: renamed from: H0 */
    public final int m4366H0(int i10) {
        if (m4326y() == 0) {
            return this.f7173x ? 1 : -1;
        }
        return (i10 < m4376R0()) != this.f7173x ? -1 : 1;
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m4367I0() {
        int iM4376R0;
        if (m4326y() != 0 && this.f7156C != 0 && this.f7090g) {
            if (this.f7173x) {
                iM4376R0 = m4377S0();
                m4376R0();
            } else {
                iM4376R0 = m4376R0();
                m4377S0();
            }
            if (iM4376R0 == 0 && m4381W0() != null) {
                this.f7155B.m4396a();
                this.f7089f = true;
                m4322s0();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J0 */
    public final int m4368J0(RecyclerView.C1131x c1131x) {
        if (m4326y() == 0) {
            return 0;
        }
        AbstractC1175z abstractC1175z = this.f7167r;
        boolean z10 = this.f7162I;
        return C1151f0.m4474a(c1131x, abstractC1175z, m4373O0(!z10), m4372N0(!z10), this, this.f7162I);
    }

    /* JADX INFO: renamed from: K0 */
    public final int m4369K0(RecyclerView.C1131x c1131x) {
        if (m4326y() == 0) {
            return 0;
        }
        AbstractC1175z abstractC1175z = this.f7167r;
        boolean z10 = this.f7162I;
        return C1151f0.m4475b(c1131x, abstractC1175z, m4373O0(!z10), m4372N0(!z10), this, this.f7162I, this.f7173x);
    }

    /* JADX INFO: renamed from: L0 */
    public final int m4370L0(RecyclerView.C1131x c1131x) {
        if (m4326y() == 0) {
            return 0;
        }
        AbstractC1175z abstractC1175z = this.f7167r;
        boolean z10 = this.f7162I;
        return C1151f0.m4476c(c1131x, abstractC1175z, m4373O0(!z10), m4372N0(!z10), this, this.f7162I);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX INFO: renamed from: M0 */
    public final int m4371M0(RecyclerView.C1127t c1127t, C1168s c1168s, RecyclerView.C1131x c1131x) {
        C1139d c1139d;
        ?? r10;
        int iM4410i;
        int iMo4531c;
        int iMo4539k;
        int iMo4531c2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        int i15 = 1;
        this.f7174y.set(0, this.f7165p, true);
        C1168s c1168s2 = this.f7171v;
        int i16 = c1168s2.f7462i ? c1168s.f7458e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c1168s.f7458e == 1 ? c1168s.f7460g + c1168s.f7455b : c1168s.f7459f - c1168s.f7455b;
        int i17 = c1168s.f7458e;
        for (int i18 = 0; i18 < this.f7165p; i18++) {
            if (!this.f7166q[i18].f7201a.isEmpty()) {
                m4395k1(this.f7166q[i18], i17, i16);
            }
        }
        int iMo4535g = this.f7173x ? this.f7167r.mo4535g() : this.f7167r.mo4539k();
        boolean z10 = false;
        while (true) {
            int i19 = c1168s.f7456c;
            if (((i19 < 0 || i19 >= c1131x.m4364b()) ? i14 : i15) == 0 || (!c1168s2.f7462i && this.f7174y.isEmpty())) {
                break;
            }
            View viewM4345d = c1127t.m4345d(c1168s.f7456c);
            c1168s.f7456c += c1168s.f7457d;
            C1138c c1138c = (C1138c) viewM4345d.getLayoutParams();
            int iM4333a = c1138c.m4333a();
            LazySpanLookup lazySpanLookup = this.f7155B;
            int[] iArr = lazySpanLookup.f7176a;
            int i20 = (iArr == null || iM4333a >= iArr.length) ? -1 : iArr[iM4333a];
            if ((i20 == -1 ? i15 : i14) != 0) {
                if (m4385a1(c1168s.f7458e)) {
                    i13 = this.f7165p - i15;
                    i12 = -1;
                    i11 = -1;
                } else {
                    i11 = i15;
                    i12 = this.f7165p;
                    i13 = i14;
                }
                C1139d c1139d2 = null;
                if (c1168s.f7458e == i15) {
                    int iMo4539k2 = this.f7167r.mo4539k();
                    int i21 = Integer.MAX_VALUE;
                    while (i13 != i12) {
                        C1139d c1139d3 = this.f7166q[i13];
                        int iM4408f = c1139d3.m4408f(iMo4539k2);
                        if (iM4408f < i21) {
                            i21 = iM4408f;
                            c1139d2 = c1139d3;
                        }
                        i13 += i11;
                    }
                } else {
                    int iMo4535g2 = this.f7167r.mo4535g();
                    int i22 = Integer.MIN_VALUE;
                    while (i13 != i12) {
                        C1139d c1139d4 = this.f7166q[i13];
                        int iM4410i2 = c1139d4.m4410i(iMo4535g2);
                        if (iM4410i2 > i22) {
                            c1139d2 = c1139d4;
                            i22 = iM4410i2;
                        }
                        i13 += i11;
                    }
                }
                c1139d = c1139d2;
                lazySpanLookup.m4397b(iM4333a);
                lazySpanLookup.f7176a[iM4333a] = c1139d.f7205e;
            } else {
                c1139d = this.f7166q[i20];
            }
            c1138c.f7200e = c1139d;
            if (c1168s.f7458e == 1) {
                r10 = 0;
                m4311c(viewM4345d, -1, false);
            } else {
                r10 = 0;
                m4311c(viewM4345d, 0, false);
            }
            if (this.f7169t == 1) {
                m4383Y0(viewM4345d, RecyclerView.AbstractC1120m.m4294z(r10, this.f7170u, this.f7095l, r10, ((ViewGroup.MarginLayoutParams) c1138c).width), RecyclerView.AbstractC1120m.m4294z(true, this.f7098o, this.f7096m, m4301F() + m4305I(), ((ViewGroup.MarginLayoutParams) c1138c).height), r10);
            } else {
                m4383Y0(viewM4345d, RecyclerView.AbstractC1120m.m4294z(true, this.f7097n, this.f7095l, m4304H() + m4303G(), ((ViewGroup.MarginLayoutParams) c1138c).width), RecyclerView.AbstractC1120m.m4294z(false, this.f7170u, this.f7096m, 0, ((ViewGroup.MarginLayoutParams) c1138c).height), false);
            }
            if (c1168s.f7458e == 1) {
                iMo4531c = c1139d.m4408f(iMo4535g);
                iM4410i = this.f7167r.mo4531c(viewM4345d) + iMo4531c;
            } else {
                iM4410i = c1139d.m4410i(iMo4535g);
                iMo4531c = iM4410i - this.f7167r.mo4531c(viewM4345d);
            }
            if (c1168s.f7458e == 1) {
                C1139d c1139d5 = c1138c.f7200e;
                c1139d5.getClass();
                C1138c c1138c2 = (C1138c) viewM4345d.getLayoutParams();
                c1138c2.f7200e = c1139d5;
                ArrayList<View> arrayList = c1139d5.f7201a;
                arrayList.add(viewM4345d);
                c1139d5.f7203c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    c1139d5.f7202b = Integer.MIN_VALUE;
                }
                if (c1138c2.m4335c() || c1138c2.m4334b()) {
                    c1139d5.f7204d = StaggeredGridLayoutManager.this.f7167r.mo4531c(viewM4345d) + c1139d5.f7204d;
                }
            } else {
                C1139d c1139d6 = c1138c.f7200e;
                c1139d6.getClass();
                C1138c c1138c3 = (C1138c) viewM4345d.getLayoutParams();
                c1138c3.f7200e = c1139d6;
                ArrayList<View> arrayList2 = c1139d6.f7201a;
                arrayList2.add(0, viewM4345d);
                c1139d6.f7202b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    c1139d6.f7203c = Integer.MIN_VALUE;
                }
                if (c1138c3.m4335c() || c1138c3.m4334b()) {
                    c1139d6.f7204d = StaggeredGridLayoutManager.this.f7167r.mo4531c(viewM4345d) + c1139d6.f7204d;
                }
            }
            if (m4382X0() && this.f7169t == 1) {
                iMo4531c2 = this.f7168s.mo4535g() - (((this.f7165p - 1) - c1139d.f7205e) * this.f7170u);
                iMo4539k = iMo4531c2 - this.f7168s.mo4531c(viewM4345d);
            } else {
                iMo4539k = this.f7168s.mo4539k() + (c1139d.f7205e * this.f7170u);
                iMo4531c2 = this.f7168s.mo4531c(viewM4345d) + iMo4539k;
            }
            if (this.f7169t == 1) {
                RecyclerView.AbstractC1120m.m4291R(viewM4345d, iMo4539k, iMo4531c, iMo4531c2, iM4410i);
            } else {
                RecyclerView.AbstractC1120m.m4291R(viewM4345d, iMo4531c, iMo4539k, iM4410i, iMo4531c2);
            }
            m4395k1(c1139d, c1168s2.f7458e, i16);
            m4387c1(c1127t, c1168s2);
            if (c1168s2.f7461h && viewM4345d.hasFocusable()) {
                i10 = 0;
                this.f7174y.set(c1139d.f7205e, false);
            } else {
                i10 = 0;
            }
            i14 = i10;
            i15 = 1;
            z10 = true;
        }
        int i23 = i14;
        if (!z10) {
            m4387c1(c1127t, c1168s2);
        }
        int iMo4539k3 = c1168s2.f7458e == -1 ? this.f7167r.mo4539k() - m4379U0(this.f7167r.mo4539k()) : m4378T0(this.f7167r.mo4535g()) - this.f7167r.mo4535g();
        return iMo4539k3 > 0 ? Math.min(c1168s.f7455b, iMo4539k3) : i23;
    }

    /* JADX INFO: renamed from: N0 */
    public final View m4372N0(boolean z10) {
        int iMo4539k = this.f7167r.mo4539k();
        int iMo4535g = this.f7167r.mo4535g();
        View view = null;
        for (int iM4326y = m4326y() - 1; iM4326y >= 0; iM4326y--) {
            View viewM4324x = m4324x(iM4326y);
            int iMo4533e = this.f7167r.mo4533e(viewM4324x);
            int iMo4530b = this.f7167r.mo4530b(viewM4324x);
            if (iMo4530b > iMo4539k && iMo4533e < iMo4535g) {
                if (iMo4530b > iMo4535g && z10) {
                    if (view == null) {
                        view = viewM4324x;
                    }
                }
                return viewM4324x;
            }
        }
        return view;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX INFO: renamed from: O0 */
    public final View m4373O0(boolean z10) {
        int iMo4539k = this.f7167r.mo4539k();
        int iMo4535g = this.f7167r.mo4535g();
        int iM4326y = m4326y();
        View view = null;
        for (int i10 = 0; i10 < iM4326y; i10++) {
            View viewM4324x = m4324x(i10);
            int iMo4533e = this.f7167r.mo4533e(viewM4324x);
            if (this.f7167r.mo4530b(viewM4324x) > iMo4539k) {
                if (iMo4533e < iMo4535g) {
                    if (iMo4533e < iMo4539k && z10) {
                        if (view == null) {
                            view = viewM4324x;
                        }
                    }
                    return viewM4324x;
                }
                continue;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: P */
    public final boolean mo4118P() {
        return this.f7156C != 0;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m4374P0(RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x, boolean z10) {
        int iMo4535g;
        int iM4378T0 = m4378T0(Integer.MIN_VALUE);
        if (iM4378T0 != Integer.MIN_VALUE && (iMo4535g = this.f7167r.mo4535g() - iM4378T0) > 0) {
            int i10 = iMo4535g - (-m4391g1(-iMo4535g, c1127t, c1131x));
            if (!z10 || i10 <= 0) {
                return;
            }
            this.f7167r.mo4543o(i10);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m4375Q0(RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x, boolean z10) {
        int iMo4539k;
        int iM4379U0 = m4379U0(Integer.MAX_VALUE);
        if (iM4379U0 != Integer.MAX_VALUE && (iMo4539k = iM4379U0 - this.f7167r.mo4539k()) > 0) {
            int iM4391g1 = iMo4539k - m4391g1(iMo4539k, c1127t, c1131x);
            if (!z10 || iM4391g1 <= 0) {
                return;
            }
            this.f7167r.mo4543o(-iM4391g1);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final int m4376R0() {
        if (m4326y() == 0) {
            return 0;
        }
        return RecyclerView.AbstractC1120m.m4286J(m4324x(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: S */
    public final void mo4307S(int i10) {
        super.mo4307S(i10);
        for (int i11 = 0; i11 < this.f7165p; i11++) {
            C1139d c1139d = this.f7166q[i11];
            int i12 = c1139d.f7202b;
            if (i12 != Integer.MIN_VALUE) {
                c1139d.f7202b = i12 + i10;
            }
            int i13 = c1139d.f7203c;
            if (i13 != Integer.MIN_VALUE) {
                c1139d.f7203c = i13 + i10;
            }
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final int m4377S0() {
        int iM4326y = m4326y();
        if (iM4326y == 0) {
            return 0;
        }
        return RecyclerView.AbstractC1120m.m4286J(m4324x(iM4326y - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: T */
    public final void mo4308T(int i10) {
        super.mo4308T(i10);
        for (int i11 = 0; i11 < this.f7165p; i11++) {
            C1139d c1139d = this.f7166q[i11];
            int i12 = c1139d.f7202b;
            if (i12 != Integer.MIN_VALUE) {
                c1139d.f7202b = i12 + i10;
            }
            int i13 = c1139d.f7203c;
            if (i13 != Integer.MIN_VALUE) {
                c1139d.f7203c = i13 + i10;
            }
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final int m4378T0(int i10) {
        int iM4408f = this.f7166q[0].m4408f(i10);
        for (int i11 = 1; i11 < this.f7165p; i11++) {
            int iM4408f2 = this.f7166q[i11].m4408f(i10);
            if (iM4408f2 > iM4408f) {
                iM4408f = iM4408f2;
            }
        }
        return iM4408f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: U */
    public final void mo4309U() {
        this.f7155B.m4396a();
        for (int i10 = 0; i10 < this.f7165p; i10++) {
            this.f7166q[i10].m4404b();
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final int m4379U0(int i10) {
        int iM4410i = this.f7166q[0].m4410i(i10);
        for (int i11 = 1; i11 < this.f7165p; i11++) {
            int iM4410i2 = this.f7166q[i11].m4410i(i10);
            if (iM4410i2 < iM4410i) {
                iM4410i = iM4410i2;
            }
        }
        return iM4410i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: V */
    public final void mo4125V(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f7085b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f7164K);
        }
        for (int i10 = 0; i10 < this.f7165p; i10++) {
            this.f7166q[i10].m4404b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: V0 */
    public final void m4380V0(int i10, int i11, int i12) {
        int i13;
        int i14;
        LazySpanLookup lazySpanLookup;
        int iM4377S0;
        int iM4377S1 = this.f7173x ? m4377S0() : m4376R0();
        if (i12 == 8) {
            if (i10 < i11) {
                i13 = i11 + 1;
            } else {
                i13 = i10 + 1;
                i14 = i11;
            }
            lazySpanLookup = this.f7155B;
            lazySpanLookup.m4398c(i14);
            if (i12 != 1) {
                lazySpanLookup.m4399d(i10, i11);
            } else if (i12 != 2) {
                lazySpanLookup.m4400e(i10, i11);
            } else if (i12 == 8) {
                lazySpanLookup.m4400e(i10, 1);
                lazySpanLookup.m4399d(i11, 1);
            }
            if (i13 <= iM4377S1) {
                return;
            }
            if (this.f7173x) {
                iM4377S0 = m4376R0();
            } else {
                iM4377S0 = m4377S0();
            }
            if (i14 <= iM4377S0) {
                m4322s0();
            }
        }
        i13 = i10 + i11;
        i14 = i10;
        lazySpanLookup = this.f7155B;
        lazySpanLookup.m4398c(i14);
        if (i12 != 1) {
            lazySpanLookup.m4399d(i10, i11);
        } else if (i12 != 2) {
            lazySpanLookup.m4400e(i10, i11);
        } else if (i12 == 8) {
            lazySpanLookup.m4400e(i10, 1);
            lazySpanLookup.m4399d(i11, 1);
        }
        if (i13 <= iM4377S1) {
            return;
        }
        if (this.f7173x) {
            iM4377S0 = m4376R0();
        } else {
            iM4377S0 = m4377S0();
        }
        if (i14 <= iM4377S0) {
            m4322s0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x008c  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: W */
    public final View mo4075W(View view, int i10, RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x) {
        View viewM4172D;
        int i11;
        if (m4326y() == 0) {
            return null;
        }
        RecyclerView recyclerView = this.f7085b;
        if (recyclerView == null || (viewM4172D = recyclerView.m4172D(view)) == null || this.f7084a.m4464j(viewM4172D)) {
            viewM4172D = null;
        }
        if (viewM4172D == null) {
            return null;
        }
        m4390f1();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 17) {
                    i11 = this.f7169t == 0 ? -1 : Integer.MIN_VALUE;
                } else if (i10 != 33) {
                    if (i10 != 66) {
                        if (i10 == 130 && this.f7169t == 1) {
                            i11 = 1;
                        }
                    } else if (this.f7169t == 0) {
                        i11 = 1;
                    }
                } else if (this.f7169t == 1) {
                }
            } else if (this.f7169t == 1 || !m4382X0()) {
                i11 = 1;
            }
        } else if (this.f7169t != 1 && m4382X0()) {
            i11 = 1;
        }
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        C1138c c1138c = (C1138c) viewM4172D.getLayoutParams();
        c1138c.getClass();
        C1139d c1139d = c1138c.f7200e;
        int iM4377S0 = i11 == 1 ? m4377S0() : m4376R0();
        m4394j1(iM4377S0, c1131x);
        m4392h1(i11);
        C1168s c1168s = this.f7171v;
        c1168s.f7456c = c1168s.f7457d + iM4377S0;
        c1168s.f7455b = (int) (this.f7167r.mo4540l() * 0.33333334f);
        c1168s.f7461h = true;
        c1168s.f7454a = false;
        m4371M0(c1127t, c1168s, c1131x);
        this.f7157D = this.f7173x;
        View viewM4409g = c1139d.m4409g(iM4377S0, i11);
        if (viewM4409g != null && viewM4409g != viewM4172D) {
            return viewM4409g;
        }
        if (m4385a1(i11)) {
            for (int i12 = this.f7165p - 1; i12 >= 0; i12--) {
                View viewM4409g2 = this.f7166q[i12].m4409g(iM4377S0, i11);
                if (viewM4409g2 != null && viewM4409g2 != viewM4172D) {
                    return viewM4409g2;
                }
            }
        } else {
            for (int i13 = 0; i13 < this.f7165p; i13++) {
                View viewM4409g3 = this.f7166q[i13].m4409g(iM4377S0, i11);
                if (viewM4409g3 != null && viewM4409g3 != viewM4172D) {
                    return viewM4409g3;
                }
            }
        }
        boolean z10 = (this.f7172w ^ true) == (i11 == -1);
        View viewMo4152s = mo4152s(z10 ? c1139d.m4405c() : c1139d.m4406d());
        if (viewMo4152s != null && viewMo4152s != viewM4172D) {
            return viewMo4152s;
        }
        if (m4385a1(i11)) {
            for (int i14 = this.f7165p - 1; i14 >= 0; i14--) {
                if (i14 != c1139d.f7205e) {
                    View viewMo4152s2 = mo4152s(z10 ? this.f7166q[i14].m4405c() : this.f7166q[i14].m4406d());
                    if (viewMo4152s2 != null && viewMo4152s2 != viewM4172D) {
                        return viewMo4152s2;
                    }
                }
            }
        } else {
            for (int i15 = 0; i15 < this.f7165p; i15++) {
                View viewMo4152s3 = mo4152s(z10 ? this.f7166q[i15].m4405c() : this.f7166q[i15].m4406d());
                if (viewMo4152s3 != null && viewMo4152s3 != viewM4172D) {
                    return viewMo4152s3;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00da  */
    /* JADX WARN: Code duplicated, block: B:56:0x0122  */
    /* JADX INFO: renamed from: W0 */
    public final View m4381W0() {
        int i10;
        boolean z10;
        boolean z11;
        int iM4326y = m4326y() - 1;
        BitSet bitSet = new BitSet(this.f7165p);
        bitSet.set(0, this.f7165p, true);
        byte b10 = (this.f7169t == 1 && m4382X0()) ? (byte) 1 : (byte) -1;
        if (this.f7173x) {
            i10 = -1;
        } else {
            i10 = iM4326y + 1;
            iM4326y = 0;
        }
        int i11 = iM4326y < i10 ? 1 : -1;
        while (iM4326y != i10) {
            View viewM4324x = m4324x(iM4326y);
            C1138c c1138c = (C1138c) viewM4324x.getLayoutParams();
            if (bitSet.get(c1138c.f7200e.f7205e)) {
                C1139d c1139d = c1138c.f7200e;
                if (this.f7173x) {
                    int i12 = c1139d.f7203c;
                    if (i12 == Integer.MIN_VALUE) {
                        c1139d.m4403a();
                        i12 = c1139d.f7203c;
                    }
                    if (i12 < this.f7167r.mo4535g()) {
                        ArrayList<View> arrayList = c1139d.f7201a;
                        C1139d.m4402h(arrayList.get(arrayList.size() - 1)).getClass();
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    int i13 = c1139d.f7202b;
                    if (i13 == Integer.MIN_VALUE) {
                        View view = c1139d.f7201a.get(0);
                        C1138c c1138cM4402h = C1139d.m4402h(view);
                        c1139d.f7202b = StaggeredGridLayoutManager.this.f7167r.mo4533e(view);
                        c1138cM4402h.getClass();
                        i13 = c1139d.f7202b;
                    }
                    if (i13 > this.f7167r.mo4539k()) {
                        C1139d.m4402h(c1139d.f7201a.get(0)).getClass();
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    return viewM4324x;
                }
                bitSet.clear(c1138c.f7200e.f7205e);
            }
            iM4326y += i11;
            if (iM4326y != i10) {
                View viewM4324x2 = m4324x(iM4326y);
                if (this.f7173x) {
                    int iMo4530b = this.f7167r.mo4530b(viewM4324x);
                    int iMo4530b2 = this.f7167r.mo4530b(viewM4324x2);
                    if (iMo4530b < iMo4530b2) {
                        return viewM4324x;
                    }
                    if (iMo4530b == iMo4530b2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    int iMo4533e = this.f7167r.mo4533e(viewM4324x);
                    int iMo4533e2 = this.f7167r.mo4533e(viewM4324x2);
                    if (iMo4533e > iMo4533e2) {
                        return viewM4324x;
                    }
                    if (iMo4533e == iMo4533e2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    if ((c1138c.f7200e.f7205e - ((C1138c) viewM4324x2.getLayoutParams()).f7200e.f7205e < 0) != (b10 < 0)) {
                        return viewM4324x;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: X */
    public final void mo4127X(AccessibilityEvent accessibilityEvent) {
        super.mo4127X(accessibilityEvent);
        if (m4326y() > 0) {
            View viewM4373O0 = m4373O0(false);
            View viewM4372N0 = m4372N0(false);
            if (viewM4373O0 == null || viewM4372N0 == null) {
                return;
            }
            int iM4286J = RecyclerView.AbstractC1120m.m4286J(viewM4373O0);
            int iM4286J2 = RecyclerView.AbstractC1120m.m4286J(viewM4372N0);
            if (iM4286J < iM4286J2) {
                accessibilityEvent.setFromIndex(iM4286J);
                accessibilityEvent.setToIndex(iM4286J2);
            } else {
                accessibilityEvent.setFromIndex(iM4286J2);
                accessibilityEvent.setToIndex(iM4286J);
            }
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final boolean m4382X0() {
        return m4299D() == 1;
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m4383Y0(View view, int i10, int i11, boolean z10) {
        Rect rect = this.f7160G;
        m4312e(view, rect);
        C1138c c1138c = (C1138c) view.getLayoutParams();
        int iM4365l1 = m4365l1(i10, ((ViewGroup.MarginLayoutParams) c1138c).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c1138c).rightMargin + rect.right);
        int iM4365l2 = m4365l1(i11, ((ViewGroup.MarginLayoutParams) c1138c).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c1138c).bottomMargin + rect.bottom);
        if (m4297B0(view, iM4365l1, iM4365l2, c1138c)) {
            view.measure(iM4365l1, iM4365l2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:253:0x040e  */
    /* JADX INFO: renamed from: Z0 */
    public final void m4384Z0(RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x, boolean z10) {
        boolean z11;
        SavedState savedState;
        boolean z12;
        int iM4286J;
        int i10;
        SavedState savedState2 = this.f7159F;
        C1137b c1137b = this.f7161H;
        if (!(savedState2 == null && this.f7175z == -1) && c1131x.m4364b() == 0) {
            m4315m0(c1127t);
            c1137b.m4401a();
            return;
        }
        boolean z13 = (c1137b.f7197e && this.f7175z == -1 && this.f7159F == null) ? false : true;
        StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
        LazySpanLookup lazySpanLookup = this.f7155B;
        if (z13) {
            c1137b.m4401a();
            SavedState savedState3 = this.f7159F;
            if (savedState3 != null) {
                int i11 = savedState3.f7184c;
                if (i11 > 0) {
                    if (i11 == this.f7165p) {
                        for (int i12 = 0; i12 < this.f7165p; i12++) {
                            this.f7166q[i12].m4404b();
                            SavedState savedState4 = this.f7159F;
                            int iMo4535g = savedState4.f7185d[i12];
                            if (iMo4535g != Integer.MIN_VALUE) {
                                iMo4535g += savedState4.f7190i ? this.f7167r.mo4535g() : this.f7167r.mo4539k();
                            }
                            C1139d c1139d = this.f7166q[i12];
                            c1139d.f7202b = iMo4535g;
                            c1139d.f7203c = iMo4535g;
                        }
                    } else {
                        savedState3.f7185d = null;
                        savedState3.f7184c = 0;
                        savedState3.f7186e = 0;
                        savedState3.f7187f = null;
                        savedState3.f7188g = null;
                        savedState3.f7182a = savedState3.f7183b;
                    }
                }
                SavedState savedState5 = this.f7159F;
                this.f7158E = savedState5.f7191j;
                boolean z14 = savedState5.f7189h;
                mo4134d(null);
                SavedState savedState6 = this.f7159F;
                if (savedState6 != null && savedState6.f7189h != z14) {
                    savedState6.f7189h = z14;
                }
                this.f7172w = z14;
                m4322s0();
                m4390f1();
                SavedState savedState7 = this.f7159F;
                int i13 = savedState7.f7182a;
                if (i13 != -1) {
                    this.f7175z = i13;
                    c1137b.f7195c = savedState7.f7190i;
                } else {
                    c1137b.f7195c = this.f7173x;
                }
                if (savedState7.f7186e > 1) {
                    lazySpanLookup.f7176a = savedState7.f7187f;
                    lazySpanLookup.f7177b = savedState7.f7188g;
                }
            } else {
                m4390f1();
                c1137b.f7195c = this.f7173x;
            }
            if (c1131x.f7146g || (i10 = this.f7175z) == -1) {
                z12 = false;
            } else if (i10 < 0 || i10 >= c1131x.m4364b()) {
                this.f7175z = -1;
                this.f7154A = Integer.MIN_VALUE;
                z12 = false;
            } else {
                SavedState savedState8 = this.f7159F;
                if (savedState8 == null || savedState8.f7182a == -1 || savedState8.f7184c < 1) {
                    View viewMo4152s = mo4152s(this.f7175z);
                    if (viewMo4152s != null) {
                        c1137b.f7193a = this.f7173x ? m4377S0() : m4376R0();
                        if (this.f7154A != Integer.MIN_VALUE) {
                            if (c1137b.f7195c) {
                                c1137b.f7194b = (this.f7167r.mo4535g() - this.f7154A) - this.f7167r.mo4530b(viewMo4152s);
                            } else {
                                c1137b.f7194b = (this.f7167r.mo4539k() + this.f7154A) - this.f7167r.mo4533e(viewMo4152s);
                            }
                        } else if (this.f7167r.mo4531c(viewMo4152s) > this.f7167r.mo4540l()) {
                            c1137b.f7194b = c1137b.f7195c ? this.f7167r.mo4535g() : this.f7167r.mo4539k();
                        } else {
                            int iMo4533e = this.f7167r.mo4533e(viewMo4152s) - this.f7167r.mo4539k();
                            if (iMo4533e < 0) {
                                c1137b.f7194b = -iMo4533e;
                            } else {
                                int iMo4535g2 = this.f7167r.mo4535g() - this.f7167r.mo4530b(viewMo4152s);
                                if (iMo4535g2 < 0) {
                                    c1137b.f7194b = iMo4535g2;
                                } else {
                                    c1137b.f7194b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i14 = this.f7175z;
                        c1137b.f7193a = i14;
                        int i15 = this.f7154A;
                        if (i15 == Integer.MIN_VALUE) {
                            boolean z15 = m4366H0(i14) == 1;
                            c1137b.f7195c = z15;
                            c1137b.f7194b = z15 ? staggeredGridLayoutManager.f7167r.mo4535g() : staggeredGridLayoutManager.f7167r.mo4539k();
                        } else if (c1137b.f7195c) {
                            c1137b.f7194b = staggeredGridLayoutManager.f7167r.mo4535g() - i15;
                        } else {
                            c1137b.f7194b = staggeredGridLayoutManager.f7167r.mo4539k() + i15;
                        }
                        c1137b.f7196d = true;
                    }
                } else {
                    c1137b.f7194b = Integer.MIN_VALUE;
                    c1137b.f7193a = this.f7175z;
                }
                z12 = true;
            }
            if (!z12) {
                if (this.f7157D) {
                    int iM4364b = c1131x.m4364b();
                    int iM4326y = m4326y();
                    while (true) {
                        iM4326y--;
                        if (iM4326y < 0) {
                            iM4286J = 0;
                            break;
                        }
                        iM4286J = RecyclerView.AbstractC1120m.m4286J(m4324x(iM4326y));
                        if (iM4286J >= 0 && iM4286J < iM4364b) {
                            break;
                        }
                    }
                } else {
                    int iM4364b2 = c1131x.m4364b();
                    int iM4326y2 = m4326y();
                    int i16 = 0;
                    while (true) {
                        if (i16 >= iM4326y2) {
                            iM4286J = 0;
                            break;
                        }
                        int iM4286J2 = RecyclerView.AbstractC1120m.m4286J(m4324x(i16));
                        if (iM4286J2 >= 0 && iM4286J2 < iM4364b2) {
                            iM4286J = iM4286J2;
                            break;
                        }
                        i16++;
                    }
                }
                c1137b.f7193a = iM4286J;
                c1137b.f7194b = Integer.MIN_VALUE;
            }
            c1137b.f7197e = true;
        }
        if (this.f7159F == null && this.f7175z == -1 && (c1137b.f7195c != this.f7157D || m4382X0() != this.f7158E)) {
            lazySpanLookup.m4396a();
            c1137b.f7196d = true;
        }
        if (m4326y() > 0 && ((savedState = this.f7159F) == null || savedState.f7184c < 1)) {
            if (c1137b.f7196d) {
                for (int i17 = 0; i17 < this.f7165p; i17++) {
                    this.f7166q[i17].m4404b();
                    int i18 = c1137b.f7194b;
                    if (i18 != Integer.MIN_VALUE) {
                        C1139d c1139d2 = this.f7166q[i17];
                        c1139d2.f7202b = i18;
                        c1139d2.f7203c = i18;
                    }
                }
            } else if (z13 || c1137b.f7198f == null) {
                for (int i19 = 0; i19 < this.f7165p; i19++) {
                    C1139d c1139d3 = this.f7166q[i19];
                    boolean z16 = this.f7173x;
                    int i20 = c1137b.f7194b;
                    int iM4408f = z16 ? c1139d3.m4408f(Integer.MIN_VALUE) : c1139d3.m4410i(Integer.MIN_VALUE);
                    c1139d3.m4404b();
                    if (iM4408f != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                        if ((!z16 || iM4408f >= staggeredGridLayoutManager2.f7167r.mo4535g()) && (z16 || iM4408f <= staggeredGridLayoutManager2.f7167r.mo4539k())) {
                            if (i20 != Integer.MIN_VALUE) {
                                iM4408f += i20;
                            }
                            c1139d3.f7203c = iM4408f;
                            c1139d3.f7202b = iM4408f;
                        }
                    }
                }
                C1139d[] c1139dArr = this.f7166q;
                int length = c1139dArr.length;
                int[] iArr = c1137b.f7198f;
                if (iArr == null || iArr.length < length) {
                    c1137b.f7198f = new int[staggeredGridLayoutManager.f7166q.length];
                }
                for (int i21 = 0; i21 < length; i21++) {
                    c1137b.f7198f[i21] = c1139dArr[i21].m4410i(Integer.MIN_VALUE);
                }
            } else {
                for (int i22 = 0; i22 < this.f7165p; i22++) {
                    C1139d c1139d4 = this.f7166q[i22];
                    c1139d4.m4404b();
                    int i23 = c1137b.f7198f[i22];
                    c1139d4.f7202b = i23;
                    c1139d4.f7203c = i23;
                }
            }
        }
        m4320r(c1127t);
        C1168s c1168s = this.f7171v;
        c1168s.f7454a = false;
        int iMo4540l = this.f7168s.mo4540l();
        this.f7170u = iMo4540l / this.f7165p;
        View.MeasureSpec.makeMeasureSpec(iMo4540l, this.f7168s.mo4537i());
        m4394j1(c1137b.f7193a, c1131x);
        if (c1137b.f7195c) {
            m4392h1(-1);
            m4371M0(c1127t, c1168s, c1131x);
            m4392h1(1);
            c1168s.f7456c = c1137b.f7193a + c1168s.f7457d;
            m4371M0(c1127t, c1168s, c1131x);
        } else {
            m4392h1(1);
            m4371M0(c1127t, c1168s, c1131x);
            m4392h1(-1);
            c1168s.f7456c = c1137b.f7193a + c1168s.f7457d;
            m4371M0(c1127t, c1168s, c1131x);
        }
        if (this.f7168s.mo4537i() != 1073741824) {
            int iM4326y3 = m4326y();
            float fMax = 0.0f;
            for (int i24 = 0; i24 < iM4326y3; i24++) {
                View viewM4324x = m4324x(i24);
                float fMo4531c = this.f7168s.mo4531c(viewM4324x);
                if (fMo4531c >= fMax) {
                    ((C1138c) viewM4324x.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fMo4531c);
                }
            }
            int i25 = this.f7170u;
            int iRound = Math.round(fMax * this.f7165p);
            if (this.f7168s.mo4537i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f7168s.mo4540l());
            }
            this.f7170u = iRound / this.f7165p;
            View.MeasureSpec.makeMeasureSpec(iRound, this.f7168s.mo4537i());
            if (this.f7170u != i25) {
                for (int i26 = 0; i26 < iM4326y3; i26++) {
                    View viewM4324x2 = m4324x(i26);
                    C1138c c1138c = (C1138c) viewM4324x2.getLayoutParams();
                    c1138c.getClass();
                    if (m4382X0() && this.f7169t == 1) {
                        int i27 = this.f7165p;
                        int i28 = c1138c.f7200e.f7205e;
                        viewM4324x2.offsetLeftAndRight(((-((i27 - 1) - i28)) * this.f7170u) - ((-((i27 - 1) - i28)) * i25));
                    } else {
                        int i29 = c1138c.f7200e.f7205e;
                        int i30 = this.f7170u * i29;
                        int i31 = i29 * i25;
                        if (this.f7169t == 1) {
                            viewM4324x2.offsetLeftAndRight(i30 - i31);
                        } else {
                            viewM4324x2.offsetTopAndBottom(i30 - i31);
                        }
                    }
                }
            }
        }
        if (m4326y() > 0) {
            if (this.f7173x) {
                m4374P0(c1127t, c1131x, true);
                m4375Q0(c1127t, c1131x, false);
            } else {
                m4375Q0(c1127t, c1131x, true);
                m4374P0(c1127t, c1131x, false);
            }
        }
        if (z10 && !c1131x.f7146g) {
            if ((this.f7156C == 0 || m4326y() <= 0 || m4381W0() == null) ? false : true) {
                RecyclerView recyclerView = this.f7085b;
                if (recyclerView != null) {
                    recyclerView.removeCallbacks(this.f7164K);
                }
                z11 = m4367I0();
            }
        }
        if (c1131x.f7146g) {
            c1137b.m4401a();
        }
        this.f7157D = c1137b.f7195c;
        this.f7158E = m4382X0();
        if (z11) {
            c1137b.m4401a();
            m4384Z0(c1127t, c1131x, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1130w.b
    /* JADX INFO: renamed from: a */
    public final PointF mo4131a(int i10) {
        int iM4366H0 = m4366H0(i10);
        PointF pointF = new PointF();
        if (iM4366H0 == 0) {
            return null;
        }
        if (this.f7169t == 0) {
            pointF.x = iM4366H0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iM4366H0;
        }
        return pointF;
    }

    /* JADX INFO: renamed from: a1 */
    public final boolean m4385a1(int i10) {
        if (this.f7169t == 0) {
            return (i10 == -1) != this.f7173x;
        }
        return ((i10 == -1) == this.f7173x) == m4382X0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: b0 */
    public final void mo4078b0(int i10, int i11) {
        m4380V0(i10, i11, 1);
    }

    /* JADX INFO: renamed from: b1 */
    public final void m4386b1(int i10, RecyclerView.C1131x c1131x) {
        int iM4376R0;
        int i11;
        if (i10 > 0) {
            iM4376R0 = m4377S0();
            i11 = 1;
        } else {
            iM4376R0 = m4376R0();
            i11 = -1;
        }
        C1168s c1168s = this.f7171v;
        c1168s.f7454a = true;
        m4394j1(iM4376R0, c1131x);
        m4392h1(i11);
        c1168s.f7456c = iM4376R0 + c1168s.f7457d;
        c1168s.f7455b = Math.abs(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: c0 */
    public final void mo4080c0() {
        this.f7155B.m4396a();
        m4322s0();
    }

    /* JADX INFO: renamed from: c1 */
    public final void m4387c1(RecyclerView.C1127t c1127t, C1168s c1168s) {
        int iMin;
        if (c1168s.f7454a && !c1168s.f7462i) {
            if (c1168s.f7455b == 0) {
                if (c1168s.f7458e == -1) {
                    m4388d1(c1168s.f7460g, c1127t);
                    return;
                } else {
                    m4389e1(c1168s.f7459f, c1127t);
                    return;
                }
            }
            int i10 = 1;
            if (c1168s.f7458e == -1) {
                int i11 = c1168s.f7459f;
                int iM4410i = this.f7166q[0].m4410i(i11);
                while (i10 < this.f7165p) {
                    int iM4410i2 = this.f7166q[i10].m4410i(i11);
                    if (iM4410i2 > iM4410i) {
                        iM4410i = iM4410i2;
                    }
                    i10++;
                }
                int i12 = i11 - iM4410i;
                m4388d1(i12 < 0 ? c1168s.f7460g : c1168s.f7460g - Math.min(i12, c1168s.f7455b), c1127t);
                return;
            }
            int i13 = c1168s.f7460g;
            int iM4408f = this.f7166q[0].m4408f(i13);
            while (i10 < this.f7165p) {
                int iM4408f2 = this.f7166q[i10].m4408f(i13);
                if (iM4408f2 < iM4408f) {
                    iM4408f = iM4408f2;
                }
                i10++;
            }
            int i14 = iM4408f - c1168s.f7460g;
            if (i14 < 0) {
                iMin = c1168s.f7459f;
            } else {
                iMin = Math.min(i14, c1168s.f7455b) + c1168s.f7459f;
            }
            m4389e1(iMin, c1127t);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: d */
    public final void mo4134d(String str) {
        if (this.f7159F == null) {
            super.mo4134d(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: d0 */
    public final void mo4082d0(int i10, int i11) {
        m4380V0(i10, i11, 8);
    }

    /* JADX INFO: renamed from: d1 */
    public final void m4388d1(int i10, RecyclerView.C1127t c1127t) {
        for (int iM4326y = m4326y() - 1; iM4326y >= 0; iM4326y--) {
            View viewM4324x = m4324x(iM4326y);
            if (this.f7167r.mo4533e(viewM4324x) < i10 || this.f7167r.mo4542n(viewM4324x) < i10) {
                return;
            }
            C1138c c1138c = (C1138c) viewM4324x.getLayoutParams();
            c1138c.getClass();
            if (c1138c.f7200e.f7201a.size() == 1) {
                return;
            }
            C1139d c1139d = c1138c.f7200e;
            ArrayList<View> arrayList = c1139d.f7201a;
            int size = arrayList.size();
            View viewRemove = arrayList.remove(size - 1);
            C1138c c1138cM4402h = C1139d.m4402h(viewRemove);
            c1138cM4402h.f7200e = null;
            if (c1138cM4402h.m4335c() || c1138cM4402h.m4334b()) {
                c1139d.f7204d -= StaggeredGridLayoutManager.this.f7167r.mo4531c(viewRemove);
            }
            if (size == 1) {
                c1139d.f7202b = Integer.MIN_VALUE;
            }
            c1139d.f7203c = Integer.MIN_VALUE;
            m4317o0(viewM4324x, c1127t);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: e0 */
    public final void mo4083e0(int i10, int i11) {
        m4380V0(i10, i11, 2);
    }

    /* JADX INFO: renamed from: e1 */
    public final void m4389e1(int i10, RecyclerView.C1127t c1127t) {
        while (m4326y() > 0) {
            View viewM4324x = m4324x(0);
            if (this.f7167r.mo4530b(viewM4324x) > i10 || this.f7167r.mo4541m(viewM4324x) > i10) {
                return;
            }
            C1138c c1138c = (C1138c) viewM4324x.getLayoutParams();
            c1138c.getClass();
            if (c1138c.f7200e.f7201a.size() == 1) {
                return;
            }
            C1139d c1139d = c1138c.f7200e;
            ArrayList<View> arrayList = c1139d.f7201a;
            View viewRemove = arrayList.remove(0);
            C1138c c1138cM4402h = C1139d.m4402h(viewRemove);
            c1138cM4402h.f7200e = null;
            if (arrayList.size() == 0) {
                c1139d.f7203c = Integer.MIN_VALUE;
            }
            if (c1138cM4402h.m4335c() || c1138cM4402h.m4334b()) {
                c1139d.f7204d -= StaggeredGridLayoutManager.this.f7167r.mo4531c(viewRemove);
            }
            c1139d.f7202b = Integer.MIN_VALUE;
            m4317o0(viewM4324x, c1127t);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: f */
    public final boolean mo4137f() {
        return this.f7169t == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: f0 */
    public final void mo4084f0(int i10, int i11) {
        m4380V0(i10, i11, 4);
    }

    /* JADX INFO: renamed from: f1 */
    public final void m4390f1() {
        if (this.f7169t != 1 && m4382X0()) {
            this.f7173x = !this.f7172w;
            return;
        }
        this.f7173x = this.f7172w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: g */
    public final boolean mo4139g() {
        return this.f7169t == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: g0 */
    public final void mo4085g0(RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x) {
        m4384Z0(c1127t, c1131x, true);
    }

    /* JADX INFO: renamed from: g1 */
    public final int m4391g1(int i10, RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x) {
        if (m4326y() == 0 || i10 == 0) {
            return 0;
        }
        m4386b1(i10, c1131x);
        C1168s c1168s = this.f7171v;
        int iM4371M0 = m4371M0(c1127t, c1168s, c1131x);
        if (c1168s.f7455b >= iM4371M0) {
            i10 = i10 < 0 ? -iM4371M0 : iM4371M0;
        }
        this.f7167r.mo4543o(-i10);
        this.f7157D = this.f7173x;
        c1168s.f7455b = 0;
        m4387c1(c1127t, c1168s);
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: h */
    public final boolean mo4086h(RecyclerView.C1121n c1121n) {
        return c1121n instanceof C1138c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: h0 */
    public final void mo4087h0(RecyclerView.C1131x c1131x) {
        this.f7175z = -1;
        this.f7154A = Integer.MIN_VALUE;
        this.f7159F = null;
        this.f7161H.m4401a();
    }

    /* JADX INFO: renamed from: h1 */
    public final void m4392h1(int i10) {
        C1168s c1168s = this.f7171v;
        c1168s.f7458e = i10;
        int i11 = 1;
        if (this.f7173x != (i10 == -1)) {
            i11 = -1;
        }
        c1168s.f7457d = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: i0 */
    public final void mo4142i0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f7159F = savedState;
            if (this.f7175z != -1) {
                savedState.f7185d = null;
                savedState.f7184c = 0;
                savedState.f7182a = -1;
                savedState.f7183b = -1;
                savedState.f7185d = null;
                savedState.f7184c = 0;
                savedState.f7186e = 0;
                savedState.f7187f = null;
                savedState.f7188g = null;
            }
            m4322s0();
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final void m4393i1(int i10) {
        mo4134d(null);
        if (i10 != this.f7165p) {
            this.f7155B.m4396a();
            m4322s0();
            this.f7165p = i10;
            this.f7174y = new BitSet(this.f7165p);
            this.f7166q = new C1139d[this.f7165p];
            for (int i11 = 0; i11 < this.f7165p; i11++) {
                this.f7166q[i11] = new C1139d(i11);
            }
            m4322s0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: j */
    public final void mo4144j(int i10, int i11, RecyclerView.C1131x c1131x, RecyclerView.AbstractC1120m.c cVar) {
        C1168s c1168s;
        int iM4408f;
        int iM4410i;
        if (this.f7169t != 0) {
            i10 = i11;
        }
        if (m4326y() == 0 || i10 == 0) {
            return;
        }
        m4386b1(i10, c1131x);
        int[] iArr = this.f7163J;
        if (iArr == null || iArr.length < this.f7165p) {
            this.f7163J = new int[this.f7165p];
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.f7165p;
            c1168s = this.f7171v;
            if (i12 >= i14) {
                break;
            }
            if (c1168s.f7457d == -1) {
                iM4408f = c1168s.f7459f;
                iM4410i = this.f7166q[i12].m4410i(iM4408f);
            } else {
                iM4408f = this.f7166q[i12].m4408f(c1168s.f7460g);
                iM4410i = c1168s.f7460g;
            }
            int i15 = iM4408f - iM4410i;
            if (i15 >= 0) {
                this.f7163J[i13] = i15;
                i13++;
            }
            i12++;
        }
        Arrays.sort(this.f7163J, 0, i13);
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = c1168s.f7456c;
            if (!(i17 >= 0 && i17 < c1131x.m4364b())) {
                return;
            }
            ((RunnableC1164o.b) cVar).m4505a(c1168s.f7456c, this.f7163J[i16]);
            c1168s.f7456c += c1168s.f7457d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: j0 */
    public final Parcelable mo4145j0() {
        int iM4410i;
        int iMo4539k;
        int[] iArr;
        SavedState savedState = this.f7159F;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.f7189h = this.f7172w;
        savedState2.f7190i = this.f7157D;
        savedState2.f7191j = this.f7158E;
        LazySpanLookup lazySpanLookup = this.f7155B;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f7176a) == null) {
            savedState2.f7186e = 0;
        } else {
            savedState2.f7187f = iArr;
            savedState2.f7186e = iArr.length;
            savedState2.f7188g = lazySpanLookup.f7177b;
        }
        int iM4286J = -1;
        if (m4326y() > 0) {
            savedState2.f7182a = this.f7157D ? m4377S0() : m4376R0();
            View viewM4372N0 = this.f7173x ? m4372N0(true) : m4373O0(true);
            if (viewM4372N0 != null) {
                iM4286J = RecyclerView.AbstractC1120m.m4286J(viewM4372N0);
            }
            savedState2.f7183b = iM4286J;
            int i10 = this.f7165p;
            savedState2.f7184c = i10;
            savedState2.f7185d = new int[i10];
            for (int i11 = 0; i11 < this.f7165p; i11++) {
                if (this.f7157D) {
                    iM4410i = this.f7166q[i11].m4408f(Integer.MIN_VALUE);
                    if (iM4410i != Integer.MIN_VALUE) {
                        iMo4539k = this.f7167r.mo4535g();
                        iM4410i -= iMo4539k;
                    }
                } else {
                    iM4410i = this.f7166q[i11].m4410i(Integer.MIN_VALUE);
                    if (iM4410i != Integer.MIN_VALUE) {
                        iMo4539k = this.f7167r.mo4539k();
                        iM4410i -= iMo4539k;
                    }
                }
                savedState2.f7185d[i11] = iM4410i;
            }
        } else {
            savedState2.f7182a = -1;
            savedState2.f7183b = -1;
            savedState2.f7184c = 0;
        }
        return savedState2;
    }

    /* JADX INFO: renamed from: j1 */
    public final void m4394j1(int i10, RecyclerView.C1131x c1131x) {
        int iMo4540l;
        int iMo4540l2;
        int i11;
        C1168s c1168s = this.f7171v;
        boolean z10 = false;
        c1168s.f7455b = 0;
        c1168s.f7456c = i10;
        RecyclerView.AbstractC1130w abstractC1130w = this.f7088e;
        if (!(abstractC1130w != null && abstractC1130w.f7129e) || (i11 = c1131x.f7140a) == -1) {
            iMo4540l = 0;
            iMo4540l2 = 0;
        } else {
            if (this.f7173x == (i11 < i10)) {
                iMo4540l = this.f7167r.mo4540l();
                iMo4540l2 = 0;
            } else {
                iMo4540l2 = this.f7167r.mo4540l();
                iMo4540l = 0;
            }
        }
        RecyclerView recyclerView = this.f7085b;
        if (recyclerView != null && recyclerView.f7016h) {
            c1168s.f7459f = this.f7167r.mo4539k() - iMo4540l2;
            c1168s.f7460g = this.f7167r.mo4535g() + iMo4540l;
        } else {
            c1168s.f7460g = this.f7167r.mo4534f() + iMo4540l;
            c1168s.f7459f = -iMo4540l2;
        }
        c1168s.f7461h = false;
        c1168s.f7454a = true;
        if (this.f7167r.mo4537i() == 0 && this.f7167r.mo4534f() == 0) {
            z10 = true;
        }
        c1168s.f7462i = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: k0 */
    public final void mo4313k0(int i10) {
        if (i10 == 0) {
            m4367I0();
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final void m4395k1(C1139d c1139d, int i10, int i11) {
        int i12 = c1139d.f7204d;
        int i13 = c1139d.f7205e;
        if (i10 != -1) {
            int i14 = c1139d.f7203c;
            if (i14 == Integer.MIN_VALUE) {
                c1139d.m4403a();
                i14 = c1139d.f7203c;
            }
            if (i14 - i12 >= i11) {
                this.f7174y.set(i13, false);
                return;
            }
            return;
        }
        int i15 = c1139d.f7202b;
        if (i15 == Integer.MIN_VALUE) {
            View view = c1139d.f7201a.get(0);
            C1138c c1138cM4402h = C1139d.m4402h(view);
            c1139d.f7202b = StaggeredGridLayoutManager.this.f7167r.mo4533e(view);
            c1138cM4402h.getClass();
            i15 = c1139d.f7202b;
        }
        if (i15 + i12 <= i11) {
            this.f7174y.set(i13, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: l */
    public final int mo4148l(RecyclerView.C1131x c1131x) {
        return m4368J0(c1131x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: m */
    public final int mo4089m(RecyclerView.C1131x c1131x) {
        return m4369K0(c1131x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: n */
    public final int mo4090n(RecyclerView.C1131x c1131x) {
        return m4370L0(c1131x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: o */
    public final int mo4151o(RecyclerView.C1131x c1131x) {
        return m4368J0(c1131x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: p */
    public final int mo4093p(RecyclerView.C1131x c1131x) {
        return m4369K0(c1131x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: q */
    public final int mo4095q(RecyclerView.C1131x c1131x) {
        return m4370L0(c1131x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: t */
    public final RecyclerView.C1121n mo4099t() {
        return this.f7169t == 0 ? new C1138c(-2, -1) : new C1138c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: t0 */
    public final int mo4100t0(int i10, RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x) {
        return m4391g1(i10, c1127t, c1131x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: u */
    public final RecyclerView.C1121n mo4102u(Context context, AttributeSet attributeSet) {
        return new C1138c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: u0 */
    public final void mo4153u0(int i10) {
        SavedState savedState = this.f7159F;
        if (savedState != null && savedState.f7182a != i10) {
            savedState.f7185d = null;
            savedState.f7184c = 0;
            savedState.f7182a = -1;
            savedState.f7183b = -1;
        }
        this.f7175z = i10;
        this.f7154A = Integer.MIN_VALUE;
        m4322s0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: v */
    public final RecyclerView.C1121n mo4104v(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1138c((ViewGroup.MarginLayoutParams) layoutParams) : new C1138c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: v0 */
    public final int mo4105v0(int i10, RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x) {
        return m4391g1(i10, c1127t, c1131x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: y0 */
    public final void mo4106y0(Rect rect, int i10, int i11) {
        int iM4292i;
        int iM4292i2;
        int iM4304H = m4304H() + m4303G();
        int iM4301F = m4301F() + m4305I();
        if (this.f7169t == 1) {
            int iHeight = rect.height() + iM4301F;
            RecyclerView recyclerView = this.f7085b;
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            iM4292i2 = RecyclerView.AbstractC1120m.m4292i(i11, iHeight, C10029b0.d.m18667d(recyclerView));
            iM4292i = RecyclerView.AbstractC1120m.m4292i(i10, (this.f7170u * this.f7165p) + iM4304H, C10029b0.d.m18668e(this.f7085b));
        } else {
            int iWidth = rect.width() + iM4304H;
            RecyclerView recyclerView2 = this.f7085b;
            WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
            iM4292i = RecyclerView.AbstractC1120m.m4292i(i10, iWidth, C10029b0.d.m18668e(recyclerView2));
            iM4292i2 = RecyclerView.AbstractC1120m.m4292i(i11, (this.f7170u * this.f7165p) + iM4301F, C10029b0.d.m18667d(this.f7085b));
        }
        this.f7085b.setMeasuredDimension(iM4292i, iM4292i2);
    }
}
