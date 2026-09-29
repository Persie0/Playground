package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000.C3386nv;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbm implements Map, Serializable {

    /* JADX INFO: renamed from: a */
    public transient zzbn f12088a;

    /* JADX INFO: renamed from: b */
    public transient zzbn f12089b;

    /* JADX INFO: renamed from: c */
    public transient zzbf f12090c;

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
        zzbf zzbfVar = this.f12090c;
        if (zzbfVar == null) {
            zzci zzciVar = new zzci(((zzcj) this).f12108d, 1);
            this.f12090c = zzciVar;
            zzbfVar = zzciVar;
        }
        return zzbfVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        zzbn zzbnVar = this.f12088a;
        if (zzbnVar != null) {
            return zzbnVar;
        }
        zzcj zzcjVar = (zzcj) this;
        zzcg zzcgVar = new zzcg(zzcjVar, zzcjVar.f12108d);
        this.f12088a = zzcgVar;
        return zzcgVar;
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
        zzbn zzbnVar = this.f12088a;
        if (zzbnVar == null) {
            zzcj zzcjVar = (zzcj) this;
            zzcg zzcgVar = new zzcg(zzcjVar, zzcjVar.f12108d);
            this.f12088a = zzcgVar;
            zzbnVar = zzcgVar;
        }
        Iterator it = zzbnVar.iterator();
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
        zzbn zzbnVar = this.f12089b;
        if (zzbnVar != null) {
            return zzbnVar;
        }
        zzcj zzcjVar = (zzcj) this;
        zzch zzchVar = new zzch(zzcjVar, new zzci(zzcjVar.f12108d, 0));
        this.f12089b = zzchVar;
        return zzchVar;
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
            C3386nv.m17626m(ux5.m22988k(size, "size cannot be negative but was: "));
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
        zzbf zzbfVar = this.f12090c;
        if (zzbfVar != null) {
            return zzbfVar;
        }
        zzci zzciVar = new zzci(((zzcj) this).f12108d, 1);
        this.f12090c = zzciVar;
        return zzciVar;
    }
}
