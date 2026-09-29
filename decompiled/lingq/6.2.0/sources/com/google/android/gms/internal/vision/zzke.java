package com.google.android.gms.internal.vision;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p000.ij6;
import p000.joc;
import p000.noc;

/* JADX INFO: loaded from: classes2.dex */
public final class zzke<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: b */
    public static final zzke f12299b;

    /* JADX INFO: renamed from: a */
    public boolean f12300a = true;

    static {
        zzke zzkeVar = new zzke();
        f12299b = zzkeVar;
        zzkeVar.f12300a = false;
    }

    /* JADX INFO: renamed from: a */
    public static int m5838a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof joc)) {
                return obj.hashCode();
            }
            ij6.m13946b();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = noc.f53082a;
        int i = length;
        for (byte b : bArr) {
            i = (i * 31) + b;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public final void m5839b() {
        if (this.f12300a) {
            return;
        }
        ij6.m13946b();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m5839b();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM5838a = 0;
        for (Map.Entry entry : entrySet()) {
            iM5838a += m5838a(entry.getValue()) ^ m5838a(entry.getKey());
        }
        return iM5838a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m5839b();
        Charset charset = noc.f53082a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m5839b();
        for (K k : map.keySet()) {
            Charset charset = noc.f53082a;
            k.getClass();
            map.get(k).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m5839b();
        return super.remove(obj);
    }
}
