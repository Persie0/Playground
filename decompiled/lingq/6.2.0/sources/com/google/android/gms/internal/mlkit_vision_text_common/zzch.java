package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzch extends zzbn {

    /* JADX INFO: renamed from: c */
    public final transient zzbm f12103c;

    /* JADX INFO: renamed from: d */
    public final transient zzbk f12104d;

    public zzch(zzbm zzbmVar, zzbk zzbkVar) {
        this.f12103c = zzbmVar;
        this.f12104d = zzbkVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12103c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    /* JADX INFO: renamed from: d */
    public final int mo5492d(Object[] objArr) {
        return this.f12104d.mo5492d(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f12104d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }
}
