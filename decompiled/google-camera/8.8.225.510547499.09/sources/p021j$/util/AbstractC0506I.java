package p021j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.I */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0506I implements InterfaceC0728u {

    /* JADX INFO: renamed from: c */
    private int f33131c;

    /* JADX INFO: renamed from: b */
    private long f33130b = Long.MAX_VALUE;

    /* JADX INFO: renamed from: a */
    private final int f33129a = 1296;

    protected AbstractC0506I() {
    }

    @Override // p021j$.util.Spliterator
    public final int characteristics() {
        return this.f33129a;
    }

    @Override // p021j$.util.Spliterator
    public final long estimateSize() {
        return this.f33130b;
    }

    @Override // p021j$.util.InterfaceC0498A
    public final void forEachRemaining(Object obj) {
        while (true) {
            tryAdvance((IntConsumer) obj);
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
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0521b.m12537k(this, consumer);
    }

    @Override // p021j$.util.Spliterator
    public final InterfaceC0728u trySplit() {
        C0505H c0505h = new C0505H();
        long j = this.f33130b;
        if (j <= 1) {
            return null;
        }
        tryAdvance((IntConsumer) c0505h);
        int i = this.f33131c + 1024;
        if (i > j) {
            i = (int) j;
        }
        if (i > 33554432) {
            i = 33554432;
        }
        int[] iArr = new int[i];
        int i2 = 0;
        while (true) {
            iArr[i2] = c0505h.f33128a;
            i2++;
            if (i2 >= i) {
                break;
            }
            tryAdvance((IntConsumer) c0505h);
        }
        this.f33131c = i2;
        long j2 = this.f33130b;
        if (j2 != Long.MAX_VALUE) {
            this.f33130b = j2 - ((long) i2);
        }
        return new C0514Q(iArr, 0, i2, this.f33129a);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0521b.m12528b(this, consumer);
    }

    @Override // p021j$.util.InterfaceC0728u
    public final void forEachRemaining(IntConsumer intConsumer) {
        while (true) {
            tryAdvance(intConsumer);
        }
    }
}
