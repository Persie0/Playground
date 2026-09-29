package p282nn;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: nn.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C7811i extends AbstractList<String> implements RandomAccess, InterfaceC7806d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7806d f42911a;

    /* JADX INFO: renamed from: nn.i$a */
    public class a implements ListIterator<String> {

        /* JADX INFO: renamed from: a */
        public final ListIterator<String> f42912a;

        public a(C7811i c7811i, int i10) {
            this.f42912a = c7811i.f42911a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f42912a.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f42912a.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return this.f42912a.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f42912a.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return this.f42912a.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f42912a.previousIndex();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public final void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: nn.i$b */
    public class b implements Iterator<String> {

        /* JADX INFO: renamed from: a */
        public final Iterator<String> f42913a;

        public b(C7811i c7811i) {
            this.f42913a = c7811i.f42911a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f42913a.hasNext();
        }

        @Override // java.util.Iterator
        public final String next() {
            return this.f42913a.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C7811i(InterfaceC7806d interfaceC7806d) {
        this.f42911a = interfaceC7806d;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p282nn.InterfaceC7806d
    /* JADX INFO: renamed from: R */
    public final void mo15534R(C7807e c7807e) {
        throw new UnsupportedOperationException();
    }

    @Override // p282nn.InterfaceC7806d
    /* JADX INFO: renamed from: c0 */
    public final AbstractC7803a mo15535c0(int i10) {
        return this.f42911a.mo15535c0(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f42911a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new b(this);
    }

    @Override // p282nn.InterfaceC7806d
    /* JADX INFO: renamed from: k */
    public final List<?> mo15536k() {
        return this.f42911a.mo15536k();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i10) {
        return new a(this, i10);
    }

    @Override // p282nn.InterfaceC7806d
    /* JADX INFO: renamed from: n */
    public final C7811i mo15537n() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42911a.size();
    }
}
