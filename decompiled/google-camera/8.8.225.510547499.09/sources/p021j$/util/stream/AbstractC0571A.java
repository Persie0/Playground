package p021j$.util.stream;

import java.util.Iterator;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Supplier;
import p021j$.desugar.sun.nio.p023fs.C0300n;
import p021j$.util.AbstractC0517U;
import p021j$.util.InterfaceC0731x;
import p021j$.util.OptionalLong;
import p021j$.util.Spliterator;
import p021j$.util.function.C0555g;

/* JADX INFO: renamed from: j$.util.stream.A */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0571A extends AbstractC0655c implements LongStream {
    AbstractC0571A(AbstractC0655c abstractC0655c, int i) {
        super(abstractC0655c, i);
    }

    @Override // p021j$.util.stream.AbstractC0655c
    /* JADX INFO: renamed from: F */
    final InterfaceC0613O mo12590F(AbstractC0586F abstractC0586F, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC0584E0.m12631j(abstractC0586F, spliterator, z);
    }

    @Override // p021j$.util.stream.AbstractC0655c
    /* JADX INFO: renamed from: G */
    final boolean mo12591G(Spliterator spliterator, final InterfaceC0646Z0 interfaceC0646Z0) {
        LongConsumer longConsumer;
        boolean zMo12600m;
        if (!(spliterator instanceof InterfaceC0731x)) {
            if (!AbstractC0651a2.f33376a) {
                throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
            }
            AbstractC0651a2.m12681a(AbstractC0655c.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        InterfaceC0731x interfaceC0731x = (InterfaceC0731x) spliterator;
        if (interfaceC0646Z0 instanceof LongConsumer) {
            longConsumer = (LongConsumer) interfaceC0646Z0;
        } else {
            if (AbstractC0651a2.f33376a) {
                AbstractC0651a2.m12681a(AbstractC0655c.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            interfaceC0646Z0.getClass();
            longConsumer = new LongConsumer() { // from class: j$.util.stream.z
                @Override // java.util.function.LongConsumer
                public final void accept(long j) {
                    interfaceC0646Z0.accept(j);
                }

                public final LongConsumer andThen(LongConsumer longConsumer2) {
                    longConsumer2.getClass();
                    return new C0555g(this, longConsumer2);
                }
            };
        }
        do {
            zMo12600m = interfaceC0646Z0.mo12600m();
            if (zMo12600m) {
                break;
            }
        } while (interfaceC0731x.tryAdvance(longConsumer));
        return zMo12600m;
    }

    @Override // p021j$.util.stream.AbstractC0655c
    /* JADX INFO: renamed from: H */
    final EnumC0714v1 mo12592H() {
        return EnumC0714v1.LONG_VALUE;
    }

    @Override // p021j$.util.stream.AbstractC0655c
    /* JADX INFO: renamed from: L */
    final Spliterator mo12593L(Supplier supplier) {
        return new C0726z1(supplier);
    }

    @Override // p021j$.util.stream.AbstractC0655c
    /* JADX INFO: renamed from: S */
    final Spliterator mo12594S(AbstractC0586F abstractC0586F, C0648a c0648a, boolean z) {
        return new C0591G1(abstractC0586F, c0648a, z);
    }

    @Override // p021j$.util.stream.BaseStream
    public final Iterator<Long> iterator() {
        Spliterator spliterator = super.spliterator();
        if (spliterator instanceof InterfaceC0731x) {
            return AbstractC0517U.m12518h((InterfaceC0731x) spliterator);
        }
        if (!AbstractC0651a2.f33376a) {
            throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
        }
        AbstractC0651a2.m12681a(AbstractC0655c.class, "using LongStream.adapt(Spliterator<Long> s)");
        throw null;
    }

    @Override // p021j$.util.stream.LongStream
    public final OptionalLong max() {
        return (OptionalLong) m12690D(new C0587F0(EnumC0714v1.LONG_VALUE, new C0300n()));
    }

    @Override // p021j$.util.stream.AbstractC0655c, p021j$.util.stream.BaseStream
    public final Spliterator spliterator() {
        Spliterator spliterator = super.spliterator();
        if (spliterator instanceof InterfaceC0731x) {
            return (InterfaceC0731x) spliterator;
        }
        if (!AbstractC0651a2.f33376a) {
            throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
        }
        AbstractC0651a2.m12681a(AbstractC0655c.class, "using LongStream.adapt(Spliterator<Long> s)");
        throw null;
    }

    @Override // p021j$.util.stream.AbstractC0586F
    /* JADX INFO: renamed from: y */
    final InterfaceC0598J mo12595y(long j, IntFunction intFunction) {
        return AbstractC0584E0.m12636o(j);
    }
}
