package com.google.common.collect;

import com.google.common.base.Predicates;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import p482xd.InterfaceC10173e;

/* JADX INFO: renamed from: com.google.common.collect.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3183d0 {

    /* JADX INFO: renamed from: com.google.common.collect.d0$a */
    public static class a<E> extends C3184e<E> implements Set<E> {
        public a(Set<E> set, InterfaceC10173e<? super E> interfaceC10173e) {
            super(set, interfaceC10173e);
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return C3183d0.m9125a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return C3183d0.m9127c(this);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.d0$b */
    public static class b<E> extends a<E> implements SortedSet<E> {
        public b(SortedSet<E> sortedSet, InterfaceC10173e<? super E> interfaceC10173e) {
            super(sortedSet, interfaceC10173e);
        }

        @Override // java.util.SortedSet
        public final Comparator<? super E> comparator() {
            return ((SortedSet) this.f16153a).comparator();
        }

        @Override // java.util.SortedSet
        public final E first() {
            Iterator<E> it = this.f16153a.iterator();
            it.getClass();
            InterfaceC10173e<? super E> interfaceC10173e = this.f16154b;
            interfaceC10173e.getClass();
            while (it.hasNext()) {
                E next = it.next();
                if (interfaceC10173e.apply(next)) {
                    return next;
                }
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> headSet(E e10) {
            return new b(((SortedSet) this.f16153a).headSet(e10), this.f16154b);
        }

        @Override // java.util.SortedSet
        public final E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f16153a;
            while (true) {
                E e10 = (Object) sortedSetHeadSet.last();
                if (this.f16154b.apply(e10)) {
                    return e10;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e10);
            }
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> subSet(E e10, E e11) {
            return new b(((SortedSet) this.f16153a).subSet(e10, e11), this.f16154b);
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> tailSet(E e10) {
            return new b(((SortedSet) this.f16153a).tailSet(e10), this.f16154b);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.d0$c */
    public static abstract class c<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            collection.getClass();
            if (collection instanceof InterfaceC3207z) {
                collection = ((InterfaceC3207z) collection).m9140A();
            }
            boolean zRemove = false;
            if ((collection instanceof Set) && collection.size() > size()) {
                Iterator<E> it = iterator();
                loop0: while (true) {
                    while (it.hasNext()) {
                        if (collection.contains(it.next())) {
                            it.remove();
                            zRemove = true;
                        }
                    }
                    break loop0;
                }
            }
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                zRemove |= remove(it2.next());
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            collection.getClass();
            return super.retainAll(collection);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.d0$d */
    public static abstract class d<E> extends AbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e10) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m9125a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static a m9126b(Set set, InterfaceC10173e interfaceC10173e) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof a)) {
                set.getClass();
                return new a(set, interfaceC10173e);
            }
            a aVar = (a) set;
            return new a((Set) aVar.f16153a, Predicates.m9016a(aVar.f16154b, interfaceC10173e));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (!(sortedSet instanceof a)) {
            sortedSet.getClass();
            return new b(sortedSet, interfaceC10173e);
        }
        a aVar2 = (a) sortedSet;
        return new b((SortedSet) aVar2.f16153a, Predicates.m9016a(aVar2.f16154b, interfaceC10173e));
    }

    /* JADX INFO: renamed from: c */
    public static int m9127c(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public static C3181c0 m9128d(ImmutableSet immutableSet, ImmutableSet immutableSet2) {
        if (immutableSet == null) {
            throw new NullPointerException("set1");
        }
        if (immutableSet2 != null) {
            return new C3181c0(immutableSet, immutableSet2);
        }
        throw new NullPointerException("set2");
    }
}
