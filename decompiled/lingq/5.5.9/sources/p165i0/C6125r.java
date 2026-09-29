package p165i0;

import dm.C5207g;
import java.util.Iterator;
import kotlin.collections.AbstractCollection;

/* JADX INFO: renamed from: i0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C6125r<K, V> extends AbstractCollection<V> {

    /* JADX INFO: renamed from: a */
    public final C6111d<K, V> f35948a;

    public C6125r(C6111d<K, V> c6111d) {
        C5207g.m11111f(c6111d, "map");
        this.f35948a = c6111d;
    }

    @Override // kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: a */
    public final int mo1847a() {
        C6111d<K, V> c6111d = this.f35948a;
        c6111d.getClass();
        return c6111d.f35926b;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f35948a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new C6126s(this.f35948a.f35925a);
    }
}
