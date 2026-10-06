package p000;

import java.util.ListIterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class nat extends nas implements ListIterator {
    public nat(ListIterator listIterator) {
        super(listIterator);
    }

    /* JADX INFO: renamed from: b */
    private final ListIterator m17208b() {
        return (ListIterator) this.f41903b;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return m17208b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return m17208b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return mo17158a(m17208b().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return m17208b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
