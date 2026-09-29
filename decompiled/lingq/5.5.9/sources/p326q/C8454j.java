package p326q;

import java.util.Iterator;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: q.j */
/* JADX INFO: loaded from: classes.dex */
public final class C8454j implements Iterator<Object>, InterfaceC5429a {

    /* JADX INFO: renamed from: a */
    public int f45625a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8453i f45626b;

    public C8454j(C8453i<Object> c8453i) {
        this.f45626b = c8453i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f45625a < this.f45626b.m16537h();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f45625a;
        this.f45625a = i10 + 1;
        return this.f45626b.m16538i(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
