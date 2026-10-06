package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class kax implements NavigableMap {

    /* JADX INFO: renamed from: a */
    private final NavigableMap f35497a;

    public kax(NavigableMap navigableMap) {
        this.f35497a = navigableMap;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return this.f35497a.ceilingEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return this.f35497a.ceilingKey(obj);
    }

    @Override // java.util.Map
    public final void clear() {
        this.f35497a.clear();
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.f35497a.comparator();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f35497a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f35497a.containsValue(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return this.f35497a.descendingKeySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return this.f35497a.descendingMap();
    }

    @Override // java.util.SortedMap, java.util.Map
    public final Set entrySet() {
        return this.f35497a.entrySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        return this.f35497a.firstEntry();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f35497a.firstKey();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return this.f35497a.floorEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return this.f35497a.floorKey(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f35497a.get(obj);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return this.f35497a.headMap(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return this.f35497a.higherEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return this.f35497a.higherKey(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f35497a.isEmpty();
    }

    @Override // java.util.SortedMap, java.util.Map
    public final Set keySet() {
        return this.f35497a.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        return this.f35497a.lastEntry();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f35497a.lastKey();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return this.f35497a.lowerEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return this.f35497a.lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return this.f35497a.navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return this.f35497a.pollFirstEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return this.f35497a.pollLastEntry();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return this.f35497a.put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        this.f35497a.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f35497a.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f35497a.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return this.f35497a.subMap(obj, obj2);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return this.f35497a.tailMap(obj);
    }

    @Override // java.util.SortedMap, java.util.Map
    public final Collection values() {
        return this.f35497a.values();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return this.f35497a.headMap(obj, z);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return this.f35497a.subMap(obj, z, obj2, z2);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return this.f35497a.tailMap(obj, z);
    }
}
