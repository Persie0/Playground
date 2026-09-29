package p249lo;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: lo.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C7412e<T> implements InterfaceC7415h<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7415h<T> f41236a;

    /* JADX INFO: renamed from: b */
    public final boolean f41237b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2052l<T, Boolean> f41238c;

    /* JADX INFO: renamed from: lo.e$a */
    public static final class a implements Iterator<T>, InterfaceC5429a {

        /* JADX INFO: renamed from: a */
        public final Iterator<T> f41239a;

        /* JADX INFO: renamed from: b */
        public int f41240b = -1;

        /* JADX INFO: renamed from: c */
        public T f41241c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C7412e<T> f41242d;

        public a(C7412e<T> c7412e) {
            this.f41242d = c7412e;
            this.f41239a = c7412e.f41236a.iterator();
        }

        /* JADX INFO: renamed from: a */
        public final void m14816a() {
            T next;
            C7412e<T> c7412e;
            do {
                Iterator<T> it = this.f41239a;
                if (!it.hasNext()) {
                    this.f41240b = 0;
                    return;
                } else {
                    next = it.next();
                    c7412e = this.f41242d;
                }
            } while (c7412e.f41238c.mo528n(next).booleanValue() != c7412e.f41237b);
            this.f41241c = next;
            this.f41240b = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f41240b == -1) {
                m14816a();
            }
            return this.f41240b == 1;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Iterator
        public final T next() {
            if (this.f41240b == -1) {
                m14816a();
            }
            if (this.f41240b == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.f41241c;
            this.f41241c = null;
            this.f41240b = -1;
            return t10;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7412e(InterfaceC7415h<? extends T> interfaceC7415h, boolean z10, InterfaceC2052l<? super T, Boolean> interfaceC2052l) {
        C5207g.m11111f(interfaceC2052l, "predicate");
        this.f41236a = interfaceC7415h;
        this.f41237b = z10;
        this.f41238c = interfaceC2052l;
    }

    @Override // p249lo.InterfaceC7415h
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
