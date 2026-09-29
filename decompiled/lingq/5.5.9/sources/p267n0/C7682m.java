package p267n0;

import androidx.compose.runtime.snapshots.AbstractC0497b;
import androidx.compose.runtime.snapshots.SnapshotKt;
import dm.C5207g;
import dm.C5212l;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p100em.InterfaceC5432d;
import p126g0.InterfaceC5634d;
import p165i0.C6111d;
import p165i0.C6113f;
import sl.C9072e;

/* JADX INFO: renamed from: n0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C7682m<K, V> implements Map<K, V>, InterfaceC7690u, InterfaceC5432d {

    /* JADX INFO: renamed from: a */
    public a f42170a = new a(C5212l.m11160g0());

    /* JADX INFO: renamed from: b */
    public final C7676g f42171b = new C7676g(this);

    /* JADX INFO: renamed from: c */
    public final C7677h f42172c = new C7677h(this);

    /* JADX INFO: renamed from: d */
    public final C7679j f42173d = new C7679j(this);

    /* JADX INFO: renamed from: n0.m$a */
    public static final class a<K, V> extends AbstractC7691v {

        /* JADX INFO: renamed from: c */
        public InterfaceC5634d<K, ? extends V> f42174c;

        /* JADX INFO: renamed from: d */
        public int f42175d;

        public a(InterfaceC5634d<K, ? extends V> interfaceC5634d) {
            C5207g.m11111f(interfaceC5634d, "map");
            this.f42174c = interfaceC5634d;
        }

        @Override // p267n0.AbstractC7691v
        /* JADX INFO: renamed from: a */
        public final void mo1700a(AbstractC7691v abstractC7691v) {
            C5207g.m11111f(abstractC7691v, "value");
            a aVar = (a) abstractC7691v;
            synchronized (C7683n.f42176a) {
                try {
                    this.f42174c = aVar.f42174c;
                    this.f42175d = aVar.f42175d;
                    C9072e c9072e = C9072e.f47360a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p267n0.AbstractC7691v
        /* JADX INFO: renamed from: b */
        public final AbstractC7691v mo1701b() {
            return new a(this.f42174c);
        }

        /* JADX INFO: renamed from: c */
        public final void m15279c(InterfaceC5634d<K, ? extends V> interfaceC5634d) {
            C5207g.m11111f(interfaceC5634d, "<set-?>");
            this.f42174c = interfaceC5634d;
        }
    }

    /* JADX INFO: renamed from: a */
    public final a<K, V> m15278a() {
        a aVar = this.f42170a;
        C5207g.m11109d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (a) SnapshotKt.m1900s(aVar, this);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Map
    public final void clear() {
        AbstractC0497b abstractC0497bM1891j;
        a aVar = this.f42170a;
        C5207g.m11109d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        a aVar2 = (a) SnapshotKt.m1889h(aVar);
        C6111d c6111dM11160g0 = C5212l.m11160g0();
        if (c6111dM11160g0 != aVar2.f42174c) {
            synchronized (C7683n.f42176a) {
                a aVar3 = this.f42170a;
                C5207g.m11109d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized (SnapshotKt.f3262c) {
                    try {
                        abstractC0497bM1891j = SnapshotKt.m1891j();
                        a aVar4 = (a) SnapshotKt.m1903v(aVar3, this, abstractC0497bM1891j);
                        aVar4.f42174c = c6111dM11160g0;
                        aVar4.f42175d++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                SnapshotKt.m1895n(abstractC0497bM1891j, this);
            }
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m15278a().f42174c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m15278a().f42174c.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return this.f42171b;
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return m15278a().f42174c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return m15278a().f42174c.isEmpty();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return this.f42172c;
    }

    @Override // p267n0.InterfaceC7690u
    /* JADX INFO: renamed from: l */
    public final AbstractC7691v mo1698l() {
        return this.f42170a;
    }

    @Override // java.util.Map
    public final V put(K k10, V v10) {
        InterfaceC5634d<K, ? extends V> interfaceC5634d;
        int i10;
        V v11;
        AbstractC0497b abstractC0497bM1891j;
        boolean z10;
        do {
            Object obj = C7683n.f42176a;
            synchronized (obj) {
                a aVar = this.f42170a;
                C5207g.m11109d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar2 = (a) SnapshotKt.m1889h(aVar);
                interfaceC5634d = aVar2.f42174c;
                i10 = aVar2.f42175d;
                C9072e c9072e = C9072e.f47360a;
            }
            C5207g.m11108c(interfaceC5634d);
            C6113f c6113fMo12008j = interfaceC5634d.mo12008j();
            v11 = (V) c6113fMo12008j.put(k10, v10);
            C6111d<K, V> c6111dM12616a = c6113fMo12008j.m12616a();
            if (C5207g.m11106a(c6111dM12616a, interfaceC5634d)) {
                break;
            }
            synchronized (obj) {
                try {
                    a aVar3 = this.f42170a;
                    C5207g.m11109d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    synchronized (SnapshotKt.f3262c) {
                        try {
                            abstractC0497bM1891j = SnapshotKt.m1891j();
                            a aVar4 = (a) SnapshotKt.m1903v(aVar3, this, abstractC0497bM1891j);
                            if (aVar4.f42175d == i10) {
                                aVar4.m15279c(c6111dM12616a);
                                z10 = true;
                                aVar4.f42175d++;
                            } else {
                                z10 = false;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    SnapshotKt.m1895n(abstractC0497bM1891j, this);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } while (!z10);
        return v11;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0074 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void putAll(Map<? extends K, ? extends V> map) {
        InterfaceC5634d<K, ? extends V> interfaceC5634d;
        int i10;
        AbstractC0497b abstractC0497bM1891j;
        boolean z10;
        C5207g.m11111f(map, "from");
        do {
            Object obj = C7683n.f42176a;
            synchronized (obj) {
                try {
                    a aVar = this.f42170a;
                    C5207g.m11109d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    a aVar2 = (a) SnapshotKt.m1889h(aVar);
                    interfaceC5634d = aVar2.f42174c;
                    i10 = aVar2.f42175d;
                    C9072e c9072e = C9072e.f47360a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C5207g.m11108c(interfaceC5634d);
            C6113f c6113fMo12008j = interfaceC5634d.mo12008j();
            c6113fMo12008j.putAll(map);
            C6111d<K, V> c6111dM12616a = c6113fMo12008j.m12616a();
            if (C5207g.m11106a(c6111dM12616a, interfaceC5634d)) {
                return;
            }
            synchronized (obj) {
                a aVar3 = this.f42170a;
                C5207g.m11109d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized (SnapshotKt.f3262c) {
                    try {
                        abstractC0497bM1891j = SnapshotKt.m1891j();
                        a aVar4 = (a) SnapshotKt.m1903v(aVar3, this, abstractC0497bM1891j);
                        if (aVar4.f42175d == i10) {
                            aVar4.m15279c(c6111dM12616a);
                            z10 = true;
                            aVar4.f42175d++;
                        } else {
                            z10 = false;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                SnapshotKt.m1895n(abstractC0497bM1891j, this);
            }
        } while (!z10);
    }

    @Override // p267n0.InterfaceC7690u
    /* JADX INFO: renamed from: q */
    public final void mo1699q(AbstractC7691v abstractC7691v) {
        this.f42170a = (a) abstractC7691v;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Map
    public final V remove(Object obj) {
        InterfaceC5634d<K, ? extends V> interfaceC5634d;
        int i10;
        V v10;
        AbstractC0497b abstractC0497bM1891j;
        boolean z10;
        do {
            Object obj2 = C7683n.f42176a;
            synchronized (obj2) {
                a aVar = this.f42170a;
                C5207g.m11109d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar2 = (a) SnapshotKt.m1889h(aVar);
                interfaceC5634d = aVar2.f42174c;
                i10 = aVar2.f42175d;
                C9072e c9072e = C9072e.f47360a;
            }
            C5207g.m11108c(interfaceC5634d);
            C6113f c6113fMo12008j = interfaceC5634d.mo12008j();
            v10 = (V) c6113fMo12008j.remove(obj);
            C6111d<K, V> c6111dM12616a = c6113fMo12008j.m12616a();
            if (C5207g.m11106a(c6111dM12616a, interfaceC5634d)) {
                break;
            }
            synchronized (obj2) {
                try {
                    a aVar3 = this.f42170a;
                    C5207g.m11109d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    synchronized (SnapshotKt.f3262c) {
                        try {
                            abstractC0497bM1891j = SnapshotKt.m1891j();
                            a aVar4 = (a) SnapshotKt.m1903v(aVar3, this, abstractC0497bM1891j);
                            if (aVar4.f42175d == i10) {
                                aVar4.m15279c(c6111dM12616a);
                                z10 = true;
                                aVar4.f42175d++;
                            } else {
                                z10 = false;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    SnapshotKt.m1895n(abstractC0497bM1891j, this);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } while (!z10);
        return v10;
    }

    @Override // java.util.Map
    public final int size() {
        return m15278a().f42174c.size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.f42173d;
    }
}
