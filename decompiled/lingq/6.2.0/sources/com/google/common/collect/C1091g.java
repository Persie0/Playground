package com.google.common.collect;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: com.google.common.collect.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C1091g extends C1093i implements NavigableSet {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Multimaps$CustomListMultimap f13461d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1091g(Multimaps$CustomListMultimap multimaps$CustomListMultimap, NavigableMap navigableMap) {
        super(multimaps$CustomListMultimap, navigableMap);
        this.f13461d = multimaps$CustomListMultimap;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return mo6333d().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C1089e) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C1091g(this.f13461d, mo6333d().descendingMap());
    }

    @Override // com.google.common.collect.C1093i
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final NavigableMap mo6333d() {
        return (NavigableMap) ((SortedMap) this.f13458a);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return mo6333d().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new C1091g(this.f13461d, mo6333d().headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return mo6333d().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return mo6333d().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        C1086b c1086b = (C1086b) iterator();
        if (!c1086b.hasNext()) {
            return null;
        }
        Object next = c1086b.next();
        c1086b.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator itDescendingIterator = descendingIterator();
        if (!itDescendingIterator.hasNext()) {
            return null;
        }
        Object next = itDescendingIterator.next();
        itDescendingIterator.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new C1091g(this.f13461d, mo6333d().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new C1091g(this.f13461d, mo6333d().tailMap(obj, z));
    }

    @Override // com.google.common.collect.C1093i, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // com.google.common.collect.C1093i, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.common.collect.C1093i, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
