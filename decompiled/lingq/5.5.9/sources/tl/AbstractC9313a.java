package tl;

import androidx.activity.result.C0204c;
import dm.C5207g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.AbstractCollection;
import p003a2.C0009a;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: tl.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9313a<E> extends AbstractCollection<E> implements List<E> {

    /* JADX INFO: renamed from: tl.a$a */
    public static final class a {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public static void m17660a(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                StringBuilder sbM25n = C0009a.m25n("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
                sbM25n.append(i12);
                throw new IndexOutOfBoundsException(sbM25n.toString());
            }
            if (i10 > i11) {
                throw new IllegalArgumentException(C0204c.m851j("fromIndex: ", i10, " > toIndex: ", i11));
            }
        }
    }

    /* JADX INFO: renamed from: tl.a$b */
    public class b implements Iterator<E>, InterfaceC5429a {

        /* JADX INFO: renamed from: a */
        public int f48050a;

        public b() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f48050a < AbstractC9313a.this.mo1847a();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f48050a;
            this.f48050a = i10 + 1;
            return AbstractC9313a.this.get(i10);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: tl.a$c */
    public class c extends AbstractC9313a<E>.b implements ListIterator<E> {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public c(int i10) {
            super();
            int iMo1847a = AbstractC9313a.this.mo1847a();
            if (i10 < 0 || i10 > iMo1847a) {
                throw new IndexOutOfBoundsException(C0204c.m851j("index: ", i10, ", size: ", iMo1847a));
            }
            this.f48050a = i10;
        }

        @Override // java.util.ListIterator
        public final void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f48050a > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f48050a;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f48050a - 1;
            this.f48050a = i10;
            return AbstractC9313a.this.get(i10);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f48050a - 1;
        }

        @Override // java.util.ListIterator
        public final void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: tl.a$d */
    public static final class d<E> extends AbstractC9313a<E> implements RandomAccess {

        /* JADX INFO: renamed from: a */
        public final AbstractC9313a<E> f48053a;

        /* JADX INFO: renamed from: b */
        public final int f48054b;

        /* JADX INFO: renamed from: c */
        public final int f48055c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(AbstractC9313a<? extends E> abstractC9313a, int i10, int i11) {
            C5207g.m11111f(abstractC9313a, "list");
            this.f48053a = abstractC9313a;
            this.f48054b = i10;
            a.m17660a(i10, i11, abstractC9313a.mo1847a());
            this.f48055c = i11 - i10;
        }

        @Override // kotlin.collections.AbstractCollection
        /* JADX INFO: renamed from: a */
        public final int mo1847a() {
            return this.f48055c;
        }

        @Override // java.util.List
        public final E get(int i10) {
            int i11 = this.f48055c;
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException(C0204c.m851j("index: ", i10, ", size: ", i11));
            }
            return this.f48053a.get(this.f48054b + i10);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.List
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        C5207g.m11111f(collection, "other");
        if (size() == collection.size()) {
            Iterator<E> it = collection.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!C5207g.m11106a(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    public int indexOf(E e10) {
        Iterator<E> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (C5207g.m11106a(it.next(), e10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(E e10) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C5207g.m11106a(listIterator.previous(), e10)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new c(0);
    }

    public ListIterator<E> listIterator(int i10) {
        return new c(i10);
    }

    @Override // java.util.List
    public final E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i10, int i11) {
        return new d(this, i10, i11);
    }
}
