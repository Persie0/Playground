package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p000.ij6;
import p000.o94;
import p000.z84;

/* JADX INFO: loaded from: classes2.dex */
public final class MapFieldLite<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: b */
    public static final MapFieldLite f13563b;

    /* JADX INFO: renamed from: a */
    public boolean f13564a = true;

    static {
        MapFieldLite mapFieldLite = new MapFieldLite();
        f13563b = mapFieldLite;
        mapFieldLite.f13564a = false;
    }

    /* JADX INFO: renamed from: a */
    public static int m6422a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof z84)) {
                return obj.hashCode();
            }
            ij6.m13946b();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = o94.f54077a;
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
    public static MapFieldLite m6423b() {
        return f13563b;
    }

    /* JADX INFO: renamed from: c */
    public final void m6424c() {
        if (this.f13564a) {
            return;
        }
        ij6.m13946b();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m6424c();
        super.clear();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6425d() {
        return this.f13564a;
    }

    /* JADX INFO: renamed from: e */
    public final void m6426e() {
        this.f13564a = false;
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

    /* JADX INFO: renamed from: f */
    public final void m6427f(MapFieldLite mapFieldLite) {
        m6424c();
        if (mapFieldLite.isEmpty()) {
            return;
        }
        putAll(mapFieldLite);
    }

    /* JADX INFO: renamed from: g */
    public final MapFieldLite m6428g() {
        if (isEmpty()) {
            return new MapFieldLite();
        }
        MapFieldLite mapFieldLite = new MapFieldLite(this);
        mapFieldLite.f13564a = true;
        return mapFieldLite;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM6422a = 0;
        for (Map.Entry entry : entrySet()) {
            iM6422a += m6422a(entry.getValue()) ^ m6422a(entry.getKey());
        }
        return iM6422a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m6424c();
        Charset charset = o94.f54077a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m6424c();
        for (K k : map.keySet()) {
            Charset charset = o94.f54077a;
            k.getClass();
            map.get(k).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m6424c();
        return super.remove(obj);
    }
}
