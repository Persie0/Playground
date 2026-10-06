package p000;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class myi extends AbstractList {

    /* JADX INFO: renamed from: a */
    public final List f41811a;

    public myi(List list) {
        list.getClass();
        this.f41811a = list;
    }

    /* JADX INFO: renamed from: b */
    private final int m17159b(int i) {
        int size = size();
        lku.m15620O(i, size);
        return (size - 1) - i;
    }

    /* JADX INFO: renamed from: a */
    public final int m17160a(int i) {
        int size = size();
        lku.m15621P(i, size);
        return size - i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f41811a.add(m17160a(i), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f41811a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f41811a.get(m17159b(i));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new myh(this, this.f41811a.listIterator(m17160a(i)));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.f41811a.remove(m17159b(i));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        subList(i, i2).clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.f41811a.set(m17159b(i), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41811a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        lku.m15612G(i, i2, size());
        return mkv.m16503K(this.f41811a.subList(m17160a(i2), m17160a(i)));
    }
}
