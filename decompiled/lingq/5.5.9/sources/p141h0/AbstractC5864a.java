package p141h0;

import java.util.ListIterator;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: h0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5864a<E> implements ListIterator<E>, InterfaceC5429a {

    /* JADX INFO: renamed from: a */
    public int f35132a;

    /* JADX INFO: renamed from: b */
    public int f35133b;

    public AbstractC5864a(int i10, int i11) {
        this.f35132a = i10;
        this.f35133b = i11;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.ListIterator
    public void add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f35132a < this.f35133b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f35132a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f35132a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f35132a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
