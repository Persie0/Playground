package p021j$.util.stream;

import java.util.Comparator;
import java.util.function.Consumer;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.O1 */
/* JADX INFO: loaded from: classes3.dex */
final class C0615O1 extends AbstractC0618P1 implements Spliterator {
    C0615O1(Spliterator spliterator, long j, long j2) {
        super(spliterator, j, j2, 0L, Math.min(spliterator.estimateSize(), j2));
    }

    @Override // p021j$.util.stream.AbstractC0618P1
    /* JADX INFO: renamed from: a */
    protected final Spliterator mo12668a(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new C0615O1(spliterator, j, j2, j3, j4);
    }

    @Override // p021j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        long j = this.f33341e;
        long j2 = this.f33337a;
        if (j2 >= j) {
            return;
        }
        long j3 = this.f33340d;
        if (j3 >= j) {
            return;
        }
        if (j3 >= j2 && this.f33339c.estimateSize() + j3 <= this.f33338b) {
            this.f33339c.forEachRemaining(consumer);
            this.f33340d = this.f33341e;
            return;
        }
        while (j2 > this.f33340d) {
            this.f33339c.tryAdvance(new C0652b(15));
            this.f33340d++;
        }
        while (this.f33340d < this.f33341e) {
            this.f33339c.tryAdvance(consumer);
            this.f33340d++;
        }
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
        long j;
        consumer.getClass();
        long j2 = this.f33341e;
        long j3 = this.f33337a;
        if (j3 >= j2) {
            return false;
        }
        while (true) {
            j = this.f33340d;
            if (j3 <= j) {
                break;
            }
            this.f33339c.tryAdvance(new C0652b(16));
            this.f33340d++;
        }
        if (j >= this.f33341e) {
            return false;
        }
        this.f33340d = j + 1;
        return this.f33339c.tryAdvance(consumer);
    }

    private C0615O1(Spliterator spliterator, long j, long j2, long j3, long j4) {
        super(spliterator, j, j2, j3, j4);
    }
}
