package com.google.common.collect;

import java.io.Serializable;
import p000.AbstractC2911d1;

/* JADX INFO: loaded from: classes2.dex */
class ImmutableEntry<K, V> extends AbstractC2911d1 implements Serializable {

    /* JADX INFO: renamed from: b */
    public final Object f13388b;

    /* JADX INFO: renamed from: c */
    public final Object f13389c;

    public ImmutableEntry(Object obj, Object obj2) {
        super(0, false);
        this.f13388b = obj;
        this.f13389c = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f13388b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f13389c;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
