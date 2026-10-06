package p021j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.N */
/* JADX INFO: loaded from: classes3.dex */
final class C0511N extends AbstractC0521b implements InterfaceC0728u {
    C0511N() {
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0521b.m12528b(this, consumer);
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
        return AbstractC0521b.m12537k(this, consumer);
    }

    @Override // p021j$.util.AbstractC0521b, p021j$.util.InterfaceC0498A, p021j$.util.Spliterator
    public final /* bridge */ /* synthetic */ InterfaceC0728u trySplit() {
        return null;
    }

    @Override // p021j$.util.InterfaceC0728u
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
    }

    @Override // p021j$.util.InterfaceC0728u
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        return false;
    }

    @Override // p021j$.util.AbstractC0521b, p021j$.util.InterfaceC0498A, p021j$.util.Spliterator
    public final /* bridge */ /* synthetic */ InterfaceC0498A trySplit() {
        return null;
    }
}
