package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import p000.AbstractC0803lp;
import p000.AbstractC0812ly;
import p000.C0168et;
import p000.C0778kr;
import p000.C0782kv;
import p000.C0811lx;
import p000.C0813lz;
import p000.C0818md;
import p000.C0825mk;
import p000.C0826ml;
import p000.C0839my;
import p000.C0840mz;
import p000.C0842na;
import p000.C0843nb;
import p000.C0844nc;
import p000.InterfaceC0824mj;
import p000.RunnableC0852nk;
import p000.akw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC0812ly implements InterfaceC0824mj {

    /* JADX INFO: renamed from: E */
    private boolean f1138E;

    /* JADX INFO: renamed from: F */
    private C0843nb f1139F;

    /* JADX INFO: renamed from: J */
    private int[] f1143J;

    /* JADX INFO: renamed from: a */
    C0844nc[] f1145a;

    /* JADX INFO: renamed from: b */
    public AbstractC0803lp f1146b;

    /* JADX INFO: renamed from: c */
    AbstractC0803lp f1147c;

    /* JADX INFO: renamed from: i */
    private int f1153i;

    /* JADX INFO: renamed from: j */
    private int f1154j;

    /* JADX INFO: renamed from: k */
    private int f1155k;

    /* JADX INFO: renamed from: l */
    private final C0782kv f1156l;

    /* JADX INFO: renamed from: m */
    private BitSet f1157m;

    /* JADX INFO: renamed from: o */
    private boolean f1159o;

    /* JADX INFO: renamed from: d */
    public boolean f1148d = false;

    /* JADX INFO: renamed from: e */
    boolean f1149e = false;

    /* JADX INFO: renamed from: f */
    int f1150f = -1;

    /* JADX INFO: renamed from: g */
    int f1151g = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: h */
    akw f1152h = new akw();

    /* JADX INFO: renamed from: n */
    private int f1158n = 2;

    /* JADX INFO: renamed from: G */
    private final Rect f1140G = new Rect();

    /* JADX INFO: renamed from: H */
    private final C0839my f1141H = new C0839my(this);

    /* JADX INFO: renamed from: I */
    private boolean f1142I = true;

    /* JADX INFO: renamed from: K */
    private final Runnable f1144K = new RunnableC0852nk(this, 1);

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1153i = -1;
        C0811lx c0811lxAt = m16130at(context, attributeSet, i, i2);
        int i3 = c0811lxAt.f39493a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo1154N(null);
        if (i3 != this.f1154j) {
            this.f1154j = i3;
            AbstractC0803lp abstractC0803lp = this.f1146b;
            this.f1146b = this.f1147c;
            this.f1147c = abstractC0803lp;
            m16155aP();
        }
        int i4 = c0811lxAt.f39494b;
        mo1154N(null);
        if (i4 != this.f1153i) {
            this.f1152h.m885b();
            m16155aP();
            this.f1153i = i4;
            this.f1157m = new BitSet(i4);
            this.f1145a = new C0844nc[this.f1153i];
            for (int i5 = 0; i5 < this.f1153i; i5++) {
                this.f1145a[i5] = new C0844nc(this, i5);
            }
            m16155aP();
        }
        m1291G(c0811lxAt.f39495c);
        this.f1156l = new C0782kv();
        this.f1146b = AbstractC0803lp.m15797q(this, this.f1154j);
        this.f1147c = AbstractC0803lp.m15797q(this, 1 - this.f1154j);
    }

    /* JADX INFO: renamed from: O */
    private final int m1269O(int i) {
        if (m16164aj() == 0) {
            return this.f1149e ? 1 : -1;
        }
        return (i < m1299c()) != this.f1149e ? -1 : 1;
    }

    /* JADX INFO: renamed from: P */
    private final int m1270P(C0826ml c0826ml) {
        if (m16164aj() == 0) {
            return 0;
        }
        return C0168et.m7836e(c0826ml, this.f1146b, m1303r(!this.f1142I), m1302l(!this.f1142I), this, this.f1142I);
    }

    /* JADX INFO: renamed from: T */
    private final int m1271T(C0826ml c0826ml) {
        if (m16164aj() == 0) {
            return 0;
        }
        return C0168et.m7837f(c0826ml, this.f1146b, m1303r(!this.f1142I), m1302l(!this.f1142I), this, this.f1142I, this.f1149e);
    }

    /* JADX INFO: renamed from: U */
    private final int m1272U(C0826ml c0826ml) {
        if (m16164aj() == 0) {
            return 0;
        }
        return C0168et.m7838g(c0826ml, this.f1146b, m1303r(!this.f1142I), m1302l(!this.f1142I), this, this.f1142I);
    }

    /* JADX INFO: renamed from: Y */
    private final int m1273Y(C0818md c0818md, C0782kv c0782kv, C0826ml c0826ml) {
        int i;
        C0844nc c0844nc;
        int iM17319f;
        int iMo15747b;
        int iMo15755j;
        int iMo15747b2;
        int i2;
        int i3;
        int i4;
        this.f1157m.set(0, this.f1153i, true);
        int i5 = this.f1156l.f37286i ? c0782kv.f37282e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c0782kv.f37282e == 1 ? c0782kv.f37284g + c0782kv.f37279b : c0782kv.f37283f - c0782kv.f37279b;
        int i6 = c0782kv.f37282e;
        for (int i7 = 0; i7 < this.f1153i; i7++) {
            if (!this.f1145a[i7].f41970a.isEmpty()) {
                m1279bB(this.f1145a[i7], i6, i5);
            }
        }
        int iMo15751f = this.f1149e ? this.f1146b.mo15751f() : this.f1146b.mo15755j();
        boolean z = false;
        while (c0782kv.m14926a(c0826ml) && (this.f1156l.f37286i || !this.f1157m.isEmpty())) {
            View viewM16313b = c0818md.m16313b(c0782kv.f37280c);
            c0782kv.f37280c += c0782kv.f37281d;
            C0840mz c0840mz = (C0840mz) viewM16313b.getLayoutParams();
            int iM16218a = c0840mz.m16218a();
            Object obj = this.f1152h.f606b;
            if (obj != null) {
                int[] iArr = (int[]) obj;
                i = iM16218a >= iArr.length ? -1 : iArr[iM16218a];
            } else {
                i = -1;
            }
            boolean z2 = i == -1;
            if (z2) {
                boolean z3 = c0840mz.f41827b;
                if (m1280bC(c0782kv.f37282e)) {
                    i3 = this.f1153i - 1;
                    i2 = -1;
                    i4 = -1;
                } else {
                    i2 = this.f1153i;
                    i3 = 0;
                    i4 = 1;
                }
                C0844nc c0844nc2 = null;
                if (c0782kv.f37282e == 1) {
                    int iMo15755j2 = this.f1146b.mo15755j();
                    int i8 = Integer.MAX_VALUE;
                    while (i3 != i2) {
                        C0844nc c0844nc3 = this.f1145a[i3];
                        int iM17317d = c0844nc3.m17317d(iMo15755j2);
                        int i9 = iM17317d < i8 ? iM17317d : i8;
                        if (iM17317d < i8) {
                            c0844nc2 = c0844nc3;
                        }
                        i3 += i4;
                        i8 = i9;
                    }
                    c0844nc = c0844nc2;
                } else {
                    int iMo15751f2 = this.f1146b.mo15751f();
                    int i10 = Integer.MIN_VALUE;
                    while (i3 != i2) {
                        C0844nc c0844nc4 = this.f1145a[i3];
                        int iM17319f2 = c0844nc4.m17319f(iMo15751f2);
                        int i11 = iM17319f2 > i10 ? iM17319f2 : i10;
                        if (iM17319f2 > i10) {
                            c0844nc2 = c0844nc4;
                        }
                        i3 += i4;
                        i10 = i11;
                    }
                    c0844nc = c0844nc2;
                }
                akw akwVar = this.f1152h;
                akwVar.m886c(iM16218a);
                ((int[]) akwVar.f606b)[iM16218a] = c0844nc.f41974e;
            } else {
                c0844nc = this.f1145a[i];
            }
            c0840mz.f41826a = c0844nc;
            if (c0782kv.f37282e == 1) {
                m16178az(viewM16313b);
            } else {
                m16144aA(viewM16313b, 0);
            }
            boolean z4 = c0840mz.f41827b;
            if (this.f1154j == 1) {
                m1281bD(viewM16313b, m16129ak(this.f1155k, this.f39558y, 0, c0840mz.width, false), m16129ak(this.f39544B, this.f39559z, m16172as() + m16169ap(), c0840mz.height, true));
            } else {
                m1281bD(viewM16313b, m16129ak(this.f39543A, this.f39558y, m16170aq() + m16171ar(), c0840mz.width, true), m16129ak(this.f1155k, this.f39559z, 0, c0840mz.height, false));
            }
            if (c0782kv.f37282e == 1) {
                boolean z5 = c0840mz.f41827b;
                iMo15747b = c0844nc.m17317d(iMo15751f);
                iM17319f = this.f1146b.mo15747b(viewM16313b) + iMo15747b;
                if (z2) {
                    boolean z6 = c0840mz.f41827b;
                }
            } else {
                boolean z7 = c0840mz.f41827b;
                iM17319f = c0844nc.m17319f(iMo15751f);
                iMo15747b = iM17319f - this.f1146b.mo15747b(viewM16313b);
                if (z2) {
                    boolean z8 = c0840mz.f41827b;
                }
            }
            boolean z9 = c0840mz.f41827b;
            if (c0782kv.f37282e == 1) {
                C0844nc c0844nc5 = c0840mz.f41826a;
                C0840mz c0840mzM17313n = C0844nc.m17313n(viewM16313b);
                c0840mzM17313n.f41826a = c0844nc5;
                c0844nc5.f41970a.add(viewM16313b);
                c0844nc5.f41972c = Integer.MIN_VALUE;
                if (c0844nc5.f41970a.size() == 1) {
                    c0844nc5.f41971b = Integer.MIN_VALUE;
                }
                if (c0840mzM17313n.m16220c() || c0840mzM17313n.m16219b()) {
                    c0844nc5.f41973d += c0844nc5.f41975f.f1146b.mo15747b(viewM16313b);
                }
            } else {
                C0844nc c0844nc6 = c0840mz.f41826a;
                C0840mz c0840mzM17313n2 = C0844nc.m17313n(viewM16313b);
                c0840mzM17313n2.f41826a = c0844nc6;
                c0844nc6.f41970a.add(0, viewM16313b);
                c0844nc6.f41971b = Integer.MIN_VALUE;
                if (c0844nc6.f41970a.size() == 1) {
                    c0844nc6.f41972c = Integer.MIN_VALUE;
                }
                if (c0840mzM17313n2.m16220c() || c0840mzM17313n2.m16219b()) {
                    c0844nc6.f41973d += c0844nc6.f41975f.f1146b.mo15747b(viewM16313b);
                }
            }
            if (m1294L() && this.f1154j == 1) {
                boolean z10 = c0840mz.f41827b;
                iMo15747b2 = this.f1147c.mo15751f() - (((this.f1153i - 1) - c0844nc.f41974e) * this.f1155k);
                iMo15755j = iMo15747b2 - this.f1147c.mo15747b(viewM16313b);
            } else {
                boolean z11 = c0840mz.f41827b;
                iMo15755j = this.f1147c.mo15755j() + (c0844nc.f41974e * this.f1155k);
                iMo15747b2 = this.f1147c.mo15747b(viewM16313b) + iMo15755j;
            }
            if (this.f1154j == 1) {
                m16139bj(viewM16313b, iMo15755j, iMo15747b, iMo15747b2, iM17319f);
            } else {
                m16139bj(viewM16313b, iMo15747b, iMo15755j, iM17319f, iMo15747b2);
            }
            boolean z12 = c0840mz.f41827b;
            m1279bB(c0844nc, this.f1156l.f37282e, i5);
            m1285bv(c0818md, this.f1156l);
            if (this.f1156l.f37285h && viewM16313b.hasFocusable()) {
                boolean z13 = c0840mz.f41827b;
                this.f1157m.set(c0844nc.f41974e, false);
            }
            z = true;
        }
        if (!z) {
            m1285bv(c0818md, this.f1156l);
        }
        int iMo15755j3 = this.f1156l.f37282e == -1 ? this.f1146b.mo15755j() - m1275ad(this.f1146b.mo15755j()) : m1274Z(this.f1146b.mo15751f()) - this.f1146b.mo15751f();
        if (iMo15755j3 > 0) {
            return Math.min(c0782kv.f37279b, iMo15755j3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: Z */
    private final int m1274Z(int i) {
        int iM17317d = this.f1145a[0].m17317d(i);
        for (int i2 = 1; i2 < this.f1153i; i2++) {
            int iM17317d2 = this.f1145a[i2].m17317d(i);
            if (iM17317d2 > iM17317d) {
                iM17317d = iM17317d2;
            }
        }
        return iM17317d;
    }

    /* JADX INFO: renamed from: ad */
    private final int m1275ad(int i) {
        int iM17319f = this.f1145a[0].m17319f(i);
        for (int i2 = 1; i2 < this.f1153i; i2++) {
            int iM17319f2 = this.f1145a[i2].m17319f(i);
            if (iM17319f2 < iM17319f) {
                iM17319f = iM17319f2;
            }
        }
        return iM17319f;
    }

    /* JADX INFO: renamed from: ae */
    private final void m1276ae(C0818md c0818md, C0826ml c0826ml, boolean z) {
        int iMo15751f;
        int i;
        int iM1274Z = m1274Z(Integer.MIN_VALUE);
        if (iM1274Z != Integer.MIN_VALUE && (iMo15751f = this.f1146b.mo15751f() - iM1274Z) > 0) {
            int i2 = -m1301k(-iMo15751f, c0818md, c0826ml);
            if (!z || (i = iMo15751f - i2) <= 0) {
                return;
            }
            this.f1146b.mo15759n(i);
        }
    }

    /* JADX INFO: renamed from: af */
    private final void m1277af(C0818md c0818md, C0826ml c0826ml, boolean z) {
        int iMo15755j;
        int iM1275ad = m1275ad(Integer.MAX_VALUE);
        if (iM1275ad != Integer.MAX_VALUE && (iMo15755j = iM1275ad - this.f1146b.mo15755j()) > 0) {
            int iM1301k = iMo15755j - m1301k(iMo15755j, c0818md, c0826ml);
            if (!z || iM1301k <= 0) {
                return;
            }
            this.f1146b.mo15759n(-iM1301k);
        }
    }

    /* JADX INFO: renamed from: bA */
    private final void m1278bA(int i, C0826ml c0826ml) {
        int iMo15756k;
        int iMo15756k2;
        int i2;
        C0782kv c0782kv = this.f1156l;
        boolean z = false;
        c0782kv.f37279b = 0;
        c0782kv.f37280c = i;
        if (!m16162aX() || (i2 = c0826ml.f40916a) == -1) {
            iMo15756k = 0;
            iMo15756k2 = 0;
        } else {
            if (this.f1149e == (i2 < i)) {
                iMo15756k = this.f1146b.mo15756k();
                iMo15756k2 = 0;
            } else {
                iMo15756k2 = this.f1146b.mo15756k();
                iMo15756k = 0;
            }
        }
        RecyclerView recyclerView = this.f39550q;
        if (recyclerView == null || !recyclerView.f1119i) {
            this.f1156l.f37284g = this.f1146b.mo15750e() + iMo15756k;
            this.f1156l.f37283f = -iMo15756k2;
        } else {
            this.f1156l.f37283f = this.f1146b.mo15755j() - iMo15756k2;
            this.f1156l.f37284g = this.f1146b.mo15751f() + iMo15756k;
        }
        C0782kv c0782kv2 = this.f1156l;
        c0782kv2.f37285h = false;
        c0782kv2.f37278a = true;
        if (this.f1146b.mo15753h() == 0 && this.f1146b.mo15750e() == 0) {
            z = true;
        }
        c0782kv2.f37286i = z;
    }

    /* JADX INFO: renamed from: bB */
    private final void m1279bB(C0844nc c0844nc, int i, int i2) {
        int i3 = c0844nc.f41973d;
        if (i == -1) {
            if (c0844nc.m17318e() + i3 <= i2) {
                this.f1157m.set(c0844nc.f41974e, false);
            }
        } else if (c0844nc.m17316c() - i3 >= i2) {
            this.f1157m.set(c0844nc.f41974e, false);
        }
    }

    /* JADX INFO: renamed from: bC */
    private final boolean m1280bC(int i) {
        if (this.f1154j == 0) {
            return (i == -1) != this.f1149e;
        }
        return ((i == -1) == this.f1149e) == m1294L();
    }

    /* JADX INFO: renamed from: bD */
    private final void m1281bD(View view, int i, int i2) {
        m16145aB(view, this.f1140G);
        C0840mz c0840mz = (C0840mz) view.getLayoutParams();
        int iM1282bE = m1282bE(i, c0840mz.leftMargin + this.f1140G.left, c0840mz.rightMargin + this.f1140G.right);
        int iM1282bE2 = m1282bE(i2, c0840mz.topMargin + this.f1140G.top, c0840mz.bottomMargin + this.f1140G.bottom);
        if (m16163aZ(view, iM1282bE, iM1282bE2, c0840mz)) {
            view.measure(iM1282bE, iM1282bE2);
        }
    }

    /* JADX INFO: renamed from: bE */
    private static final int m1282bE(int i, int i2, int i3) {
        if (i2 == 0) {
            if (i3 == 0) {
                return i;
            }
            i2 = 0;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: bt */
    private final void m1283bt(int i, int i2, int i3) {
        C0842na c0842na;
        int i4;
        int iM1300i = this.f1149e ? m1300i() : m1299c();
        int i5 = i + i2;
        akw akwVar = this.f1152h;
        Object obj = akwVar.f606b;
        if (obj != null && i < ((int[]) obj).length) {
            ?? r3 = akwVar.f605a;
            if (r3 == 0) {
                i4 = -1;
            } else {
                int size = r3.size() - 1;
                while (true) {
                    if (size < 0) {
                        c0842na = null;
                        break;
                    }
                    c0842na = (C0842na) akwVar.f605a.get(size);
                    if (c0842na.f41884a == i) {
                        break;
                    } else {
                        size--;
                    }
                }
                if (c0842na != null) {
                    akwVar.f605a.remove(c0842na);
                }
                int size2 = akwVar.f605a.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size2) {
                        i6 = -1;
                        break;
                    } else if (((C0842na) akwVar.f605a.get(i6)).f41884a >= i) {
                        break;
                    } else {
                        i6++;
                    }
                }
                if (i6 != -1) {
                    C0842na c0842na2 = (C0842na) akwVar.f605a.get(i6);
                    akwVar.f605a.remove(i6);
                    i4 = c0842na2.f41884a;
                } else {
                    i4 = -1;
                }
            }
            if (i4 == -1) {
                int[] iArr = (int[]) akwVar.f606b;
                Arrays.fill(iArr, i, iArr.length, -1);
                int length = ((int[]) akwVar.f606b).length;
            } else {
                Arrays.fill((int[]) akwVar.f606b, i, Math.min(i4 + 1, ((int[]) akwVar.f606b).length), -1);
            }
        }
        switch (i3) {
            case 1:
                akw akwVar2 = this.f1152h;
                Object obj2 = akwVar2.f606b;
                if (obj2 != null && i < ((int[]) obj2).length) {
                    akwVar2.m886c(i5);
                    Object obj3 = akwVar2.f606b;
                    System.arraycopy(obj3, i, obj3, i5, (((int[]) obj3).length - i) - i2);
                    Arrays.fill((int[]) akwVar2.f606b, i, i5, -1);
                    ?? r2 = akwVar2.f605a;
                    if (r2 != 0) {
                        for (int size3 = r2.size() - 1; size3 >= 0; size3--) {
                            C0842na c0842na3 = (C0842na) akwVar2.f605a.get(size3);
                            int i7 = c0842na3.f41884a;
                            if (i7 >= i) {
                                c0842na3.f41884a = i7 + i2;
                            }
                        }
                    }
                }
                break;
            case 2:
                akw akwVar3 = this.f1152h;
                Object obj4 = akwVar3.f606b;
                if (obj4 != null && i < ((int[]) obj4).length) {
                    akwVar3.m886c(i5);
                    Object obj5 = akwVar3.f606b;
                    System.arraycopy(obj5, i5, obj5, i, (((int[]) obj5).length - i) - i2);
                    int[] iArr2 = (int[]) akwVar3.f606b;
                    int length2 = iArr2.length;
                    Arrays.fill(iArr2, length2 - i2, length2, -1);
                    ?? r4 = akwVar3.f605a;
                    if (r4 != 0) {
                        for (int size4 = r4.size() - 1; size4 >= 0; size4--) {
                            C0842na c0842na4 = (C0842na) akwVar3.f605a.get(size4);
                            int i8 = c0842na4.f41884a;
                            if (i8 >= i) {
                                if (i8 < i5) {
                                    akwVar3.f605a.remove(size4);
                                } else {
                                    c0842na4.f41884a = i8 - i2;
                                }
                            }
                        }
                    }
                }
                break;
        }
        if (i5 <= iM1300i) {
            return;
        }
        if (i <= (this.f1149e ? m1299c() : m1300i())) {
            m16155aP();
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:115:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:234:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:248:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x01f1 A[SYNTHETIC] */
    /* JADX INFO: renamed from: bu */
    private final void m1284bu(C0818md c0818md, C0826ml c0826ml, boolean z) {
        boolean z2;
        C0843nb c0843nb;
        int i;
        int iM16164aj;
        int i2;
        int iBe;
        int iBe2;
        int iM16164aj2;
        int i3;
        C0839my c0839my = this.f1141H;
        if (!(this.f1139F == null && this.f1150f == -1) && c0826ml.m16585a() == 0) {
            m16150aK(c0818md);
            c0839my.m17157a();
            return;
        }
        boolean z3 = (c0839my.f41791e && this.f1150f == -1 && this.f1139F == null) ? false : true;
        if (z3) {
            c0839my.m17157a();
            C0843nb c0843nb2 = this.f1139F;
            if (c0843nb2 != null) {
                int i4 = c0843nb2.f41922c;
                if (i4 > 0) {
                    if (i4 == this.f1153i) {
                        for (int i5 = 0; i5 < this.f1153i; i5++) {
                            this.f1145a[i5].m17323j();
                            C0843nb c0843nb3 = this.f1139F;
                            int iMo15751f = c0843nb3.f41923d[i5];
                            if (iMo15751f != Integer.MIN_VALUE) {
                                iMo15751f = c0843nb3.f41928i ? iMo15751f + this.f1146b.mo15751f() : iMo15751f + this.f1146b.mo15755j();
                            }
                            this.f1145a[i5].m17325l(iMo15751f);
                        }
                    } else {
                        c0843nb2.m17248b();
                        C0843nb c0843nb4 = this.f1139F;
                        c0843nb4.f41920a = c0843nb4.f41921b;
                    }
                }
                C0843nb c0843nb5 = this.f1139F;
                this.f1138E = c0843nb5.f41929j;
                m1291G(c0843nb5.f41927h);
                m1288by();
                C0843nb c0843nb6 = this.f1139F;
                int i6 = c0843nb6.f41920a;
                if (i6 != -1) {
                    this.f1150f = i6;
                    c0839my.f41789c = c0843nb6.f41928i;
                } else {
                    c0839my.f41789c = this.f1149e;
                }
                if (c0843nb6.f41924e > 1) {
                    akw akwVar = this.f1152h;
                    akwVar.f606b = c0843nb6.f41925f;
                    akwVar.f605a = c0843nb6.f41926g;
                }
            } else {
                m1288by();
                c0839my.f41789c = this.f1149e;
            }
            if (c0826ml.f40922g || (i3 = this.f1150f) == -1) {
                if (this.f1159o) {
                    int iM16585a = c0826ml.m16585a();
                    iM16164aj2 = m16164aj() - 1;
                    while (true) {
                        if (iM16164aj2 < 0) {
                            iBe = 0;
                            break;
                        }
                        iBe = m16136be(m16174av(iM16164aj2));
                        if (iBe < 0 && iBe < iM16585a) {
                            break;
                        } else {
                            iM16164aj2--;
                        }
                    }
                } else {
                    int iM16585a2 = c0826ml.m16585a();
                    iM16164aj = m16164aj();
                    i2 = 0;
                    while (true) {
                        if (i2 >= iM16164aj) {
                            iBe = 0;
                            break;
                        }
                        iBe2 = m16136be(m16174av(i2));
                        if (iBe2 < 0 && iBe2 < iM16585a2) {
                            iBe = iBe2;
                            break;
                        }
                        i2++;
                    }
                }
                c0839my.f41787a = iBe;
                c0839my.f41788b = Integer.MIN_VALUE;
            } else if (i3 < 0 || i3 >= c0826ml.m16585a()) {
                this.f1150f = -1;
                this.f1151g = Integer.MIN_VALUE;
                if (this.f1159o) {
                    int iM16585a3 = c0826ml.m16585a();
                    iM16164aj2 = m16164aj() - 1;
                    while (true) {
                        if (iM16164aj2 < 0) {
                            iBe = 0;
                            break;
                        } else {
                            iBe = m16136be(m16174av(iM16164aj2));
                            if (iBe < 0) {
                            }
                            iM16164aj2--;
                        }
                    }
                } else {
                    int iM16585a4 = c0826ml.m16585a();
                    iM16164aj = m16164aj();
                    i2 = 0;
                    while (true) {
                        if (i2 >= iM16164aj) {
                            iBe = 0;
                            break;
                        } else {
                            iBe2 = m16136be(m16174av(i2));
                            if (iBe2 < 0) {
                            }
                            i2++;
                        }
                    }
                }
                c0839my.f41787a = iBe;
                c0839my.f41788b = Integer.MIN_VALUE;
            } else {
                C0843nb c0843nb7 = this.f1139F;
                if (c0843nb7 == null || c0843nb7.f41920a == -1 || c0843nb7.f41922c <= 0) {
                    View viewMo1153M = mo1153M(this.f1150f);
                    if (viewMo1153M != null) {
                        c0839my.f41787a = this.f1149e ? m1300i() : m1299c();
                        if (this.f1151g != Integer.MIN_VALUE) {
                            if (c0839my.f41789c) {
                                c0839my.f41788b = (this.f1146b.mo15751f() - this.f1151g) - this.f1146b.mo15746a(viewMo1153M);
                            } else {
                                c0839my.f41788b = (this.f1146b.mo15755j() + this.f1151g) - this.f1146b.mo15749d(viewMo1153M);
                            }
                        } else if (this.f1146b.mo15747b(viewMo1153M) > this.f1146b.mo15756k()) {
                            c0839my.f41788b = c0839my.f41789c ? this.f1146b.mo15751f() : this.f1146b.mo15755j();
                        } else {
                            int iMo15749d = this.f1146b.mo15749d(viewMo1153M) - this.f1146b.mo15755j();
                            if (iMo15749d < 0) {
                                c0839my.f41788b = -iMo15749d;
                            } else {
                                int iMo15751f2 = this.f1146b.mo15751f() - this.f1146b.mo15746a(viewMo1153M);
                                if (iMo15751f2 < 0) {
                                    c0839my.f41788b = iMo15751f2;
                                } else {
                                    c0839my.f41788b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i7 = this.f1150f;
                        c0839my.f41787a = i7;
                        int i8 = this.f1151g;
                        if (i8 == Integer.MIN_VALUE) {
                            boolean z4 = m1269O(i7) == 1;
                            c0839my.f41789c = z4;
                            c0839my.f41788b = z4 ? c0839my.f41793g.f1146b.mo15751f() : c0839my.f41793g.f1146b.mo15755j();
                        } else if (c0839my.f41789c) {
                            c0839my.f41788b = c0839my.f41793g.f1146b.mo15751f() - i8;
                        } else {
                            c0839my.f41788b = c0839my.f41793g.f1146b.mo15755j() + i8;
                        }
                        c0839my.f41790d = true;
                    }
                } else {
                    c0839my.f41788b = Integer.MIN_VALUE;
                    c0839my.f41787a = this.f1150f;
                }
            }
            c0839my.f41791e = true;
        }
        if (this.f1139F == null && this.f1150f == -1 && (c0839my.f41789c != this.f1159o || m1294L() != this.f1138E)) {
            this.f1152h.m885b();
            c0839my.f41790d = true;
        }
        if (m16164aj() > 0 && ((c0843nb = this.f1139F) == null || c0843nb.f41922c <= 0)) {
            if (c0839my.f41790d) {
                for (int i9 = 0; i9 < this.f1153i; i9++) {
                    this.f1145a[i9].m17323j();
                    int i10 = c0839my.f41788b;
                    if (i10 != Integer.MIN_VALUE) {
                        this.f1145a[i9].m17325l(i10);
                    }
                }
            } else if (z3 || this.f1141H.f41792f == null) {
                int i11 = 0;
                while (i11 < this.f1153i) {
                    C0844nc c0844nc = this.f1145a[i11];
                    boolean z5 = this.f1149e;
                    int i12 = c0839my.f41788b;
                    int iM17317d = z5 ? c0844nc.m17317d(Integer.MIN_VALUE) : c0844nc.m17319f(Integer.MIN_VALUE);
                    c0844nc.m17323j();
                    if (iM17317d != Integer.MIN_VALUE && ((!z5 || iM17317d >= c0844nc.f41975f.f1146b.mo15751f()) && (z5 || iM17317d <= c0844nc.f41975f.f1146b.mo15755j()))) {
                        if (i12 != Integer.MIN_VALUE) {
                            iM17317d += i12;
                        }
                        c0844nc.f41972c = iM17317d;
                        c0844nc.f41971b = iM17317d;
                    }
                    i11++;
                }
                C0839my c0839my2 = this.f1141H;
                C0844nc[] c0844ncArr = this.f1145a;
                int length = c0844ncArr.length;
                int[] iArr = c0839my2.f41792f;
                if (iArr == null || iArr.length < length) {
                    c0839my2.f41792f = new int[c0839my2.f41793g.f1145a.length];
                    i = 0;
                } else {
                    i = 0;
                }
                while (i < length) {
                    c0839my2.f41792f[i] = c0844ncArr[i].m17319f(Integer.MIN_VALUE);
                    i++;
                }
            } else {
                for (int i13 = 0; i13 < this.f1153i; i13++) {
                    C0844nc c0844nc2 = this.f1145a[i13];
                    c0844nc2.m17323j();
                    c0844nc2.m17325l(this.f1141H.f41792f[i13]);
                }
            }
        }
        m16146aC(c0818md);
        this.f1156l.f37278a = false;
        m1292H(this.f1147c.mo15756k());
        m1278bA(c0839my.f41787a, c0826ml);
        if (c0839my.f41789c) {
            m1289bz(-1);
            m1273Y(c0818md, this.f1156l, c0826ml);
            m1289bz(1);
            C0782kv c0782kv = this.f1156l;
            c0782kv.f37280c = c0839my.f41787a + c0782kv.f37281d;
            m1273Y(c0818md, c0782kv, c0826ml);
        } else {
            m1289bz(1);
            m1273Y(c0818md, this.f1156l, c0826ml);
            m1289bz(-1);
            C0782kv c0782kv2 = this.f1156l;
            c0782kv2.f37280c = c0839my.f41787a + c0782kv2.f37281d;
            m1273Y(c0818md, c0782kv2, c0826ml);
        }
        if (this.f1147c.mo15753h() != 1073741824) {
            int iM16164aj3 = m16164aj();
            float fMax = 0.0f;
            for (int i14 = 0; i14 < iM16164aj3; i14++) {
                View viewM16174av = m16174av(i14);
                float fMo15747b = this.f1147c.mo15747b(viewM16174av);
                if (fMo15747b >= fMax) {
                    fMax = Math.max(fMax, fMo15747b);
                }
            }
            int i15 = this.f1155k;
            int iRound = Math.round(fMax * this.f1153i);
            if (this.f1147c.mo15753h() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f1147c.mo15756k());
            }
            m1292H(iRound);
            if (this.f1155k != i15) {
                for (int i16 = 0; i16 < iM16164aj3; i16++) {
                    View viewM16174av2 = m16174av(i16);
                    C0840mz c0840mz = (C0840mz) viewM16174av2.getLayoutParams();
                    boolean z6 = c0840mz.f41827b;
                    if (m1294L() && this.f1154j == 1) {
                        int i17 = -((this.f1153i - 1) - c0840mz.f41826a.f41974e);
                        viewM16174av2.offsetLeftAndRight((this.f1155k * i17) - (i17 * i15));
                    } else {
                        int i18 = c0840mz.f41826a.f41974e;
                        int i19 = this.f1155k * i18;
                        int i20 = i18 * i15;
                        if (this.f1154j == 1) {
                            viewM16174av2.offsetLeftAndRight(i19 - i20);
                        } else {
                            viewM16174av2.offsetTopAndBottom(i19 - i20);
                        }
                    }
                }
            }
        }
        if (m16164aj() > 0) {
            if (this.f1149e) {
                m1276ae(c0818md, c0826ml, true);
                m1277af(c0818md, c0826ml, false);
            } else {
                m1277af(c0818md, c0826ml, true);
                m1276ae(c0818md, c0826ml, false);
            }
        }
        if (z && !c0826ml.f40922g && this.f1158n != 0 && m16164aj() > 0 && m1304u() != null) {
            m16181bm(this.f1144K);
            z2 = m1293I();
        }
        if (c0826ml.f40922g) {
            this.f1141H.m17157a();
        }
        this.f1159o = c0839my.f41789c;
        this.f1138E = m1294L();
        if (z2) {
            this.f1141H.m17157a();
            m1284bu(c0818md, c0826ml, false);
        }
    }

    /* JADX INFO: renamed from: bv */
    private final void m1285bv(C0818md c0818md, C0782kv c0782kv) {
        int iMin;
        if (!c0782kv.f37278a || c0782kv.f37286i) {
            return;
        }
        if (c0782kv.f37279b == 0) {
            if (c0782kv.f37282e == -1) {
                m1286bw(c0818md, c0782kv.f37284g);
                return;
            } else {
                m1287bx(c0818md, c0782kv.f37283f);
                return;
            }
        }
        int i = 1;
        if (c0782kv.f37282e == -1) {
            int i2 = c0782kv.f37283f;
            int iM17319f = this.f1145a[0].m17319f(i2);
            while (i < this.f1153i) {
                int iM17319f2 = this.f1145a[i].m17319f(i2);
                if (iM17319f2 > iM17319f) {
                    iM17319f = iM17319f2;
                }
                i++;
            }
            int i3 = i2 - iM17319f;
            m1286bw(c0818md, i3 < 0 ? c0782kv.f37284g : c0782kv.f37284g - Math.min(i3, c0782kv.f37279b));
            return;
        }
        int i4 = c0782kv.f37284g;
        int iM17317d = this.f1145a[0].m17317d(i4);
        while (i < this.f1153i) {
            int iM17317d2 = this.f1145a[i].m17317d(i4);
            if (iM17317d2 < iM17317d) {
                iM17317d = iM17317d2;
            }
            i++;
        }
        int i5 = iM17317d - c0782kv.f37284g;
        if (i5 < 0) {
            iMin = c0782kv.f37283f;
        } else {
            iMin = Math.min(i5, c0782kv.f37279b) + c0782kv.f37283f;
        }
        m1287bx(c0818md, iMin);
    }

    /* JADX INFO: renamed from: bw */
    private final void m1286bw(C0818md c0818md, int i) {
        for (int iM16164aj = m16164aj() - 1; iM16164aj >= 0; iM16164aj--) {
            View viewM16174av = m16174av(iM16164aj);
            if (this.f1146b.mo15749d(viewM16174av) < i || this.f1146b.mo15758m(viewM16174av) < i) {
                return;
            }
            C0840mz c0840mz = (C0840mz) viewM16174av.getLayoutParams();
            boolean z = c0840mz.f41827b;
            if (c0840mz.f41826a.f41970a.size() == 1) {
                return;
            }
            C0844nc c0844nc = c0840mz.f41826a;
            int size = c0844nc.f41970a.size();
            View view = (View) c0844nc.f41970a.remove(size - 1);
            C0840mz c0840mzM17313n = C0844nc.m17313n(view);
            c0840mzM17313n.f41826a = null;
            if (c0840mzM17313n.m16220c() || c0840mzM17313n.m16219b()) {
                c0844nc.f41973d -= c0844nc.f41975f.f1146b.mo15747b(view);
            }
            if (size == 1) {
                c0844nc.f41971b = Integer.MIN_VALUE;
            }
            c0844nc.f41972c = Integer.MIN_VALUE;
            m16152aM(viewM16174av, c0818md);
        }
    }

    /* JADX INFO: renamed from: bx */
    private final void m1287bx(C0818md c0818md, int i) {
        while (m16164aj() > 0) {
            View viewM16174av = m16174av(0);
            if (this.f1146b.mo15746a(viewM16174av) > i || this.f1146b.mo15757l(viewM16174av) > i) {
                return;
            }
            C0840mz c0840mz = (C0840mz) viewM16174av.getLayoutParams();
            boolean z = c0840mz.f41827b;
            if (c0840mz.f41826a.f41970a.size() == 1) {
                return;
            }
            C0844nc c0844nc = c0840mz.f41826a;
            View view = (View) c0844nc.f41970a.remove(0);
            C0840mz c0840mzM17313n = C0844nc.m17313n(view);
            c0840mzM17313n.f41826a = null;
            if (c0844nc.f41970a.size() == 0) {
                c0844nc.f41972c = Integer.MIN_VALUE;
            }
            if (c0840mzM17313n.m16220c() || c0840mzM17313n.m16219b()) {
                c0844nc.f41973d -= c0844nc.f41975f.f1146b.mo15747b(view);
            }
            c0844nc.f41971b = Integer.MIN_VALUE;
            m16152aM(viewM16174av, c0818md);
        }
    }

    /* JADX INFO: renamed from: by */
    private final void m1288by() {
        this.f1149e = (this.f1154j == 1 || !m1294L()) ? this.f1148d : !this.f1148d;
    }

    /* JADX INFO: renamed from: bz */
    private final void m1289bz(int i) {
        C0782kv c0782kv = this.f1156l;
        c0782kv.f37282e = i;
        c0782kv.f37281d = this.f1149e != (i == -1) ? -1 : 1;
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: A */
    public final int mo1141A(C0826ml c0826ml) {
        return m1271T(c0826ml);
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: B */
    public final int mo1142B(C0826ml c0826ml) {
        return m1272U(c0826ml);
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: C */
    public final int mo1143C(C0826ml c0826ml) {
        return m1270P(c0826ml);
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: D */
    public final int mo1144D(C0826ml c0826ml) {
        return m1271T(c0826ml);
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: E */
    public final int mo1145E(C0826ml c0826ml) {
        return m1272U(c0826ml);
    }

    /* JADX INFO: renamed from: F */
    final void m1290F(int i, C0826ml c0826ml) {
        int iM1299c;
        int i2;
        if (i > 0) {
            iM1299c = m1300i();
            i2 = 1;
        } else {
            iM1299c = m1299c();
            i2 = -1;
        }
        this.f1156l.f37278a = true;
        m1278bA(iM1299c, c0826ml);
        m1289bz(i2);
        C0782kv c0782kv = this.f1156l;
        c0782kv.f37280c = iM1299c + c0782kv.f37281d;
        c0782kv.f37279b = Math.abs(i);
    }

    /* JADX INFO: renamed from: G */
    public final void m1291G(boolean z) {
        mo1154N(null);
        C0843nb c0843nb = this.f1139F;
        if (c0843nb != null && c0843nb.f41927h != z) {
            c0843nb.f41927h = z;
        }
        this.f1148d = z;
        m16155aP();
    }

    /* JADX INFO: renamed from: H */
    final void m1292H(int i) {
        this.f1155k = i / this.f1153i;
        View.MeasureSpec.makeMeasureSpec(i, this.f1147c.mo15753h());
    }

    /* JADX INFO: renamed from: I */
    public final boolean m1293I() {
        int iM1299c;
        if (m16164aj() == 0 || this.f1158n == 0 || !this.f39553t) {
            return false;
        }
        if (this.f1149e) {
            iM1299c = m1300i();
            m1299c();
        } else {
            iM1299c = m1299c();
            m1300i();
        }
        if (iM1299c != 0 || m1304u() == null) {
            return false;
        }
        this.f1152h.m885b();
        this.f39552s = true;
        m16155aP();
        return true;
    }

    @Override // p000.InterfaceC0824mj
    /* JADX INFO: renamed from: J */
    public final PointF mo1150J(int i) {
        int iM1269O = m1269O(i);
        PointF pointF = new PointF();
        if (iM1269O == 0) {
            return null;
        }
        if (this.f1154j == 0) {
            pointF.x = iM1269O;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iM1269O;
        }
        return pointF;
    }

    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, java.util.List] */
    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: K */
    public final Parcelable mo1151K() {
        int iM17319f;
        Object obj;
        C0843nb c0843nb = this.f1139F;
        if (c0843nb != null) {
            return new C0843nb(c0843nb);
        }
        C0843nb c0843nb2 = new C0843nb();
        c0843nb2.f41927h = this.f1148d;
        c0843nb2.f41928i = this.f1159o;
        c0843nb2.f41929j = this.f1138E;
        akw akwVar = this.f1152h;
        if (akwVar == null || (obj = akwVar.f606b) == null) {
            c0843nb2.f41924e = 0;
        } else {
            c0843nb2.f41925f = (int[]) obj;
            c0843nb2.f41924e = c0843nb2.f41925f.length;
            c0843nb2.f41926g = akwVar.f605a;
        }
        if (m16164aj() > 0) {
            c0843nb2.f41920a = this.f1159o ? m1300i() : m1299c();
            View viewM1302l = this.f1149e ? m1302l(true) : m1303r(true);
            c0843nb2.f41921b = viewM1302l != null ? m16136be(viewM1302l) : -1;
            int i = this.f1153i;
            c0843nb2.f41922c = i;
            c0843nb2.f41923d = new int[i];
            for (int i2 = 0; i2 < this.f1153i; i2++) {
                if (this.f1159o) {
                    iM17319f = this.f1145a[i2].m17317d(Integer.MIN_VALUE);
                    if (iM17319f != Integer.MIN_VALUE) {
                        iM17319f -= this.f1146b.mo15751f();
                    }
                } else {
                    iM17319f = this.f1145a[i2].m17319f(Integer.MIN_VALUE);
                    if (iM17319f != Integer.MIN_VALUE) {
                        iM17319f -= this.f1146b.mo15755j();
                    }
                }
                c0843nb2.f41923d[i2] = iM17319f;
            }
        } else {
            c0843nb2.f41920a = -1;
            c0843nb2.f41921b = -1;
            c0843nb2.f41922c = 0;
        }
        return c0843nb2;
    }

    /* JADX INFO: renamed from: L */
    final boolean m1294L() {
        return m16166am() == 1;
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: N */
    public final void mo1154N(String str) {
        if (this.f1139F == null) {
            super.mo1154N(str);
        }
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: Q */
    public final void mo1157Q(AccessibilityEvent accessibilityEvent) {
        super.mo1157Q(accessibilityEvent);
        if (m16164aj() > 0) {
            View viewM1303r = m1303r(false);
            View viewM1302l = m1302l(false);
            if (viewM1303r == null || viewM1302l == null) {
                return;
            }
            int iBe = m16136be(viewM1303r);
            int iBe2 = m16136be(viewM1302l);
            if (iBe < iBe2) {
                accessibilityEvent.setFromIndex(iBe);
                accessibilityEvent.setToIndex(iBe2);
            } else {
                accessibilityEvent.setFromIndex(iBe2);
                accessibilityEvent.setToIndex(iBe);
            }
        }
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: R */
    public final void mo1158R(Parcelable parcelable) {
        if (parcelable instanceof C0843nb) {
            C0843nb c0843nb = (C0843nb) parcelable;
            this.f1139F = c0843nb;
            if (this.f1150f != -1) {
                c0843nb.m17247a();
                this.f1139F.m17248b();
            }
            m16155aP();
        }
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: S */
    public final void mo1159S(int i) {
        C0843nb c0843nb = this.f1139F;
        if (c0843nb != null && c0843nb.f41920a != i) {
            c0843nb.m17247a();
        }
        this.f1150f = i;
        this.f1151g = Integer.MIN_VALUE;
        m16155aP();
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: V */
    public final boolean mo1162V() {
        return this.f1154j == 0;
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: W */
    public final boolean mo1163W() {
        return this.f1154j == 1;
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: X */
    public final boolean mo1164X() {
        return this.f1158n != 0;
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: aF */
    public final void mo1295aF(int i) {
        super.mo1295aF(i);
        for (int i2 = 0; i2 < this.f1153i; i2++) {
            this.f1145a[i2].m17324k(i);
        }
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: aG */
    public final void mo1296aG(int i) {
        super.mo1296aG(i);
        for (int i2 = 0; i2 < this.f1153i; i2++) {
            this.f1145a[i2].m17324k(i);
        }
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: aJ */
    public final void mo1297aJ(int i) {
        if (i == 0) {
            m1293I();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: ab */
    public final void mo1168ab(int i, int i2, C0826ml c0826ml, C0778kr c0778kr) {
        int i3;
        int i4;
        int iM17317d;
        if (1 == this.f1154j) {
            i = i2;
        }
        if (m16164aj() == 0 || i == 0) {
            return;
        }
        m1290F(i, c0826ml);
        int[] iArr = this.f1143J;
        if (iArr != null) {
            if (iArr.length < this.f1153i) {
                this.f1143J = new int[this.f1153i];
                i3 = 0;
                i4 = 0;
            } else {
                i3 = 0;
                i4 = 0;
            }
        } else {
            this.f1143J = new int[this.f1153i];
            i3 = 0;
            i4 = 0;
        }
        while (i3 < this.f1153i) {
            C0782kv c0782kv = this.f1156l;
            if (c0782kv.f37281d == -1) {
                int i5 = c0782kv.f37283f;
                iM17317d = i5 - this.f1145a[i3].m17319f(i5);
            } else {
                iM17317d = this.f1145a[i3].m17317d(c0782kv.f37284g) - this.f1156l.f37284g;
            }
            if (iM17317d >= 0) {
                this.f1143J[i4] = iM17317d;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.f1143J, 0, i4);
        for (int i6 = 0; i6 < i4 && this.f1156l.m14926a(c0826ml); i6++) {
            c0778kr.m14735a(this.f1156l.f37280c, this.f1143J[i6]);
            C0782kv c0782kv2 = this.f1156l;
            c0782kv2.f37280c += c0782kv2.f37281d;
        }
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: ag */
    public final void mo1173ag(RecyclerView recyclerView) {
        m16181bm(this.f1144K);
        for (int i = 0; i < this.f1153i; i++) {
            this.f1145a[i].m17323j();
        }
        recyclerView.requestLayout();
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: ah */
    public final void mo1174ah(RecyclerView recyclerView, int i) {
        C0825mk c0825mk = new C0825mk(recyclerView.getContext());
        c0825mk.f40796b = i;
        m16161aV(c0825mk);
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: bk */
    public final void mo1298bk() {
        this.f1152h.m885b();
        for (int i = 0; i < this.f1153i; i++) {
            this.f1145a[i].m17323j();
        }
    }

    /* JADX INFO: renamed from: c */
    final int m1299c() {
        if (m16164aj() == 0) {
            return 0;
        }
        return m16136be(m16174av(0));
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: d */
    public final int mo1096d(int i, C0818md c0818md, C0826ml c0826ml) {
        return m1301k(i, c0818md, c0826ml);
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: e */
    public final int mo1097e(int i, C0818md c0818md, C0826ml c0826ml) {
        return m1301k(i, c0818md, c0826ml);
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: f */
    public final C0813lz mo1098f() {
        return this.f1154j == 0 ? new C0840mz(-2, -1) : new C0840mz(-1, -2);
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: g */
    public final C0813lz mo1099g(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0840mz((ViewGroup.MarginLayoutParams) layoutParams) : new C0840mz(layoutParams);
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: h */
    public final C0813lz mo1100h(Context context, AttributeSet attributeSet) {
        return new C0840mz(context, attributeSet);
    }

    /* JADX INFO: renamed from: i */
    final int m1300i() {
        int iM16164aj = m16164aj();
        if (iM16164aj == 0) {
            return 0;
        }
        return m16136be(m16174av(iM16164aj - 1));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x002f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0031  */
    /* JADX WARN: Code duplicated, block: B:26:0x0038 A[ADDED_TO_REGION, REMOVE] */
    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: j */
    public final View mo1102j(View view, int i, C0818md c0818md, C0826ml c0826ml) {
        View viewM16173au;
        int i2;
        if (m16164aj() == 0 || (viewM16173au = m16173au(view)) == null) {
            return null;
        }
        m1288by();
        switch (i) {
            case 1:
                if (this.f1154j == 1 || !m1294L()) {
                    i2 = -1;
                }
                break;
            case 2:
                i2 = (this.f1154j != 1 && m1294L()) ? -1 : 1;
                break;
            case 17:
                if (this.f1154j == 0) {
                    i2 = -1;
                } else {
                    i2 = Integer.MIN_VALUE;
                }
                break;
            case 33:
                if (this.f1154j == 1) {
                    i2 = -1;
                } else {
                    i2 = Integer.MIN_VALUE;
                }
                break;
            case 66:
                if (this.f1154j != 0) {
                    i2 = Integer.MIN_VALUE;
                }
                break;
            case 130:
                if (this.f1154j != 1) {
                    i2 = Integer.MIN_VALUE;
                }
                break;
            default:
                i2 = Integer.MIN_VALUE;
                break;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        C0840mz c0840mz = (C0840mz) viewM16173au.getLayoutParams();
        boolean z = c0840mz.f41827b;
        C0844nc c0844nc = c0840mz.f41826a;
        int iM1300i = i2 == 1 ? m1300i() : m1299c();
        m1278bA(iM1300i, c0826ml);
        m1289bz(i2);
        C0782kv c0782kv = this.f1156l;
        c0782kv.f37280c = c0782kv.f37281d + iM1300i;
        c0782kv.f37279b = (int) (this.f1146b.mo15756k() * 0.33333334f);
        C0782kv c0782kv2 = this.f1156l;
        c0782kv2.f37285h = true;
        c0782kv2.f37278a = false;
        m1273Y(c0818md, c0782kv2, c0826ml);
        this.f1159o = this.f1149e;
        View viewM17320g = c0844nc.m17320g(iM1300i, i2);
        if (viewM17320g != null && viewM17320g != viewM16173au) {
            return viewM17320g;
        }
        if (m1280bC(i2)) {
            for (int i3 = this.f1153i - 1; i3 >= 0; i3--) {
                View viewM17320g2 = this.f1145a[i3].m17320g(iM1300i, i2);
                if (viewM17320g2 != null && viewM17320g2 != viewM16173au) {
                    return viewM17320g2;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.f1153i; i4++) {
                View viewM17320g3 = this.f1145a[i4].m17320g(iM1300i, i2);
                if (viewM17320g3 != null && viewM17320g3 != viewM16173au) {
                    return viewM17320g3;
                }
            }
        }
        boolean z2 = (this.f1148d ^ true) == (i2 == -1);
        View viewMo1153M = mo1153M(z2 ? c0844nc.m17314a() : c0844nc.m17315b());
        if (viewMo1153M != null && viewMo1153M != viewM16173au) {
            return viewMo1153M;
        }
        if (m1280bC(i2)) {
            for (int i5 = this.f1153i - 1; i5 >= 0; i5--) {
                if (i5 != c0844nc.f41974e) {
                    View viewMo1153M2 = mo1153M(z2 ? this.f1145a[i5].m17314a() : this.f1145a[i5].m17315b());
                    if (viewMo1153M2 != null && viewMo1153M2 != viewM16173au) {
                        return viewMo1153M2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f1153i; i6++) {
                View viewMo1153M3 = mo1153M(z2 ? this.f1145a[i6].m17314a() : this.f1145a[i6].m17315b());
                if (viewMo1153M3 != null && viewMo1153M3 != viewM16173au) {
                    return viewMo1153M3;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    final int m1301k(int i, C0818md c0818md, C0826ml c0826ml) {
        if (m16164aj() == 0 || i == 0) {
            return 0;
        }
        m1290F(i, c0826ml);
        int iM1273Y = m1273Y(c0818md, this.f1156l, c0826ml);
        if (this.f1156l.f37279b >= iM1273Y) {
            i = i < 0 ? -iM1273Y : iM1273Y;
        }
        this.f1146b.mo15759n(-i);
        this.f1159o = this.f1149e;
        C0782kv c0782kv = this.f1156l;
        c0782kv.f37279b = 0;
        m1285bv(c0818md, c0782kv);
        return i;
    }

    /* JADX INFO: renamed from: l */
    final View m1302l(boolean z) {
        int iMo15755j = this.f1146b.mo15755j();
        int iMo15751f = this.f1146b.mo15751f();
        View view = null;
        for (int iM16164aj = m16164aj() - 1; iM16164aj >= 0; iM16164aj--) {
            View viewM16174av = m16174av(iM16164aj);
            int iMo15749d = this.f1146b.mo15749d(viewM16174av);
            int iMo15746a = this.f1146b.mo15746a(viewM16174av);
            if (iMo15746a > iMo15755j && iMo15749d < iMo15751f) {
                if (iMo15746a <= iMo15751f || !z) {
                    return viewM16174av;
                }
                if (view == null) {
                    view = viewM16174av;
                }
            }
        }
        return view;
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: o */
    public final void mo1107o(C0818md c0818md, C0826ml c0826ml) {
        m1284bu(c0818md, c0826ml, true);
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: p */
    public final void mo1108p(C0826ml c0826ml) {
        this.f1150f = -1;
        this.f1151g = Integer.MIN_VALUE;
        this.f1139F = null;
        this.f1141H.m17157a();
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: q */
    public final void mo1109q(Rect rect, int i, int i2) {
        int iAi;
        int iAi2;
        int iM16170aq = m16170aq() + m16171ar();
        int iM16172as = m16172as() + m16169ap();
        if (this.f1154j == 1) {
            iAi2 = m16128ai(i2, rect.height() + iM16172as, m16167an());
            iAi = m16128ai(i, (this.f1155k * this.f1153i) + iM16170aq, m16168ao());
        } else {
            iAi = m16128ai(i, rect.width() + iM16170aq, m16168ao());
            iAi2 = m16128ai(i2, (this.f1155k * this.f1153i) + iM16172as, m16167an());
        }
        m16158aS(iAi, iAi2);
    }

    /* JADX INFO: renamed from: r */
    final View m1303r(boolean z) {
        int iMo15755j = this.f1146b.mo15755j();
        int iMo15751f = this.f1146b.mo15751f();
        int iM16164aj = m16164aj();
        View view = null;
        for (int i = 0; i < iM16164aj; i++) {
            View viewM16174av = m16174av(i);
            int iMo15749d = this.f1146b.mo15749d(viewM16174av);
            if (this.f1146b.mo15746a(viewM16174av) > iMo15755j && iMo15749d < iMo15751f) {
                if (iMo15749d >= iMo15755j || !z) {
                    return viewM16174av;
                }
                if (view == null) {
                    view = viewM16174av;
                }
            }
        }
        return view;
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: s */
    public final boolean mo1111s(C0813lz c0813lz) {
        return c0813lz instanceof C0840mz;
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: t */
    public final boolean mo1112t() {
        return this.f1139F == null;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0030 A[SYNTHETIC] */
    /* JADX INFO: renamed from: u */
    final View m1304u() {
        int i;
        boolean z;
        boolean z2;
        int iM16164aj = m16164aj() - 1;
        BitSet bitSet = new BitSet(this.f1153i);
        bitSet.set(0, this.f1153i, true);
        byte b = (this.f1154j == 1 && m1294L()) ? (byte) 1 : (byte) -1;
        if (this.f1149e) {
            i = -1;
        } else {
            i = iM16164aj + 1;
            iM16164aj = 0;
        }
        int i2 = iM16164aj < i ? 1 : -1;
        while (iM16164aj != i) {
            View viewM16174av = m16174av(iM16164aj);
            C0840mz c0840mz = (C0840mz) viewM16174av.getLayoutParams();
            if (bitSet.get(c0840mz.f41826a.f41974e)) {
                C0844nc c0844nc = c0840mz.f41826a;
                if (this.f1149e) {
                    if (c0844nc.m17316c() < this.f1146b.mo15751f()) {
                        ArrayList arrayList = c0844nc.f41970a;
                        boolean z3 = C0844nc.m17313n((View) arrayList.get(arrayList.size() - 1)).f41827b;
                        return viewM16174av;
                    }
                    bitSet.clear(c0840mz.f41826a.f41974e);
                } else {
                    if (c0844nc.m17318e() > this.f1146b.mo15755j()) {
                        boolean z4 = C0844nc.m17313n((View) c0844nc.f41970a.get(0)).f41827b;
                        return viewM16174av;
                    }
                    bitSet.clear(c0840mz.f41826a.f41974e);
                }
            }
            boolean z5 = c0840mz.f41827b;
            iM16164aj += i2;
            if (iM16164aj != i) {
                View viewM16174av2 = m16174av(iM16164aj);
                if (this.f1149e) {
                    int iMo15746a = this.f1146b.mo15746a(viewM16174av);
                    int iMo15746a2 = this.f1146b.mo15746a(viewM16174av2);
                    if (iMo15746a < iMo15746a2) {
                        return viewM16174av;
                    }
                    if (iMo15746a == iMo15746a2) {
                        if (c0840mz.f41826a.f41974e - ((C0840mz) viewM16174av2.getLayoutParams()).f41826a.f41974e >= 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (b >= 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z == z2) {
                            return viewM16174av;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int iMo15749d = this.f1146b.mo15749d(viewM16174av);
                    int iMo15749d2 = this.f1146b.mo15749d(viewM16174av2);
                    if (iMo15749d > iMo15749d2) {
                        return viewM16174av;
                    }
                    if (iMo15749d != iMo15749d2) {
                        continue;
                    } else {
                        if (c0840mz.f41826a.f41974e - ((C0840mz) viewM16174av2.getLayoutParams()).f41826a.f41974e >= 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (b >= 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z == z2) {
                            return viewM16174av;
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: v */
    public final void mo1114v(int i, int i2) {
        m1283bt(i, i2, 1);
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: w */
    public final void mo1115w() {
        this.f1152h.m885b();
        m16155aP();
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: x */
    public final void mo1116x(int i, int i2) {
        m1283bt(i, i2, 2);
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: y */
    public final void mo1117y(int i, int i2) {
        m1283bt(i, i2, 4);
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: z */
    public final int mo1175z(C0826ml c0826ml) {
        return m1270P(c0826ml);
    }
}
