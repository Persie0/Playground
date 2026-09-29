package com.google.common.collect;

/* JADX INFO: renamed from: com.google.common.collect.h */
/* JADX INFO: loaded from: classes.dex */
public final class C3189h extends CompactHashMap<Object, Object>.AbstractC3140b<Object> {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ CompactHashMap f16158e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3189h(CompactHashMap compactHashMap) {
        super();
        this.f16158e = compactHashMap;
    }

    @Override // com.google.common.collect.CompactHashMap.AbstractC3140b
    /* JADX INFO: renamed from: a */
    public final Object mo9046a(int i10) {
        Object obj = CompactHashMap.f16016j;
        return this.f16158e.m9045r(i10);
    }
}
