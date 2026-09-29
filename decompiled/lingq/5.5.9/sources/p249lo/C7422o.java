package p249lo;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: lo.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C7422o<T> implements InterfaceC7415h<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7415h<T> f41261a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2052l<T, Boolean> f41262b;

    /* JADX INFO: renamed from: lo.o$a */
    public static final class a implements Iterator<T>, InterfaceC5429a {

        /* JADX INFO: renamed from: a */
        public final Iterator<T> f41263a;

        /* JADX INFO: renamed from: b */
        public int f41264b = -1;

        /* JADX INFO: renamed from: c */
        public T f41265c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C7422o<T> f41266d;

        public a(C7422o<T> c7422o) {
            this.f41266d = c7422o;
            this.f41263a = c7422o.f41261a.iterator();
        }

        /* JADX INFO: renamed from: a */
        public final void m14822a() {
            Iterator<T> it = this.f41263a;
            if (it.hasNext()) {
                T next = it.next();
                if (this.f41266d.f41262b.mo528n(next).booleanValue()) {
                    this.f41264b = 1;
                    this.f41265c = next;
                    return;
                }
            }
            this.f41264b = 0;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f41264b == -1) {
                m14822a();
            }
            return this.f41264b == 1;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Iterator
        public final T next() {
            if (this.f41264b == -1) {
                m14822a();
            }
            if (this.f41264b == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.f41265c;
            this.f41265c = null;
            this.f41264b = -1;
            return t10;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7422o(InterfaceC7415h<? extends T> interfaceC7415h, InterfaceC2052l<? super T, Boolean> interfaceC2052l) {
        C5207g.m11111f(interfaceC7415h, "sequence");
        C5207g.m11111f(interfaceC2052l, "predicate");
        this.f41261a = interfaceC7415h;
        this.f41262b = interfaceC2052l;
    }

    @Override // p249lo.InterfaceC7415h
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
