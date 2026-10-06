package p021j$.util.stream;

import java.util.Iterator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import p021j$.util.AbstractC0517U;
import p021j$.util.InterfaceC0728u;
import p021j$.util.Spliterator;
import p021j$.util.function.C0553e;

/* JADX INFO: renamed from: j$.util.stream.x */
/* JADX INFO: loaded from: classes3.dex */
final class C0718x extends AbstractC0655c implements IntStream {
    C0718x(Spliterator spliterator, int i) {
        super(spliterator, i, false);
    }

    @Override // p021j$.util.stream.AbstractC0655c
    /* JADX INFO: renamed from: F */
    final InterfaceC0613O mo12590F(AbstractC0586F abstractC0586F, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC0584E0.m12630i(abstractC0586F, spliterator, z);
    }

    @Override // p021j$.util.stream.AbstractC0655c
    /* JADX INFO: renamed from: G */
    final boolean mo12591G(Spliterator spliterator, final InterfaceC0646Z0 interfaceC0646Z0) {
        IntConsumer intConsumer;
        boolean zMo12600m;
        if (!(spliterator instanceof InterfaceC0728u)) {
            if (!AbstractC0651a2.f33376a) {
                throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
            }
            AbstractC0651a2.m12681a(AbstractC0655c.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        InterfaceC0728u interfaceC0728u = (InterfaceC0728u) spliterator;
        if (interfaceC0646Z0 instanceof IntConsumer) {
            intConsumer = (IntConsumer) interfaceC0646Z0;
        } else {
            if (AbstractC0651a2.f33376a) {
                AbstractC0651a2.m12681a(AbstractC0655c.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            interfaceC0646Z0.getClass();
            intConsumer = new IntConsumer() { // from class: j$.util.stream.u
                @Override // java.util.function.IntConsumer
                public final void accept(int i) {
                    interfaceC0646Z0.accept(i);
                }

                public final IntConsumer andThen(IntConsumer intConsumer2) {
                    intConsumer2.getClass();
                    return new C0553e(this, intConsumer2);
                }
            };
        }
        do {
            zMo12600m = interfaceC0646Z0.mo12600m();
            if (zMo12600m) {
                break;
            }
        } while (interfaceC0728u.tryAdvance(intConsumer));
        return zMo12600m;
    }

    @Override // p021j$.util.stream.AbstractC0655c
    /* JADX INFO: renamed from: H */
    final EnumC0714v1 mo12592H() {
        return EnumC0714v1.INT_VALUE;
    }

    @Override // p021j$.util.stream.AbstractC0655c
    /* JADX INFO: renamed from: L */
    final Spliterator mo12593L(Supplier supplier) {
        return new C0723y1(supplier);
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

    @Override // p021j$.util.stream.AbstractC0655c
    /* JADX INFO: renamed from: S */
    final Spliterator mo12594S(AbstractC0586F abstractC0586F, C0648a c0648a, boolean z) {
        return new C0585E1(abstractC0586F, c0648a, z);
    }

    @Override // p021j$.util.stream.IntStream
    public final Stream boxed() {
        return new C0715w(this, 0, new C0652b(29), 0);
    }

    @Override // p021j$.util.stream.BaseStream
    public final Iterator<Integer> iterator() {
        Spliterator spliterator = super.spliterator();
        if (spliterator instanceof InterfaceC0728u) {
            return AbstractC0517U.m12517g((InterfaceC0728u) spliterator);
        }
        if (!AbstractC0651a2.f33376a) {
            throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
        }
        AbstractC0651a2.m12681a(AbstractC0655c.class, "using IntStream.adapt(Spliterator<Integer> s)");
        throw null;
    }

    @Override // p021j$.util.stream.AbstractC0655c, p021j$.util.stream.BaseStream
    public final Spliterator spliterator() {
        Spliterator spliterator = super.spliterator();
        if (spliterator instanceof InterfaceC0728u) {
            return (InterfaceC0728u) spliterator;
        }
        if (!AbstractC0651a2.f33376a) {
            throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
        }
        AbstractC0651a2.m12681a(AbstractC0655c.class, "using IntStream.adapt(Spliterator<Integer> s)");
        throw null;
    }

    @Override // p021j$.util.stream.AbstractC0586F
    /* JADX INFO: renamed from: y */
    final InterfaceC0598J mo12595y(long j, IntFunction intFunction) {
        return AbstractC0584E0.m12635n(j);
    }
}
