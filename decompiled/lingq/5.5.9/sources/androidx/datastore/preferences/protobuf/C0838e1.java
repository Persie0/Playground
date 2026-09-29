package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0838e1 extends AbstractList<String> implements InterfaceC0879y, RandomAccess {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0879y f5840a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e1$a */
    public class a implements ListIterator<String> {

        /* JADX INFO: renamed from: a */
        public final ListIterator<String> f5841a;

        public a(C0838e1 c0838e1, int i10) {
            this.f5841a = c0838e1.f5840a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f5841a.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f5841a.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return this.f5841a.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f5841a.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return this.f5841a.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f5841a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public final void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e1$b */
    public class b implements Iterator<String> {

        /* JADX INFO: renamed from: a */
        public final Iterator<String> f5842a;

        public b(C0838e1 c0838e1) {
            this.f5842a = c0838e1.f5840a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f5842a.hasNext();
        }

        @Override // java.util.Iterator
        public final String next() {
            return this.f5842a.next();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C0838e1(InterfaceC0879y interfaceC0879y) {
        this.f5840a = interfaceC0879y;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0879y
    /* JADX INFO: renamed from: J */
    public final void mo3211J(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0879y
    /* JADX INFO: renamed from: g0 */
    public final Object mo3212g0(int i10) {
        return this.f5840a.mo3212g0(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f5840a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new b(this);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0879y
    /* JADX INFO: renamed from: k */
    public final List<?> mo3213k() {
        return this.f5840a.mo3213k();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i10) {
        return new a(this, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0879y
    /* JADX INFO: renamed from: n */
    public final InterfaceC0879y mo3214n() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5840a.size();
    }
}
