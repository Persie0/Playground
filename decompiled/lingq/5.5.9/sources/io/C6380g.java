package io;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: io.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C6380g extends AbstractC6375b {

    /* JADX INFO: renamed from: a */
    public static final C6380g f36783a = new C6380g();

    /* JADX INFO: renamed from: io.g$a */
    public static final class a implements Iterator, InterfaceC5429a {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // io.AbstractC6375b
    /* JADX INFO: renamed from: a */
    public final int mo13006a() {
        return 0;
    }

    @Override // io.AbstractC6375b
    /* JADX INFO: renamed from: f */
    public final void mo13007f(int i10, Object obj) {
        throw new IllegalStateException();
    }

    @Override // io.AbstractC6375b
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return null;
    }

    @Override // io.AbstractC6375b, java.lang.Iterable
    public final Iterator iterator() {
        return new a();
    }
}
