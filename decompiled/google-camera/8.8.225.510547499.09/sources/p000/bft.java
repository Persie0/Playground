package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bft implements Iterator {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Iterator f3129a;

    public bft(Iterator it) {
        this.f3129a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3129a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f3129a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove() is not allowed due to the internal contraints");
    }
}
