package com.google.android.gms.internal.mlkit_vision_document_scanner;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000.C3386nv;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzz implements Map, Serializable {

    /* JADX INFO: renamed from: a */
    public transient zzaa f12015a;

    /* JADX INFO: renamed from: b */
    public transient zzaa f12016b;

    /* JADX INFO: renamed from: c */
    public transient zzt f12017c;

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        zzt zztVar = this.f12017c;
        if (zztVar == null) {
            zzaf zzafVar = new zzaf(((zzag) this).f12007d, 1);
            this.f12017c = zzafVar;
            zztVar = zzafVar;
        }
        return zztVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        zzaa zzaaVar = this.f12015a;
        if (zzaaVar != null) {
            return zzaaVar;
        }
        zzag zzagVar = (zzag) this;
        zzad zzadVar = new zzad(zzagVar, zzagVar.f12007d);
        this.f12015a = zzadVar;
        return zzadVar;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        zzaa zzaaVar = this.f12015a;
        if (zzaaVar == null) {
            zzag zzagVar = (zzag) this;
            zzad zzadVar = new zzad(zzagVar, zzagVar.f12007d);
            this.f12015a = zzadVar;
            zzaaVar = zzadVar;
        }
        Iterator it = zzaaVar.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        zzaa zzaaVar = this.f12016b;
        if (zzaaVar != null) {
            return zzaaVar;
        }
        zzag zzagVar = (zzag) this;
        zzae zzaeVar = new zzae(zzagVar, new zzaf(zzagVar.f12007d, 0));
        this.f12016b = zzaeVar;
        return zzaeVar;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            C3386nv.m17626m(wq1.m24124t(new StringBuilder(String.valueOf(size).length() + 33), "size cannot be negative but was: ", size));
            return null;
        }
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        zzt zztVar = this.f12017c;
        if (zztVar != null) {
            return zztVar;
        }
        zzaf zzafVar = new zzaf(((zzag) this).f12007d, 1);
        this.f12017c = zzafVar;
        return zzafVar;
    }
}
