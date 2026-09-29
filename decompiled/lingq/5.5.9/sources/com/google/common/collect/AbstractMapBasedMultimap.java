package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import p338qd.C8573r0;

/* JADX INFO: loaded from: classes.dex */
abstract class AbstractMapBasedMultimap<K, V> extends AbstractC3182d<K, V> implements Serializable {

    /* JADX INFO: renamed from: d */
    public transient Map<K, Collection<V>> f15984d;

    /* JADX INFO: renamed from: e */
    public transient int f15985e;

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$a */
    public class C3129a extends AbstractC3202u<K, Collection<V>> {

        /* JADX INFO: renamed from: c */
        public final transient Map<K, Collection<V>> f15986c;

        /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$a$a */
        public class a extends AbstractC3199r<K, Collection<V>> {
            public a() {
            }

            @Override // com.google.common.collect.AbstractC3199r, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                Set<Map.Entry<K, Collection<V>>> setEntrySet = C3129a.this.f15986c.entrySet();
                setEntrySet.getClass();
                try {
                    return setEntrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return C3129a.this.new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                Collection<V> collectionRemove;
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                Object key = entry.getKey();
                Map<K, Collection<V>> map = abstractMapBasedMultimap.f15984d;
                map.getClass();
                try {
                    collectionRemove = map.remove(key);
                } catch (ClassCastException | NullPointerException unused) {
                    collectionRemove = null;
                }
                Collection<V> collection = collectionRemove;
                if (collection != null) {
                    int size = collection.size();
                    collection.clear();
                    abstractMapBasedMultimap.f15985e -= size;
                }
                return true;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$a$b */
        public class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* JADX INFO: renamed from: a */
            public final Iterator<Map.Entry<K, Collection<V>>> f15989a;

            /* JADX INFO: renamed from: b */
            public Collection<V> f15990b;

            public b() {
                this.f15989a = C3129a.this.f15986c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f15989a.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                Map.Entry<K, Collection<V>> next = this.f15989a.next();
                this.f15990b = next.getValue();
                return C3129a.this.m9021a(next);
            }

            @Override // java.util.Iterator
            public final void remove() {
                C8573r0.m16697S("no calls to next() since the last call to remove()", this.f15990b != null);
                this.f15989a.remove();
                AbstractMapBasedMultimap.this.f15985e -= this.f15990b.size();
                this.f15990b.clear();
                this.f15990b = null;
            }
        }

        public C3129a(Map<K, Collection<V>> map) {
            this.f15986c = map;
        }

        /* JADX INFO: renamed from: a */
        public final Map.Entry<K, Collection<V>> m9021a(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            Collection<V> value = entry.getValue();
            AbstractListMultimap abstractListMultimap = (AbstractListMultimap) AbstractMapBasedMultimap.this;
            abstractListMultimap.getClass();
            List list = (List) value;
            return new ImmutableEntry(key, list instanceof RandomAccess ? new C3134f(abstractListMultimap, key, list, null) : new C3138j(key, list, null));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            if (this.f15986c == abstractMapBasedMultimap.f15984d) {
                abstractMapBasedMultimap.m9020c();
                return;
            }
            b bVar = new b();
            while (bVar.hasNext()) {
                bVar.next();
                bVar.remove();
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            Map<K, Collection<V>> map = this.f15986c;
            map.getClass();
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean equals(Object obj) {
            if (this != obj && !this.f15986c.equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Collection<V> collection;
            Map<K, Collection<V>> map = this.f15986c;
            map.getClass();
            try {
                collection = map.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                collection = null;
            }
            Collection<V> collection2 = collection;
            if (collection2 == null) {
                return null;
            }
            AbstractListMultimap abstractListMultimap = (AbstractListMultimap) AbstractMapBasedMultimap.this;
            abstractListMultimap.getClass();
            List list = (List) collection2;
            return list instanceof RandomAccess ? new C3134f(abstractListMultimap, obj, list, null) : new C3138j(obj, list, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int hashCode() {
            return this.f15986c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            C3131c c3136h;
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            C3131c c3131c = abstractMapBasedMultimap.f16149a;
            if (c3131c == null) {
                Multimaps$CustomListMultimap multimaps$CustomListMultimap = (Multimaps$CustomListMultimap) abstractMapBasedMultimap;
                Map<K, Collection<V>> map = multimaps$CustomListMultimap.f15984d;
                if (map instanceof NavigableMap) {
                    c3136h = new C3133e((NavigableMap) multimaps$CustomListMultimap.f15984d);
                } else {
                    c3136h = map instanceof SortedMap ? new C3136h((SortedMap) multimaps$CustomListMultimap.f15984d) : new C3131c(multimaps$CustomListMultimap.f15984d);
                }
                c3131c = c3136h;
                abstractMapBasedMultimap.f16149a = c3131c;
            }
            return c3131c;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            Collection<V> collectionRemove = this.f15986c.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            List<V> list = ((Multimaps$CustomListMultimap) abstractMapBasedMultimap).f16114f.get();
            list.addAll(collectionRemove);
            abstractMapBasedMultimap.f15985e -= collectionRemove.size();
            collectionRemove.clear();
            return list;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.f15986c.size();
        }

        @Override // java.util.AbstractMap
        public final String toString() {
            return this.f15986c.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$b */
    public abstract class AbstractC3130b<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public final Iterator<Map.Entry<K, Collection<V>>> f15992a;

        /* JADX INFO: renamed from: b */
        public K f15993b = null;

        /* JADX INFO: renamed from: c */
        public Collection<V> f15994c = null;

        /* JADX INFO: renamed from: d */
        public Iterator<V> f15995d = Iterators$EmptyModifiableIterator.INSTANCE;

        public AbstractC3130b() {
            this.f15992a = AbstractMapBasedMultimap.this.f15984d.entrySet().iterator();
        }

        /* JADX INFO: renamed from: a */
        public abstract T mo9022a(K k10, V v10);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (!this.f15992a.hasNext() && !this.f15995d.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.f15995d.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f15992a.next();
                this.f15993b = next.getKey();
                Collection<V> value = next.getValue();
                this.f15994c = value;
                this.f15995d = value.iterator();
            }
            return mo9022a(this.f15993b, this.f15995d.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f15995d.remove();
            Collection<V> collection = this.f15994c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f15992a.remove();
            }
            AbstractMapBasedMultimap.this.f15985e--;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$c */
    public class C3131c extends C3200s<K, Collection<V>> {

        /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$c$a */
        public class a implements Iterator<K> {

            /* JADX INFO: renamed from: a */
            public Map.Entry<K, Collection<V>> f15998a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Iterator f15999b;

            public a(Iterator it) {
                this.f15999b = it;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f15999b.hasNext();
            }

            @Override // java.util.Iterator
            public final K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f15999b.next();
                this.f15998a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public final void remove() {
                C8573r0.m16697S("no calls to next() since the last call to remove()", this.f15998a != null);
                Collection<V> value = this.f15998a.getValue();
                this.f15999b.remove();
                AbstractMapBasedMultimap.this.f15985e -= value.size();
                value.clear();
                this.f15998a = null;
            }
        }

        public C3131c(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            Iterator<K> it = iterator();
            while (true) {
                a aVar = (a) it;
                if (!aVar.hasNext()) {
                    return;
                }
                aVar.next();
                aVar.remove();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            return this.f16173a.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return this == obj || this.f16173a.keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return this.f16173a.keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this.f16173a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            int size;
            Collection collection = (Collection) this.f16173a.remove(obj);
            if (collection != null) {
                size = collection.size();
                collection.clear();
                AbstractMapBasedMultimap.this.f15985e -= size;
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$d */
    public class C3132d extends AbstractMapBasedMultimap<K, V>.C3135g implements NavigableMap<K, Collection<V>> {
        public C3132d(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C3135g
        /* JADX INFO: renamed from: b */
        public final SortedSet mo9023b() {
            return new C3133e(mo9025d());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C3135g
        /* JADX INFO: renamed from: c */
        public final SortedSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = mo9025d().ceilingEntry(k10);
            if (entryCeilingEntry == null) {
                return null;
            }
            return m9021a(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public final K ceilingKey(K k10) {
            return mo9025d().ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> descendingKeySet() {
            return ((C3132d) descendingMap()).navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new C3132d(mo9025d().descendingMap());
        }

        /* JADX INFO: renamed from: e */
        public final Map.Entry<K, Collection<V>> m9026e(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            List<V> list = ((Multimaps$CustomListMultimap) AbstractMapBasedMultimap.this).f16114f.get();
            list.addAll(next.getValue());
            it.remove();
            return new ImmutableEntry(next.getKey(), Collections.unmodifiableList(list));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C3135g
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> mo9025d() {
            return (NavigableMap) ((SortedMap) this.f15986c);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = mo9025d().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return m9021a(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry<K, Collection<V>> entryFloorEntry = mo9025d().floorEntry(k10);
            if (entryFloorEntry == null) {
                return null;
            }
            return m9021a(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public final K floorKey(K k10) {
            return mo9025d().floorKey(k10);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new C3132d(mo9025d().headMap(k10, z10));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C3135g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry<K, Collection<V>> entryHigherEntry = mo9025d().higherEntry(k10);
            if (entryHigherEntry == null) {
                return null;
            }
            return m9021a(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public final K higherKey(K k10) {
            return mo9025d().higherKey(k10);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C3135g, com.google.common.collect.AbstractMapBasedMultimap.C3129a, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = mo9025d().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return m9021a(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry<K, Collection<V>> entryLowerEntry = mo9025d().lowerEntry(k10);
            if (entryLowerEntry == null) {
                return null;
            }
            return m9021a(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public final K lowerKey(K k10) {
            return mo9025d().lowerKey(k10);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollFirstEntry() {
            return m9026e(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollLastEntry() {
            return m9026e(((AbstractC3202u) descendingMap()).entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new C3132d(mo9025d().subMap(k10, z10, k11, z11));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C3135g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new C3132d(mo9025d().tailMap(k10, z10));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C3135g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$e */
    public class C3133e extends AbstractMapBasedMultimap<K, V>.C3136h implements NavigableSet<K> {
        public C3133e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public final K ceiling(K k10) {
            return mo9028a().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public final Iterator<K> descendingIterator() {
            return ((C3131c) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> descendingSet() {
            return new C3133e(mo9028a().descendingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C3136h
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> mo9028a() {
            return (NavigableMap) ((SortedMap) this.f16173a);
        }

        @Override // java.util.NavigableSet
        public final K floor(K k10) {
            return mo9028a().floorKey(k10);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> headSet(K k10, boolean z10) {
            return new C3133e(mo9028a().headMap(k10, z10));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C3136h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public final K higher(K k10) {
            return mo9028a().higherKey(k10);
        }

        @Override // java.util.NavigableSet
        public final K lower(K k10) {
            return mo9028a().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        public final K pollFirst() {
            C3131c.a aVar = (C3131c.a) iterator();
            if (!aVar.hasNext()) {
                return null;
            }
            K k10 = (K) aVar.next();
            aVar.remove();
            return k10;
        }

        @Override // java.util.NavigableSet
        public final K pollLast() {
            Iterator<K> itDescendingIterator = descendingIterator();
            if (!itDescendingIterator.hasNext()) {
                return null;
            }
            K next = itDescendingIterator.next();
            itDescendingIterator.remove();
            return next;
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new C3133e(mo9028a().subMap(k10, z10, k11, z11));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C3136h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> tailSet(K k10, boolean z10) {
            return new C3133e(mo9028a().tailMap(k10, z10));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C3136h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$f */
    public class C3134f extends AbstractMapBasedMultimap<K, V>.C3138j implements RandomAccess {
        public C3134f(AbstractMapBasedMultimap abstractMapBasedMultimap, K k10, List<V> list, AbstractMapBasedMultimap<K, V>.C3137i c3137i) {
            super(k10, list, c3137i);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$g */
    public class C3135g extends AbstractMapBasedMultimap<K, V>.C3129a implements SortedMap<K, Collection<V>> {

        /* JADX INFO: renamed from: e */
        public SortedSet<K> f16003e;

        public C3135g(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* JADX INFO: renamed from: b */
        public SortedSet<K> mo9023b() {
            return new C3136h(mo9025d());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C3129a, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f16003e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetMo9023b = mo9023b();
            this.f16003e = sortedSetMo9023b;
            return sortedSetMo9023b;
        }

        @Override // java.util.SortedMap
        public final Comparator<? super K> comparator() {
            return mo9025d().comparator();
        }

        /* JADX INFO: renamed from: d */
        public SortedMap<K, Collection<V>> mo9025d() {
            return (SortedMap) this.f15986c;
        }

        @Override // java.util.SortedMap
        public final K firstKey() {
            return mo9025d().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new C3135g(mo9025d().headMap(k10));
        }

        @Override // java.util.SortedMap
        public final K lastKey() {
            return mo9025d().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new C3135g(mo9025d().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new C3135g(mo9025d().tailMap(k10));
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$h */
    public class C3136h extends AbstractMapBasedMultimap<K, V>.C3131c implements SortedSet<K> {
        public C3136h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* JADX INFO: renamed from: a */
        public SortedMap<K, Collection<V>> mo9028a() {
            return (SortedMap) this.f16173a;
        }

        @Override // java.util.SortedSet
        public final Comparator<? super K> comparator() {
            return mo9028a().comparator();
        }

        @Override // java.util.SortedSet
        public final K first() {
            return mo9028a().firstKey();
        }

        public SortedSet<K> headSet(K k10) {
            return new C3136h(mo9028a().headMap(k10));
        }

        @Override // java.util.SortedSet
        public final K last() {
            return mo9028a().lastKey();
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new C3136h(mo9028a().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new C3136h(mo9028a().tailMap(k10));
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$i */
    public class C3137i extends AbstractCollection<V> {

        /* JADX INFO: renamed from: a */
        public final K f16006a;

        /* JADX INFO: renamed from: b */
        public Collection<V> f16007b;

        /* JADX INFO: renamed from: c */
        public final AbstractMapBasedMultimap<K, V>.C3137i f16008c;

        /* JADX INFO: renamed from: d */
        public final Collection<V> f16009d;

        /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$i$a */
        public class a implements Iterator<V> {

            /* JADX INFO: renamed from: a */
            public final Iterator<V> f16011a;

            /* JADX INFO: renamed from: b */
            public final Collection<V> f16012b;

            public a() {
                Collection<V> collection = C3137i.this.f16007b;
                this.f16012b = collection;
                this.f16011a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
            }

            public a(ListIterator listIterator) {
                this.f16012b = C3137i.this.f16007b;
                this.f16011a = listIterator;
            }

            /* JADX INFO: renamed from: a */
            public final void m9033a() {
                C3137i c3137i = C3137i.this;
                c3137i.m9031f();
                if (c3137i.f16007b != this.f16012b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                m9033a();
                return this.f16011a.hasNext();
            }

            @Override // java.util.Iterator
            public final V next() {
                m9033a();
                return this.f16011a.next();
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.f16011a.remove();
                C3137i c3137i = C3137i.this;
                AbstractMapBasedMultimap.this.f15985e--;
                c3137i.m9032g();
            }
        }

        public C3137i(K k10, Collection<V> collection, AbstractMapBasedMultimap<K, V>.C3137i c3137i) {
            this.f16006a = k10;
            this.f16007b = collection;
            this.f16008c = c3137i;
            this.f16009d = c3137i == null ? null : c3137i.f16007b;
        }

        /* JADX INFO: renamed from: a */
        public final void m9030a() {
            AbstractMapBasedMultimap<K, V>.C3137i c3137i = this.f16008c;
            if (c3137i != null) {
                c3137i.m9030a();
            } else {
                AbstractMapBasedMultimap.this.f15984d.put(this.f16006a, this.f16007b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(V v10) {
            m9031f();
            boolean zIsEmpty = this.f16007b.isEmpty();
            boolean zAdd = this.f16007b.add(v10);
            if (zAdd) {
                AbstractMapBasedMultimap.this.f15985e++;
                if (zIsEmpty) {
                    m9030a();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f16007b.addAll(collection);
            if (zAddAll) {
                AbstractMapBasedMultimap.this.f15985e += this.f16007b.size() - size;
                if (size == 0) {
                    m9030a();
                }
            }
            return zAddAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f16007b.clear();
            AbstractMapBasedMultimap.this.f15985e -= size;
            m9032g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            m9031f();
            return this.f16007b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            m9031f();
            return this.f16007b.containsAll(collection);
        }

        @Override // java.util.Collection
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            m9031f();
            return this.f16007b.equals(obj);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: f */
        public final void m9031f() {
            Collection<V> collection;
            AbstractMapBasedMultimap<K, V>.C3137i c3137i = this.f16008c;
            if (c3137i != null) {
                c3137i.m9031f();
                if (c3137i.f16007b != this.f16009d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f16007b.isEmpty() || (collection = AbstractMapBasedMultimap.this.f15984d.get(this.f16006a)) == null) {
                    return;
                }
                this.f16007b = collection;
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m9032g() {
            AbstractMapBasedMultimap<K, V>.C3137i c3137i = this.f16008c;
            if (c3137i != null) {
                c3137i.m9032g();
            } else {
                if (this.f16007b.isEmpty()) {
                    AbstractMapBasedMultimap.this.f15984d.remove(this.f16006a);
                }
            }
        }

        @Override // java.util.Collection
        public final int hashCode() {
            m9031f();
            return this.f16007b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            m9031f();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            m9031f();
            boolean zRemove = this.f16007b.remove(obj);
            if (zRemove) {
                AbstractMapBasedMultimap.this.f15985e--;
                m9032g();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f16007b.removeAll(collection);
            if (zRemoveAll) {
                AbstractMapBasedMultimap.this.f15985e += this.f16007b.size() - size;
                m9032g();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            collection.getClass();
            int size = size();
            boolean zRetainAll = this.f16007b.retainAll(collection);
            if (zRetainAll) {
                AbstractMapBasedMultimap.this.f15985e += this.f16007b.size() - size;
                m9032g();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            m9031f();
            return this.f16007b.size();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            m9031f();
            return this.f16007b.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$j */
    public class C3138j extends AbstractMapBasedMultimap<K, V>.C3137i implements List<V> {

        /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$j$a */
        public class a extends AbstractMapBasedMultimap<K, V>.C3137i.a implements ListIterator<V> {
            public a() {
                super();
            }

            public a(int i10) {
                super(((List) C3138j.this.f16007b).listIterator(i10));
            }

            @Override // java.util.ListIterator
            public final void add(V v10) {
                C3138j c3138j = C3138j.this;
                boolean zIsEmpty = c3138j.isEmpty();
                m9034b().add(v10);
                AbstractMapBasedMultimap.this.f15985e++;
                if (zIsEmpty) {
                    c3138j.m9030a();
                }
            }

            /* JADX INFO: renamed from: b */
            public final ListIterator<V> m9034b() {
                m9033a();
                return (ListIterator) this.f16011a;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return m9034b().hasPrevious();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return m9034b().nextIndex();
            }

            @Override // java.util.ListIterator
            public final V previous() {
                return m9034b().previous();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return m9034b().previousIndex();
            }

            @Override // java.util.ListIterator
            public final void set(V v10) {
                m9034b().set(v10);
            }
        }

        public C3138j(K k10, List<V> list, AbstractMapBasedMultimap<K, V>.C3137i c3137i) {
            super(k10, list, c3137i);
        }

        @Override // java.util.List
        public final void add(int i10, V v10) {
            m9031f();
            boolean zIsEmpty = this.f16007b.isEmpty();
            ((List) this.f16007b).add(i10, v10);
            AbstractMapBasedMultimap.this.f15985e++;
            if (zIsEmpty) {
                m9030a();
            }
        }

        @Override // java.util.List
        public final boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = ((List) this.f16007b).addAll(i10, collection);
            if (zAddAll) {
                AbstractMapBasedMultimap.this.f15985e += this.f16007b.size() - size;
                if (size == 0) {
                    m9030a();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public final V get(int i10) {
            m9031f();
            return (V) ((List) this.f16007b).get(i10);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            m9031f();
            return ((List) this.f16007b).indexOf(obj);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            m9031f();
            return ((List) this.f16007b).lastIndexOf(obj);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator() {
            m9031f();
            return new a();
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator(int i10) {
            m9031f();
            return new a(i10);
        }

        @Override // java.util.List
        public final V remove(int i10) {
            m9031f();
            V v10 = (V) ((List) this.f16007b).remove(i10);
            AbstractMapBasedMultimap.this.f15985e--;
            m9032g();
            return v10;
        }

        @Override // java.util.List
        public final V set(int i10, V v10) {
            m9031f();
            return (V) ((List) this.f16007b).set(i10, v10);
        }

        @Override // java.util.List
        public final List<V> subList(int i10, int i11) {
            m9031f();
            List listSubList = ((List) this.f16007b).subList(i10, i11);
            AbstractMapBasedMultimap<K, V>.C3137i c3137i = this.f16008c;
            if (c3137i == null) {
                c3137i = this;
            }
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            abstractMapBasedMultimap.getClass();
            boolean z10 = listSubList instanceof RandomAccess;
            K k10 = this.f16006a;
            return z10 ? new C3134f(abstractMapBasedMultimap, k10, listSubList, c3137i) : new C3138j(k10, listSubList, c3137i);
        }
    }

    public AbstractMapBasedMultimap(Map<K, Collection<V>> map) {
        C8573r0.m16681K(map.isEmpty());
        this.f15984d = map;
    }

    /* JADX INFO: renamed from: c */
    public final void m9020c() {
        Iterator<Collection<V>> it = this.f15984d.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f15984d.clear();
        this.f15985e = 0;
    }

    @Override // com.google.common.collect.InterfaceC3203v
    public final AbstractC3182d.a values() {
        AbstractC3182d.a aVar = this.f16150b;
        if (aVar == null) {
            aVar = new AbstractC3182d.a();
            this.f16150b = aVar;
        }
        return aVar;
    }
}
