package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p000.a94;
import p000.ij6;
import p000.p94;

/* JADX INFO: loaded from: classes.dex */
public final class MapFieldLite<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: b */
    public static final MapFieldLite f13927b;

    /* JADX INFO: renamed from: a */
    public boolean f13928a = true;

    static {
        MapFieldLite mapFieldLite = new MapFieldLite();
        f13927b = mapFieldLite;
        mapFieldLite.f13928a = false;
    }

    /* JADX INFO: renamed from: a */
    public static int m6786a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof a94)) {
                return obj.hashCode();
            }
            ij6.m13946b();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = p94.f55800a;
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
    public final void m6787b() {
        if (this.f13928a) {
            return;
        }
        ij6.m13946b();
    }

    /* JADX INFO: renamed from: c */
    public final MapFieldLite m6788c() {
        if (isEmpty()) {
            return new MapFieldLite();
        }
        MapFieldLite mapFieldLite = new MapFieldLite(this);
        mapFieldLite.f13928a = true;
        return mapFieldLite;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m6787b();
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
        int iM6786a = 0;
        for (Map.Entry entry : entrySet()) {
            iM6786a += m6786a(entry.getValue()) ^ m6786a(entry.getKey());
        }
        return iM6786a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m6787b();
        Charset charset = p94.f55800a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m6787b();
        for (K k : map.keySet()) {
            Charset charset = p94.f55800a;
            k.getClass();
            map.get(k).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m6787b();
        return super.remove(obj);
    }
}
