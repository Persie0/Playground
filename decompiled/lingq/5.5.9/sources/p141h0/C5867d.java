package p141h0;

import dm.C5207g;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: h0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C5867d<T> extends AbstractC5864a<T> {

    /* JADX INFO: renamed from: c */
    public final T[] f35140c;

    /* JADX INFO: renamed from: d */
    public final C5869f<T> f35141d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5867d(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        super(i10, i11);
        C5207g.m11111f(objArr, "root");
        C5207g.m11111f(objArr2, "tail");
        this.f35140c = objArr2;
        int i13 = (i11 - 1) & (-32);
        this.f35141d = new C5869f<>(objArr, i10 > i13 ? i13 : i10, i13, i12);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C5869f<T> c5869f = this.f35141d;
        if (c5869f.hasNext()) {
            this.f35132a++;
            return c5869f.next();
        }
        int i10 = this.f35132a;
        this.f35132a = i10 + 1;
        return this.f35140c[i10 - c5869f.f35133b];
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f35132a;
        C5869f<T> c5869f = this.f35141d;
        int i11 = c5869f.f35133b;
        if (i10 <= i11) {
            this.f35132a = i10 - 1;
            return c5869f.previous();
        }
        int i12 = i10 - 1;
        this.f35132a = i12;
        return this.f35140c[i12 - i11];
    }
}
