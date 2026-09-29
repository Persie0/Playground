package p105f0;

import dm.C5207g;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p100em.InterfaceC5429a;
import p100em.InterfaceC5431c;
import p338qd.C8573r0;
import p385sf.C9000b;
import tl.C9322j;

/* JADX INFO: renamed from: f0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C5458f<T> implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public T[] f34017a;

    /* JADX INFO: renamed from: b */
    public a f34018b;

    /* JADX INFO: renamed from: c */
    public int f34019c = 0;

    /* JADX INFO: renamed from: f0.f$a */
    public static final class a<T> implements List<T>, InterfaceC5431c {

        /* JADX INFO: renamed from: a */
        public final C5458f<T> f34020a;

        public a(C5458f<T> c5458f) {
            C5207g.m11111f(c5458f, "vector");
            this.f34020a = c5458f;
        }

        @Override // java.util.List
        public final void add(int i10, T t10) {
            this.f34020a.m11686a(i10, t10);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t10) {
            this.f34020a.m11687b(t10);
            return true;
        }

        @Override // java.util.List
        public final boolean addAll(int i10, Collection<? extends T> collection) {
            C5207g.m11111f(collection, "elements");
            return this.f34020a.m11689f(i10, collection);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            C5207g.m11111f(collection, "elements");
            C5458f<T> c5458f = this.f34020a;
            c5458f.getClass();
            return c5458f.m11689f(c5458f.f34019c, collection);
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.f34020a.m11691h();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f34020a.m11692i(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            C5207g.m11111f(collection, "elements");
            C5458f<T> c5458f = this.f34020a;
            c5458f.getClass();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!c5458f.m11692i(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i10) {
            C8573r0.m16764v(i10, this);
            return this.f34020a.f34017a[i10];
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            C5458f<T> c5458f = this.f34020a;
            int i10 = c5458f.f34019c;
            if (i10 > 0) {
                T[] tArr = c5458f.f34017a;
                int i11 = 0;
                while (!C5207g.m11106a(obj, tArr[i11])) {
                    i11++;
                    if (i11 >= i10) {
                    }
                }
                return i11;
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f34020a.m11694k();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new c(0, this);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            C5458f<T> c5458f = this.f34020a;
            int i10 = c5458f.f34019c;
            if (i10 > 0) {
                int i11 = i10 - 1;
                T[] tArr = c5458f.f34017a;
                while (!C5207g.m11106a(obj, tArr[i11])) {
                    i11--;
                    if (i11 < 0) {
                    }
                }
                return i11;
            }
            return -1;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new c(0, this);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i10) {
            return new c(i10, this);
        }

        @Override // java.util.List
        public final T remove(int i10) {
            C8573r0.m16764v(i10, this);
            return this.f34020a.m11697n(i10);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.f34020a.m11696m(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            C5207g.m11111f(collection, "elements");
            C5458f<T> c5458f = this.f34020a;
            c5458f.getClass();
            if (collection.isEmpty()) {
                return false;
            }
            int i10 = c5458f.f34019c;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                c5458f.m11696m(it.next());
            }
            return i10 != c5458f.f34019c;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            C5207g.m11111f(collection, "elements");
            C5458f<T> c5458f = this.f34020a;
            c5458f.getClass();
            int i10 = c5458f.f34019c;
            for (int i11 = i10 - 1; -1 < i11; i11--) {
                if (!collection.contains(c5458f.f34017a[i11])) {
                    c5458f.m11697n(i11);
                }
            }
            return i10 != c5458f.f34019c;
        }

        @Override // java.util.List
        public final T set(int i10, T t10) {
            C8573r0.m16764v(i10, this);
            T[] tArr = this.f34020a.f34017a;
            T t11 = tArr[i10];
            tArr[i10] = t10;
            return t11;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f34020a.f34019c;
        }

        @Override // java.util.List
        public final List<T> subList(int i10, int i11) {
            C8573r0.m16766w(i10, i11, this);
            return new b(i10, i11, this);
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

    /* JADX INFO: renamed from: f0.f$b */
    public static final class b<T> implements List<T>, InterfaceC5431c {

        /* JADX INFO: renamed from: a */
        public final List<T> f34021a;

        /* JADX INFO: renamed from: b */
        public final int f34022b;

        /* JADX INFO: renamed from: c */
        public int f34023c;

        public b(int i10, int i11, List list) {
            C5207g.m11111f(list, "list");
            this.f34021a = list;
            this.f34022b = i10;
            this.f34023c = i11;
        }

        @Override // java.util.List
        public final void add(int i10, T t10) {
            this.f34021a.add(i10 + this.f34022b, t10);
            this.f34023c++;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t10) {
            int i10 = this.f34023c;
            this.f34023c = i10 + 1;
            this.f34021a.add(i10, t10);
            return true;
        }

        @Override // java.util.List
        public final boolean addAll(int i10, Collection<? extends T> collection) {
            C5207g.m11111f(collection, "elements");
            this.f34021a.addAll(i10 + this.f34022b, collection);
            this.f34023c = collection.size() + this.f34023c;
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            C5207g.m11111f(collection, "elements");
            this.f34021a.addAll(this.f34023c, collection);
            this.f34023c = collection.size() + this.f34023c;
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i10 = this.f34023c - 1;
            int i11 = this.f34022b;
            if (i11 <= i10) {
                while (true) {
                    this.f34021a.remove(i10);
                    if (i10 == i11) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            this.f34023c = i11;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i10 = this.f34023c;
            for (int i11 = this.f34022b; i11 < i10; i11++) {
                if (C5207g.m11106a(this.f34021a.get(i11), obj)) {
                    return true;
                }
            }
            return false;
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
            C8573r0.m16764v(i10, this);
            return this.f34021a.get(i10 + this.f34022b);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i10 = this.f34023c;
            int i11 = this.f34022b;
            for (int i12 = i11; i12 < i10; i12++) {
                if (C5207g.m11106a(this.f34021a.get(i12), obj)) {
                    return i12 - i11;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f34023c == this.f34022b;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new c(0, this);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i10 = this.f34023c - 1;
            int i11 = this.f34022b;
            if (i11 <= i10) {
                while (!C5207g.m11106a(this.f34021a.get(i10), obj)) {
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
            return new c(0, this);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i10) {
            return new c(i10, this);
        }

        @Override // java.util.List
        public final T remove(int i10) {
            C8573r0.m16764v(i10, this);
            T tRemove = this.f34021a.remove(i10 + this.f34022b);
            this.f34023c--;
            return tRemove;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i10 = this.f34023c;
            for (int i11 = this.f34022b; i11 < i10; i11++) {
                List<T> list = this.f34021a;
                if (C5207g.m11106a(list.get(i11), obj)) {
                    list.remove(i11);
                    this.f34023c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            C5207g.m11111f(collection, "elements");
            int i10 = this.f34023c;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.f34023c;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            C5207g.m11111f(collection, "elements");
            int i10 = this.f34023c;
            int i11 = i10 - 1;
            int i12 = this.f34022b;
            if (i12 <= i11) {
                while (true) {
                    List<T> list = this.f34021a;
                    if (!collection.contains(list.get(i11))) {
                        list.remove(i11);
                        this.f34023c--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.f34023c;
        }

        @Override // java.util.List
        public final T set(int i10, T t10) {
            C8573r0.m16764v(i10, this);
            return this.f34021a.set(i10 + this.f34022b, t10);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f34023c - this.f34022b;
        }

        @Override // java.util.List
        public final List<T> subList(int i10, int i11) {
            C8573r0.m16766w(i10, i11, this);
            return new b(i10, i11, this);
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

    /* JADX INFO: renamed from: f0.f$c */
    public static final class c<T> implements ListIterator<T>, InterfaceC5429a {

        /* JADX INFO: renamed from: a */
        public final List<T> f34024a;

        /* JADX INFO: renamed from: b */
        public int f34025b;

        public c(int i10, List list) {
            C5207g.m11111f(list, "list");
            this.f34024a = list;
            this.f34025b = i10;
        }

        @Override // java.util.ListIterator
        public final void add(T t10) {
            this.f34024a.add(this.f34025b, t10);
            this.f34025b++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f34025b < this.f34024a.size();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f34025b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            int i10 = this.f34025b;
            this.f34025b = i10 + 1;
            return this.f34024a.get(i10);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f34025b;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            int i10 = this.f34025b - 1;
            this.f34025b = i10;
            return this.f34024a.get(i10);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f34025b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            int i10 = this.f34025b - 1;
            this.f34025b = i10;
            this.f34024a.remove(i10);
        }

        @Override // java.util.ListIterator
        public final void set(T t10) {
            this.f34024a.set(this.f34025b, t10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5458f(Object[] objArr) {
        this.f34017a = objArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m11686a(int i10, T t10) {
        m11693j(this.f34019c + 1);
        T[] tArr = this.f34017a;
        int i11 = this.f34019c;
        if (i10 != i11) {
            C9322j.m17673a0(i10 + 1, i10, i11, tArr, tArr);
        }
        tArr[i10] = t10;
        this.f34019c++;
    }

    /* JADX INFO: renamed from: b */
    public final void m11687b(Object obj) {
        m11693j(this.f34019c + 1);
        Object[] objArr = (T[]) this.f34017a;
        int i10 = this.f34019c;
        objArr[i10] = obj;
        this.f34019c = i10 + 1;
    }

    /* JADX INFO: renamed from: e */
    public final void m11688e(int i10, C5458f c5458f) {
        C5207g.m11111f(c5458f, "elements");
        if (c5458f.m11694k()) {
            return;
        }
        m11693j(this.f34019c + c5458f.f34019c);
        T[] tArr = this.f34017a;
        int i11 = this.f34019c;
        if (i10 != i11) {
            C9322j.m17673a0(c5458f.f34019c + i10, i10, i11, tArr, tArr);
        }
        C9322j.m17673a0(i10, 0, c5458f.f34019c, c5458f.f34017a, tArr);
        this.f34019c += c5458f.f34019c;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m11689f(int i10, Collection<? extends T> collection) {
        C5207g.m11111f(collection, "elements");
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        m11693j(collection.size() + this.f34019c);
        T[] tArr = this.f34017a;
        if (i10 != this.f34019c) {
            C9322j.m17673a0(collection.size() + i10, i10, this.f34019c, tArr, tArr);
        }
        for (T t10 : collection) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C9000b.m17257w();
                throw null;
            }
            tArr[i11 + i10] = t10;
            i11 = i12;
        }
        this.f34019c = collection.size() + this.f34019c;
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final List<T> m11690g() {
        a aVar = this.f34018b;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.f34018b = aVar2;
        return aVar2;
    }

    /* JADX INFO: renamed from: h */
    public final void m11691h() {
        T[] tArr = this.f34017a;
        int i10 = this.f34019c;
        while (true) {
            i10--;
            if (-1 >= i10) {
                this.f34019c = 0;
                return;
            }
            tArr[i10] = null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m11692i(T t10) {
        int i10 = this.f34019c - 1;
        if (i10 >= 0) {
            for (int i11 = 0; !C5207g.m11106a(this.f34017a[i11], t10); i11++) {
                if (i11 != i10) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m11693j(int i10) {
        T[] tArr = this.f34017a;
        if (tArr.length < i10) {
            T[] tArr2 = (T[]) Arrays.copyOf(tArr, Math.max(i10, tArr.length * 2));
            C5207g.m11110e(tArr2, "copyOf(this, newSize)");
            this.f34017a = tArr2;
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m11694k() {
        return this.f34019c == 0;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m11695l() {
        return this.f34019c != 0;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m11696m(T t10) {
        int i10;
        int i11 = this.f34019c;
        if (i11 <= 0) {
            i10 = -1;
            break;
        }
        T[] tArr = this.f34017a;
        i10 = 0;
        while (!C5207g.m11106a(t10, tArr[i10])) {
            i10++;
            if (i10 >= i11) {
                i10 = -1;
                break;
            }
        }
        if (i10 < 0) {
            return false;
        }
        m11697n(i10);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final T m11697n(int i10) {
        T[] tArr = this.f34017a;
        T t10 = tArr[i10];
        int i11 = this.f34019c;
        if (i10 != i11 - 1) {
            C9322j.m17673a0(i10, i10 + 1, i11, tArr, tArr);
        }
        int i12 = this.f34019c - 1;
        this.f34019c = i12;
        tArr[i12] = null;
        return t10;
    }

    /* JADX INFO: renamed from: o */
    public final void m11698o(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f34019c;
            if (i11 < i12) {
                T[] tArr = this.f34017a;
                C9322j.m17673a0(i10, i11, i12, tArr, tArr);
            }
            int i13 = this.f34019c;
            int i14 = i13 - (i11 - i10);
            int i15 = i13 - 1;
            if (i14 <= i15) {
                int i16 = i14;
                while (true) {
                    this.f34017a[i16] = null;
                    if (i16 == i15) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f34019c = i14;
        }
    }
}
