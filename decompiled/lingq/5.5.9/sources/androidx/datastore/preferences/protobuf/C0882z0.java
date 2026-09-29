package androidx.datastore.preferences.protobuf;

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

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z0 */
/* JADX INFO: loaded from: classes.dex */
public class C0882z0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f5953h = 0;

    /* JADX INFO: renamed from: a */
    public final int f5954a;

    /* JADX INFO: renamed from: d */
    public boolean f5957d;

    /* JADX INFO: renamed from: e */
    public volatile C0882z0<K, V>.f f5958e;

    /* JADX INFO: renamed from: g */
    public volatile C0882z0<K, V>.b f5960g;

    /* JADX INFO: renamed from: b */
    public List<C0882z0<K, V>.d> f5955b = Collections.emptyList();

    /* JADX INFO: renamed from: c */
    public Map<K, V> f5956c = Collections.emptyMap();

    /* JADX INFO: renamed from: f */
    public Map<K, V> f5959f = Collections.emptyMap();

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z0$a */
    public class a implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public int f5961a;

        /* JADX INFO: renamed from: b */
        public Iterator<Map.Entry<K, V>> f5962b;

        public a() {
            this.f5961a = C0882z0.this.f5955b.size();
        }

        /* JADX INFO: renamed from: a */
        public final Iterator<Map.Entry<K, V>> m3508a() {
            if (this.f5962b == null) {
                this.f5962b = C0882z0.this.f5959f.entrySet().iterator();
            }
            return this.f5962b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i10 = this.f5961a;
            if (i10 <= 0 || i10 > C0882z0.this.f5955b.size()) {
                if (!m3508a().hasNext()) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (m3508a().hasNext()) {
                return m3508a().next();
            }
            List<C0882z0<K, V>.d> list = C0882z0.this.f5955b;
            int i10 = this.f5961a - 1;
            this.f5961a = i10;
            return list.get(i10);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z0$b */
    public class b extends C0882z0<K, V>.f {
        public b() {
            super();
        }

        @Override // androidx.datastore.preferences.protobuf.C0882z0.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z0$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public static final a f5965a = new a();

        /* JADX INFO: renamed from: b */
        public static final b f5966b = new b();

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z0$c$a */
        public static class a implements Iterator<Object> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z0$c$b */
        public static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return c.f5965a;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z0$d */
    public class d implements Map.Entry<K, V>, Comparable<C0882z0<K, V>.d> {

        /* JADX INFO: renamed from: a */
        public final K f5967a;

        /* JADX INFO: renamed from: b */
        public V f5968b;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public d() {
            throw null;
        }

        public d(K k10, V v10) {
            this.f5967a = k10;
            this.f5968b = v10;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f5967a.compareTo(((d) obj).f5967a);
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
            K k10 = this.f5967a;
            if (k10 == null) {
                zEquals = key == null;
            } else {
                zEquals = k10.equals(key);
            }
            if (zEquals) {
                V v10 = this.f5968b;
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
            return this.f5967a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f5968b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            int iHashCode = 0;
            K k10 = this.f5967a;
            int iHashCode2 = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f5968b;
            if (v10 != null) {
                iHashCode = v10.hashCode();
            }
            return iHashCode ^ iHashCode2;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            int i10 = C0882z0.f5953h;
            C0882z0.this.m3501b();
            V v11 = this.f5968b;
            this.f5968b = v10;
            return v11;
        }

        public final String toString() {
            return this.f5967a + "=" + this.f5968b;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z0$e */
    public class e implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public int f5970a = -1;

        /* JADX INFO: renamed from: b */
        public boolean f5971b;

        /* JADX INFO: renamed from: c */
        public Iterator<Map.Entry<K, V>> f5972c;

        public e() {
        }

        /* JADX INFO: renamed from: a */
        public final Iterator<Map.Entry<K, V>> m3509a() {
            if (this.f5972c == null) {
                this.f5972c = C0882z0.this.f5956c.entrySet().iterator();
            }
            return this.f5972c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            boolean z10 = true;
            int i10 = this.f5970a + 1;
            C0882z0 c0882z0 = C0882z0.this;
            if (i10 >= c0882z0.f5955b.size() && (c0882z0.f5956c.isEmpty() || !m3509a().hasNext())) {
                z10 = false;
            }
            return z10;
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f5971b = true;
            int i10 = this.f5970a + 1;
            this.f5970a = i10;
            C0882z0 c0882z0 = C0882z0.this;
            return i10 < c0882z0.f5955b.size() ? c0882z0.f5955b.get(this.f5970a) : m3509a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f5971b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f5971b = false;
            int i10 = C0882z0.f5953h;
            C0882z0 c0882z0 = C0882z0.this;
            c0882z0.m3501b();
            if (this.f5970a >= c0882z0.f5955b.size()) {
                m3509a().remove();
                return;
            }
            int i11 = this.f5970a;
            this.f5970a = i11 - 1;
            c0882z0.m3507i(i11);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z0$f */
    public class f extends AbstractSet<Map.Entry<K, V>> {
        public f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            C0882z0.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C0882z0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C0882z0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C0882z0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C0882z0.this.size();
        }
    }

    public C0882z0(int i10) {
        this.f5954a = i10;
    }

    /* JADX INFO: renamed from: a */
    public final int m3500a(K k10) {
        int size = this.f5955b.size() - 1;
        if (size >= 0) {
            int iCompareTo = k10.compareTo(this.f5955b.get(size).f5967a);
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
            int iCompareTo2 = k10.compareTo(this.f5955b.get(i11).f5967a);
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

    /* JADX INFO: renamed from: b */
    public final void m3501b() {
        if (this.f5957d) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final Map.Entry<K, V> m3502c(int i10) {
        return this.f5955b.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m3501b();
        if (!this.f5955b.isEmpty()) {
            this.f5955b.clear();
        }
        if (this.f5956c.isEmpty()) {
            return;
        }
        this.f5956c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m3500a(comparable) >= 0 || this.f5956c.containsKey(comparable);
    }

    /* JADX INFO: renamed from: d */
    public final int m3503d() {
        return this.f5955b.size();
    }

    /* JADX INFO: renamed from: e */
    public final Iterable<Map.Entry<K, V>> m3504e() {
        return this.f5956c.isEmpty() ? c.f5966b : this.f5956c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f5958e == null) {
            this.f5958e = new f();
        }
        return this.f5958e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0882z0)) {
            return super.equals(obj);
        }
        C0882z0 c0882z0 = (C0882z0) obj;
        int size = size();
        if (size != c0882z0.size()) {
            return false;
        }
        int iM3503d = m3503d();
        if (iM3503d != c0882z0.m3503d()) {
            return entrySet().equals(c0882z0.entrySet());
        }
        for (int i10 = 0; i10 < iM3503d; i10++) {
            if (!m3502c(i10).equals(c0882z0.m3502c(i10))) {
                return false;
            }
        }
        if (iM3503d != size) {
            return this.f5956c.equals(c0882z0.f5956c);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final SortedMap<K, V> m3505f() {
        m3501b();
        if (this.f5956c.isEmpty() && !(this.f5956c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f5956c = treeMap;
            this.f5959f = treeMap.descendingMap();
        }
        return (SortedMap) this.f5956c;
    }

    /* JADX INFO: renamed from: g */
    public void mo3495g() {
        if (!this.f5957d) {
            this.f5956c = this.f5956c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f5956c);
            this.f5959f = this.f5959f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f5959f);
            this.f5957d = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM3500a = m3500a(comparable);
        return iM3500a >= 0 ? this.f5955b.get(iM3500a).f5968b : this.f5956c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final V put(K k10, V v10) {
        m3501b();
        int iM3500a = m3500a(k10);
        if (iM3500a >= 0) {
            return this.f5955b.get(iM3500a).setValue(v10);
        }
        m3501b();
        boolean zIsEmpty = this.f5955b.isEmpty();
        int i10 = this.f5954a;
        if (zIsEmpty && !(this.f5955b instanceof ArrayList)) {
            this.f5955b = new ArrayList(i10);
        }
        int i11 = -(iM3500a + 1);
        if (i11 >= i10) {
            return m3505f().put(k10, v10);
        }
        if (this.f5955b.size() == i10) {
            C0882z0<K, V>.d dVarRemove = this.f5955b.remove(i10 - 1);
            m3505f().put(dVarRemove.f5967a, dVarRemove.f5968b);
        }
        this.f5955b.add(i11, new d(k10, v10));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM3503d = m3503d();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iM3503d; i10++) {
            iHashCode += this.f5955b.get(i10).hashCode();
        }
        return this.f5956c.size() > 0 ? iHashCode + this.f5956c.hashCode() : iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final V m3507i(int i10) {
        m3501b();
        V v10 = this.f5955b.remove(i10).f5968b;
        if (!this.f5956c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m3505f().entrySet().iterator();
            List<C0882z0<K, V>.d> list = this.f5955b;
            Map.Entry<K, V> next = it.next();
            list.add(new d(next.getKey(), next.getValue()));
            it.remove();
        }
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m3501b();
        Comparable comparable = (Comparable) obj;
        int iM3500a = m3500a(comparable);
        if (iM3500a >= 0) {
            return m3507i(iM3500a);
        }
        if (this.f5956c.isEmpty()) {
            return null;
        }
        return this.f5956c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f5956c.size() + this.f5955b.size();
    }
}
