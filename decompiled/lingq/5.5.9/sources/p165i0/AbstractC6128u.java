package p165i0;

import java.util.Iterator;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: i0.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6128u<K, V, T> implements Iterator<T>, InterfaceC5429a {

    /* JADX INFO: renamed from: a */
    public Object[] f35956a;

    /* JADX INFO: renamed from: b */
    public int f35957b;

    /* JADX INFO: renamed from: c */
    public int f35958c;

    public AbstractC6128u() {
        C6127t c6127t = C6127t.f35949e;
        this.f35956a = C6127t.f35949e.f35953d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35958c < this.f35957b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
