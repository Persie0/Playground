package p166i1;

import ae.C0062b;
import cm.InterfaceC2041a;
import dm.C5207g;
import dm.C5212l;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import p100em.InterfaceC5429a;
import p338qd.C8573r0;
import p385sf.C9000b;
import sl.C9072e;

/* JADX INFO: renamed from: i1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C6151j<T> implements List<T>, InterfaceC5429a {

    /* JADX INFO: renamed from: a */
    public Object[] f35966a = new Object[16];

    /* JADX INFO: renamed from: b */
    public long[] f35967b = new long[16];

    /* JADX INFO: renamed from: c */
    public int f35968c = -1;

    /* JADX INFO: renamed from: d */
    public int f35969d;

    /* JADX INFO: renamed from: i1.j$a */
    public final class a implements ListIterator<T>, InterfaceC5429a {

        /* JADX INFO: renamed from: a */
        public int f35970a;

        /* JADX INFO: renamed from: b */
        public final int f35971b;

        /* JADX INFO: renamed from: c */
        public final int f35972c;

        public a(C6151j c6151j, int i10, int i11) {
            this((i11 & 1) != 0 ? 0 : i10, 0, (i11 & 4) != 0 ? c6151j.f35969d : 0);
        }

        public a(int i10, int i11, int i12) {
            this.f35970a = i10;
            this.f35971b = i11;
            this.f35972c = i12;
        }

        @Override // java.util.ListIterator
        public final void add(T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f35970a < this.f35972c;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f35970a > this.f35971b;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            Object[] objArr = C6151j.this.f35966a;
            int i10 = this.f35970a;
            this.f35970a = i10 + 1;
            return (T) objArr[i10];
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f35970a - this.f35971b;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            Object[] objArr = C6151j.this.f35966a;
            int i10 = this.f35970a - 1;
            this.f35970a = i10;
            return (T) objArr[i10];
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return (this.f35970a - this.f35971b) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.ListIterator
        public final void set(T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: i1.j$b */
    public final class b implements List<T>, InterfaceC5429a {

        /* JADX INFO: renamed from: a */
        public final int f35974a;

        /* JADX INFO: renamed from: b */
        public final int f35975b;

        public b(int i10, int i11) {
            this.f35974a = i10;
            this.f35975b = i11;
        }

        @Override // java.util.List
        public final void add(int i10, T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.List, java.util.Collection
        public final boolean add(T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.List
        public final boolean addAll(int i10, Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.List, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return indexOf(obj) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            C5207g.m11111f(collection, "elements");
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i10) {
            return (T) C6151j.this.f35966a[i10 + this.f35974a];
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i10 = this.f35974a;
            int i11 = this.f35975b;
            if (i10 <= i11) {
                int i12 = i10;
                while (!C5207g.m11106a(C6151j.this.f35966a[i12], obj)) {
                    if (i12 != i11) {
                        i12++;
                    }
                }
                return i12 - i10;
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f35975b - this.f35974a == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            int i10 = this.f35974a;
            return C6151j.this.new a(i10, i10, this.f35975b);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i10 = this.f35975b;
            int i11 = this.f35974a;
            if (i11 <= i10) {
                while (!C5207g.m11106a(C6151j.this.f35966a[i10], obj)) {
                    if (i10 != i11) {
                        i10--;
                    }
                }
                return i10 - i11;
            }
            return -1;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            int i10 = this.f35974a;
            return C6151j.this.new a(i10, i10, this.f35975b);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i10) {
            int i11 = this.f35974a;
            int i12 = this.f35975b;
            return C6151j.this.new a(i10 + i11, i11, i12);
        }

        @Override // java.util.List
        public final T remove(int i10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.List
        public final void replaceAll(UnaryOperator<T> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.List
        public final T set(int i10, T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f35975b - this.f35974a;
        }

        @Override // java.util.List
        public final void sort(Comparator<? super T> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final List<T> subList(int i10, int i11) {
            int i12 = this.f35974a;
            return C6151j.this.new b(i10 + i12, i12 + i11);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return C8573r0.m16728h1(this);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            C5207g.m11111f(tArr, "array");
            return (T[]) C8573r0.m16730i1(this, tArr);
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m12656a() {
        long jM11169n = C5212l.m11169n(Float.POSITIVE_INFINITY, false);
        int i10 = this.f35968c + 1;
        int iM17249o = C9000b.m17249o(this);
        if (i10 <= iM17249o) {
            while (true) {
                long j10 = this.f35967b[i10];
                if (C0062b.m401u0(j10, jM11169n) < 0) {
                    jM11169n = j10;
                }
                if (Float.intBitsToFloat((int) (jM11169n >> 32)) < 0.0f && C0062b.m414x1(jM11169n)) {
                    return jM11169n;
                }
                if (i10 != iM17249o) {
                    i10++;
                }
            }
        }
        return jM11169n;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.List
    public final void add(int i10, T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f35968c = -1;
        m12658g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        C5207g.m11111f(collection, "elements");
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m12657f(T t10, float f3, boolean z10, InterfaceC2041a<C9072e> interfaceC2041a) {
        int i10 = this.f35968c;
        int i11 = i10 + 1;
        this.f35968c = i11;
        Object[] objArr = this.f35966a;
        if (i11 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
            C5207g.m11110e(objArrCopyOf, "copyOf(this, newSize)");
            this.f35966a = objArrCopyOf;
            long[] jArrCopyOf = Arrays.copyOf(this.f35967b, length);
            C5207g.m11110e(jArrCopyOf, "copyOf(this, newSize)");
            this.f35967b = jArrCopyOf;
        }
        Object[] objArr2 = this.f35966a;
        int i12 = this.f35968c;
        objArr2[i12] = t10;
        this.f35967b[i12] = C5212l.m11169n(f3, z10);
        m12658g();
        interfaceC2041a.mo807E();
        this.f35968c = i10;
    }

    /* JADX INFO: renamed from: g */
    public final void m12658g() {
        int i10 = this.f35968c + 1;
        int iM17249o = C9000b.m17249o(this);
        if (i10 <= iM17249o) {
            while (true) {
                this.f35966a[i10] = null;
                if (i10 == iM17249o) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f35969d = this.f35968c + 1;
    }

    @Override // java.util.List
    public final T get(int i10) {
        return (T) this.f35966a[i10];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iM17249o = C9000b.m17249o(this);
        if (iM17249o < 0) {
            return -1;
        }
        int i10 = 0;
        while (!C5207g.m11106a(this.f35966a[i10], obj)) {
            if (i10 == iM17249o) {
                return -1;
            }
            i10++;
        }
        return i10;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f35969d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new a(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        for (int iM17249o = C9000b.m17249o(this); -1 < iM17249o; iM17249o--) {
            if (C5207g.m11106a(this.f35966a[iM17249o], obj)) {
                return iM17249o;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new a(this, 0, 7);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i10) {
        return new a(this, i10, 6);
    }

    @Override // java.util.List
    public final T remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.List
    public final void replaceAll(UnaryOperator<T> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.List
    public final T set(int i10, T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f35969d;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.List
    public final void sort(Comparator<? super T> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<T> subList(int i10, int i11) {
        return new b(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C8573r0.m16728h1(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        C5207g.m11111f(tArr, "array");
        return (T[]) C8573r0.m16730i1(this, tArr);
    }
}
