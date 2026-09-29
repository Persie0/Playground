package com.google.common.collect;

import androidx.fragment.app.C0987y;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.common.collect.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3199r<K, V> extends C3183d0.c<Map.Entry<K, V>> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        AbstractMapBasedMultimap.C3129a.this.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return AbstractMapBasedMultimap.C3129a.this.isEmpty();
    }

    @Override // com.google.common.collect.C3183d0.c, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            Iterator<?> it = collection.iterator();
            boolean zRemove = false;
            while (it.hasNext()) {
                zRemove |= ((AbstractMapBasedMultimap.C3129a.a) this).remove(it.next());
            }
            return zRemove;
        }
    }

    @Override // com.google.common.collect.C3183d0.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        int i10;
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                C0987y.m3820b("expectedSize", size);
                i10 = size + 1;
            } else {
                i10 = size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i10);
            while (true) {
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSet.add(((Map.Entry) obj).getKey());
                    }
                }
                return AbstractMapBasedMultimap.C3129a.this.keySet().retainAll(hashSet);
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return AbstractMapBasedMultimap.C3129a.this.size();
    }
}
