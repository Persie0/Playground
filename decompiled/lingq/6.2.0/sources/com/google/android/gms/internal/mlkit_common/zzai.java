package com.google.android.gms.internal.mlkit_common;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000.C3386nv;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzai implements Map, Serializable {

    /* JADX INFO: renamed from: a */
    public transient zzaj f11931a;

    /* JADX INFO: renamed from: b */
    public transient zzaj f11932b;

    /* JADX INFO: renamed from: c */
    public transient zzab f11933c;

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
        zzab zzabVar = this.f11933c;
        if (zzabVar == null) {
            zzaq zzaqVar = (zzaq) this;
            zzap zzapVar = new zzap(zzaqVar.f11949e, 1, zzaqVar.f11950f);
            this.f11933c = zzapVar;
            zzabVar = zzapVar;
        }
        return zzabVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        zzaj zzajVar = this.f11931a;
        if (zzajVar != null) {
            return zzajVar;
        }
        zzaq zzaqVar = (zzaq) this;
        zzan zzanVar = new zzan(zzaqVar, zzaqVar.f11949e, zzaqVar.f11950f);
        this.f11931a = zzanVar;
        return zzanVar;
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
        zzaj zzajVar = this.f11931a;
        if (zzajVar == null) {
            zzaq zzaqVar = (zzaq) this;
            zzan zzanVar = new zzan(zzaqVar, zzaqVar.f11949e, zzaqVar.f11950f);
            this.f11931a = zzanVar;
            zzajVar = zzanVar;
        }
        Iterator it = zzajVar.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        zzaj zzajVar = this.f11932b;
        if (zzajVar != null) {
            return zzajVar;
        }
        zzaq zzaqVar = (zzaq) this;
        zzao zzaoVar = new zzao(zzaqVar, new zzap(zzaqVar.f11949e, 0, zzaqVar.f11950f));
        this.f11932b = zzaoVar;
        return zzaoVar;
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
        zzab zzabVar = this.f11933c;
        if (zzabVar != null) {
            return zzabVar;
        }
        zzaq zzaqVar = (zzaq) this;
        zzap zzapVar = new zzap(zzaqVar.f11949e, 1, zzaqVar.f11950f);
        this.f11933c = zzapVar;
        return zzapVar;
    }
}
