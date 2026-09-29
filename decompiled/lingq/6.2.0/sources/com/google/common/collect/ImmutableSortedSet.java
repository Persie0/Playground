package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import p000.bna;
import p000.xd9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ImmutableSortedSet<E> extends ImmutableSet<E> implements NavigableSet<E>, xd9 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f13404f = 0;

    /* JADX INFO: renamed from: d */
    public final transient Comparator f13405d;

    /* JADX INFO: renamed from: e */
    public transient ImmutableSortedSet f13406e;

    public static class SerializedForm<E> implements Serializable {

        /* JADX INFO: renamed from: a */
        public final Comparator f13407a;

        /* JADX INFO: renamed from: b */
        public final Object[] f13408b;

        public SerializedForm(Comparator comparator, Object[] objArr) {
            this.f13407a = comparator;
            this.f13408b = objArr;
        }

        public Object readResolve() {
            C1099o c1099o = new C1099o(this.f13407a);
            c1099o.m3158c(this.f13408b);
            return c1099o.m6344i();
        }
    }

    public ImmutableSortedSet(Comparator comparator) {
        this.f13405d = comparator;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX INFO: renamed from: w */
    public static C1099o m6314w() {
        return new C1099o(NaturalOrdering.f13415a);
    }

    /* JADX INFO: renamed from: y */
    public static ImmutableSortedSet m6315y() {
        return RegularImmutableSortedSet.f13439h;
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        bna.m3969q(this.f13405d.compare(obj, obj2) <= 0);
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        RegularImmutableSortedSet regularImmutableSortedSetM6322C = regularImmutableSortedSet.m6322C(regularImmutableSortedSet.m6324E(obj, z), regularImmutableSortedSet.f13440g.size());
        return regularImmutableSortedSetM6322C.m6322C(0, regularImmutableSortedSetM6322C.m6323D(obj2, z2));
    }

    @Override // java.util.SortedSet, p000.xd9
    public final Comparator comparator() {
        return this.f13405d;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        ImmutableSortedSet regularImmutableSortedSet = this.f13406e;
        if (regularImmutableSortedSet == null) {
            RegularImmutableSortedSet regularImmutableSortedSet2 = (RegularImmutableSortedSet) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(regularImmutableSortedSet2.f13405d);
            if (regularImmutableSortedSet2.isEmpty()) {
                regularImmutableSortedSet = NaturalOrdering.f13415a != comparatorReverseOrder ? new RegularImmutableSortedSet(RegularImmutableList.f13416e, comparatorReverseOrder) : RegularImmutableSortedSet.f13439h;
            } else {
                regularImmutableSortedSet = new RegularImmutableSortedSet(regularImmutableSortedSet2.f13440g.mo6292D(), comparatorReverseOrder);
            }
            this.f13406e = regularImmutableSortedSet;
            regularImmutableSortedSet.f13406e = this;
        }
        return regularImmutableSortedSet;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        return regularImmutableSortedSet.m6322C(0, regularImmutableSortedSet.m6323D(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        return regularImmutableSortedSet.m6322C(regularImmutableSortedSet.m6324E(obj, true), regularImmutableSortedSet.f13440g.size());
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this.f13405d, toArray(ImmutableCollection.f13387a));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        return regularImmutableSortedSet.m6322C(0, regularImmutableSortedSet.m6323D(obj, false));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        return regularImmutableSortedSet.m6322C(regularImmutableSortedSet.m6324E(obj, z), regularImmutableSortedSet.f13440g.size());
    }
}
