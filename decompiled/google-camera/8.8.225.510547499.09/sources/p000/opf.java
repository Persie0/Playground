package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class opf implements Iterator {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ opg f46373a;

    /* JADX INFO: renamed from: b */
    private final Iterator f46374b;

    public opf(opg opgVar) {
        this.f46373a = opgVar;
        this.f46374b = opgVar.f46375a.mo18817a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f46374b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f46373a.f46376b.mo1803a(this.f46374b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
