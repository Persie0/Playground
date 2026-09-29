package com.google.android.gms.internal.play_billing;

import android.support.v4.media.session.C0166e;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p480xb.C10164g;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzx implements Map, Serializable {

    /* JADX INFO: renamed from: a */
    public transient zzy f14590a;

    /* JADX INFO: renamed from: b */
    public transient zzy f14591b;

    /* JADX INFO: renamed from: c */
    public transient zzr f14592c;

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        zzr zzrVar = this.f14592c;
        if (zzrVar == null) {
            zzaf zzafVar = (zzaf) this;
            zzae zzaeVar = new zzae(1, zzafVar.f14584f, zzafVar.f14583e);
            this.f14592c = zzaeVar;
            zzrVar = zzaeVar;
        }
        return zzrVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        zzy zzyVar = this.f14590a;
        if (zzyVar == null) {
            zzaf zzafVar = (zzaf) this;
            zzac zzacVar = new zzac(zzafVar, zzafVar.f14583e, zzafVar.f14584f);
            this.f14590a = zzacVar;
            zzyVar = zzacVar;
        }
        return zzyVar;
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
        zzy zzyVar = this.f14590a;
        if (zzyVar == null) {
            zzaf zzafVar = (zzaf) this;
            zzac zzacVar = new zzac(zzafVar, zzafVar.f14583e, zzafVar.f14584f);
            this.f14590a = zzacVar;
            zzyVar = zzacVar;
        }
        Iterator it = ((zzac) zzyVar).iterator();
        int iHashCode = 0;
        while (true) {
            C10164g c10164g = (C10164g) it;
            if (!c10164g.hasNext()) {
                return iHashCode;
            }
            E next = c10164g.next();
            iHashCode += next != 0 ? next.hashCode() : 0;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        zzy zzyVar = this.f14591b;
        if (zzyVar != null) {
            return zzyVar;
        }
        zzaf zzafVar = (zzaf) this;
        zzad zzadVar = new zzad(zzafVar, new zzae(0, zzafVar.f14584f, zzafVar.f14583e));
        this.f14591b = zzadVar;
        return zzadVar;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw new IllegalArgumentException(C0166e.m761g("size cannot be negative but was: ", size));
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        zzr zzrVar = this.f14592c;
        if (zzrVar == null) {
            zzaf zzafVar = (zzaf) this;
            zzae zzaeVar = new zzae(1, zzafVar.f14584f, zzafVar.f14583e);
            this.f14592c = zzaeVar;
            zzrVar = zzaeVar;
        }
        return zzrVar;
    }
}
