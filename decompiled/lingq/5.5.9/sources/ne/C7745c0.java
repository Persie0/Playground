package ne;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: ne.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7745c0<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: a */
    public final List<E> f42541a;

    public C7745c0(List<E> list) {
        this.f42541a = Collections.unmodifiableList(list);
    }

    @Override // java.util.List
    public final void add(int i10, E e10) {
        this.f42541a.add(i10, e10);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(E e10) {
        return this.f42541a.add(e10);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        return this.f42541a.addAll(i10, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        return this.f42541a.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f42541a.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f42541a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.f42541a.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return this.f42541a.equals(obj);
    }

    @Override // java.util.List
    public final E get(int i10) {
        return this.f42541a.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f42541a.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f42541a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f42541a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return this.f42541a.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f42541a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator() {
        return this.f42541a.listIterator();
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator(int i10) {
        return this.f42541a.listIterator(i10);
    }

    @Override // java.util.List
    public final E remove(int i10) {
        return this.f42541a.remove(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f42541a.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return this.f42541a.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return this.f42541a.retainAll(collection);
    }

    @Override // java.util.List
    public final E set(int i10, E e10) {
        return this.f42541a.set(i10, e10);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f42541a.size();
    }

    @Override // java.util.List
    public final List<E> subList(int i10, int i11) {
        return this.f42541a.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.f42541a.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.f42541a.toArray(tArr);
    }
}
