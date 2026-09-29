package p328q1;

import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import p100em.InterfaceC5429a;
import p338qd.C8573r0;

/* JADX INFO: renamed from: q1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C8470g extends AbstractC8467d implements List<InterfaceC8468e>, InterfaceC5429a {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List<InterfaceC8468e> f45641c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f45642d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C8470g(List<? extends InterfaceC8468e> list) {
        this.f45641c = list;
        if (!(!list.isEmpty())) {
            throw new IllegalStateException("At least one font should be passed to FontFamily".toString());
        }
        this.f45642d = new ArrayList(list);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, InterfaceC8468e interfaceC8468e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends InterfaceC8468e> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends InterfaceC8468e> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof InterfaceC8468e)) {
            return false;
        }
        InterfaceC8468e interfaceC8468e = (InterfaceC8468e) obj;
        C5207g.m11111f(interfaceC8468e, "element");
        return this.f45641c.contains(interfaceC8468e);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        C5207g.m11111f(collection, "elements");
        return this.f45641c.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8470g) && C5207g.m11106a(this.f45642d, ((C8470g) obj).f45642d);
    }

    @Override // java.util.List
    public final InterfaceC8468e get(int i10) {
        return this.f45641c.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f45642d.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof InterfaceC8468e)) {
            return -1;
        }
        InterfaceC8468e interfaceC8468e = (InterfaceC8468e) obj;
        C5207g.m11111f(interfaceC8468e, "element");
        return this.f45641c.indexOf(interfaceC8468e);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f45641c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<InterfaceC8468e> iterator() {
        return this.f45641c.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof InterfaceC8468e)) {
            return -1;
        }
        InterfaceC8468e interfaceC8468e = (InterfaceC8468e) obj;
        C5207g.m11111f(interfaceC8468e, "element");
        return this.f45641c.lastIndexOf(interfaceC8468e);
    }

    @Override // java.util.List
    public final ListIterator<InterfaceC8468e> listIterator() {
        return this.f45641c.listIterator();
    }

    @Override // java.util.List
    public final ListIterator<InterfaceC8468e> listIterator(int i10) {
        return this.f45641c.listIterator(i10);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ InterfaceC8468e remove(int i10) {
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
    public final void replaceAll(UnaryOperator<InterfaceC8468e> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.List
    public final /* bridge */ /* synthetic */ InterfaceC8468e set(int i10, InterfaceC8468e interfaceC8468e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f45641c.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super InterfaceC8468e> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<InterfaceC8468e> subList(int i10, int i11) {
        return this.f45641c.subList(i10, i11);
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

    public final String toString() {
        return "FontListFontFamily(fonts=" + this.f45642d + ')';
    }
}
