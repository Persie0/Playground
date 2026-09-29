package p419ul;

import dm.C5207g;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.builders.MapBuilder;
import tl.AbstractC9317e;

/* JADX INFO: renamed from: ul.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C9554a<E> extends AbstractC9317e<E> {

    /* JADX INFO: renamed from: a */
    public final MapBuilder<E, ?> f49129a;

    public C9554a(MapBuilder<E, ?> mapBuilder) {
        C5207g.m11111f(mapBuilder, "backing");
        this.f49129a = mapBuilder;
    }

    @Override // tl.AbstractC9317e
    /* JADX INFO: renamed from: a */
    public final int mo12619a() {
        return this.f49129a.f38065h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        C5207g.m11111f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f49129a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f49129a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f49129a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        MapBuilder<E, ?> mapBuilder = this.f49129a;
        mapBuilder.getClass();
        return new MapBuilder.C6750e(mapBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        MapBuilder<E, ?> mapBuilder = this.f49129a;
        mapBuilder.m13403b();
        int iM13407k = mapBuilder.m13407k(obj);
        if (iM13407k < 0) {
            iM13407k = -1;
        } else {
            mapBuilder.m13410q(iM13407k);
        }
        return iM13407k >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> collection) {
        C5207g.m11111f(collection, "elements");
        this.f49129a.m13403b();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> collection) {
        C5207g.m11111f(collection, "elements");
        this.f49129a.m13403b();
        return super.retainAll(collection);
    }
}
