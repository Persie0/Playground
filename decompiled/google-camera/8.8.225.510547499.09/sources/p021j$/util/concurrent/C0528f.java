package p021j$.util.concurrent;

import java.util.Comparator;
import java.util.function.Consumer;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.concurrent.f */
/* JADX INFO: loaded from: classes3.dex */
final class C0528f extends C0538p implements Spliterator {

    /* JADX INFO: renamed from: i */
    final ConcurrentHashMap f33202i;

    /* JADX INFO: renamed from: j */
    long f33203j;

    C0528f(C0533k[] c0533kArr, int i, int i2, int i3, long j, ConcurrentHashMap concurrentHashMap) {
        super(c0533kArr, i, i2, i3);
        this.f33202i = concurrentHashMap;
        this.f33203j = j;
    }

    @Override // p021j$.util.Spliterator
    public final int characteristics() {
        return 4353;
    }

    @Override // p021j$.util.Spliterator
    public final long estimateSize() {
        return this.f33203j;
    }

    @Override // p021j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            C0533k c0533kM12566a = m12566a();
            if (c0533kM12566a == null) {
                return;
            } else {
                consumer.accept(new C0532j(c0533kM12566a.f33212b, c0533kM12566a.f33213c, this.f33202i));
            }
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
        consumer.getClass();
        C0533k c0533kM12566a = m12566a();
        if (c0533kM12566a == null) {
            return false;
        }
        consumer.accept(new C0532j(c0533kM12566a.f33212b, c0533kM12566a.f33213c, this.f33202i));
        return true;
    }

    @Override // p021j$.util.Spliterator
    public final Spliterator trySplit() {
        int i = this.f33224f;
        int i2 = this.f33225g;
        int i3 = (i + i2) >>> 1;
        if (i3 <= i) {
            return null;
        }
        C0533k[] c0533kArr = this.f33219a;
        int i4 = this.f33226h;
        this.f33225g = i3;
        long j = this.f33203j >>> 1;
        this.f33203j = j;
        return new C0528f(c0533kArr, i4, i3, i2, j, this.f33202i);
    }
}
