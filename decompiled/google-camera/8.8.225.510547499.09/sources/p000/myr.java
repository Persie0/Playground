package p000;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class myr extends nab {
    /* JADX INFO: renamed from: a */
    public abstract Map mo16889a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        mo16889a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object objM16561z = mkv.m16561z(mo16889a(), key);
        if (mpw.m16768g(objM16561z, entry.getValue())) {
            return objM16561z != null || mo16889a().containsKey(key);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return mo16889a().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return mo16889a().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // p000.nab, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return mpw.m16753E(this, collection);
        } catch (UnsupportedOperationException e) {
            return mpw.m16754F(this, collection.iterator());
        }
    }

    @Override // p000.nab, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException e) {
            HashSet hashSetM16750B = mpw.m16750B(collection.size());
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSetM16750B.add(((Map.Entry) obj).getKey());
                }
            }
            return mo16889a().keySet().retainAll(hashSetM16750B);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return mo16889a().size();
    }
}
