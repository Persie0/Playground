package androidx.compose.runtime;

import ae.C0062b;
import android.os.Trace;
import android.support.v4.media.C0141b;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import dm.C5207g;
import dm.C5212l;
import dm.C5213m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref$IntRef;
import p080e.C5288t;
import p081e0.AbstractC5293a;
import p081e0.AbstractC5311g;
import p081e0.AbstractC5317j;
import p081e0.AbstractC5326n0;
import p081e0.C5296b;
import p081e0.C5303d0;
import p081e0.C5304d1;
import p081e0.C5305e;
import p081e0.C5306e0;
import p081e0.C5309f0;
import p081e0.C5316i0;
import p081e0.C5318j0;
import p081e0.C5328o0;
import p081e0.C5332q0;
import p081e0.C5335s;
import p081e0.C5339u;
import p081e0.C5341v;
import p081e0.C5342v0;
import p081e0.C5343w;
import p081e0.C5345x;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5301c1;
import p081e0.InterfaceC5302d;
import p081e0.InterfaceC5308f;
import p081e0.InterfaceC5321l;
import p081e0.InterfaceC5323m;
import p081e0.InterfaceC5330p0;
import p081e0.InterfaceC5336s0;
import p081e0.InterfaceC5338t0;
import p105f0.C5453a;
import p105f0.C5454b;
import p105f0.C5455c;
import p105f0.C5456d;
import p105f0.C5457e;
import p126g0.InterfaceC5634d;
import p165i0.C6111d;
import p165i0.C6113f;
import p230l0.C7204a;
import p338qd.C8573r0;
import sl.C9072e;
import tl.C9322j;
import tl.C9326n;

/* JADX INFO: loaded from: classes.dex */
public final class ComposerImpl implements InterfaceC0476a {

    /* JADX INFO: renamed from: A */
    public int f2886A;

    /* JADX INFO: renamed from: B */
    public final C5288t f2887B;

    /* JADX INFO: renamed from: C */
    public boolean f2888C;

    /* JADX INFO: renamed from: D */
    public C0479d f2889D;

    /* JADX INFO: renamed from: E */
    public C5342v0 f2890E;

    /* JADX INFO: renamed from: F */
    public C0480e f2891F;

    /* JADX INFO: renamed from: G */
    public boolean f2892G;

    /* JADX INFO: renamed from: H */
    public InterfaceC5634d<AbstractC5317j<Object>, ? extends InterfaceC5301c1<? extends Object>> f2893H;

    /* JADX INFO: renamed from: I */
    public ArrayList f2894I;

    /* JADX INFO: renamed from: J */
    public C5296b f2895J;

    /* JADX INFO: renamed from: K */
    public final ArrayList f2896K;

    /* JADX INFO: renamed from: L */
    public boolean f2897L;

    /* JADX INFO: renamed from: M */
    public int f2898M;

    /* JADX INFO: renamed from: N */
    public int f2899N;

    /* JADX INFO: renamed from: O */
    public final C5288t f2900O;

    /* JADX INFO: renamed from: P */
    public int f2901P;

    /* JADX INFO: renamed from: Q */
    public boolean f2902Q;

    /* JADX INFO: renamed from: R */
    public boolean f2903R;

    /* JADX INFO: renamed from: S */
    public final C5339u f2904S;

    /* JADX INFO: renamed from: T */
    public final C5288t f2905T;

    /* JADX INFO: renamed from: U */
    public int f2906U;

    /* JADX INFO: renamed from: V */
    public int f2907V;

    /* JADX INFO: renamed from: W */
    public int f2908W;

    /* JADX INFO: renamed from: X */
    public int f2909X;

    /* JADX INFO: renamed from: a */
    public final InterfaceC5299c<?> f2910a;

    /* JADX INFO: renamed from: b */
    public final AbstractC5311g f2911b;

    /* JADX INFO: renamed from: c */
    public final C5342v0 f2912c;

    /* JADX INFO: renamed from: d */
    public final Set<InterfaceC5338t0> f2913d;

    /* JADX INFO: renamed from: e */
    public List<InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>> f2914e;

    /* JADX INFO: renamed from: f */
    public final List<InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>> f2915f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5321l f2916g;

    /* JADX INFO: renamed from: h */
    public final C5288t f2917h;

    /* JADX INFO: renamed from: i */
    public C0478c f2918i;

    /* JADX INFO: renamed from: j */
    public int f2919j;

    /* JADX INFO: renamed from: k */
    public final C5339u f2920k;

    /* JADX INFO: renamed from: l */
    public int f2921l;

    /* JADX INFO: renamed from: m */
    public final C5339u f2922m;

    /* JADX INFO: renamed from: n */
    public int[] f2923n;

    /* JADX INFO: renamed from: o */
    public HashMap<Integer, Integer> f2924o;

    /* JADX INFO: renamed from: p */
    public boolean f2925p;

    /* JADX INFO: renamed from: q */
    public boolean f2926q;

    /* JADX INFO: renamed from: r */
    public final ArrayList f2927r;

    /* JADX INFO: renamed from: s */
    public final C5339u f2928s;

    /* JADX INFO: renamed from: t */
    public InterfaceC5634d<AbstractC5317j<Object>, ? extends InterfaceC5301c1<? extends Object>> f2929t;

    /* JADX INFO: renamed from: u */
    public final C5457e f2930u;

    /* JADX INFO: renamed from: v */
    public boolean f2931v;

    /* JADX INFO: renamed from: w */
    public final C5339u f2932w;

    /* JADX INFO: renamed from: x */
    public boolean f2933x;

    /* JADX INFO: renamed from: y */
    public final int f2934y;

    /* JADX INFO: renamed from: z */
    public int f2935z;

    /* JADX INFO: renamed from: androidx.compose.runtime.ComposerImpl$a */
    public static final class C0465a implements InterfaceC5338t0 {

        /* JADX INFO: renamed from: a */
        public final C0466b f2936a;

        public C0465a(C0466b c0466b) {
            this.f2936a = c0466b;
        }

        @Override // p081e0.InterfaceC5338t0
        /* JADX INFO: renamed from: a */
        public final void mo1536a() {
            this.f2936a.m1684p();
        }

        @Override // p081e0.InterfaceC5338t0
        /* JADX INFO: renamed from: b */
        public final void mo1537b() {
            this.f2936a.m1684p();
        }

        @Override // p081e0.InterfaceC5338t0
        /* JADX INFO: renamed from: c */
        public final void mo1538c() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.ComposerImpl$b */
    public final class C0466b extends AbstractC5311g {

        /* JADX INFO: renamed from: a */
        public final int f2939a;

        /* JADX INFO: renamed from: b */
        public final boolean f2940b;

        /* JADX INFO: renamed from: c */
        public HashSet f2941c;

        /* JADX INFO: renamed from: d */
        public final LinkedHashSet f2942d = new LinkedHashSet();

        /* JADX INFO: renamed from: e */
        public final ParcelableSnapshotMutableState f2943e = C8573r0.m16684L0(C5212l.m11160g0());

        public C0466b(int i10, boolean z10) {
            this.f2939a = i10;
            this.f2940b = z10;
        }

        @Override // p081e0.AbstractC5311g
        /* JADX INFO: renamed from: a */
        public final void mo1669a(InterfaceC5321l interfaceC5321l, ComposableLambdaImpl composableLambdaImpl) {
            C5207g.m11111f(interfaceC5321l, "composition");
            ComposerImpl.this.f2911b.mo1669a(interfaceC5321l, composableLambdaImpl);
        }

        @Override // p081e0.AbstractC5311g
        /* JADX INFO: renamed from: b */
        public final void mo1670b(C5309f0 c5309f0) {
            ComposerImpl.this.f2911b.mo1670b(c5309f0);
        }

        @Override // p081e0.AbstractC5311g
        /* JADX INFO: renamed from: c */
        public final void mo1671c() {
            ComposerImpl.this.f2935z--;
        }

        @Override // p081e0.AbstractC5311g
        /* JADX INFO: renamed from: d */
        public final boolean mo1672d() {
            return this.f2940b;
        }

        @Override // p081e0.AbstractC5311g
        /* JADX INFO: renamed from: e */
        public final InterfaceC5634d<AbstractC5317j<Object>, InterfaceC5301c1<Object>> mo1673e() {
            return (InterfaceC5634d) this.f2943e.getValue();
        }

        @Override // p081e0.AbstractC5311g
        /* JADX INFO: renamed from: f */
        public final int mo1674f() {
            return this.f2939a;
        }

        @Override // p081e0.AbstractC5311g
        /* JADX INFO: renamed from: g */
        public final CoroutineContext mo1675g() {
            return ComposerImpl.this.f2911b.mo1675g();
        }

        @Override // p081e0.AbstractC5311g
        /* JADX INFO: renamed from: h */
        public final void mo1676h(InterfaceC5321l interfaceC5321l) {
            C5207g.m11111f(interfaceC5321l, "composition");
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.f2911b.mo1676h(composerImpl.f2916g);
            composerImpl.f2911b.mo1676h(interfaceC5321l);
        }

        @Override // p081e0.AbstractC5311g
        /* JADX INFO: renamed from: i */
        public final void mo1677i(C5309f0 c5309f0, C5306e0 c5306e0) {
            ComposerImpl.this.f2911b.mo1677i(c5309f0, c5306e0);
        }

        @Override // p081e0.AbstractC5311g
        /* JADX INFO: renamed from: j */
        public final C5306e0 mo1678j(C5309f0 c5309f0) {
            C5207g.m11111f(c5309f0, "reference");
            return ComposerImpl.this.f2911b.mo1678j(c5309f0);
        }

        @Override // p081e0.AbstractC5311g
        /* JADX INFO: renamed from: k */
        public final void mo1679k(Set<Object> set) {
            HashSet hashSet = this.f2941c;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f2941c = hashSet;
            }
            hashSet.add(set);
        }

        @Override // p081e0.AbstractC5311g
        /* JADX INFO: renamed from: l */
        public final void mo1680l(ComposerImpl composerImpl) {
            this.f2942d.add(composerImpl);
        }

        @Override // p081e0.AbstractC5311g
        /* JADX INFO: renamed from: m */
        public final void mo1681m() {
            ComposerImpl.this.f2935z++;
        }

        @Override // p081e0.AbstractC5311g
        /* JADX INFO: renamed from: n */
        public final void mo1682n(InterfaceC0476a interfaceC0476a) {
            C5207g.m11111f(interfaceC0476a, "composer");
            HashSet hashSet = this.f2941c;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(((ComposerImpl) interfaceC0476a).f2912c);
                }
            }
            LinkedHashSet linkedHashSet = this.f2942d;
            C5213m.m11196a(linkedHashSet);
            linkedHashSet.remove(interfaceC0476a);
        }

        @Override // p081e0.AbstractC5311g
        /* JADX INFO: renamed from: o */
        public final void mo1683o(InterfaceC5321l interfaceC5321l) {
            C5207g.m11111f(interfaceC5321l, "composition");
            ComposerImpl.this.f2911b.mo1683o(interfaceC5321l);
        }

        /* JADX INFO: renamed from: p */
        public final void m1684p() {
            LinkedHashSet<ComposerImpl> linkedHashSet = this.f2942d;
            if (!linkedHashSet.isEmpty()) {
                HashSet hashSet = this.f2941c;
                if (hashSet != null) {
                    for (ComposerImpl composerImpl : linkedHashSet) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ((Set) it.next()).remove(composerImpl.f2912c);
                        }
                    }
                }
                linkedHashSet.clear();
            }
        }
    }

    public ComposerImpl(AbstractC5293a abstractC5293a, AbstractC5311g abstractC5311g, C5342v0 c5342v0, HashSet hashSet, ArrayList arrayList, ArrayList arrayList2, InterfaceC5321l interfaceC5321l) {
        C5207g.m11111f(abstractC5311g, "parentContext");
        C5207g.m11111f(interfaceC5321l, "composition");
        this.f2910a = abstractC5293a;
        this.f2911b = abstractC5311g;
        this.f2912c = c5342v0;
        this.f2913d = hashSet;
        this.f2914e = arrayList;
        this.f2915f = arrayList2;
        this.f2916g = interfaceC5321l;
        this.f2917h = new C5288t(1);
        this.f2920k = new C5339u();
        this.f2922m = new C5339u();
        this.f2927r = new ArrayList();
        this.f2928s = new C5339u();
        this.f2929t = C5212l.m11160g0();
        this.f2930u = new C5457e(0);
        this.f2932w = new C5339u();
        this.f2934y = -1;
        SnapshotKt.m1891j();
        this.f2887B = new C5288t(1);
        C0479d c0479dM11471i = c5342v0.m11471i();
        c0479dM11471i.m1759c();
        this.f2889D = c0479dM11471i;
        C5342v0 c5342v1 = new C5342v0();
        this.f2890E = c5342v1;
        C0480e c0480eM11472l = c5342v1.m11472l();
        c0480eM11472l.m1793f();
        this.f2891F = c0480eM11472l;
        C0479d c0479dM11471i2 = this.f2890E.m11471i();
        try {
            C5296b c5296bM1757a = c0479dM11471i2.m1757a(0);
            c0479dM11471i2.m1759c();
            this.f2895J = c5296bM1757a;
            this.f2896K = new ArrayList();
            this.f2900O = new C5288t(1);
            this.f2903R = true;
            this.f2904S = new C5339u();
            this.f2905T = new C5288t(1);
            this.f2906U = -1;
            this.f2907V = -1;
            this.f2908W = -1;
        } catch (Throwable th2) {
            c0479dM11471i2.m1759c();
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.compose.runtime.ComposerImpl$invokeMovableContentLambda$1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: B */
    public static final void m1584B(ComposerImpl composerImpl, final C5303d0 c5303d0, InterfaceC5634d interfaceC5634d, final Object obj) {
        composerImpl.mo1638k(126665345, c5303d0);
        composerImpl.mo1665y(obj);
        int i10 = composerImpl.f2898M;
        try {
            composerImpl.f2898M = 126665345;
            if (composerImpl.f2897L) {
                C0480e.m1773t(composerImpl.f2891F);
            }
            boolean z10 = (composerImpl.f2897L || C5207g.m11106a(composerImpl.f2889D.m1761e(), interfaceC5634d)) ? false : true;
            if (z10) {
                composerImpl.f2930u.f34016a.put(composerImpl.f2889D.f3160g, interfaceC5634d);
            }
            composerImpl.m1652r0(202, 0, ComposerKt.f3010h, interfaceC5634d);
            boolean z11 = composerImpl.f2897L;
            boolean z12 = composerImpl.f2931v;
            composerImpl.f2931v = z10;
            C5212l.m11149V(composerImpl, C7204a.m14523c(694380496, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$invokeMovableContentLambda$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a, Integer num) {
                    InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
                    if ((num.intValue() & 11) == 2 && interfaceC0476a2.mo1642m()) {
                        interfaceC0476a2.mo1650q();
                        return C9072e.f47360a;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                    c5303d0.getClass();
                    throw null;
                }
            }, true));
            composerImpl.f2931v = z12;
            composerImpl.m1609Q(false);
            composerImpl.f2898M = i10;
            composerImpl.m1609Q(false);
        } catch (Throwable th2) {
            composerImpl.m1609Q(false);
            composerImpl.f2898M = i10;
            composerImpl.m1609Q(false);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: Z */
    public static final void m1585Z(C0480e c0480e, InterfaceC5299c<Object> interfaceC5299c, int i10) {
        while (true) {
            int i11 = c0480e.f3184s;
            if ((i10 > i11 && i10 < c0480e.f3172g) || (i11 == 0 && i10 == 0)) {
                return;
            }
            c0480e.m1780G();
            if (c0480e.m1806s(c0480e.f3184s)) {
                interfaceC5299c.mo11431e();
            }
            c0480e.m1796i();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static final int m1586q0(final ComposerImpl composerImpl, int i10, boolean z10, int i11) {
        C0479d c0479d = composerImpl.f2889D;
        int[] iArr = c0479d.f3155b;
        int i12 = i10 * 5;
        if (!((iArr[i12 + 1] & 134217728) != 0)) {
            if (!C0062b.m400u(iArr, i10)) {
                return composerImpl.f2889D.m1766j(i10);
            }
            int iM1763g = composerImpl.f2889D.m1763g(i10) + i10;
            int iM1763g2 = i10 + 1;
            int iM1586q0 = 0;
            while (iM1763g2 < iM1763g) {
                boolean zM1764h = composerImpl.f2889D.m1764h(iM1763g2);
                if (zM1764h) {
                    composerImpl.m1623c0();
                    composerImpl.f2900O.m11407f(composerImpl.f2889D.m1765i(iM1763g2));
                }
                iM1586q0 += m1586q0(composerImpl, iM1763g2, zM1764h || z10, zM1764h ? 0 : i11 + iM1586q0);
                if (zM1764h) {
                    composerImpl.m1623c0();
                    composerImpl.m1645n0();
                }
                iM1763g2 += composerImpl.f2889D.m1763g(iM1763g2);
            }
            return iM1586q0;
        }
        int i13 = iArr[i12];
        Object objM1767k = c0479d.m1767k(iArr, i10);
        if (i13 != 126665345 || !(objM1767k instanceof C5303d0)) {
            if (i13 != 206 || !C5207g.m11106a(objM1767k, ComposerKt.f3013k)) {
                return composerImpl.f2889D.m1766j(i10);
            }
            Object objM1762f = composerImpl.f2889D.m1762f(i10, 0);
            C0465a c0465a = objM1762f instanceof C0465a ? (C0465a) objM1762f : null;
            if (c0465a != null) {
                Iterator it = c0465a.f2936a.f2942d.iterator();
                while (it.hasNext()) {
                    ((ComposerImpl) it.next()).m1649p0();
                }
            }
            return composerImpl.f2889D.m1766j(i10);
        }
        C5303d0 c5303d0 = (C5303d0) objM1767k;
        Object objM1762f2 = composerImpl.f2889D.m1762f(i10, 0);
        C5296b c5296bM1757a = composerImpl.f2889D.m1757a(i10);
        int iM1763g3 = composerImpl.f2889D.m1763g(i10) + i10;
        ArrayList arrayList = composerImpl.f2927r;
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        ArrayList arrayList2 = new ArrayList();
        int iM1688d = ComposerKt.m1688d(i10, arrayList);
        if (iM1688d < 0) {
            iM1688d = -(iM1688d + 1);
        }
        while (iM1688d < arrayList.size()) {
            C5341v c5341v = (C5341v) arrayList.get(iM1688d);
            if (c5341v.f33622b >= iM1763g3) {
                break;
            }
            arrayList2.add(c5341v);
            iM1688d++;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size = arrayList2.size();
        for (int i14 = 0; i14 < size; i14++) {
            C5341v c5341v2 = (C5341v) arrayList2.get(i14);
            arrayList3.add(new Pair(c5341v2.f33621a, c5341v2.f33623c));
        }
        final C5309f0 c5309f0 = new C5309f0(c5303d0, objM1762f2, composerImpl.f2916g, composerImpl.f2912c, c5296bM1757a, arrayList3, composerImpl.m1605M(i10));
        composerImpl.f2911b.mo1670b(c5309f0);
        composerImpl.m1641l0();
        composerImpl.m1635i0(new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$reportFreeMovableContent$reportGroup$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e, InterfaceC5336s0 interfaceC5336s0) {
                C0480e c0480e2 = c0480e;
                C0141b.m619o(interfaceC5299c, "<anonymous parameter 0>", c0480e2, "slots", interfaceC5336s0, "<anonymous parameter 2>");
                C5309f0 c5309f1 = c5309f0;
                ComposerImpl composerImpl2 = this.f2993b;
                composerImpl2.getClass();
                C5342v0 c5342v0 = new C5342v0();
                C0480e c0480eM11472l = c5342v0.m11472l();
                try {
                    c0480eM11472l.m1792e();
                    c0480eM11472l.m1783J(126665345, c5309f1.f33576a, InterfaceC0476a.a.f3122a, false);
                    C0480e.m1773t(c0480eM11472l);
                    c0480eM11472l.m1784K(c5309f1.f33577b);
                    c0480e2.m1810x(c5309f1.f33580e, c0480eM11472l);
                    c0480eM11472l.m1779F();
                    c0480eM11472l.m1796i();
                    c0480eM11472l.m1797j();
                    C9072e c9072e = C9072e.f47360a;
                    c0480eM11472l.m1793f();
                    composerImpl2.f2911b.mo1677i(c5309f1, new C5306e0(c5342v0));
                    return C9072e.f47360a;
                } catch (Throwable th2) {
                    c0480eM11472l.m1793f();
                    throw th2;
                }
            }
        });
        if (!z10) {
            return composerImpl.f2889D.m1766j(i10);
        }
        composerImpl.m1623c0();
        composerImpl.m1627e0();
        composerImpl.m1621b0();
        int iM1766j = composerImpl.f2889D.m1764h(i10) ? 1 : composerImpl.f2889D.m1766j(i10);
        if (iM1766j <= 0) {
            return 0;
        }
        composerImpl.m1637j0(i11, iM1766j);
        return 0;
    }

    /* JADX INFO: renamed from: A */
    public final void m1587A() {
        m1601I();
        ((ArrayList) this.f2917h.f33503b).clear();
        this.f2920k.f33618a = 0;
        this.f2922m.f33618a = 0;
        this.f2928s.f33618a = 0;
        this.f2932w.f33618a = 0;
        this.f2930u.f34016a.clear();
        C0479d c0479d = this.f2889D;
        if (!c0479d.f3159f) {
            c0479d.m1759c();
        }
        C0480e c0480e = this.f2891F;
        if (!c0480e.f3185t) {
            c0480e.m1793f();
        }
        ComposerKt.m1690f(this.f2891F.f3185t);
        C5342v0 c5342v0 = new C5342v0();
        this.f2890E = c5342v0;
        C0480e c0480eM11472l = c5342v0.m11472l();
        c0480eM11472l.m1793f();
        this.f2891F = c0480eM11472l;
        this.f2898M = 0;
        this.f2935z = 0;
        this.f2926q = false;
        this.f2897L = false;
        this.f2933x = false;
        this.f2888C = false;
    }

    /* JADX INFO: renamed from: A0 */
    public final void m1588A0(Object obj, int i10, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                m1589B0(((Enum) obj).ordinal());
                return;
            } else {
                m1589B0(obj.hashCode());
                return;
            }
        }
        if (obj2 == null || i10 != 207 || C5207g.m11106a(obj2, InterfaceC0476a.a.f3122a)) {
            m1589B0(i10);
        } else {
            m1589B0(obj2.hashCode());
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final void m1589B0(int i10) {
        this.f2898M = Integer.rotateRight(Integer.hashCode(i10) ^ this.f2898M, 3);
    }

    /* JADX INFO: renamed from: C */
    public final C0466b m1590C() {
        m1656t0(206, ComposerKt.f3013k);
        if (this.f2897L) {
            C0480e.m1773t(this.f2891F);
        }
        Object objM1619a0 = m1619a0();
        C0465a c0465a = objM1619a0 instanceof C0465a ? (C0465a) objM1619a0 : null;
        if (c0465a == null) {
            c0465a = new C0465a(new C0466b(this.f2898M, this.f2925p));
            m1597F0(c0465a);
        }
        InterfaceC5634d<AbstractC5317j<Object>, InterfaceC5301c1<Object>> interfaceC5634dM1604L = m1604L();
        C0466b c0466b = c0465a.f2936a;
        c0466b.getClass();
        C5207g.m11111f(interfaceC5634dM1604L, "scope");
        c0466b.f2943e.setValue(interfaceC5634dM1604L);
        m1609Q(false);
        return c0465a.f2936a;
    }

    /* JADX INFO: renamed from: C0 */
    public final void m1591C0(int i10, int i11) {
        if (m1599G0(i10) != i11) {
            if (i10 < 0) {
                HashMap<Integer, Integer> map = this.f2924o;
                if (map == null) {
                    map = new HashMap<>();
                    this.f2924o = map;
                }
                map.put(Integer.valueOf(i10), Integer.valueOf(i11));
                return;
            }
            int[] iArr = this.f2923n;
            if (iArr == null) {
                int i12 = this.f2889D.f3156c;
                int[] iArr2 = new int[i12];
                Arrays.fill(iArr2, 0, i12, -1);
                this.f2923n = iArr2;
                iArr = iArr2;
            }
            iArr[i10] = i11;
        }
    }

    /* JADX INFO: renamed from: D */
    public final boolean m1592D(float f3) {
        Object objM1619a0 = m1619a0();
        if (objM1619a0 instanceof Float) {
            if (f3 == ((Number) objM1619a0).floatValue()) {
                return false;
            }
        }
        m1597F0(Float.valueOf(f3));
        return true;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m1593D0(int i10, int i11) {
        int iM1599G0 = m1599G0(i10);
        if (iM1599G0 != i11) {
            int i12 = i11 - iM1599G0;
            C5288t c5288t = this.f2917h;
            int size = ((ArrayList) c5288t.f33503b).size() - 1;
            while (i10 != -1) {
                int iM1599G1 = m1599G0(i10) + i12;
                m1591C0(i10, iM1599G1);
                for (int i13 = size; -1 < i13; i13--) {
                    C0478c c0478c = (C0478c) ((ArrayList) c5288t.f33503b).get(i13);
                    if (c0478c != null && c0478c.m1756b(i10, iM1599G1)) {
                        size = i13 - 1;
                        break;
                    }
                }
                if (i10 < 0) {
                    i10 = this.f2889D.f3162i;
                } else if (this.f2889D.m1764h(i10)) {
                    break;
                } else {
                    i10 = this.f2889D.m1768l(i10);
                }
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final boolean m1594E(int i10) {
        Object objM1619a0 = m1619a0();
        if ((objM1619a0 instanceof Integer) && i10 == ((Number) objM1619a0).intValue()) {
            return false;
        }
        m1597F0(Integer.valueOf(i10));
        return true;
    }

    /* JADX INFO: renamed from: E0 */
    public final InterfaceC5634d<AbstractC5317j<Object>, InterfaceC5301c1<Object>> m1595E0(InterfaceC5634d<AbstractC5317j<Object>, ? extends InterfaceC5301c1<? extends Object>> interfaceC5634d, InterfaceC5634d<AbstractC5317j<Object>, ? extends InterfaceC5301c1<? extends Object>> interfaceC5634d2) {
        C6113f c6113fMo12008j = interfaceC5634d.mo12008j();
        c6113fMo12008j.putAll(interfaceC5634d2);
        C6111d c6111dM12616a = c6113fMo12008j.m12616a();
        m1656t0(204, ComposerKt.f3012j);
        mo1665y(c6111dM12616a);
        mo1665y(interfaceC5634d2);
        m1609Q(false);
        return c6111dM12616a;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m1596F(long j10) {
        Object objM1619a0 = m1619a0();
        if ((objM1619a0 instanceof Long) && j10 == ((Number) objM1619a0).longValue()) {
            return false;
        }
        m1597F0(Long.valueOf(j10));
        return true;
    }

    /* JADX INFO: renamed from: F0 */
    public final void m1597F0(final Object obj) {
        boolean z10 = this.f2897L;
        Set<InterfaceC5338t0> set = this.f2913d;
        if (z10) {
            this.f2891F.m1784K(obj);
            if (obj instanceof InterfaceC5338t0) {
                m1635i0(new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$updateValue$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // cm.InterfaceC2057q
                    /* JADX INFO: renamed from: M */
                    public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e, InterfaceC5336s0 interfaceC5336s0) {
                        InterfaceC5336s0 interfaceC5336s1 = interfaceC5336s0;
                        C0141b.m619o(interfaceC5299c, "<anonymous parameter 0>", c0480e, "<anonymous parameter 1>", interfaceC5336s1, "rememberManager");
                        interfaceC5336s1.mo1749c((InterfaceC5338t0) obj);
                        return C9072e.f47360a;
                    }
                });
                set.add(obj);
                return;
            }
            return;
        }
        C0479d c0479d = this.f2889D;
        final int iM268G = (c0479d.f3164k - C0062b.m268G(c0479d.f3155b, c0479d.f3162i)) - 1;
        if (obj instanceof InterfaceC5338t0) {
            set.add(obj);
        }
        m1643m0(true, new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$updateValue$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e, InterfaceC5336s0 interfaceC5336s0) {
                C5332q0 c5332q0;
                C0477b c0477b;
                C0480e c0480e2 = c0480e;
                InterfaceC5336s0 interfaceC5336s1 = interfaceC5336s0;
                C0141b.m619o(interfaceC5299c, "<anonymous parameter 0>", c0480e2, "slots", interfaceC5336s1, "rememberManager");
                Object obj2 = obj;
                if (obj2 instanceof InterfaceC5338t0) {
                    interfaceC5336s1.mo1749c((InterfaceC5338t0) obj2);
                }
                int iM1781H = c0480e2.m1781H(c0480e2.f3167b, c0480e2.m1801n(c0480e2.f3183r));
                int iM1794g = c0480e2.m1794g(c0480e2.f3167b, c0480e2.m1801n(c0480e2.f3183r + 1));
                int i10 = iM268G;
                int i11 = iM1781H + i10;
                if (!(i11 >= iM1781H && i11 < iM1794g)) {
                    StringBuilder sbM614j = C0141b.m614j("Write to an invalid slot index ", i10, " for group ");
                    sbM614j.append(c0480e2.f3183r);
                    ComposerKt.m1687c(sbM614j.toString().toString());
                    throw null;
                }
                int iM1795h = c0480e2.m1795h(i11);
                Object[] objArr = c0480e2.f3168c;
                Object obj3 = objArr[iM1795h];
                objArr[iM1795h] = obj2;
                if (obj3 instanceof InterfaceC5338t0) {
                    interfaceC5336s1.mo1750d((InterfaceC5338t0) obj3);
                } else if ((obj3 instanceof C5332q0) && (c0477b = (c5332q0 = (C5332q0) obj3).f33603b) != null) {
                    c5332q0.f33603b = null;
                    c5332q0.f33607f = null;
                    c5332q0.f33608g = null;
                    c0477b.f3124I = true;
                }
                return C9072e.f47360a;
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public final boolean m1598G(boolean z10) {
        Object objM1619a0 = m1619a0();
        if ((objM1619a0 instanceof Boolean) && z10 == ((Boolean) objM1619a0).booleanValue()) {
            return false;
        }
        m1597F0(Boolean.valueOf(z10));
        return true;
    }

    /* JADX INFO: renamed from: G0 */
    public final int m1599G0(int i10) {
        int i11;
        Integer num;
        if (i10 >= 0) {
            int[] iArr = this.f2923n;
            return (iArr == null || (i11 = iArr[i10]) < 0) ? this.f2889D.m1766j(i10) : i11;
        }
        HashMap<Integer, Integer> map = this.f2924o;
        if (map == null || (num = map.get(Integer.valueOf(i10))) == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: H */
    public final boolean m1600H(Object obj) {
        if (m1619a0() == obj) {
            return false;
        }
        m1597F0(obj);
        return true;
    }

    /* JADX INFO: renamed from: I */
    public final void m1601I() {
        this.f2918i = null;
        this.f2919j = 0;
        this.f2921l = 0;
        this.f2901P = 0;
        this.f2898M = 0;
        this.f2926q = false;
        this.f2902Q = false;
        this.f2904S.f33618a = 0;
        ((ArrayList) this.f2887B.f33503b).clear();
        this.f2923n = null;
        this.f2924o = null;
    }

    /* JADX INFO: renamed from: J */
    public final void m1602J(C5454b c5454b, ComposableLambdaImpl composableLambdaImpl) {
        C5207g.m11111f(c5454b, "invalidationsRequested");
        if (this.f2914e.isEmpty()) {
            m1607O(c5454b, composableLambdaImpl);
        } else {
            ComposerKt.m1687c("Expected applyChanges() to have been called".toString());
            throw null;
        }
    }

    /* JADX INFO: renamed from: K */
    public final int m1603K(int i10, int i11, int i12) {
        Object objM1758b;
        if (i10 == i11) {
            return i12;
        }
        C0479d c0479d = this.f2889D;
        int[] iArr = c0479d.f3155b;
        int i13 = i10 * 5;
        int iHashCode = 0;
        if ((iArr[i13 + 1] & 536870912) != 0) {
            Object objM1767k = c0479d.m1767k(iArr, i10);
            if (objM1767k != null) {
                if (objM1767k instanceof Enum) {
                    iHashCode = ((Enum) objM1767k).ordinal();
                } else {
                    iHashCode = objM1767k instanceof C5303d0 ? 126665345 : objM1767k.hashCode();
                }
            }
        } else {
            iHashCode = iArr[i13];
            if (iHashCode == 207 && (objM1758b = c0479d.m1758b(iArr, i10)) != null && !C5207g.m11106a(objM1758b, InterfaceC0476a.a.f3122a)) {
                iHashCode = objM1758b.hashCode();
            }
        }
        return iHashCode == 126665345 ? iHashCode : Integer.rotateLeft(m1603K(this.f2889D.m1768l(i10), i11, i12), 3) ^ iHashCode;
    }

    /* JADX INFO: renamed from: L */
    public final InterfaceC5634d<AbstractC5317j<Object>, InterfaceC5301c1<Object>> m1604L() {
        InterfaceC5634d interfaceC5634d = this.f2893H;
        return interfaceC5634d != null ? interfaceC5634d : m1605M(this.f2889D.f3162i);
    }

    /* JADX INFO: renamed from: M */
    public final InterfaceC5634d<AbstractC5317j<Object>, InterfaceC5301c1<Object>> m1605M(int i10) {
        Object obj;
        if (this.f2897L && this.f2892G) {
            int iM1812z = this.f2891F.f3184s;
            while (iM1812z > 0) {
                C0480e c0480e = this.f2891F;
                if (c0480e.f3167b[c0480e.m1801n(iM1812z) * 5] == 202) {
                    C0480e c0480e2 = this.f2891F;
                    int iM1801n = c0480e2.m1801n(iM1812z);
                    int[] iArr = c0480e2.f3167b;
                    int i11 = iM1801n * 5;
                    int i12 = iArr[i11 + 1];
                    if ((536870912 & i12) != 0) {
                        obj = c0480e2.f3168c[C0062b.m249B0(i12 >> 30) + iArr[i11 + 4]];
                    } else {
                        obj = null;
                    }
                    if (C5207g.m11106a(obj, ComposerKt.f3010h)) {
                        C0480e c0480e3 = this.f2891F;
                        int iM1801n2 = c0480e3.m1801n(iM1812z);
                        Object obj2 = C0062b.m408w(c0480e3.f3167b, iM1801n2) ? c0480e3.f3168c[c0480e3.m1791d(c0480e3.f3167b, iM1801n2)] : InterfaceC0476a.a.f3122a;
                        C5207g.m11109d(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                        InterfaceC5634d<AbstractC5317j<Object>, InterfaceC5301c1<Object>> interfaceC5634d = (InterfaceC5634d) obj2;
                        this.f2893H = interfaceC5634d;
                        return interfaceC5634d;
                    }
                }
                iM1812z = this.f2891F.m1812z(iM1812z);
            }
        }
        if (this.f2889D.f3156c > 0) {
            while (i10 > 0) {
                C0479d c0479d = this.f2889D;
                int[] iArr2 = c0479d.f3155b;
                if (iArr2[i10 * 5] == 202 && C5207g.m11106a(c0479d.m1767k(iArr2, i10), ComposerKt.f3010h)) {
                    InterfaceC5634d<AbstractC5317j<Object>, InterfaceC5301c1<Object>> interfaceC5634d2 = (InterfaceC5634d) this.f2930u.f34016a.get(i10);
                    if (interfaceC5634d2 == null) {
                        C0479d c0479d2 = this.f2889D;
                        Object objM1758b = c0479d2.m1758b(c0479d2.f3155b, i10);
                        C5207g.m11109d(objM1758b, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                        interfaceC5634d2 = (InterfaceC5634d) objM1758b;
                    }
                    this.f2893H = interfaceC5634d2;
                    return interfaceC5634d2;
                }
                i10 = this.f2889D.m1768l(i10);
            }
        }
        InterfaceC5634d interfaceC5634d3 = this.f2929t;
        this.f2893H = interfaceC5634d3;
        return interfaceC5634d3;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: N */
    public final void m1606N() {
        Trace.beginSection("Compose:Composer.dispose");
        try {
            this.f2911b.mo1682n(this);
            ((ArrayList) this.f2887B.f33503b).clear();
            this.f2927r.clear();
            this.f2914e.clear();
            this.f2930u.f34016a.clear();
            this.f2910a.clear();
            C9072e c9072e = C9072e.f47360a;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: O */
    public final void m1607O(C5454b c5454b, final ComposableLambdaImpl composableLambdaImpl) {
        if (!(!this.f2888C)) {
            ComposerKt.m1687c("Reentrant composition is not supported".toString());
            throw null;
        }
        Trace.beginSection("Compose:recompose");
        try {
            this.f2886A = SnapshotKt.m1891j().mo1918d();
            this.f2930u.f34016a.clear();
            int i10 = c5454b.f34005a;
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f2927r;
                if (i11 >= i10) {
                    if (arrayList.size() > 1) {
                        C9326n.m17682B(arrayList, new C5305e());
                    }
                    this.f2919j = 0;
                    this.f2888C = true;
                    try {
                        m1664x0();
                        final Object objM1619a0 = m1619a0();
                        if (objM1619a0 != composableLambdaImpl && composableLambdaImpl != null) {
                            m1597F0(composableLambdaImpl);
                        }
                        C8573r0.m16688N0(new InterfaceC2041a<C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$doCompose$2$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final C9072e mo807E() {
                                Object obj;
                                ComposerImpl composerImpl = this;
                                InterfaceC2056p<InterfaceC0476a, Integer, C9072e> interfaceC2056p = composableLambdaImpl;
                                if (interfaceC2056p != null) {
                                    composerImpl.m1656t0(200, ComposerKt.f3008f);
                                    C5212l.m11149V(composerImpl, interfaceC2056p);
                                    composerImpl.m1609Q(false);
                                } else {
                                    composerImpl.getClass();
                                    if (composerImpl.f2931v && (obj = objM1619a0) != null && !C5207g.m11106a(obj, InterfaceC0476a.a.f3122a)) {
                                        composerImpl.m1656t0(200, ComposerKt.f3008f);
                                        C5213m.m11200e(2, obj);
                                        C5212l.m11149V(composerImpl, (InterfaceC2056p) obj);
                                        composerImpl.m1609Q(false);
                                    } else if (composerImpl.f2927r.isEmpty()) {
                                        composerImpl.f2921l = composerImpl.f2889D.m1770n() + composerImpl.f2921l;
                                    } else {
                                        C0479d c0479d = composerImpl.f2889D;
                                        int i12 = c0479d.f3160g;
                                        int i13 = c0479d.f3161h;
                                        int i14 = i12 < i13 ? c0479d.f3155b[i12 * 5] : 0;
                                        int[] iArr = c0479d.f3155b;
                                        Object objM1767k = i12 < i13 ? c0479d.m1767k(iArr, i12) : null;
                                        Object objM1761e = c0479d.m1761e();
                                        composerImpl.m1668z0(objM1767k, i14, objM1761e);
                                        composerImpl.m1662w0(null, C0062b.m416y(iArr, c0479d.f3160g));
                                        composerImpl.m1633h0();
                                        c0479d.m1760d();
                                        composerImpl.m1588A0(objM1767k, i14, objM1761e);
                                    }
                                }
                                return C9072e.f47360a;
                            }
                        }, new InterfaceC2052l<InterfaceC5301c1<?>, C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$doCompose$2$3
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC5301c1<?> interfaceC5301c1) {
                                C5207g.m11111f(interfaceC5301c1, "it");
                                this.f2950b.f2935z++;
                                return C9072e.f47360a;
                            }
                        }, new InterfaceC2052l<InterfaceC5301c1<?>, C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$doCompose$2$4
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC5301c1<?> interfaceC5301c1) {
                                C5207g.m11111f(interfaceC5301c1, "it");
                                this.f2951b.f2935z--;
                                return C9072e.f47360a;
                            }
                        });
                        m1613U();
                        this.f2888C = false;
                        arrayList.clear();
                        C9072e c9072e = C9072e.f47360a;
                        Trace.endSection();
                        return;
                    } catch (Throwable th2) {
                        this.f2888C = false;
                        arrayList.clear();
                        m1587A();
                        throw th2;
                    }
                }
                Object obj = c5454b.f34006b[i11];
                C5207g.m11109d(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                C5455c c5455c = (C5455c) ((Object[]) c5454b.f34007c)[i11];
                C5332q0 c5332q0 = (C5332q0) obj;
                C5296b c5296b = c5332q0.f33604c;
                if (c5296b == null) {
                    Trace.endSection();
                    return;
                } else {
                    arrayList.add(new C5341v(c5332q0, c5296b.f33569a, c5455c));
                    i11++;
                }
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m1608P(int i10, int i11) {
        if (i10 > 0 && i10 != i11) {
            m1608P(this.f2889D.m1768l(i10), i11);
            if (this.f2889D.m1764h(i10)) {
                this.f2900O.m11407f(this.f2889D.m1765i(i10));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r23v0, types: [androidx.compose.runtime.ComposerImpl] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX INFO: renamed from: Q */
    public final void m1609Q(boolean z10) {
        ?? r10;
        HashSet hashSet;
        C0478c c0478c;
        ArrayList arrayList;
        LinkedHashSet linkedHashSet;
        int i10;
        int i11;
        if (this.f2897L) {
            C0480e c0480e = this.f2891F;
            int i12 = c0480e.f3184s;
            int i13 = c0480e.f3167b[c0480e.m1801n(i12) * 5];
            C0480e c0480e2 = this.f2891F;
            int iM1801n = c0480e2.m1801n(i12);
            int[] iArr = c0480e2.f3167b;
            int i14 = iM1801n * 5;
            int i15 = iArr[i14 + 1];
            Object obj = (536870912 & i15) != 0 ? c0480e2.f3168c[C0062b.m249B0(i15 >> 30) + iArr[i14 + 4]] : null;
            C0480e c0480e3 = this.f2891F;
            int iM1801n2 = c0480e3.m1801n(i12);
            m1588A0(obj, i13, C0062b.m408w(c0480e3.f3167b, iM1801n2) ? c0480e3.f3168c[c0480e3.m1791d(c0480e3.f3167b, iM1801n2)] : InterfaceC0476a.a.f3122a);
        } else {
            C0479d c0479d = this.f2889D;
            int i16 = c0479d.f3162i;
            int[] iArr2 = c0479d.f3155b;
            int i17 = iArr2[i16 * 5];
            Object objM1767k = c0479d.m1767k(iArr2, i16);
            C0479d c0479d2 = this.f2889D;
            m1588A0(objM1767k, i17, c0479d2.m1758b(c0479d2.f3155b, i16));
        }
        int i18 = this.f2921l;
        C0478c c0478c2 = this.f2918i;
        ArrayList arrayList2 = this.f2927r;
        if (c0478c2 != null) {
            List<C5345x> list = c0478c2.f3148a;
            if (list.size() > 0) {
                ArrayList arrayList3 = c0478c2.f3151d;
                C5207g.m11111f(arrayList3, "<this>");
                HashSet hashSet2 = new HashSet(arrayList3.size());
                int size = arrayList3.size();
                for (int i19 = 0; i19 < size; i19++) {
                    hashSet2.add(arrayList3.get(i19));
                }
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList3.size();
                int size3 = list.size();
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                while (i20 < size3) {
                    C5345x c5345x = list.get(i20);
                    boolean zContains = hashSet2.contains(c5345x);
                    int i23 = c0478c2.f3149b;
                    if (zContains) {
                        hashSet = hashSet2;
                        if (!linkedHashSet2.contains(c5345x)) {
                            if (i21 < size2) {
                                C5345x c5345x2 = (C5345x) arrayList3.get(i21);
                                HashMap<Integer, C5335s> map = c0478c2.f3152e;
                                if (c5345x2 != c5345x) {
                                    int iM1755a = c0478c2.m1755a(c5345x2);
                                    linkedHashSet2.add(c5345x2);
                                    if (iM1755a != i22) {
                                        c0478c = c0478c2;
                                        C5335s c5335s = map.get(Integer.valueOf(c5345x2.f33639c));
                                        int i24 = c5335s != null ? c5335s.f33613c : c5345x2.f33640d;
                                        arrayList = arrayList3;
                                        int i25 = iM1755a + i23;
                                        int i26 = i23 + i22;
                                        if (i24 > 0) {
                                            linkedHashSet = linkedHashSet2;
                                            int i27 = this.f2909X;
                                            if (i27 > 0) {
                                                i10 = size2;
                                                i11 = size3;
                                                if (this.f2907V == i25 - i27 && this.f2908W == i26 - i27) {
                                                    this.f2909X = i27 + i24;
                                                }
                                            } else {
                                                i10 = size2;
                                                i11 = size3;
                                            }
                                            m1623c0();
                                            this.f2907V = i25;
                                            this.f2908W = i26;
                                            this.f2909X = i24;
                                        } else {
                                            linkedHashSet = linkedHashSet2;
                                            i10 = size2;
                                            i11 = size3;
                                        }
                                        if (iM1755a > i22) {
                                            Collection<C5335s> collectionValues = map.values();
                                            C5207g.m11110e(collectionValues, "groupInfos.values");
                                            for (C5335s c5335s2 : collectionValues) {
                                                int i28 = c5335s2.f33612b;
                                                if (iM1755a <= i28 && i28 < iM1755a + i24) {
                                                    c5335s2.f33612b = (i28 - iM1755a) + i22;
                                                } else if (i22 <= i28 && i28 < iM1755a) {
                                                    c5335s2.f33612b = i28 + i24;
                                                }
                                            }
                                        } else if (i22 > iM1755a) {
                                            Collection<C5335s> collectionValues2 = map.values();
                                            C5207g.m11110e(collectionValues2, "groupInfos.values");
                                            for (C5335s c5335s3 : collectionValues2) {
                                                int i29 = c5335s3.f33612b;
                                                if (iM1755a <= i29 && i29 < iM1755a + i24) {
                                                    c5335s3.f33612b = (i29 - iM1755a) + i22;
                                                } else if (iM1755a + 1 <= i29 && i29 < i22) {
                                                    c5335s3.f33612b = i29 - i24;
                                                }
                                            }
                                        }
                                    } else {
                                        c0478c = c0478c2;
                                        arrayList = arrayList3;
                                        linkedHashSet = linkedHashSet2;
                                        i10 = size2;
                                        i11 = size3;
                                    }
                                } else {
                                    c0478c = c0478c2;
                                    arrayList = arrayList3;
                                    linkedHashSet = linkedHashSet2;
                                    i10 = size2;
                                    i11 = size3;
                                    i20++;
                                }
                                i21++;
                                C5207g.m11111f(c5345x2, "keyInfo");
                                C5335s c5335s4 = map.get(Integer.valueOf(c5345x2.f33639c));
                                i22 += c5335s4 != null ? c5335s4.f33613c : c5345x2.f33640d;
                                hashSet2 = hashSet;
                                c0478c2 = c0478c;
                                arrayList3 = arrayList;
                                linkedHashSet2 = linkedHashSet;
                                size2 = i10;
                                size3 = i11;
                            } else {
                                hashSet2 = hashSet;
                            }
                        }
                    } else {
                        m1637j0(c0478c2.m1755a(c5345x) + i23, c5345x.f33640d);
                        int i30 = c5345x.f33639c;
                        c0478c2.m1756b(i30, 0);
                        C0479d c0479d3 = this.f2889D;
                        hashSet = hashSet2;
                        this.f2901P = i30 - (c0479d3.f3160g - this.f2901P);
                        c0479d3.m1769m(i30);
                        m1586q0(this, this.f2889D.f3160g, false, 0);
                        m1623c0();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                        m1625d0(false);
                        m1641l0();
                        m1635i0(interfaceC2057q);
                        int i31 = this.f2901P;
                        C0479d c0479d4 = this.f2889D;
                        this.f2901P = C0062b.m404v(c0479d4.f3155b, c0479d4.f3160g) + i31;
                        this.f2889D.m1770n();
                        ComposerKt.m1685a(i30, this.f2889D.m1763g(i30) + i30, arrayList2);
                    }
                    i20++;
                    hashSet2 = hashSet;
                }
                m1623c0();
                if (list.size() > 0) {
                    C0479d c0479d5 = this.f2889D;
                    this.f2901P = c0479d5.f3161h - (c0479d5.f3160g - this.f2901P);
                    c0479d5.m1771o();
                }
            }
        }
        int i32 = this.f2919j;
        while (true) {
            C0479d c0479d6 = this.f2889D;
            if ((c0479d6.f3163j > 0) || c0479d6.f3160g == c0479d6.f3161h) {
                break;
            }
            int i33 = c0479d6.f3160g;
            m1586q0(this, i33, false, 0);
            m1623c0();
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
            m1625d0(false);
            m1641l0();
            m1635i0(interfaceC2057q2);
            int i34 = this.f2901P;
            C0479d c0479d7 = this.f2889D;
            this.f2901P = C0062b.m404v(c0479d7.f3155b, c0479d7.f3160g) + i34;
            m1637j0(i32, this.f2889D.m1770n());
            ComposerKt.m1685a(i33, this.f2889D.f3160g, arrayList2);
        }
        boolean z11 = this.f2897L;
        if (z11) {
            ArrayList arrayList4 = this.f2896K;
            if (z10) {
                arrayList4.add(this.f2905T.m11406e());
                i18 = 1;
            }
            C0479d c0479d8 = this.f2889D;
            int i35 = c0479d8.f3163j;
            if (!(i35 > 0)) {
                throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
            }
            c0479d8.f3163j = i35 - 1;
            C0480e c0480e4 = this.f2891F;
            int i36 = c0480e4.f3184s;
            c0480e4.m1796i();
            if (!(this.f2889D.f3163j > 0)) {
                int i37 = (-2) - i36;
                this.f2891F.m1797j();
                this.f2891F.m1793f();
                final C5296b c5296b = this.f2895J;
                if (arrayList4.isEmpty()) {
                    final C5342v0 c5342v0 = this.f2890E;
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$recordInsert$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // cm.InterfaceC2057q
                        /* JADX INFO: renamed from: M */
                        public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e5, InterfaceC5336s0 interfaceC5336s0) {
                            C0480e c0480e6 = c0480e5;
                            C5207g.m11111f(interfaceC5299c, "<anonymous parameter 0>");
                            C5207g.m11111f(c0480e6, "slots");
                            C5207g.m11111f(interfaceC5336s0, "<anonymous parameter 2>");
                            c0480e6.m1792e();
                            C5296b c5296b2 = c5296b;
                            c5296b2.getClass();
                            C5342v0 c5342v1 = c5342v0;
                            C5207g.m11111f(c5342v1, "slots");
                            c0480e6.m1807u(c5342v1, c5342v1.m11469f(c5296b2));
                            c0480e6.m1797j();
                            return C9072e.f47360a;
                        }
                    };
                    m1625d0(false);
                    m1641l0();
                    m1635i0(interfaceC2057q3);
                    r10 = 0;
                } else {
                    final ArrayList arrayListM13454v0 = C6752c.m13454v0(arrayList4);
                    arrayList4.clear();
                    m1627e0();
                    m1621b0();
                    final C5342v0 c5342v1 = this.f2890E;
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$recordInsert$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // cm.InterfaceC2057q
                        /* JADX INFO: renamed from: M */
                        public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e5, InterfaceC5336s0 interfaceC5336s0) {
                            InterfaceC5299c<?> interfaceC5299c2 = interfaceC5299c;
                            C0480e c0480e6 = c0480e5;
                            InterfaceC5336s0 interfaceC5336s1 = interfaceC5336s0;
                            C0141b.m619o(interfaceC5299c2, "applier", c0480e6, "slots", interfaceC5336s1, "rememberManager");
                            List<InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>> list2 = arrayListM13454v0;
                            C5342v0 c5342v2 = c5342v1;
                            C0480e c0480eM11472l = c5342v2.m11472l();
                            try {
                                int size4 = list2.size();
                                for (int i38 = 0; i38 < size4; i38++) {
                                    list2.get(i38).mo1343M(interfaceC5299c2, c0480eM11472l, interfaceC5336s1);
                                }
                                C9072e c9072e = C9072e.f47360a;
                                c0480eM11472l.m1793f();
                                c0480e6.m1792e();
                                C5296b c5296b2 = c5296b;
                                c5296b2.getClass();
                                c0480e6.m1807u(c5342v2, c5342v2.m11469f(c5296b2));
                                c0480e6.m1797j();
                                return C9072e.f47360a;
                            } catch (Throwable th2) {
                                c0480eM11472l.m1793f();
                                throw th2;
                            }
                        }
                    };
                    r10 = 0;
                    m1625d0(false);
                    m1641l0();
                    m1635i0(interfaceC2057q4);
                }
                this.f2897L = r10;
                if ((this.f2912c.f33625b == 0 ? 1 : r10) == 0) {
                    m1591C0(i37, r10);
                    m1593D0(i37, i18);
                }
            }
        } else {
            if (z10) {
                m1645n0();
            }
            int i38 = this.f2889D.f3162i;
            C5339u c5339u = this.f2904S;
            int i39 = c5339u.f33618a;
            if (!((i39 > 0 ? ((int[]) c5339u.f33619b)[i39 + (-1)] : -1) <= i38)) {
                ComposerKt.m1687c("Missed recording an endGroup".toString());
                throw null;
            }
            if ((i39 > 0 ? ((int[]) c5339u.f33619b)[i39 - 1] : -1) == i38) {
                c5339u.m11466c();
                m1643m0(false, ComposerKt.f3005c);
            }
            int i40 = this.f2889D.f3162i;
            if (i18 != m1599G0(i40)) {
                m1593D0(i40, i18);
            }
            if (z10) {
                i18 = 1;
            }
            this.f2889D.m1760d();
            m1623c0();
        }
        C0478c c0478c3 = (C0478c) this.f2917h.m11406e();
        if (c0478c3 != null && !z11) {
            c0478c3.f3150c++;
        }
        this.f2918i = c0478c3;
        this.f2919j = this.f2920k.m11466c() + i18;
        this.f2921l = this.f2922m.m11466c() + i18;
    }

    /* JADX INFO: renamed from: R */
    public final void m1610R() {
        m1609Q(false);
        C5332q0 c5332q0M1615W = m1615W();
        if (c5332q0M1615W != null) {
            int i10 = c5332q0M1615W.f33602a;
            if ((i10 & 1) != 0) {
                c5332q0M1615W.f33602a = i10 | 2;
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m1611S() {
        m1609Q(false);
        m1609Q(false);
        int iM11466c = this.f2932w.m11466c();
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        this.f2931v = iM11466c != 0;
        this.f2893H = null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX INFO: renamed from: T */
    public final C5332q0 m1612T() {
        C5296b c5296bM1757a;
        final InterfaceC2052l<InterfaceC5308f, C9072e> interfaceC2052l;
        boolean z10;
        C5288t c5288t = this.f2887B;
        boolean z11 = true;
        C5332q0 c5332q0 = null;
        final C5332q0 c5332q1 = ((ArrayList) c5288t.f33503b).isEmpty() ^ true ? (C5332q0) c5288t.m11406e() : null;
        if (c5332q1 != null) {
            c5332q1.f33602a &= -9;
        }
        if (c5332q1 != null) {
            final int i10 = this.f2886A;
            final C5453a c5453a = c5332q1.f33607f;
            if (c5453a == null) {
                interfaceC2052l = null;
            } else {
                if ((c5332q1.f33602a & 16) != 0) {
                    interfaceC2052l = null;
                } else {
                    int i11 = c5453a.f34002a;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= i11) {
                            z10 = false;
                            break;
                        }
                        C5207g.m11109d(c5453a.f34003b[i12], "null cannot be cast to non-null type kotlin.Any");
                        if (c5453a.f34004c[i12] != i10) {
                            z10 = true;
                            break;
                        }
                        i12++;
                    }
                    if (z10) {
                        interfaceC2052l = new InterfaceC2052l<InterfaceC5308f, C9072e>() { // from class: androidx.compose.runtime.RecomposeScopeImpl$end$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC5308f interfaceC5308f) {
                                C5454b c5454b;
                                InterfaceC5308f interfaceC5308f2 = interfaceC5308f;
                                C5207g.m11111f(interfaceC5308f2, "composition");
                                C5332q0 c5332q2 = c5332q1;
                                int i13 = c5332q2.f33606e;
                                int i14 = i10;
                                if (i13 == i14) {
                                    C5453a c5453a2 = c5332q2.f33607f;
                                    C5453a c5453a3 = c5453a;
                                    if (C5207g.m11106a(c5453a3, c5453a2) && (interfaceC5308f2 instanceof C0477b)) {
                                        int i15 = c5453a3.f34002a;
                                        int i16 = 0;
                                        for (int i17 = 0; i17 < i15; i17++) {
                                            Object obj = c5453a3.f34003b[i17];
                                            C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Any");
                                            int i18 = c5453a3.f34004c[i17];
                                            boolean z12 = i18 != i14;
                                            if (z12) {
                                                C0477b c0477b = (C0477b) interfaceC5308f2;
                                                C5456d<C5332q0> c5456d = c0477b.f3137g;
                                                c5456d.m11683e(obj, c5332q2);
                                                InterfaceC5323m<?> interfaceC5323m = obj instanceof InterfaceC5323m ? (InterfaceC5323m) obj : null;
                                                if (interfaceC5323m != null) {
                                                    if (!c5456d.m11681c(interfaceC5323m)) {
                                                        c0477b.f3139i.m11684f(interfaceC5323m);
                                                    }
                                                    C5454b c5454b2 = c5332q2.f33608g;
                                                    if (c5454b2 != null) {
                                                        int iM11674a = c5454b2.m11674a(interfaceC5323m);
                                                        if (iM11674a >= 0) {
                                                            Object[] objArr = (Object[]) c5454b2.f34007c;
                                                            Object obj2 = objArr[iM11674a];
                                                            int i19 = c5454b2.f34005a;
                                                            Object[] objArr2 = c5454b2.f34006b;
                                                            int i20 = iM11674a + 1;
                                                            C9322j.m17673a0(iM11674a, i20, i19, objArr2, objArr2);
                                                            C9322j.m17673a0(iM11674a, i20, i19, objArr, objArr);
                                                            int i21 = i19 - 1;
                                                            c5454b = null;
                                                            objArr2[i21] = null;
                                                            objArr[i21] = null;
                                                            c5454b2.f34005a = i21;
                                                        } else {
                                                            c5454b = null;
                                                        }
                                                        if (c5454b2.f34005a == 0) {
                                                            c5332q2.f33608g = c5454b;
                                                        }
                                                    }
                                                }
                                            }
                                            if (!z12) {
                                                if (i16 != i17) {
                                                    c5453a3.f34003b[i16] = obj;
                                                    c5453a3.f34004c[i16] = i18;
                                                }
                                                i16++;
                                            }
                                        }
                                        int i22 = c5453a3.f34002a;
                                        for (int i23 = i16; i23 < i22; i23++) {
                                            c5453a3.f34003b[i23] = null;
                                        }
                                        c5453a3.f34002a = i16;
                                        if (i16 == 0) {
                                            c5332q2.f33607f = null;
                                        }
                                    }
                                }
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l = null;
                    }
                }
            }
            if (interfaceC2052l != null) {
                m1635i0(new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$endRestartGroup$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // cm.InterfaceC2057q
                    /* JADX INFO: renamed from: M */
                    public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e, InterfaceC5336s0 interfaceC5336s0) {
                        C0141b.m619o(interfaceC5299c, "<anonymous parameter 0>", c0480e, "<anonymous parameter 1>", interfaceC5336s0, "<anonymous parameter 2>");
                        interfaceC2052l.mo528n(this.f2916g);
                        return C9072e.f47360a;
                    }
                });
            }
        }
        if (c5332q1 != null) {
            int i13 = c5332q1.f33602a;
            if (!((i13 & 16) != 0)) {
                if ((i13 & 1) == 0) {
                    z11 = false;
                }
                if (z11 || this.f2925p) {
                    if (c5332q1.f33604c == null) {
                        if (this.f2897L) {
                            C0480e c0480e = this.f2891F;
                            c5296bM1757a = c0480e.m1789b(c0480e.f3184s);
                        } else {
                            C0479d c0479d = this.f2889D;
                            c5296bM1757a = c0479d.m1757a(c0479d.f3162i);
                        }
                        c5332q1.f33604c = c5296bM1757a;
                    }
                    c5332q1.f33602a &= -5;
                    c5332q0 = c5332q1;
                }
            }
        }
        m1609Q(false);
        return c5332q0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: U */
    public final void m1613U() {
        m1609Q(false);
        this.f2911b.mo1671c();
        m1609Q(false);
        if (this.f2902Q) {
            m1643m0(false, ComposerKt.f3005c);
            this.f2902Q = false;
        }
        m1627e0();
        if (!((ArrayList) this.f2917h.f33503b).isEmpty()) {
            ComposerKt.m1687c("Start/end imbalance".toString());
            throw null;
        }
        if (!(this.f2904S.f33618a == 0)) {
            ComposerKt.m1687c("Missed recording an endGroup()".toString());
            throw null;
        }
        m1601I();
        this.f2889D.m1759c();
    }

    /* JADX INFO: renamed from: V */
    public final void m1614V(boolean z10, C0478c c0478c) {
        this.f2917h.m11407f(this.f2918i);
        this.f2918i = c0478c;
        this.f2920k.m11467d(this.f2919j);
        if (z10) {
            this.f2919j = 0;
        }
        this.f2922m.m11467d(this.f2921l);
        this.f2921l = 0;
    }

    /* JADX INFO: renamed from: W */
    public final C5332q0 m1615W() {
        if (this.f2935z == 0) {
            C5288t c5288t = this.f2887B;
            if (!((ArrayList) c5288t.f33503b).isEmpty()) {
                Object obj = c5288t.f33503b;
                return (C5332q0) ((ArrayList) obj).get(((ArrayList) obj).size() - 1);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0023  */
    /* JADX INFO: renamed from: X */
    public final boolean m1616X() {
        boolean z10;
        boolean z11 = true;
        if (!this.f2931v) {
            C5332q0 c5332q0M1615W = m1615W();
            if (c5332q0M1615W == null) {
                z10 = false;
            } else {
                if ((c5332q0M1615W.f33602a & 4) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                z11 = false;
            }
        }
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y */
    public final void m1617Y(ArrayList arrayList) {
        C5342v0 c5342v0;
        List<InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>> list;
        C5342v0 c5342v1;
        C5342v0 c5342v2 = this.f2912c;
        List<InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>> list2 = this.f2915f;
        List<InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>> list3 = this.f2914e;
        try {
            this.f2914e = list2;
            m1635i0(ComposerKt.f3007e);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Pair pair = (Pair) arrayList.get(i10);
                final C5309f0 c5309f0 = (C5309f0) pair.f38012a;
                final C5309f0 c5309f1 = (C5309f0) pair.f38013b;
                final C5296b c5296b = c5309f0.f33580e;
                C5342v0 c5342v3 = c5309f0.f33579d;
                int iM11469f = c5342v3.m11469f(c5296b);
                final Ref$IntRef ref$IntRef = new Ref$IntRef();
                m1627e0();
                m1635i0(new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // cm.InterfaceC2057q
                    /* JADX INFO: renamed from: M */
                    public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e, InterfaceC5336s0 interfaceC5336s0) {
                        int i11;
                        InterfaceC5299c<?> interfaceC5299c2 = interfaceC5299c;
                        C0480e c0480e2 = c0480e;
                        C0141b.m619o(interfaceC5299c2, "applier", c0480e2, "slots", interfaceC5336s0, "<anonymous parameter 2>");
                        int iM1790c = c0480e2.m1790c(c5296b);
                        ComposerKt.m1690f(c0480e2.f3183r < iM1790c);
                        ComposerImpl.m1585Z(c0480e2, interfaceC5299c2, iM1790c);
                        int i12 = c0480e2.f3183r;
                        int iM1812z = c0480e2.f3184s;
                        while (iM1812z >= 0 && !c0480e2.m1806s(iM1812z)) {
                            iM1812z = c0480e2.m1812z(iM1812z);
                        }
                        int iM1802o = iM1812z + 1;
                        int iM1779F = 0;
                        while (iM1802o < i12) {
                            if (c0480e2.m1803p(i12, iM1802o)) {
                                if (c0480e2.m1806s(iM1802o)) {
                                    iM1779F = 0;
                                }
                                iM1802o++;
                            } else {
                                iM1779F += c0480e2.m1806s(iM1802o) ? 1 : C0062b.m256D(c0480e2.f3167b, c0480e2.m1801n(iM1802o));
                                iM1802o += c0480e2.m1802o(iM1802o);
                            }
                        }
                        while (true) {
                            i11 = c0480e2.f3183r;
                            if (i11 >= iM1790c) {
                                break;
                            }
                            if (c0480e2.m1803p(iM1790c, i11)) {
                                int i13 = c0480e2.f3183r;
                                if (i13 < c0480e2.f3172g && C0062b.m416y(c0480e2.f3167b, c0480e2.m1801n(i13))) {
                                    interfaceC5299c2.mo11430b(c0480e2.m1811y(c0480e2.f3183r));
                                    iM1779F = 0;
                                }
                                c0480e2.m1782I();
                            } else {
                                iM1779F += c0480e2.m1779F();
                            }
                        }
                        ComposerKt.m1690f(i11 == iM1790c);
                        ref$IntRef.f38125a = iM1779F;
                        return C9072e.f47360a;
                    }
                });
                if (c5309f1 == null) {
                    if (C5207g.m11106a(c5342v3, this.f2890E)) {
                        ComposerKt.m1690f(this.f2891F.f3185t);
                        C5342v0 c5342v4 = new C5342v0();
                        this.f2890E = c5342v4;
                        C0480e c0480eM11472l = c5342v4.m11472l();
                        c0480eM11472l.m1793f();
                        this.f2891F = c0480eM11472l;
                    }
                    final C0479d c0479dM11471i = c5342v3.m11471i();
                    try {
                        c0479dM11471i.m1769m(iM11469f);
                        this.f2901P = iM11469f;
                        final ArrayList arrayList2 = new ArrayList();
                        m1631g0(null, null, null, EmptyList.f38032a, new InterfaceC2041a<C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final C9072e mo807E() {
                                List<InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>> list4 = arrayList2;
                                C0479d c0479d = c0479dM11471i;
                                C5309f0 c5309f2 = c5309f0;
                                ComposerImpl composerImpl = this.f2959b;
                                List<InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>> list5 = composerImpl.f2914e;
                                try {
                                    composerImpl.f2914e = list4;
                                    C0479d c0479d2 = composerImpl.f2889D;
                                    int[] iArr = composerImpl.f2923n;
                                    composerImpl.f2923n = null;
                                    try {
                                        composerImpl.f2889D = c0479d;
                                        ComposerImpl.m1584B(composerImpl, c5309f2.f33576a, c5309f2.f33582g, c5309f2.f33577b);
                                        C9072e c9072e = C9072e.f47360a;
                                        composerImpl.f2889D = c0479d2;
                                        composerImpl.f2923n = iArr;
                                        composerImpl.f2914e = list5;
                                        return C9072e.f47360a;
                                    } catch (Throwable th2) {
                                        composerImpl.f2889D = c0479d2;
                                        composerImpl.f2923n = iArr;
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    composerImpl.f2914e = list5;
                                    throw th3;
                                }
                            }
                        });
                        if (!arrayList2.isEmpty()) {
                            m1635i0(new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$2$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // cm.InterfaceC2057q
                                /* JADX INFO: renamed from: M */
                                public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e, InterfaceC5336s0 interfaceC5336s0) {
                                    InterfaceC5299c<?> c5316i0 = interfaceC5299c;
                                    C0480e c0480e2 = c0480e;
                                    InterfaceC5336s0 interfaceC5336s1 = interfaceC5336s0;
                                    C0141b.m619o(c5316i0, "applier", c0480e2, "slots", interfaceC5336s1, "rememberManager");
                                    int i11 = ref$IntRef.f38125a;
                                    if (i11 > 0) {
                                        c5316i0 = new C5316i0(c5316i0, i11);
                                    }
                                    List<InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>> list4 = arrayList2;
                                    int size2 = list4.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        list4.get(i12).mo1343M(c5316i0, c0480e2, interfaceC5336s1);
                                    }
                                    return C9072e.f47360a;
                                }
                            });
                        }
                        C9072e c9072e = C9072e.f47360a;
                        c0479dM11471i.m1759c();
                    } catch (Throwable th2) {
                        c0479dM11471i.m1759c();
                        throw th2;
                    }
                } else {
                    final C5306e0 c5306e0Mo1678j = this.f2911b.mo1678j(c5309f1);
                    if (c5306e0Mo1678j == null || (c5342v0 = c5306e0Mo1678j.f33574a) == null) {
                        c5342v0 = c5309f1.f33579d;
                    }
                    C5296b c5296bM11468a = (c5306e0Mo1678j == null || (c5342v1 = c5306e0Mo1678j.f33574a) == null) ? c5309f1.f33580e : c5342v1.m11468a();
                    final ArrayList arrayList3 = new ArrayList();
                    C0479d c0479dM11471i2 = c5342v0.m11471i();
                    try {
                        ComposerKt.m1686b(c0479dM11471i2, arrayList3, c5342v0.m11469f(c5296bM11468a));
                        C9072e c9072e2 = C9072e.f47360a;
                        c0479dM11471i2.m1759c();
                        if (!arrayList3.isEmpty()) {
                            m1635i0(new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // cm.InterfaceC2057q
                                /* JADX INFO: renamed from: M */
                                public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e, InterfaceC5336s0 interfaceC5336s0) {
                                    InterfaceC5299c<?> interfaceC5299c2 = interfaceC5299c;
                                    C0141b.m619o(interfaceC5299c2, "applier", c0480e, "<anonymous parameter 1>", interfaceC5336s0, "<anonymous parameter 2>");
                                    int i11 = ref$IntRef.f38125a;
                                    List<Object> list4 = arrayList3;
                                    int size2 = list4.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        Object obj = list4.get(i12);
                                        int i13 = i11 + i12;
                                        interfaceC5299c2.mo11443a(i13, obj);
                                        interfaceC5299c2.mo11446f(i13, obj);
                                    }
                                    return C9072e.f47360a;
                                }
                            });
                            if (C5207g.m11106a(c5342v3, c5342v2)) {
                                int iM11469f2 = c5342v2.m11469f(c5296b);
                                m1591C0(iM11469f2, m1599G0(iM11469f2) + arrayList3.size());
                            }
                        }
                        m1635i0(new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // cm.InterfaceC2057q
                            /* JADX INFO: renamed from: M */
                            public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e, InterfaceC5336s0 interfaceC5336s0) {
                                C0480e c0480e2 = c0480e;
                                C0141b.m619o(interfaceC5299c, "<anonymous parameter 0>", c0480e2, "slots", interfaceC5336s0, "<anonymous parameter 2>");
                                C5306e0 c5306e0Mo1678j2 = c5306e0Mo1678j;
                                if (c5306e0Mo1678j2 == null && (c5306e0Mo1678j2 = this.f2911b.mo1678j(c5309f1)) == null) {
                                    ComposerKt.m1687c("Could not resolve state for movable content");
                                    throw null;
                                }
                                C5342v0 c5342v5 = c5306e0Mo1678j2.f33574a;
                                C5207g.m11111f(c5342v5, "table");
                                ComposerKt.m1690f(c0480e2.f3178m <= 0 && c0480e2.m1802o(c0480e2.f3183r + 1) == 1);
                                int i11 = c0480e2.f3183r;
                                int i12 = c0480e2.f3173h;
                                int i13 = c0480e2.f3174i;
                                c0480e2.m1788a(1);
                                c0480e2.m1782I();
                                c0480e2.m1792e();
                                C0480e c0480eM11472l2 = c5342v5.m11472l();
                                try {
                                    List listM1813a = C0480e.a.m1813a(c0480eM11472l2, 2, c0480e2, false, true);
                                    c0480eM11472l2.m1793f();
                                    c0480e2.m1797j();
                                    c0480e2.m1796i();
                                    c0480e2.f3183r = i11;
                                    c0480e2.f3173h = i12;
                                    c0480e2.f3174i = i13;
                                    if (!listM1813a.isEmpty()) {
                                        InterfaceC5321l interfaceC5321l = c5309f0.f33578c;
                                        C5207g.m11109d(interfaceC5321l, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
                                        C0477b c0477b = (C0477b) interfaceC5321l;
                                        int size2 = listM1813a.size();
                                        for (int i14 = 0; i14 < size2; i14++) {
                                            C5296b c5296b2 = (C5296b) listM1813a.get(i14);
                                            C5207g.m11111f(c5296b2, "anchor");
                                            int iM1790c = c0480e2.m1790c(c5296b2);
                                            int iM1781H = c0480e2.m1781H(c0480e2.f3167b, c0480e2.m1801n(iM1790c));
                                            int i15 = 0 + iM1781H;
                                            Object obj = !(iM1781H <= i15 && i15 < c0480e2.m1794g(c0480e2.f3167b, c0480e2.m1801n(iM1790c + 1))) ? InterfaceC0476a.a.f3122a : c0480e2.f3168c[c0480e2.m1795h(i15)];
                                            C5332q0 c5332q0 = obj instanceof C5332q0 ? (C5332q0) obj : null;
                                            if (c5332q0 != null) {
                                                c5332q0.f33603b = c0477b;
                                            }
                                        }
                                    }
                                    return C9072e.f47360a;
                                } catch (Throwable th3) {
                                    c0480eM11472l2.m1793f();
                                    throw th3;
                                }
                            }
                        });
                        C0479d c0479dM11471i3 = c5342v0.m11471i();
                        try {
                            C0479d c0479d = this.f2889D;
                            int[] iArr = this.f2923n;
                            this.f2923n = null;
                            try {
                                this.f2889D = c0479dM11471i3;
                                int iM11469f3 = c5342v0.m11469f(c5296bM11468a);
                                c0479dM11471i3.m1769m(iM11469f3);
                                this.f2901P = iM11469f3;
                                final ArrayList arrayList4 = new ArrayList();
                                List<InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>> list4 = this.f2914e;
                                try {
                                    this.f2914e = arrayList4;
                                    list = list4;
                                    try {
                                        m1631g0(c5309f1.f33578c, c5309f0.f33578c, Integer.valueOf(c0479dM11471i3.f3160g), c5309f1.f33581f, new InterfaceC2041a<C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$5$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // cm.InterfaceC2041a
                                            /* JADX INFO: renamed from: E */
                                            public final C9072e mo807E() {
                                                C5309f0 c5309f2 = c5309f0;
                                                ComposerImpl.m1584B(this.f2971b, c5309f2.f33576a, c5309f2.f33582g, c5309f2.f33577b);
                                                return C9072e.f47360a;
                                            }
                                        });
                                        this.f2914e = list;
                                        if (!arrayList4.isEmpty()) {
                                            m1635i0(new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$5$1$2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // cm.InterfaceC2057q
                                                /* JADX INFO: renamed from: M */
                                                public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e, InterfaceC5336s0 interfaceC5336s0) {
                                                    InterfaceC5299c<?> c5316i0 = interfaceC5299c;
                                                    C0480e c0480e2 = c0480e;
                                                    InterfaceC5336s0 interfaceC5336s1 = interfaceC5336s0;
                                                    C0141b.m619o(c5316i0, "applier", c0480e2, "slots", interfaceC5336s1, "rememberManager");
                                                    int i11 = ref$IntRef.f38125a;
                                                    if (i11 > 0) {
                                                        c5316i0 = new C5316i0(c5316i0, i11);
                                                    }
                                                    List<InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>> list5 = arrayList4;
                                                    int size2 = list5.size();
                                                    for (int i12 = 0; i12 < size2; i12++) {
                                                        list5.get(i12).mo1343M(c5316i0, c0480e2, interfaceC5336s1);
                                                    }
                                                    return C9072e.f47360a;
                                                }
                                            });
                                        }
                                        this.f2889D = c0479d;
                                        this.f2923n = iArr;
                                        c0479dM11471i3.m1759c();
                                    } catch (Throwable th3) {
                                        th = th3;
                                        this.f2914e = list;
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    list = list4;
                                }
                            } catch (Throwable th5) {
                                this.f2889D = c0479d;
                                this.f2923n = iArr;
                                throw th5;
                            }
                        } catch (Throwable th6) {
                            c0479dM11471i3.m1759c();
                            throw th6;
                        }
                    } catch (Throwable th7) {
                        c0479dM11471i2.m1759c();
                        throw th7;
                    }
                }
                m1635i0(ComposerKt.f3004b);
                i10++;
                size = size;
                c5342v2 = c5342v2;
            }
            m1635i0(new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$2
                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e, InterfaceC5336s0 interfaceC5336s0) {
                    InterfaceC5299c<?> interfaceC5299c2 = interfaceC5299c;
                    C0480e c0480e2 = c0480e;
                    C5207g.m11111f(interfaceC5299c2, "applier");
                    C5207g.m11111f(c0480e2, "slots");
                    C5207g.m11111f(interfaceC5336s0, "<anonymous parameter 2>");
                    ComposerImpl.m1585Z(c0480e2, interfaceC5299c2, 0);
                    c0480e2.m1796i();
                    return C9072e.f47360a;
                }
            });
            this.f2901P = 0;
            C9072e c9072e3 = C9072e.f47360a;
            this.f2914e = list3;
        } catch (Throwable th8) {
            this.f2914e = list3;
            throw th8;
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0476a
    /* JADX INFO: renamed from: a */
    public final void mo1618a() {
        this.f2925p = true;
    }

    /* JADX INFO: renamed from: a0 */
    public final Object m1619a0() {
        Object obj;
        int i10;
        boolean z10 = this.f2897L;
        InterfaceC0476a.a.C10586a c10586a = InterfaceC0476a.a.f3122a;
        if (z10) {
            if (!this.f2926q) {
                return c10586a;
            }
            ComposerKt.m1687c("A call to createNode(), emitNode() or useNode() expected".toString());
            throw null;
        }
        C0479d c0479d = this.f2889D;
        if (c0479d.f3163j > 0 || (i10 = c0479d.f3164k) >= c0479d.f3165l) {
            obj = c10586a;
        } else {
            c0479d.f3164k = i10 + 1;
            obj = c0479d.f3157d[i10];
        }
        return this.f2933x ? c10586a : obj;
    }

    @Override // androidx.compose.runtime.InterfaceC0476a
    /* JADX INFO: renamed from: b */
    public final C5332q0 mo1620b() {
        return m1615W();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m1621b0() {
        C5288t c5288t = this.f2900O;
        if (!((ArrayList) c5288t.f33503b).isEmpty()) {
            int size = ((ArrayList) c5288t.f33503b).size();
            final Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = ((ArrayList) c5288t.f33503b).get(i10);
            }
            m1635i0(new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$realizeDowns$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e, InterfaceC5336s0 interfaceC5336s0) {
                    InterfaceC5299c<?> interfaceC5299c2 = interfaceC5299c;
                    C0141b.m619o(interfaceC5299c2, "applier", c0480e, "<anonymous parameter 1>", interfaceC5336s0, "<anonymous parameter 2>");
                    for (Object obj : objArr) {
                        interfaceC5299c2.mo11430b(obj);
                    }
                    return C9072e.f47360a;
                }
            });
            ((ArrayList) c5288t.f33503b).clear();
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0476a
    /* JADX INFO: renamed from: c */
    public final void mo1622c(int i10) {
        m1652r0(i10, 0, null, null);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m1623c0() {
        final int i10 = this.f2909X;
        this.f2909X = 0;
        if (i10 > 0) {
            final int i11 = this.f2906U;
            if (i11 >= 0) {
                this.f2906U = -1;
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$realizeMovement$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // cm.InterfaceC2057q
                    /* JADX INFO: renamed from: M */
                    public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e, InterfaceC5336s0 interfaceC5336s0) {
                        InterfaceC5299c<?> interfaceC5299c2 = interfaceC5299c;
                        C0141b.m619o(interfaceC5299c2, "applier", c0480e, "<anonymous parameter 1>", interfaceC5336s0, "<anonymous parameter 2>");
                        interfaceC5299c2.mo11445d(i11, i10);
                        return C9072e.f47360a;
                    }
                };
                m1627e0();
                m1621b0();
                m1635i0(interfaceC2057q);
                return;
            }
            final int i12 = this.f2907V;
            this.f2907V = -1;
            final int i13 = this.f2908W;
            this.f2908W = -1;
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$realizeMovement$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e, InterfaceC5336s0 interfaceC5336s0) {
                    InterfaceC5299c<?> interfaceC5299c2 = interfaceC5299c;
                    C0141b.m619o(interfaceC5299c2, "applier", c0480e, "<anonymous parameter 1>", interfaceC5336s0, "<anonymous parameter 2>");
                    interfaceC5299c2.mo11444c(i12, i13, i10);
                    return C9072e.f47360a;
                }
            };
            m1627e0();
            m1621b0();
            m1635i0(interfaceC2057q2);
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0476a
    /* JADX INFO: renamed from: d */
    public final Object mo1624d() {
        return m1619a0();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m1625d0(boolean z10) {
        int i10 = z10 ? this.f2889D.f3162i : this.f2889D.f3160g;
        final int i11 = i10 - this.f2901P;
        if (!(i11 >= 0)) {
            ComposerKt.m1687c("Tried to seek backward".toString());
            throw null;
        }
        if (i11 > 0) {
            m1635i0(new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$realizeOperationLocation$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e, InterfaceC5336s0 interfaceC5336s0) {
                    C0480e c0480e2 = c0480e;
                    C0141b.m619o(interfaceC5299c, "<anonymous parameter 0>", c0480e2, "slots", interfaceC5336s0, "<anonymous parameter 2>");
                    c0480e2.m1788a(i11);
                    return C9072e.f47360a;
                }
            });
            this.f2901P = i10;
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0476a
    /* JADX INFO: renamed from: e */
    public final void mo1626e() {
        this.f2933x = this.f2934y >= 0;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m1627e0() {
        final int i10 = this.f2899N;
        if (i10 > 0) {
            this.f2899N = 0;
            m1635i0(new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$realizeUps$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e, InterfaceC5336s0 interfaceC5336s0) {
                    InterfaceC5299c<?> interfaceC5299c2 = interfaceC5299c;
                    C0141b.m619o(interfaceC5299c2, "applier", c0480e, "<anonymous parameter 1>", interfaceC5336s0, "<anonymous parameter 2>");
                    for (int i11 = 0; i11 < i10; i11++) {
                        interfaceC5299c2.mo11431e();
                    }
                    return C9072e.f47360a;
                }
            });
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0476a
    /* JADX INFO: renamed from: f */
    public final C5342v0 mo1628f() {
        return this.f2912c;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f0 */
    public final boolean m1629f0(C5454b c5454b) {
        C5207g.m11111f(c5454b, "invalidationsRequested");
        if (!this.f2914e.isEmpty()) {
            ComposerKt.m1687c("Expected applyChanges() to have been called".toString());
            throw null;
        }
        if (!(c5454b.f34005a > 0) && !(!this.f2927r.isEmpty())) {
            return false;
        }
        m1607O(c5454b, null);
        return !this.f2914e.isEmpty();
    }

    @Override // androidx.compose.runtime.InterfaceC0476a
    /* JADX INFO: renamed from: g */
    public final <V, T> void mo1630g(final V v10, final InterfaceC2056p<? super T, ? super V, C9072e> interfaceC2056p) {
        C5207g.m11111f(interfaceC2056p, "block");
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$apply$operation$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v7 boolean
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
                */
            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final sl.C9072e mo1343M(p081e0.InterfaceC5299c<?> r5, androidx.compose.runtime.C0480e r6, p081e0.InterfaceC5336s0 r7) {
                /*
                    r4 = this;
                    r1 = r4
                    e0.c r5 = (p081e0.InterfaceC5299c) r5
                    r3 = 2
                    androidx.compose.runtime.e r6 = (androidx.compose.runtime.C0480e) r6
                    e0.s0 r7 = (p081e0.InterfaceC5336s0) r7
                    java.lang.String r0 = "applier"
                    r3 = 1
                    dm.C5207g.m11111f(r5, r0)
                    r3 = 1
                    java.lang.String r0 = "<anonymous parameter 1>"
                    r3 = 5
                    dm.C5207g.m11111f(r6, r0)
                    r3 = 7
                    java.lang.String r3 = "<anonymous parameter 2>"
                    r6 = r3
                    dm.C5207g.m11111f(r7, r6)
                    java.lang.Object r3 = r5.mo11432h()
                    r5 = r3
                    V r6 = r5
                    r3 = 4
                    cm.p<T, V, sl.e> r7 = r6
                    r7.mo1337m0(r5, r6)
                    sl.e r5 = sl.C9072e.f47360a
                    r3 = 4
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl$apply$operation$1.mo1343M(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        };
        if (this.f2897L) {
            this.f2896K.add(interfaceC2057q);
            return;
        }
        m1627e0();
        m1621b0();
        m1635i0(interfaceC2057q);
    }

    /* JADX INFO: renamed from: g0 */
    public final <R> R m1631g0(InterfaceC5321l interfaceC5321l, InterfaceC5321l interfaceC5321l2, Integer num, List<Pair<C5332q0, C5455c<Object>>> list, InterfaceC2041a<? extends R> interfaceC2041a) {
        R rMo807E;
        boolean z10 = this.f2903R;
        boolean z11 = this.f2888C;
        int i10 = this.f2919j;
        try {
            this.f2903R = false;
            this.f2888C = true;
            this.f2919j = 0;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Pair<C5332q0, C5455c<Object>> pair = list.get(i11);
                C5332q0 c5332q0 = pair.f38012a;
                C5455c<Object> c5455c = pair.f38013b;
                if (c5455c != null) {
                    int i12 = c5455c.f34008a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        m1666y0(c5332q0, c5455c.get(i13));
                    }
                } else {
                    m1666y0(c5332q0, null);
                }
            }
            if (interfaceC5321l != null) {
                rMo807E = (R) interfaceC5321l.mo1733m(interfaceC5321l2, num != null ? num.intValue() : -1, interfaceC2041a);
                if (rMo807E == null) {
                }
                return rMo807E;
            }
            rMo807E = interfaceC2041a.mo807E();
            return rMo807E;
        } finally {
            this.f2903R = z10;
            this.f2888C = z11;
            this.f2919j = i10;
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0476a
    /* JADX INFO: renamed from: h */
    public final boolean mo1632h() {
        return this.f2897L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    /* JADX WARN: Code duplicated, block: B:112:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:139:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ab A[LOOP:5: B:31:0x006e->B:48:0x00ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e9  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:66:0x00f5
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: h0 */
    public final void m1633h0() {
        /*
            Method dump skipped, instruction units count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.m1633h0():void");
    }

    @Override // androidx.compose.runtime.InterfaceC0476a
    /* JADX INFO: renamed from: i */
    public final <T> void mo1634i(final InterfaceC2041a<? extends T> interfaceC2041a) {
        C5207g.m11111f(interfaceC2041a, "factory");
        if (!this.f2926q) {
            ComposerKt.m1687c("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw null;
        }
        this.f2926q = false;
        if (!this.f2897L) {
            ComposerKt.m1687c("createNode() can only be called when inserting".toString());
            throw null;
        }
        C5339u c5339u = this.f2920k;
        final int i10 = ((int[]) c5339u.f33619b)[c5339u.f33618a - 1];
        C0480e c0480e = this.f2891F;
        final C5296b c5296bM1789b = c0480e.m1789b(c0480e.f3184s);
        this.f2921l++;
        this.f2896K.add(new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$createNode$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e2, InterfaceC5336s0 interfaceC5336s0) {
                InterfaceC5299c<?> interfaceC5299c2 = interfaceC5299c;
                C0480e c0480e3 = c0480e2;
                C0141b.m619o(interfaceC5299c2, "applier", c0480e3, "slots", interfaceC5336s0, "<anonymous parameter 2>");
                Object objMo807E = interfaceC2041a.mo807E();
                C5296b c5296b = c5296bM1789b;
                C5207g.m11111f(c5296b, "anchor");
                c0480e3.m1787N(c0480e3.m1790c(c5296b), objMo807E);
                interfaceC5299c2.mo11446f(i10, objMo807E);
                interfaceC5299c2.mo11430b(objMo807E);
                return C9072e.f47360a;
            }
        });
        this.f2905T.m11407f(new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$createNode$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e2, InterfaceC5336s0 interfaceC5336s0) {
                InterfaceC5299c<?> interfaceC5299c2 = interfaceC5299c;
                C0480e c0480e3 = c0480e2;
                C0141b.m619o(interfaceC5299c2, "applier", c0480e3, "slots", interfaceC5336s0, "<anonymous parameter 2>");
                C5296b c5296b = c5296bM1789b;
                C5207g.m11111f(c5296b, "anchor");
                Object objM1811y = c0480e3.m1811y(c0480e3.m1790c(c5296b));
                interfaceC5299c2.mo11431e();
                interfaceC5299c2.mo11443a(i10, objM1811y);
                return C9072e.f47360a;
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public final void m1635i0(InterfaceC2057q<? super InterfaceC5299c<?>, ? super C0480e, ? super InterfaceC5336s0, C9072e> interfaceC2057q) {
        this.f2914e.add(interfaceC2057q);
    }

    @Override // androidx.compose.runtime.InterfaceC0476a
    /* JADX INFO: renamed from: j */
    public final ComposerImpl mo1636j(int i10) {
        Object obj;
        C5332q0 c5332q0;
        int i11;
        boolean z10 = false;
        m1652r0(i10, 0, null, null);
        boolean z11 = this.f2897L;
        C5288t c5288t = this.f2887B;
        InterfaceC5321l interfaceC5321l = this.f2916g;
        if (z11) {
            C5207g.m11109d(interfaceC5321l, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            C5332q0 c5332q1 = new C5332q0((C0477b) interfaceC5321l);
            c5288t.m11407f(c5332q1);
            m1597F0(c5332q1);
            c5332q1.f33606e = this.f2886A;
            c5332q1.f33602a &= -17;
        } else {
            ArrayList arrayList = this.f2927r;
            int iM1688d = ComposerKt.m1688d(this.f2889D.f3162i, arrayList);
            C5341v c5341v = iM1688d >= 0 ? (C5341v) arrayList.remove(iM1688d) : null;
            C0479d c0479d = this.f2889D;
            int i12 = c0479d.f3163j;
            InterfaceC0476a.a.C10586a c10586a = InterfaceC0476a.a.f3122a;
            if (i12 > 0 || (i11 = c0479d.f3164k) >= c0479d.f3165l) {
                obj = c10586a;
            } else {
                c0479d.f3164k = i11 + 1;
                obj = c0479d.f3157d[i11];
            }
            if (C5207g.m11106a(obj, c10586a)) {
                C5207g.m11109d(interfaceC5321l, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
                c5332q0 = new C5332q0((C0477b) interfaceC5321l);
                m1597F0(c5332q0);
            } else {
                C5207g.m11109d(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                c5332q0 = (C5332q0) obj;
            }
            if (c5341v != null) {
                z10 = true;
            }
            if (z10) {
                c5332q0.f33602a |= 8;
            } else {
                c5332q0.f33602a &= -9;
            }
            c5288t.m11407f(c5332q0);
            c5332q0.f33606e = this.f2886A;
            c5332q0.f33602a &= -17;
        }
        return this;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m1637j0(int i10, int i11) {
        if (i11 > 0) {
            if (!(i10 >= 0)) {
                ComposerKt.m1687c(("Invalid remove index " + i10).toString());
                throw null;
            }
            if (this.f2906U == i10) {
                this.f2909X += i11;
                return;
            }
            m1623c0();
            this.f2906U = i10;
            this.f2909X = i11;
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0476a
    /* JADX INFO: renamed from: k */
    public final void mo1638k(int i10, Object obj) {
        m1652r0(i10, 0, obj, null);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m1639k0(final InterfaceC2041a<C9072e> interfaceC2041a) {
        m1635i0(new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$recordSideEffect$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e, InterfaceC5336s0 interfaceC5336s0) {
                InterfaceC5336s0 interfaceC5336s1 = interfaceC5336s0;
                C0141b.m619o(interfaceC5299c, "<anonymous parameter 0>", c0480e, "<anonymous parameter 1>", interfaceC5336s1, "rememberManager");
                interfaceC5336s1.mo1748b(interfaceC2041a);
                return C9072e.f47360a;
            }
        });
    }

    @Override // androidx.compose.runtime.InterfaceC0476a
    /* JADX INFO: renamed from: l */
    public final void mo1640l() {
        m1652r0(125, 2, null, null);
        this.f2926q = true;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m1641l0() {
        C0479d c0479d = this.f2889D;
        if (c0479d.f3156c > 0) {
            int i10 = c0479d.f3162i;
            C5339u c5339u = this.f2904S;
            int i11 = c5339u.f33618a;
            if ((i11 > 0 ? ((int[]) c5339u.f33619b)[i11 - 1] : -2) != i10) {
                if (!this.f2902Q && this.f2903R) {
                    m1643m0(false, ComposerKt.f3006d);
                    this.f2902Q = true;
                }
                if (i10 > 0) {
                    final C5296b c5296bM1757a = c0479d.m1757a(i10);
                    c5339u.m11467d(i10);
                    m1643m0(false, new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$recordSlotEditing$1
                        {
                            super(3);
                        }

                        @Override // cm.InterfaceC2057q
                        /* JADX INFO: renamed from: M */
                        public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e, InterfaceC5336s0 interfaceC5336s0) {
                            C0480e c0480e2 = c0480e;
                            C0141b.m619o(interfaceC5299c, "<anonymous parameter 0>", c0480e2, "slots", interfaceC5336s0, "<anonymous parameter 2>");
                            C5296b c5296b = c5296bM1757a;
                            C5207g.m11111f(c5296b, "anchor");
                            c0480e2.m1798k(c0480e2.m1790c(c5296b));
                            return C9072e.f47360a;
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    @Override // androidx.compose.runtime.InterfaceC0476a
    /* JADX INFO: renamed from: m */
    public final boolean mo1642m() {
        boolean z10;
        boolean z11 = false;
        if (!this.f2897L && !this.f2933x && !this.f2931v) {
            C5332q0 c5332q0M1615W = m1615W();
            if (c5332q0M1615W == null) {
                z10 = false;
            } else {
                if ((c5332q0M1615W.f33602a & 8) != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
            if (z10) {
                z11 = true;
            }
        }
        return z11;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m1643m0(boolean z10, InterfaceC2057q<? super InterfaceC5299c<?>, ? super C0480e, ? super InterfaceC5336s0, C9072e> interfaceC2057q) {
        m1625d0(z10);
        m1635i0(interfaceC2057q);
    }

    @Override // androidx.compose.runtime.InterfaceC0476a
    /* JADX INFO: renamed from: n */
    public final void mo1644n() {
        this.f2933x = false;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m1645n0() {
        C5288t c5288t = this.f2900O;
        if (!((ArrayList) c5288t.f33503b).isEmpty()) {
            c5288t.m11406e();
        } else {
            this.f2899N++;
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0476a
    /* JADX INFO: renamed from: o */
    public final InterfaceC5299c<?> mo1646o() {
        return this.f2910a;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m1647o0(int i10, int i11, int i12) {
        C0479d c0479d = this.f2889D;
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        if (i10 == i11) {
            i12 = i10;
        } else if (i10 != i12 && i11 != i12) {
            if (c0479d.m1768l(i10) == i11) {
                i12 = i11;
            } else if (c0479d.m1768l(i11) == i10) {
                i12 = i10;
            } else if (c0479d.m1768l(i10) == c0479d.m1768l(i11)) {
                i12 = c0479d.m1768l(i10);
            } else {
                int iM1768l = i10;
                int i13 = 0;
                while (iM1768l > 0 && iM1768l != i12) {
                    iM1768l = c0479d.m1768l(iM1768l);
                    i13++;
                }
                int iM1768l2 = i11;
                int i14 = 0;
                while (iM1768l2 > 0 && iM1768l2 != i12) {
                    iM1768l2 = c0479d.m1768l(iM1768l2);
                    i14++;
                }
                int i15 = i13 - i14;
                int iM1768l3 = i10;
                for (int i16 = 0; i16 < i15; i16++) {
                    iM1768l3 = c0479d.m1768l(iM1768l3);
                }
                int i17 = i14 - i13;
                int iM1768l4 = i11;
                for (int i18 = 0; i18 < i17; i18++) {
                    iM1768l4 = c0479d.m1768l(iM1768l4);
                }
                while (iM1768l3 != iM1768l4) {
                    iM1768l3 = c0479d.m1768l(iM1768l3);
                    iM1768l4 = c0479d.m1768l(iM1768l4);
                }
                i12 = iM1768l3;
            }
        }
        while (i10 > 0 && i10 != i12) {
            if (c0479d.m1764h(i10)) {
                m1645n0();
            }
            i10 = c0479d.m1768l(i10);
        }
        m1608P(i11, i12);
    }

    @Override // androidx.compose.runtime.InterfaceC0476a
    /* JADX INFO: renamed from: p */
    public final Object mo1648p(AbstractC5326n0 abstractC5326n0) {
        C5207g.m11111f(abstractC5326n0, "key");
        InterfaceC5634d<AbstractC5317j<Object>, InterfaceC5301c1<Object>> interfaceC5634dM1604L = m1604L();
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        C5207g.m11111f(interfaceC5634dM1604L, "<this>");
        if (!interfaceC5634dM1604L.containsKey(abstractC5326n0)) {
            return abstractC5326n0.f33590a.getValue();
        }
        InterfaceC5301c1<Object> interfaceC5301c1 = interfaceC5634dM1604L.get(abstractC5326n0);
        if (interfaceC5301c1 != null) {
            return interfaceC5301c1.getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m1649p0() {
        C5342v0 c5342v0 = this.f2912c;
        if (c5342v0.f33625b > 0 && C0062b.m400u(c5342v0.f33624a, 0)) {
            ArrayList arrayList = new ArrayList();
            this.f2894I = arrayList;
            C0479d c0479dM11471i = c5342v0.m11471i();
            try {
                this.f2889D = c0479dM11471i;
                List<InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>> list = this.f2914e;
                try {
                    this.f2914e = arrayList;
                    m1586q0(this, 0, false, 0);
                    m1623c0();
                    m1627e0();
                    if (this.f2902Q) {
                        m1635i0(ComposerKt.f3004b);
                        if (this.f2902Q) {
                            m1643m0(false, ComposerKt.f3005c);
                            this.f2902Q = false;
                        }
                    }
                    C9072e c9072e = C9072e.f47360a;
                    this.f2914e = list;
                    c0479dM11471i.m1759c();
                } catch (Throwable th2) {
                    this.f2914e = list;
                    throw th2;
                }
            } catch (Throwable th3) {
                c0479dM11471i.m1759c();
                throw th3;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.compose.runtime.InterfaceC0476a
    /* JADX INFO: renamed from: q */
    public final void mo1650q() {
        int iM256D = 0;
        if (!(this.f2921l == 0)) {
            ComposerKt.m1687c("No nodes can be emitted before calling skipAndEndGroup".toString());
            throw null;
        }
        C5332q0 c5332q0M1615W = m1615W();
        if (c5332q0M1615W != null) {
            c5332q0M1615W.f33602a |= 16;
        }
        if (!this.f2927r.isEmpty()) {
            m1633h0();
            return;
        }
        C0479d c0479d = this.f2889D;
        int i10 = c0479d.f3162i;
        if (i10 >= 0) {
            iM256D = C0062b.m256D(c0479d.f3155b, i10);
        }
        this.f2921l = iM256D;
        this.f2889D.m1771o();
    }

    @Override // androidx.compose.runtime.InterfaceC0476a
    /* JADX INFO: renamed from: r */
    public final CoroutineContext mo1651r() {
        return this.f2911b.mo1675g();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d4  */
    /* JADX INFO: renamed from: r0 */
    public final void m1652r0(int i10, int i11, Object obj, Object obj2) {
        C0478c c0478c;
        Object objM13424R;
        C0479d c0479d;
        ArrayList arrayList;
        int i12;
        int[] iArr;
        int iM256D;
        Object obj3 = obj;
        if (!(!this.f2926q)) {
            ComposerKt.m1687c("A call to createNode(), emitNode() or useNode() expected".toString());
            throw null;
        }
        m1668z0(obj3, i10, obj2);
        boolean z10 = i11 != 0;
        boolean z11 = this.f2897L;
        InterfaceC0476a.a.C10586a c10586a = InterfaceC0476a.a.f3122a;
        if (z11) {
            this.f2889D.f3163j++;
            C0480e c0480e = this.f2891F;
            int i13 = c0480e.f3183r;
            if (z10) {
                c0480e.m1783J(i10, c10586a, c10586a, true);
            } else if (obj2 != null) {
                if (obj3 == null) {
                    obj3 = c10586a;
                }
                c0480e.m1783J(i10, obj3, obj2, false);
            } else {
                if (obj3 == null) {
                    obj3 = c10586a;
                }
                c0480e.m1783J(i10, obj3, c10586a, false);
            }
            C0478c c0478c2 = this.f2918i;
            if (c0478c2 != null) {
                int i14 = (-2) - i13;
                C5345x c5345x = new C5345x(i10, i14, -1, -1);
                c0478c2.f3152e.put(Integer.valueOf(i14), new C5335s(-1, this.f2919j - c0478c2.f3149b, 0));
                c0478c2.f3151d.add(c5345x);
            }
            m1614V(z10, null);
            return;
        }
        boolean z12 = !(i11 != 1) && this.f2933x;
        if (this.f2918i == null) {
            C0479d c0479d2 = this.f2889D;
            int i15 = c0479d2.f3160g;
            int i16 = c0479d2.f3161h;
            int i17 = i15 < i16 ? c0479d2.f3155b[i15 * 5] : 0;
            if (z12 || i17 != i10) {
                c0479d = this.f2889D;
                c0479d.getClass();
                arrayList = new ArrayList();
                if (c0479d.f3163j <= 0) {
                    i12 = c0479d.f3160g;
                    while (i12 < c0479d.f3161h) {
                        int i18 = i12 * 5;
                        iArr = c0479d.f3155b;
                        int i19 = iArr[i18];
                        Object objM1767k = c0479d.m1767k(iArr, i12);
                        if (C0062b.m416y(iArr, i12)) {
                            iM256D = 1;
                        } else {
                            iM256D = C0062b.m256D(iArr, i12);
                        }
                        arrayList.add(new C5345x(i19, i12, iM256D, objM1767k));
                        i12 += iArr[i18 + 3];
                    }
                }
                this.f2918i = new C0478c(this.f2919j, arrayList);
            } else if (C5207g.m11106a(obj3, i15 < i16 ? c0479d2.m1767k(c0479d2.f3155b, i15) : null)) {
                m1662w0(obj2, z10);
            } else {
                c0479d = this.f2889D;
                c0479d.getClass();
                arrayList = new ArrayList();
                if (c0479d.f3163j <= 0) {
                    i12 = c0479d.f3160g;
                    while (i12 < c0479d.f3161h) {
                        int i110 = i12 * 5;
                        iArr = c0479d.f3155b;
                        int i111 = iArr[i110];
                        Object objM1767k2 = c0479d.m1767k(iArr, i12);
                        if (C0062b.m416y(iArr, i12)) {
                            iM256D = 1;
                        } else {
                            iM256D = C0062b.m256D(iArr, i12);
                        }
                        arrayList.add(new C5345x(i111, i12, iM256D, objM1767k2));
                        i12 += iArr[i110 + 3];
                    }
                }
                this.f2918i = new C0478c(this.f2919j, arrayList);
            }
        }
        C0478c c0478c3 = this.f2918i;
        if (c0478c3 == null) {
            c0478c = null;
        } else {
            Object c5343w = obj3 != null ? new C5343w(Integer.valueOf(i10), obj3) : Integer.valueOf(i10);
            HashMap map = (HashMap) c0478c3.f3153f.getValue();
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
            LinkedHashSet linkedHashSet = (LinkedHashSet) map.get(c5343w);
            if (linkedHashSet == null || (objM13424R = C6752c.m13424R(linkedHashSet)) == null) {
                objM13424R = null;
            } else {
                LinkedHashSet linkedHashSet2 = (LinkedHashSet) map.get(c5343w);
                if (linkedHashSet2 != null) {
                    linkedHashSet2.remove(objM13424R);
                    if (linkedHashSet2.isEmpty()) {
                        map.remove(c5343w);
                    }
                    C9072e c9072e = C9072e.f47360a;
                }
            }
            C5345x c5345x2 = (C5345x) objM13424R;
            HashMap<Integer, C5335s> map2 = c0478c3.f3152e;
            ArrayList arrayList2 = c0478c3.f3151d;
            int i20 = c0478c3.f3149b;
            if (z12 || c5345x2 == null) {
                this.f2889D.f3163j++;
                this.f2897L = true;
                this.f2893H = null;
                if (this.f2891F.f3185t) {
                    C0480e c0480eM11472l = this.f2890E.m11472l();
                    this.f2891F = c0480eM11472l;
                    c0480eM11472l.m1780G();
                    this.f2892G = false;
                    this.f2893H = null;
                }
                this.f2891F.m1792e();
                C0480e c0480e2 = this.f2891F;
                int i21 = c0480e2.f3183r;
                if (z10) {
                    c0480e2.m1783J(i10, c10586a, c10586a, true);
                } else if (obj2 != null) {
                    if (obj3 == null) {
                        obj3 = c10586a;
                    }
                    c0480e2.m1783J(i10, obj3, obj2, false);
                } else {
                    if (obj3 == null) {
                        obj3 = c10586a;
                    }
                    c0480e2.m1783J(i10, obj3, c10586a, false);
                }
                this.f2895J = this.f2891F.m1789b(i21);
                int i22 = (-2) - i21;
                C5345x c5345x3 = new C5345x(i10, i22, -1, -1);
                map2.put(Integer.valueOf(i22), new C5335s(-1, this.f2919j - i20, 0));
                arrayList2.add(c5345x3);
                c0478c = new C0478c(z10 ? 0 : this.f2919j, new ArrayList());
            } else {
                arrayList2.add(c5345x2);
                this.f2919j = c0478c3.m1755a(c5345x2) + i20;
                int i23 = c5345x2.f33639c;
                C5335s c5335s = map2.get(Integer.valueOf(i23));
                int i24 = c5335s != null ? c5335s.f33611a : -1;
                int i25 = c0478c3.f3150c;
                final int i26 = i24 - i25;
                if (i24 > i25) {
                    Collection<C5335s> collectionValues = map2.values();
                    C5207g.m11110e(collectionValues, "groupInfos.values");
                    for (C5335s c5335s2 : collectionValues) {
                        int i27 = c5335s2.f33611a;
                        if (i27 == i24) {
                            c5335s2.f33611a = i25;
                        } else if (i25 <= i27 && i27 < i24) {
                            c5335s2.f33611a = i27 + 1;
                        }
                    }
                } else if (i25 > i24) {
                    Collection<C5335s> collectionValues2 = map2.values();
                    C5207g.m11110e(collectionValues2, "groupInfos.values");
                    for (C5335s c5335s3 : collectionValues2) {
                        int i28 = c5335s3.f33611a;
                        if (i28 == i24) {
                            c5335s3.f33611a = i25;
                        } else if (i24 + 1 <= i28 && i28 < i25) {
                            c5335s3.f33611a = i28 - 1;
                        }
                    }
                }
                C0479d c0479d3 = this.f2889D;
                this.f2901P = i23 - (c0479d3.f3160g - this.f2901P);
                c0479d3.m1769m(i23);
                if (i26 > 0) {
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$start$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // cm.InterfaceC2057q
                        /* JADX INFO: renamed from: M */
                        public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e3, InterfaceC5336s0 interfaceC5336s0) {
                            C0480e c0480e4 = c0480e3;
                            C0141b.m619o(interfaceC5299c, "<anonymous parameter 0>", c0480e4, "slots", interfaceC5336s0, "<anonymous parameter 2>");
                            if (!(c0480e4.f3178m == 0)) {
                                ComposerKt.m1687c("Cannot move a group while inserting".toString());
                                throw null;
                            }
                            int i29 = i26;
                            if (!(i29 >= 0)) {
                                ComposerKt.m1687c("Parameter offset is out of bounds".toString());
                                throw null;
                            }
                            if (i29 != 0) {
                                int i30 = c0480e4.f3183r;
                                int i31 = c0480e4.f3184s;
                                int i32 = c0480e4.f3172g;
                                int iM404v = i30;
                                while (i29 > 0) {
                                    iM404v += C0062b.m404v(c0480e4.f3167b, c0480e4.m1801n(iM404v));
                                    if (!(iM404v <= i32)) {
                                        ComposerKt.m1687c("Parameter offset is out of bounds".toString());
                                        throw null;
                                    }
                                    i29--;
                                }
                                int iM404v2 = C0062b.m404v(c0480e4.f3167b, c0480e4.m1801n(iM404v));
                                int i33 = c0480e4.f3173h;
                                int iM1794g = c0480e4.m1794g(c0480e4.f3167b, c0480e4.m1801n(iM404v));
                                int i34 = iM404v + iM404v2;
                                int iM1794g2 = c0480e4.m1794g(c0480e4.f3167b, c0480e4.m1801n(i34));
                                int i35 = iM1794g2 - iM1794g;
                                c0480e4.m1805r(i35, Math.max(c0480e4.f3183r - 1, 0));
                                c0480e4.m1804q(iM404v2);
                                int[] iArr2 = c0480e4.f3167b;
                                int iM1801n = c0480e4.m1801n(i34) * 5;
                                C9322j.m17672Z(c0480e4.m1801n(i30) * 5, iM1801n, (iM404v2 * 5) + iM1801n, iArr2, iArr2);
                                if (i35 > 0) {
                                    Object[] objArr = c0480e4.f3168c;
                                    C9322j.m17673a0(i33, c0480e4.m1795h(iM1794g + i35), c0480e4.m1795h(iM1794g2 + i35), objArr, objArr);
                                }
                                int i36 = iM1794g + i35;
                                int i37 = i36 - i33;
                                int i38 = c0480e4.f3175j;
                                int i39 = c0480e4.f3176k;
                                int length = c0480e4.f3168c.length;
                                int i40 = c0480e4.f3177l;
                                int i41 = i30 + iM404v2;
                                int i42 = i30;
                                while (i42 < i41) {
                                    int iM1801n2 = c0480e4.m1801n(i42);
                                    int i43 = i38;
                                    int iM1794g3 = c0480e4.m1794g(iArr2, iM1801n2) - i37;
                                    if (iM1794g3 > (i40 < iM1801n2 ? 0 : i43)) {
                                        iM1794g3 = -(((length - i39) - iM1794g3) + 1);
                                    }
                                    int i44 = c0480e4.f3175j;
                                    int i45 = i39;
                                    int i46 = c0480e4.f3176k;
                                    int i47 = length;
                                    int length2 = c0480e4.f3168c.length;
                                    if (iM1794g3 > i44) {
                                        iM1794g3 = -(((length2 - i46) - iM1794g3) + 1);
                                    }
                                    iArr2[(iM1801n2 * 5) + 4] = iM1794g3;
                                    i42++;
                                    i38 = i43;
                                    i37 = i37;
                                    length = i47;
                                    i39 = i45;
                                }
                                int i48 = iM404v2 + i34;
                                int iM1800m = c0480e4.m1800m();
                                int iM420z = C0062b.m420z(c0480e4.f3169d, i34, iM1800m);
                                ArrayList arrayList3 = new ArrayList();
                                if (iM420z >= 0) {
                                    while (iM420z < c0480e4.f3169d.size()) {
                                        C5296b c5296b = c0480e4.f3169d.get(iM420z);
                                        C5207g.m11110e(c5296b, "anchors[index]");
                                        C5296b c5296b2 = c5296b;
                                        int iM1790c = c0480e4.m1790c(c5296b2);
                                        if (iM1790c < i34 || iM1790c >= i48) {
                                            break;
                                        }
                                        arrayList3.add(c5296b2);
                                        c0480e4.f3169d.remove(iM420z);
                                    }
                                }
                                int i49 = i30 - i34;
                                int size = arrayList3.size();
                                for (int i50 = 0; i50 < size; i50++) {
                                    C5296b c5296b3 = (C5296b) arrayList3.get(i50);
                                    int iM1790c2 = c0480e4.m1790c(c5296b3) + i49;
                                    if (iM1790c2 >= c0480e4.f3170e) {
                                        c5296b3.f33569a = -(iM1800m - iM1790c2);
                                    } else {
                                        c5296b3.f33569a = iM1790c2;
                                    }
                                    c0480e4.f3169d.add(C0062b.m420z(c0480e4.f3169d, iM1790c2, iM1800m), c5296b3);
                                }
                                if (!(!c0480e4.m1777D(i34, iM404v2))) {
                                    ComposerKt.m1687c("Unexpectedly removed anchors".toString());
                                    throw null;
                                }
                                c0480e4.m1799l(i31, c0480e4.f3172g, i30);
                                if (i35 > 0) {
                                    c0480e4.m1778E(i36, i35, i34 - 1);
                                }
                            }
                            return C9072e.f47360a;
                        }
                    };
                    m1625d0(false);
                    m1641l0();
                    m1635i0(interfaceC2057q2);
                }
                m1662w0(obj2, z10);
                c0478c = null;
            }
        }
        m1614V(z10, c0478c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.compose.runtime.InterfaceC0476a
    /* JADX INFO: renamed from: s */
    public final void mo1653s() {
        if (!this.f2926q) {
            ComposerKt.m1687c("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw null;
        }
        this.f2926q = false;
        if (!(!this.f2897L)) {
            ComposerKt.m1687c("useNode() called while inserting".toString());
            throw null;
        }
        C0479d c0479d = this.f2889D;
        Object objM1765i = c0479d.m1765i(c0479d.f3162i);
        this.f2900O.m11407f(objM1765i);
        if (this.f2933x && (objM1765i instanceof InterfaceC5302d)) {
            ComposerImpl$useNode$2 composerImpl$useNode$2 = new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$useNode$2
                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e, InterfaceC5336s0 interfaceC5336s0) {
                    InterfaceC5299c<?> interfaceC5299c2 = interfaceC5299c;
                    C5207g.m11111f(interfaceC5299c2, "applier");
                    C5207g.m11111f(c0480e, "<anonymous parameter 1>");
                    C5207g.m11111f(interfaceC5336s0, "<anonymous parameter 2>");
                    Object objMo11432h = interfaceC5299c2.mo11432h();
                    C5207g.m11109d(objMo11432h, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
                    ((InterfaceC5302d) objMo11432h).mo2119h();
                    return C9072e.f47360a;
                }
            };
            m1627e0();
            m1621b0();
            m1635i0(composerImpl$useNode$2);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m1654s0() {
        m1652r0(-127, 0, null, null);
    }

    @Override // androidx.compose.runtime.InterfaceC0476a
    /* JADX INFO: renamed from: t */
    public final void mo1655t(Object obj) {
        m1597F0(obj);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m1656t0(int i10, C5318j0 c5318j0) {
        m1652r0(i10, 0, c5318j0, null);
    }

    @Override // androidx.compose.runtime.InterfaceC0476a
    /* JADX INFO: renamed from: u */
    public final int mo1657u() {
        return this.f2898M;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m1658u0() {
        m1652r0(125, 1, null, null);
        this.f2926q = true;
    }

    @Override // androidx.compose.runtime.InterfaceC0476a
    /* JADX INFO: renamed from: v */
    public final void mo1659v() {
        m1609Q(false);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: v0 */
    public final void m1660v0(final C5328o0<?>[] c5328o0Arr) {
        InterfaceC5634d<AbstractC5317j<Object>, InterfaceC5301c1<Object>> interfaceC5634dM1595E0;
        boolean zM11106a;
        C5207g.m11111f(c5328o0Arr, "values");
        final InterfaceC5634d<AbstractC5317j<Object>, InterfaceC5301c1<Object>> interfaceC5634dM1604L = m1604L();
        m1656t0(201, ComposerKt.f3009g);
        m1656t0(203, ComposerKt.f3011i);
        InterfaceC2056p<InterfaceC0476a, Integer, InterfaceC5634d<AbstractC5317j<Object>, ? extends InterfaceC5301c1<? extends Object>>> interfaceC2056p = new InterfaceC2056p<InterfaceC0476a, Integer, InterfaceC5634d<AbstractC5317j<Object>, ? extends InterfaceC5301c1<? extends Object>>>() { // from class: androidx.compose.runtime.ComposerImpl$startProviders$currentProviders$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final InterfaceC5634d<AbstractC5317j<Object>, ? extends InterfaceC5301c1<? extends Object>> mo1337m0(InterfaceC0476a interfaceC0476a, Integer num) {
                InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
                num.intValue();
                interfaceC0476a2.mo1622c(935231726);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                interfaceC0476a2.mo1622c(721128344);
                C6113f c6113f = new C6113f(C5212l.m11160g0());
                for (C5328o0<?> c5328o0 : c5328o0Arr) {
                    interfaceC0476a2.mo1622c(680853375);
                    boolean z10 = c5328o0.f33600c;
                    AbstractC5317j<?> abstractC5317j = c5328o0.f33598a;
                    if (z10) {
                        C5207g.m11109d(abstractC5317j, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
                        c6113f.put(abstractC5317j, abstractC5317j.mo11450a(c5328o0.f33599b, interfaceC0476a2));
                    } else {
                        InterfaceC5634d<AbstractC5317j<Object>, InterfaceC5301c1<Object>> interfaceC5634d = interfaceC5634dM1604L;
                        C5207g.m11111f(interfaceC5634d, "<this>");
                        C5207g.m11111f(abstractC5317j, "key");
                        if (!interfaceC5634d.containsKey(abstractC5317j)) {
                            C5207g.m11109d(abstractC5317j, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
                            c6113f.put(abstractC5317j, abstractC5317j.mo11450a(c5328o0.f33599b, interfaceC0476a2));
                        }
                    }
                    interfaceC0476a2.mo1661w();
                }
                C6111d c6111dM12616a = c6113f.m12616a();
                interfaceC0476a2.mo1661w();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                interfaceC0476a2.mo1661w();
                return c6111dM12616a;
            }
        };
        C5213m.m11200e(2, interfaceC2056p);
        InterfaceC5634d<AbstractC5317j<Object>, ? extends InterfaceC5301c1<? extends Object>> interfaceC5634dMo1337m0 = interfaceC2056p.mo1337m0(this, 1);
        m1609Q(false);
        if (this.f2897L) {
            interfaceC5634dM1595E0 = m1595E0(interfaceC5634dM1604L, interfaceC5634dMo1337m0);
            this.f2892G = true;
            zM11106a = false;
        } else {
            C0479d c0479d = this.f2889D;
            Object objM1762f = c0479d.m1762f(c0479d.f3160g, 0);
            C5207g.m11109d(objM1762f, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            InterfaceC5634d<AbstractC5317j<Object>, InterfaceC5301c1<Object>> interfaceC5634d = (InterfaceC5634d) objM1762f;
            C0479d c0479d2 = this.f2889D;
            Object objM1762f2 = c0479d2.m1762f(c0479d2.f3160g, 1);
            C5207g.m11109d(objM1762f2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            InterfaceC5634d interfaceC5634d2 = (InterfaceC5634d) objM1762f2;
            if (mo1642m() && C5207g.m11106a(interfaceC5634d2, interfaceC5634dMo1337m0)) {
                this.f2921l = this.f2889D.m1770n() + this.f2921l;
                zM11106a = false;
                interfaceC5634dM1595E0 = interfaceC5634d;
            } else {
                interfaceC5634dM1595E0 = m1595E0(interfaceC5634dM1604L, interfaceC5634dMo1337m0);
                zM11106a = true ^ C5207g.m11106a(interfaceC5634dM1595E0, interfaceC5634d);
            }
        }
        if (zM11106a && !this.f2897L) {
            this.f2930u.f34016a.put(this.f2889D.f3160g, interfaceC5634dM1595E0);
        }
        this.f2932w.m11467d(this.f2931v ? 1 : 0);
        this.f2931v = zM11106a;
        this.f2893H = interfaceC5634dM1595E0;
        m1652r0(202, 0, ComposerKt.f3010h, interfaceC5634dM1595E0);
    }

    @Override // androidx.compose.runtime.InterfaceC0476a
    /* JADX INFO: renamed from: w */
    public final void mo1661w() {
        m1609Q(false);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: w0 */
    public final void m1662w0(final Object obj, boolean z10) {
        if (z10) {
            C0479d c0479d = this.f2889D;
            if (c0479d.f3163j <= 0) {
                if (!C0062b.m416y(c0479d.f3155b, c0479d.f3160g)) {
                    throw new IllegalArgumentException("Expected a node group".toString());
                }
                c0479d.m1772p();
            }
        } else {
            if (obj != null && this.f2889D.m1761e() != obj) {
                m1643m0(false, new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerImpl$startReaderGroup$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // cm.InterfaceC2057q
                    /* JADX INFO: renamed from: M */
                    public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e, InterfaceC5336s0 interfaceC5336s0) {
                        C0480e c0480e2 = c0480e;
                        C0141b.m619o(interfaceC5299c, "<anonymous parameter 0>", c0480e2, "slots", interfaceC5336s0, "<anonymous parameter 2>");
                        c0480e2.m1785L(obj);
                        return C9072e.f47360a;
                    }
                });
            }
            this.f2889D.m1772p();
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0476a
    /* JADX INFO: renamed from: x */
    public final void mo1663x() {
        m1609Q(true);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: x0 */
    public final void m1664x0() {
        Object value;
        C5342v0 c5342v0 = this.f2912c;
        this.f2889D = c5342v0.m11471i();
        m1652r0(100, 0, null, null);
        AbstractC5311g abstractC5311g = this.f2911b;
        abstractC5311g.mo1681m();
        this.f2929t = abstractC5311g.mo1673e();
        C5339u c5339u = this.f2932w;
        boolean z10 = this.f2931v;
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        c5339u.m11467d(z10 ? 1 : 0);
        this.f2931v = mo1665y(this.f2929t);
        this.f2893H = null;
        if (!this.f2925p) {
            this.f2925p = abstractC5311g.mo1672d();
        }
        C5304d1 c5304d1 = InspectionTablesKt.f3316a;
        InterfaceC5634d<AbstractC5317j<Object>, ? extends InterfaceC5301c1<? extends Object>> interfaceC5634d = this.f2929t;
        C5207g.m11111f(interfaceC5634d, "<this>");
        C5207g.m11111f(c5304d1, "key");
        if (interfaceC5634d.containsKey(c5304d1)) {
            InterfaceC5301c1<? extends Object> interfaceC5301c1 = interfaceC5634d.get(c5304d1);
            value = interfaceC5301c1 != null ? interfaceC5301c1.getValue() : null;
        } else {
            value = c5304d1.f33590a.getValue();
        }
        Set<Object> set = (Set) value;
        if (set != null) {
            set.add(c5342v0);
            abstractC5311g.mo1679k(set);
        }
        m1652r0(abstractC5311g.mo1674f(), 0, null, null);
    }

    @Override // androidx.compose.runtime.InterfaceC0476a
    /* JADX INFO: renamed from: y */
    public final boolean mo1665y(Object obj) {
        if (C5207g.m11106a(m1619a0(), obj)) {
            return false;
        }
        m1597F0(obj);
        return true;
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m1666y0(C5332q0 c5332q0, Object obj) {
        C5207g.m11111f(c5332q0, "scope");
        C5296b c5296b = c5332q0.f33604c;
        if (c5296b == null) {
            return false;
        }
        C5342v0 c5342v0 = this.f2912c;
        C5207g.m11111f(c5342v0, "slots");
        int iM11469f = c5342v0.m11469f(c5296b);
        if (!this.f2888C || iM11469f < this.f2889D.f3160g) {
            return false;
        }
        ArrayList arrayList = this.f2927r;
        int iM1688d = ComposerKt.m1688d(iM11469f, arrayList);
        C5455c c5455c = null;
        if (iM1688d < 0) {
            int i10 = -(iM1688d + 1);
            if (obj != null) {
                c5455c = new C5455c();
                c5455c.add(obj);
            }
            arrayList.add(i10, new C5341v(c5332q0, iM11469f, c5455c));
        } else if (obj == null) {
            ((C5341v) arrayList.get(iM1688d)).f33623c = null;
        } else {
            C5455c<Object> c5455c2 = ((C5341v) arrayList.get(iM1688d)).f33623c;
            if (c5455c2 != null) {
                c5455c2.add(obj);
            }
        }
        return true;
    }

    @Override // androidx.compose.runtime.InterfaceC0476a
    /* JADX INFO: renamed from: z */
    public final void mo1667z(InterfaceC5330p0 interfaceC5330p0) {
        C5332q0 c5332q0 = interfaceC5330p0 instanceof C5332q0 ? (C5332q0) interfaceC5330p0 : null;
        if (c5332q0 == null) {
            return;
        }
        c5332q0.f33602a |= 1;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m1668z0(Object obj, int i10, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                this.f2898M = ((Enum) obj).ordinal() ^ Integer.rotateLeft(this.f2898M, 3);
                return;
            } else {
                this.f2898M = obj.hashCode() ^ Integer.rotateLeft(this.f2898M, 3);
                return;
            }
        }
        if (obj2 == null || i10 != 207 || C5207g.m11106a(obj2, InterfaceC0476a.a.f3122a)) {
            this.f2898M = Integer.rotateLeft(this.f2898M, 3) ^ i10;
        } else {
            this.f2898M = obj2.hashCode() ^ Integer.rotateLeft(this.f2898M, 3);
        }
    }
}
