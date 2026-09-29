package com.google.android.gms.internal.mlkit_vision_common;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzw extends zzs {

    /* JADX INFO: renamed from: c */
    public final transient zzr f11975c;

    /* JADX INFO: renamed from: d */
    public final transient Object[] f11976d;

    /* JADX INFO: renamed from: e */
    public final transient int f11977e = 1;

    public zzw(zzr zzrVar, Object[] objArr) {
        this.f11975c = zzrVar;
        this.f11976d = objArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f11975c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    /* JADX INFO: renamed from: d */
    public final int mo5456d(Object[] objArr) {
        zzp zzvVar = this.f11970b;
        if (zzvVar == null) {
            zzvVar = new zzv(this);
            this.f11970b = zzvVar;
        }
        return zzvVar.mo5456d(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzp zzvVar = this.f11970b;
        if (zzvVar == null) {
            zzvVar = new zzv(this);
            this.f11970b = zzvVar;
        }
        return zzvVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f11977e;
    }
}
