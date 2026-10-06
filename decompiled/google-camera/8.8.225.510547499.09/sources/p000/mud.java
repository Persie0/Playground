package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mud extends AbstractCollection {

    /* JADX INFO: renamed from: a */
    final Collection f41628a;

    /* JADX INFO: renamed from: b */
    final mrp f41629b;

    public mud(Collection collection, mrp mrpVar) {
        this.f41628a = collection;
        this.f41629b = mrpVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        lku.m15669w(this.f41629b.mo8324a(obj));
        return this.f41628a.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            lku.m15669w(this.f41629b.mo8324a(it.next()));
        }
        return this.f41628a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        mkv.m16521ac(this.f41628a, this.f41629b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (lku.m15652f(this.f41628a, obj)) {
            return this.f41629b.mo8324a(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return lku.m15651e(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return !mkv.m16518Z(this.f41628a, this.f41629b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f41628a.iterator();
        mrp mrpVar = this.f41629b;
        it.getClass();
        mrpVar.getClass();
        return new msw(it, mrpVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.f41628a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f41628a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f41629b.mo8324a(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f41628a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f41629b.mo8324a(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator it = this.f41628a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f41629b.mo8324a(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return mkv.m16500H(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return mkv.m16500H(iterator()).toArray(objArr);
    }
}
