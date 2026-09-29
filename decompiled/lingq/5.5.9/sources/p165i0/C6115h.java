package p165i0;

import dm.C5207g;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: i0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C6115h<K, V> extends AbstractC6108a<Map.Entry<K, V>, K, V> {

    /* JADX INFO: renamed from: a */
    public final C6113f<K, V> f35940a;

    public C6115h(C6113f<K, V> c6113f) {
        C5207g.m11111f(c6113f, "builder");
        this.f35940a = c6113f;
    }

    @Override // tl.AbstractC9317e
    /* JADX INFO: renamed from: a */
    public final int mo12619a() {
        C6113f<K, V> c6113f = this.f35940a;
        c6113f.getClass();
        return c6113f.f35935f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        C5207g.m11111f((Map.Entry) obj, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f35940a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new C6116i(this.f35940a);
    }
}
