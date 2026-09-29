package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0873v extends C0875w {

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v$a */
    public static class a<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: a */
        public final Map.Entry<K, C0873v> f5941a;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public a() {
            throw null;
        }

        public a(Map.Entry entry) {
            this.f5941a = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f5941a.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            C0873v value = this.f5941a.getValue();
            if (value == null) {
                return null;
            }
            return value.m3445a(null);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof InterfaceC0848i0)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            C0873v value = this.f5941a.getValue();
            InterfaceC0848i0 interfaceC0848i0 = value.f5943a;
            value.f5944b = null;
            value.f5943a = (InterfaceC0848i0) obj;
            return interfaceC0848i0;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v$b */
    public static class b<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: a */
        public final Iterator<Map.Entry<K, Object>> f5942a;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.f5942a = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f5942a.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f5942a.next();
            if (next.getValue() instanceof C0873v) {
                next = new a(next);
            }
            return next;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f5942a.remove();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.C0875w
    public final boolean equals(Object obj) {
        return m3445a(null).equals(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.C0875w
    public final int hashCode() {
        return m3445a(null).hashCode();
    }

    public final String toString() {
        return m3445a(null).toString();
    }
}
