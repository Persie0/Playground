package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ComposerKt;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5207g;
import dm.C5213m;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.C6752c;
import p081e0.C5310f1;
import p081e0.InterfaceC5301c1;
import p081e0.InterfaceC5323m;
import p081e0.InterfaceC5350z0;
import p105f0.C5453a;
import p105f0.C5454b;
import p105f0.C5455c;
import p105f0.C5456d;
import p105f0.C5458f;
import p338qd.C8573r0;
import p385sf.C9000b;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class SnapshotStateObserver {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2052l<InterfaceC2041a<C9072e>, C9072e> f3283a;

    /* JADX INFO: renamed from: c */
    public boolean f3285c;

    /* JADX INFO: renamed from: g */
    public C0496a f3289g;

    /* JADX INFO: renamed from: h */
    public boolean f3290h;

    /* JADX INFO: renamed from: i */
    public ObservedScopeMap f3291i;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<Object> f3284b = new AtomicReference<>(null);

    /* JADX INFO: renamed from: d */
    public final InterfaceC2056p<Set<? extends Object>, AbstractC0497b, C9072e> f3286d = new InterfaceC2056p<Set<? extends Object>, AbstractC0497b, C9072e>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$applyObserver$1
        {
            super(2);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final C9072e mo1337m0(Set<? extends Object> set, AbstractC0497b abstractC0497b) {
            final SnapshotStateObserver snapshotStateObserver;
            boolean z10;
            Object objM13438f0;
            Set<? extends Object> set2 = set;
            C5207g.m11111f(set2, "applied");
            C5207g.m11111f(abstractC0497b, "<anonymous parameter 1>");
            do {
                snapshotStateObserver = this.f3306b;
                AtomicReference<Object> atomicReference = snapshotStateObserver.f3284b;
                Object obj = atomicReference.get();
                z10 = true;
                if (obj == null) {
                    objM13438f0 = set2;
                } else if (obj instanceof Set) {
                    objM13438f0 = C9000b.m17252r((Set) obj, set2);
                } else {
                    if (!(obj instanceof List)) {
                        ComposerKt.m1687c("Unexpected notification");
                        throw null;
                    }
                    objM13438f0 = C6752c.m13438f0(C9000b.m17251q(set2), (Collection) obj);
                }
                while (!atomicReference.compareAndSet(obj, objM13438f0)) {
                    if (atomicReference.get() != obj) {
                        z10 = false;
                        break;
                    }
                }
            } while (!z10);
            if (SnapshotStateObserver.m1908a(snapshotStateObserver)) {
                snapshotStateObserver.f3283a.mo528n(new InterfaceC2041a<C9072e>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$sendNotifications$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C9072e mo807E() {
                        do {
                            SnapshotStateObserver snapshotStateObserver2 = snapshotStateObserver;
                            synchronized (snapshotStateObserver2.f3288f) {
                                try {
                                    if (!snapshotStateObserver2.f3285c) {
                                        snapshotStateObserver2.f3285c = true;
                                        try {
                                            C5458f<SnapshotStateObserver.ObservedScopeMap> c5458f = snapshotStateObserver2.f3288f;
                                            int i10 = c5458f.f34019c;
                                            if (i10 > 0) {
                                                SnapshotStateObserver.ObservedScopeMap[] observedScopeMapArr = c5458f.f34017a;
                                                int i11 = 0;
                                                do {
                                                    SnapshotStateObserver.ObservedScopeMap observedScopeMap = observedScopeMapArr[i11];
                                                    C5455c<Object> c5455c = observedScopeMap.f3298g;
                                                    int i12 = c5455c.f34008a;
                                                    for (int i13 = 0; i13 < i12; i13++) {
                                                        observedScopeMap.f3292a.mo528n(c5455c.get(i13));
                                                    }
                                                    c5455c.clear();
                                                    i11++;
                                                } while (i11 < i10);
                                            }
                                            snapshotStateObserver2.f3285c = false;
                                        } catch (Throwable th2) {
                                            snapshotStateObserver2.f3285c = false;
                                            throw th2;
                                        }
                                    }
                                    C9072e c9072e = C9072e.f47360a;
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        } while (SnapshotStateObserver.m1908a(snapshotStateObserver));
                        return C9072e.f47360a;
                    }
                });
            }
            return C9072e.f47360a;
        }
    };

    /* JADX INFO: renamed from: e */
    public final InterfaceC2052l<Object, C9072e> f3287e = new InterfaceC2052l<Object, C9072e>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$readObserver$1
        {
            super(1);
        }

        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C9072e mo528n(Object obj) {
            C5207g.m11111f(obj, "state");
            SnapshotStateObserver snapshotStateObserver = this.f3309b;
            if (!snapshotStateObserver.f3290h) {
                synchronized (snapshotStateObserver.f3288f) {
                    SnapshotStateObserver.ObservedScopeMap observedScopeMap = snapshotStateObserver.f3291i;
                    C5207g.m11108c(observedScopeMap);
                    observedScopeMap.m1912c(obj);
                    C9072e c9072e = C9072e.f47360a;
                }
            }
            return C9072e.f47360a;
        }
    };

    /* JADX INFO: renamed from: f */
    public final C5458f<ObservedScopeMap> f3288f = new C5458f<>(new ObservedScopeMap[16]);

    public static final class ObservedScopeMap {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2052l<Object, C9072e> f3292a;

        /* JADX INFO: renamed from: b */
        public Object f3293b;

        /* JADX INFO: renamed from: c */
        public C5453a f3294c;

        /* JADX INFO: renamed from: d */
        public int f3295d;

        /* JADX INFO: renamed from: e */
        public final C5456d<Object> f3296e;

        /* JADX INFO: renamed from: f */
        public final C5454b f3297f;

        /* JADX INFO: renamed from: g */
        public final C5455c<Object> f3298g;

        /* JADX INFO: renamed from: h */
        public final InterfaceC2052l<InterfaceC5301c1<?>, C9072e> f3299h;

        /* JADX INFO: renamed from: i */
        public final InterfaceC2052l<InterfaceC5301c1<?>, C9072e> f3300i;

        /* JADX INFO: renamed from: j */
        public int f3301j;

        /* JADX INFO: renamed from: k */
        public final C5456d<InterfaceC5323m<?>> f3302k;

        /* JADX INFO: renamed from: l */
        public final HashMap<InterfaceC5323m<?>, Object> f3303l;

        public ObservedScopeMap(InterfaceC2052l<Object, C9072e> interfaceC2052l) {
            C5207g.m11111f(interfaceC2052l, "onChanged");
            this.f3292a = interfaceC2052l;
            this.f3295d = -1;
            this.f3296e = new C5456d<>();
            this.f3297f = new C5454b();
            this.f3298g = new C5455c<>();
            this.f3299h = new InterfaceC2052l<InterfaceC5301c1<?>, C9072e>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateEnterObserver$1
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(InterfaceC5301c1<?> interfaceC5301c1) {
                    C5207g.m11111f(interfaceC5301c1, "it");
                    this.f3304b.f3301j++;
                    return C9072e.f47360a;
                }
            };
            this.f3300i = new InterfaceC2052l<InterfaceC5301c1<?>, C9072e>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateExitObserver$1
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(InterfaceC5301c1<?> interfaceC5301c1) {
                    C5207g.m11111f(interfaceC5301c1, "it");
                    this.f3305b.f3301j--;
                    return C9072e.f47360a;
                }
            };
            this.f3302k = new C5456d<>();
            this.f3303l = new HashMap<>();
        }

        /* JADX INFO: renamed from: a */
        public static final void m1910a(ObservedScopeMap observedScopeMap, Object obj) {
            C5453a c5453a = observedScopeMap.f3294c;
            if (c5453a != null) {
                int i10 = c5453a.f34002a;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj2 = c5453a.f34003b[i12];
                    C5207g.m11109d(obj2, "null cannot be cast to non-null type kotlin.Any");
                    int i13 = c5453a.f34004c[i12];
                    boolean z10 = i13 != observedScopeMap.f3295d;
                    if (z10) {
                        C5456d<Object> c5456d = observedScopeMap.f3296e;
                        c5456d.m11683e(obj2, obj);
                        if ((obj2 instanceof InterfaceC5323m) && !c5456d.m11681c(obj2)) {
                            observedScopeMap.f3302k.m11684f((InterfaceC5323m<?>) obj2);
                            observedScopeMap.f3303l.remove(obj2);
                        }
                    }
                    if (!z10) {
                        if (i11 != i12) {
                            c5453a.f34003b[i11] = obj2;
                            c5453a.f34004c[i11] = i13;
                        }
                        i11++;
                    }
                }
                int i14 = c5453a.f34002a;
                for (int i15 = i11; i15 < i14; i15++) {
                    c5453a.f34003b[i15] = null;
                }
                c5453a.f34002a = i11;
            }
        }

        /* JADX INFO: renamed from: b */
        public final boolean m1911b(Set<? extends Object> set) {
            int iM11682d;
            int iM11682d2;
            boolean z10 = false;
            for (Object obj : set) {
                C5456d<InterfaceC5323m<?>> c5456d = this.f3302k;
                boolean zM11681c = c5456d.m11681c(obj);
                C5455c<Object> c5455c = this.f3298g;
                C5456d<Object> c5456d2 = this.f3296e;
                if (zM11681c && (iM11682d = c5456d.m11682d(obj)) >= 0) {
                    C5455c<InterfaceC5323m<?>> c5455cM11685g = c5456d.m11685g(iM11682d);
                    int i10 = c5455cM11685g.f34008a;
                    for (int i11 = 0; i11 < i10; i11++) {
                        InterfaceC5323m<?> interfaceC5323m = c5455cM11685g.get(i11);
                        Object obj2 = this.f3303l.get(interfaceC5323m);
                        InterfaceC5350z0<?> interfaceC5350z0Mo1694a = interfaceC5323m.mo1694a();
                        if (interfaceC5350z0Mo1694a == null) {
                            interfaceC5350z0Mo1694a = C5310f1.f33583a;
                        }
                        if (!interfaceC5350z0Mo1694a.mo11451a(interfaceC5323m.mo1695c(), obj2) && (iM11682d2 = c5456d2.m11682d(interfaceC5323m)) >= 0) {
                            C5455c<Object> c5455cM11685g2 = c5456d2.m11685g(iM11682d2);
                            int i12 = c5455cM11685g2.f34008a;
                            int i13 = 0;
                            while (i13 < i12) {
                                c5455c.add(c5455cM11685g2.get(i13));
                                i13++;
                                z10 = true;
                            }
                        }
                    }
                }
                int iM11682d3 = c5456d2.m11682d(obj);
                if (iM11682d3 >= 0) {
                    C5455c<Object> c5455cM11685g3 = c5456d2.m11685g(iM11682d3);
                    int i14 = c5455cM11685g3.f34008a;
                    int i15 = 0;
                    while (i15 < i14) {
                        c5455c.add(c5455cM11685g3.get(i15));
                        i15++;
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        /* JADX INFO: renamed from: c */
        public final void m1912c(Object obj) {
            C5207g.m11111f(obj, "value");
            if (this.f3301j > 0) {
                return;
            }
            Object obj2 = this.f3293b;
            C5207g.m11108c(obj2);
            C5453a c5453a = this.f3294c;
            if (c5453a == null) {
                c5453a = new C5453a();
                this.f3294c = c5453a;
                this.f3297f.m11677d(obj2, c5453a);
            }
            int iM11673a = c5453a.m11673a(this.f3295d, obj);
            if ((obj instanceof InterfaceC5323m) && iM11673a != this.f3295d) {
                InterfaceC5323m interfaceC5323m = (InterfaceC5323m) obj;
                for (Object obj3 : interfaceC5323m.mo1696d()) {
                    if (obj3 == null) {
                        break;
                    }
                    this.f3302k.m11679a(obj3, obj);
                }
                this.f3303l.put(obj, interfaceC5323m.mo1695c());
            }
            if (iM11673a == -1) {
                this.f3296e.m11679a(obj, obj2);
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m1913d(InterfaceC2052l<Object, Boolean> interfaceC2052l) {
            C5454b c5454b = this.f3297f;
            int i10 = c5454b.f34005a;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = c5454b.f34006b[i12];
                C5207g.m11109d(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                C5453a c5453a = (C5453a) ((Object[]) c5454b.f34007c)[i12];
                Boolean boolMo528n = interfaceC2052l.mo528n(obj);
                if (boolMo528n.booleanValue()) {
                    int i13 = c5453a.f34002a;
                    for (int i14 = 0; i14 < i13; i14++) {
                        Object obj2 = c5453a.f34003b[i14];
                        C5207g.m11109d(obj2, "null cannot be cast to non-null type kotlin.Any");
                        int i15 = c5453a.f34004c[i14];
                        C5456d<Object> c5456d = this.f3296e;
                        c5456d.m11683e(obj2, obj);
                        if ((obj2 instanceof InterfaceC5323m) && !c5456d.m11681c(obj2)) {
                            this.f3302k.m11684f((InterfaceC5323m<?>) obj2);
                            this.f3303l.remove(obj2);
                        }
                    }
                }
                if (!boolMo528n.booleanValue()) {
                    if (i11 != i12) {
                        c5454b.f34006b[i11] = obj;
                        Object[] objArr = (Object[]) c5454b.f34007c;
                        objArr[i11] = objArr[i12];
                    }
                    i11++;
                }
            }
            int i16 = c5454b.f34005a;
            if (i16 > i11) {
                for (int i17 = i11; i17 < i16; i17++) {
                    c5454b.f34006b[i17] = null;
                    ((Object[]) c5454b.f34007c)[i17] = null;
                }
                c5454b.f34005a = i11;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateObserver(InterfaceC2052l<? super InterfaceC2041a<C9072e>, C9072e> interfaceC2052l) {
        this.f3283a = interfaceC2052l;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005a A[LOOP:3: B:28:0x005b->B:27:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x006d  */
    /* JADX WARN: Code duplicated, block: B:76:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final boolean m1908a(SnapshotStateObserver snapshotStateObserver) {
        boolean z10;
        Set<? extends Object> set;
        Object obj;
        Object[] objArr;
        Set<? extends Object> set2;
        synchronized (snapshotStateObserver.f3288f) {
            z10 = snapshotStateObserver.f3285c;
        }
        if (z10) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            while (true) {
                AtomicReference<Object> atomicReference = snapshotStateObserver.f3284b;
                Object obj2 = atomicReference.get();
                Object objSubList = null;
                if (obj2 != null) {
                    if (obj2 instanceof Set) {
                        set = (Set) obj2;
                    } else {
                        if (!(obj2 instanceof List)) {
                            ComposerKt.m1687c("Unexpected notification");
                            throw null;
                        }
                        List list = (List) obj2;
                        set = (Set) list.get(0);
                        if (list.size() == 2) {
                            objSubList = list.get(1);
                        } else if (list.size() > 2) {
                            objSubList = list.subList(1, list.size());
                        }
                        obj = objSubList;
                        while (true) {
                            if (atomicReference.compareAndSet(obj2, obj)) {
                                objArr = true;
                                break;
                            }
                            if (atomicReference.get() != obj2) {
                                objArr = false;
                                break;
                            }
                        }
                        set2 = objArr == true ? set : null;
                    }
                    obj = objSubList;
                    while (true) {
                        if (atomicReference.compareAndSet(obj2, obj)) {
                            objArr = true;
                            break;
                            break;
                        }
                        if (atomicReference.get() != obj2) {
                            objArr = false;
                            break;
                            break;
                        }
                    }
                    if (objArr == true) {
                    }
                }
                if (set2 == null) {
                    return z11;
                }
                synchronized (snapshotStateObserver.f3288f) {
                    try {
                        C5458f<ObservedScopeMap> c5458f = snapshotStateObserver.f3288f;
                        int i10 = c5458f.f34019c;
                        if (i10 > 0) {
                            ObservedScopeMap[] observedScopeMapArr = c5458f.f34017a;
                            int i11 = 0;
                            do {
                                z11 = observedScopeMapArr[i11].m1911b(set2) || z11;
                                i11++;
                            } while (i11 < i10);
                        }
                        C9072e c9072e = C9072e.f47360a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: b */
    public final <T> void m1909b(T t10, InterfaceC2052l<? super T, C9072e> interfaceC2052l, final InterfaceC2041a<C9072e> interfaceC2041a) {
        ObservedScopeMap observedScopeMap;
        ObservedScopeMap observedScopeMap2;
        C5207g.m11111f(t10, "scope");
        C5207g.m11111f(interfaceC2052l, "onValueChangedForScope");
        synchronized (this.f3288f) {
            C5458f<ObservedScopeMap> c5458f = this.f3288f;
            int i10 = c5458f.f34019c;
            if (i10 <= 0) {
                observedScopeMap = null;
                break;
            }
            ObservedScopeMap[] observedScopeMapArr = c5458f.f34017a;
            int i11 = 0;
            while (true) {
                observedScopeMap = observedScopeMapArr[i11];
                if (observedScopeMap.f3292a == interfaceC2052l) {
                    break;
                }
                i11++;
                if (i11 >= i10) {
                    observedScopeMap = null;
                    break;
                }
            }
            observedScopeMap2 = observedScopeMap;
            if (observedScopeMap2 == null) {
                C5213m.m11200e(1, interfaceC2052l);
                observedScopeMap2 = new ObservedScopeMap(interfaceC2052l);
                c5458f.m11687b(observedScopeMap2);
            }
        }
        boolean z10 = this.f3290h;
        ObservedScopeMap observedScopeMap3 = this.f3291i;
        try {
            this.f3290h = false;
            this.f3291i = observedScopeMap2;
            Object obj = observedScopeMap2.f3293b;
            C5453a c5453a = observedScopeMap2.f3294c;
            int i12 = observedScopeMap2.f3295d;
            observedScopeMap2.f3293b = t10;
            observedScopeMap2.f3294c = (C5453a) observedScopeMap2.f3297f.m11676c(t10);
            if (observedScopeMap2.f3295d == -1) {
                observedScopeMap2.f3295d = SnapshotKt.m1891j().mo1918d();
            }
            C8573r0.m16688N0(new InterfaceC2041a<C9072e>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$observeReads$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C9072e mo807E() {
                    AbstractC0497b.a.m1924a(interfaceC2041a, this.f3307b.f3287e);
                    return C9072e.f47360a;
                }
            }, observedScopeMap2.f3299h, observedScopeMap2.f3300i);
            Object obj2 = observedScopeMap2.f3293b;
            C5207g.m11108c(obj2);
            ObservedScopeMap.m1910a(observedScopeMap2, obj2);
            observedScopeMap2.f3293b = obj;
            observedScopeMap2.f3294c = c5453a;
            observedScopeMap2.f3295d = i12;
            this.f3291i = observedScopeMap3;
            this.f3290h = z10;
        } catch (Throwable th2) {
            this.f3291i = observedScopeMap3;
            this.f3290h = z10;
            throw th2;
        }
    }
}
