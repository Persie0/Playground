package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class okl implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f46201a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ oko f46202b;

    public okl(oko okoVar) {
        this.f46202b = okoVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f46201a < this.f46202b.mo18591a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        oko okoVar = this.f46202b;
        int i = this.f46201a;
        this.f46201a = i + 1;
        return okoVar.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
