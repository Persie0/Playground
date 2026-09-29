package com.google.common.collect;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: com.google.common.collect.w */
/* JADX INFO: loaded from: classes.dex */
public final class C3204w extends MultimapBuilder.AbstractC3174b<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f16177a = 8;

    @Override // com.google.common.collect.MultimapBuilder.AbstractC3174b
    /* JADX INFO: renamed from: a */
    public final <K, V> Map<K, Collection<V>> mo9118a() {
        return new CompactHashMap(this.f16177a);
    }
}
