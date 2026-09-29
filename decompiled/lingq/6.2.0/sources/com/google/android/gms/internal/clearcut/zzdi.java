package com.google.android.gms.internal.clearcut;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p000.btb;
import p000.ij6;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdi<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: b */
    public static final zzdi f11806b;

    /* JADX INFO: renamed from: a */
    public boolean f11807a = true;

    static {
        zzdi zzdiVar = new zzdi();
        f11806b = zzdiVar;
        zzdiVar.f11807a = false;
    }

    /* JADX INFO: renamed from: b */
    public static int m5348b(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof zzge$zzv$zzb)) {
                return obj.hashCode();
            }
            ij6.m13946b();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = btb.f8994a;
        int i = length;
        for (byte b : bArr) {
            i = (i * 31) + b;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public final void m5349a() {
        if (this.f11807a) {
            return;
        }
        ij6.m13946b();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m5349a();
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
        int iM5348b = 0;
        for (Map.Entry entry : entrySet()) {
            iM5348b += m5348b(entry.getValue()) ^ m5348b(entry.getKey());
        }
        return iM5348b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m5349a();
        Charset charset = btb.f8994a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m5349a();
        for (K k : map.keySet()) {
            Charset charset = btb.f8994a;
            k.getClass();
            map.get(k).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m5349a();
        return super.remove(obj);
    }
}
