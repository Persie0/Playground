package androidx.compose.runtime.snapshots;

import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5207g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.C6752c;
import p081e0.C5298b1;
import p081e0.C5348y0;
import p267n0.AbstractC7691v;
import p267n0.C7670a;
import p267n0.C7675f;
import p267n0.C7693x;
import p267n0.C7694y;
import p267n0.InterfaceC7690u;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class SnapshotKt {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2052l<SnapshotIdSet, C9072e> f3260a = new InterfaceC2052l<SnapshotIdSet, C9072e>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$emptyLambda$1
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C9072e mo528n(SnapshotIdSet snapshotIdSet) {
            C5207g.m11111f(snapshotIdSet, "it");
            return C9072e.f47360a;
        }
    };

    /* JADX INFO: renamed from: b */
    public static final C5298b1 f3261b = new C5298b1(0);

    /* JADX INFO: renamed from: c */
    public static final Object f3262c = new Object();

    /* JADX INFO: renamed from: d */
    public static SnapshotIdSet f3263d;

    /* JADX INFO: renamed from: e */
    public static int f3264e;

    /* JADX INFO: renamed from: f */
    public static final C7675f f3265f;

    /* JADX INFO: renamed from: g */
    public static final ArrayList f3266g;

    /* JADX INFO: renamed from: h */
    public static final ArrayList f3267h;

    /* JADX INFO: renamed from: i */
    public static final AtomicReference<GlobalSnapshot> f3268i;

    /* JADX INFO: renamed from: j */
    public static final AbstractC0497b f3269j;

    static {
        SnapshotIdSet snapshotIdSet = SnapshotIdSet.f3249e;
        f3263d = snapshotIdSet;
        f3264e = 1;
        f3265f = new C7675f();
        f3266g = new ArrayList();
        f3267h = new ArrayList();
        int i10 = f3264e;
        f3264e = i10 + 1;
        GlobalSnapshot globalSnapshot = new GlobalSnapshot(i10, snapshotIdSet);
        f3263d = f3263d.m1881l(globalSnapshot.f3313b);
        AtomicReference<GlobalSnapshot> atomicReference = new AtomicReference<>(globalSnapshot);
        f3268i = atomicReference;
        GlobalSnapshot globalSnapshot2 = atomicReference.get();
        C5207g.m11110e(globalSnapshot2, "currentGlobalSnapshot.get()");
        f3269j = globalSnapshot2;
    }

    /* JADX INFO: renamed from: a */
    public static final void m1882a() {
        m1887f(new InterfaceC2052l<SnapshotIdSet, C9072e>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$advanceGlobalSnapshot$3
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(SnapshotIdSet snapshotIdSet) {
                C5207g.m11111f(snapshotIdSet, "it");
                return C9072e.f47360a;
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2052l m1883b(final InterfaceC2052l interfaceC2052l, final InterfaceC2052l interfaceC2052l2) {
        if (interfaceC2052l == null || interfaceC2052l2 == null || C5207g.m11106a(interfaceC2052l, interfaceC2052l2)) {
            return interfaceC2052l == null ? interfaceC2052l2 : interfaceC2052l;
        }
        return new InterfaceC2052l<Object, C9072e>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$mergedWriteObserver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(Object obj) {
                C5207g.m11111f(obj, "state");
                interfaceC2052l.mo528n(obj);
                interfaceC2052l2.mo528n(obj);
                return C9072e.f47360a;
            }
        };
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static final HashMap m1884c(C7670a c7670a, C7670a c7670a2, SnapshotIdSet snapshotIdSet) {
        AbstractC7691v abstractC7691vM1899r;
        Set<InterfaceC7690u> setMo15270u = c7670a2.mo15270u();
        int iMo1918d = c7670a.mo1918d();
        if (setMo15270u == null) {
            return null;
        }
        SnapshotIdSet snapshotIdSetM1880i = c7670a2.mo1919e().m1881l(c7670a2.mo1918d()).m1880i(c7670a2.f42154h);
        HashMap map = null;
        for (InterfaceC7690u interfaceC7690u : setMo15270u) {
            AbstractC7691v abstractC7691vMo1698l = interfaceC7690u.mo1698l();
            AbstractC7691v abstractC7691vM1899r2 = m1899r(abstractC7691vMo1698l, iMo1918d, snapshotIdSet);
            if (abstractC7691vM1899r2 != null && (abstractC7691vM1899r = m1899r(abstractC7691vMo1698l, iMo1918d, snapshotIdSetM1880i)) != null && !C5207g.m11106a(abstractC7691vM1899r2, abstractC7691vM1899r)) {
                AbstractC7691v abstractC7691vM1899r3 = m1899r(abstractC7691vMo1698l, c7670a2.mo1918d(), c7670a2.mo1919e());
                if (abstractC7691vM1899r3 == null) {
                    m1898q();
                    throw null;
                }
                AbstractC7691v abstractC7691vMo11474C = interfaceC7690u.mo11474C(abstractC7691vM1899r, abstractC7691vM1899r2, abstractC7691vM1899r3);
                if (abstractC7691vMo11474C == null) {
                    return null;
                }
                if (map == null) {
                    map = new HashMap();
                }
                map.put(abstractC7691vM1899r2, abstractC7691vMo11474C);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: d */
    public static final void m1885d(AbstractC0497b abstractC0497b) {
        if (!f3263d.m1879g(abstractC0497b.mo1918d())) {
            throw new IllegalStateException("Snapshot is not open".toString());
        }
    }

    /* JADX INFO: renamed from: e */
    public static final SnapshotIdSet m1886e(int i10, int i11, SnapshotIdSet snapshotIdSet) {
        C5207g.m11111f(snapshotIdSet, "<this>");
        while (i10 < i11) {
            snapshotIdSet = snapshotIdSet.m1881l(i10);
            i10++;
        }
        return snapshotIdSet;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: f */
    public static final <T> T m1887f(InterfaceC2052l<? super SnapshotIdSet, ? extends T> interfaceC2052l) {
        GlobalSnapshot globalSnapshot;
        T t10;
        ArrayList arrayListM13454v0;
        AbstractC0497b abstractC0497b = f3269j;
        C5207g.m11109d(abstractC0497b, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        Object obj = f3262c;
        synchronized (obj) {
            try {
                globalSnapshot = f3268i.get();
                C5207g.m11110e(globalSnapshot, "currentGlobalSnapshot.get()");
                t10 = (T) m1902u(globalSnapshot, interfaceC2052l);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Set<InterfaceC7690u> set = globalSnapshot.f42153g;
        if (set != null) {
            synchronized (obj) {
                arrayListM13454v0 = C6752c.m13454v0(f3266g);
            }
            int size = arrayListM13454v0.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((InterfaceC2056p) arrayListM13454v0.get(i10)).mo1337m0(set, globalSnapshot);
            }
        }
        synchronized (f3262c) {
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    m1897p((InterfaceC7690u) it.next());
                }
                C9072e c9072e = C9072e.f47360a;
            }
        }
        return t10;
    }

    /* JADX INFO: renamed from: g */
    public static final AbstractC0497b m1888g(AbstractC0497b abstractC0497b, InterfaceC2052l<Object, C9072e> interfaceC2052l, boolean z10) {
        boolean z11 = abstractC0497b instanceof C7670a;
        if (!z11 && abstractC0497b != null) {
            return new C7694y(abstractC0497b, interfaceC2052l, z10);
        }
        return new C7693x(z11 ? (C7670a) abstractC0497b : null, interfaceC2052l, null, false, z10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public static final <T extends AbstractC7691v> T m1889h(T t10) {
        T t11;
        C5207g.m11111f(t10, "r");
        AbstractC0497b abstractC0497bM1891j = m1891j();
        T t12 = (T) m1899r(t10, abstractC0497bM1891j.mo1918d(), abstractC0497bM1891j.mo1919e());
        if (t12 != null) {
            return t12;
        }
        synchronized (f3262c) {
            AbstractC0497b abstractC0497bM1891j2 = m1891j();
            t11 = (T) m1899r(t10, abstractC0497bM1891j2.mo1918d(), abstractC0497bM1891j2.mo1919e());
        }
        if (t11 != null) {
            return t11;
        }
        m1898q();
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public static final <T extends AbstractC7691v> T m1890i(T t10, AbstractC0497b abstractC0497b) {
        C5207g.m11111f(t10, "r");
        T t11 = (T) m1899r(t10, abstractC0497b.mo1918d(), abstractC0497b.mo1919e());
        if (t11 != null) {
            return t11;
        }
        m1898q();
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public static final AbstractC0497b m1891j() {
        AbstractC0497b abstractC0497b = (AbstractC0497b) f3261b.m11437d();
        if (abstractC0497b != null) {
            return abstractC0497b;
        }
        GlobalSnapshot globalSnapshot = f3268i.get();
        C5207g.m11110e(globalSnapshot, "currentGlobalSnapshot.get()");
        return globalSnapshot;
    }

    /* JADX INFO: renamed from: k */
    public static final InterfaceC2052l<Object, C9072e> m1892k(InterfaceC2052l<Object, C9072e> interfaceC2052l, final InterfaceC2052l<Object, C9072e> interfaceC2052l2, boolean z10) {
        final InterfaceC2052l<Object, C9072e> interfaceC2052l3 = interfaceC2052l;
        if (!z10) {
            interfaceC2052l2 = null;
        }
        if (interfaceC2052l3 != null && interfaceC2052l2 != null && !C5207g.m11106a(interfaceC2052l3, interfaceC2052l2)) {
            return new InterfaceC2052l<Object, C9072e>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$mergedReadObserver$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(Object obj) {
                    C5207g.m11111f(obj, "state");
                    interfaceC2052l3.mo528n(obj);
                    interfaceC2052l2.mo528n(obj);
                    return C9072e.f47360a;
                }
            };
        }
        if (interfaceC2052l3 == null) {
            interfaceC2052l3 = interfaceC2052l2;
        }
        return interfaceC2052l3;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    /* JADX INFO: renamed from: l */
    public static final <T extends AbstractC7691v> T m1893l(T t10, InterfaceC7690u interfaceC7690u) {
        boolean z10;
        C5207g.m11111f(t10, "<this>");
        C5207g.m11111f(interfaceC7690u, "state");
        int i10 = f3264e;
        C7675f c7675f = f3265f;
        if (c7675f.f42163a > 0) {
            i10 = c7675f.f42164b[0];
        }
        int i11 = i10 - 1;
        T t11 = null;
        AbstractC7691v abstractC7691v = null;
        for (AbstractC7691v abstractC7691vMo1698l = interfaceC7690u.mo1698l(); abstractC7691vMo1698l != null; abstractC7691vMo1698l = abstractC7691vMo1698l.f42189b) {
            int i12 = abstractC7691vMo1698l.f42188a;
            if (i12 != 0) {
                if (i12 != 0 && i12 <= i11) {
                    int i13 = i12 + 0;
                    z10 = i13 < 0 || i13 >= 64 ? !(i13 < 64 || i13 >= 128 || (((1 << (i13 + (-64))) & 0) > 0L ? 1 : (((1 << (i13 + (-64))) & 0) == 0L ? 0 : -1)) == 0) : (((1 << i13) & 0) > 0L ? 1 : (((1 << i13) & 0) == 0L ? 0 : -1)) != 0 ? false : true;
                }
                if (z10) {
                    if (abstractC7691v != null) {
                        if (abstractC7691vMo1698l.f42188a >= abstractC7691v.f42188a) {
                            t11 = (T) abstractC7691v;
                            break;
                        }
                        break;
                    }
                    abstractC7691v = abstractC7691vMo1698l;
                }
            }
            t11 = (T) abstractC7691vMo1698l;
            break;
        }
        if (t11 != null) {
            t11.f42188a = Integer.MAX_VALUE;
            return t11;
        }
        T t12 = (T) t10.mo1701b();
        t12.f42188a = Integer.MAX_VALUE;
        t12.f42189b = interfaceC7690u.mo1698l();
        interfaceC7690u.mo1699q(t12);
        return t12;
    }

    /* JADX INFO: renamed from: m */
    public static final <T extends AbstractC7691v> T m1894m(T t10, InterfaceC7690u interfaceC7690u, AbstractC0497b abstractC0497b) {
        T t11;
        C5207g.m11111f(t10, "<this>");
        C5207g.m11111f(interfaceC7690u, "state");
        synchronized (f3262c) {
            try {
                t11 = (T) m1893l(t10, interfaceC7690u);
                t11.mo1700a(t10);
                t11.f42188a = abstractC0497b.mo1918d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t11;
    }

    /* JADX INFO: renamed from: n */
    public static final void m1895n(AbstractC0497b abstractC0497b, InterfaceC7690u interfaceC7690u) {
        C5207g.m11111f(interfaceC7690u, "state");
        InterfaceC2052l<Object, C9072e> interfaceC2052lMo1875h = abstractC0497b.mo1875h();
        if (interfaceC2052lMo1875h != null) {
            interfaceC2052lMo1875h.mo528n(interfaceC7690u);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final AbstractC7691v m1896o(C5348y0.a aVar, InterfaceC7690u interfaceC7690u, AbstractC0497b abstractC0497b, C5348y0.a aVar2) {
        AbstractC7691v abstractC7691vM1893l;
        C5207g.m11111f(aVar, "<this>");
        C5207g.m11111f(interfaceC7690u, "state");
        if (abstractC0497b.mo1874g()) {
            abstractC0497b.mo1876m(interfaceC7690u);
        }
        int iMo1918d = abstractC0497b.mo1918d();
        if (aVar2.f42188a == iMo1918d) {
            return aVar2;
        }
        synchronized (f3262c) {
            try {
                abstractC7691vM1893l = m1893l(aVar, interfaceC7690u);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        abstractC7691vM1893l.f42188a = iMo1918d;
        abstractC0497b.mo1876m(interfaceC7690u);
        return abstractC7691vM1893l;
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m1897p(InterfaceC7690u interfaceC7690u) {
        AbstractC7691v abstractC7691v;
        int i10 = f3264e;
        C7675f c7675f = f3265f;
        if (c7675f.f42163a > 0) {
            i10 = c7675f.f42164b[0];
        }
        int i11 = i10 - 1;
        AbstractC7691v abstractC7691v2 = null;
        int i12 = 0;
        for (AbstractC7691v abstractC7691vMo1698l = interfaceC7690u.mo1698l(); abstractC7691vMo1698l != null; abstractC7691vMo1698l = abstractC7691vMo1698l.f42189b) {
            int i13 = abstractC7691vMo1698l.f42188a;
            if (i13 != 0) {
                if (i13 > i11) {
                    i12++;
                } else if (abstractC7691v2 == null) {
                    abstractC7691v2 = abstractC7691vMo1698l;
                } else {
                    if (i13 < abstractC7691v2.f42188a) {
                        abstractC7691v = abstractC7691v2;
                        abstractC7691v2 = abstractC7691vMo1698l;
                    } else {
                        abstractC7691v = abstractC7691vMo1698l;
                    }
                    abstractC7691v2.f42188a = 0;
                    abstractC7691v2.mo1700a(abstractC7691v);
                    abstractC7691v2 = abstractC7691v;
                }
            }
        }
        return i12 < 1;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: q */
    public static final void m1898q() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    /* JADX INFO: renamed from: r */
    public static final <T extends AbstractC7691v> T m1899r(T t10, int i10, SnapshotIdSet snapshotIdSet) {
        T t11 = null;
        while (t10 != null) {
            int i11 = t10.f42188a;
            if (((i11 == 0 || i11 > i10 || snapshotIdSet.m1879g(i11)) ? false : true) && (t11 == null || t11.f42188a < t10.f42188a)) {
                t11 = t10;
            }
            t10 = (T) t10.f42189b;
        }
        if (t11 != null) {
            return t11;
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static final <T extends AbstractC7691v> T m1900s(T t10, InterfaceC7690u interfaceC7690u) {
        T t11;
        C5207g.m11111f(t10, "<this>");
        C5207g.m11111f(interfaceC7690u, "state");
        AbstractC0497b abstractC0497bM1891j = m1891j();
        InterfaceC2052l<Object, C9072e> interfaceC2052lMo1873f = abstractC0497bM1891j.mo1873f();
        if (interfaceC2052lMo1873f != null) {
            interfaceC2052lMo1873f.mo528n(interfaceC7690u);
        }
        T t12 = (T) m1899r(t10, abstractC0497bM1891j.mo1918d(), abstractC0497bM1891j.mo1919e());
        if (t12 != null) {
            return t12;
        }
        synchronized (f3262c) {
            AbstractC0497b abstractC0497bM1891j2 = m1891j();
            AbstractC7691v abstractC7691vMo1698l = interfaceC7690u.mo1698l();
            C5207g.m11109d(abstractC7691vMo1698l, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$7");
            t11 = (T) m1899r(abstractC7691vMo1698l, abstractC0497bM1891j2.mo1918d(), abstractC0497bM1891j2.mo1919e());
            if (t11 == null) {
                m1898q();
                throw null;
            }
        }
        return t11;
    }

    /* JADX INFO: renamed from: t */
    public static final void m1901t(int i10) {
        int i11;
        C7675f c7675f = f3265f;
        int i12 = c7675f.f42166d[i10];
        c7675f.m15276b(i12, c7675f.f42163a - 1);
        c7675f.f42163a--;
        int[] iArr = c7675f.f42164b;
        int i13 = iArr[i12];
        int i14 = i12;
        while (i14 > 0) {
            int i15 = ((i14 + 1) >> 1) - 1;
            if (iArr[i15] <= i13) {
                break;
            }
            c7675f.m15276b(i15, i14);
            i14 = i15;
        }
        int[] iArr2 = c7675f.f42164b;
        int i16 = c7675f.f42163a >> 1;
        while (i12 < i16) {
            int i17 = (i12 + 1) << 1;
            int i18 = i17 - 1;
            if (i17 < c7675f.f42163a && (i11 = iArr2[i17]) < iArr2[i18]) {
                if (i11 >= iArr2[i12]) {
                    break;
                }
                c7675f.m15276b(i17, i12);
                i12 = i17;
            } else {
                if (iArr2[i18] >= iArr2[i12]) {
                    break;
                }
                c7675f.m15276b(i18, i12);
                i12 = i18;
            }
        }
        c7675f.f42166d[i10] = c7675f.f42167e;
        c7675f.f42167e = i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: u */
    public static final <T> T m1902u(AbstractC0497b abstractC0497b, InterfaceC2052l<? super SnapshotIdSet, ? extends T> interfaceC2052l) {
        T tMo528n = interfaceC2052l.mo528n(f3263d.m1878f(abstractC0497b.mo1918d()));
        synchronized (f3262c) {
            int i10 = f3264e;
            f3264e = i10 + 1;
            SnapshotIdSet snapshotIdSetM1878f = f3263d.m1878f(abstractC0497b.mo1918d());
            f3263d = snapshotIdSetM1878f;
            f3268i.set(new GlobalSnapshot(i10, snapshotIdSetM1878f));
            abstractC0497b.mo1866c();
            f3263d = f3263d.m1881l(i10);
            C9072e c9072e = C9072e.f47360a;
        }
        return tMo528n;
    }

    /* JADX INFO: renamed from: v */
    public static final <T extends AbstractC7691v> T m1903v(T t10, InterfaceC7690u interfaceC7690u, AbstractC0497b abstractC0497b) {
        C5207g.m11111f(interfaceC7690u, "state");
        if (abstractC0497b.mo1874g()) {
            abstractC0497b.mo1876m(interfaceC7690u);
        }
        T t11 = (T) m1899r(t10, abstractC0497b.mo1918d(), abstractC0497b.mo1919e());
        if (t11 == null) {
            m1898q();
            throw null;
        }
        if (t11.f42188a == abstractC0497b.mo1918d()) {
            return t11;
        }
        T t12 = (T) m1894m(t11, interfaceC7690u, abstractC0497b);
        abstractC0497b.mo1876m(interfaceC7690u);
        return t12;
    }
}
