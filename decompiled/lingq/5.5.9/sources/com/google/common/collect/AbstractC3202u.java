package com.google.common.collect;

import com.google.common.collect.AbstractMapBasedMultimap.C3129a.a;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.common.collect.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3202u<K, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a */
    public transient AbstractMapBasedMultimap.C3129a.a f16175a;

    /* JADX INFO: renamed from: b */
    public transient C3201t f16176b;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        AbstractMapBasedMultimap.C3129a.a aVar = this.f16175a;
        if (aVar != null) {
            return aVar;
        }
        AbstractMapBasedMultimap.C3129a.a aVar2 = ((AbstractMapBasedMultimap.C3129a) this).new a();
        this.f16175a = aVar2;
        return aVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        C3201t c3201t = this.f16176b;
        if (c3201t != null) {
            return c3201t;
        }
        C3201t c3201t2 = new C3201t(this);
        this.f16176b = c3201t2;
        return c3201t2;
    }
}
