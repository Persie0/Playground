package p000;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class s98 implements ListIterator, tg4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60561a = 0;

    /* JADX INFO: renamed from: b */
    public final ListIterator f60562b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f60563c;

    public s98(u98 u98Var, int i) {
        this.f60563c = u98Var;
        this.f60562b = u98Var.f63619a.listIterator(u91.m22629v0(i, u98Var));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f60561a) {
            case 0:
                ListIterator listIterator = this.f60562b;
                listIterator.add(obj);
                listIterator.previous();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f60561a) {
            case 0:
                break;
        }
        return this.f60562b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f60561a) {
            case 0:
                break;
        }
        return this.f60562b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f60561a) {
            case 0:
                break;
        }
        return this.f60562b.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int iPreviousIndex;
        int size;
        int i = this.f60561a;
        ListIterator listIterator = this.f60562b;
        Object obj = this.f60563c;
        switch (i) {
            case 0:
                iPreviousIndex = listIterator.previousIndex();
                size = ((t98) obj).size();
                break;
            default:
                iPreviousIndex = listIterator.previousIndex();
                size = ((u98) obj).size();
                break;
        }
        return (size - 1) - iPreviousIndex;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f60561a) {
            case 0:
                break;
        }
        return this.f60562b.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int iNextIndex;
        int size;
        int i = this.f60561a;
        ListIterator listIterator = this.f60562b;
        Object obj = this.f60563c;
        switch (i) {
            case 0:
                iNextIndex = listIterator.nextIndex();
                size = ((t98) obj).size();
                break;
            default:
                iNextIndex = listIterator.nextIndex();
                size = ((u98) obj).size();
                break;
        }
        return (size - 1) - iNextIndex;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f60561a) {
            case 0:
                this.f60562b.remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f60561a) {
            case 0:
                this.f60562b.set(obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public s98(t98 t98Var, int i) {
        this.f60563c = t98Var;
        this.f60562b = t98Var.f62023a.listIterator(u91.m22629v0(i, t98Var));
    }
}
