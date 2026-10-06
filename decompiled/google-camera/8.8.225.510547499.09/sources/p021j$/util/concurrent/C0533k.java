package p021j$.util.concurrent;

import java.util.Map;

/* JADX INFO: renamed from: j$.util.concurrent.k */
/* JADX INFO: loaded from: classes3.dex */
class C0533k implements Map.Entry {

    /* JADX INFO: renamed from: a */
    final int f33211a;

    /* JADX INFO: renamed from: b */
    final Object f33212b;

    /* JADX INFO: renamed from: c */
    volatile Object f33213c;

    /* JADX INFO: renamed from: d */
    volatile C0533k f33214d;

    C0533k(int i, Object obj, Object obj2) {
        this.f33211a = i;
        this.f33212b = obj;
        this.f33213c = obj2;
    }

    /* JADX INFO: renamed from: a */
    C0533k mo12563a(int i, Object obj) {
        Object obj2;
        if (obj == null) {
            return null;
        }
        C0533k c0533k = this;
        do {
            if (c0533k.f33211a == i && ((obj2 = c0533k.f33212b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return c0533k;
            }
            c0533k = c0533k.f33214d;
        } while (c0533k != null);
        return null;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f33212b) || key.equals(obj2)) && (value == (obj3 = this.f33213c) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f33212b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f33213c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f33212b.hashCode() ^ this.f33213c.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return AbstractC0535m.m12565b(this.f33212b, this.f33213c);
    }

    C0533k(int i, Object obj, Object obj2, C0533k c0533k) {
        this(i, obj, obj2);
        this.f33214d = c0533k;
    }
}
