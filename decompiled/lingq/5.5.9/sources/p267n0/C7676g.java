package p267n0;

import androidx.compose.runtime.snapshots.AbstractC0497b;
import androidx.compose.runtime.snapshots.SnapshotKt;
import dm.C5207g;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p100em.InterfaceC5429a;
import p100em.InterfaceC5432d;
import p126g0.InterfaceC5632b;
import p126g0.InterfaceC5634d;
import p165i0.C6111d;
import p165i0.C6113f;
import p260m8.C7499b;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: renamed from: n0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7676g<K, V> extends AbstractC7678i<K, V, Map.Entry<K, V>> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7676g(C7682m<K, V> c7682m) {
        super(c7682m);
        C5207g.m11111f(c7682m, "map");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        C5207g.m11111f((Map.Entry) obj, "element");
        C7683n.m15280a();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        C5207g.m11111f(collection, "elements");
        C7683n.m15280a();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!((obj instanceof Map.Entry) && (!(obj instanceof InterfaceC5429a) || (obj instanceof InterfaceC5432d.a)))) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C5207g.m11111f(entry, "element");
        return C5207g.m11106a(this.f42168a.get(entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        C5207g.m11111f(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        C7682m<K, V> c7682m = this.f42168a;
        return new C7686q(c7682m, ((InterfaceC5632b) c7682m.m15278a().f42174c.entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        if (!((obj instanceof Map.Entry) && (!(obj instanceof InterfaceC5429a) || (obj instanceof InterfaceC5432d.a)))) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C5207g.m11111f(entry, "element");
        return this.f42168a.remove(entry.getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        C5207g.m11111f(collection, "elements");
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (this.f42168a.remove(((Map.Entry) it.next()).getKey()) != null || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        InterfaceC5634d<K, ? extends V> interfaceC5634d;
        int i10;
        boolean z10;
        AbstractC0497b abstractC0497bM1891j;
        C5207g.m11111f(collection, "elements");
        int iM14941g0 = C7499b.m14941g0(C9325m.m17681z(collection, 10));
        if (iM14941g0 < 16) {
            iM14941g0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM14941g0);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        C7682m<K, V> c7682m = this.f42168a;
        boolean z11 = false;
        do {
            synchronized (C7683n.f42176a) {
                C7682m.a aVar = c7682m.f42170a;
                C5207g.m11109d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C7682m.a aVar2 = (C7682m.a) SnapshotKt.m1889h(aVar);
                interfaceC5634d = aVar2.f42174c;
                i10 = aVar2.f42175d;
                C9072e c9072e = C9072e.f47360a;
            }
            C5207g.m11108c(interfaceC5634d);
            C6113f c6113fMo12008j = interfaceC5634d.mo12008j();
            Object it2 = c7682m.f42171b.iterator();
            while (true) {
                while (true) {
                    z10 = true;
                    if (!((AbstractC7687r) it2).hasNext()) {
                        break;
                    }
                    Map.Entry entry2 = (Map.Entry) ((C7686q) it2).next();
                    if ((linkedHashMap.containsKey(entry2.getKey()) && C5207g.m11106a(linkedHashMap.get(entry2.getKey()), entry2.getValue())) ? false : true) {
                        c6113fMo12008j.remove(entry2.getKey());
                        z11 = true;
                    }
                }
            }
            C9072e c9072e2 = C9072e.f47360a;
            C6111d<K, V> c6111dM12616a = c6113fMo12008j.m12616a();
            if (C5207g.m11106a(c6111dM12616a, interfaceC5634d)) {
                break;
            }
            synchronized (C7683n.f42176a) {
                try {
                    C7682m.a aVar3 = c7682m.f42170a;
                    C5207g.m11109d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    synchronized (SnapshotKt.f3262c) {
                        try {
                            abstractC0497bM1891j = SnapshotKt.m1891j();
                            C7682m.a aVar4 = (C7682m.a) SnapshotKt.m1903v(aVar3, c7682m, abstractC0497bM1891j);
                            if (aVar4.f42175d == i10) {
                                aVar4.m15279c(c6111dM12616a);
                                aVar4.f42175d++;
                            } else {
                                z10 = false;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    SnapshotKt.m1895n(abstractC0497bM1891j, c7682m);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } while (!z10);
        return z11;
    }
}
