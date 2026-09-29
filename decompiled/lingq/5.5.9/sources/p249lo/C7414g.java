package p249lo;

import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: lo.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C7414g<T> implements InterfaceC7415h<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2041a<T> f41249a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2052l<T, T> f41250b;

    /* JADX INFO: renamed from: lo.g$a */
    public static final class a implements Iterator<T>, InterfaceC5429a {

        /* JADX INFO: renamed from: a */
        public T f41251a;

        /* JADX INFO: renamed from: b */
        public int f41252b = -2;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C7414g<T> f41253c;

        public a(C7414g<T> c7414g) {
            this.f41253c = c7414g;
        }

        /* JADX INFO: renamed from: a */
        public final void m14818a() {
            T tMo528n;
            int i10 = this.f41252b;
            C7414g<T> c7414g = this.f41253c;
            if (i10 == -2) {
                tMo528n = c7414g.f41249a.mo807E();
            } else {
                InterfaceC2052l<T, T> interfaceC2052l = c7414g.f41250b;
                T t10 = this.f41251a;
                C5207g.m11108c(t10);
                tMo528n = interfaceC2052l.mo528n(t10);
            }
            this.f41251a = tMo528n;
            this.f41252b = tMo528n == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f41252b < 0) {
                m14818a();
            }
            return this.f41252b == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f41252b < 0) {
                m14818a();
            }
            if (this.f41252b == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.f41251a;
            C5207g.m11109d(t10, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f41252b = -1;
            return t10;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7414g(InterfaceC2041a<? extends T> interfaceC2041a, InterfaceC2052l<? super T, ? extends T> interfaceC2052l) {
        C5207g.m11111f(interfaceC2052l, "getNextValue");
        this.f41249a = interfaceC2041a;
        this.f41250b = interfaceC2052l;
    }

    @Override // p249lo.InterfaceC7415h
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
