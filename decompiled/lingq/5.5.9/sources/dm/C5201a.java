package dm;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: dm.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C5201a<T> implements Iterator<T>, InterfaceC5429a {

    /* JADX INFO: renamed from: a */
    public final T[] f33260a;

    /* JADX INFO: renamed from: b */
    public int f33261b;

    public C5201a(T[] tArr) {
        C5207g.m11111f(tArr, "array");
        this.f33260a = tArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33261b < this.f33260a.length;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.f33260a;
            int i10 = this.f33261b;
            this.f33261b = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f33261b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
