package androidx.fragment.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.R$id;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.FragmentStrictMode$Flag;
import androidx.lifecycle.Lifecycle$State;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p000.AbstractC3393o1;
import p000.C3028g7;
import p000.C3386nv;
import p000.C3399o7;
import p000.RunnableC3795yg;
import p000.af9;
import p000.be3;
import p000.bl2;
import p000.bq1;
import p000.ce3;
import p000.cua;
import p000.de3;
import p000.e41;
import p000.ed3;
import p000.fe3;
import p000.fs6;
import p000.g70;
import p000.g9a;
import p000.ge3;
import p000.hd3;
import p000.id3;
import p000.ie3;
import p000.ih5;
import p000.je3;
import p000.kh5;
import p000.kj5;
import p000.le3;
import p000.lk1;
import p000.mc1;
import p000.me3;
import p000.ne3;
import p000.ny8;
import p000.or1;
import p000.p82;
import p000.pe9;
import p000.pr6;
import p000.rf3;
import p000.sc1;
import p000.se3;
import p000.sf3;
import p000.sq5;
import p000.ud3;
import p000.uk9;
import p000.ux5;
import p000.v63;
import p000.vf3;
import p000.w60;
import p000.wq1;
import p000.y38;
import p000.z21;
import p000.zd3;
import p000.ze9;

/* JADX INFO: renamed from: androidx.fragment.app.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0638f {

    /* JADX INFO: renamed from: A */
    public AbstractComponentCallbacksC0635c f5723A;

    /* JADX INFO: renamed from: B */
    public final de3 f5724B;

    /* JADX INFO: renamed from: C */
    public final e41 f5725C;

    /* JADX INFO: renamed from: D */
    public C3399o7 f5726D;

    /* JADX INFO: renamed from: E */
    public C3399o7 f5727E;

    /* JADX INFO: renamed from: F */
    public C3399o7 f5728F;

    /* JADX INFO: renamed from: G */
    public ArrayDeque f5729G;

    /* JADX INFO: renamed from: H */
    public boolean f5730H;

    /* JADX INFO: renamed from: I */
    public boolean f5731I;

    /* JADX INFO: renamed from: J */
    public boolean f5732J;

    /* JADX INFO: renamed from: K */
    public boolean f5733K;

    /* JADX INFO: renamed from: L */
    public boolean f5734L;

    /* JADX INFO: renamed from: M */
    public ArrayList f5735M;

    /* JADX INFO: renamed from: N */
    public ArrayList f5736N;

    /* JADX INFO: renamed from: O */
    public ArrayList f5737O;

    /* JADX INFO: renamed from: P */
    public ne3 f5738P;

    /* JADX INFO: renamed from: Q */
    public final RunnableC3795yg f5739Q;

    /* JADX INFO: renamed from: b */
    public boolean f5741b;

    /* JADX INFO: renamed from: e */
    public ArrayList f5744e;

    /* JADX INFO: renamed from: g */
    public pr6 f5746g;

    /* JADX INFO: renamed from: p */
    public final bl2 f5755p;

    /* JADX INFO: renamed from: q */
    public final CopyOnWriteArrayList f5756q;

    /* JADX INFO: renamed from: r */
    public final be3 f5757r;

    /* JADX INFO: renamed from: s */
    public final be3 f5758s;

    /* JADX INFO: renamed from: t */
    public final be3 f5759t;

    /* JADX INFO: renamed from: u */
    public final be3 f5760u;

    /* JADX INFO: renamed from: v */
    public final ce3 f5761v;

    /* JADX INFO: renamed from: w */
    public int f5762w;

    /* JADX INFO: renamed from: x */
    public hd3 f5763x;

    /* JADX INFO: renamed from: y */
    public bq1 f5764y;

    /* JADX INFO: renamed from: z */
    public AbstractComponentCallbacksC0635c f5765z;

    /* JADX INFO: renamed from: a */
    public final ArrayList f5740a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ny8 f5742c = new ny8(4);

    /* JADX INFO: renamed from: d */
    public ArrayList f5743d = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ud3 f5745f = new ud3(this);

    /* JADX INFO: renamed from: h */
    public g70 f5747h = null;

    /* JADX INFO: renamed from: i */
    public boolean f5748i = false;

    /* JADX INFO: renamed from: j */
    public final w60 f5749j = new w60(this, 1);

    /* JADX INFO: renamed from: k */
    public final AtomicInteger f5750k = new AtomicInteger();

    /* JADX INFO: renamed from: l */
    public final Map f5751l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m */
    public final Map f5752m = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n */
    public final Map f5753n = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: o */
    public final ArrayList f5754o = new ArrayList();

    /* JADX WARN: Type inference failed for: r0v17, types: [be3] */
    /* JADX WARN: Type inference failed for: r0v18, types: [be3] */
    /* JADX WARN: Type inference failed for: r0v19, types: [be3] */
    /* JADX WARN: Type inference failed for: r0v20, types: [be3] */
    public AbstractC0638f() {
        bl2 bl2Var = new bl2();
        bl2Var.f8655a = this;
        bl2Var.f8656b = new CopyOnWriteArrayList();
        this.f5755p = bl2Var;
        this.f5756q = new CopyOnWriteArrayList();
        final int i = 0;
        this.f5757r = new lk1(this) { // from class: be3

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC0638f f8427b;

            {
                this.f8427b = this;
            }

            @Override // p000.lk1
            public final void accept(Object obj) {
                int i2 = i;
                AbstractC0638f abstractC0638f = this.f8427b;
                switch (i2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (abstractC0638f.m2143N()) {
                            abstractC0638f.m2170i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (abstractC0638f.m2143N() && num.intValue() == 80) {
                            abstractC0638f.m2177m(false);
                            break;
                        }
                        break;
                    case 2:
                        h56 h56Var = (h56) obj;
                        if (abstractC0638f.m2143N()) {
                            h56Var.getClass();
                            abstractC0638f.m2179n(false);
                        }
                        break;
                    default:
                        i87 i87Var = (i87) obj;
                        if (abstractC0638f.m2143N()) {
                            i87Var.getClass();
                            abstractC0638f.m2184s(false);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f5758s = new lk1(this) { // from class: be3

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC0638f f8427b;

            {
                this.f8427b = this;
            }

            @Override // p000.lk1
            public final void accept(Object obj) {
                int i3 = i2;
                AbstractC0638f abstractC0638f = this.f8427b;
                switch (i3) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (abstractC0638f.m2143N()) {
                            abstractC0638f.m2170i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (abstractC0638f.m2143N() && num.intValue() == 80) {
                            abstractC0638f.m2177m(false);
                            break;
                        }
                        break;
                    case 2:
                        h56 h56Var = (h56) obj;
                        if (abstractC0638f.m2143N()) {
                            h56Var.getClass();
                            abstractC0638f.m2179n(false);
                        }
                        break;
                    default:
                        i87 i87Var = (i87) obj;
                        if (abstractC0638f.m2143N()) {
                            i87Var.getClass();
                            abstractC0638f.m2184s(false);
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f5759t = new lk1(this) { // from class: be3

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC0638f f8427b;

            {
                this.f8427b = this;
            }

            @Override // p000.lk1
            public final void accept(Object obj) {
                int i4 = i3;
                AbstractC0638f abstractC0638f = this.f8427b;
                switch (i4) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (abstractC0638f.m2143N()) {
                            abstractC0638f.m2170i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (abstractC0638f.m2143N() && num.intValue() == 80) {
                            abstractC0638f.m2177m(false);
                            break;
                        }
                        break;
                    case 2:
                        h56 h56Var = (h56) obj;
                        if (abstractC0638f.m2143N()) {
                            h56Var.getClass();
                            abstractC0638f.m2179n(false);
                        }
                        break;
                    default:
                        i87 i87Var = (i87) obj;
                        if (abstractC0638f.m2143N()) {
                            i87Var.getClass();
                            abstractC0638f.m2184s(false);
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f5760u = new lk1(this) { // from class: be3

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC0638f f8427b;

            {
                this.f8427b = this;
            }

            @Override // p000.lk1
            public final void accept(Object obj) {
                int i5 = i4;
                AbstractC0638f abstractC0638f = this.f8427b;
                switch (i5) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (abstractC0638f.m2143N()) {
                            abstractC0638f.m2170i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (abstractC0638f.m2143N() && num.intValue() == 80) {
                            abstractC0638f.m2177m(false);
                            break;
                        }
                        break;
                    case 2:
                        h56 h56Var = (h56) obj;
                        if (abstractC0638f.m2143N()) {
                            h56Var.getClass();
                            abstractC0638f.m2179n(false);
                        }
                        break;
                    default:
                        i87 i87Var = (i87) obj;
                        if (abstractC0638f.m2143N()) {
                            i87Var.getClass();
                            abstractC0638f.m2184s(false);
                        }
                        break;
                }
            }
        };
        this.f5761v = new ce3(this);
        this.f5762w = -1;
        this.f5724B = new de3(this);
        this.f5725C = new e41(11);
        this.f5729G = new ArrayDeque();
        this.f5739Q = new RunnableC3795yg(this, 4);
    }

    /* JADX INFO: renamed from: G */
    public static HashSet m2127G(g70 g70Var) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < g70Var.f40287a.size(); i++) {
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = ((vf3) g70Var.f40287a.get(i)).f65305b;
            if (abstractComponentCallbacksC0635c != null && g70Var.f40293g) {
                hashSet.add(abstractComponentCallbacksC0635c);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: L */
    public static boolean m2128L(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* JADX INFO: renamed from: M */
    public static boolean m2129M(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        abstractComponentCallbacksC0635c.getClass();
        boolean zM2129M = false;
        for (AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 : abstractComponentCallbacksC0635c.f5676R.f5742c.m17705y()) {
            if (abstractComponentCallbacksC0635c2 != null) {
                zM2129M = m2129M(abstractComponentCallbacksC0635c2);
            }
            if (zM2129M) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: O */
    public static boolean m2130O(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        if (abstractComponentCallbacksC0635c == null) {
            return true;
        }
        if (abstractComponentCallbacksC0635c.f5686a0) {
            return abstractComponentCallbacksC0635c.f5674P == null || m2130O(abstractComponentCallbacksC0635c.f5677S);
        }
        return false;
    }

    /* JADX INFO: renamed from: P */
    public static boolean m2131P(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        if (abstractComponentCallbacksC0635c == null) {
            return true;
        }
        AbstractC0638f abstractC0638f = abstractComponentCallbacksC0635c.f5674P;
        return abstractComponentCallbacksC0635c == abstractC0638f.f5723A && m2131P(abstractC0638f.f5765z);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m2132i0(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        if (m2128L(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0635c);
        }
        if (abstractComponentCallbacksC0635c.f5681W) {
            abstractComponentCallbacksC0635c.f5681W = false;
            abstractComponentCallbacksC0635c.f5700h0 = !abstractComponentCallbacksC0635c.f5700h0;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m2133A(g70 g70Var, boolean z) {
        if (z && (this.f5763x == null || this.f5733K)) {
            return;
        }
        m2190y(z);
        g70 g70Var2 = this.f5747h;
        if (g70Var2 != null) {
            g70Var2.f40305s = false;
            g70Var2.m12395e();
            if (m2128L(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f5747h + " as part of execSingleAction for action " + g70Var);
            }
            this.f5747h.m12397g(false, false);
            this.f5747h.mo2126a(this.f5735M, this.f5736N);
            Iterator it = this.f5747h.f40287a.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = ((vf3) it.next()).f65305b;
                if (abstractComponentCallbacksC0635c != null) {
                    abstractComponentCallbacksC0635c.f5666H = false;
                }
            }
            this.f5747h = null;
        }
        g70Var.mo2126a(this.f5735M, this.f5736N);
        this.f5741b = true;
        try {
            m2155a0(this.f5735M, this.f5736N);
            m2160d();
            m2178m0();
            if (this.f5734L) {
                this.f5734L = false;
                m2172j0();
            }
            ((HashMap) this.f5742c.f53415c).values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            m2160d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0236 A[PHI: r15
      0x0236: PHI (r15v21 int) = (r15v20 int), (r15v23 int) binds: [B:105:0x0223, B:109:0x022d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:64:0x0176  */
    /* JADX INFO: renamed from: B */
    public final void m2134B(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        Object objPrevious;
        ArrayList arrayList3;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5 = i;
        ny8 ny8Var = this.f5742c;
        ArrayList arrayList4 = this.f5754o;
        boolean z4 = ((g70) arrayList.get(i5)).f40302p;
        ArrayList arrayList5 = this.f5737O;
        if (arrayList5 == null) {
            this.f5737O = new ArrayList();
        } else {
            arrayList5.clear();
        }
        this.f5737O.addAll(ny8Var.m17706z());
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f5723A;
        int i6 = i5;
        boolean z5 = false;
        while (i6 < i2) {
            g70 g70Var = (g70) arrayList.get(i6);
            boolean zBooleanValue = ((Boolean) arrayList2.get(i6)).booleanValue();
            ArrayList arrayList6 = this.f5737O;
            if (zBooleanValue) {
                arrayList3 = arrayList4;
                z = z4;
                i3 = i6;
                z2 = z5;
                int i7 = 1;
                ArrayList arrayList7 = g70Var.f40287a;
                int size = arrayList7.size() - 1;
                while (size >= 0) {
                    vf3 vf3Var = (vf3) arrayList7.get(size);
                    int i8 = vf3Var.f65304a;
                    if (i8 != i7) {
                        if (i8 != 3) {
                            switch (i8) {
                                case 6:
                                    arrayList6.add(vf3Var.f65305b);
                                    break;
                                case 8:
                                    abstractComponentCallbacksC0635c = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0635c = vf3Var.f65305b;
                                    break;
                                case 10:
                                    vf3Var.f65312i = vf3Var.f65311h;
                                    break;
                            }
                        } else {
                            arrayList6.add(vf3Var.f65305b);
                        }
                        size--;
                        i7 = 1;
                    }
                    arrayList6.remove(vf3Var.f65305b);
                    size--;
                    i7 = 1;
                }
            } else {
                ArrayList arrayList8 = g70Var.f40287a;
                int i9 = 0;
                while (i9 < arrayList8.size()) {
                    vf3 vf3Var2 = (vf3) arrayList8.get(i9);
                    boolean z6 = z4;
                    int i10 = vf3Var2.f65304a;
                    int i11 = i6;
                    int i12 = 1;
                    if (i10 != 1) {
                        z3 = z5;
                        if (i10 != 2) {
                            if (i10 == 3 || i10 == 6) {
                                arrayList6.remove(vf3Var2.f65305b);
                                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = vf3Var2.f65305b;
                                if (abstractComponentCallbacksC0635c2 == abstractComponentCallbacksC0635c) {
                                    arrayList8.add(i9, new vf3(9, abstractComponentCallbacksC0635c2));
                                    i9++;
                                    abstractComponentCallbacksC0635c = null;
                                }
                            } else if (i10 == 7) {
                                i12 = 1;
                            } else if (i10 == 8) {
                                arrayList8.add(i9, new vf3(9, abstractComponentCallbacksC0635c, 0));
                                vf3Var2.f65306c = true;
                                i9++;
                                abstractComponentCallbacksC0635c = vf3Var2.f65305b;
                            }
                            i12 = 1;
                        } else {
                            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c3 = vf3Var2.f65305b;
                            int i13 = abstractComponentCallbacksC0635c3.f5679U;
                            int size2 = arrayList6.size() - 1;
                            boolean z7 = false;
                            while (size2 >= 0) {
                                int i14 = size2;
                                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c4 = (AbstractComponentCallbacksC0635c) arrayList6.get(size2);
                                ArrayList arrayList9 = arrayList4;
                                if (abstractComponentCallbacksC0635c4.f5679U != i13) {
                                    i13 = i13;
                                } else if (abstractComponentCallbacksC0635c4 == abstractComponentCallbacksC0635c3) {
                                    i13 = i13;
                                    z7 = true;
                                } else {
                                    if (abstractComponentCallbacksC0635c4 == abstractComponentCallbacksC0635c) {
                                        arrayList8.add(i9, new vf3(9, abstractComponentCallbacksC0635c4, 0));
                                        i9++;
                                        i4 = 0;
                                        abstractComponentCallbacksC0635c = null;
                                    } else {
                                        i4 = 0;
                                    }
                                    vf3 vf3Var3 = new vf3(3, abstractComponentCallbacksC0635c4, i4);
                                    vf3Var3.f65307d = vf3Var2.f65307d;
                                    vf3Var3.f65309f = vf3Var2.f65309f;
                                    vf3Var3.f65308e = vf3Var2.f65308e;
                                    vf3Var3.f65310g = vf3Var2.f65310g;
                                    arrayList8.add(i9, vf3Var3);
                                    arrayList6.remove(abstractComponentCallbacksC0635c4);
                                    i9++;
                                    abstractComponentCallbacksC0635c = abstractComponentCallbacksC0635c;
                                }
                                size2 = i14 - 1;
                                i13 = i13;
                                arrayList4 = arrayList9;
                            }
                            arrayList4 = arrayList4;
                            i12 = 1;
                            if (z7) {
                                arrayList8.remove(i9);
                                i9--;
                            } else {
                                vf3Var2.f65304a = 1;
                                vf3Var2.f65306c = true;
                                arrayList6.add(abstractComponentCallbacksC0635c3);
                            }
                        }
                        i9 += i12;
                        z4 = z6;
                        i6 = i11;
                        z5 = z3;
                        arrayList4 = arrayList4;
                    } else {
                        z3 = z5;
                    }
                    arrayList4 = arrayList4;
                    arrayList6.add(vf3Var2.f65305b);
                    i9 += i12;
                    z4 = z6;
                    i6 = i11;
                    z5 = z3;
                    arrayList4 = arrayList4;
                }
                arrayList3 = arrayList4;
                z = z4;
                i3 = i6;
                z2 = z5;
            }
            z5 = z2 || g70Var.f40293g;
            i6 = i3 + 1;
            z4 = z;
            arrayList4 = arrayList3;
        }
        ArrayList<se3> arrayList10 = arrayList4;
        boolean z8 = z4;
        boolean z9 = z5;
        this.f5737O.clear();
        if (!z8 && this.f5762w >= 1) {
            for (int i15 = i5; i15 < i2; i15++) {
                Iterator it = ((g70) arrayList.get(i15)).f40287a.iterator();
                while (it.hasNext()) {
                    AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c5 = ((vf3) it.next()).f65305b;
                    if (abstractComponentCallbacksC0635c5 != null && abstractComponentCallbacksC0635c5.f5674P != null) {
                        ny8Var.m17678E(m2166g(abstractComponentCallbacksC0635c5));
                    }
                }
            }
        }
        String str = "Unknown cmd: ";
        int i16 = i5;
        while (i16 < i2) {
            g70 g70Var2 = (g70) arrayList.get(i16);
            if (((Boolean) arrayList2.get(i16)).booleanValue()) {
                g70Var2.m12394d(-1);
                AbstractC0638f abstractC0638f = g70Var2.f40304r;
                ArrayList arrayList11 = g70Var2.f40287a;
                for (int size3 = arrayList11.size() - 1; size3 >= 0; size3--) {
                    vf3 vf3Var4 = (vf3) arrayList11.get(size3);
                    AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c6 = vf3Var4.f65305b;
                    if (abstractComponentCallbacksC0635c6 != null) {
                        abstractComponentCallbacksC0635c6.f5667I = g70Var2.f40307u;
                        if (abstractComponentCallbacksC0635c6.f5698g0 != null) {
                            abstractComponentCallbacksC0635c6.m2104f().f37041a = true;
                        }
                        int i17 = g70Var2.f40292f;
                        int i18 = 8194;
                        int i19 = 4097;
                        if (i17 != 4097) {
                            if (i17 != 8194) {
                                i18 = 4100;
                                if (i17 != 8197) {
                                    i19 = 4099;
                                    if (i17 != 4099) {
                                        i18 = i17 != 4100 ? 0 : 8197;
                                    } else {
                                        i18 = i19;
                                    }
                                }
                            } else {
                                i18 = i19;
                            }
                        }
                        if (abstractComponentCallbacksC0635c6.f5698g0 != null || i18 != 0) {
                            abstractComponentCallbacksC0635c6.m2104f();
                            abstractComponentCallbacksC0635c6.f5698g0.f37046f = i18;
                        }
                        abstractComponentCallbacksC0635c6.m2104f();
                        abstractComponentCallbacksC0635c6.f5698g0.getClass();
                    }
                    switch (vf3Var4.f65304a) {
                        case 1:
                            abstractComponentCallbacksC0635c6.m2094V(vf3Var4.f65307d, vf3Var4.f65308e, vf3Var4.f65309f, vf3Var4.f65310g);
                            abstractC0638f.m2163e0(abstractComponentCallbacksC0635c6, true);
                            abstractC0638f.m2153Z(abstractComponentCallbacksC0635c6);
                            break;
                        case 2:
                        default:
                            v63.m23130h(vf3Var4.f65304a, str);
                            return;
                        case 3:
                            abstractComponentCallbacksC0635c6.m2094V(vf3Var4.f65307d, vf3Var4.f65308e, vf3Var4.f65309f, vf3Var4.f65310g);
                            abstractC0638f.m2154a(abstractComponentCallbacksC0635c6);
                            break;
                        case 4:
                            abstractComponentCallbacksC0635c6.m2094V(vf3Var4.f65307d, vf3Var4.f65308e, vf3Var4.f65309f, vf3Var4.f65310g);
                            abstractC0638f.getClass();
                            m2132i0(abstractComponentCallbacksC0635c6);
                            break;
                        case 5:
                            abstractComponentCallbacksC0635c6.m2094V(vf3Var4.f65307d, vf3Var4.f65308e, vf3Var4.f65309f, vf3Var4.f65310g);
                            abstractC0638f.m2163e0(abstractComponentCallbacksC0635c6, true);
                            abstractC0638f.m2142K(abstractComponentCallbacksC0635c6);
                            break;
                        case 6:
                            abstractComponentCallbacksC0635c6.m2094V(vf3Var4.f65307d, vf3Var4.f65308e, vf3Var4.f65309f, vf3Var4.f65310g);
                            abstractC0638f.m2158c(abstractComponentCallbacksC0635c6);
                            break;
                        case 7:
                            abstractComponentCallbacksC0635c6.m2094V(vf3Var4.f65307d, vf3Var4.f65308e, vf3Var4.f65309f, vf3Var4.f65310g);
                            abstractC0638f.m2163e0(abstractComponentCallbacksC0635c6, true);
                            abstractC0638f.m2168h(abstractComponentCallbacksC0635c6);
                            break;
                        case 8:
                            abstractC0638f.m2167g0(null);
                            break;
                        case 9:
                            abstractC0638f.m2167g0(abstractComponentCallbacksC0635c6);
                            break;
                        case 10:
                            vf3Var4.f65312i = abstractComponentCallbacksC0635c6.f5708l0;
                            abstractC0638f.m2165f0(abstractComponentCallbacksC0635c6, vf3Var4.f65311h);
                            break;
                    }
                }
            } else {
                g70Var2.m12394d(1);
                AbstractC0638f abstractC0638f2 = g70Var2.f40304r;
                ArrayList arrayList12 = g70Var2.f40287a;
                int size4 = arrayList12.size();
                int i20 = 0;
                while (i20 < size4) {
                    vf3 vf3Var5 = (vf3) arrayList12.get(i20);
                    AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c7 = vf3Var5.f65305b;
                    if (abstractComponentCallbacksC0635c7 != null) {
                        abstractComponentCallbacksC0635c7.f5667I = g70Var2.f40307u;
                        if (abstractComponentCallbacksC0635c7.f5698g0 != null) {
                            abstractComponentCallbacksC0635c7.m2104f().f37041a = false;
                        }
                        int i21 = g70Var2.f40292f;
                        if (abstractComponentCallbacksC0635c7.f5698g0 != null || i21 != 0) {
                            abstractComponentCallbacksC0635c7.m2104f();
                            abstractComponentCallbacksC0635c7.f5698g0.f37046f = i21;
                        }
                        abstractComponentCallbacksC0635c7.m2104f();
                        abstractComponentCallbacksC0635c7.f5698g0.getClass();
                    }
                    switch (vf3Var5.f65304a) {
                        case 1:
                            abstractComponentCallbacksC0635c7.m2094V(vf3Var5.f65307d, vf3Var5.f65308e, vf3Var5.f65309f, vf3Var5.f65310g);
                            abstractC0638f2.m2163e0(abstractComponentCallbacksC0635c7, false);
                            abstractC0638f2.m2154a(abstractComponentCallbacksC0635c7);
                            i20++;
                            str = str;
                            break;
                        case 2:
                        default:
                            v63.m23130h(vf3Var5.f65304a, str);
                            return;
                        case 3:
                            abstractComponentCallbacksC0635c7.m2094V(vf3Var5.f65307d, vf3Var5.f65308e, vf3Var5.f65309f, vf3Var5.f65310g);
                            abstractC0638f2.m2153Z(abstractComponentCallbacksC0635c7);
                            i20++;
                            str = str;
                            break;
                        case 4:
                            abstractComponentCallbacksC0635c7.m2094V(vf3Var5.f65307d, vf3Var5.f65308e, vf3Var5.f65309f, vf3Var5.f65310g);
                            abstractC0638f2.m2142K(abstractComponentCallbacksC0635c7);
                            i20++;
                            str = str;
                            break;
                        case 5:
                            abstractComponentCallbacksC0635c7.m2094V(vf3Var5.f65307d, vf3Var5.f65308e, vf3Var5.f65309f, vf3Var5.f65310g);
                            abstractC0638f2.m2163e0(abstractComponentCallbacksC0635c7, false);
                            m2132i0(abstractComponentCallbacksC0635c7);
                            i20++;
                            str = str;
                            break;
                        case 6:
                            abstractComponentCallbacksC0635c7.m2094V(vf3Var5.f65307d, vf3Var5.f65308e, vf3Var5.f65309f, vf3Var5.f65310g);
                            abstractC0638f2.m2168h(abstractComponentCallbacksC0635c7);
                            i20++;
                            str = str;
                            break;
                        case 7:
                            abstractComponentCallbacksC0635c7.m2094V(vf3Var5.f65307d, vf3Var5.f65308e, vf3Var5.f65309f, vf3Var5.f65310g);
                            abstractC0638f2.m2163e0(abstractComponentCallbacksC0635c7, false);
                            abstractC0638f2.m2158c(abstractComponentCallbacksC0635c7);
                            i20++;
                            str = str;
                            break;
                        case 8:
                            abstractC0638f2.m2167g0(abstractComponentCallbacksC0635c7);
                            i20++;
                            str = str;
                            break;
                        case 9:
                            abstractC0638f2.m2167g0(null);
                            i20++;
                            str = str;
                            break;
                        case 10:
                            vf3Var5.f65311h = abstractComponentCallbacksC0635c7.f5708l0;
                            abstractC0638f2.m2165f0(abstractComponentCallbacksC0635c7, vf3Var5.f65312i);
                            i20++;
                            str = str;
                            break;
                    }
                }
            }
            i16++;
            str = str;
        }
        boolean zBooleanValue2 = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
        if (z9 && !arrayList10.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(m2127G((g70) it2.next()));
            }
            if (this.f5747h == null) {
                for (se3 se3Var : arrayList10) {
                    Iterator it3 = linkedHashSet.iterator();
                    while (it3.hasNext()) {
                        se3Var.m21307b((AbstractComponentCallbacksC0635c) it3.next(), zBooleanValue2);
                    }
                }
                for (se3 se3Var2 : arrayList10) {
                    Iterator it4 = linkedHashSet.iterator();
                    while (it4.hasNext()) {
                        se3Var2.m21306a((AbstractComponentCallbacksC0635c) it4.next(), zBooleanValue2);
                    }
                }
            }
        }
        for (int i22 = i5; i22 < i2; i22++) {
            g70 g70Var3 = (g70) arrayList.get(i22);
            if (zBooleanValue2) {
                for (int size5 = g70Var3.f40287a.size() - 1; size5 >= 0; size5--) {
                    AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c8 = ((vf3) g70Var3.f40287a.get(size5)).f65305b;
                    if (abstractComponentCallbacksC0635c8 != null) {
                        m2166g(abstractComponentCallbacksC0635c8).m2202k();
                    }
                }
            } else {
                Iterator it5 = g70Var3.f40287a.iterator();
                while (it5.hasNext()) {
                    AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c9 = ((vf3) it5.next()).f65305b;
                    if (abstractComponentCallbacksC0635c9 != null) {
                        m2166g(abstractComponentCallbacksC0635c9).m2202k();
                    }
                }
            }
        }
        m2145R(this.f5762w, true);
        for (p82 p82Var : m2164f(arrayList, i5, i2)) {
            p82Var.f55727e = zBooleanValue2;
            synchronized (p82Var.f55724b) {
                try {
                    p82Var.m18962l();
                    ArrayList arrayList13 = p82Var.f55724b;
                    ListIterator listIterator = arrayList13.listIterator(arrayList13.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            objPrevious = listIterator.previous();
                            ze9 ze9Var = (ze9) objPrevious;
                            af9 af9Var = SpecialEffectsController$Operation$State.Companion;
                            View view = ze9Var.f71466c.f5692d0;
                            view.getClass();
                            af9Var.getClass();
                            SpecialEffectsController$Operation$State specialEffectsController$Operation$StateM349a = af9.m349a(view);
                            SpecialEffectsController$Operation$State specialEffectsController$Operation$State = ze9Var.f71464a;
                            SpecialEffectsController$Operation$State specialEffectsController$Operation$State2 = SpecialEffectsController$Operation$State.VISIBLE;
                            if (specialEffectsController$Operation$State != specialEffectsController$Operation$State2 || specialEffectsController$Operation$StateM349a == specialEffectsController$Operation$State2) {
                            }
                        } else {
                            objPrevious = null;
                        }
                    }
                    p82Var.f55728f = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            p82Var.m18957e();
        }
        while (i5 < i2) {
            g70 g70Var4 = (g70) arrayList.get(i5);
            if (((Boolean) arrayList2.get(i5)).booleanValue() && g70Var4.f40306t >= 0) {
                g70Var4.f40306t = -1;
            }
            if (g70Var4.f40303q != null) {
                for (int i23 = 0; i23 < g70Var4.f40303q.size(); i23++) {
                    ((Runnable) g70Var4.f40303q.get(i23)).run();
                }
                g70Var4.f40303q = null;
            }
            i5++;
        }
        if (z9) {
            for (int i24 = 0; i24 < arrayList10.size(); i24++) {
                ((se3) arrayList10.get(i24)).getClass();
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final int m2135C(String str, int i, boolean z) {
        if (this.f5743d.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return this.f5743d.size() - 1;
        }
        int size = this.f5743d.size() - 1;
        while (size >= 0) {
            g70 g70Var = (g70) this.f5743d.get(size);
            if ((str != null && str.equals(g70Var.f40295i)) || (i >= 0 && i == g70Var.f40306t)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.f5743d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            g70 g70Var2 = (g70) this.f5743d.get(size - 1);
            if ((str == null || !str.equals(g70Var2.f40295i)) && (i < 0 || i != g70Var2.f40306t)) {
                break;
            }
            size--;
        }
        return size;
    }

    /* JADX INFO: renamed from: D */
    public final AbstractComponentCallbacksC0635c m2136D(int i) {
        ny8 ny8Var = this.f5742c;
        ArrayList arrayList = (ArrayList) ny8Var.f53414b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = (AbstractComponentCallbacksC0635c) arrayList.get(size);
            if (abstractComponentCallbacksC0635c != null && abstractComponentCallbacksC0635c.f5678T == i) {
                return abstractComponentCallbacksC0635c;
            }
        }
        for (C0639g c0639g : ((HashMap) ny8Var.f53415c).values()) {
            if (c0639g != null) {
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = c0639g.f5768c;
                if (abstractComponentCallbacksC0635c2.f5678T == i) {
                    return abstractComponentCallbacksC0635c2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final AbstractComponentCallbacksC0635c m2137E(String str) {
        ny8 ny8Var = this.f5742c;
        ArrayList arrayList = (ArrayList) ny8Var.f53414b;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = (AbstractComponentCallbacksC0635c) arrayList.get(size);
                if (abstractComponentCallbacksC0635c != null && str.equals(abstractComponentCallbacksC0635c.f5680V)) {
                    return abstractComponentCallbacksC0635c;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C0639g c0639g : ((HashMap) ny8Var.f53415c).values()) {
            if (c0639g != null) {
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = c0639g.f5768c;
                if (str.equals(abstractComponentCallbacksC0635c2.f5680V)) {
                    return abstractComponentCallbacksC0635c2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: F */
    public final void m2138F() {
        for (p82 p82Var : m2162e()) {
            if (p82Var.f55728f) {
                if (m2128L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                p82Var.f55728f = false;
                p82Var.m18957e();
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final ViewGroup m2139H(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        ViewGroup viewGroup = abstractComponentCallbacksC0635c.f5690c0;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0635c.f5679U <= 0 || !this.f5764y.mo294p0()) {
            return null;
        }
        View viewMo293o0 = this.f5764y.mo293o0(abstractComponentCallbacksC0635c.f5679U);
        if (viewMo293o0 instanceof ViewGroup) {
            return (ViewGroup) viewMo293o0;
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    public final de3 m2140I() {
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f5765z;
        return abstractComponentCallbacksC0635c != null ? abstractComponentCallbacksC0635c.f5674P.m2140I() : this.f5724B;
    }

    /* JADX INFO: renamed from: J */
    public final e41 m2141J() {
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f5765z;
        return abstractComponentCallbacksC0635c != null ? abstractComponentCallbacksC0635c.f5674P.m2141J() : this.f5725C;
    }

    /* JADX INFO: renamed from: K */
    public final void m2142K(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        if (m2128L(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0635c);
        }
        if (abstractComponentCallbacksC0635c.f5681W) {
            return;
        }
        abstractComponentCallbacksC0635c.f5681W = true;
        abstractComponentCallbacksC0635c.f5700h0 = true ^ abstractComponentCallbacksC0635c.f5700h0;
        m2169h0(abstractComponentCallbacksC0635c);
    }

    /* JADX INFO: renamed from: N */
    public final boolean m2143N() {
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f5765z;
        if (abstractComponentCallbacksC0635c == null) {
            return true;
        }
        return abstractComponentCallbacksC0635c.m2115q() && this.f5765z.m2109k().m2143N();
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m2144Q() {
        return this.f5731I || this.f5732J;
    }

    /* JADX INFO: renamed from: R */
    public final void m2145R(int i, boolean z) {
        hd3 hd3Var;
        if (this.f5763x == null && i != -1) {
            C3386nv.m17633t("No activity");
            return;
        }
        if (z || i != this.f5762w) {
            this.f5762w = i;
            ny8 ny8Var = this.f5742c;
            HashMap map = (HashMap) ny8Var.f53415c;
            Iterator it = ((ArrayList) ny8Var.f53414b).iterator();
            while (it.hasNext()) {
                C0639g c0639g = (C0639g) map.get(((AbstractComponentCallbacksC0635c) it.next()).f5693e);
                if (c0639g != null) {
                    c0639g.m2202k();
                }
            }
            for (C0639g c0639g2 : map.values()) {
                if (c0639g2 != null) {
                    c0639g2.m2202k();
                    AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = c0639g2.f5768c;
                    if (abstractComponentCallbacksC0635c.f5707l && !abstractComponentCallbacksC0635c.m2119u()) {
                        if (abstractComponentCallbacksC0635c.f5667I && !((HashMap) ny8Var.f53416d).containsKey(abstractComponentCallbacksC0635c.f5693e)) {
                            ny8Var.m17686N(abstractComponentCallbacksC0635c.f5693e, c0639g2.m2206o());
                        }
                        ny8Var.m17679F(c0639g2);
                    }
                }
            }
            m2172j0();
            if (this.f5730H && (hd3Var = this.f5763x) != null && this.f5762w == 7) {
                hd3Var.f42213O.invalidateOptionsMenu();
                this.f5730H = false;
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m2146S() {
        if (this.f5763x == null) {
            return;
        }
        this.f5731I = false;
        this.f5732J = false;
        this.f5738P.f52641g = false;
        for (AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c : this.f5742c.m17706z()) {
            if (abstractComponentCallbacksC0635c != null) {
                abstractComponentCallbacksC0635c.f5676R.m2146S();
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m2147T() {
        m2189x(new je3(this, null, -1, 0), false);
    }

    /* JADX INFO: renamed from: U */
    public final void m2148U(String str) {
        m2189x(new je3(this, str, -1, 1), false);
    }

    /* JADX INFO: renamed from: V */
    public final boolean m2149V() {
        return m2150W(-1, 0);
    }

    /* JADX INFO: renamed from: W */
    public final boolean m2150W(int i, int i2) {
        m2191z(false);
        m2190y(true);
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f5723A;
        if (abstractComponentCallbacksC0635c != null && i < 0 && abstractComponentCallbacksC0635c.m2106h().m2149V()) {
            return true;
        }
        boolean zM2151X = m2151X(this.f5735M, this.f5736N, null, i, i2);
        if (zM2151X) {
            this.f5741b = true;
            try {
                m2155a0(this.f5735M, this.f5736N);
                m2160d();
            } catch (Throwable th) {
                m2160d();
                throw th;
            }
        }
        m2178m0();
        if (this.f5734L) {
            this.f5734L = false;
            m2172j0();
        }
        ((HashMap) this.f5742c.f53415c).values().removeAll(Collections.singleton(null));
        return zM2151X;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m2151X(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        int iM2135C = m2135C(str, i, (i2 & 1) != 0);
        if (iM2135C < 0) {
            return false;
        }
        for (int size = this.f5743d.size() - 1; size >= iM2135C; size--) {
            arrayList.add((g70) this.f5743d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: renamed from: Y */
    public final void m2152Y(ge3 ge3Var, boolean z) {
        bl2 bl2Var = this.f5755p;
        bl2Var.getClass();
        ge3Var.getClass();
        ((CopyOnWriteArrayList) bl2Var.f8656b).add(new zd3(ge3Var, z));
    }

    /* JADX INFO: renamed from: Z */
    public final void m2153Z(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        if (m2128L(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0635c + " nesting=" + abstractComponentCallbacksC0635c.f5673O);
        }
        boolean zM2119u = abstractComponentCallbacksC0635c.m2119u();
        if (abstractComponentCallbacksC0635c.f5682X && zM2119u) {
            return;
        }
        ny8 ny8Var = this.f5742c;
        synchronized (((ArrayList) ny8Var.f53414b)) {
            ((ArrayList) ny8Var.f53414b).remove(abstractComponentCallbacksC0635c);
        }
        abstractComponentCallbacksC0635c.f5705k = false;
        if (m2129M(abstractComponentCallbacksC0635c)) {
            this.f5730H = true;
        }
        abstractComponentCallbacksC0635c.f5707l = true;
        m2169h0(abstractComponentCallbacksC0635c);
    }

    /* JADX INFO: renamed from: a */
    public final C0639g m2154a(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        String str = abstractComponentCallbacksC0635c.f5706k0;
        if (str != null) {
            rf3 rf3Var = sf3.f60790a;
            sf3.m21333b(new FragmentReuseViolation(abstractComponentCallbacksC0635c, str));
            sf3.m21332a(abstractComponentCallbacksC0635c).getClass();
            FragmentStrictMode$Flag fragmentStrictMode$Flag = FragmentStrictMode$Flag.PENALTY_LOG;
        }
        if (m2128L(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0635c);
        }
        C0639g c0639gM2166g = m2166g(abstractComponentCallbacksC0635c);
        abstractComponentCallbacksC0635c.f5674P = this;
        ny8 ny8Var = this.f5742c;
        ny8Var.m17678E(c0639gM2166g);
        if (!abstractComponentCallbacksC0635c.f5682X) {
            ny8Var.m17692e(abstractComponentCallbacksC0635c);
            abstractComponentCallbacksC0635c.f5707l = false;
            if (abstractComponentCallbacksC0635c.f5692d0 == null) {
                abstractComponentCallbacksC0635c.f5700h0 = false;
            }
            if (m2129M(abstractComponentCallbacksC0635c)) {
                this.f5730H = true;
            }
        }
        return c0639gM2166g;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m2155a0(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            C3386nv.m17633t("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((g70) arrayList.get(i)).f40302p) {
                if (i2 != i) {
                    m2134B(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((g70) arrayList.get(i2)).f40302p) {
                        i2++;
                    }
                }
                m2134B(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m2134B(arrayList, arrayList2, i2, size);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2156b(hd3 hd3Var, bq1 bq1Var, AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        if (this.f5763x != null) {
            C3386nv.m17633t("Already attached");
            return;
        }
        this.f5763x = hd3Var;
        this.f5764y = bq1Var;
        this.f5765z = abstractComponentCallbacksC0635c;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5756q;
        if (abstractComponentCallbacksC0635c != null) {
            copyOnWriteArrayList.add(new fe3(abstractComponentCallbacksC0635c));
        } else if (hd3Var != null) {
            copyOnWriteArrayList.add(hd3Var);
        }
        if (this.f5765z != null) {
            m2178m0();
        }
        if (hd3Var != null) {
            pr6 pr6VarMo13202c = hd3Var.f42213O.mo13202c();
            this.f5746g = pr6VarMo13202c;
            pr6VarMo13202c.m19462a(abstractComponentCallbacksC0635c != null ? abstractComponentCallbacksC0635c : hd3Var, this.f5749j);
        }
        int i = 0;
        if (abstractComponentCallbacksC0635c != null) {
            ne3 ne3Var = abstractComponentCallbacksC0635c.f5674P.f5738P;
            HashMap map = ne3Var.f52637c;
            ne3 ne3Var2 = (ne3) map.get(abstractComponentCallbacksC0635c.f5693e);
            if (ne3Var2 == null) {
                ne3Var2 = new ne3(ne3Var.f52639e);
                map.put(abstractComponentCallbacksC0635c.f5693e, ne3Var2);
            }
            this.f5738P = ne3Var2;
        } else if (hd3Var != null) {
            cua cuaVarMo2116r = hd3Var.f42213O.mo2116r();
            or1 or1Var = or1.f54780b;
            or1Var.getClass();
            ny8 ny8Var = new ny8(cuaVarMo2116r, ne3.f52635h, or1Var);
            z21 z21VarM24933a = y38.m24933a(ne3.class);
            String strM25413b = z21VarM24933a.m25413b();
            if (strM25413b == null) {
                C3386nv.m17626m("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.f5738P = (ne3) ny8Var.m17675B(z21VarM24933a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM25413b));
        } else {
            this.f5738P = new ne3(false);
        }
        this.f5738P.f52641g = m2144Q();
        this.f5742c.f53417e = this.f5738P;
        hd3 hd3Var2 = this.f5763x;
        int i2 = 3;
        if (hd3Var2 != null && abstractComponentCallbacksC0635c == null) {
            fs6 fs6VarMo2118t = hd3Var2.mo2118t();
            fs6VarMo2118t.m12094I("android:support:fragments", new mc1((le3) this, i2));
            Bundle bundleM12108m = fs6VarMo2118t.m12108m("android:support:fragments");
            if (bundleM12108m != null) {
                m2157b0(bundleM12108m);
            }
        }
        hd3 hd3Var3 = this.f5763x;
        if (hd3Var3 != null) {
            sc1 sc1Var = hd3Var3.f42213O.f63705i;
            String strConcat = "FragmentManager:".concat(abstractComponentCallbacksC0635c != null ? AbstractC3393o1.m17738m(new StringBuilder(), abstractComponentCallbacksC0635c.f5693e, ":") : "");
            int i3 = 1;
            le3 le3Var = (le3) this;
            this.f5726D = sc1Var.m21217d(strConcat.concat("StartActivityForResult"), new C3028g7(i3), new C0636d(le3Var, i3));
            this.f5727E = sc1Var.m21217d(strConcat.concat("StartIntentSenderForResult"), new C3028g7(i2), new C0636d(le3Var, 2));
            this.f5728F = sc1Var.m21217d(strConcat.concat("RequestPermissions"), new C3028g7(i), new C0636d(le3Var, i));
        }
        hd3 hd3Var4 = this.f5763x;
        if (hd3Var4 != null) {
            hd3Var4.mo13204z(this.f5757r);
        }
        hd3 hd3Var5 = this.f5763x;
        if (hd3Var5 != null) {
            id3 id3Var = hd3Var5.f42213O;
            be3 be3Var = this.f5758s;
            be3Var.getClass();
            id3Var.f63707k.add(be3Var);
        }
        hd3 hd3Var6 = this.f5763x;
        if (hd3Var6 != null) {
            id3 id3Var2 = hd3Var6.f42213O;
            be3 be3Var2 = this.f5759t;
            be3Var2.getClass();
            id3Var2.f63689H.add(be3Var2);
        }
        hd3 hd3Var7 = this.f5763x;
        if (hd3Var7 != null) {
            id3 id3Var3 = hd3Var7.f42213O;
            be3 be3Var3 = this.f5760u;
            be3Var3.getClass();
            id3Var3.f63690I.add(be3Var3);
        }
        hd3 hd3Var8 = this.f5763x;
        if (hd3Var8 == null || abstractComponentCallbacksC0635c != null) {
            return;
        }
        id3 id3Var4 = hd3Var8.f42213O;
        ce3 ce3Var = this.f5761v;
        ce3Var.getClass();
        sq5 sq5Var = id3Var4.f63699c;
        ((CopyOnWriteArrayList) sq5Var.f61249c).add(ce3Var);
        ((Runnable) sq5Var.f61248b).run();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m2157b0(Bundle bundle) {
        bl2 bl2Var;
        C0639g c0639g;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f5763x.f42210L.getClassLoader());
                this.f5752m.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f5763x.f42210L.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        ny8 ny8Var = this.f5742c;
        HashMap map2 = (HashMap) ny8Var.f53416d;
        HashMap map3 = (HashMap) ny8Var.f53415c;
        map2.clear();
        map2.putAll(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        map3.clear();
        Iterator it = fragmentManagerState.f5631a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            bl2Var = this.f5755p;
            if (!zHasNext) {
                break;
            }
            Bundle bundleM17686N = ny8Var.m17686N((String) it.next(), null);
            if (bundleM17686N != null) {
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = (AbstractComponentCallbacksC0635c) this.f5738P.f52636b.get(((FragmentState) bundleM17686N.getParcelable("state")).f5643b);
                if (abstractComponentCallbacksC0635c != null) {
                    if (m2128L(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0635c);
                    }
                    c0639g = new C0639g(bl2Var, ny8Var, abstractComponentCallbacksC0635c, bundleM17686N);
                } else {
                    c0639g = new C0639g(this.f5755p, this.f5742c, this.f5763x.f42210L.getClassLoader(), m2140I(), bundleM17686N);
                }
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = c0639g.f5768c;
                abstractComponentCallbacksC0635c2.f5687b = bundleM17686N;
                abstractComponentCallbacksC0635c2.f5674P = this;
                if (m2128L(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0635c2.f5693e + "): " + abstractComponentCallbacksC0635c2);
                }
                c0639g.m2204m(this.f5763x.f42210L.getClassLoader());
                ny8Var.m17678E(c0639g);
                c0639g.f5770e = this.f5762w;
            }
        }
        ne3 ne3Var = this.f5738P;
        ne3Var.getClass();
        for (AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c3 : new ArrayList(ne3Var.f52636b.values())) {
            if (map3.get(abstractComponentCallbacksC0635c3.f5693e) == null) {
                if (m2128L(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0635c3 + " that was not found in the set of active Fragments " + fragmentManagerState.f5631a);
                }
                this.f5738P.m17402Z2(abstractComponentCallbacksC0635c3);
                abstractComponentCallbacksC0635c3.f5674P = this;
                C0639g c0639g2 = new C0639g(bl2Var, ny8Var, abstractComponentCallbacksC0635c3);
                c0639g2.f5770e = 1;
                c0639g2.m2202k();
                abstractComponentCallbacksC0635c3.f5707l = true;
                c0639g2.m2202k();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.f5632b;
        ((ArrayList) ny8Var.f53414b).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM17701u = ny8Var.m17701u(str3);
                if (abstractComponentCallbacksC0635cM17701u == null) {
                    C3386nv.m17633t(wq1.m24118n("No instantiated fragment for (", str3, ")"));
                    return;
                }
                if (m2128L(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + abstractComponentCallbacksC0635cM17701u);
                }
                ny8Var.m17692e(abstractComponentCallbacksC0635cM17701u);
            }
        }
        if (fragmentManagerState.f5633c != null) {
            this.f5743d = new ArrayList(fragmentManagerState.f5633c.length);
            int i = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f5633c;
                if (i >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i];
                ArrayList arrayList2 = backStackRecordState.f5601b;
                g70 g70Var = new g70(this);
                backStackRecordState.m2062a(g70Var);
                g70Var.f40306t = backStackRecordState.f5606g;
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    String str4 = (String) arrayList2.get(i2);
                    if (str4 != null) {
                        ((vf3) g70Var.f40287a.get(i2)).f65305b = ny8Var.m17701u(str4);
                    }
                }
                g70Var.m12394d(1);
                if (m2128L(2)) {
                    StringBuilder sbM22998u = ux5.m22998u("restoreAllState: back stack #", i, " (index ");
                    sbM22998u.append(g70Var.f40306t);
                    sbM22998u.append("): ");
                    sbM22998u.append(g70Var);
                    Log.v("FragmentManager", sbM22998u.toString());
                    PrintWriter printWriter = new PrintWriter(new kj5());
                    g70Var.m12399i("  ", printWriter, false);
                    printWriter.close();
                }
                this.f5743d.add(g70Var);
                i++;
            }
        } else {
            this.f5743d = new ArrayList();
        }
        this.f5750k.set(fragmentManagerState.f5634d);
        String str5 = fragmentManagerState.f5635e;
        if (str5 != null) {
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM17701u2 = ny8Var.m17701u(str5);
            this.f5723A = abstractComponentCallbacksC0635cM17701u2;
            m2183r(abstractComponentCallbacksC0635cM17701u2);
        }
        ArrayList arrayList3 = fragmentManagerState.f5636f;
        if (arrayList3 != null) {
            for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                this.f5751l.put((String) arrayList3.get(i3), (BackStackState) fragmentManagerState.f5637g.get(i3));
            }
        }
        this.f5729G = new ArrayDeque(fragmentManagerState.f5638h);
    }

    /* JADX INFO: renamed from: c */
    public final void m2158c(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        if (m2128L(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0635c);
        }
        if (abstractComponentCallbacksC0635c.f5682X) {
            abstractComponentCallbacksC0635c.f5682X = false;
            if (abstractComponentCallbacksC0635c.f5705k) {
                return;
            }
            this.f5742c.m17692e(abstractComponentCallbacksC0635c);
            if (m2128L(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0635c);
            }
            if (m2129M(abstractComponentCallbacksC0635c)) {
                this.f5730H = true;
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final Bundle m2159c0() {
        ArrayList arrayList;
        BackStackRecordState[] backStackRecordStateArr;
        Bundle bundle = new Bundle();
        m2138F();
        m2188w();
        m2191z(true);
        this.f5731I = true;
        this.f5738P.f52641g = true;
        ny8 ny8Var = this.f5742c;
        ny8Var.getClass();
        HashMap map = (HashMap) ny8Var.f53415c;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (C0639g c0639g : map.values()) {
            if (c0639g != null) {
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = c0639g.f5768c;
                ny8Var.m17686N(abstractComponentCallbacksC0635c.f5693e, c0639g.m2206o());
                arrayList2.add(abstractComponentCallbacksC0635c.f5693e);
                if (m2128L(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0635c + ": " + abstractComponentCallbacksC0635c.f5687b);
                }
            }
        }
        HashMap map2 = (HashMap) this.f5742c.f53416d;
        if (!map2.isEmpty()) {
            ny8 ny8Var2 = this.f5742c;
            synchronized (((ArrayList) ny8Var2.f53414b)) {
                try {
                    if (((ArrayList) ny8Var2.f53414b).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) ny8Var2.f53414b).size());
                        for (AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 : (ArrayList) ny8Var2.f53414b) {
                            arrayList.add(abstractComponentCallbacksC0635c2.f5693e);
                            if (m2128L(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0635c2.f5693e + "): " + abstractComponentCallbacksC0635c2);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size = this.f5743d.size();
            if (size > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i = 0; i < size; i++) {
                    backStackRecordStateArr[i] = new BackStackRecordState((g70) this.f5743d.get(i));
                    if (m2128L(2)) {
                        StringBuilder sbM22998u = ux5.m22998u("saveAllState: adding back stack #", i, ": ");
                        sbM22998u.append(this.f5743d.get(i));
                        Log.v("FragmentManager", sbM22998u.toString());
                    }
                }
            } else {
                backStackRecordStateArr = null;
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f5635e = null;
            ArrayList arrayList3 = new ArrayList();
            fragmentManagerState.f5636f = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            fragmentManagerState.f5637g = arrayList4;
            fragmentManagerState.f5631a = arrayList2;
            fragmentManagerState.f5632b = arrayList;
            fragmentManagerState.f5633c = backStackRecordStateArr;
            fragmentManagerState.f5634d = this.f5750k.get();
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c3 = this.f5723A;
            if (abstractComponentCallbacksC0635c3 != null) {
                fragmentManagerState.f5635e = abstractComponentCallbacksC0635c3.f5693e;
            }
            arrayList3.addAll(this.f5751l.keySet());
            arrayList4.addAll(this.f5751l.values());
            fragmentManagerState.f5638h = new ArrayList(this.f5729G);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.f5752m.keySet()) {
                bundle.putBundle(AbstractC3393o1.m17734i("result_", str), (Bundle) this.f5752m.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(AbstractC3393o1.m17734i("fragment_", str2), (Bundle) map2.get(str2));
            }
        } else if (m2128L(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    /* JADX INFO: renamed from: d */
    public final void m2160d() {
        this.f5741b = false;
        this.f5736N.clear();
        this.f5735M.clear();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m2161d0() {
        synchronized (this.f5740a) {
            try {
                if (this.f5740a.size() == 1) {
                    this.f5763x.f42211M.removeCallbacks(this.f5739Q);
                    this.f5763x.f42211M.post(this.f5739Q);
                    m2178m0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final HashSet m2162e() {
        p82 p82Var;
        HashSet hashSet = new HashSet();
        Iterator it = this.f5742c.m17704x().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C0639g) it.next()).f5768c.f5690c0;
            if (viewGroup != null) {
                m2141J().getClass();
                Object tag = viewGroup.getTag(R$id.special_effects_controller_view_tag);
                if (tag instanceof p82) {
                    p82Var = (p82) tag;
                } else {
                    p82Var = new p82(viewGroup);
                    viewGroup.setTag(R$id.special_effects_controller_view_tag, p82Var);
                }
                hashSet.add(p82Var);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m2163e0(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, boolean z) {
        ViewGroup viewGroupM2139H = m2139H(abstractComponentCallbacksC0635c);
        if (viewGroupM2139H == null || !(viewGroupM2139H instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupM2139H).setDrawDisappearingViewsLast(!z);
    }

    /* JADX INFO: renamed from: f */
    public final HashSet m2164f(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((g70) arrayList.get(i)).f40287a.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = ((vf3) it.next()).f65305b;
                if (abstractComponentCallbacksC0635c != null && (viewGroup = abstractComponentCallbacksC0635c.f5690c0) != null) {
                    hashSet.add(p82.m18951i(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m2165f0(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, Lifecycle$State lifecycle$State) {
        if (abstractComponentCallbacksC0635c == this.f5742c.m17701u(abstractComponentCallbacksC0635c.f5693e) && (abstractComponentCallbacksC0635c.f5675Q == null || abstractComponentCallbacksC0635c.f5674P == this)) {
            abstractComponentCallbacksC0635c.f5708l0 = lifecycle$State;
        } else {
            uk9.m22776j("Fragment ", abstractComponentCallbacksC0635c, " is not an active fragment of FragmentManager ", this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final C0639g m2166g(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        String str = abstractComponentCallbacksC0635c.f5693e;
        ny8 ny8Var = this.f5742c;
        C0639g c0639g = (C0639g) ((HashMap) ny8Var.f53415c).get(str);
        if (c0639g != null) {
            return c0639g;
        }
        C0639g c0639g2 = new C0639g(this.f5755p, ny8Var, abstractComponentCallbacksC0635c);
        c0639g2.m2204m(this.f5763x.f42210L.getClassLoader());
        c0639g2.f5770e = this.f5762w;
        return c0639g2;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m2167g0(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        if (abstractComponentCallbacksC0635c != null) {
            if (abstractComponentCallbacksC0635c != this.f5742c.m17701u(abstractComponentCallbacksC0635c.f5693e) || (abstractComponentCallbacksC0635c.f5675Q != null && abstractComponentCallbacksC0635c.f5674P != this)) {
                uk9.m22776j("Fragment ", abstractComponentCallbacksC0635c, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = this.f5723A;
        this.f5723A = abstractComponentCallbacksC0635c;
        m2183r(abstractComponentCallbacksC0635c2);
        m2183r(this.f5723A);
    }

    /* JADX INFO: renamed from: h */
    public final void m2168h(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        if (m2128L(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0635c);
        }
        if (abstractComponentCallbacksC0635c.f5682X) {
            return;
        }
        abstractComponentCallbacksC0635c.f5682X = true;
        if (abstractComponentCallbacksC0635c.f5705k) {
            if (m2128L(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0635c);
            }
            ny8 ny8Var = this.f5742c;
            synchronized (((ArrayList) ny8Var.f53414b)) {
                ((ArrayList) ny8Var.f53414b).remove(abstractComponentCallbacksC0635c);
            }
            abstractComponentCallbacksC0635c.f5705k = false;
            if (m2129M(abstractComponentCallbacksC0635c)) {
                this.f5730H = true;
            }
            m2169h0(abstractComponentCallbacksC0635c);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m2169h0(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        ViewGroup viewGroupM2139H = m2139H(abstractComponentCallbacksC0635c);
        if (viewGroupM2139H != null) {
            ed3 ed3Var = abstractComponentCallbacksC0635c.f5698g0;
            if ((ed3Var == null ? 0 : ed3Var.f37045e) + (ed3Var == null ? 0 : ed3Var.f37044d) + (ed3Var == null ? 0 : ed3Var.f37043c) + (ed3Var == null ? 0 : ed3Var.f37042b) > 0) {
                if (viewGroupM2139H.getTag(R$id.visible_removing_fragment_view_tag) == null) {
                    viewGroupM2139H.setTag(R$id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0635c);
                }
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = (AbstractComponentCallbacksC0635c) viewGroupM2139H.getTag(R$id.visible_removing_fragment_view_tag);
                ed3 ed3Var2 = abstractComponentCallbacksC0635c.f5698g0;
                boolean z = ed3Var2 != null ? ed3Var2.f37041a : false;
                if (abstractComponentCallbacksC0635c2.f5698g0 == null) {
                    return;
                }
                abstractComponentCallbacksC0635c2.m2104f().f37041a = z;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m2170i(boolean z, Configuration configuration) {
        if (z && this.f5763x != null) {
            m2174k0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c : this.f5742c.m17706z()) {
            if (abstractComponentCallbacksC0635c != null) {
                abstractComponentCallbacksC0635c.onConfigurationChanged(configuration);
                if (z) {
                    abstractComponentCallbacksC0635c.f5676R.m2170i(true, configuration);
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2171j() {
        if (this.f5762w >= 1) {
            for (AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c : this.f5742c.m17706z()) {
                if (abstractComponentCallbacksC0635c != null) {
                    if (!abstractComponentCallbacksC0635c.f5681W ? abstractComponentCallbacksC0635c.f5676R.m2171j() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m2172j0() {
        for (C0639g c0639g : this.f5742c.m17704x()) {
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = c0639g.f5768c;
            if (abstractComponentCallbacksC0635c.f5694e0) {
                if (this.f5741b) {
                    this.f5734L = true;
                } else {
                    abstractComponentCallbacksC0635c.f5694e0 = false;
                    c0639g.m2202k();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2173k() {
        if (this.f5762w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c : this.f5742c.m17706z()) {
            if (abstractComponentCallbacksC0635c != null && m2130O(abstractComponentCallbacksC0635c)) {
                if (!abstractComponentCallbacksC0635c.f5681W ? abstractComponentCallbacksC0635c.f5676R.m2173k() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0635c);
                    z = true;
                }
            }
        }
        if (this.f5744e != null) {
            for (int i = 0; i < this.f5744e.size(); i++) {
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = (AbstractComponentCallbacksC0635c) this.f5744e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0635c2)) {
                    abstractComponentCallbacksC0635c2.getClass();
                }
            }
        }
        this.f5744e = arrayList;
        return z;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m2174k0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new kj5());
        hd3 hd3Var = this.f5763x;
        if (hd3Var == null) {
            try {
                m2187v("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            hd3Var.f42213O.dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2175l() {
        boolean zIsChangingConfigurations = true;
        this.f5733K = true;
        m2191z(true);
        m2188w();
        hd3 hd3Var = this.f5763x;
        ny8 ny8Var = this.f5742c;
        if (hd3Var != null) {
            zIsChangingConfigurations = ((ne3) ny8Var.f53417e).f52640f;
        } else {
            id3 id3Var = hd3Var.f42210L;
            if (id3Var != null) {
                zIsChangingConfigurations = true ^ id3Var.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = this.f5751l.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((BackStackState) it.next()).f5612a.iterator();
                while (it2.hasNext()) {
                    ((ne3) ny8Var.f53417e).m17400X2((String) it2.next(), false);
                }
            }
        }
        m2186u(-1);
        hd3 hd3Var2 = this.f5763x;
        if (hd3Var2 != null) {
            id3 id3Var2 = hd3Var2.f42213O;
            be3 be3Var = this.f5758s;
            be3Var.getClass();
            id3Var2.f63707k.remove(be3Var);
        }
        hd3 hd3Var3 = this.f5763x;
        if (hd3Var3 != null) {
            hd3Var3.mo13201B(this.f5757r);
        }
        hd3 hd3Var4 = this.f5763x;
        if (hd3Var4 != null) {
            id3 id3Var3 = hd3Var4.f42213O;
            be3 be3Var2 = this.f5759t;
            be3Var2.getClass();
            id3Var3.f63689H.remove(be3Var2);
        }
        hd3 hd3Var5 = this.f5763x;
        if (hd3Var5 != null) {
            id3 id3Var4 = hd3Var5.f42213O;
            be3 be3Var3 = this.f5760u;
            be3Var3.getClass();
            id3Var4.f63690I.remove(be3Var3);
        }
        hd3 hd3Var6 = this.f5763x;
        if (hd3Var6 != null && this.f5765z == null) {
            id3 id3Var5 = hd3Var6.f42213O;
            ce3 ce3Var = this.f5761v;
            ce3Var.getClass();
            sq5 sq5Var = id3Var5.f63699c;
            ((CopyOnWriteArrayList) sq5Var.f61249c).remove(ce3Var);
            g9a.m12435l(((HashMap) sq5Var.f61250d).remove(ce3Var));
            ((Runnable) sq5Var.f61248b).run();
        }
        this.f5763x = null;
        this.f5764y = null;
        this.f5765z = null;
        if (this.f5746g != null) {
            this.f5749j.m15658e();
            this.f5746g = null;
        }
        C3399o7 c3399o7 = this.f5726D;
        if (c3399o7 != null) {
            c3399o7.m17829b();
            this.f5727E.m17829b();
            this.f5728F.m17829b();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m2176l0(ge3 ge3Var) {
        bl2 bl2Var = this.f5755p;
        bl2Var.getClass();
        ge3Var.getClass();
        synchronized (((CopyOnWriteArrayList) bl2Var.f8656b)) {
            int size = ((CopyOnWriteArrayList) bl2Var.f8656b).size();
            for (int i = 0; i < size; i++) {
                if (((zd3) ((CopyOnWriteArrayList) bl2Var.f8656b).get(i)).f71382a == ge3Var) {
                    ((CopyOnWriteArrayList) bl2Var.f8656b).remove(i);
                    break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m2177m(boolean z) {
        if (z && this.f5763x != null) {
            m2174k0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c : this.f5742c.m17706z()) {
            if (abstractComponentCallbacksC0635c != null) {
                abstractComponentCallbacksC0635c.f5688b0 = true;
                if (z) {
                    abstractComponentCallbacksC0635c.f5676R.m2177m(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m2178m0() {
        synchronized (this.f5740a) {
            try {
                if (!this.f5740a.isEmpty()) {
                    this.f5749j.m15659f(true);
                    if (m2128L(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z = this.f5743d.size() + (this.f5747h != null ? 1 : 0) > 0 && m2131P(this.f5765z);
                if (m2128L(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
                }
                this.f5749j.m15659f(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m2179n(boolean z) {
        if (z && this.f5763x != null) {
            m2174k0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c : this.f5742c.m17706z()) {
            if (abstractComponentCallbacksC0635c != null && z) {
                abstractComponentCallbacksC0635c.f5676R.m2179n(true);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m2180o() {
        for (AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c : this.f5742c.m17705y()) {
            if (abstractComponentCallbacksC0635c != null) {
                abstractComponentCallbacksC0635c.m2117s();
                abstractComponentCallbacksC0635c.f5676R.m2180o();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m2181p() {
        if (this.f5762w >= 1) {
            for (AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c : this.f5742c.m17706z()) {
                if (abstractComponentCallbacksC0635c != null) {
                    if (!abstractComponentCallbacksC0635c.f5681W ? abstractComponentCallbacksC0635c.f5676R.m2181p() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final void m2182q() {
        if (this.f5762w < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c : this.f5742c.m17706z()) {
            if (abstractComponentCallbacksC0635c != null && !abstractComponentCallbacksC0635c.f5681W) {
                abstractComponentCallbacksC0635c.f5676R.m2182q();
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m2183r(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        if (abstractComponentCallbacksC0635c != null) {
            if (abstractComponentCallbacksC0635c != this.f5742c.m17701u(abstractComponentCallbacksC0635c.f5693e)) {
                return;
            }
            abstractComponentCallbacksC0635c.f5674P.getClass();
            boolean zM2131P = m2131P(abstractComponentCallbacksC0635c);
            Boolean bool = abstractComponentCallbacksC0635c.f5703j;
            if (bool == null || bool.booleanValue() != zM2131P) {
                abstractComponentCallbacksC0635c.f5703j = Boolean.valueOf(zM2131P);
                le3 le3Var = abstractComponentCallbacksC0635c.f5676R;
                le3Var.m2178m0();
                le3Var.m2183r(le3Var.f5723A);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m2184s(boolean z) {
        if (z && this.f5763x != null) {
            m2174k0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c : this.f5742c.m17706z()) {
            if (abstractComponentCallbacksC0635c != null && z) {
                abstractComponentCallbacksC0635c.f5676R.m2184s(true);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m2185t() {
        if (this.f5762w < 1) {
            return false;
        }
        boolean z = false;
        for (AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c : this.f5742c.m17706z()) {
            if (abstractComponentCallbacksC0635c != null && m2130O(abstractComponentCallbacksC0635c)) {
                if (!abstractComponentCallbacksC0635c.f5681W ? abstractComponentCallbacksC0635c.f5676R.m2185t() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f5765z;
        if (abstractComponentCallbacksC0635c != null) {
            sb.append(abstractComponentCallbacksC0635c.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f5765z)));
            sb.append("}");
        } else {
            hd3 hd3Var = this.f5763x;
            if (hd3Var != null) {
                sb.append(hd3Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f5763x)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m2186u(int i) {
        try {
            this.f5741b = true;
            for (C0639g c0639g : ((HashMap) this.f5742c.f53415c).values()) {
                if (c0639g != null) {
                    c0639g.f5770e = i;
                }
            }
            m2145R(i, false);
            Iterator it = m2162e().iterator();
            while (it.hasNext()) {
                ((p82) it.next()).m18960h();
            }
            this.f5741b = false;
            m2191z(true);
        } catch (Throwable th) {
            this.f5741b = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m2187v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2;
        String strM22990m = ux5.m22990m(str, "    ");
        ny8 ny8Var = this.f5742c;
        ArrayList arrayList = (ArrayList) ny8Var.f53414b;
        String strM22990m2 = ux5.m22990m(str, "    ");
        HashMap map = (HashMap) ny8Var.f53415c;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0639g c0639g : map.values()) {
                printWriter.print(str);
                if (c0639g != null) {
                    AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = c0639g.f5768c;
                    printWriter.println(abstractComponentCallbacksC0635c);
                    abstractComponentCallbacksC0635c.getClass();
                    printWriter.print(strM22990m2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0635c.f5678T));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0635c.f5679U));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0635c.f5680V);
                    printWriter.print(strM22990m2);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0635c.f5685a);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0635c.f5693e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0635c.f5673O);
                    printWriter.print(strM22990m2);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0635c.f5705k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0635c.f5707l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0635c.f5668J);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0635c.f5669K);
                    printWriter.print(strM22990m2);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0635c.f5681W);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0635c.f5682X);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0635c.f5686a0);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(strM22990m2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0635c.f5683Y);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0635c.f5696f0);
                    if (abstractComponentCallbacksC0635c.f5674P != null) {
                        printWriter.print(strM22990m2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0635c.f5674P);
                    }
                    if (abstractComponentCallbacksC0635c.f5675Q != null) {
                        printWriter.print(strM22990m2);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0635c.f5675Q);
                    }
                    if (abstractComponentCallbacksC0635c.f5677S != null) {
                        printWriter.print(strM22990m2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0635c.f5677S);
                    }
                    if (abstractComponentCallbacksC0635c.f5695f != null) {
                        printWriter.print(strM22990m2);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0635c.f5695f);
                    }
                    if (abstractComponentCallbacksC0635c.f5687b != null) {
                        printWriter.print(strM22990m2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0635c.f5687b);
                    }
                    if (abstractComponentCallbacksC0635c.f5689c != null) {
                        printWriter.print(strM22990m2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0635c.f5689c);
                    }
                    if (abstractComponentCallbacksC0635c.f5691d != null) {
                        printWriter.print(strM22990m2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0635c.f5691d);
                    }
                    Object objM17701u = abstractComponentCallbacksC0635c.f5697g;
                    if (objM17701u == null) {
                        AbstractC0638f abstractC0638f = abstractComponentCallbacksC0635c.f5674P;
                        objM17701u = (abstractC0638f == null || (str2 = abstractComponentCallbacksC0635c.f5699h) == null) ? null : abstractC0638f.f5742c.m17701u(str2);
                    }
                    if (objM17701u != null) {
                        printWriter.print(strM22990m2);
                        printWriter.print("mTarget=");
                        printWriter.print(objM17701u);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0635c.f5701i);
                    }
                    printWriter.print(strM22990m2);
                    printWriter.print("mPopDirection=");
                    ed3 ed3Var = abstractComponentCallbacksC0635c.f5698g0;
                    printWriter.println(ed3Var == null ? false : ed3Var.f37041a);
                    ed3 ed3Var2 = abstractComponentCallbacksC0635c.f5698g0;
                    if ((ed3Var2 == null ? 0 : ed3Var2.f37042b) != 0) {
                        printWriter.print(strM22990m2);
                        printWriter.print("getEnterAnim=");
                        ed3 ed3Var3 = abstractComponentCallbacksC0635c.f5698g0;
                        printWriter.println(ed3Var3 == null ? 0 : ed3Var3.f37042b);
                    }
                    ed3 ed3Var4 = abstractComponentCallbacksC0635c.f5698g0;
                    if ((ed3Var4 == null ? 0 : ed3Var4.f37043c) != 0) {
                        printWriter.print(strM22990m2);
                        printWriter.print("getExitAnim=");
                        ed3 ed3Var5 = abstractComponentCallbacksC0635c.f5698g0;
                        printWriter.println(ed3Var5 == null ? 0 : ed3Var5.f37043c);
                    }
                    ed3 ed3Var6 = abstractComponentCallbacksC0635c.f5698g0;
                    if ((ed3Var6 == null ? 0 : ed3Var6.f37044d) != 0) {
                        printWriter.print(strM22990m2);
                        printWriter.print("getPopEnterAnim=");
                        ed3 ed3Var7 = abstractComponentCallbacksC0635c.f5698g0;
                        printWriter.println(ed3Var7 == null ? 0 : ed3Var7.f37044d);
                    }
                    ed3 ed3Var8 = abstractComponentCallbacksC0635c.f5698g0;
                    if ((ed3Var8 == null ? 0 : ed3Var8.f37045e) != 0) {
                        printWriter.print(strM22990m2);
                        printWriter.print("getPopExitAnim=");
                        ed3 ed3Var9 = abstractComponentCallbacksC0635c.f5698g0;
                        printWriter.println(ed3Var9 == null ? 0 : ed3Var9.f37045e);
                    }
                    if (abstractComponentCallbacksC0635c.f5690c0 != null) {
                        printWriter.print(strM22990m2);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0635c.f5690c0);
                    }
                    if (abstractComponentCallbacksC0635c.f5692d0 != null) {
                        printWriter.print(strM22990m2);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0635c.f5692d0);
                    }
                    if (abstractComponentCallbacksC0635c.mo2107i() != null) {
                        cua cuaVarMo2116r = abstractComponentCallbacksC0635c.mo2116r();
                        me3 me3Var = kh5.f47296d;
                        cuaVarMo2116r.getClass();
                        or1 or1Var = or1.f54780b;
                        or1Var.getClass();
                        ny8 ny8Var2 = new ny8(cuaVarMo2116r, me3Var, or1Var);
                        z21 z21VarM24933a = y38.m24933a(kh5.class);
                        String strM25413b = z21VarM24933a.m25413b();
                        if (strM25413b != null) {
                            pe9 pe9Var = ((kh5) ny8Var2.m17675B(z21VarM24933a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM25413b))).f47297b;
                            if (pe9Var.m19081e() > 0) {
                                printWriter.print(strM22990m2);
                                printWriter.println("Loaders:");
                                String strConcat = strM22990m2.concat("    ");
                                for (int i = 0; i < pe9Var.m19081e(); i++) {
                                    ih5 ih5Var = (ih5) pe9Var.m19082f(i);
                                    printWriter.print(strM22990m2);
                                    printWriter.print("  #");
                                    printWriter.print(pe9Var.m19079c(i));
                                    printWriter.print(": ");
                                    printWriter.println(ih5Var.toString());
                                    ih5Var.m13912k(strConcat, printWriter);
                                }
                            }
                        } else {
                            C3386nv.m17626m("Local and anonymous classes can not be ViewModels");
                        }
                    }
                    printWriter.print(strM22990m2);
                    printWriter.println("Child " + abstractComponentCallbacksC0635c.f5676R + ":");
                    abstractComponentCallbacksC0635c.f5676R.m2187v(strM22990m2.concat("  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size2; i2++) {
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = (AbstractComponentCallbacksC0635c) arrayList.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0635c2.toString());
            }
        }
        ArrayList arrayList2 = this.f5744e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size; i3++) {
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c3 = (AbstractComponentCallbacksC0635c) this.f5744e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0635c3.toString());
            }
        }
        int size3 = this.f5743d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                g70 g70Var = (g70) this.f5743d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(g70Var.toString());
                g70Var.m12399i(strM22990m, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f5750k.get());
        synchronized (this.f5740a) {
            try {
                int size4 = this.f5740a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        Object obj = (ie3) this.f5740a.get(i5);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f5763x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f5764y);
        if (this.f5765z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f5765z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f5762w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f5731I);
        printWriter.print(" mStopped=");
        printWriter.print(this.f5732J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f5733K);
        if (this.f5730H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f5730H);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m2188w() {
        Iterator it = m2162e().iterator();
        while (it.hasNext()) {
            ((p82) it.next()).m18960h();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m2189x(ie3 ie3Var, boolean z) {
        if (!z) {
            if (this.f5763x == null) {
                if (this.f5733K) {
                    C3386nv.m17633t("FragmentManager has been destroyed");
                    return;
                } else {
                    C3386nv.m17633t("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (m2144Q()) {
                C3386nv.m17633t("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.f5740a) {
            try {
                if (this.f5763x == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f5740a.add(ie3Var);
                    m2161d0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m2190y(boolean z) {
        if (this.f5741b) {
            C3386nv.m17633t("FragmentManager is already executing transactions");
            return;
        }
        if (this.f5763x == null) {
            if (this.f5733K) {
                C3386nv.m17633t("FragmentManager has been destroyed");
                return;
            } else {
                C3386nv.m17633t("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.f5763x.f42211M.getLooper()) {
            C3386nv.m17633t("Must be called from main thread of fragment host");
            return;
        }
        if (!z && m2144Q()) {
            C3386nv.m17633t("Can not perform this action after onSaveInstanceState");
        } else if (this.f5735M == null) {
            this.f5735M = new ArrayList();
            this.f5736N = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: z */
    public final boolean m2191z(boolean z) {
        boolean zMo2126a;
        ArrayList arrayList;
        g70 g70Var;
        m2190y(z);
        if (!this.f5748i && (g70Var = this.f5747h) != null) {
            g70Var.f40305s = false;
            g70Var.m12395e();
            if (m2128L(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f5747h + " as part of execPendingActions for actions " + this.f5740a);
            }
            this.f5747h.m12397g(false, false);
            this.f5740a.add(0, this.f5747h);
            Iterator it = this.f5747h.f40287a.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = ((vf3) it.next()).f65305b;
                if (abstractComponentCallbacksC0635c != null) {
                    abstractComponentCallbacksC0635c.f5666H = false;
                }
            }
            this.f5747h = null;
        }
        boolean z2 = false;
        while (true) {
            ArrayList arrayList2 = this.f5735M;
            ArrayList arrayList3 = this.f5736N;
            synchronized (this.f5740a) {
                if (this.f5740a.isEmpty()) {
                    zMo2126a = false;
                } else {
                    try {
                        int size = this.f5740a.size();
                        int i = 0;
                        zMo2126a = false;
                        while (true) {
                            arrayList = this.f5740a;
                            if (i >= size) {
                                break;
                            }
                            zMo2126a |= ((ie3) arrayList.get(i)).mo2126a(arrayList2, arrayList3);
                            i++;
                            throw th;
                        }
                        arrayList.clear();
                        this.f5763x.f42211M.removeCallbacks(this.f5739Q);
                    } catch (Throwable th) {
                        this.f5740a.clear();
                        this.f5763x.f42211M.removeCallbacks(this.f5739Q);
                        throw th;
                    }
                }
            }
            if (!zMo2126a) {
                break;
            }
            z2 = true;
            this.f5741b = true;
            try {
                m2155a0(this.f5735M, this.f5736N);
                m2160d();
            } catch (Throwable th2) {
                m2160d();
                throw th2;
            }
        }
        m2178m0();
        if (this.f5734L) {
            this.f5734L = false;
            m2172j0();
        }
        ((HashMap) this.f5742c.f53415c).values().removeAll(Collections.singleton(null));
        return z2;
    }
}
