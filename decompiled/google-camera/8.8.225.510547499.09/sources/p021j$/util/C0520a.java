package p021j$.util;

import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.a */
/* JADX INFO: loaded from: classes3.dex */
final class C0520a implements Spliterator {

    /* JADX INFO: renamed from: a */
    private final List f33173a;

    /* JADX INFO: renamed from: b */
    private int f33174b;

    /* JADX INFO: renamed from: c */
    private int f33175c;

    private C0520a(C0520a c0520a, int i, int i2) {
        this.f33173a = c0520a.f33173a;
        this.f33174b = i;
        this.f33175c = i2;
    }

    /* JADX INFO: renamed from: a */
    private int m12526a() {
        int i = this.f33175c;
        if (i >= 0) {
            return i;
        }
        int size = this.f33173a.size();
        this.f33175c = size;
        return size;
    }

    @Override // p021j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // p021j$.util.Spliterator
    public final long estimateSize() {
        return m12526a() - this.f33174b;
    }

    @Override // p021j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        int iM12526a = m12526a();
        this.f33174b = iM12526a;
        for (int i = this.f33174b; i < iM12526a; i++) {
            try {
                consumer.accept(this.f33173a.get(i));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
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
        int iM12526a = m12526a();
        int i = this.f33174b;
        if (i >= iM12526a) {
            return false;
        }
        this.f33174b = i + 1;
        try {
            consumer.accept(this.f33173a.get(i));
            return true;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // p021j$.util.Spliterator
    public final Spliterator trySplit() {
        int iM12526a = m12526a();
        int i = this.f33174b;
        int i2 = (iM12526a + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f33174b = i2;
        return new C0520a(this, i, i2);
    }

    C0520a(List list) {
        this.f33173a = list;
        this.f33174b = 0;
        this.f33175c = -1;
    }
}
