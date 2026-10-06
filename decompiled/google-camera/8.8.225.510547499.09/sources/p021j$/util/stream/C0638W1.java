package p021j$.util.stream;

import java.util.Comparator;
import java.util.function.Consumer;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.W1 */
/* JADX INFO: loaded from: classes3.dex */
final class C0638W1 implements Spliterator {

    /* JADX INFO: renamed from: a */
    protected final Spliterator f33367a;

    /* JADX INFO: renamed from: b */
    protected final Spliterator f33368b;

    /* JADX INFO: renamed from: c */
    boolean f33369c = true;

    /* JADX INFO: renamed from: d */
    final boolean f33370d;

    C0638W1(Spliterator spliterator, Spliterator spliterator2) {
        this.f33367a = spliterator;
        this.f33368b = spliterator2;
        this.f33370d = spliterator2.estimateSize() + spliterator.estimateSize() < 0;
    }

    @Override // p021j$.util.Spliterator
    public final int characteristics() {
        boolean z = this.f33369c;
        Spliterator spliterator = this.f33368b;
        if (z) {
            return this.f33367a.characteristics() & spliterator.characteristics() & (((this.f33370d ? 16448 : 0) | 5) ^ (-1));
        }
        return spliterator.characteristics();
    }

    @Override // p021j$.util.Spliterator
    public final long estimateSize() {
        boolean z = this.f33369c;
        Spliterator spliterator = this.f33368b;
        if (!z) {
            return spliterator.estimateSize();
        }
        long jEstimateSize = spliterator.estimateSize() + this.f33367a.estimateSize();
        if (jEstimateSize >= 0) {
            return jEstimateSize;
        }
        return Long.MAX_VALUE;
    }

    @Override // p021j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f33369c) {
            this.f33367a.forEachRemaining(consumer);
        }
        this.f33368b.forEachRemaining(consumer);
    }

    @Override // p021j$.util.Spliterator
    public final Comparator getComparator() {
        if (this.f33369c) {
            throw new IllegalStateException();
        }
        return this.f33368b.getComparator();
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
        if (this.f33369c) {
            boolean zTryAdvance = this.f33367a.tryAdvance(consumer);
            if (zTryAdvance) {
                return zTryAdvance;
            }
            this.f33369c = false;
        }
        return this.f33368b.tryAdvance(consumer);
    }

    @Override // p021j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f33369c ? this.f33367a : this.f33368b.trySplit();
        this.f33369c = false;
        return spliteratorTrySplit;
    }
}
