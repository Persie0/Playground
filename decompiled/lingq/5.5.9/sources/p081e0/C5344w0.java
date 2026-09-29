package p081e0;

import ae.C0062b;
import dm.C5207g;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: e0.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5344w0 implements Iterable<Object>, InterfaceC5429a {

    /* JADX INFO: renamed from: a */
    public final C5342v0 f33634a;

    /* JADX INFO: renamed from: b */
    public final int f33635b;

    /* JADX INFO: renamed from: c */
    public final int f33636c;

    public C5344w0(int i10, int i11, C5342v0 c5342v0) {
        C5207g.m11111f(c5342v0, "table");
        this.f33634a = c5342v0;
        this.f33635b = i10;
        this.f33636c = i11;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        C5342v0 c5342v0 = this.f33634a;
        if (c5342v0.f33630g != this.f33636c) {
            throw new ConcurrentModificationException();
        }
        int i10 = this.f33635b;
        return new C5337t(i10 + 1, C0062b.m404v(c5342v0.f33624a, i10) + i10, c5342v0);
    }
}
