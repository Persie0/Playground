package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mzy extends mxt {

    /* JADX INFO: renamed from: a */
    static final mzy f41881a;

    /* JADX INFO: renamed from: d */
    final transient mws f41882d;

    static {
        int i = mws.f41739d;
        f41881a = new mzy(mzr.f41857a, mzg.f41839a);
    }

    public mzy(mws mwsVar, Comparator comparator) {
        super(comparator);
        this.f41882d = mwsVar;
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: A */
    public final Object[] mo17074A() {
        return this.f41882d.mo17074A();
    }

    @Override // p000.mxt, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iM17197f = m17197f(obj, true);
        if (iM17197f == size()) {
            return null;
        }
        return this.f41882d.get(iM17197f);
    }

    @Override // p000.mwj, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f41882d, obj, this.f41779b) >= 0) {
                    return true;
                }
            } catch (ClassCastException e) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof myy) {
            collection = ((myy) collection).mo16920f();
        }
        if (!mpw.m16786y(this.f41779b, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        naz nazVarListIterator = listIterator();
        Iterator it = collection.iterator();
        if (!nazVarListIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = nazVarListIterator.next();
        while (true) {
            try {
                int iM17156O = m17156O(next2, next);
                if (iM17156O < 0) {
                    if (!nazVarListIterator.hasNext()) {
                        return false;
                    }
                    next2 = nazVarListIterator.next();
                } else {
                    if (iM17156O != 0) {
                        return false;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                }
            } catch (ClassCastException | NullPointerException e) {
                return false;
            }
        }
    }

    @Override // p000.mxt, java.util.NavigableSet
    /* JADX INFO: renamed from: cq */
    public final naz descendingIterator() {
        return this.f41882d.mo17088a().iterator();
    }

    @Override // p000.mxt, p000.mxk, p000.mwj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: cr */
    public final naz listIterator() {
        return this.f41882d.iterator();
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: cs */
    public final boolean mo17014cs() {
        return this.f41882d.mo17014cs();
    }

    /* JADX INFO: renamed from: e */
    final int m17196e(Object obj, boolean z) {
        mws mwsVar = this.f41882d;
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(mwsVar, obj, this.f41779b);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return iBinarySearch ^ (-1);
    }

    @Override // p000.mxk, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!mpw.m16786y(this.f41779b, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            naz nazVarListIterator = listIterator();
            while (nazVarListIterator.hasNext()) {
                Object next = nazVarListIterator.next();
                Object next2 = it.next();
                if (next2 == null || m17156O(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException e) {
            return false;
        } catch (NoSuchElementException e2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    final int m17197f(Object obj, boolean z) {
        mws mwsVar = this.f41882d;
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(mwsVar, obj, this.f41779b);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch : iBinarySearch + 1;
        }
        return iBinarySearch ^ (-1);
    }

    @Override // p000.mxt, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f41882d.get(0);
    }

    @Override // p000.mxt, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iM17196e = m17196e(obj, true) - 1;
        if (iM17196e == -1) {
            return null;
        }
        return this.f41882d.get(iM17196e);
    }

    /* JADX INFO: renamed from: g */
    final mzy m17198g(int i, int i2) {
        if (i == 0) {
            if (i2 == size()) {
                return this;
            }
            i = 0;
        }
        return i < i2 ? new mzy(this.f41882d.subList(i, i2), this.f41779b) : m17155Q(this.f41779b);
    }

    @Override // p000.mxt, java.util.NavigableSet
    public final Object higher(Object obj) {
        int iM17197f = m17197f(obj, false);
        if (iM17197f == size()) {
            return null;
        }
        return this.f41882d.get(iM17197f);
    }

    @Override // p000.mxt
    /* JADX INFO: renamed from: k */
    public final mxt mo16989k() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f41779b);
        return isEmpty() ? m17155Q(comparatorReverseOrder) : new mzy(this.f41882d.mo17088a(), comparatorReverseOrder);
    }

    @Override // p000.mxt, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f41882d.get(size() - 1);
    }

    @Override // p000.mxt, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iM17196e = m17196e(obj, false) - 1;
        if (iM17196e == -1) {
            return null;
        }
        return this.f41882d.get(iM17196e);
    }

    @Override // p000.mxt
    /* JADX INFO: renamed from: n */
    public final mxt mo16992n(Object obj, boolean z) {
        return m17198g(0, m17196e(obj, z));
    }

    @Override // p000.mxt
    /* JADX INFO: renamed from: q */
    public final mxt mo16995q(Object obj, boolean z, Object obj2, boolean z2) {
        return mo16998t(obj, z).mo16992n(obj2, z2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41882d.size();
    }

    @Override // p000.mxt
    /* JADX INFO: renamed from: t */
    public final mxt mo16998t(Object obj, boolean z) {
        return m17198g(m17197f(obj, z), size());
    }

    @Override // p000.mxk, p000.mwj
    /* JADX INFO: renamed from: v */
    public final mws mo17025v() {
        return this.f41882d;
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: x */
    public final int mo17075x(Object[] objArr, int i) {
        return this.f41882d.mo17075x(objArr, i);
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: y */
    public final int mo17076y() {
        return this.f41882d.mo17076y();
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: z */
    public final int mo17077z() {
        return this.f41882d.mo17077z();
    }
}
