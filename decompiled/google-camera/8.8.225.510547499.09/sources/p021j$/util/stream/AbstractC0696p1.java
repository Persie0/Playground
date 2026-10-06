package p021j$.util.stream;

import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import p021j$.util.InterfaceC0498A;
import p021j$.util.InterfaceC0569r;
import p021j$.util.InterfaceC0728u;
import p021j$.util.InterfaceC0731x;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.p1 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0696p1 implements InterfaceC0498A {

    /* JADX INFO: renamed from: a */
    int f33454a;

    /* JADX INFO: renamed from: b */
    final int f33455b;

    /* JADX INFO: renamed from: c */
    int f33456c;

    /* JADX INFO: renamed from: d */
    final int f33457d;

    /* JADX INFO: renamed from: e */
    Object f33458e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ AbstractC0699q1 f33459f;

    AbstractC0696p1(AbstractC0699q1 abstractC0699q1, int i, int i2, int i3, int i4) {
        this.f33459f = abstractC0699q1;
        this.f33454a = i;
        this.f33455b = i2;
        this.f33456c = i3;
        this.f33457d = i4;
        Object[] objArr = abstractC0699q1.f33462e;
        this.f33458e = objArr == null ? abstractC0699q1.f33461d : objArr[i];
    }

    /* JADX INFO: renamed from: a */
    abstract void mo12715a(int i, Object obj, Object obj2);

    /* JADX INFO: renamed from: b */
    abstract InterfaceC0498A mo12716b(Object obj, int i, int i2);

    /* JADX INFO: renamed from: c */
    abstract InterfaceC0498A mo12717c(int i, int i2, int i3, int i4);

    @Override // p021j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // p021j$.util.Spliterator
    public final long estimateSize() {
        int i = this.f33454a;
        int i2 = this.f33457d;
        int i3 = this.f33455b;
        if (i == i3) {
            return ((long) i2) - ((long) this.f33456c);
        }
        long[] jArr = this.f33459f.f33405c;
        return ((jArr[i3] + ((long) i2)) - jArr[i]) - ((long) this.f33456c);
    }

    @Override // p021j$.util.InterfaceC0498A
    public final void forEachRemaining(Object obj) {
        AbstractC0699q1 abstractC0699q1;
        obj.getClass();
        int i = this.f33454a;
        int i2 = this.f33457d;
        int i3 = this.f33455b;
        if (i < i3 || (i == i3 && this.f33456c < i2)) {
            int i4 = this.f33456c;
            while (true) {
                abstractC0699q1 = this.f33459f;
                if (i >= i3) {
                    break;
                }
                Object obj2 = abstractC0699q1.f33462e[i];
                abstractC0699q1.mo12722z(obj2, i4, abstractC0699q1.mo12719A(obj2), obj);
                i++;
                i4 = 0;
            }
            abstractC0699q1.mo12722z(this.f33454a == i3 ? this.f33458e : abstractC0699q1.f33462e[i3], i4, i2, obj);
            this.f33454a = i3;
            this.f33456c = i2;
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

    @Override // p021j$.util.InterfaceC0498A
    public final boolean tryAdvance(Object obj) {
        obj.getClass();
        int i = this.f33454a;
        int i2 = this.f33455b;
        if (i >= i2 && (i != i2 || this.f33456c >= this.f33457d)) {
            return false;
        }
        Object obj2 = this.f33458e;
        int i3 = this.f33456c;
        this.f33456c = i3 + 1;
        mo12715a(i3, obj2, obj);
        int i4 = this.f33456c;
        Object obj3 = this.f33458e;
        AbstractC0699q1 abstractC0699q1 = this.f33459f;
        if (i4 == abstractC0699q1.mo12719A(obj3)) {
            this.f33456c = 0;
            int i5 = this.f33454a + 1;
            this.f33454a = i5;
            Object[] objArr = abstractC0699q1.f33462e;
            if (objArr != null && i5 <= i2) {
                this.f33458e = objArr[i5];
            }
        }
        return true;
    }

    @Override // p021j$.util.InterfaceC0498A, p021j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC0569r trySplit() {
        return (InterfaceC0569r) trySplit();
    }

    @Override // p021j$.util.InterfaceC0498A, p021j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC0728u trySplit() {
        return (InterfaceC0728u) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    @Override // p021j$.util.InterfaceC0498A, p021j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC0731x trySplit() {
        return (InterfaceC0731x) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    @Override // p021j$.util.Spliterator
    public final InterfaceC0498A trySplit() {
        int i = this.f33454a;
        int i2 = this.f33455b;
        if (i < i2) {
            int i3 = this.f33456c;
            AbstractC0699q1 abstractC0699q1 = this.f33459f;
            InterfaceC0498A interfaceC0498AMo12717c = mo12717c(i, i2 - 1, i3, abstractC0699q1.mo12719A(abstractC0699q1.f33462e[i2 - 1]));
            this.f33454a = i2;
            this.f33456c = 0;
            this.f33458e = abstractC0699q1.f33462e[i2];
            return interfaceC0498AMo12717c;
        }
        if (i != i2) {
            return null;
        }
        int i4 = this.f33456c;
        int i5 = (this.f33457d - i4) / 2;
        if (i5 == 0) {
            return null;
        }
        InterfaceC0498A interfaceC0498AMo12716b = mo12716b(this.f33458e, i4, i5);
        this.f33456c += i5;
        return interfaceC0498AMo12716b;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }
}
