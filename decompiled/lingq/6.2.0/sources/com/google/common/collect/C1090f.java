package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: com.google.common.collect.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C1090f extends C1092h implements NavigableMap {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Multimaps$CustomListMultimap f13460g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1090f(Multimaps$CustomListMultimap multimaps$CustomListMultimap, NavigableMap navigableMap) {
        super(multimaps$CustomListMultimap, navigableMap);
        this.f13460g = multimaps$CustomListMultimap;
    }

    @Override // com.google.common.collect.C1092h
    /* JADX INFO: renamed from: b */
    public final SortedSet mo6328b() {
        return new C1091g(this.f13460g, mo6330d());
    }

    @Override // com.google.common.collect.C1092h
    /* JADX INFO: renamed from: c */
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = mo6330d().ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return m6327a(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return mo6330d().ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C1090f(this.f13460g, mo6330d().descendingMap());
    }

    /* JADX INFO: renamed from: e */
    public final Map.Entry m6331e(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        List list = (List) this.f13460g.f13414f.get();
        list.addAll((Collection) entry.getValue());
        it.remove();
        return new ImmutableEntry(entry.getKey(), Collections.unmodifiableList(list));
    }

    @Override // com.google.common.collect.C1092h
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final NavigableMap mo6330d() {
        return (NavigableMap) ((SortedMap) this.f13451c);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = mo6330d().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return m6327a(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = mo6330d().floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return m6327a(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return mo6330d().floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new C1090f(this.f13460g, mo6330d().headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = mo6330d().higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return m6327a(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return mo6330d().higherKey(obj);
    }

    @Override // com.google.common.collect.C1092h, com.google.common.collect.C1087c, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = mo6330d().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return m6327a(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = mo6330d().lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return m6327a(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return mo6330d().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return m6331e(((C1085a) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return m6331e(((C1085a) ((C1087c) descendingMap()).entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new C1090f(this.f13460g, mo6330d().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new C1090f(this.f13460g, mo6330d().tailMap(obj, z));
    }

    @Override // com.google.common.collect.C1092h, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // com.google.common.collect.C1092h, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.common.collect.C1092h, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
