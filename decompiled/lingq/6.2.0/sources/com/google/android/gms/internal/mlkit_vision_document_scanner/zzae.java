package com.google.android.gms.internal.mlkit_vision_document_scanner;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzae extends zzaa {

    /* JADX INFO: renamed from: c */
    public final transient zzz f12002c;

    /* JADX INFO: renamed from: d */
    public final transient zzx f12003d;

    public zzae(zzz zzzVar, zzx zzxVar) {
        this.f12002c = zzzVar;
        this.f12003d = zzxVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzt, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f12002c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzt
    /* JADX INFO: renamed from: h */
    public final int mo5467h(Object[] objArr) {
        return this.f12003d.mo5467h(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f12003d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }
}
