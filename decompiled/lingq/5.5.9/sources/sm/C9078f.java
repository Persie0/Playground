package sm;

import java.util.Iterator;
import java.util.List;
import mn.C7646c;

/* JADX INFO: renamed from: sm.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C9078f implements InterfaceC9077e {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC9075c> f47366a;

    /* JADX WARN: Multi-variable type inference failed */
    public C9078f(List<? extends InterfaceC9075c> list) {
        this.f47366a = list;
    }

    @Override // sm.InterfaceC9077e
    /* JADX INFO: renamed from: h */
    public final InterfaceC9075c mo5291h(C7646c c7646c) {
        return InterfaceC9077e.b.m17280a(this, c7646c);
    }

    @Override // sm.InterfaceC9077e
    public final boolean isEmpty() {
        return this.f47366a.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC9075c> iterator() {
        return this.f47366a.iterator();
    }

    public final String toString() {
        return this.f47366a.toString();
    }

    @Override // sm.InterfaceC9077e
    /* JADX INFO: renamed from: x */
    public final boolean mo5292x(C7646c c7646c) {
        return InterfaceC9077e.b.m17281b(this, c7646c);
    }
}
