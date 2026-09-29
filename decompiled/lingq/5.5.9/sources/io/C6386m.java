package io;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p100em.InterfaceC5429a;
import p543do.AbstractC5234h0;

/* JADX INFO: renamed from: io.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C6386m<T> extends AbstractC6375b<T> {

    /* JADX INFO: renamed from: a */
    public final T f36790a;

    /* JADX INFO: renamed from: b */
    public final int f36791b;

    /* JADX INFO: renamed from: io.m$a */
    public static final class a implements Iterator<T>, InterfaceC5429a {

        /* JADX INFO: renamed from: a */
        public boolean f36792a = true;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C6386m<T> f36793b;

        public a(C6386m<T> c6386m) {
            this.f36793b = c6386m;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f36792a;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Iterator
        public final T next() {
            if (!this.f36792a) {
                throw new NoSuchElementException();
            }
            this.f36792a = false;
            return this.f36793b.f36790a;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6386m(int i10, AbstractC5234h0 abstractC5234h0) {
        this.f36790a = abstractC5234h0;
        this.f36791b = i10;
    }

    @Override // io.AbstractC6375b
    /* JADX INFO: renamed from: a */
    public final int mo13006a() {
        return 1;
    }

    @Override // io.AbstractC6375b
    /* JADX INFO: renamed from: f */
    public final void mo13007f(int i10, T t10) {
        throw new IllegalStateException();
    }

    @Override // io.AbstractC6375b
    public final T get(int i10) {
        if (i10 == this.f36791b) {
            return this.f36790a;
        }
        return null;
    }

    @Override // io.AbstractC6375b, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
