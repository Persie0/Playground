package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.common.collect.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3192k<K, V> extends AbstractC3193l implements Map<K, V> {
    /* JADX INFO: renamed from: b */
    public abstract Map<K, V> mo9088b();

    @Override // java.util.Map
    public final void clear() {
        mo9088b().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return mo9088b().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return mo9088b().containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return mo9088b().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this && !mo9088b().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return mo9088b().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return mo9088b().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return mo9088b().isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return mo9088b().keySet();
    }

    @Override // java.util.Map
    public final V put(K k10, V v10) {
        return mo9088b().put(k10, v10);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        mo9088b().putAll(map);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        return mo9088b().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return mo9088b().size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return mo9088b().values();
    }
}
