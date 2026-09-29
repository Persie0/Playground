package p081e0;

import ae.C0062b;
import dm.C5207g;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: e0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C5337t implements Iterator<Object>, InterfaceC5429a {

    /* JADX INFO: renamed from: a */
    public final C5342v0 f33614a;

    /* JADX INFO: renamed from: b */
    public final int f33615b;

    /* JADX INFO: renamed from: c */
    public int f33616c;

    /* JADX INFO: renamed from: d */
    public final int f33617d;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C5337t(int i10, int i11, C5342v0 c5342v0) {
        C5207g.m11111f(c5342v0, "table");
        this.f33614a = c5342v0;
        this.f33615b = i11;
        this.f33616c = i10;
        this.f33617d = c5342v0.f33630g;
        if (c5342v0.f33629f) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33616c < this.f33615b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Iterator
    public final Object next() {
        C5342v0 c5342v0 = this.f33614a;
        int i10 = c5342v0.f33630g;
        int i11 = this.f33617d;
        if (i10 != i11) {
            throw new ConcurrentModificationException();
        }
        int i12 = this.f33616c;
        this.f33616c = C0062b.m404v(c5342v0.f33624a, i12) + i12;
        return new C5344w0(i12, i11, c5342v0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
