package p000;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nal extends naq implements NavigableMap {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: d */
    transient NavigableSet f41897d;

    /* JADX INFO: renamed from: e */
    transient NavigableMap f41898e;

    /* JADX INFO: renamed from: f */
    transient NavigableSet f41899f;

    public nal(NavigableMap navigableMap, Object obj) {
        super(navigableMap, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p000.naq
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final NavigableMap mo17203c() {
        return (NavigableMap) super.mo17203c();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryM16778q;
        synchronized (this.f41902h) {
            entryM16778q = mpw.m16778q(mo17201a().ceilingEntry(obj), this.f41902h);
        }
        return entryM16778q;
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        Object objCeilingKey;
        synchronized (this.f41902h) {
            objCeilingKey = mo17201a().ceilingKey(obj);
        }
        return objCeilingKey;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        synchronized (this.f41902h) {
            NavigableSet navigableSet = this.f41897d;
            if (navigableSet != null) {
                return navigableSet;
            }
            NavigableSet navigableSetM16780s = mpw.m16780s(mo17201a().descendingKeySet(), this.f41902h);
            this.f41897d = navigableSetM16780s;
            return navigableSetM16780s;
        }
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        synchronized (this.f41902h) {
            NavigableMap navigableMap = this.f41898e;
            if (navigableMap != null) {
                return navigableMap;
            }
            NavigableMap navigableMapM16779r = mpw.m16779r(mo17201a().descendingMap(), this.f41902h);
            this.f41898e = navigableMapM16779r;
            return navigableMapM16779r;
        }
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryM16778q;
        synchronized (this.f41902h) {
            entryM16778q = mpw.m16778q(mo17201a().firstEntry(), this.f41902h);
        }
        return entryM16778q;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryM16778q;
        synchronized (this.f41902h) {
            entryM16778q = mpw.m16778q(mo17201a().floorEntry(obj), this.f41902h);
        }
        return entryM16778q;
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        Object objFloorKey;
        synchronized (this.f41902h) {
            objFloorKey = mo17201a().floorKey(obj);
        }
        return objFloorKey;
    }

    @Override // p000.naq, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryM16778q;
        synchronized (this.f41902h) {
            entryM16778q = mpw.m16778q(mo17201a().higherEntry(obj), this.f41902h);
        }
        return entryM16778q;
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        Object objHigherKey;
        synchronized (this.f41902h) {
            objHigherKey = mo17201a().higherKey(obj);
        }
        return objHigherKey;
    }

    @Override // p000.nak, java.util.Map
    public final Set keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryM16778q;
        synchronized (this.f41902h) {
            entryM16778q = mpw.m16778q(mo17201a().lastEntry(), this.f41902h);
        }
        return entryM16778q;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryM16778q;
        synchronized (this.f41902h) {
            entryM16778q = mpw.m16778q(mo17201a().lowerEntry(obj), this.f41902h);
        }
        return entryM16778q;
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        Object objLowerKey;
        synchronized (this.f41902h) {
            objLowerKey = mo17201a().lowerKey(obj);
        }
        return objLowerKey;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        synchronized (this.f41902h) {
            NavigableSet navigableSet = this.f41899f;
            if (navigableSet != null) {
                return navigableSet;
            }
            NavigableSet navigableSetM16780s = mpw.m16780s(mo17201a().navigableKeySet(), this.f41902h);
            this.f41899f = navigableSetM16780s;
            return navigableSetM16780s;
        }
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        Map.Entry entryM16778q;
        synchronized (this.f41902h) {
            entryM16778q = mpw.m16778q(mo17201a().pollFirstEntry(), this.f41902h);
        }
        return entryM16778q;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        Map.Entry entryM16778q;
        synchronized (this.f41902h) {
            entryM16778q = mpw.m16778q(mo17201a().pollLastEntry(), this.f41902h);
        }
        return entryM16778q;
    }

    @Override // p000.naq, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // p000.naq, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        NavigableMap navigableMapM16779r;
        synchronized (this.f41902h) {
            navigableMapM16779r = mpw.m16779r(mo17201a().headMap(obj, z), this.f41902h);
        }
        return navigableMapM16779r;
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        NavigableMap navigableMapM16779r;
        synchronized (this.f41902h) {
            navigableMapM16779r = mpw.m16779r(mo17201a().subMap(obj, z, obj2, z2), this.f41902h);
        }
        return navigableMapM16779r;
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        NavigableMap navigableMapM16779r;
        synchronized (this.f41902h) {
            navigableMapM16779r = mpw.m16779r(mo17201a().tailMap(obj, z), this.f41902h);
        }
        return navigableMapM16779r;
    }
}
