package androidx.compose.runtime;

import android.os.Trace;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import p081e0.AbstractC5293a;
import p081e0.AbstractC5311g;
import p081e0.C5296b;
import p081e0.C5306e0;
import p081e0.C5309f0;
import p081e0.C5315i;
import p081e0.C5332q0;
import p081e0.C5342v0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5302d;
import p081e0.InterfaceC5321l;
import p081e0.InterfaceC5323m;
import p081e0.InterfaceC5336s0;
import p081e0.InterfaceC5338t0;
import p105f0.C5453a;
import p105f0.C5454b;
import p105f0.C5455c;
import p105f0.C5456d;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.runtime.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0477b implements InterfaceC5321l {

    /* JADX INFO: renamed from: H */
    public C5454b f3123H;

    /* JADX INFO: renamed from: I */
    public boolean f3124I;

    /* JADX INFO: renamed from: J */
    public C0477b f3125J;

    /* JADX INFO: renamed from: K */
    public int f3126K;

    /* JADX INFO: renamed from: L */
    public final ComposerImpl f3127L;

    /* JADX INFO: renamed from: M */
    public final CoroutineContext f3128M;

    /* JADX INFO: renamed from: N */
    public boolean f3129N;

    /* JADX INFO: renamed from: O */
    public InterfaceC2056p<? super InterfaceC0476a, ? super Integer, C9072e> f3130O;

    /* JADX INFO: renamed from: a */
    public final AbstractC5311g f3131a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5299c<?> f3132b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference<Object> f3133c;

    /* JADX INFO: renamed from: d */
    public final Object f3134d;

    /* JADX INFO: renamed from: e */
    public final HashSet<InterfaceC5338t0> f3135e;

    /* JADX INFO: renamed from: f */
    public final C5342v0 f3136f;

    /* JADX INFO: renamed from: g */
    public final C5456d<C5332q0> f3137g;

    /* JADX INFO: renamed from: h */
    public final HashSet<C5332q0> f3138h;

    /* JADX INFO: renamed from: i */
    public final C5456d<InterfaceC5323m<?>> f3139i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f3140j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f3141k;

    /* JADX INFO: renamed from: l */
    public final C5456d<C5332q0> f3142l;

    /* JADX INFO: renamed from: androidx.compose.runtime.b$a */
    public static final class a implements InterfaceC5336s0 {

        /* JADX INFO: renamed from: a */
        public final Set<InterfaceC5338t0> f3143a;

        /* JADX INFO: renamed from: b */
        public final ArrayList f3144b;

        /* JADX INFO: renamed from: c */
        public final ArrayList f3145c;

        /* JADX INFO: renamed from: d */
        public final ArrayList f3146d;

        /* JADX INFO: renamed from: e */
        public ArrayList f3147e;

        public a(HashSet hashSet) {
            C5207g.m11111f(hashSet, "abandoning");
            this.f3143a = hashSet;
            this.f3144b = new ArrayList();
            this.f3145c = new ArrayList();
            this.f3146d = new ArrayList();
        }

        @Override // p081e0.InterfaceC5336s0
        /* JADX INFO: renamed from: a */
        public final void mo1747a(InterfaceC5302d interfaceC5302d) {
            C5207g.m11111f(interfaceC5302d, "instance");
            ArrayList arrayList = this.f3147e;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f3147e = arrayList;
            }
            arrayList.add(interfaceC5302d);
        }

        @Override // p081e0.InterfaceC5336s0
        /* JADX INFO: renamed from: b */
        public final void mo1748b(InterfaceC2041a<C9072e> interfaceC2041a) {
            C5207g.m11111f(interfaceC2041a, "effect");
            this.f3146d.add(interfaceC2041a);
        }

        @Override // p081e0.InterfaceC5336s0
        /* JADX INFO: renamed from: c */
        public final void mo1749c(InterfaceC5338t0 interfaceC5338t0) {
            C5207g.m11111f(interfaceC5338t0, "instance");
            ArrayList arrayList = this.f3145c;
            int iLastIndexOf = arrayList.lastIndexOf(interfaceC5338t0);
            if (iLastIndexOf < 0) {
                this.f3144b.add(interfaceC5338t0);
            } else {
                arrayList.remove(iLastIndexOf);
                this.f3143a.remove(interfaceC5338t0);
            }
        }

        @Override // p081e0.InterfaceC5336s0
        /* JADX INFO: renamed from: d */
        public final void mo1750d(InterfaceC5338t0 interfaceC5338t0) {
            C5207g.m11111f(interfaceC5338t0, "instance");
            ArrayList arrayList = this.f3144b;
            int iLastIndexOf = arrayList.lastIndexOf(interfaceC5338t0);
            if (iLastIndexOf < 0) {
                this.f3145c.add(interfaceC5338t0);
            } else {
                arrayList.remove(iLastIndexOf);
                this.f3143a.remove(interfaceC5338t0);
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m1751e() {
            Set<InterfaceC5338t0> set = this.f3143a;
            if (!set.isEmpty()) {
                Trace.beginSection("Compose:abandons");
                try {
                    Iterator<InterfaceC5338t0> it = set.iterator();
                    while (it.hasNext()) {
                        InterfaceC5338t0 next = it.next();
                        it.remove();
                        next.mo1536a();
                    }
                    C9072e c9072e = C9072e.f47360a;
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: f */
        public final void m1752f() {
            ArrayList arrayList = this.f3147e;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            Trace.beginSection("Compose:releases");
            try {
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    ((InterfaceC5302d) arrayList.get(size)).mo2118a();
                }
                C9072e c9072e = C9072e.f47360a;
                Trace.endSection();
                arrayList.clear();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: g */
        public final void m1753g() {
            ArrayList arrayList = this.f3145c;
            boolean z10 = !arrayList.isEmpty();
            Set<InterfaceC5338t0> set = this.f3143a;
            if (z10) {
                Trace.beginSection("Compose:onForgotten");
                try {
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        InterfaceC5338t0 interfaceC5338t0 = (InterfaceC5338t0) arrayList.get(size);
                        if (!set.contains(interfaceC5338t0)) {
                            interfaceC5338t0.mo1537b();
                        }
                    }
                    C9072e c9072e = C9072e.f47360a;
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            ArrayList arrayList2 = this.f3144b;
            if (!arrayList2.isEmpty()) {
                Trace.beginSection("Compose:onRemembered");
                try {
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        InterfaceC5338t0 interfaceC5338t1 = (InterfaceC5338t0) arrayList2.get(i10);
                        set.remove(interfaceC5338t1);
                        interfaceC5338t1.mo1538c();
                    }
                    C9072e c9072e2 = C9072e.f47360a;
                    Trace.endSection();
                } catch (Throwable th3) {
                    Trace.endSection();
                    throw th3;
                }
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: h */
        public final void m1754h() {
            ArrayList arrayList = this.f3146d;
            if (!arrayList.isEmpty()) {
                Trace.beginSection("Compose:sideeffects");
                try {
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((InterfaceC2041a) arrayList.get(i10)).mo807E();
                    }
                    arrayList.clear();
                    C9072e c9072e = C9072e.f47360a;
                } finally {
                    Trace.endSection();
                }
            }
        }
    }

    public C0477b() {
        throw null;
    }

    public C0477b(AbstractC5311g abstractC5311g, AbstractC5293a abstractC5293a) {
        C5207g.m11111f(abstractC5311g, "parent");
        this.f3131a = abstractC5311g;
        this.f3132b = abstractC5293a;
        this.f3133c = new AtomicReference<>(null);
        this.f3134d = new Object();
        HashSet<InterfaceC5338t0> hashSet = new HashSet<>();
        this.f3135e = hashSet;
        C5342v0 c5342v0 = new C5342v0();
        this.f3136f = c5342v0;
        this.f3137g = new C5456d<>();
        this.f3138h = new HashSet<>();
        this.f3139i = new C5456d<>();
        ArrayList arrayList = new ArrayList();
        this.f3140j = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f3141k = arrayList2;
        this.f3142l = new C5456d<>();
        this.f3123H = new C5454b();
        ComposerImpl composerImpl = new ComposerImpl(abstractC5293a, abstractC5311g, c5342v0, hashSet, arrayList, arrayList2, this);
        abstractC5311g.mo1680l(composerImpl);
        this.f3127L = composerImpl;
        this.f3128M = null;
        boolean z10 = abstractC5311g instanceof Recomposer;
        this.f3130O = ComposableSingletons$CompositionKt.f2881a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r5v11, types: [T, java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX INFO: renamed from: e */
    public static final void m1719e(C0477b c0477b, boolean z10, Ref$ObjectRef<HashSet<C5332q0>> ref$ObjectRef, Object obj) {
        InvalidationResult invalidationResultM1746z;
        C5456d<C5332q0> c5456d = c0477b.f3137g;
        int iM11682d = c5456d.m11682d(obj);
        if (iM11682d >= 0) {
            C5455c<C5332q0> c5455cM11685g = c5456d.m11685g(iM11682d);
            int i10 = c5455cM11685g.f34008a;
            for (int i11 = 0; i11 < i10; i11++) {
                C5332q0 c5332q0 = c5455cM11685g.get(i11);
                if (!c0477b.f3142l.m11683e(obj, c5332q0)) {
                    C0477b c0477b2 = c5332q0.f33603b;
                    if (c0477b2 == null || (invalidationResultM1746z = c0477b2.m1746z(c5332q0, obj)) == null) {
                        invalidationResultM1746z = InvalidationResult.IGNORED;
                    }
                    if (invalidationResultM1746z != InvalidationResult.IGNORED) {
                        if (!(c5332q0.f33608g != null) || z10) {
                            HashSet<C5332q0> hashSet = ref$ObjectRef.f38127a;
                            ?? r10 = hashSet;
                            if (hashSet == null) {
                                ?? hashSet2 = new HashSet();
                                ref$ObjectRef.f38127a = hashSet2;
                                r10 = hashSet2;
                            }
                            r10.add(c5332q0);
                        } else {
                            c0477b.f3138h.add(c5332q0);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: A */
    public final InvalidationResult m1720A(C5332q0 c5332q0, C5296b c5296b, Object obj) {
        synchronized (this.f3134d) {
            try {
                C0477b c0477b = this.f3125J;
                if (c0477b == null || !this.f3136f.m11470g(this.f3126K, c5296b)) {
                    c0477b = null;
                }
                if (c0477b == null) {
                    ComposerImpl composerImpl = this.f3127L;
                    if (composerImpl.f2888C && composerImpl.m1666y0(c5332q0, obj)) {
                        return InvalidationResult.IMMINENT;
                    }
                    if (obj == null) {
                        this.f3123H.m11677d(c5332q0, null);
                    } else {
                        C5454b c5454b = this.f3123H;
                        Object obj2 = C5315i.f33586a;
                        c5454b.getClass();
                        C5207g.m11111f(c5332q0, "key");
                        if (c5454b.m11674a(c5332q0) >= 0) {
                            C5455c c5455c = (C5455c) c5454b.m11676c(c5332q0);
                            if (c5455c != null) {
                                c5455c.add(obj);
                            }
                        } else {
                            C5455c c5455c2 = new C5455c();
                            c5455c2.add(obj);
                            C9072e c9072e = C9072e.f47360a;
                            c5454b.m11677d(c5332q0, c5455c2);
                        }
                    }
                }
                if (c0477b != null) {
                    return c0477b.m1720A(c5332q0, c5296b, obj);
                }
                this.f3131a.mo1676h(this);
                return this.f3127L.f2888C ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m1721B(Object obj) {
        InvalidationResult invalidationResultM1746z;
        C5456d<C5332q0> c5456d = this.f3137g;
        int iM11682d = c5456d.m11682d(obj);
        if (iM11682d >= 0) {
            C5455c<C5332q0> c5455cM11685g = c5456d.m11685g(iM11682d);
            int i10 = c5455cM11685g.f34008a;
            for (int i11 = 0; i11 < i10; i11++) {
                C5332q0 c5332q0 = c5455cM11685g.get(i11);
                C0477b c0477b = c5332q0.f33603b;
                if (c0477b == null || (invalidationResultM1746z = c0477b.m1746z(c5332q0, obj)) == null) {
                    invalidationResultM1746z = InvalidationResult.IGNORED;
                }
                if (invalidationResultM1746z == InvalidationResult.IMMINENT) {
                    this.f3142l.m11679a(obj, c5332q0);
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p081e0.InterfaceC5308f
    /* JADX INFO: renamed from: a */
    public final void mo1722a() {
        synchronized (this.f3134d) {
            try {
                if (!this.f3129N) {
                    this.f3129N = true;
                    this.f3130O = ComposableSingletons$CompositionKt.f2882b;
                    ArrayList arrayList = this.f3127L.f2894I;
                    if (arrayList != null) {
                        m1742v(arrayList);
                    }
                    boolean z10 = this.f3136f.f33625b > 0;
                    if (z10 || (true ^ this.f3135e.isEmpty())) {
                        a aVar = new a(this.f3135e);
                        if (z10) {
                            C0480e c0480eM11472l = this.f3136f.m11472l();
                            try {
                                ComposerKt.m1689e(c0480eM11472l, aVar);
                                C9072e c9072e = C9072e.f47360a;
                                c0480eM11472l.m1793f();
                                this.f3132b.clear();
                                aVar.m1753g();
                                aVar.m1752f();
                            } catch (Throwable th2) {
                                c0480eM11472l.m1793f();
                                throw th2;
                            }
                        }
                        aVar.m1751e();
                    }
                    this.f3127L.m1606N();
                }
                C9072e c9072e2 = C9072e.f47360a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f3131a.mo1683o(this);
    }

    /* JADX INFO: renamed from: b */
    public final void m1723b() {
        this.f3133c.set(null);
        this.f3140j.clear();
        this.f3141k.clear();
        this.f3135e.clear();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0 A[PHI: r8
      0x00a0: PHI (r8v6 boolean) = (r8v5 boolean), (r8v12 boolean) binds: [B:26:0x0086, B:34:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final void m1724c(Set<? extends Object> set, boolean z10) {
        boolean z11;
        boolean z12;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        for (Object obj : set) {
            if (obj instanceof C5332q0) {
                C5332q0 c5332q0 = (C5332q0) obj;
                C0477b c0477b = c5332q0.f33603b;
                if (c0477b == null || c0477b.m1746z(c5332q0, null) == null) {
                    InvalidationResult invalidationResult = InvalidationResult.IGNORED;
                }
            } else {
                m1719e(this, z10, ref$ObjectRef, obj);
                C5456d<InterfaceC5323m<?>> c5456d = this.f3139i;
                int iM11682d = c5456d.m11682d(obj);
                if (iM11682d >= 0) {
                    C5455c<InterfaceC5323m<?>> c5455cM11685g = c5456d.m11685g(iM11682d);
                    int i10 = c5455cM11685g.f34008a;
                    for (int i11 = 0; i11 < i10; i11++) {
                        m1719e(this, z10, ref$ObjectRef, c5455cM11685g.get(i11));
                    }
                }
            }
        }
        C5456d<C5332q0> c5456d2 = this.f3137g;
        if (z10) {
            HashSet<C5332q0> hashSet = this.f3138h;
            boolean z13 = true;
            if (!hashSet.isEmpty()) {
                int i12 = c5456d2.f34015d;
                int i13 = 0;
                for (int i14 = 0; i14 < i12; i14++) {
                    int i15 = c5456d2.f34012a[i14];
                    C5455c<C5332q0> c5455c = c5456d2.f34014c[i15];
                    C5207g.m11108c(c5455c);
                    int i16 = c5455c.f34008a;
                    int i17 = 0;
                    for (int i18 = 0; i18 < i16; i18++) {
                        Object obj2 = c5455c.f34009b[i18];
                        C5207g.m11109d(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        C5332q0 c5332q1 = (C5332q0) obj2;
                        if (hashSet.contains(c5332q1)) {
                            z11 = z13;
                        } else {
                            HashSet hashSet2 = (HashSet) ref$ObjectRef.f38127a;
                            if (hashSet2 != null) {
                                boolean zContains = hashSet2.contains(c5332q1);
                                z13 = true;
                                z12 = zContains;
                                if (z12) {
                                    z11 = z13;
                                } else {
                                    z11 = false;
                                }
                            } else {
                                z13 = true;
                            }
                            if (z12) {
                                z11 = z13;
                            } else {
                                z11 = false;
                            }
                        }
                        if (!z11) {
                            if (i17 != i18) {
                                c5455c.f34009b[i17] = obj2;
                            }
                            i17++;
                        }
                    }
                    int i19 = c5455c.f34008a;
                    for (int i20 = i17; i20 < i19; i20++) {
                        c5455c.f34009b[i20] = null;
                    }
                    c5455c.f34008a = i17;
                    if (i17 > 0) {
                        if (i13 != i14) {
                            int[] iArr = c5456d2.f34012a;
                            int i21 = iArr[i13];
                            iArr[i13] = i15;
                            iArr[i14] = i21;
                        }
                        i13++;
                    }
                }
                int i22 = c5456d2.f34015d;
                for (int i23 = i13; i23 < i22; i23++) {
                    c5456d2.f34013b[c5456d2.f34012a[i23]] = null;
                }
                c5456d2.f34015d = i13;
                m1743w();
                hashSet.clear();
                return;
            }
        }
        HashSet hashSet3 = (HashSet) ref$ObjectRef.f38127a;
        if (hashSet3 != null) {
            int i24 = c5456d2.f34015d;
            int i25 = 0;
            for (int i26 = 0; i26 < i24; i26++) {
                int i27 = c5456d2.f34012a[i26];
                C5455c<C5332q0> c5455c2 = c5456d2.f34014c[i27];
                C5207g.m11108c(c5455c2);
                int i28 = c5455c2.f34008a;
                int i29 = 0;
                for (int i30 = 0; i30 < i28; i30++) {
                    Object obj3 = c5455c2.f34009b[i30];
                    C5207g.m11109d(obj3, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    if (!hashSet3.contains((C5332q0) obj3)) {
                        if (i29 != i30) {
                            c5455c2.f34009b[i29] = obj3;
                        }
                        i29++;
                    }
                }
                int i31 = c5455c2.f34008a;
                for (int i32 = i29; i32 < i31; i32++) {
                    c5455c2.f34009b[i32] = null;
                }
                c5455c2.f34008a = i29;
                if (i29 > 0) {
                    if (i25 != i26) {
                        int[] iArr2 = c5456d2.f34012a;
                        int i33 = iArr2[i25];
                        iArr2[i25] = i27;
                        iArr2[i26] = i33;
                    }
                    i25++;
                }
            }
            int i34 = c5456d2.f34015d;
            for (int i35 = i25; i35 < i34; i35++) {
                c5456d2.f34013b[c5456d2.f34012a[i35]] = null;
            }
            c5456d2.f34015d = i25;
            m1743w();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p081e0.InterfaceC5321l
    /* JADX INFO: renamed from: d */
    public final void mo1725d(ArrayList arrayList) throws Exception {
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!C5207g.m11106a(((C5309f0) ((Pair) arrayList.get(i10)).f38012a).f33578c, this)) {
                break;
            } else {
                i10++;
            }
        }
        ComposerKt.m1690f(z10);
        try {
            ComposerImpl composerImpl = this.f3127L;
            composerImpl.getClass();
            try {
                composerImpl.m1617Y(arrayList);
                composerImpl.m1601I();
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                composerImpl.m1587A();
                throw th2;
            }
        } catch (Throwable th3) {
            HashSet<InterfaceC5338t0> hashSet = this.f3135e;
            try {
                if (!hashSet.isEmpty()) {
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!hashSet.isEmpty()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator<InterfaceC5338t0> it = hashSet.iterator();
                            while (it.hasNext()) {
                                InterfaceC5338t0 next = it.next();
                                it.remove();
                                next.mo1536a();
                            }
                            C9072e c9072e2 = C9072e.f47360a;
                        } finally {
                            Trace.endSection();
                        }
                    }
                }
                throw th3;
            } catch (Exception e10) {
                m1723b();
                throw e10;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p081e0.InterfaceC5308f
    /* JADX INFO: renamed from: f */
    public final void mo1726f(InterfaceC2056p<? super InterfaceC0476a, ? super Integer, C9072e> interfaceC2056p) {
        if (!(!this.f3129N)) {
            throw new IllegalStateException("The composition is disposed".toString());
        }
        this.f3130O = interfaceC2056p;
        this.f3131a.mo1669a(this, (ComposableLambdaImpl) interfaceC2056p);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p081e0.InterfaceC5321l
    /* JADX INFO: renamed from: g */
    public final void mo1727g(C5306e0 c5306e0) {
        a aVar = new a(this.f3135e);
        C0480e c0480eM11472l = c5306e0.f33574a.m11472l();
        try {
            ComposerKt.m1689e(c0480eM11472l, aVar);
            C9072e c9072e = C9072e.f47360a;
            c0480eM11472l.m1793f();
            aVar.m1753g();
            aVar.m1752f();
        } catch (Throwable th2) {
            c0480eM11472l.m1793f();
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p081e0.InterfaceC5321l
    /* JADX INFO: renamed from: h */
    public final void mo1728h(InterfaceC2041a<C9072e> interfaceC2041a) {
        ComposerImpl composerImpl = this.f3127L;
        composerImpl.getClass();
        if (!(!composerImpl.f2888C)) {
            ComposerKt.m1687c("Preparing a composition while composing is not supported".toString());
            throw null;
        }
        composerImpl.f2888C = true;
        try {
            ((Recomposer$performRecompose$1$1) interfaceC2041a).mo807E();
        } finally {
            composerImpl.f2888C = false;
        }
    }

    @Override // p081e0.InterfaceC5321l
    /* JADX INFO: renamed from: i */
    public final void mo1729i() {
        synchronized (this.f3134d) {
            try {
                if (!this.f3141k.isEmpty()) {
                    m1742v(this.f3141k);
                }
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f3135e.isEmpty()) {
                            HashSet<InterfaceC5338t0> hashSet = this.f3135e;
                            C5207g.m11111f(hashSet, "abandoning");
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!hashSet.isEmpty()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator<InterfaceC5338t0> it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        InterfaceC5338t0 next = it.next();
                                        it.remove();
                                        next.mo1536a();
                                    }
                                    C9072e c9072e2 = C9072e.f47360a;
                                } finally {
                                    Trace.endSection();
                                }
                            }
                        }
                        throw th2;
                    } catch (Exception e10) {
                        m1723b();
                        throw e10;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p081e0.InterfaceC5321l
    /* JADX INFO: renamed from: j */
    public final void mo1730j(ComposableLambdaImpl composableLambdaImpl) throws Exception {
        try {
            synchronized (this.f3134d) {
                try {
                    m1744x();
                    C5454b c5454b = this.f3123H;
                    this.f3123H = new C5454b();
                    try {
                        this.f3127L.m1602J(c5454b, composableLambdaImpl);
                        C9072e c9072e = C9072e.f47360a;
                    } catch (Exception e10) {
                        this.f3123H = c5454b;
                        throw e10;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.f3135e.isEmpty()) {
                    HashSet<InterfaceC5338t0> hashSet = this.f3135e;
                    C5207g.m11111f(hashSet, "abandoning");
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!hashSet.isEmpty()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator<InterfaceC5338t0> it = hashSet.iterator();
                            while (it.hasNext()) {
                                InterfaceC5338t0 next = it.next();
                                it.remove();
                                next.mo1536a();
                            }
                            C9072e c9072e2 = C9072e.f47360a;
                            Trace.endSection();
                        } catch (Throwable th4) {
                            Trace.endSection();
                            throw th4;
                        }
                    }
                }
                throw th3;
            } catch (Exception e11) {
                m1723b();
                throw e11;
            }
        }
    }

    @Override // p081e0.InterfaceC5321l
    /* JADX INFO: renamed from: k */
    public final void mo1731k(Object obj) {
        C5332q0 c5332q0M1615W;
        C5207g.m11111f(obj, "value");
        ComposerImpl composerImpl = this.f3127L;
        if ((composerImpl.f2935z > 0) || (c5332q0M1615W = composerImpl.m1615W()) == null) {
            return;
        }
        c5332q0M1615W.f33602a |= 1;
        this.f3137g.m11679a(obj, c5332q0M1615W);
        boolean z10 = obj instanceof InterfaceC5323m;
        if (z10) {
            C5456d<InterfaceC5323m<?>> c5456d = this.f3139i;
            c5456d.m11684f(obj);
            for (Object obj2 : ((InterfaceC5323m) obj).mo1696d()) {
                if (obj2 == null) {
                    break;
                }
                c5456d.m11679a(obj2, obj);
            }
        }
        if ((c5332q0M1615W.f33602a & 32) != 0) {
            return;
        }
        C5453a c5453a = c5332q0M1615W.f33607f;
        if (c5453a == null) {
            c5453a = new C5453a();
            c5332q0M1615W.f33607f = c5453a;
        }
        c5453a.m11673a(c5332q0M1615W.f33606e, obj);
        if (z10) {
            C5454b c5454b = c5332q0M1615W.f33608g;
            if (c5454b == null) {
                c5454b = new C5454b();
                c5332q0M1615W.f33608g = c5454b;
            }
            c5454b.m11677d(obj, ((InterfaceC5323m) obj).mo1695c());
        }
    }

    @Override // p081e0.InterfaceC5308f
    /* JADX INFO: renamed from: l */
    public final boolean mo1732l() {
        return this.f3129N;
    }

    @Override // p081e0.InterfaceC5321l
    /* JADX INFO: renamed from: m */
    public final <R> R mo1733m(InterfaceC5321l interfaceC5321l, int i10, InterfaceC2041a<? extends R> interfaceC2041a) {
        if (interfaceC5321l == null || C5207g.m11106a(interfaceC5321l, this) || i10 < 0) {
            return interfaceC2041a.mo807E();
        }
        this.f3125J = (C0477b) interfaceC5321l;
        this.f3126K = i10;
        try {
            R rMo807E = interfaceC2041a.mo807E();
            this.f3125J = null;
            return rMo807E;
        } finally {
            this.f3125J = null;
            this.f3126K = 0;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p081e0.InterfaceC5321l
    /* JADX INFO: renamed from: n */
    public final void mo1734n(Set<? extends Object> set) {
        Object obj;
        boolean z10;
        Object obj2;
        C5207g.m11111f(set, "values");
        do {
            obj = this.f3133c.get();
            z10 = true;
            if (obj == null ? true : C5207g.m11106a(obj, C5315i.f33586a)) {
                obj2 = set;
            } else if (obj instanceof Set) {
                obj2 = new Set[]{(Set) obj, set};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f3133c).toString());
                }
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = set;
                obj2 = objArrCopyOf;
            }
            AtomicReference<Object> atomicReference = this.f3133c;
            while (!atomicReference.compareAndSet(obj, obj2)) {
                if (atomicReference.get() != obj) {
                    z10 = false;
                    break;
                }
            }
        } while (!z10);
        if (obj == null) {
            synchronized (this.f3134d) {
                m1745y();
                C9072e c9072e = C9072e.f47360a;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0074  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p081e0.InterfaceC5321l
    /* JADX INFO: renamed from: o */
    public final void mo1735o() {
        synchronized (this.f3134d) {
            try {
                m1742v(this.f3140j);
                m1745y();
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f3135e.isEmpty()) {
                            HashSet<InterfaceC5338t0> hashSet = this.f3135e;
                            C5207g.m11111f(hashSet, "abandoning");
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!hashSet.isEmpty()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator<InterfaceC5338t0> it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        InterfaceC5338t0 next = it.next();
                                        it.remove();
                                        next.mo1536a();
                                    }
                                    C9072e c9072e2 = C9072e.f47360a;
                                    Trace.endSection();
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            }
                        }
                        throw th2;
                    } catch (Exception e10) {
                        m1723b();
                        throw e10;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    @Override // p081e0.InterfaceC5321l
    /* JADX INFO: renamed from: p */
    public final boolean mo1736p() {
        return this.f3127L.f2888C;
    }

    @Override // p081e0.InterfaceC5321l
    /* JADX INFO: renamed from: q */
    public final void mo1737q(Object obj) {
        C5207g.m11111f(obj, "value");
        synchronized (this.f3134d) {
            try {
                m1721B(obj);
                C5456d<InterfaceC5323m<?>> c5456d = this.f3139i;
                int iM11682d = c5456d.m11682d(obj);
                if (iM11682d >= 0) {
                    C5455c<InterfaceC5323m<?>> c5455cM11685g = c5456d.m11685g(iM11682d);
                    int i10 = c5455cM11685g.f34008a;
                    for (int i11 = 0; i11 < i10; i11++) {
                        m1721B(c5455cM11685g.get(i11));
                    }
                }
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cf  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p081e0.InterfaceC5321l
    /* JADX INFO: renamed from: r */
    public final void mo1738r() {
        synchronized (this.f3134d) {
            try {
                this.f3127L.f2930u.f34016a.clear();
                if (!this.f3135e.isEmpty()) {
                    HashSet<InterfaceC5338t0> hashSet = this.f3135e;
                    C5207g.m11111f(hashSet, "abandoning");
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!hashSet.isEmpty()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator<InterfaceC5338t0> it = hashSet.iterator();
                            while (it.hasNext()) {
                                InterfaceC5338t0 next = it.next();
                                it.remove();
                                next.mo1536a();
                            }
                            C9072e c9072e = C9072e.f47360a;
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                }
                C9072e c9072e2 = C9072e.f47360a;
            } catch (Throwable th3) {
                try {
                    if (!this.f3135e.isEmpty()) {
                        HashSet<InterfaceC5338t0> hashSet2 = this.f3135e;
                        C5207g.m11111f(hashSet2, "abandoning");
                        new ArrayList();
                        new ArrayList();
                        new ArrayList();
                        if (!hashSet2.isEmpty()) {
                            Trace.beginSection("Compose:abandons");
                            try {
                                Iterator<InterfaceC5338t0> it2 = hashSet2.iterator();
                                while (it2.hasNext()) {
                                    InterfaceC5338t0 next2 = it2.next();
                                    it2.remove();
                                    next2.mo1536a();
                                }
                                C9072e c9072e3 = C9072e.f47360a;
                                Trace.endSection();
                            } catch (Throwable th4) {
                                Trace.endSection();
                                throw th4;
                            }
                        }
                    }
                    throw th3;
                } catch (Exception e10) {
                    m1723b();
                    throw e10;
                }
            }
        }
    }

    @Override // p081e0.InterfaceC5321l
    /* JADX INFO: renamed from: s */
    public final boolean mo1739s(C5455c c5455c) {
        int i10 = 0;
        while (true) {
            if (!(i10 < c5455c.f34008a)) {
                return false;
            }
            int i11 = i10 + 1;
            Object obj = c5455c.f34009b[i10];
            C5207g.m11109d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            if (!this.f3137g.m11681c(obj) && !this.f3139i.m11681c(obj)) {
                i10 = i11;
            }
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p081e0.InterfaceC5321l
    /* JADX INFO: renamed from: t */
    public final boolean mo1740t() {
        boolean zM1629f0;
        synchronized (this.f3134d) {
            m1744x();
            try {
                C5454b c5454b = this.f3123H;
                this.f3123H = new C5454b();
                try {
                    zM1629f0 = this.f3127L.m1629f0(c5454b);
                    if (!zM1629f0) {
                        m1745y();
                    }
                } catch (Exception e10) {
                    this.f3123H = c5454b;
                    throw e10;
                }
            } catch (Throwable th2) {
                try {
                    if (!this.f3135e.isEmpty()) {
                        HashSet<InterfaceC5338t0> hashSet = this.f3135e;
                        C5207g.m11111f(hashSet, "abandoning");
                        new ArrayList();
                        new ArrayList();
                        new ArrayList();
                        if (!hashSet.isEmpty()) {
                            Trace.beginSection("Compose:abandons");
                            try {
                                Iterator<InterfaceC5338t0> it = hashSet.iterator();
                                while (it.hasNext()) {
                                    InterfaceC5338t0 next = it.next();
                                    it.remove();
                                    next.mo1536a();
                                }
                                C9072e c9072e = C9072e.f47360a;
                                Trace.endSection();
                            } catch (Throwable th3) {
                                Trace.endSection();
                                throw th3;
                            }
                        }
                    }
                    throw th2;
                } catch (Exception e11) {
                    m1723b();
                    throw e11;
                }
            }
        }
        return zM1629f0;
    }

    @Override // p081e0.InterfaceC5321l
    /* JADX INFO: renamed from: u */
    public final void mo1741u() {
        synchronized (this.f3134d) {
            try {
                for (Object obj : this.f3136f.f33626c) {
                    C5332q0 c5332q0 = obj instanceof C5332q0 ? (C5332q0) obj : null;
                    if (c5332q0 != null) {
                        c5332q0.invalidate();
                    }
                }
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX INFO: renamed from: v */
    public final void m1742v(ArrayList arrayList) {
        boolean z10;
        InterfaceC5299c<?> interfaceC5299c = this.f3132b;
        ArrayList arrayList2 = this.f3141k;
        a aVar = new a(this.f3135e);
        try {
            if (arrayList.isEmpty()) {
                if (arrayList2.isEmpty()) {
                    aVar.m1751e();
                    return;
                }
                return;
            }
            Trace.beginSection("Compose:applyChanges");
            try {
                interfaceC5299c.getClass();
                C0480e c0480eM11472l = this.f3136f.m11472l();
                try {
                    int size = arrayList.size();
                    int i10 = 0;
                    for (int i11 = 0; i11 < size; i11++) {
                        ((InterfaceC2057q) arrayList.get(i11)).mo1343M(interfaceC5299c, c0480eM11472l, aVar);
                    }
                    arrayList.clear();
                    C9072e c9072e = C9072e.f47360a;
                    c0480eM11472l.m1793f();
                    interfaceC5299c.mo11447g();
                    Trace.endSection();
                    aVar.m1753g();
                    aVar.m1752f();
                    aVar.m1754h();
                    if (this.f3124I) {
                        Trace.beginSection("Compose:unobserve");
                        try {
                            this.f3124I = false;
                            C5456d<C5332q0> c5456d = this.f3137g;
                            int i12 = c5456d.f34015d;
                            int i13 = 0;
                            int i14 = 0;
                            while (i13 < i12) {
                                int i15 = c5456d.f34012a[i13];
                                C5455c<C5332q0> c5455c = c5456d.f34014c[i15];
                                C5207g.m11108c(c5455c);
                                int i16 = c5455c.f34008a;
                                int i17 = i10;
                                int i18 = i17;
                                while (i17 < i16) {
                                    Object obj = c5455c.f34009b[i17];
                                    C5207g.m11109d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                    C5332q0 c5332q0 = (C5332q0) obj;
                                    if (c5332q0.f33603b == null) {
                                        z10 = false;
                                    } else {
                                        C5296b c5296b = c5332q0.f33604c;
                                        if (c5296b != null ? c5296b.m11434a() : false) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                    }
                                    if (!(!z10)) {
                                        if (i18 != i17) {
                                            c5455c.f34009b[i18] = obj;
                                        }
                                        i18++;
                                    }
                                    i17++;
                                }
                                int i19 = c5455c.f34008a;
                                for (int i20 = i18; i20 < i19; i20++) {
                                    c5455c.f34009b[i20] = null;
                                }
                                c5455c.f34008a = i18;
                                if (i18 > 0) {
                                    if (i14 != i13) {
                                        int[] iArr = c5456d.f34012a;
                                        int i21 = iArr[i14];
                                        iArr[i14] = i15;
                                        iArr[i13] = i21;
                                    }
                                    i14++;
                                }
                                i13++;
                                i10 = 0;
                            }
                            int i22 = c5456d.f34015d;
                            for (int i23 = i14; i23 < i22; i23++) {
                                c5456d.f34013b[c5456d.f34012a[i23]] = null;
                            }
                            c5456d.f34015d = i14;
                            m1743w();
                            C9072e c9072e2 = C9072e.f47360a;
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        aVar.m1751e();
                    }
                } catch (Throwable th3) {
                    c0480eM11472l.m1793f();
                    throw th3;
                }
            } catch (Throwable th4) {
                Trace.endSection();
                throw th4;
            }
        } catch (Throwable th5) {
            if (arrayList2.isEmpty()) {
                aVar.m1751e();
            }
            throw th5;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m1743w() {
        C5456d<InterfaceC5323m<?>> c5456d = this.f3139i;
        int i10 = c5456d.f34015d;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = c5456d.f34012a[i12];
            C5455c<InterfaceC5323m<?>> c5455c = c5456d.f34014c[i13];
            C5207g.m11108c(c5455c);
            int i14 = c5455c.f34008a;
            int i15 = 0;
            for (int i16 = 0; i16 < i14; i16++) {
                Object obj = c5455c.f34009b[i16];
                C5207g.m11109d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (!(!this.f3137g.m11681c((InterfaceC5323m) obj))) {
                    if (i15 != i16) {
                        c5455c.f34009b[i15] = obj;
                    }
                    i15++;
                }
            }
            int i17 = c5455c.f34008a;
            for (int i18 = i15; i18 < i17; i18++) {
                c5455c.f34009b[i18] = null;
            }
            c5455c.f34008a = i15;
            if (i15 > 0) {
                if (i11 != i12) {
                    int[] iArr = c5456d.f34012a;
                    int i19 = iArr[i11];
                    iArr[i11] = i13;
                    iArr[i12] = i19;
                }
                i11++;
            }
        }
        int i20 = c5456d.f34015d;
        for (int i21 = i11; i21 < i20; i21++) {
            c5456d.f34013b[c5456d.f34012a[i21]] = null;
        }
        c5456d.f34015d = i11;
        Iterator<C5332q0> it = this.f3138h.iterator();
        C5207g.m11110e(it, "iterator()");
        while (it.hasNext()) {
            if (!(it.next().f33608g != null)) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: x */
    public final void m1744x() {
        AtomicReference<Object> atomicReference = this.f3133c;
        Object obj = C5315i.f33586a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (C5207g.m11106a(andSet, obj)) {
                ComposerKt.m1687c("pending composition has not been applied");
                throw null;
            }
            if (andSet instanceof Set) {
                m1724c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                ComposerKt.m1687c("corrupt pendingModifications drain: " + atomicReference);
                throw null;
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                m1724c(set, true);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: y */
    public final void m1745y() {
        AtomicReference<Object> atomicReference = this.f3133c;
        Object andSet = atomicReference.getAndSet(null);
        if (C5207g.m11106a(andSet, C5315i.f33586a)) {
            return;
        }
        if (andSet instanceof Set) {
            m1724c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                m1724c(set, false);
            }
            return;
        }
        if (andSet == null) {
            ComposerKt.m1687c("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw null;
        }
        ComposerKt.m1687c("corrupt pendingModifications drain: " + atomicReference);
        throw null;
    }

    /* JADX INFO: renamed from: z */
    public final InvalidationResult m1746z(C5332q0 c5332q0, Object obj) {
        C5207g.m11111f(c5332q0, "scope");
        int i10 = c5332q0.f33602a;
        boolean z10 = false;
        if ((i10 & 2) != 0) {
            c5332q0.f33602a = i10 | 4;
        }
        C5296b c5296b = c5332q0.f33604c;
        if (c5296b != null && this.f3136f.m11473m(c5296b) && c5296b.m11434a()) {
            if (!c5296b.m11434a()) {
                return InvalidationResult.IGNORED;
            }
            if (c5332q0.f33605d != null) {
                z10 = true;
            }
            return !z10 ? InvalidationResult.IGNORED : m1720A(c5332q0, c5296b, obj);
        }
        return InvalidationResult.IGNORED;
    }
}
