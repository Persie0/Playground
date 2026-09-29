package p165i0;

import dm.C5207g;
import java.util.Iterator;
import java.util.Map;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: i0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C6116i<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC5429a {

    /* JADX INFO: renamed from: a */
    public final C6114g<K, V, Map.Entry<K, V>> f35941a;

    public C6116i(C6113f<K, V> c6113f) {
        C5207g.m11111f(c6113f, "builder");
        AbstractC6128u[] abstractC6128uArr = new AbstractC6128u[8];
        for (int i10 = 0; i10 < 8; i10++) {
            abstractC6128uArr[i10] = new C6131x(this);
        }
        this.f35941a = new C6114g<>(c6113f, abstractC6128uArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35941a.f35929c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f35941a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f35941a.remove();
    }
}
