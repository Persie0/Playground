package p227ko;

import java.util.Iterator;

/* JADX INFO: renamed from: ko.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6737a<E> implements Iterable<E> {

    /* JADX INFO: renamed from: d */
    public static final C6737a<Object> f37998d = new C6737a<>();

    /* JADX INFO: renamed from: a */
    public final E f37999a;

    /* JADX INFO: renamed from: b */
    public final C6737a<E> f38000b;

    /* JADX INFO: renamed from: c */
    public final int f38001c;

    /* JADX INFO: renamed from: ko.a$a */
    public static class a<E> implements Iterator<E> {

        /* JADX INFO: renamed from: a */
        public C6737a<E> f38002a;

        public a(C6737a<E> c6737a) {
            this.f38002a = c6737a;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f38002a.f38001c > 0;
        }

        @Override // java.util.Iterator
        public final E next() {
            C6737a<E> c6737a = this.f38002a;
            E e10 = c6737a.f37999a;
            this.f38002a = c6737a.f38000b;
            return e10;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C6737a() {
        this.f38001c = 0;
        this.f37999a = null;
        this.f38000b = null;
    }

    public C6737a(E e10, C6737a<E> c6737a) {
        this.f37999a = e10;
        this.f38000b = c6737a;
        this.f38001c = c6737a.f38001c + 1;
    }

    /* JADX INFO: renamed from: a */
    public final C6737a<E> m13357a(Object obj) {
        if (this.f38001c == 0) {
            return this;
        }
        E e10 = this.f37999a;
        boolean zEquals = e10.equals(obj);
        C6737a<E> c6737a = this.f38000b;
        if (zEquals) {
            return c6737a;
        }
        C6737a<E> c6737aM13357a = c6737a.m13357a(obj);
        return c6737aM13357a == c6737a ? this : new C6737a<>(e10, c6737aM13357a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final C6737a<E> m13358f(int i10) {
        if (i10 < 0 || i10 > this.f38001c) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 == 0) {
            return this;
        }
        return this.f38000b.m13358f(i10 - 1);
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        return new a(m13358f(0));
    }
}
