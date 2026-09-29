package p249lo;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Iterator;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: lo.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C7423p<T, R> implements InterfaceC7415h<R> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7415h<T> f41267a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2052l<T, R> f41268b;

    /* JADX INFO: renamed from: lo.p$a */
    public static final class a implements Iterator<R>, InterfaceC5429a {

        /* JADX INFO: renamed from: a */
        public final Iterator<T> f41269a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C7423p<T, R> f41270b;

        public a(C7423p<T, R> c7423p) {
            this.f41270b = c7423p;
            this.f41269a = c7423p.f41267a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f41269a.hasNext();
        }

        @Override // java.util.Iterator
        public final R next() {
            return (R) this.f41270b.f41268b.mo528n(this.f41269a.next());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7423p(InterfaceC7415h<? extends T> interfaceC7415h, InterfaceC2052l<? super T, ? extends R> interfaceC2052l) {
        C5207g.m11111f(interfaceC2052l, "transformer");
        this.f41267a = interfaceC7415h;
        this.f41268b = interfaceC2052l;
    }

    @Override // p249lo.InterfaceC7415h
    public final Iterator<R> iterator() {
        return new a(this);
    }
}
