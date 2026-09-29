package p000;

import java.util.ListIterator;

/* JADX INFO: renamed from: x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3742x0 extends C3705w0 implements ListIterator {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC3816z0 f67582d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3742x0(AbstractC3816z0 abstractC3816z0, int i) {
        super(abstractC3816z0, 0);
        this.f67582d = abstractC3816z0;
        int iMo3718d = abstractC3816z0.mo3718d();
        if (i < 0 || i > iMo3718d) {
            v63.m23143u(wq1.m24115k("index: ", i, iMo3718d, ", size: "));
            throw null;
        }
        this.f66155b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f66155b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f66155b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            uk9.m22784s();
            return null;
        }
        int i = this.f66155b - 1;
        this.f66155b = i;
        return this.f67582d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f66155b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
