package p000;

import com.google.common.collect.AbstractC1102r;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public class yg5 extends AbstractList {

    /* JADX INFO: renamed from: a */
    public final List f69814a;

    public yg5(List list) {
        list.getClass();
        this.f69814a = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f69814a.add(m25124f(i), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f69814a.clear();
    }

    /* JADX INFO: renamed from: d */
    public final List m25123d() {
        return this.f69814a;
    }

    /* JADX INFO: renamed from: f */
    public final int m25124f(int i) {
        int size = this.f69814a.size();
        bna.m3981w(i, size);
        return size - i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.f69814a;
        int size = list.size();
        bna.m3973s(i, size);
        return list.get((size - 1) - i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new xg5(this, this.f69814a.listIterator(m25124f(i)));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        List list = this.f69814a;
        int size = list.size();
        bna.m3973s(i, size);
        return list.remove((size - 1) - i);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        subList(i, i2).clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        List list = this.f69814a;
        int size = list.size();
        bna.m3973s(i, size);
        return list.set((size - 1) - i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f69814a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        List list = this.f69814a;
        bna.m3983x(i, i2, list.size());
        return AbstractC1102r.m6346a(list.subList(m25124f(i2), m25124f(i)));
    }
}
