package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class myk extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    final List f41813a;

    /* JADX INFO: renamed from: b */
    final mrf f41814b;

    public myk(List list, mrf mrfVar) {
        list.getClass();
        this.f41813a = list;
        mrfVar.getClass();
        this.f41814b = mrfVar;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f41813a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f41814b.apply(this.f41813a.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f41813a.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new myj(this, this.f41813a.listIterator(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.f41814b.apply(this.f41813a.remove(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41813a.size();
    }
}
