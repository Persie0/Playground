package p021j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.T */
/* JADX INFO: loaded from: classes3.dex */
final class C0516T implements InterfaceC0731x {

    /* JADX INFO: renamed from: a */
    private final long[] f33164a;

    /* JADX INFO: renamed from: b */
    private int f33165b;

    /* JADX INFO: renamed from: c */
    private final int f33166c;

    /* JADX INFO: renamed from: d */
    private final int f33167d;

    public C0516T(long[] jArr, int i, int i2, int i3) {
        this.f33164a = jArr;
        this.f33165b = i;
        this.f33166c = i2;
        this.f33167d = i3 | 64 | 16384;
    }

    @Override // p021j$.util.Spliterator
    public final int characteristics() {
        return this.f33167d;
    }

    @Override // p021j$.util.Spliterator
    public final long estimateSize() {
        return this.f33166c - this.f33165b;
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
    public final InterfaceC0731x trySplit() {
        int i = this.f33165b;
        int i2 = (this.f33166c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f33165b = i2;
        return new C0516T(this.f33164a, i, i2, this.f33167d);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0521b.m12529c(this, consumer);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0521b.m12538l(this, consumer);
    }

    @Override // p021j$.util.InterfaceC0498A
    public final void forEachRemaining(LongConsumer longConsumer) {
        int i;
        longConsumer.getClass();
        long[] jArr = this.f33164a;
        int length = jArr.length;
        int i2 = this.f33166c;
        if (length < i2 || (i = this.f33165b) < 0) {
            return;
        }
        this.f33165b = i2;
        if (i < i2) {
            do {
                longConsumer.accept(jArr[i]);
                i++;
            } while (i < i2);
        }
    }

    @Override // p021j$.util.InterfaceC0498A
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        int i = this.f33165b;
        if (i < 0 || i >= this.f33166c) {
            return false;
        }
        this.f33165b = i + 1;
        longConsumer.accept(this.f33164a[i]);
        return true;
    }
}
