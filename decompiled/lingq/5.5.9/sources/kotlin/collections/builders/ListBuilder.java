package kotlin.collections.builders;

import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import p100em.InterfaceC5429a;
import p349qo.C8656b;
import tl.AbstractC9313a;
import tl.AbstractC9315c;
import tl.C9322j;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0001\fB\t\b\u0016¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\t\u001a\u00020\bH\u0002¨\u0006\r"}, m13365d2 = {"Lkotlin/collections/builders/ListBuilder;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Ltl/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "<init>", "()V", "a", "kotlin-stdlib"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ListBuilder<E> extends AbstractC9315c<E> implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a */
    public E[] f38049a;

    /* JADX INFO: renamed from: b */
    public final int f38050b;

    /* JADX INFO: renamed from: c */
    public int f38051c;

    /* JADX INFO: renamed from: d */
    public boolean f38052d;

    /* JADX INFO: renamed from: e */
    public final ListBuilder<E> f38053e;

    /* JADX INFO: renamed from: f */
    public final ListBuilder<E> f38054f;

    /* JADX INFO: renamed from: kotlin.collections.builders.ListBuilder$a */
    public static final class C6745a<E> implements ListIterator<E>, InterfaceC5429a {

        /* JADX INFO: renamed from: a */
        public final ListBuilder<E> f38055a;

        /* JADX INFO: renamed from: b */
        public int f38056b;

        /* JADX INFO: renamed from: c */
        public int f38057c;

        public C6745a(ListBuilder<E> listBuilder, int i10) {
            C5207g.m11111f(listBuilder, "list");
            this.f38055a = listBuilder;
            this.f38056b = i10;
            this.f38057c = -1;
        }

        @Override // java.util.ListIterator
        public final void add(E e10) {
            int i10 = this.f38056b;
            this.f38056b = i10 + 1;
            this.f38055a.add(i10, e10);
            this.f38057c = -1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f38056b < this.f38055a.f38051c;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f38056b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final E next() {
            int i10 = this.f38056b;
            ListBuilder<E> listBuilder = this.f38055a;
            if (i10 >= listBuilder.f38051c) {
                throw new NoSuchElementException();
            }
            this.f38056b = i10 + 1;
            this.f38057c = i10;
            return listBuilder.f38049a[listBuilder.f38050b + i10];
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f38056b;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.ListIterator
        public final E previous() {
            int i10 = this.f38056b;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.f38056b = i11;
            this.f38057c = i11;
            ListBuilder<E> listBuilder = this.f38055a;
            return listBuilder.f38049a[listBuilder.f38050b + i11];
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f38056b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            int i10 = this.f38057c;
            if (!(i10 != -1)) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }
            this.f38055a.mo1830l(i10);
            this.f38056b = this.f38057c;
            this.f38057c = -1;
        }

        @Override // java.util.ListIterator
        public final void set(E e10) {
            int i10 = this.f38057c;
            if (!(i10 != -1)) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.f38055a.set(i10, e10);
        }
    }

    public ListBuilder() {
        this(10);
    }

    public ListBuilder(int i10) {
        this(C8656b.m16900h(i10), 0, 0, false, null, null);
    }

    public ListBuilder(E[] eArr, int i10, int i11, boolean z10, ListBuilder<E> listBuilder, ListBuilder<E> listBuilder2) {
        this.f38049a = eArr;
        this.f38050b = i10;
        this.f38051c = i11;
        this.f38052d = z10;
        this.f38053e = listBuilder;
        this.f38054f = listBuilder2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private final Object writeReplace() throws NotSerializableException {
        ListBuilder<E> listBuilder;
        if (this.f38052d || ((listBuilder = this.f38054f) != null && listBuilder.f38052d)) {
            return new SerializedCollection(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    /* JADX INFO: renamed from: C */
    public final void m13395C(int i10, int i11) {
        int i12 = this.f38051c + i11;
        if (this.f38053e != null) {
            throw new IllegalStateException();
        }
        if (i12 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.f38049a;
        if (i12 > eArr.length) {
            int length = eArr.length;
            int i13 = length + (length >> 1);
            if (i13 - i12 < 0) {
                i13 = i12;
            }
            if (i13 - 2147483639 > 0) {
                i13 = i12 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            E[] eArr2 = (E[]) Arrays.copyOf(eArr, i13);
            C5207g.m11110e(eArr2, "copyOf(this, newSize)");
            this.f38049a = eArr2;
        }
        E[] eArr3 = this.f38049a;
        C9322j.m17673a0(i10 + i11, i10, this.f38050b + this.f38051c, eArr3, eArr3);
        this.f38051c += i11;
    }

    /* JADX INFO: renamed from: D */
    public final E m13396D(int i10) {
        ListBuilder<E> listBuilder = this.f38053e;
        if (listBuilder != null) {
            E eM13396D = listBuilder.m13396D(i10);
            this.f38051c--;
            return eM13396D;
        }
        E[] eArr = this.f38049a;
        E e10 = eArr[i10];
        int i11 = this.f38051c;
        int i12 = this.f38050b;
        C9322j.m17673a0(i10, i10 + 1, i11 + i12, eArr, eArr);
        E[] eArr2 = this.f38049a;
        int i13 = (i12 + this.f38051c) - 1;
        C5207g.m11111f(eArr2, "<this>");
        eArr2[i13] = null;
        this.f38051c--;
        return e10;
    }

    /* JADX INFO: renamed from: G */
    public final void m13397G(int i10, int i11) {
        ListBuilder<E> listBuilder = this.f38053e;
        if (listBuilder != null) {
            listBuilder.m13397G(i10, i11);
        } else {
            E[] eArr = this.f38049a;
            C9322j.m17673a0(i10, i10 + i11, this.f38051c, eArr, eArr);
            E[] eArr2 = this.f38049a;
            int i12 = this.f38051c;
            C8656b.m16891R(i12 - i11, i12, eArr2);
        }
        this.f38051c -= i11;
    }

    /* JADX INFO: renamed from: Q */
    public final int m13398Q(int i10, int i11, Collection<? extends E> collection, boolean z10) {
        ListBuilder<E> listBuilder = this.f38053e;
        if (listBuilder != null) {
            int iM13398Q = listBuilder.m13398Q(i10, i11, collection, z10);
            this.f38051c -= iM13398Q;
            return iM13398Q;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f38049a[i14]) == z10) {
                E[] eArr = this.f38049a;
                i12++;
                eArr[i13 + i10] = eArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        E[] eArr2 = this.f38049a;
        C9322j.m17673a0(i10 + i13, i11 + i10, this.f38051c, eArr2, eArr2);
        E[] eArr3 = this.f38049a;
        int i16 = this.f38051c;
        C8656b.m16891R(i16 - i15, i16, eArr3);
        this.f38051c -= i15;
        return i15;
    }

    @Override // tl.AbstractC9315c
    /* JADX INFO: renamed from: a */
    public final int mo1822a() {
        return this.f38051c;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        m13401y();
        int i11 = this.f38051c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(C0204c.m851j("index: ", i10, ", size: ", i11));
        }
        m13400t(this.f38050b + i10, e10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        m13401y();
        m13400t(this.f38050b + this.f38051c, e10);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        C5207g.m11111f(collection, "elements");
        m13401y();
        int i11 = this.f38051c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(C0204c.m851j("index: ", i10, ", size: ", i11));
        }
        int size = collection.size();
        m13399q(this.f38050b + i10, size, collection);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        C5207g.m11111f(collection, "elements");
        m13401y();
        int size = collection.size();
        m13399q(this.f38050b + this.f38051c, size, collection);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m13401y();
        m13397G(this.f38050b, this.f38051c);
    }

    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        boolean z10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            E[] eArr = this.f38049a;
            int i10 = this.f38051c;
            if (i10 == list.size()) {
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        z10 = true;
                        break;
                    }
                    if (C5207g.m11106a(eArr[this.f38050b + i11], list.get(i11))) {
                        i11++;
                    }
                }
                if (z10) {
                    return true;
                }
            }
            z10 = false;
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        int i11 = this.f38051c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(C0204c.m851j("index: ", i10, ", size: ", i11));
        }
        return this.f38049a[this.f38050b + i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        E[] eArr = this.f38049a;
        int i10 = this.f38051c;
        int iHashCode = 1;
        for (int i11 = 0; i11 < i10; i11++) {
            E e10 = eArr[this.f38050b + i11];
            iHashCode = (iHashCode * 31) + (e10 != null ? e10.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f38051c; i10++) {
            if (C5207g.m11106a(this.f38049a[this.f38050b + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f38051c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return new C6745a(this, 0);
    }

    @Override // tl.AbstractC9315c
    /* JADX INFO: renamed from: l */
    public final E mo1830l(int i10) {
        m13401y();
        int i11 = this.f38051c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(C0204c.m851j("index: ", i10, ", size: ", i11));
        }
        return m13396D(this.f38050b + i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i10 = this.f38051c - 1; i10 >= 0; i10--) {
            if (C5207g.m11106a(this.f38049a[this.f38050b + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return new C6745a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i10) {
        int i11 = this.f38051c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(C0204c.m851j("index: ", i10, ", size: ", i11));
        }
        return new C6745a(this, i10);
    }

    /* JADX INFO: renamed from: q */
    public final void m13399q(int i10, int i11, Collection collection) {
        ListBuilder<E> listBuilder = this.f38053e;
        if (listBuilder != null) {
            listBuilder.m13399q(i10, i11, collection);
            this.f38049a = listBuilder.f38049a;
            this.f38051c += i11;
        } else {
            m13395C(i10, i11);
            Iterator<E> it = collection.iterator();
            for (int i12 = 0; i12 < i11; i12++) {
                this.f38049a[i10 + i12] = it.next();
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m13401y();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo1830l(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> collection) {
        C5207g.m11111f(collection, "elements");
        m13401y();
        boolean z10 = false;
        if (m13398Q(this.f38050b, this.f38051c, collection, false) > 0) {
            z10 = true;
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<? extends Object> collection) {
        C5207g.m11111f(collection, "elements");
        m13401y();
        return m13398Q(this.f38050b, this.f38051c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        m13401y();
        int i11 = this.f38051c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(C0204c.m851j("index: ", i10, ", size: ", i11));
        }
        E[] eArr = this.f38049a;
        int i12 = this.f38050b;
        E e11 = eArr[i12 + i10];
        eArr[i12 + i10] = e10;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<E> subList(int i10, int i11) {
        AbstractC9313a.a.m17660a(i10, i11, this.f38051c);
        E[] eArr = this.f38049a;
        int i12 = this.f38050b + i10;
        int i13 = i11 - i10;
        boolean z10 = this.f38052d;
        ListBuilder<E> listBuilder = this.f38054f;
        return new ListBuilder(eArr, i12, i13, z10, this, listBuilder == null ? this : listBuilder);
    }

    /* JADX INFO: renamed from: t */
    public final void m13400t(int i10, E e10) {
        ListBuilder<E> listBuilder = this.f38053e;
        if (listBuilder == null) {
            m13395C(i10, 1);
            this.f38049a[i10] = e10;
        } else {
            listBuilder.m13400t(i10, e10);
            this.f38049a = listBuilder.f38049a;
            this.f38051c++;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        E[] eArr = this.f38049a;
        int i10 = this.f38051c;
        int i11 = this.f38050b;
        return C9322j.m17677e0(i11, i10 + i11, eArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        C5207g.m11111f(tArr, "destination");
        int length = tArr.length;
        int i10 = this.f38051c;
        int i11 = this.f38050b;
        if (length < i10) {
            T[] tArr2 = (T[]) Arrays.copyOfRange(this.f38049a, i11, i10 + i11, tArr.getClass());
            C5207g.m11110e(tArr2, "copyOfRange(array, offse…h, destination.javaClass)");
            return tArr2;
        }
        C9322j.m17673a0(0, i11, i10 + i11, this.f38049a, tArr);
        int length2 = tArr.length;
        int i12 = this.f38051c;
        if (length2 > i12) {
            tArr[i12] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        E[] eArr = this.f38049a;
        int i10 = this.f38051c;
        StringBuilder sb2 = new StringBuilder((i10 * 3) + 2);
        sb2.append("[");
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(eArr[this.f38050b + i11]);
        }
        sb2.append("]");
        String string = sb2.toString();
        C5207g.m11110e(string, "sb.toString()");
        return string;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: y */
    public final void m13401y() {
        ListBuilder<E> listBuilder;
        if (this.f38052d || ((listBuilder = this.f38054f) != null && listBuilder.f38052d)) {
            throw new UnsupportedOperationException();
        }
    }
}
