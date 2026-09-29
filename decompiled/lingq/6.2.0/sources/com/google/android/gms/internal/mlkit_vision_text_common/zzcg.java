package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzcg extends zzbn {

    /* JADX INFO: renamed from: c */
    public final transient zzbm f12100c;

    /* JADX INFO: renamed from: d */
    public final transient Object[] f12101d;

    /* JADX INFO: renamed from: e */
    public final transient int f12102e = 1;

    public zzcg(zzbm zzbmVar, Object[] objArr) {
        this.f12100c = zzbmVar;
        this.f12101d = objArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f12100c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    /* JADX INFO: renamed from: d */
    public final int mo5492d(Object[] objArr) {
        zzbk zzcfVar = this.f12091b;
        if (zzcfVar == null) {
            zzcfVar = new zzcf(this);
            this.f12091b = zzcfVar;
        }
        return zzcfVar.mo5492d(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzbk zzcfVar = this.f12091b;
        if (zzcfVar == null) {
            zzcfVar = new zzcf(this);
            this.f12091b = zzcfVar;
        }
        return zzcfVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12102e;
    }
}
