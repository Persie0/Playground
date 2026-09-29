package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p000.C3386nv;
import p000.ddd;
import p000.ux5;
import p000.xla;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbz implements Map, Serializable {

    /* JADX INFO: renamed from: a */
    public transient zzca f12206a;

    /* JADX INFO: renamed from: b */
    public transient zzca f12207b;

    /* JADX INFO: renamed from: c */
    public transient zzbt f12208c;

    /* JADX INFO: renamed from: a */
    public static void m5673a(zzjk zzjkVar, zzjk zzjkVar2, zzjk zzjkVar3) {
        xla.m24610a(zzjkVar, "com.android.vending.billing.PURCHASES_UPDATED");
        xla.m24610a(zzjkVar2, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        xla.m24610a(zzjkVar3, "com.android.vending.billing.ALTERNATIVE_BILLING");
        zzci.m5675b(3, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", zzjkVar, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", zzjkVar2, "com.android.vending.billing.ALTERNATIVE_BILLING", zzjkVar3}, null);
    }

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
        zzbt zzbtVar = this.f12208c;
        if (zzbtVar == null) {
            zzci zzciVar = (zzci) this;
            zzch zzchVar = new zzch(zzciVar.f12224e, 1, zzciVar.f12225f);
            this.f12208c = zzchVar;
            zzbtVar = zzchVar;
        }
        return zzbtVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        zzca zzcaVar = this.f12206a;
        if (zzcaVar != null) {
            return zzcaVar;
        }
        zzci zzciVar = (zzci) this;
        zzcf zzcfVar = new zzcf(zzciVar, zzciVar.f12224e, zzciVar.f12225f);
        this.f12206a = zzcfVar;
        return zzcfVar;
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
        zzca zzcaVar = this.f12206a;
        if (zzcaVar == null) {
            zzci zzciVar = (zzci) this;
            zzcf zzcfVar = new zzcf(zzciVar, zzciVar.f12224e, zzciVar.f12225f);
            this.f12206a = zzcfVar;
            zzcaVar = zzcfVar;
        }
        return ddd.m10305b(zzcaVar);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        zzca zzcaVar = this.f12207b;
        if (zzcaVar != null) {
            return zzcaVar;
        }
        zzci zzciVar = (zzci) this;
        zzcg zzcgVar = new zzcg(zzciVar, new zzch(zzciVar.f12224e, 0, zzciVar.f12225f));
        this.f12207b = zzcgVar;
        return zzcgVar;
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
        zzbt zzbtVar = this.f12208c;
        if (zzbtVar != null) {
            return zzbtVar;
        }
        zzci zzciVar = (zzci) this;
        zzch zzchVar = new zzch(zzciVar.f12224e, 1, zzciVar.f12225f);
        this.f12208c = zzchVar;
        return zzchVar;
    }
}
