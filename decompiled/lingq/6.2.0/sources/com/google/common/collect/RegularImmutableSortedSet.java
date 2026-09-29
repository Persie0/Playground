package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import p000.bga;
import p000.d14;
import p000.uk9;

/* JADX INFO: loaded from: classes2.dex */
final class RegularImmutableSortedSet<E> extends ImmutableSortedSet<E> {

    /* JADX INFO: renamed from: h */
    public static final RegularImmutableSortedSet f13439h;

    /* JADX INFO: renamed from: g */
    public final transient ImmutableList f13440g;

    static {
        d14 d14Var = ImmutableList.f13390b;
        f13439h = new RegularImmutableSortedSet(RegularImmutableList.f13416e, NaturalOrdering.f13415a);
    }

    public RegularImmutableSortedSet(ImmutableList immutableList, Comparator comparator) {
        super(comparator);
        this.f13440g = immutableList;
    }

    /* JADX INFO: renamed from: C */
    public final RegularImmutableSortedSet m6322C(int i, int i2) {
        ImmutableList immutableList = this.f13440g;
        if (i == 0 && i2 == immutableList.size()) {
            return this;
        }
        Comparator comparator = this.f13405d;
        if (i < i2) {
            return new RegularImmutableSortedSet(immutableList.subList(i, i2), comparator);
        }
        return NaturalOrdering.f13415a != comparator ? new RegularImmutableSortedSet(RegularImmutableList.f13416e, comparator) : f13439h;
    }

    /* JADX INFO: renamed from: D */
    public final int m6323D(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f13440g, obj, this.f13405d);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    /* JADX INFO: renamed from: E */
    public final int m6324E(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f13440g, obj, this.f13405d);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iM6324E = m6324E(obj, true);
        ImmutableList immutableList = this.f13440g;
        if (iM6324E == immutableList.size()) {
            return null;
        }
        return immutableList.get(iM6324E);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f13440g, obj, this.f13405d) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof ImmutableMultiset) {
            collection = ((RegularImmutableMultiset) ((ImmutableMultiset) collection)).m6321l();
        }
        Comparator comparator = this.f13405d;
        if (!AbstractC1106v.m6353a(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        bga it = iterator();
        Iterator<E> it2 = collection.iterator();
        d14 d14Var = (d14) it;
        if (!d14Var.hasNext()) {
            return false;
        }
        E next = it2.next();
        Object next2 = d14Var.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare < 0) {
                    if (!d14Var.hasNext()) {
                        return false;
                    }
                    next2 = d14Var.next();
                } else if (iCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iCompare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: d */
    public final ImmutableList mo6273d() {
        return this.f13440g;
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f13440g.mo6292D().listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        E next2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.f13440g.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.f13405d;
        if (!AbstractC1106v.m6353a(comparator, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            bga it2 = iterator();
            do {
                d14 d14Var = (d14) it2;
                if (!d14Var.hasNext()) {
                    return true;
                }
                next = d14Var.next();
                next2 = it.next();
                if (next2 == null) {
                    return false;
                }
            } while (comparator.compare(next, next2) == 0);
            return false;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: f */
    public final int mo6274f(Object[] objArr, int i) {
        return this.f13440g.mo6274f(objArr, i);
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.f13440g.get(0);
        }
        uk9.m22784s();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iM6323D = m6323D(obj, true) - 1;
        if (iM6323D == -1) {
            return null;
        }
        return this.f13440g.get(iM6323D);
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: g */
    public final Object[] mo6275g() {
        return this.f13440g.mo6275g();
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: h */
    public final int mo6276h() {
        return this.f13440g.mo6276h();
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iM6324E = m6324E(obj, false);
        ImmutableList immutableList = this.f13440g;
        if (iM6324E == immutableList.size()) {
            return null;
        }
        return immutableList.get(iM6324E);
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: i */
    public final int mo6277i() {
        return this.f13440g.mo6277i();
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: j */
    public final boolean mo6278j() {
        return this.f13440g.mo6278j();
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: k */
    public final bga iterator() {
        return this.f13440g.listIterator(0);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            uk9.m22784s();
            return null;
        }
        ImmutableList immutableList = this.f13440g;
        return immutableList.get(immutableList.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iM6323D = m6323D(obj, false) - 1;
        if (iM6323D == -1) {
            return null;
        }
        return this.f13440g.get(iM6323D);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f13440g.size();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
