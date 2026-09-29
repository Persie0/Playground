package p165i0;

import dm.C5207g;
import java.util.Map;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: i0.b */
/* JADX INFO: loaded from: classes.dex */
public class C6109b<K, V> implements Map.Entry<K, V>, InterfaceC5429a {

    /* JADX INFO: renamed from: a */
    public final K f35920a;

    /* JADX INFO: renamed from: b */
    public final V f35921b;

    public C6109b(K k10, V v10) {
        this.f35920a = k10;
        this.f35921b = v10;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && C5207g.m11106a(entry.getKey(), this.f35920a) && C5207g.m11106a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f35920a;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.f35921b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K k10 = this.f35920a;
        int iHashCode = k10 != null ? k10.hashCode() : 0;
        V value = getValue();
        return (value != null ? value.hashCode() : 0) ^ iHashCode;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Map.Entry
    public V setValue(V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f35920a);
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
