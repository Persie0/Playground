package com.google.android.gms.internal.mlkit_common;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzan extends zzaj {

    /* JADX INFO: renamed from: c */
    public final transient zzai f11939c;

    /* JADX INFO: renamed from: d */
    public final transient Object[] f11940d;

    /* JADX INFO: renamed from: e */
    public final transient int f11941e;

    public zzan(zzai zzaiVar, Object[] objArr, int i) {
        this.f11939c = zzaiVar;
        this.f11940d = objArr;
        this.f11941e = i;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f11939c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    /* JADX INFO: renamed from: d */
    public final int mo5448d(Object[] objArr) {
        zzaf zzamVar = this.f11934b;
        if (zzamVar == null) {
            zzamVar = new zzam(this);
            this.f11934b = zzamVar;
        }
        return zzamVar.mo5448d(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzaf zzamVar = this.f11934b;
        if (zzamVar == null) {
            zzamVar = new zzam(this);
            this.f11934b = zzamVar;
        }
        return zzamVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f11941e;
    }
}
