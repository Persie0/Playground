package p021j$.util.stream;

import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import p021j$.util.InterfaceC0498A;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.N1 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0612N1 extends AbstractC0618P1 implements InterfaceC0498A {
    AbstractC0612N1(InterfaceC0498A interfaceC0498A, long j, long j2) {
        super(interfaceC0498A, j, j2, 0L, Math.min(interfaceC0498A.estimateSize(), j2));
    }

    /* JADX INFO: renamed from: b */
    protected abstract Object mo12669b();

    @Override // p021j$.util.InterfaceC0498A
    public final void forEachRemaining(Object obj) {
        obj.getClass();
        long j = this.f33341e;
        long j2 = this.f33337a;
        if (j2 >= j) {
            return;
        }
        long j3 = this.f33340d;
        if (j3 >= j) {
            return;
        }
        if (j3 >= j2 && ((InterfaceC0498A) this.f33339c).estimateSize() + j3 <= this.f33338b) {
            ((InterfaceC0498A) this.f33339c).forEachRemaining(obj);
            this.f33340d = this.f33341e;
            return;
        }
        while (j2 > this.f33340d) {
            ((InterfaceC0498A) this.f33339c).tryAdvance(mo12669b());
            this.f33340d++;
        }
        while (this.f33340d < this.f33341e) {
            ((InterfaceC0498A) this.f33339c).tryAdvance(obj);
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

    @Override // p021j$.util.InterfaceC0498A
    public final boolean tryAdvance(Object obj) {
        long j;
        obj.getClass();
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
            ((InterfaceC0498A) this.f33339c).tryAdvance(mo12669b());
            this.f33340d++;
        }
        if (j >= this.f33341e) {
            return false;
        }
        this.f33340d = j + 1;
        return ((InterfaceC0498A) this.f33339c).tryAdvance(obj);
    }

    AbstractC0612N1(InterfaceC0498A interfaceC0498A, long j, long j2, long j3, long j4) {
        super(interfaceC0498A, j, j2, j3, j4);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }
}
