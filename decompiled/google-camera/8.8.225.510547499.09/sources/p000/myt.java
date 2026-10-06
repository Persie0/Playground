package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class myt extends AbstractCollection {

    /* JADX INFO: renamed from: a */
    final Map f41821a;

    public myt(Map map) {
        this.f41821a = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f41821a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f41821a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f41821a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return mkv.m16495C(this.f41821a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException e) {
            for (Map.Entry entry : this.f41821a.entrySet()) {
                if (mpw.m16768g(obj, entry.getValue())) {
                    this.f41821a.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException e) {
            HashSet hashSetM16749A = mpw.m16749A();
            for (Map.Entry entry : this.f41821a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSetM16749A.add(entry.getKey());
                }
            }
            return this.f41821a.keySet().removeAll(hashSetM16749A);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException e) {
            HashSet hashSetM16749A = mpw.m16749A();
            for (Map.Entry entry : this.f41821a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSetM16749A.add(entry.getKey());
                }
            }
            return this.f41821a.keySet().retainAll(hashSetM16749A);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f41821a.size();
    }
}
