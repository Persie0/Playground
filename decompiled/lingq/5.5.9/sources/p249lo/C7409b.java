package p249lo;

import dm.C5207g;
import java.util.Iterator;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: lo.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C7409b<T> implements InterfaceC7415h<T>, InterfaceC7410c<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7415h<T> f41231a;

    /* JADX INFO: renamed from: b */
    public final int f41232b;

    /* JADX INFO: renamed from: lo.b$a */
    public static final class a implements Iterator<T>, InterfaceC5429a {

        /* JADX INFO: renamed from: a */
        public final Iterator<T> f41233a;

        /* JADX INFO: renamed from: b */
        public int f41234b;

        public a(C7409b<T> c7409b) {
            this.f41233a = c7409b.f41231a.iterator();
            this.f41234b = c7409b.f41232b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Iterator<T> it;
            while (true) {
                int i10 = this.f41234b;
                it = this.f41233a;
                if (i10 <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f41234b--;
            }
            return it.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            Iterator<T> it;
            while (true) {
                int i10 = this.f41234b;
                it = this.f41233a;
                if (i10 <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f41234b--;
            }
            return it.next();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7409b(InterfaceC7415h<? extends T> interfaceC7415h, int i10) {
        C5207g.m11111f(interfaceC7415h, "sequence");
        this.f41231a = interfaceC7415h;
        this.f41232b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // p249lo.InterfaceC7410c
    /* JADX INFO: renamed from: a */
    public final InterfaceC7415h<T> mo14815a(int i10) {
        int i11 = this.f41232b + i10;
        return i11 < 0 ? new C7409b(this, i10) : new C7409b(this.f41231a, i11);
    }

    @Override // p249lo.InterfaceC7415h
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
