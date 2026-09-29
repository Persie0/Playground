package p249lo;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: lo.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C7413f<T, R, E> implements InterfaceC7415h<E> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7415h<T> f41243a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2052l<T, R> f41244b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2052l<R, Iterator<E>> f41245c;

    /* JADX INFO: renamed from: lo.f$a */
    public static final class a implements Iterator<E>, InterfaceC5429a {

        /* JADX INFO: renamed from: a */
        public final Iterator<T> f41246a;

        /* JADX INFO: renamed from: b */
        public Iterator<? extends E> f41247b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C7413f<T, R, E> f41248c;

        public a(C7413f<T, R, E> c7413f) {
            this.f41248c = c7413f;
            this.f41246a = c7413f.f41243a.iterator();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m14817a() {
            Iterator<? extends E> it = this.f41247b;
            if ((it == null || it.hasNext()) ? false : true) {
                this.f41247b = null;
            }
            while (this.f41247b == null) {
                Iterator<T> it2 = this.f41246a;
                if (!it2.hasNext()) {
                    return false;
                }
                T next = it2.next();
                C7413f<T, R, E> c7413f = this.f41248c;
                Iterator<? extends E> it3 = (Iterator) c7413f.f41245c.mo528n(c7413f.f41244b.mo528n(next));
                if (it3.hasNext()) {
                    this.f41247b = it3;
                    break;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return m14817a();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Iterator
        public final E next() {
            if (!m14817a()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends E> it = this.f41247b;
            C5207g.m11108c(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7413f(InterfaceC7415h<? extends T> interfaceC7415h, InterfaceC2052l<? super T, ? extends R> interfaceC2052l, InterfaceC2052l<? super R, ? extends Iterator<? extends E>> interfaceC2052l2) {
        C5207g.m11111f(interfaceC7415h, "sequence");
        C5207g.m11111f(interfaceC2052l, "transformer");
        C5207g.m11111f(interfaceC2052l2, "iterator");
        this.f41243a = interfaceC7415h;
        this.f41244b = interfaceC2052l;
        this.f41245c = interfaceC2052l2;
    }

    @Override // p249lo.InterfaceC7415h
    public final Iterator<E> iterator() {
        return new a(this);
    }
}
