package p021j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.Q */
/* JADX INFO: loaded from: classes3.dex */
final class C0514Q implements InterfaceC0728u {

    /* JADX INFO: renamed from: a */
    private final int[] f33146a;

    /* JADX INFO: renamed from: b */
    private int f33147b;

    /* JADX INFO: renamed from: c */
    private final int f33148c;

    /* JADX INFO: renamed from: d */
    private final int f33149d;

    public C0514Q(int[] iArr, int i, int i2, int i3) {
        this.f33146a = iArr;
        this.f33147b = i;
        this.f33148c = i2;
        this.f33149d = i3 | 64 | 16384;
    }

    @Override // p021j$.util.Spliterator
    public final int characteristics() {
        return this.f33149d;
    }

    @Override // p021j$.util.Spliterator
    public final long estimateSize() {
        return this.f33148c - this.f33147b;
    }

    @Override // p021j$.util.Spliterator
    public final Comparator getComparator() {
        if (Spliterator.CC.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
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
    public final InterfaceC0728u trySplit() {
        int i = this.f33147b;
        int i2 = (this.f33148c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f33147b = i2;
        return new C0514Q(this.f33146a, i, i2, this.f33149d);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0521b.m12528b(this, consumer);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0521b.m12537k(this, consumer);
    }

    @Override // p021j$.util.InterfaceC0498A
    public final void forEachRemaining(IntConsumer intConsumer) {
        int i;
        intConsumer.getClass();
        int[] iArr = this.f33146a;
        int length = iArr.length;
        int i2 = this.f33148c;
        if (length < i2 || (i = this.f33147b) < 0) {
            return;
        }
        this.f33147b = i2;
        if (i < i2) {
            do {
                intConsumer.accept(iArr[i]);
                i++;
            } while (i < i2);
        }
    }

    @Override // p021j$.util.InterfaceC0498A
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i = this.f33147b;
        if (i < 0 || i >= this.f33148c) {
            return false;
        }
        this.f33147b = i + 1;
        intConsumer.accept(this.f33146a[i]);
        return true;
    }
}
