package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class nas implements Iterator {

    /* JADX INFO: renamed from: b */
    final Iterator f41903b;

    public nas(Iterator it) {
        it.getClass();
        this.f41903b = it;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo17158a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41903b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo17158a(this.f41903b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f41903b.remove();
    }
}
