package com.google.common.collect;

import com.google.j2objc.annotations.Weak;
import java.util.Map;

/* JADX INFO: renamed from: com.google.common.collect.s */
/* JADX INFO: loaded from: classes.dex */
public class C3200s<K, V> extends C3183d0.c<K> {

    /* JADX INFO: renamed from: a */
    @Weak
    public final Map<K, V> f16173a;

    public C3200s(Map<K, V> map) {
        map.getClass();
        this.f16173a = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f16173a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f16173a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f16173a.size();
    }
}
