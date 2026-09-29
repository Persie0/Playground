package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class MapFieldLite<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: b */
    public static final MapFieldLite f5814b;

    /* JADX INFO: renamed from: a */
    public boolean f5815a;

    static {
        MapFieldLite mapFieldLite = new MapFieldLite();
        f5814b = mapFieldLite;
        mapFieldLite.f5815a = false;
    }

    private MapFieldLite() {
        this.f5815a = true;
    }

    public MapFieldLite(Map<K, V> map) {
        super(map);
        this.f5815a = true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static int m3149b(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof C0871u.a) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = C0871u.f5935a;
        int length = bArr.length;
        int i10 = length;
        for (int i11 = 0; i11 < 0 + length; i11++) {
            i10 = (i10 * 31) + bArr[i11];
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final void m3150c() {
        if (!this.f5815a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m3150c();
        super.clear();
    }

    /* JADX INFO: renamed from: d */
    public final MapFieldLite<K, V> m3151d() {
        return isEmpty() ? new MapFieldLite<>() : new MapFieldLite<>(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean z10;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this != map) {
            if (size() == map.size()) {
                Iterator<Map.Entry<K, V>> it = entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry<K, V> next = it.next();
                        if (map.containsKey(next.getKey())) {
                            V value = next.getValue();
                            Object obj2 = map.get(next.getKey());
                            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                            }
                        }
                    } else {
                        z10 = true;
                    }
                }
            }
            z10 = false;
        } else {
            z10 = true;
        }
        return z10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM3149b = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iM3149b += m3149b(entry.getValue()) ^ m3149b(entry.getKey());
        }
        return iM3149b;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        m3150c();
        Charset charset = C0871u.f5935a;
        k10.getClass();
        v10.getClass();
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        m3150c();
        for (K k10 : map.keySet()) {
            Charset charset = C0871u.f5935a;
            k10.getClass();
            map.get(k10).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m3150c();
        return (V) super.remove(obj);
    }
}
