package p326q;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: q.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8451g<K, V> {

    /* JADX INFO: renamed from: a */
    public AbstractC8451g<K, V>.b f45598a;

    /* JADX INFO: renamed from: b */
    public AbstractC8451g<K, V>.c f45599b;

    /* JADX INFO: renamed from: c */
    public AbstractC8451g<K, V>.e f45600c;

    /* JADX INFO: renamed from: q.g$a */
    public final class a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public final int f45601a;

        /* JADX INFO: renamed from: b */
        public int f45602b;

        /* JADX INFO: renamed from: c */
        public int f45603c;

        /* JADX INFO: renamed from: d */
        public boolean f45604d = false;

        public a(int i10) {
            this.f45601a = i10;
            this.f45602b = AbstractC8451g.this.mo16496d();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f45603c < this.f45602b;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t10 = (T) AbstractC8451g.this.mo16494b(this.f45603c, this.f45601a);
            this.f45603c++;
            this.f45604d = true;
            return t10;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f45604d) {
                throw new IllegalStateException();
            }
            int i10 = this.f45603c - 1;
            this.f45603c = i10;
            this.f45602b--;
            this.f45604d = false;
            AbstractC8451g.this.mo16500h(i10);
        }
    }

    /* JADX INFO: renamed from: q.g$b */
    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            AbstractC8451g abstractC8451g = AbstractC8451g.this;
            int iMo16496d = abstractC8451g.mo16496d();
            for (Map.Entry<K, V> entry : collection) {
                abstractC8451g.mo16499g(entry.getKey(), entry.getValue());
            }
            return iMo16496d != abstractC8451g.mo16496d();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            AbstractC8451g.this.mo16493a();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            AbstractC8451g abstractC8451g = AbstractC8451g.this;
            int iMo16497e = abstractC8451g.mo16497e(key);
            if (iMo16497e < 0) {
                return false;
            }
            Object objMo16494b = abstractC8451g.mo16494b(iMo16497e, 1);
            Object value = entry.getValue();
            return objMo16494b == value || (objMo16494b != null && objMo16494b.equals(value));
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return AbstractC8451g.m16519j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            AbstractC8451g abstractC8451g = AbstractC8451g.this;
            int iHashCode = 0;
            for (int iMo16496d = abstractC8451g.mo16496d() - 1; iMo16496d >= 0; iMo16496d--) {
                Object objMo16494b = abstractC8451g.mo16494b(iMo16496d, 0);
                Object objMo16494b2 = abstractC8451g.mo16494b(iMo16496d, 1);
                iHashCode += (objMo16494b == null ? 0 : objMo16494b.hashCode()) ^ (objMo16494b2 == null ? 0 : objMo16494b2.hashCode());
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return AbstractC8451g.this.mo16496d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return AbstractC8451g.this.mo16496d();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: q.g$c */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            AbstractC8451g.this.mo16493a();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return AbstractC8451g.this.mo16497e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Map<K, V> mapMo16495c = AbstractC8451g.this.mo16495c();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!mapMo16495c.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return AbstractC8451g.m16519j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            AbstractC8451g abstractC8451g = AbstractC8451g.this;
            int iHashCode = 0;
            for (int iMo16496d = abstractC8451g.mo16496d() - 1; iMo16496d >= 0; iMo16496d--) {
                Object objMo16494b = abstractC8451g.mo16494b(iMo16496d, 0);
                iHashCode += objMo16494b == null ? 0 : objMo16494b.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return AbstractC8451g.this.mo16496d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            AbstractC8451g abstractC8451g = AbstractC8451g.this;
            int iMo16497e = abstractC8451g.mo16497e(obj);
            if (iMo16497e < 0) {
                return false;
            }
            abstractC8451g.mo16500h(iMo16497e);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            Map<K, V> mapMo16495c = AbstractC8451g.this.mo16495c();
            int size = mapMo16495c.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                mapMo16495c.remove(it.next());
            }
            return size != mapMo16495c.size();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return AbstractC8451g.m16520k(collection, AbstractC8451g.this.mo16495c());
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return AbstractC8451g.this.mo16496d();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            AbstractC8451g abstractC8451g = AbstractC8451g.this;
            int iMo16496d = abstractC8451g.mo16496d();
            Object[] objArr = new Object[iMo16496d];
            for (int i10 = 0; i10 < iMo16496d; i10++) {
                objArr[i10] = abstractC8451g.mo16494b(i10, 0);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC8451g.this.m16521l(0, tArr);
        }
    }

    /* JADX INFO: renamed from: q.g$d */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        public int f45608a;

        /* JADX INFO: renamed from: c */
        public boolean f45610c = false;

        /* JADX INFO: renamed from: b */
        public int f45609b = -1;

        public d() {
            this.f45608a = AbstractC8451g.this.mo16496d() - 1;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.f45610c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i10 = this.f45609b;
            AbstractC8451g abstractC8451g = AbstractC8451g.this;
            Object objMo16494b = abstractC8451g.mo16494b(i10, 0);
            if (!(key == objMo16494b || (key != null && key.equals(objMo16494b)))) {
                return false;
            }
            Object value = entry.getValue();
            Object objMo16494b2 = abstractC8451g.mo16494b(this.f45609b, 1);
            return value == objMo16494b2 || (value != null && value.equals(objMo16494b2));
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Map.Entry
        public final K getKey() {
            if (!this.f45610c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return (K) AbstractC8451g.this.mo16494b(this.f45609b, 0);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Map.Entry
        public final V getValue() {
            if (!this.f45610c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return (V) AbstractC8451g.this.mo16494b(this.f45609b, 1);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f45609b < this.f45608a;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.f45610c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            int i10 = this.f45609b;
            AbstractC8451g abstractC8451g = AbstractC8451g.this;
            Object objMo16494b = abstractC8451g.mo16494b(i10, 0);
            Object objMo16494b2 = abstractC8451g.mo16494b(this.f45609b, 1);
            return (objMo16494b == null ? 0 : objMo16494b.hashCode()) ^ (objMo16494b2 != null ? objMo16494b2.hashCode() : 0);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f45609b++;
            this.f45610c = true;
            return this;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f45610c) {
                throw new IllegalStateException();
            }
            AbstractC8451g.this.mo16500h(this.f45609b);
            this.f45609b--;
            this.f45608a--;
            this.f45610c = false;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            if (this.f45610c) {
                return (V) AbstractC8451g.this.mo16501i(this.f45609b, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX INFO: renamed from: q.g$e */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public final boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            AbstractC8451g.this.mo16493a();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return AbstractC8451g.this.mo16498f(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return AbstractC8451g.this.mo16496d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            AbstractC8451g abstractC8451g = AbstractC8451g.this;
            int iMo16498f = abstractC8451g.mo16498f(obj);
            if (iMo16498f < 0) {
                return false;
            }
            abstractC8451g.mo16500h(iMo16498f);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            AbstractC8451g abstractC8451g = AbstractC8451g.this;
            int iMo16496d = abstractC8451g.mo16496d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < iMo16496d) {
                if (collection.contains(abstractC8451g.mo16494b(i10, 1))) {
                    abstractC8451g.mo16500h(i10);
                    i10--;
                    iMo16496d--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            AbstractC8451g abstractC8451g = AbstractC8451g.this;
            int iMo16496d = abstractC8451g.mo16496d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < iMo16496d) {
                if (!collection.contains(abstractC8451g.mo16494b(i10, 1))) {
                    abstractC8451g.mo16500h(i10);
                    i10--;
                    iMo16496d--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public final int size() {
            return AbstractC8451g.this.mo16496d();
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            AbstractC8451g abstractC8451g = AbstractC8451g.this;
            int iMo16496d = abstractC8451g.mo16496d();
            Object[] objArr = new Object[iMo16496d];
            for (int i10 = 0; i10 < iMo16496d; i10++) {
                objArr[i10] = abstractC8451g.mo16494b(i10, 1);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC8451g.this.m16521l(1, tArr);
        }
    }

    /* JADX INFO: renamed from: j */
    public static <T> boolean m16519j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m16520k(Collection collection, Map map) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo16493a();

    /* JADX INFO: renamed from: b */
    public abstract Object mo16494b(int i10, int i11);

    /* JADX INFO: renamed from: c */
    public abstract Map<K, V> mo16495c();

    /* JADX INFO: renamed from: d */
    public abstract int mo16496d();

    /* JADX INFO: renamed from: e */
    public abstract int mo16497e(Object obj);

    /* JADX INFO: renamed from: f */
    public abstract int mo16498f(Object obj);

    /* JADX INFO: renamed from: g */
    public abstract void mo16499g(K k10, V v10);

    /* JADX INFO: renamed from: h */
    public abstract void mo16500h(int i10);

    /* JADX INFO: renamed from: i */
    public abstract V mo16501i(int i10, V v10);

    /* JADX INFO: renamed from: l */
    public final Object[] m16521l(int i10, Object[] objArr) {
        int iMo16496d = mo16496d();
        if (objArr.length < iMo16496d) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iMo16496d);
        }
        for (int i11 = 0; i11 < iMo16496d; i11++) {
            objArr[i11] = mo16494b(i11, i10);
        }
        if (objArr.length > iMo16496d) {
            objArr[iMo16496d] = null;
        }
        return objArr;
    }
}
