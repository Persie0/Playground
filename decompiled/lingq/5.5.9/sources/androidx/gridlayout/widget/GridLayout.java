package androidx.gridlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.media.session.C0166e;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Pair;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.activity.result.C0204c;
import com.linguist.R;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import p003a2.C0009a;
import p330q3.C8492a;
import p405u3.C9396a;
import p471x2.C10029b0;
import p471x2.C10037f0;
import p471x2.C10049l0;

/* JADX INFO: loaded from: classes.dex */
public class GridLayout extends ViewGroup {

    /* JADX INFO: renamed from: M */
    public static final C0991c f6440M;

    /* JADX INFO: renamed from: N */
    public static final C0992d f6441N;

    /* JADX INFO: renamed from: O */
    public static final C0991c f6442O;

    /* JADX INFO: renamed from: P */
    public static final C0992d f6443P;

    /* JADX INFO: renamed from: Q */
    public static final C1005a f6444Q;

    /* JADX INFO: renamed from: R */
    public static final C1005a f6445R;

    /* JADX INFO: renamed from: S */
    public static final C0993e f6446S;

    /* JADX INFO: renamed from: T */
    public static final C0994f f6447T;

    /* JADX INFO: renamed from: U */
    public static final C0995g f6448U;

    /* JADX INFO: renamed from: a */
    public final C0998j f6453a;

    /* JADX INFO: renamed from: b */
    public final C0998j f6454b;

    /* JADX INFO: renamed from: c */
    public int f6455c;

    /* JADX INFO: renamed from: d */
    public boolean f6456d;

    /* JADX INFO: renamed from: e */
    public int f6457e;

    /* JADX INFO: renamed from: f */
    public final int f6458f;

    /* JADX INFO: renamed from: g */
    public int f6459g;

    /* JADX INFO: renamed from: h */
    public Printer f6460h;

    /* JADX INFO: renamed from: i */
    public static final LogPrinter f6449i = new LogPrinter(3, GridLayout.class.getName());

    /* JADX INFO: renamed from: j */
    public static final C0989a f6450j = new C0989a();

    /* JADX INFO: renamed from: k */
    public static final int f6451k = 3;

    /* JADX INFO: renamed from: l */
    public static final int f6452l = 4;

    /* JADX INFO: renamed from: H */
    public static final int f6435H = 1;

    /* JADX INFO: renamed from: I */
    public static final int f6436I = 6;

    /* JADX INFO: renamed from: J */
    public static final int f6437J = 5;

    /* JADX INFO: renamed from: K */
    public static final int f6438K = 2;

    /* JADX INFO: renamed from: L */
    public static final C0990b f6439L = new C0990b();

    public static final class Assoc<K, V> extends ArrayList<Pair<K, V>> {

        /* JADX INFO: renamed from: a */
        public final Class<K> f6461a;

        /* JADX INFO: renamed from: b */
        public final Class<V> f6462b;

        public Assoc(Class<K> cls, Class<V> cls2) {
            this.f6461a = cls;
            this.f6462b = cls2;
        }

        /* JADX INFO: renamed from: s */
        public final C1003o<K, V> m3853s() {
            int size = size();
            Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.f6461a, size);
            Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) this.f6462b, size);
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = get(i10).first;
                objArr2[i10] = get(i10).second;
            }
            return new C1003o<>(objArr, objArr2);
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$a */
    public static class C0989a implements Printer {
        @Override // android.util.Printer
        public final void println(String str) {
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$b */
    public static class C0990b extends AbstractC0996h {
        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0996h
        /* JADX INFO: renamed from: a */
        public final int mo3854a(View view, int i10, int i11) {
            return Integer.MIN_VALUE;
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0996h
        /* JADX INFO: renamed from: c */
        public final String mo3855c() {
            return "UNDEFINED";
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0996h
        /* JADX INFO: renamed from: d */
        public final int mo3856d(View view, int i10) {
            return Integer.MIN_VALUE;
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$c */
    public static class C0991c extends AbstractC0996h {
        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0996h
        /* JADX INFO: renamed from: a */
        public final int mo3854a(View view, int i10, int i11) {
            return 0;
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0996h
        /* JADX INFO: renamed from: c */
        public final String mo3855c() {
            return "LEADING";
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0996h
        /* JADX INFO: renamed from: d */
        public final int mo3856d(View view, int i10) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$d */
    public static class C0992d extends AbstractC0996h {
        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0996h
        /* JADX INFO: renamed from: a */
        public final int mo3854a(View view, int i10, int i11) {
            return i10;
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0996h
        /* JADX INFO: renamed from: c */
        public final String mo3855c() {
            return "TRAILING";
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0996h
        /* JADX INFO: renamed from: d */
        public final int mo3856d(View view, int i10) {
            return i10;
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$e */
    public static class C0993e extends AbstractC0996h {
        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0996h
        /* JADX INFO: renamed from: a */
        public final int mo3854a(View view, int i10, int i11) {
            return i10 >> 1;
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0996h
        /* JADX INFO: renamed from: c */
        public final String mo3855c() {
            return "CENTER";
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0996h
        /* JADX INFO: renamed from: d */
        public final int mo3856d(View view, int i10) {
            return i10 >> 1;
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$f */
    public static class C0994f extends AbstractC0996h {

        /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$f$a */
        public class a extends C0999k {

            /* JADX INFO: renamed from: d */
            public int f6463d;

            @Override // androidx.gridlayout.widget.GridLayout.C0999k
            /* JADX INFO: renamed from: a */
            public final int mo3858a(GridLayout gridLayout, View view, AbstractC0996h abstractC0996h, int i10, boolean z10) {
                return Math.max(0, super.mo3858a(gridLayout, view, abstractC0996h, i10, z10));
            }

            @Override // androidx.gridlayout.widget.GridLayout.C0999k
            /* JADX INFO: renamed from: b */
            public final void mo3859b(int i10, int i11) {
                super.mo3859b(i10, i11);
                this.f6463d = Math.max(this.f6463d, i10 + i11);
            }

            @Override // androidx.gridlayout.widget.GridLayout.C0999k
            /* JADX INFO: renamed from: c */
            public final void mo3860c() {
                super.mo3860c();
                this.f6463d = Integer.MIN_VALUE;
            }

            @Override // androidx.gridlayout.widget.GridLayout.C0999k
            /* JADX INFO: renamed from: d */
            public final int mo3861d(boolean z10) {
                return Math.max(super.mo3861d(z10), this.f6463d);
            }
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0996h
        /* JADX INFO: renamed from: a */
        public final int mo3854a(View view, int i10, int i11) {
            if (view.getVisibility() == 8) {
                return 0;
            }
            int baseline = view.getBaseline();
            if (baseline == -1) {
                return Integer.MIN_VALUE;
            }
            return baseline;
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0996h
        /* JADX INFO: renamed from: b */
        public final C0999k mo3857b() {
            return new a();
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0996h
        /* JADX INFO: renamed from: c */
        public final String mo3855c() {
            return "BASELINE";
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0996h
        /* JADX INFO: renamed from: d */
        public final int mo3856d(View view, int i10) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$g */
    public static class C0995g extends AbstractC0996h {
        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0996h
        /* JADX INFO: renamed from: a */
        public final int mo3854a(View view, int i10, int i11) {
            return Integer.MIN_VALUE;
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0996h
        /* JADX INFO: renamed from: c */
        public final String mo3855c() {
            return "FILL";
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0996h
        /* JADX INFO: renamed from: d */
        public final int mo3856d(View view, int i10) {
            return 0;
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0996h
        /* JADX INFO: renamed from: e */
        public final int mo3862e(int i10, int i11) {
            return i11;
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$h */
    public static abstract class AbstractC0996h {
        /* JADX INFO: renamed from: a */
        public abstract int mo3854a(View view, int i10, int i11);

        /* JADX INFO: renamed from: b */
        public C0999k mo3857b() {
            return new C0999k();
        }

        /* JADX INFO: renamed from: c */
        public abstract String mo3855c();

        /* JADX INFO: renamed from: d */
        public abstract int mo3856d(View view, int i10);

        /* JADX INFO: renamed from: e */
        public int mo3862e(int i10, int i11) {
            return i10;
        }

        public final String toString() {
            return "Alignment:" + mo3855c();
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$i */
    public static final class C0997i {

        /* JADX INFO: renamed from: a */
        public final C1000l f6464a;

        /* JADX INFO: renamed from: b */
        public final C1002n f6465b;

        /* JADX INFO: renamed from: c */
        public boolean f6466c = true;

        public C0997i(C1000l c1000l, C1002n c1002n) {
            this.f6464a = c1000l;
            this.f6465b = c1002n;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f6464a);
            sb2.append(" ");
            sb2.append(!this.f6466c ? "+>" : "->");
            sb2.append(" ");
            sb2.append(this.f6465b);
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$j */
    public final class C0998j {

        /* JADX INFO: renamed from: a */
        public final boolean f6467a;

        /* JADX INFO: renamed from: d */
        public C1003o<C1004p, C0999k> f6470d;

        /* JADX INFO: renamed from: f */
        public C1003o<C1000l, C1002n> f6472f;

        /* JADX INFO: renamed from: h */
        public C1003o<C1000l, C1002n> f6474h;

        /* JADX INFO: renamed from: j */
        public int[] f6476j;

        /* JADX INFO: renamed from: l */
        public int[] f6478l;

        /* JADX INFO: renamed from: n */
        public C0997i[] f6480n;

        /* JADX INFO: renamed from: p */
        public int[] f6482p;

        /* JADX INFO: renamed from: r */
        public boolean f6484r;

        /* JADX INFO: renamed from: t */
        public int[] f6486t;

        /* JADX INFO: renamed from: b */
        public int f6468b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c */
        public int f6469c = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: e */
        public boolean f6471e = false;

        /* JADX INFO: renamed from: g */
        public boolean f6473g = false;

        /* JADX INFO: renamed from: i */
        public boolean f6475i = false;

        /* JADX INFO: renamed from: k */
        public boolean f6477k = false;

        /* JADX INFO: renamed from: m */
        public boolean f6479m = false;

        /* JADX INFO: renamed from: o */
        public boolean f6481o = false;

        /* JADX INFO: renamed from: q */
        public boolean f6483q = false;

        /* JADX INFO: renamed from: s */
        public boolean f6485s = false;

        /* JADX INFO: renamed from: u */
        public boolean f6487u = true;

        /* JADX INFO: renamed from: v */
        public final C1002n f6488v = new C1002n(0);

        /* JADX INFO: renamed from: w */
        public final C1002n f6489w = new C1002n(-100000);

        public C0998j(boolean z10) {
            this.f6467a = z10;
        }

        /* JADX INFO: renamed from: k */
        public static void m3863k(ArrayList arrayList, C1000l c1000l, C1002n c1002n, boolean z10) {
            if (c1000l.f6495b - c1000l.f6494a == 0) {
                return;
            }
            if (z10) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((C0997i) it.next()).f6464a.equals(c1000l)) {
                        return;
                    }
                }
            }
            arrayList.add(new C0997i(c1000l, c1002n));
        }

        /* JADX INFO: renamed from: a */
        public final String m3864a(ArrayList arrayList) {
            String str = this.f6467a ? "x" : "y";
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList.iterator();
            boolean z10 = true;
            while (it.hasNext()) {
                C0997i c0997i = (C0997i) it.next();
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append(", ");
                }
                C1000l c1000l = c0997i.f6464a;
                int i10 = c1000l.f6494a;
                int i11 = c0997i.f6465b.f6499a;
                int i12 = c1000l.f6495b;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                if (i10 < i12) {
                    sb3.append(i12);
                    sb3.append("-");
                    sb3.append(str);
                    sb3.append(i10);
                    sb3.append(">=");
                } else {
                    sb3.append(i10);
                    sb3.append("-");
                    sb3.append(str);
                    sb3.append(i12);
                    sb3.append("<=");
                    i11 = -i11;
                }
                sb3.append(i11);
                sb2.append(sb3.toString());
            }
            return sb2.toString();
        }

        /* JADX INFO: renamed from: b */
        public final void m3865b(C1003o<C1000l, C1002n> c1003o, boolean z10) {
            for (C1002n c1002n : c1003o.f6502c) {
                c1002n.f6499a = Integer.MIN_VALUE;
            }
            C0999k[] c0999kArr = m3870g().f6502c;
            for (int i10 = 0; i10 < c0999kArr.length; i10++) {
                int iMo3861d = c0999kArr[i10].mo3861d(z10);
                C1002n c1002n2 = c1003o.f6502c[c1003o.f6500a[i10]];
                int i11 = c1002n2.f6499a;
                if (!z10) {
                    iMo3861d = -iMo3861d;
                }
                c1002n2.f6499a = Math.max(i11, iMo3861d);
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m3866c(boolean z10) {
            int[] iArr = z10 ? this.f6476j : this.f6478l;
            GridLayout gridLayout = GridLayout.this;
            int childCount = gridLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = gridLayout.getChildAt(i10);
                if (childAt.getVisibility() != 8) {
                    gridLayout.getClass();
                    C1001m c1001m = (C1001m) childAt.getLayoutParams();
                    boolean z11 = this.f6467a;
                    C1000l c1000l = (z11 ? c1001m.f6498b : c1001m.f6497a).f6505b;
                    int i11 = z10 ? c1000l.f6494a : c1000l.f6495b;
                    iArr[i11] = Math.max(iArr[i11], gridLayout.m3849f(childAt, z11, z10));
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public final C1003o<C1000l, C1002n> m3867d(boolean z10) {
            C1000l c1000l;
            Assoc assoc = new Assoc(C1000l.class, C1002n.class);
            C1004p[] c1004pArr = m3870g().f6501b;
            int length = c1004pArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (z10) {
                    c1000l = c1004pArr[i10].f6505b;
                } else {
                    C1000l c1000l2 = c1004pArr[i10].f6505b;
                    c1000l = new C1000l(c1000l2.f6495b, c1000l2.f6494a);
                }
                assoc.add(Pair.create(c1000l, new C1002n()));
            }
            return assoc.m3853s();
        }

        /* JADX INFO: renamed from: e */
        public final C0997i[] m3868e() {
            if (this.f6480n == null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (this.f6472f == null) {
                    this.f6472f = m3867d(true);
                }
                if (!this.f6473g) {
                    m3865b(this.f6472f, true);
                    this.f6473g = true;
                }
                C1003o<C1000l, C1002n> c1003o = this.f6472f;
                int i10 = 0;
                while (true) {
                    C1000l[] c1000lArr = c1003o.f6501b;
                    if (i10 >= c1000lArr.length) {
                        break;
                    }
                    m3863k(arrayList, c1000lArr[i10], c1003o.f6502c[i10], false);
                    i10++;
                }
                if (this.f6474h == null) {
                    this.f6474h = m3867d(false);
                }
                if (!this.f6475i) {
                    m3865b(this.f6474h, false);
                    this.f6475i = true;
                }
                C1003o<C1000l, C1002n> c1003o2 = this.f6474h;
                int i11 = 0;
                while (true) {
                    C1000l[] c1000lArr2 = c1003o2.f6501b;
                    if (i11 >= c1000lArr2.length) {
                        break;
                    }
                    m3863k(arrayList2, c1000lArr2[i11], c1003o2.f6502c[i11], false);
                    i11++;
                }
                if (this.f6487u) {
                    int i12 = 0;
                    while (i12 < m3869f()) {
                        int i13 = i12 + 1;
                        m3863k(arrayList, new C1000l(i12, i13), new C1002n(0), true);
                        i12 = i13;
                    }
                }
                int iM3869f = m3869f();
                m3863k(arrayList, new C1000l(0, iM3869f), this.f6488v, false);
                m3863k(arrayList2, new C1000l(iM3869f, 0), this.f6489w, false);
                C0997i[] c0997iArrM3879q = m3879q(arrayList);
                C0997i[] c0997iArrM3879q2 = m3879q(arrayList2);
                LogPrinter logPrinter = GridLayout.f6449i;
                Object[] objArr = (Object[]) Array.newInstance(c0997iArrM3879q.getClass().getComponentType(), c0997iArrM3879q.length + c0997iArrM3879q2.length);
                System.arraycopy(c0997iArrM3879q, 0, objArr, 0, c0997iArrM3879q.length);
                System.arraycopy(c0997iArrM3879q2, 0, objArr, c0997iArrM3879q.length, c0997iArrM3879q2.length);
                this.f6480n = (C0997i[]) objArr;
            }
            if (!this.f6481o) {
                if (this.f6472f == null) {
                    this.f6472f = m3867d(true);
                }
                if (!this.f6473g) {
                    m3865b(this.f6472f, true);
                    this.f6473g = true;
                }
                if (this.f6474h == null) {
                    this.f6474h = m3867d(false);
                }
                if (!this.f6475i) {
                    m3865b(this.f6474h, false);
                    this.f6475i = true;
                }
                this.f6481o = true;
            }
            return this.f6480n;
        }

        /* JADX INFO: renamed from: f */
        public final int m3869f() {
            return Math.max(this.f6468b, m3872i());
        }

        /* JADX INFO: renamed from: g */
        public final C1003o<C1004p, C0999k> m3870g() {
            int iM3848e;
            int i10;
            C1003o<C1004p, C0999k> c1003o = this.f6470d;
            boolean z10 = this.f6467a;
            GridLayout gridLayout = GridLayout.this;
            if (c1003o == null) {
                Assoc assoc = new Assoc(C1004p.class, C0999k.class);
                int childCount = gridLayout.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = gridLayout.getChildAt(i11);
                    LogPrinter logPrinter = GridLayout.f6449i;
                    C1001m c1001m = (C1001m) childAt.getLayoutParams();
                    C1004p c1004p = z10 ? c1001m.f6498b : c1001m.f6497a;
                    assoc.add(Pair.create(c1004p, c1004p.m3881a(z10).mo3857b()));
                }
                this.f6470d = assoc.m3853s();
            }
            if (!this.f6471e) {
                for (C0999k c0999k : this.f6470d.f6502c) {
                    c0999k.mo3860c();
                }
                int childCount2 = gridLayout.getChildCount();
                for (int i12 = 0; i12 < childCount2; i12++) {
                    View childAt2 = gridLayout.getChildAt(i12);
                    LogPrinter logPrinter2 = GridLayout.f6449i;
                    C1001m c1001m2 = (C1001m) childAt2.getLayoutParams();
                    C1004p c1004p2 = z10 ? c1001m2.f6498b : c1001m2.f6497a;
                    if (childAt2.getVisibility() == 8) {
                        iM3848e = 0;
                    } else {
                        iM3848e = gridLayout.m3848e(childAt2, z10, false) + gridLayout.m3848e(childAt2, z10, true) + (z10 ? childAt2.getMeasuredWidth() : childAt2.getMeasuredHeight());
                    }
                    if (c1004p2.f6507d == 0.0f) {
                        i10 = 0;
                    } else {
                        if (this.f6486t == null) {
                            this.f6486t = new int[gridLayout.getChildCount()];
                        }
                        i10 = this.f6486t[i12];
                    }
                    int i13 = iM3848e + i10;
                    C1003o<C1004p, C0999k> c1003o2 = this.f6470d;
                    C0999k c0999k2 = c1003o2.f6502c[c1003o2.f6500a[i12]];
                    c0999k2.f6493c = ((c1004p2.f6506c == GridLayout.f6439L && c1004p2.f6507d == 0.0f) ? 0 : 2) & c0999k2.f6493c;
                    int iMo3854a = c1004p2.m3881a(z10).mo3854a(childAt2, i13, C10037f0.m18800a(gridLayout));
                    c0999k2.mo3859b(iMo3854a, i13 - iMo3854a);
                }
                this.f6471e = true;
            }
            return this.f6470d;
        }

        /* JADX INFO: renamed from: h */
        public final int[] m3871h() {
            boolean z10;
            if (this.f6482p == null) {
                this.f6482p = new int[m3869f() + 1];
            }
            if (!this.f6483q) {
                int[] iArr = this.f6482p;
                boolean z11 = this.f6485s;
                GridLayout gridLayout = GridLayout.this;
                float f3 = 0.0f;
                boolean z12 = this.f6467a;
                if (!z11) {
                    int childCount = gridLayout.getChildCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= childCount) {
                            z10 = false;
                            break;
                        }
                        View childAt = gridLayout.getChildAt(i10);
                        if (childAt.getVisibility() != 8) {
                            C1001m c1001m = (C1001m) childAt.getLayoutParams();
                            if ((z12 ? c1001m.f6498b : c1001m.f6497a).f6507d != 0.0f) {
                                z10 = true;
                                break;
                            }
                        }
                        i10++;
                    }
                    this.f6484r = z10;
                    this.f6485s = true;
                }
                if (this.f6484r) {
                    if (this.f6486t == null) {
                        this.f6486t = new int[gridLayout.getChildCount()];
                    }
                    Arrays.fill(this.f6486t, 0);
                    m3878p(m3868e(), iArr, true);
                    int childCount2 = (gridLayout.getChildCount() * this.f6488v.f6499a) + 1;
                    if (childCount2 >= 2) {
                        int childCount3 = gridLayout.getChildCount();
                        for (int i11 = 0; i11 < childCount3; i11++) {
                            View childAt2 = gridLayout.getChildAt(i11);
                            if (childAt2.getVisibility() != 8) {
                                C1001m c1001m2 = (C1001m) childAt2.getLayoutParams();
                                f3 += (z12 ? c1001m2.f6498b : c1001m2.f6497a).f6507d;
                            }
                        }
                        int i12 = -1;
                        boolean z13 = true;
                        int i13 = 0;
                        while (i13 < childCount2) {
                            int i14 = (int) ((((long) i13) + ((long) childCount2)) / 2);
                            m3875m();
                            m3877o(i14, f3);
                            boolean zM3878p = m3878p(m3868e(), iArr, false);
                            if (zM3878p) {
                                i13 = i14 + 1;
                                i12 = i14;
                            } else {
                                childCount2 = i14;
                            }
                            z13 = zM3878p;
                        }
                        if (i12 > 0 && !z13) {
                            m3875m();
                            m3877o(i12, f3);
                            m3878p(m3868e(), iArr, true);
                        }
                    }
                } else {
                    m3878p(m3868e(), iArr, true);
                }
                if (!this.f6487u) {
                    int i15 = iArr[0];
                    int length = iArr.length;
                    for (int i16 = 0; i16 < length; i16++) {
                        iArr[i16] = iArr[i16] - i15;
                    }
                }
                this.f6483q = true;
            }
            return this.f6482p;
        }

        /* JADX INFO: renamed from: i */
        public final int m3872i() {
            if (this.f6469c == Integer.MIN_VALUE) {
                GridLayout gridLayout = GridLayout.this;
                int childCount = gridLayout.getChildCount();
                int iMax = -1;
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = gridLayout.getChildAt(i10);
                    LogPrinter logPrinter = GridLayout.f6449i;
                    C1001m c1001m = (C1001m) childAt.getLayoutParams();
                    C1000l c1000l = (this.f6467a ? c1001m.f6498b : c1001m.f6497a).f6505b;
                    int iMax2 = Math.max(iMax, c1000l.f6494a);
                    int i11 = c1000l.f6495b;
                    iMax = Math.max(Math.max(iMax2, i11), i11 - c1000l.f6494a);
                }
                this.f6469c = Math.max(0, iMax != -1 ? iMax : Integer.MIN_VALUE);
            }
            return this.f6469c;
        }

        /* JADX INFO: renamed from: j */
        public final int m3873j(int i10) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            C1002n c1002n = this.f6489w;
            C1002n c1002n2 = this.f6488v;
            if (mode == Integer.MIN_VALUE) {
                c1002n2.f6499a = 0;
                c1002n.f6499a = -size;
                this.f6483q = false;
                return m3871h()[m3869f()];
            }
            if (mode == 0) {
                c1002n2.f6499a = 0;
                c1002n.f6499a = -100000;
                this.f6483q = false;
                return m3871h()[m3869f()];
            }
            if (mode != 1073741824) {
                return 0;
            }
            c1002n2.f6499a = size;
            c1002n.f6499a = -size;
            this.f6483q = false;
            return m3871h()[m3869f()];
        }

        /* JADX INFO: renamed from: l */
        public final void m3874l() {
            this.f6469c = Integer.MIN_VALUE;
            this.f6470d = null;
            this.f6472f = null;
            this.f6474h = null;
            this.f6476j = null;
            this.f6478l = null;
            this.f6480n = null;
            this.f6482p = null;
            this.f6486t = null;
            this.f6485s = false;
            m3875m();
        }

        /* JADX INFO: renamed from: m */
        public final void m3875m() {
            this.f6471e = false;
            this.f6473g = false;
            this.f6475i = false;
            this.f6477k = false;
            this.f6479m = false;
            this.f6481o = false;
            this.f6483q = false;
        }

        /* JADX INFO: renamed from: n */
        public final void m3876n(int i10) {
            if (i10 == Integer.MIN_VALUE || i10 >= m3872i()) {
                this.f6468b = i10;
            } else {
                GridLayout.m3842g((this.f6467a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
                throw null;
            }
        }

        /* JADX INFO: renamed from: o */
        public final void m3877o(int i10, float f3) {
            Arrays.fill(this.f6486t, 0);
            GridLayout gridLayout = GridLayout.this;
            int childCount = gridLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = gridLayout.getChildAt(i11);
                if (childAt.getVisibility() != 8) {
                    gridLayout.getClass();
                    C1001m c1001m = (C1001m) childAt.getLayoutParams();
                    float f10 = (this.f6467a ? c1001m.f6498b : c1001m.f6497a).f6507d;
                    if (f10 != 0.0f) {
                        int iRound = Math.round((i10 * f10) / f3);
                        this.f6486t[i11] = iRound;
                        i10 -= iRound;
                        f3 -= f10;
                    }
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0042  */
        /* JADX WARN: Code duplicated, block: B:48:0x00c3  */
        /* JADX INFO: renamed from: p */
        public final boolean m3878p(C0997i[] c0997iArr, int[] iArr, boolean z10) {
            boolean z11;
            boolean z12;
            String str = this.f6467a ? "horizontal" : "vertical";
            boolean z13 = true;
            int iM3869f = m3869f() + 1;
            boolean[] zArr = null;
            int i10 = 0;
            while (i10 < c0997iArr.length) {
                Arrays.fill(iArr, 0);
                for (int i11 = 0; i11 < iM3869f; i11++) {
                    boolean z14 = false;
                    for (C0997i c0997i : c0997iArr) {
                        if (c0997i.f6466c) {
                            C1000l c1000l = c0997i.f6464a;
                            int i12 = iArr[c1000l.f6494a] + c0997i.f6465b.f6499a;
                            int i13 = c1000l.f6495b;
                            if (i12 > iArr[i13]) {
                                iArr[i13] = i12;
                                z12 = z13;
                            } else {
                                z12 = false;
                            }
                        } else {
                            z12 = false;
                        }
                        z14 |= z12;
                    }
                    if (!z14) {
                        if (zArr != null) {
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            for (int i14 = 0; i14 < c0997iArr.length; i14++) {
                                C0997i c0997i2 = c0997iArr[i14];
                                if (zArr[i14]) {
                                    arrayList.add(c0997i2);
                                }
                                if (!c0997i2.f6466c) {
                                    arrayList2.add(c0997i2);
                                }
                            }
                            Printer printer = GridLayout.this.f6460h;
                            StringBuilder sbM26o = C0009a.m26o(str, " constraints: ");
                            sbM26o.append(m3864a(arrayList));
                            sbM26o.append(" are inconsistent; permanently removing: ");
                            sbM26o.append(m3864a(arrayList2));
                            sbM26o.append(". ");
                            printer.println(sbM26o.toString());
                        }
                        return z13;
                    }
                }
                if (!z10) {
                    return false;
                }
                boolean[] zArr2 = new boolean[c0997iArr.length];
                for (int i15 = 0; i15 < iM3869f; i15++) {
                    int length = c0997iArr.length;
                    for (int i16 = 0; i16 < length; i16++) {
                        boolean z15 = zArr2[i16];
                        C0997i c0997i3 = c0997iArr[i16];
                        if (c0997i3.f6466c) {
                            C1000l c1000l2 = c0997i3.f6464a;
                            int i17 = iArr[c1000l2.f6494a] + c0997i3.f6465b.f6499a;
                            int i18 = c1000l2.f6495b;
                            if (i17 > iArr[i18]) {
                                iArr[i18] = i17;
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        } else {
                            z11 = false;
                        }
                        zArr2[i16] = z15 | z11;
                    }
                }
                if (i10 == 0) {
                    zArr = zArr2;
                }
                for (int i19 = 0; i19 < c0997iArr.length; i19++) {
                    if (zArr2[i19]) {
                        C0997i c0997i4 = c0997iArr[i19];
                        C1000l c1000l3 = c0997i4.f6464a;
                        if (c1000l3.f6494a >= c1000l3.f6495b) {
                            c0997i4.f6466c = false;
                            break;
                        }
                    }
                }
                i10++;
                z13 = true;
            }
            return z13;
        }

        /* JADX INFO: renamed from: q */
        public final C0997i[] m3879q(ArrayList arrayList) {
            C1006b c1006b = new C1006b(this, (C0997i[]) arrayList.toArray(new C0997i[arrayList.size()]));
            int length = c1006b.f6512c.length;
            for (int i10 = 0; i10 < length; i10++) {
                c1006b.m3882a(i10);
            }
            return c1006b.f6510a;
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$k */
    public static class C0999k {

        /* JADX INFO: renamed from: a */
        public int f6491a;

        /* JADX INFO: renamed from: b */
        public int f6492b;

        /* JADX INFO: renamed from: c */
        public int f6493c;

        public C0999k() {
            mo3860c();
        }

        /* JADX INFO: renamed from: a */
        public int mo3858a(GridLayout gridLayout, View view, AbstractC0996h abstractC0996h, int i10, boolean z10) {
            return this.f6491a - abstractC0996h.mo3854a(view, i10, C10037f0.m18800a(gridLayout));
        }

        /* JADX INFO: renamed from: b */
        public void mo3859b(int i10, int i11) {
            this.f6491a = Math.max(this.f6491a, i10);
            this.f6492b = Math.max(this.f6492b, i11);
        }

        /* JADX INFO: renamed from: c */
        public void mo3860c() {
            this.f6491a = Integer.MIN_VALUE;
            this.f6492b = Integer.MIN_VALUE;
            this.f6493c = 2;
        }

        /* JADX INFO: renamed from: d */
        public int mo3861d(boolean z10) {
            if (!z10) {
                int i10 = this.f6493c;
                LogPrinter logPrinter = GridLayout.f6449i;
                if ((i10 & 2) != 0) {
                    return 100000;
                }
            }
            return this.f6491a + this.f6492b;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Bounds{before=");
            sb2.append(this.f6491a);
            sb2.append(", after=");
            return C0204c.m853l(sb2, this.f6492b, '}');
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$l */
    public static final class C1000l {

        /* JADX INFO: renamed from: a */
        public final int f6494a;

        /* JADX INFO: renamed from: b */
        public final int f6495b;

        public C1000l(int i10, int i11) {
            this.f6494a = i10;
            this.f6495b = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C1000l.class == obj.getClass()) {
                C1000l c1000l = (C1000l) obj;
                return this.f6495b == c1000l.f6495b && this.f6494a == c1000l.f6494a;
            }
            return false;
        }

        public final int hashCode() {
            return (this.f6494a * 31) + this.f6495b;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(this.f6494a);
            sb2.append(", ");
            return C0166e.m768o(sb2, this.f6495b, "]");
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$m */
    public static class C1001m extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: c */
        public static final int f6496c = 1;

        /* JADX INFO: renamed from: a */
        public C1004p f6497a;

        /* JADX INFO: renamed from: b */
        public C1004p f6498b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1001m() {
            super(-2, -2);
            C1004p c1004p = C1004p.f6503e;
            this.f6497a = c1004p;
            this.f6498b = c1004p;
            setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
            this.f6497a = c1004p;
            this.f6498b = c1004p;
        }

        public C1001m(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C1004p c1004p = C1004p.f6503e;
            this.f6497a = c1004p;
            this.f6498b = c1004p;
            int[] iArr = C8492a.f45687b;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
            try {
                int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
                ((ViewGroup.MarginLayoutParams) this).leftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).rightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
                typedArrayObtainStyledAttributes.recycle();
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr);
                try {
                    int i10 = typedArrayObtainStyledAttributes2.getInt(10, 0);
                    int i11 = typedArrayObtainStyledAttributes2.getInt(7, Integer.MIN_VALUE);
                    int i12 = f6496c;
                    this.f6498b = GridLayout.m3844l(i11, typedArrayObtainStyledAttributes2.getInt(8, i12), GridLayout.m3841d(i10, true), typedArrayObtainStyledAttributes2.getFloat(9, 0.0f));
                    this.f6497a = GridLayout.m3844l(typedArrayObtainStyledAttributes2.getInt(11, Integer.MIN_VALUE), typedArrayObtainStyledAttributes2.getInt(12, i12), GridLayout.m3841d(i10, false), typedArrayObtainStyledAttributes2.getFloat(13, 0.0f));
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th2;
                }
            } catch (Throwable th3) {
                typedArrayObtainStyledAttributes.recycle();
                throw th3;
            }
        }

        public C1001m(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            C1004p c1004p = C1004p.f6503e;
            this.f6497a = c1004p;
            this.f6498b = c1004p;
        }

        public C1001m(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            C1004p c1004p = C1004p.f6503e;
            this.f6497a = c1004p;
            this.f6498b = c1004p;
        }

        public C1001m(C1001m c1001m) {
            super((ViewGroup.MarginLayoutParams) c1001m);
            C1004p c1004p = C1004p.f6503e;
            this.f6497a = c1004p;
            this.f6498b = c1004p;
            this.f6497a = c1001m.f6497a;
            this.f6498b = c1001m.f6498b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C1001m.class == obj.getClass()) {
                C1001m c1001m = (C1001m) obj;
                return this.f6498b.equals(c1001m.f6498b) && this.f6497a.equals(c1001m.f6497a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f6498b.hashCode() + (this.f6497a.hashCode() * 31);
        }

        @Override // android.view.ViewGroup.LayoutParams
        public final void setBaseAttributes(TypedArray typedArray, int i10, int i11) {
            ((ViewGroup.MarginLayoutParams) this).width = typedArray.getLayoutDimension(i10, -2);
            ((ViewGroup.MarginLayoutParams) this).height = typedArray.getLayoutDimension(i11, -2);
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$n */
    public static final class C1002n {

        /* JADX INFO: renamed from: a */
        public int f6499a;

        public C1002n() {
            this.f6499a = Integer.MIN_VALUE;
        }

        public C1002n(int i10) {
            this.f6499a = i10;
        }

        public final String toString() {
            return Integer.toString(this.f6499a);
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$o */
    public static final class C1003o<K, V> {

        /* JADX INFO: renamed from: a */
        public final int[] f6500a;

        /* JADX INFO: renamed from: b */
        public final K[] f6501b;

        /* JADX INFO: renamed from: c */
        public final V[] f6502c;

        public C1003o(K[] kArr, V[] vArr) {
            int length = kArr.length;
            int[] iArr = new int[length];
            HashMap map = new HashMap();
            for (int i10 = 0; i10 < length; i10++) {
                K k10 = kArr[i10];
                Integer numValueOf = (Integer) map.get(k10);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(map.size());
                    map.put(k10, numValueOf);
                }
                iArr[i10] = numValueOf.intValue();
            }
            this.f6500a = iArr;
            this.f6501b = (K[]) m3880a(kArr, iArr);
            this.f6502c = (V[]) m3880a(vArr, iArr);
        }

        /* JADX INFO: renamed from: a */
        public static <K> K[] m3880a(K[] kArr, int[] iArr) {
            int length = kArr.length;
            Class<?> componentType = kArr.getClass().getComponentType();
            LogPrinter logPrinter = GridLayout.f6449i;
            int iMax = -1;
            for (int i10 : iArr) {
                iMax = Math.max(iMax, i10);
            }
            K[] kArr2 = (K[]) ((Object[]) Array.newInstance(componentType, iMax + 1));
            for (int i11 = 0; i11 < length; i11++) {
                kArr2[iArr[i11]] = kArr[i11];
            }
            return kArr2;
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$p */
    public static class C1004p {

        /* JADX INFO: renamed from: e */
        public static final C1004p f6503e = GridLayout.m3844l(Integer.MIN_VALUE, 1, GridLayout.f6439L, 0.0f);

        /* JADX INFO: renamed from: a */
        public final boolean f6504a;

        /* JADX INFO: renamed from: b */
        public final C1000l f6505b;

        /* JADX INFO: renamed from: c */
        public final AbstractC0996h f6506c;

        /* JADX INFO: renamed from: d */
        public final float f6507d;

        public C1004p(boolean z10, C1000l c1000l, AbstractC0996h abstractC0996h, float f3) {
            this.f6504a = z10;
            this.f6505b = c1000l;
            this.f6506c = abstractC0996h;
            this.f6507d = f3;
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC0996h m3881a(boolean z10) {
            C0990b c0990b = GridLayout.f6439L;
            AbstractC0996h abstractC0996h = this.f6506c;
            if (abstractC0996h != c0990b) {
                return abstractC0996h;
            }
            if (this.f6507d == 0.0f) {
                return z10 ? GridLayout.f6442O : GridLayout.f6447T;
            }
            return GridLayout.f6448U;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1004p.class != obj.getClass()) {
                return false;
            }
            C1004p c1004p = (C1004p) obj;
            if (this.f6506c.equals(c1004p.f6506c) && this.f6505b.equals(c1004p.f6505b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f6506c.hashCode() + (this.f6505b.hashCode() * 31);
        }
    }

    static {
        C0991c c0991c = new C0991c();
        C0992d c0992d = new C0992d();
        f6440M = c0991c;
        f6441N = c0992d;
        f6442O = c0991c;
        f6443P = c0992d;
        f6444Q = new C1005a(c0991c, c0992d);
        f6445R = new C1005a(c0992d, c0991c);
        f6446S = new C0993e();
        f6447T = new C0994f();
        f6448U = new C0995g();
    }

    public GridLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6453a = new C0998j(true);
        this.f6454b = new C0998j(false);
        this.f6455c = 0;
        this.f6456d = false;
        this.f6457e = 1;
        this.f6459g = 0;
        this.f6460h = f6449i;
        this.f6458f = context.getResources().getDimensionPixelOffset(R.dimen.default_gap);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8492a.f45686a);
        try {
            setRowCount(typedArrayObtainStyledAttributes.getInt(f6452l, Integer.MIN_VALUE));
            setColumnCount(typedArrayObtainStyledAttributes.getInt(f6435H, Integer.MIN_VALUE));
            setOrientation(typedArrayObtainStyledAttributes.getInt(f6451k, 0));
            setUseDefaultMargins(typedArrayObtainStyledAttributes.getBoolean(f6436I, false));
            setAlignmentMode(typedArrayObtainStyledAttributes.getInt(0, 1));
            setRowOrderPreserved(typedArrayObtainStyledAttributes.getBoolean(f6437J, true));
            setColumnOrderPreserved(typedArrayObtainStyledAttributes.getBoolean(f6438K, true));
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC0996h m3841d(int i10, boolean z10) {
        int i11 = (i10 & (z10 ? 7 : 112)) >> (z10 ? 0 : 4);
        if (i11 == 1) {
            return f6446S;
        }
        if (i11 == 3) {
            return z10 ? f6444Q : f6440M;
        }
        if (i11 == 5) {
            return z10 ? f6445R : f6441N;
        }
        if (i11 == 7) {
            return f6448U;
        }
        if (i11 != 8388611) {
            return i11 != 8388613 ? f6439L : f6443P;
        }
        return f6442O;
    }

    /* JADX INFO: renamed from: g */
    public static void m3842g(String str) {
        throw new IllegalArgumentException(C0166e.m765k(str, ". "));
    }

    /* JADX INFO: renamed from: k */
    public static void m3843k(C1001m c1001m, int i10, int i11, int i12, int i13) {
        C1000l c1000l = new C1000l(i10, i11 + i10);
        C1004p c1004p = c1001m.f6497a;
        c1001m.f6497a = new C1004p(c1004p.f6504a, c1000l, c1004p.f6506c, c1004p.f6507d);
        C1000l c1000l2 = new C1000l(i12, i13 + i12);
        C1004p c1004p2 = c1001m.f6498b;
        c1001m.f6498b = new C1004p(c1004p2.f6504a, c1000l2, c1004p2.f6506c, c1004p2.f6507d);
    }

    /* JADX INFO: renamed from: l */
    public static C1004p m3844l(int i10, int i11, AbstractC0996h abstractC0996h, float f3) {
        return new C1004p(i10 != Integer.MIN_VALUE, new C1000l(i10, i11 + i10), abstractC0996h, f3);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m3845a(C1001m c1001m, boolean z10) {
        String str = z10 ? "column" : "row";
        C1000l c1000l = (z10 ? c1001m.f6498b : c1001m.f6497a).f6505b;
        int i10 = c1000l.f6494a;
        if (i10 != Integer.MIN_VALUE && i10 < 0) {
            m3842g(str.concat(" indices must be positive"));
            throw null;
        }
        int i11 = (z10 ? this.f6453a : this.f6454b).f6468b;
        if (i11 != Integer.MIN_VALUE) {
            int i12 = c1000l.f6495b;
            if (i12 > i11) {
                m3842g(str + " indices (start + span) mustn't exceed the " + str + " count");
                throw null;
            }
            if (i12 - i10 <= i11) {
                return;
            }
            m3842g(str + " span mustn't exceed the " + str + " count");
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m3846b() {
        int childCount = getChildCount();
        int iHashCode = 1;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                iHashCode = ((C1001m) childAt.getLayoutParams()).hashCode() + (iHashCode * 31);
            }
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: c */
    public final void m3847c() {
        boolean z10;
        int i10 = this.f6459g;
        if (i10 != 0) {
            if (i10 != m3846b()) {
                this.f6460h.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
                m3850h();
                m3847c();
                return;
            }
            return;
        }
        boolean z11 = this.f6455c == 0;
        int i11 = (z11 ? this.f6453a : this.f6454b).f6468b;
        if (i11 == Integer.MIN_VALUE) {
            i11 = 0;
        }
        int[] iArr = new int[i11];
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            C1001m c1001m = (C1001m) getChildAt(i14).getLayoutParams();
            C1004p c1004p = z11 ? c1001m.f6497a : c1001m.f6498b;
            C1000l c1000l = c1004p.f6505b;
            int i15 = c1000l.f6495b;
            int i16 = c1000l.f6494a;
            int i17 = i15 - i16;
            boolean z12 = c1004p.f6504a;
            if (z12) {
                i12 = i16;
            }
            C1004p c1004p2 = z11 ? c1001m.f6498b : c1001m.f6497a;
            C1000l c1000l2 = c1004p2.f6505b;
            int i18 = c1000l2.f6495b;
            int i19 = c1000l2.f6494a;
            int iMin = i18 - i19;
            boolean z13 = c1004p2.f6504a;
            if (i11 != 0) {
                iMin = Math.min(iMin, i11 - (z13 ? Math.min(i19, i11) : 0));
            }
            if (z13) {
                i13 = i19;
            }
            if (i11 != 0) {
                if (!z12 || !z13) {
                    while (true) {
                        int i20 = i13 + iMin;
                        if (i20 > i11) {
                            z10 = false;
                            break;
                        }
                        int i21 = i13;
                        while (true) {
                            if (i21 >= i20) {
                                z10 = true;
                                break;
                            } else {
                                if (iArr[i21] > i12) {
                                    z10 = false;
                                    break;
                                }
                                i21++;
                            }
                        }
                        if (z10) {
                            break;
                        }
                        if (z13) {
                            i12++;
                        } else if (i20 <= i11) {
                            i13++;
                        } else {
                            i12++;
                            i13 = 0;
                        }
                    }
                }
                Arrays.fill(iArr, Math.min(i13, i11), Math.min(i13 + iMin, i11), i12 + i17);
            }
            if (z11) {
                m3843k(c1001m, i12, i17, i13, iMin);
            } else {
                m3843k(c1001m, i13, iMin, i12, i17);
            }
            i13 += iMin;
        }
        this.f6459g = m3846b();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C1001m)) {
            return false;
        }
        C1001m c1001m = (C1001m) layoutParams;
        m3845a(c1001m, true);
        m3845a(c1001m, false);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final int m3848e(View view, boolean z10, boolean z11) {
        int[] iArr;
        if (this.f6457e == 1) {
            return m3849f(view, z10, z11);
        }
        C0998j c0998j = z10 ? this.f6453a : this.f6454b;
        if (z11) {
            if (c0998j.f6476j == null) {
                c0998j.f6476j = new int[c0998j.m3869f() + 1];
            }
            if (!c0998j.f6477k) {
                c0998j.m3866c(true);
                c0998j.f6477k = true;
            }
            iArr = c0998j.f6476j;
        } else {
            if (c0998j.f6478l == null) {
                c0998j.f6478l = new int[c0998j.m3869f() + 1];
            }
            if (!c0998j.f6479m) {
                c0998j.m3866c(false);
                c0998j.f6479m = true;
            }
            iArr = c0998j.f6478l;
        }
        C1001m c1001m = (C1001m) view.getLayoutParams();
        C1000l c1000l = (z10 ? c1001m.f6498b : c1001m.f6497a).f6505b;
        return iArr[z11 ? c1000l.f6494a : c1000l.f6495b];
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005a A[PHI: r11
      0x005a: PHI (r11v1 boolean) = (r11v0 boolean), (r11v0 boolean), (r11v4 boolean) binds: [B:24:0x003f, B:29:0x0051, B:32:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: f */
    public final int m3849f(View view, boolean z10, boolean z11) {
        int i10;
        C1001m c1001m = (C1001m) view.getLayoutParams();
        if (z10) {
            i10 = z11 ? ((ViewGroup.MarginLayoutParams) c1001m).leftMargin : ((ViewGroup.MarginLayoutParams) c1001m).rightMargin;
        } else {
            i10 = z11 ? ((ViewGroup.MarginLayoutParams) c1001m).topMargin : ((ViewGroup.MarginLayoutParams) c1001m).bottomMargin;
        }
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (this.f6456d) {
            C1004p c1004p = z10 ? c1001m.f6498b : c1001m.f6497a;
            C0998j c0998j = z10 ? this.f6453a : this.f6454b;
            C1000l c1000l = c1004p.f6505b;
            if (z10) {
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                if (C10029b0.e.m18686d(this) == 1) {
                    if (z11) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                }
            }
            if (z11) {
                int i11 = c1000l.f6494a;
            } else {
                int i12 = c1000l.f6495b;
                c0998j.m3869f();
            }
            if (view.getClass() != C9396a.class && view.getClass() != Space.class) {
                return this.f6458f / 2;
            }
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1001m();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1001m(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C1001m) {
            return new C1001m((C1001m) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1001m((ViewGroup.MarginLayoutParams) layoutParams) : new C1001m(layoutParams);
    }

    public int getAlignmentMode() {
        return this.f6457e;
    }

    public int getColumnCount() {
        return this.f6453a.m3869f();
    }

    public int getOrientation() {
        return this.f6455c;
    }

    public Printer getPrinter() {
        return this.f6460h;
    }

    public int getRowCount() {
        return this.f6454b.m3869f();
    }

    public boolean getUseDefaultMargins() {
        return this.f6456d;
    }

    /* JADX INFO: renamed from: h */
    public final void m3850h() {
        this.f6459g = 0;
        C0998j c0998j = this.f6453a;
        if (c0998j != null) {
            c0998j.m3874l();
        }
        C0998j c0998j2 = this.f6454b;
        if (c0998j2 != null) {
            c0998j2.m3874l();
        }
        if (c0998j == null || c0998j2 == null) {
            return;
        }
        c0998j.m3875m();
        c0998j2.m3875m();
    }

    /* JADX INFO: renamed from: i */
    public final void m3851i(View view, int i10, int i11, int i12, int i13) {
        view.measure(ViewGroup.getChildMeasureSpec(i10, m3848e(view, true, false) + m3848e(view, true, true), i12), ViewGroup.getChildMeasureSpec(i11, m3848e(view, false, false) + m3848e(view, false, true), i13));
    }

    /* JADX INFO: renamed from: j */
    public final void m3852j(int i10, int i11, boolean z10) {
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C1001m c1001m = (C1001m) childAt.getLayoutParams();
                if (z10) {
                    m3851i(childAt, i10, i11, ((ViewGroup.MarginLayoutParams) c1001m).width, ((ViewGroup.MarginLayoutParams) c1001m).height);
                } else {
                    boolean z11 = this.f6455c == 0;
                    C1004p c1004p = z11 ? c1001m.f6498b : c1001m.f6497a;
                    if (c1004p.m3881a(z11) == f6448U) {
                        int[] iArrM3871h = (z11 ? this.f6453a : this.f6454b).m3871h();
                        C1000l c1000l = c1004p.f6505b;
                        int iM3848e = (iArrM3871h[c1000l.f6495b] - iArrM3871h[c1000l.f6494a]) - (m3848e(childAt, z11, false) + m3848e(childAt, z11, true));
                        if (z11) {
                            m3851i(childAt, i10, i11, iM3848e, ((ViewGroup.MarginLayoutParams) c1001m).height);
                        } else {
                            m3851i(childAt, i10, i11, ((ViewGroup.MarginLayoutParams) c1001m).width, iM3848e);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        int i14;
        View view;
        GridLayout gridLayout = this;
        m3847c();
        int i15 = i12 - i10;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int i16 = (i15 - paddingLeft) - paddingRight;
        C0998j c0998j = gridLayout.f6453a;
        c0998j.f6488v.f6499a = i16;
        c0998j.f6489w.f6499a = -i16;
        boolean z12 = false;
        c0998j.f6483q = false;
        c0998j.m3871h();
        int i17 = ((i13 - i11) - paddingTop) - paddingBottom;
        C0998j c0998j2 = gridLayout.f6454b;
        c0998j2.f6488v.f6499a = i17;
        c0998j2.f6489w.f6499a = -i17;
        c0998j2.f6483q = false;
        c0998j2.m3871h();
        int[] iArrM3871h = c0998j.m3871h();
        int[] iArrM3871h2 = c0998j2.m3871h();
        int childCount = getChildCount();
        int i18 = 0;
        while (i18 < childCount) {
            View childAt = gridLayout.getChildAt(i18);
            if (childAt.getVisibility() == 8) {
                i14 = childCount;
                z11 = z12;
            } else {
                C1001m c1001m = (C1001m) childAt.getLayoutParams();
                C1004p c1004p = c1001m.f6498b;
                C1004p c1004p2 = c1001m.f6497a;
                C1000l c1000l = c1004p.f6505b;
                C1000l c1000l2 = c1004p2.f6505b;
                int i19 = childCount;
                int i20 = iArrM3871h[c1000l.f6494a];
                int i21 = iArrM3871h2[c1000l2.f6494a];
                int i22 = iArrM3871h[c1000l.f6495b];
                int i23 = iArrM3871h2[c1000l2.f6495b];
                int i24 = i22 - i20;
                int i25 = i23 - i21;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                AbstractC0996h abstractC0996hM3881a = c1004p.m3881a(true);
                AbstractC0996h abstractC0996hM3881a2 = c1004p2.m3881a(false);
                C1003o<C1004p, C0999k> c1003oM3870g = c0998j.m3870g();
                C0999k c0999k = c1003oM3870g.f6502c[c1003oM3870g.f6500a[i18]];
                C1003o<C1004p, C0999k> c1003oM3870g2 = c0998j2.m3870g();
                C0999k c0999k2 = c1003oM3870g2.f6502c[c1003oM3870g2.f6500a[i18]];
                int iMo3856d = abstractC0996hM3881a.mo3856d(childAt, i24 - c0999k.mo3861d(true));
                int iMo3856d2 = abstractC0996hM3881a2.mo3856d(childAt, i25 - c0999k2.mo3861d(true));
                int iM3848e = gridLayout.m3848e(childAt, true, true);
                int iM3848e2 = gridLayout.m3848e(childAt, false, true);
                int iM3848e3 = gridLayout.m3848e(childAt, true, false);
                int i26 = iM3848e + iM3848e3;
                int iM3848e4 = iM3848e2 + gridLayout.m3848e(childAt, false, false);
                z11 = false;
                i14 = i19;
                int iMo3858a = c0999k.mo3858a(this, childAt, abstractC0996hM3881a, measuredWidth + i26, true);
                int iMo3858a2 = c0999k2.mo3858a(this, childAt, abstractC0996hM3881a2, measuredHeight + iM3848e4, false);
                int iMo3862e = abstractC0996hM3881a.mo3862e(measuredWidth, i24 - i26);
                int iMo3862e2 = abstractC0996hM3881a2.mo3862e(measuredHeight, i25 - iM3848e4);
                int i27 = i20 + iMo3856d + iMo3858a;
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                int i28 = !(C10029b0.e.m18686d(this) == 1) ? paddingLeft + iM3848e + i27 : (((i15 - iMo3862e) - paddingRight) - iM3848e3) - i27;
                int i29 = paddingTop + i21 + iMo3856d2 + iMo3858a2 + iM3848e2;
                if (iMo3862e == childAt.getMeasuredWidth() && iMo3862e2 == childAt.getMeasuredHeight()) {
                    view = childAt;
                } else {
                    view = childAt;
                    view.measure(View.MeasureSpec.makeMeasureSpec(iMo3862e, 1073741824), View.MeasureSpec.makeMeasureSpec(iMo3862e2, 1073741824));
                }
                view.layout(i28, i29, iMo3862e + i28, iMo3862e2 + i29);
            }
            i18++;
            gridLayout = this;
            iArrM3871h = iArrM3871h;
            c0998j = c0998j;
            childCount = i14;
            z12 = z11;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int iM3873j;
        int iM3873j2;
        m3847c();
        C0998j c0998j = this.f6454b;
        C0998j c0998j2 = this.f6453a;
        if (c0998j2 != null && c0998j != null) {
            c0998j2.m3875m();
            c0998j.m3875m();
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingRight) + i10), View.MeasureSpec.getMode(i10));
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingBottom) + i11), View.MeasureSpec.getMode(i11));
        m3852j(iMakeMeasureSpec, iMakeMeasureSpec2, true);
        if (this.f6455c == 0) {
            iM3873j2 = c0998j2.m3873j(iMakeMeasureSpec);
            m3852j(iMakeMeasureSpec, iMakeMeasureSpec2, false);
            iM3873j = c0998j.m3873j(iMakeMeasureSpec2);
        } else {
            iM3873j = c0998j.m3873j(iMakeMeasureSpec2);
            m3852j(iMakeMeasureSpec, iMakeMeasureSpec2, false);
            iM3873j2 = c0998j2.m3873j(iMakeMeasureSpec);
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iM3873j2 + paddingRight, getSuggestedMinimumWidth()), i10, 0), View.resolveSizeAndState(Math.max(iM3873j + paddingBottom, getSuggestedMinimumHeight()), i11, 0));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        m3850h();
    }

    public void setAlignmentMode(int i10) {
        this.f6457e = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.f6453a.m3876n(i10);
        m3850h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        C0998j c0998j = this.f6453a;
        c0998j.f6487u = z10;
        c0998j.m3874l();
        m3850h();
        requestLayout();
    }

    public void setOrientation(int i10) {
        if (this.f6455c != i10) {
            this.f6455c = i10;
            m3850h();
            requestLayout();
        }
    }

    public void setPrinter(Printer printer) {
        if (printer == null) {
            printer = f6450j;
        }
        this.f6460h = printer;
    }

    public void setRowCount(int i10) {
        this.f6454b.m3876n(i10);
        m3850h();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z10) {
        C0998j c0998j = this.f6454b;
        c0998j.f6487u = z10;
        c0998j.m3874l();
        m3850h();
        requestLayout();
    }

    public void setUseDefaultMargins(boolean z10) {
        this.f6456d = z10;
        requestLayout();
    }
}
