package p000;

import java.util.ListIterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nzz implements ListIterator {

    /* JADX INFO: renamed from: a */
    final ListIterator f45111a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int f45112b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ oab f45113c;

    public nzz(oab oabVar, int i) {
        this.f45113c = oabVar;
        this.f45112b = i;
        this.f45111a = oabVar.f45119a.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f45111a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f45111a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f45111a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f45111a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f45111a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f45111a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
