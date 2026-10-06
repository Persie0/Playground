package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mtf extends mys {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mtm f41586a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mtf(mtm mtmVar, Map map) {
        super(map);
        this.f41586a = mtmVar;
    }

    @Override // p000.mys, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        mkv.m16511S(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f41820b.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f41820b.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f41820b.keySet().hashCode();
    }

    @Override // p000.mys, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new mte(this, this.f41820b.entrySet().iterator());
    }

    @Override // p000.mys, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f41820b.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        mtm.m16900o(this.f41586a, size);
        return size > 0;
    }
}
