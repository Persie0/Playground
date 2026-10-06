package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mxx implements Iterator {

    /* JADX INFO: renamed from: a */
    boolean f41782a = true;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Iterator f41783b;

    public mxx(Iterator it) {
        this.f41783b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41783b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.f41783b.next();
        this.f41782a = false;
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        lku.m15654h(!this.f41782a);
        this.f41783b.remove();
    }
}
