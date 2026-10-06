package p021j$.util.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p021j$.util.AbstractC0517U;
import p021j$.util.InterfaceC0728u;
import p021j$.util.function.C0553e;

/* JADX INFO: renamed from: j$.util.stream.m1 */
/* JADX INFO: loaded from: classes3.dex */
class C0687m1 extends AbstractC0699q1 implements IntConsumer {
    C0687m1() {
    }

    @Override // p021j$.util.stream.AbstractC0699q1
    /* JADX INFO: renamed from: A */
    protected final int mo12719A(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // p021j$.util.stream.AbstractC0699q1
    /* JADX INFO: renamed from: D */
    protected final Object[] mo12720D() {
        return new int[8][];
    }

    @Override // java.lang.Iterable, p021j$.lang.InterfaceC0305a
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public InterfaceC0728u spliterator() {
        return new C0684l1(this, 0, this.f33404b, 0, this.f33403a);
    }

    public void accept(int i) {
        m12729E();
        int[] iArr = (int[]) this.f33461d;
        int i2 = this.f33403a;
        this.f33403a = i2 + 1;
        iArr[i2] = i;
    }

    public final IntConsumer andThen(IntConsumer intConsumer) {
        intConsumer.getClass();
        return new C0553e(this, intConsumer);
    }

    @Override // p021j$.util.stream.AbstractC0699q1
    /* JADX INFO: renamed from: e */
    public final Object mo12721e(int i) {
        return new int[i];
    }

    @Override // java.lang.Iterable, p021j$.lang.InterfaceC0305a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            mo12672k((IntConsumer) consumer);
        } else {
            if (AbstractC0651a2.f33376a) {
                AbstractC0651a2.m12681a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            spliterator().forEachRemaining(consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC0517U.m12517g(spliterator());
    }

    public final String toString() {
        int[] iArr = (int[]) mo12671i();
        return iArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f33404b), Arrays.toString(iArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f33404b), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }

    @Override // p021j$.util.stream.AbstractC0699q1
    /* JADX INFO: renamed from: z */
    protected final void mo12722z(Object obj, int i, int i2, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i < i2) {
            intConsumer.accept(iArr[i]);
            i++;
        }
    }
}
