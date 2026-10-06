package p021j$.util.concurrent;

import java.util.Map;

/* JADX INFO: renamed from: j$.util.concurrent.j */
/* JADX INFO: loaded from: classes3.dex */
final class C0532j implements Map.Entry {

    /* JADX INFO: renamed from: a */
    final Object f33208a;

    /* JADX INFO: renamed from: b */
    Object f33209b;

    /* JADX INFO: renamed from: c */
    final ConcurrentHashMap f33210c;

    C0532j(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f33208a = obj;
        this.f33209b = obj2;
        this.f33210c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f33208a) || key.equals(obj2)) && (value == (obj3 = this.f33209b) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f33208a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f33209b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f33208a.hashCode() ^ this.f33209b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.f33209b;
        this.f33209b = obj;
        this.f33210c.put(this.f33208a, obj);
        return obj2;
    }

    public final String toString() {
        return AbstractC0535m.m12565b(this.f33208a, this.f33209b);
    }
}
