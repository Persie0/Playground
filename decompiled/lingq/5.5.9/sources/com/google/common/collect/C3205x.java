package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.common.collect.x */
/* JADX INFO: loaded from: classes.dex */
public final class C3205x extends MultimapBuilder.AbstractC3174b<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Comparator f16178a;

    public C3205x(Comparator comparator) {
        this.f16178a = comparator;
    }

    @Override // com.google.common.collect.MultimapBuilder.AbstractC3174b
    /* JADX INFO: renamed from: a */
    public final <K, V> Map<K, Collection<V>> mo9118a() {
        return new TreeMap(this.f16178a);
    }
}
