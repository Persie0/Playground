package p165i0;

import dm.C5207g;
import java.util.Map;

/* JADX INFO: renamed from: i0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C6131x<K, V> extends AbstractC6128u<K, V, Map.Entry<K, V>> {

    /* JADX INFO: renamed from: d */
    public final C6116i<K, V> f35959d;

    public C6131x(C6116i<K, V> c6116i) {
        C5207g.m11111f(c6116i, "parentIterator");
        this.f35959d = c6116i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f35958c + 2;
        this.f35958c = i10;
        Object[] objArr = this.f35956a;
        return new C6110c(this.f35959d, objArr[i10 - 2], objArr[i10 - 1]);
    }
}
