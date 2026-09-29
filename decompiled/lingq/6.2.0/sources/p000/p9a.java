package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class p9a implements Iterator, tg4 {

    /* JADX INFO: renamed from: a */
    public final Iterator f55811a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bl3 f55812b;

    public p9a(bl3 bl3Var) {
        this.f55812b = bl3Var;
        this.f55811a = ((ux8) bl3Var.f8659c).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f55811a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f55812b.f8658b.invoke(this.f55811a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
