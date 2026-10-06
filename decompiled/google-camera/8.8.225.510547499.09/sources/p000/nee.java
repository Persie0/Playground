package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nee implements Iterator {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ nef f42091a;

    /* JADX INFO: renamed from: b */
    private int f42092b = 0;

    public nee(nef nefVar) {
        this.f42091a = nefVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f42092b < this.f42091a.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f42092b;
        if (i >= this.f42091a.size()) {
            throw new NoSuchElementException();
        }
        nef nefVar = this.f42091a;
        Object obj = nefVar.f42094b.f42096b[nefVar.m17408b() + i];
        this.f42092b = i + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
