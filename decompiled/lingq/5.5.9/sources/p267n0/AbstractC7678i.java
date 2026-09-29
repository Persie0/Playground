package p267n0;

import dm.C5207g;
import java.util.Set;
import p100em.InterfaceC5433e;
import p338qd.C8573r0;

/* JADX INFO: renamed from: n0.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7678i<K, V, E> implements Set<E>, InterfaceC5433e {

    /* JADX INFO: renamed from: a */
    public final C7682m<K, V> f42168a;

    public AbstractC7678i(C7682m<K, V> c7682m) {
        C5207g.m11111f(c7682m, "map");
        this.f42168a = c7682m;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f42168a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f42168a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f42168a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return C8573r0.m16728h1(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        C5207g.m11111f(tArr, "array");
        return (T[]) C8573r0.m16730i1(this, tArr);
    }
}
