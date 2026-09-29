package com.google.common.collect;

import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.google.common.collect.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractConcurrentMapC3191j<K, V> extends AbstractC3192k<K, V> implements ConcurrentMap<K, V> {
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V putIfAbsent(K k10, V v10) {
        return ((MapMakerInternalMap.AbstractSerializationProxy) this).f16073e.putIfAbsent(k10, v10);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        return ((MapMakerInternalMap.AbstractSerializationProxy) this).f16073e.remove(obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V replace(K k10, V v10) {
        return ((MapMakerInternalMap.AbstractSerializationProxy) this).f16073e.replace(k10, v10);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(K k10, V v10, V v11) {
        return ((MapMakerInternalMap.AbstractSerializationProxy) this).f16073e.replace(k10, v10, v11);
    }
}
