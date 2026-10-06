package p021j$.util.stream;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToLongFunction;
import p021j$.util.AbstractC0517U;
import p021j$.util.Optional;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.U0 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0631U0 extends AbstractC0655c implements Stream {
    AbstractC0631U0(Spliterator spliterator, int i, boolean z) {
        super(spliterator, i, z);
    }

    @Override // p021j$.util.stream.AbstractC0655c
    /* JADX INFO: renamed from: F */
    final InterfaceC0613O mo12590F(AbstractC0586F abstractC0586F, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC0584E0.m12629h(abstractC0586F, spliterator, z, intFunction);
    }

    @Override // p021j$.util.stream.AbstractC0655c
    /* JADX INFO: renamed from: G */
    final boolean mo12591G(Spliterator spliterator, InterfaceC0646Z0 interfaceC0646Z0) {
        boolean zMo12600m;
        do {
            zMo12600m = interfaceC0646Z0.mo12600m();
            if (zMo12600m) {
                break;
            }
        } while (spliterator.tryAdvance(interfaceC0646Z0));
        return zMo12600m;
    }

    @Override // p021j$.util.stream.AbstractC0655c
    /* JADX INFO: renamed from: H */
    final EnumC0714v1 mo12592H() {
        return EnumC0714v1.REFERENCE;
    }

    @Override // p021j$.util.stream.AbstractC0655c
    /* JADX INFO: renamed from: L */
    final Spliterator mo12593L(Supplier supplier) {
        return new C0576B1(supplier);
    }

    @Override // p021j$.util.stream.AbstractC0655c
    /* JADX INFO: renamed from: S */
    final Spliterator mo12594S(AbstractC0586F abstractC0586F, C0648a c0648a, boolean z) {
        return new C0632U1(abstractC0586F, c0648a, z);
    }

    @Override // p021j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) m12690D(AbstractC0586F.m12659z(EnumC0577C.ALL, predicate))).booleanValue();
    }

    @Override // p021j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) m12690D(AbstractC0586F.m12659z(EnumC0577C.ANY, predicate))).booleanValue();
    }

    @Override // p021j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Object objM12690D;
        if (mo12606a() && collector.characteristics().contains(Collector.Characteristics.CONCURRENT) && (!m12693J() || collector.characteristics().contains(Collector.Characteristics.UNORDERED))) {
            objM12690D = collector.mo12614c().get();
            forEach(new C0673i(2, collector.mo12612a(), objM12690D));
        } else {
            collector.getClass();
            Supplier supplierMo12614c = collector.mo12614c();
            objM12690D = m12690D(new C0590G0(EnumC0714v1.REFERENCE, collector.mo12613b(), collector.mo12612a(), supplierMo12614c, collector));
        }
        return collector.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH) ? objM12690D : collector.mo12615d().apply(objM12690D);
    }

    @Override // p021j$.util.stream.Stream
    public final long count() {
        return ((Long) m12690D(new C0602K0(EnumC0714v1.REFERENCE))).longValue();
    }

    @Override // p021j$.util.stream.Stream
    public final Stream distinct() {
        return new C0682l(this, EnumC0711u1.f33496m | EnumC0711u1.f33502s);
    }

    @Override // p021j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        predicate.getClass();
        return new C0715w(this, EnumC0711u1.f33502s, predicate, 1);
    }

    @Override // p021j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) m12690D(C0688n.f33448c);
    }

    public void forEach(Consumer consumer) {
        consumer.getClass();
        m12690D(new C0697q(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        consumer.getClass();
        m12690D(new C0697q(consumer, true));
    }

    @Override // p021j$.util.stream.BaseStream
    public final Iterator iterator() {
        return AbstractC0517U.m12519i(spliterator());
    }

    @Override // p021j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j >= 0) {
            return new C0654b1(this, EnumC0711u1.f33502s | (j != -1 ? EnumC0711u1.f33503t : 0), j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // p021j$.util.stream.Stream
    public final Stream map(Function function) {
        function.getClass();
        return new C0715w(this, EnumC0711u1.f33498o | EnumC0711u1.f33497n, function, 2);
    }

    @Override // p021j$.util.stream.Stream
    public final LongStream mapToLong(ToLongFunction toLongFunction) {
        toLongFunction.getClass();
        return new C0620Q0(this, EnumC0711u1.f33498o | EnumC0711u1.f33497n, toLongFunction);
    }

    @Override // p021j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) m12690D(AbstractC0586F.m12659z(EnumC0577C.NONE, predicate))).booleanValue();
    }

    @Override // p021j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new C0666f1(this, comparator);
    }

    @Override // p021j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC0584E0.m12634m(m12691E(intFunction), intFunction).mo12601n(intFunction);
    }

    @Override // p021j$.util.stream.AbstractC0586F
    /* JADX INFO: renamed from: y */
    final InterfaceC0598J mo12595y(long j, IntFunction intFunction) {
        return AbstractC0584E0.m12628g(j, intFunction);
    }

    AbstractC0631U0(AbstractC0655c abstractC0655c, int i) {
        super(abstractC0655c, i);
    }

    AbstractC0631U0(Supplier supplier, int i, boolean z) {
        super(supplier, i, z);
    }
}
