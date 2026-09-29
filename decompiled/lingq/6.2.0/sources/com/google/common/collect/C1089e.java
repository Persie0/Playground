package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.common.collect.e */
/* JADX INFO: loaded from: classes2.dex */
public class C1089e extends AbstractC1105u {

    /* JADX INFO: renamed from: a */
    public final Map f13458a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Multimaps$CustomListMultimap f13459b;

    public C1089e(Multimaps$CustomListMultimap multimaps$CustomListMultimap, Map map) {
        this.f13459b = multimaps$CustomListMultimap;
        map.getClass();
        this.f13458a = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C1086b c1086b = (C1086b) it;
            if (!c1086b.hasNext()) {
                return;
            }
            c1086b.next();
            c1086b.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f13458a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f13458a.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f13458a.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f13458a.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f13458a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1086b(this, this.f13458a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int size;
        Collection collection = (Collection) this.f13458a.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            this.f13459b.f13382e -= size;
        } else {
            size = 0;
        }
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f13458a.size();
    }
}
