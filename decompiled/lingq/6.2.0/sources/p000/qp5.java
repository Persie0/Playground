package p000;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.builders.MapBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class qp5 extends AbstractC3022g1 {

    /* JADX INFO: renamed from: a */
    public final MapBuilder f58030a;

    public qp5(MapBuilder mapBuilder) {
        this.f58030a = mapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f58030a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f58030a.containsKey(obj);
    }

    @Override // p000.AbstractC3022g1
    /* JADX INFO: renamed from: d */
    public final int mo12276d() {
        return this.f58030a.f47669i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f58030a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        MapBuilder mapBuilder = this.f58030a;
        mapBuilder.getClass();
        return new op5(mapBuilder, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        MapBuilder mapBuilder = this.f58030a;
        mapBuilder.m15393c();
        int iM15397g = mapBuilder.m15397g(obj);
        if (iM15397g < 0) {
            return false;
        }
        mapBuilder.m15401k(iM15397g);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.f58030a.m15393c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.f58030a.m15393c();
        return super.retainAll(collection);
    }
}
