package androidx.glance.appwidget.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p000.b94;
import p000.ij6;
import p000.q94;

/* JADX INFO: loaded from: classes2.dex */
public final class MapFieldLite<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: b */
    public static final MapFieldLite f6045b;

    /* JADX INFO: renamed from: a */
    public boolean f6046a = true;

    static {
        MapFieldLite mapFieldLite = new MapFieldLite();
        f6045b = mapFieldLite;
        mapFieldLite.f6046a = false;
    }

    /* JADX INFO: renamed from: a */
    public static int m2274a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof b94)) {
                return obj.hashCode();
            }
            ij6.m13946b();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = q94.f57449a;
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
    public final void m2275b() {
        if (this.f6046a) {
            return;
        }
        ij6.m13946b();
    }

    /* JADX INFO: renamed from: c */
    public final MapFieldLite m2276c() {
        if (isEmpty()) {
            return new MapFieldLite();
        }
        MapFieldLite mapFieldLite = new MapFieldLite(this);
        mapFieldLite.f6046a = true;
        return mapFieldLite;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m2275b();
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
        int iM2274a = 0;
        for (Map.Entry entry : entrySet()) {
            iM2274a += m2274a(entry.getValue()) ^ m2274a(entry.getKey());
        }
        return iM2274a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m2275b();
        Charset charset = q94.f57449a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m2275b();
        for (K k : map.keySet()) {
            Charset charset = q94.f57449a;
            k.getClass();
            map.get(k).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m2275b();
        return super.remove(obj);
    }
}
