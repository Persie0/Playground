package p021j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.P */
/* JADX INFO: loaded from: classes3.dex */
final class C0513P extends AbstractC0521b implements Spliterator {
    C0513P() {
    }

    @Override // p021j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
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
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        return false;
    }
}
