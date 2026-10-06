package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class myh implements ListIterator {

    /* JADX INFO: renamed from: a */
    boolean f41808a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ListIterator f41809b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ myi f41810c;

    public myh(myi myiVar, ListIterator listIterator) {
        this.f41810c = myiVar;
        this.f41809b = listIterator;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f41809b.add(obj);
        this.f41809b.previous();
        this.f41808a = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f41809b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f41809b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f41808a = true;
        return this.f41809b.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f41810c.m17160a(this.f41809b.nextIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f41808a = true;
        return this.f41809b.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        lku.m15654h(this.f41808a);
        this.f41809b.remove();
        this.f41808a = false;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        lku.m15613H(this.f41808a);
        this.f41809b.set(obj);
    }
}
