package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
class ImmutableEntry<K, V> extends AbstractC3180c<K, V> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final K f16041a;

    /* JADX INFO: renamed from: b */
    public final V f16042b;

    public ImmutableEntry(K k10, V v10) {
        this.f16041a = k10;
        this.f16042b = v10;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f16041a;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f16042b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }
}
