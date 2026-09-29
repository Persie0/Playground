package p000;

import java.util.ListIterator;

/* JADX INFO: renamed from: a1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0003a1 implements ListIterator, tg4 {

    /* JADX INFO: renamed from: a */
    public int f41a;

    /* JADX INFO: renamed from: b */
    public int f42b;

    public AbstractC0003a1(int i, int i2) {
        this.f41a = i;
        this.f42b = i2;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f41a < this.f42b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f41a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f41a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f41a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
