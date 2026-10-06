package p021j$.util.stream;

import java.util.function.Consumer;
import java.util.function.Supplier;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.R0 */
/* JADX INFO: loaded from: classes3.dex */
final class C0622R0 extends AbstractC0631U0 {
    C0622R0(Spliterator spliterator, int i, boolean z) {
        super(spliterator, i, z);
    }

    @Override // p021j$.util.stream.AbstractC0655c
    /* JADX INFO: renamed from: O */
    final boolean mo12674O() {
        throw new UnsupportedOperationException();
    }

    @Override // p021j$.util.stream.AbstractC0655c
    /* JADX INFO: renamed from: P */
    final InterfaceC0646Z0 mo12675P(int i, InterfaceC0646Z0 interfaceC0646Z0) {
        throw new UnsupportedOperationException();
    }

    @Override // p021j$.util.stream.AbstractC0631U0, p021j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (mo12606a()) {
            super.forEach(consumer);
        } else {
            m12695R().forEachRemaining(consumer);
        }
    }

    @Override // p021j$.util.stream.AbstractC0631U0, p021j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (mo12606a()) {
            super.forEachOrdered(consumer);
        } else {
            m12695R().forEachRemaining(consumer);
        }
    }

    C0622R0(Supplier supplier, int i, boolean z) {
        super(supplier, i, z);
    }
}
