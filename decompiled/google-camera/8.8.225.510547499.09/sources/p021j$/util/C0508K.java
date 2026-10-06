package p021j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.K */
/* JADX INFO: loaded from: classes3.dex */
final class C0508K implements Spliterator {

    /* JADX INFO: renamed from: a */
    private final Object[] f33133a;

    /* JADX INFO: renamed from: b */
    private int f33134b;

    /* JADX INFO: renamed from: c */
    private final int f33135c;

    /* JADX INFO: renamed from: d */
    private final int f33136d;

    public C0508K(Object[] objArr, int i, int i2, int i3) {
        this.f33133a = objArr;
        this.f33134b = i;
        this.f33135c = i2;
        this.f33136d = i3 | 64 | 16384;
    }

    @Override // p021j$.util.Spliterator
    public final int characteristics() {
        return this.f33136d;
    }

    @Override // p021j$.util.Spliterator
    public final long estimateSize() {
        return this.f33135c - this.f33134b;
    }

    @Override // p021j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        int i;
        consumer.getClass();
        Object[] objArr = this.f33133a;
        int length = objArr.length;
        int i2 = this.f33135c;
        if (length < i2 || (i = this.f33134b) < 0) {
            return;
        }
        this.f33134b = i2;
        if (i < i2) {
            do {
                consumer.accept(objArr[i]);
                i++;
            } while (i < i2);
        }
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
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int i = this.f33134b;
        if (i < 0 || i >= this.f33135c) {
            return false;
        }
        this.f33134b = i + 1;
        consumer.accept(this.f33133a[i]);
        return true;
    }

    @Override // p021j$.util.Spliterator
    public final Spliterator trySplit() {
        int i = this.f33134b;
        int i2 = (this.f33135c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f33134b = i2;
        return new C0508K(this.f33133a, i, i2, this.f33136d);
    }
}
