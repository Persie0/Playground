package kotlin.reflect.jvm.internal.impl.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.j */
/* JADX INFO: loaded from: classes2.dex */
public class C6999j<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f39530f = 0;

    /* JADX INFO: renamed from: a */
    public final int f39531a;

    /* JADX INFO: renamed from: b */
    public List<C6999j<K, V>.b> f39532b = Collections.emptyList();

    /* JADX INFO: renamed from: c */
    public Map<K, V> f39533c = Collections.emptyMap();

    /* JADX INFO: renamed from: d */
    public boolean f39534d;

    /* JADX INFO: renamed from: e */
    public volatile C6999j<K, V>.d f39535e;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.j$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C10648a f39536a = new C10648a();

        /* JADX INFO: renamed from: b */
        public static final b f39537b = new b();

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.j$a$a, reason: collision with other inner class name */
        public static class C10648a implements Iterator<Object> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.j$a$b */
        public static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return a.f39536a;
            }
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.j$b */
    public class b implements Comparable<C6999j<K, V>.b>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f39538a;

        /* JADX INFO: renamed from: b */
        public V f39539b;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public b() {
            throw null;
        }

        public b(K k10, V v10) {
            this.f39538a = k10;
            this.f39539b = v10;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f39538a.compareTo(((b) obj).f39538a);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean zEquals;
            boolean zEquals2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            K k10 = this.f39538a;
            if (k10 == null) {
                zEquals = key == null;
            } else {
                zEquals = k10.equals(key);
            }
            if (zEquals) {
                V v10 = this.f39539b;
                Object value = entry.getValue();
                if (v10 == null) {
                    zEquals2 = value == null;
                } else {
                    zEquals2 = v10.equals(value);
                }
                if (zEquals2) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f39538a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f39539b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            int iHashCode = 0;
            K k10 = this.f39538a;
            int iHashCode2 = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f39539b;
            if (v10 != null) {
                iHashCode = v10.hashCode();
            }
            return iHashCode ^ iHashCode2;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            int i10 = C6999j.f39530f;
            C6999j.this.m13974b();
            V v11 = this.f39539b;
            this.f39539b = v10;
            return v11;
        }

        public final String toString() {
            String strValueOf = String.valueOf(this.f39538a);
            String strValueOf2 = String.valueOf(this.f39539b);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + strValueOf.length() + 1);
            sb2.append(strValueOf);
            sb2.append("=");
            sb2.append(strValueOf2);
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.j$c */
    public class c implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public int f39541a = -1;

        /* JADX INFO: renamed from: b */
        public boolean f39542b;

        /* JADX INFO: renamed from: c */
        public Iterator<Map.Entry<K, V>> f39543c;

        public c() {
        }

        /* JADX INFO: renamed from: a */
        public final Iterator<Map.Entry<K, V>> m13979a() {
            if (this.f39543c == null) {
                this.f39543c = C6999j.this.f39533c.entrySet().iterator();
            }
            return this.f39543c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            boolean z10 = true;
            if (this.f39541a + 1 >= C6999j.this.f39532b.size() && !m13979a().hasNext()) {
                z10 = false;
            }
            return z10;
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f39542b = true;
            int i10 = this.f39541a + 1;
            this.f39541a = i10;
            C6999j c6999j = C6999j.this;
            return i10 < c6999j.f39532b.size() ? c6999j.f39532b.get(this.f39541a) : m13979a().next();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f39542b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f39542b = false;
            int i10 = C6999j.f39530f;
            C6999j c6999j = C6999j.this;
            c6999j.m13974b();
            if (this.f39541a >= c6999j.f39532b.size()) {
                m13979a().remove();
                return;
            }
            int i11 = this.f39541a;
            this.f39541a = i11 - 1;
            c6999j.m13978f(i11);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.j$d */
    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            C6999j.this.m13977e((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C6999j.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C6999j.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C6999j.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C6999j.this.size();
        }
    }

    public C6999j(int i10) {
        this.f39531a = i10;
    }

    /* JADX INFO: renamed from: a */
    public final int m13973a(K k10) {
        int size = this.f39532b.size() - 1;
        if (size >= 0) {
            int iCompareTo = k10.compareTo(this.f39532b.get(size).f39538a);
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int iCompareTo2 = k10.compareTo(this.f39532b.get(i11).f39538a);
            if (iCompareTo2 < 0) {
                size = i11 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i11;
                }
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m13974b() {
        if (this.f39534d) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final Iterable<Map.Entry<K, V>> m13975c() {
        return this.f39533c.isEmpty() ? a.f39537b : this.f39533c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m13974b();
        if (!this.f39532b.isEmpty()) {
            this.f39532b.clear();
        }
        if (this.f39533c.isEmpty()) {
            return;
        }
        this.f39533c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m13973a(comparable) < 0 && !this.f39533c.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final SortedMap<K, V> m13976d() {
        m13974b();
        if (this.f39533c.isEmpty() && !(this.f39533c instanceof TreeMap)) {
            this.f39533c = new TreeMap();
        }
        return (SortedMap) this.f39533c;
    }

    /* JADX INFO: renamed from: e */
    public final V m13977e(K k10, V v10) {
        m13974b();
        int iM13973a = m13973a(k10);
        if (iM13973a >= 0) {
            return this.f39532b.get(iM13973a).setValue(v10);
        }
        m13974b();
        boolean zIsEmpty = this.f39532b.isEmpty();
        int i10 = this.f39531a;
        if (zIsEmpty && !(this.f39532b instanceof ArrayList)) {
            this.f39532b = new ArrayList(i10);
        }
        int i11 = -(iM13973a + 1);
        if (i11 >= i10) {
            return m13976d().put(k10, v10);
        }
        if (this.f39532b.size() == i10) {
            C6999j<K, V>.b bVarRemove = this.f39532b.remove(i10 - 1);
            m13976d().put(bVarRemove.f39538a, bVarRemove.f39539b);
        }
        this.f39532b.add(i11, new b(k10, v10));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f39535e == null) {
            this.f39535e = new d();
        }
        return this.f39535e;
    }

    /* JADX INFO: renamed from: f */
    public final V m13978f(int i10) {
        m13974b();
        V v10 = this.f39532b.remove(i10).f39539b;
        if (!this.f39533c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m13976d().entrySet().iterator();
            List<C6999j<K, V>.b> list = this.f39532b;
            Map.Entry<K, V> next = it.next();
            list.add(new b(next.getKey(), next.getValue()));
            it.remove();
        }
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM13973a = m13973a(comparable);
        return iM13973a >= 0 ? this.f39532b.get(iM13973a).f39539b : this.f39533c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m13974b();
        Comparable comparable = (Comparable) obj;
        int iM13973a = m13973a(comparable);
        if (iM13973a >= 0) {
            return m13978f(iM13973a);
        }
        if (this.f39533c.isEmpty()) {
            return null;
        }
        return this.f39533c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f39533c.size() + this.f39532b.size();
    }
}
