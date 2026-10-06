package p021j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.L */
/* JADX INFO: loaded from: classes3.dex */
final class C0509L implements InterfaceC0569r {

    /* JADX INFO: renamed from: a */
    private final double[] f33137a;

    /* JADX INFO: renamed from: b */
    private int f33138b;

    /* JADX INFO: renamed from: c */
    private final int f33139c;

    /* JADX INFO: renamed from: d */
    private final int f33140d;

    public C0509L(double[] dArr, int i, int i2, int i3) {
        this.f33137a = dArr;
        this.f33138b = i;
        this.f33139c = i2;
        this.f33140d = i3 | 64 | 16384;
    }

    @Override // p021j$.util.Spliterator
    public final int characteristics() {
        return this.f33140d;
    }

    @Override // p021j$.util.Spliterator
    public final long estimateSize() {
        return this.f33139c - this.f33138b;
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
    public final InterfaceC0569r trySplit() {
        int i = this.f33138b;
        int i2 = (this.f33139c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f33138b = i2;
        return new C0509L(this.f33137a, i, i2, this.f33140d);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0521b.m12527a(this, consumer);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0521b.m12536j(this, consumer);
    }

    @Override // p021j$.util.InterfaceC0498A
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        int i;
        doubleConsumer.getClass();
        double[] dArr = this.f33137a;
        int length = dArr.length;
        int i2 = this.f33139c;
        if (length < i2 || (i = this.f33138b) < 0) {
            return;
        }
        this.f33138b = i2;
        if (i < i2) {
            do {
                doubleConsumer.accept(dArr[i]);
                i++;
            } while (i < i2);
        }
    }

    @Override // p021j$.util.InterfaceC0498A
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        int i = this.f33138b;
        if (i < 0 || i >= this.f33139c) {
            return false;
        }
        this.f33138b = i + 1;
        doubleConsumer.accept(this.f33137a[i]);
        return true;
    }
}
