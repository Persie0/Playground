package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class kzd implements List {

    /* JADX INFO: renamed from: a */
    public final List f37767a;

    public kzd(List list) {
        this.f37767a = list;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.f37767a.add(i, obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.f37767a.addAll(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f37767a.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f37767a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f37767a.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return this.f37767a.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f37767a.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f37767a.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f37767a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f37767a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f37767a.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f37767a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f37767a.listIterator();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return this.f37767a.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f37767a.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f37767a.retainAll(collection);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return this.f37767a.set(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f37767a.size();
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        return this.f37767a.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.f37767a.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        return this.f37767a.add(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.f37767a.addAll(collection);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.f37767a.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f37767a.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f37767a.toArray(objArr);
    }
}
