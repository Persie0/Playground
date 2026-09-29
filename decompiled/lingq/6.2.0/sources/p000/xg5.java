package p000;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class xg5 implements ListIterator {

    /* JADX INFO: renamed from: a */
    public boolean f68179a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ListIterator f68180b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yg5 f68181c;

    public xg5(yg5 yg5Var, ListIterator listIterator) {
        this.f68180b = listIterator;
        this.f68181c = yg5Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.f68180b;
        listIterator.add(obj);
        listIterator.previous();
        this.f68179a = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f68180b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f68180b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ListIterator listIterator = this.f68180b;
        if (listIterator.hasPrevious()) {
            this.f68179a = true;
            return listIterator.previous();
        }
        uk9.m22784s();
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f68181c.m25124f(this.f68180b.nextIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ListIterator listIterator = this.f68180b;
        if (listIterator.hasNext()) {
            this.f68179a = true;
            return listIterator.next();
        }
        uk9.m22784s();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        bna.m3985y("no calls to next() since the last call to remove()", this.f68179a);
        this.f68180b.remove();
        this.f68179a = false;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        bna.m3987z(this.f68179a);
        this.f68180b.set(obj);
    }
}
