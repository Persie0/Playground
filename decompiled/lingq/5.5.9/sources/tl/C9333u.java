package tl;

import dm.C5207g;
import java.util.Iterator;
import p100em.InterfaceC5429a;
import p385sf.C9000b;

/* JADX INFO: renamed from: tl.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C9333u<T> implements Iterator<C9331s<? extends T>>, InterfaceC5429a {

    /* JADX INFO: renamed from: a */
    public final Iterator<T> f48069a;

    /* JADX INFO: renamed from: b */
    public int f48070b;

    /* JADX WARN: Multi-variable type inference failed */
    public C9333u(Iterator<? extends T> it) {
        C5207g.m11111f(it, "iterator");
        this.f48069a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f48069a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f48070b;
        this.f48070b = i10 + 1;
        if (i10 >= 0) {
            return new C9331s(i10, this.f48069a.next());
        }
        C9000b.m17257w();
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
