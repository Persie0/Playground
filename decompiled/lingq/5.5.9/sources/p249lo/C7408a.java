package p249lo;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C7408a<T> implements InterfaceC7415h<T> {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<InterfaceC7415h<T>> f41230a;

    public C7408a(InterfaceC7415h<? extends T> interfaceC7415h) {
        this.f41230a = new AtomicReference<>(interfaceC7415h);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p249lo.InterfaceC7415h
    public final Iterator<T> iterator() {
        InterfaceC7415h<T> andSet = this.f41230a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
