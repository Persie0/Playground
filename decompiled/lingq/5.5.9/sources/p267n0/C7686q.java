package p267n0;

import dm.C5207g;
import java.util.Iterator;
import java.util.Map;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: n0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C7686q<K, V> extends AbstractC7687r<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC5429a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7686q(C7682m<K, V> c7682m, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(c7682m, it);
        C5207g.m11111f(c7682m, "map");
        C5207g.m11111f(it, "iterator");
    }

    @Override // java.util.Iterator
    public final Object next() {
        m15282a();
        if (this.f42186d != null) {
            return new C7685p(this);
        }
        throw new IllegalStateException();
    }
}
