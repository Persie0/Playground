package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_text_common.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C0979j extends AbstractCollection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzba f12047a;

    public C0979j(zzba zzbaVar) {
        this.f12047a = zzbaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f12047a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzba zzbaVar = this.f12047a;
        Map mapM5485d = zzbaVar.m5485d();
        return mapM5485d != null ? mapM5485d.values().iterator() : new C0976g(zzbaVar, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f12047a.size();
    }
}
