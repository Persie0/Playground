package p186j0;

import dm.C5207g;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import p100em.InterfaceC5429a;
import p165i0.C6111d;

/* JADX INFO: renamed from: j0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6400c<E> implements Iterator<E>, InterfaceC5429a {

    /* JADX INFO: renamed from: a */
    public Object f36858a;

    /* JADX INFO: renamed from: b */
    public final Map<E, C6398a> f36859b;

    /* JADX INFO: renamed from: c */
    public int f36860c;

    public C6400c(Object obj, C6111d c6111d) {
        C5207g.m11111f(c6111d, "map");
        this.f36858a = obj;
        this.f36859b = c6111d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36860c < this.f36859b.size();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E e10 = (E) this.f36858a;
        this.f36860c++;
        C6398a c6398a = this.f36859b.get(e10);
        if (c6398a != null) {
            this.f36858a = c6398a.f36853b;
            return e10;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e10 + ") has changed after it was added to the persistent set.");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
