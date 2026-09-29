package com.google.common.collect;

import java.util.Map;

/* JADX INFO: renamed from: com.google.common.collect.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3188g extends CompactHashMap<Object, Object>.AbstractC3140b<Map.Entry<Object, Object>> {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ CompactHashMap f16157e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3188g(CompactHashMap compactHashMap) {
        super();
        this.f16157e = compactHashMap;
    }

    @Override // com.google.common.collect.CompactHashMap.AbstractC3140b
    /* JADX INFO: renamed from: a */
    public final Map.Entry<Object, Object> mo9046a(int i10) {
        return new CompactHashMap.C3142d(i10);
    }
}
