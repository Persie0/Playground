package p021j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.Supplier;
import p021j$.util.InterfaceC0498A;

/* JADX INFO: renamed from: j$.util.stream.A1 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0573A1 extends C0576B1 implements InterfaceC0498A {
    AbstractC0573A1(Supplier supplier) {
        super(supplier);
    }

    @Override // p021j$.util.InterfaceC0498A
    public final void forEachRemaining(Object obj) {
        ((InterfaceC0498A) m12605a()).forEachRemaining(obj);
    }

    @Override // p021j$.util.InterfaceC0498A
    public final boolean tryAdvance(Object obj) {
        return ((InterfaceC0498A) m12605a()).tryAdvance(obj);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }
}
