package p021j$.util.stream;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;
import p021j$.util.InterfaceC0498A;
import p021j$.util.InterfaceC0728u;
import p021j$.util.InterfaceC0731x;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.B1 */
/* JADX INFO: loaded from: classes3.dex */
class C0576B1 implements Spliterator {

    /* JADX INFO: renamed from: a */
    private final Supplier f33282a;

    /* JADX INFO: renamed from: b */
    private Spliterator f33283b;

    C0576B1(Supplier supplier) {
        this.f33282a = supplier;
    }

    /* JADX INFO: renamed from: a */
    final Spliterator m12605a() {
        if (this.f33283b == null) {
            this.f33283b = (Spliterator) this.f33282a.get();
        }
        return this.f33283b;
    }

    @Override // p021j$.util.Spliterator
    public final int characteristics() {
        return m12605a().characteristics();
    }

    @Override // p021j$.util.Spliterator
    public final long estimateSize() {
        return m12605a().estimateSize();
    }

    @Override // p021j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        m12605a().forEachRemaining(consumer);
    }

    @Override // p021j$.util.Spliterator
    public final Comparator getComparator() {
        return m12605a().getComparator();
    }

    @Override // p021j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return m12605a().getExactSizeIfKnown();
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    public final String toString() {
        return getClass().getName() + "[" + String.valueOf(m12605a()) + "]";
    }

    @Override // p021j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        return m12605a().tryAdvance(consumer);
    }

    @Override // p021j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC0728u trySplit() {
        return (InterfaceC0728u) trySplit();
    }

    @Override // p021j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC0731x trySplit() {
        return (InterfaceC0731x) trySplit();
    }

    @Override // p021j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC0498A trySplit() {
        return (InterfaceC0498A) trySplit();
    }

    @Override // p021j$.util.Spliterator
    public final Spliterator trySplit() {
        return m12605a().trySplit();
    }
}
