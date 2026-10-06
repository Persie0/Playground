package p021j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.M */
/* JADX INFO: loaded from: classes3.dex */
final class C0510M extends AbstractC0521b implements InterfaceC0569r {
    C0510M() {
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0521b.m12527a(this, consumer);
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
        return AbstractC0521b.m12536j(this, consumer);
    }

    @Override // p021j$.util.AbstractC0521b, p021j$.util.InterfaceC0498A, p021j$.util.Spliterator
    public final /* bridge */ /* synthetic */ InterfaceC0569r trySplit() {
        return null;
    }

    @Override // p021j$.util.InterfaceC0569r
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
    }

    @Override // p021j$.util.InterfaceC0569r
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        return false;
    }

    @Override // p021j$.util.AbstractC0521b, p021j$.util.InterfaceC0498A, p021j$.util.Spliterator
    public final /* bridge */ /* synthetic */ InterfaceC0498A trySplit() {
        return null;
    }
}
