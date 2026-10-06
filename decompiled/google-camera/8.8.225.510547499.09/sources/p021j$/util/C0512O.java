package p021j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.O */
/* JADX INFO: loaded from: classes3.dex */
final class C0512O extends AbstractC0521b implements InterfaceC0731x {
    C0512O() {
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0521b.m12529c(this, consumer);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0521b.m12538l(this, consumer);
    }

    @Override // p021j$.util.AbstractC0521b, p021j$.util.InterfaceC0498A, p021j$.util.Spliterator
    public final /* bridge */ /* synthetic */ InterfaceC0731x trySplit() {
        return null;
    }

    @Override // p021j$.util.InterfaceC0731x
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
    }

    @Override // p021j$.util.InterfaceC0731x
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        return false;
    }

    @Override // p021j$.util.AbstractC0521b, p021j$.util.InterfaceC0498A, p021j$.util.Spliterator
    public final /* bridge */ /* synthetic */ InterfaceC0498A trySplit() {
        return null;
    }
}
