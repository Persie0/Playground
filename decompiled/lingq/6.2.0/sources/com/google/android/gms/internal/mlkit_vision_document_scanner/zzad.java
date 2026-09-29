package com.google.android.gms.internal.mlkit_vision_document_scanner;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzad extends zzaa {

    /* JADX INFO: renamed from: c */
    public final transient zzz f11999c;

    /* JADX INFO: renamed from: d */
    public final transient Object[] f12000d;

    /* JADX INFO: renamed from: e */
    public final transient int f12001e = 1;

    public zzad(zzz zzzVar, Object[] objArr) {
        this.f11999c = zzzVar;
        this.f12000d = objArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzt, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f11999c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzt
    /* JADX INFO: renamed from: h */
    public final int mo5467h(Object[] objArr) {
        zzx zzacVar = this.f11994b;
        if (zzacVar == null) {
            zzacVar = new zzac(this);
            this.f11994b = zzacVar;
        }
        return zzacVar.mo5467h(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzx zzacVar = this.f11994b;
        if (zzacVar == null) {
            zzacVar = new zzac(this);
            this.f11994b = zzacVar;
        }
        return zzacVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12001e;
    }
}
