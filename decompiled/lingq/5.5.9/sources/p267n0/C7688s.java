package p267n0;

import dm.C5207g;
import java.util.Iterator;
import java.util.Map;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: n0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C7688s<K, V> extends AbstractC7687r<K, V> implements Iterator<K>, InterfaceC5429a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7688s(C7682m<K, V> c7682m, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(c7682m, it);
        C5207g.m11111f(c7682m, "map");
        C5207g.m11111f(it, "iterator");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Iterator
    public final K next() {
        Map.Entry<? extends K, ? extends V> entry = this.f42187e;
        if (entry == null) {
            throw new IllegalStateException();
        }
        m15282a();
        return entry.getKey();
    }
}
