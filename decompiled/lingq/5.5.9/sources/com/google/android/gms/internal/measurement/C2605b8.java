package com.google.android.gms.internal.measurement;

import java.util.Map;
import p003a2.C0009a;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2605b8 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a */
    public final Comparable f14067a;

    /* JADX INFO: renamed from: b */
    public Object f14068b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2647e8 f14069c;

    public C2605b8(C2647e8 c2647e8, Comparable comparable, Object obj) {
        this.f14069c = c2647e8;
        this.f14067a = comparable;
        this.f14068b = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f14067a.compareTo(((C2605b8) obj).f14067a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f14067a;
        if (comparable == null) {
            zEquals = key == null;
        } else {
            zEquals = comparable.equals(key);
        }
        if (zEquals) {
            Object obj2 = this.f14068b;
            Object value = entry.getValue();
            if (obj2 == null) {
                zEquals2 = value == null;
            } else {
                zEquals2 = obj2.equals(value);
            }
            if (zEquals2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f14067a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f14068b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int iHashCode = 0;
        Comparable comparable = this.f14067a;
        int iHashCode2 = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f14068b;
        if (obj != null) {
            iHashCode = obj.hashCode();
        }
        return iHashCode ^ iHashCode2;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i10 = C2647e8.f14173g;
        this.f14069c.m7779g();
        Object obj2 = this.f14068b;
        this.f14068b = obj;
        return obj2;
    }

    public final String toString() {
        return C0009a.m21i(String.valueOf(this.f14067a), "=", String.valueOf(this.f14068b));
    }
}
