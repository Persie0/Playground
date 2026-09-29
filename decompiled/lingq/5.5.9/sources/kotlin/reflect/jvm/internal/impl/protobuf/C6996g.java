package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import p282nn.C7804b;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C6996g extends C7804b {

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.g$a */
    public static class a<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: a */
        public final Map.Entry<K, C6996g> f39528a;

        public a(Map.Entry entry) {
            this.f39528a = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f39528a.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            C6996g value = this.f39528a.getValue();
            if (value == null) {
                return null;
            }
            return value.m13972a();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof InterfaceC6997h)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            C6996g value = this.f39528a.getValue();
            InterfaceC6997h interfaceC6997h = value.f42890b;
            value.f42890b = (InterfaceC6997h) obj;
            value.f42889a = true;
            return interfaceC6997h;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.g$b */
    public static class b<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: a */
        public final Iterator<Map.Entry<K, Object>> f39529a;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.f39529a = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f39529a.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f39529a.next();
            return next.getValue() instanceof C6996g ? new a(next) : next;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f39529a.remove();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final InterfaceC6997h m13972a() {
        if (this.f42890b == null) {
            synchronized (this) {
                try {
                    if (this.f42890b == null) {
                        try {
                            this.f42890b = null;
                        } catch (IOException unused) {
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f42890b;
    }

    public final boolean equals(Object obj) {
        return m13972a().equals(obj);
    }

    public final int hashCode() {
        return m13972a().hashCode();
    }

    public final String toString() {
        return m13972a().toString();
    }
}
