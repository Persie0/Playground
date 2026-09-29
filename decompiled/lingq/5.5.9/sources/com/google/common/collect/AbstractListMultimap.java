package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
abstract class AbstractListMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements InterfaceC3196o<K, V> {
    public AbstractListMultimap(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.InterfaceC3203v
    /* JADX INFO: renamed from: a */
    public final boolean mo9018a(Double d10, Integer num) {
        Collection<V> collection = this.f15984d.get(d10);
        if (collection != null) {
            if (!collection.add(num)) {
                return false;
            }
            this.f15985e++;
            return true;
        }
        List<V> list = ((Multimaps$CustomListMultimap) this).f16114f.get();
        if (!list.add(num)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f15985e++;
        this.f15984d.put(d10, list);
        return true;
    }

    @Override // com.google.common.collect.InterfaceC3203v
    /* JADX INFO: renamed from: b */
    public final AbstractMapBasedMultimap.C3129a mo9019b() {
        AbstractMapBasedMultimap.C3129a c3135g;
        AbstractMapBasedMultimap.C3129a c3129a = this.f16151c;
        if (c3129a == null) {
            Multimaps$CustomListMultimap multimaps$CustomListMultimap = (Multimaps$CustomListMultimap) this;
            Map<K, Collection<V>> map = multimaps$CustomListMultimap.f15984d;
            if (map instanceof NavigableMap) {
                c3135g = new AbstractMapBasedMultimap.C3132d((NavigableMap) multimaps$CustomListMultimap.f15984d);
            } else {
                c3135g = map instanceof SortedMap ? new AbstractMapBasedMultimap.C3135g((SortedMap) multimaps$CustomListMultimap.f15984d) : new AbstractMapBasedMultimap.C3129a(multimaps$CustomListMultimap.f15984d);
            }
            c3129a = c3135g;
            this.f16151c = c3129a;
        }
        return c3129a;
    }

    @Override // com.google.common.collect.AbstractC3182d
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }
}
