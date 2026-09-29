package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import p000.vf5;

/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractListMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements vf5 {
    @Override // p000.j56
    public final boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.f13381d.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f13382e++;
            return true;
        }
        List list = (List) ((Multimaps$CustomListMultimap) this).f13414f.get();
        if (!list.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f13382e++;
        this.f13381d.put(obj, list);
        return true;
    }
}
