package p021j$.util.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p021j$.util.AbstractC0517U;
import p021j$.util.InterfaceC0731x;
import p021j$.util.function.C0555g;

/* JADX INFO: renamed from: j$.util.stream.o1 */
/* JADX INFO: loaded from: classes3.dex */
class C0693o1 extends AbstractC0699q1 implements LongConsumer {
    C0693o1() {
    }

    @Override // p021j$.util.stream.AbstractC0699q1
    /* JADX INFO: renamed from: A */
    protected final int mo12719A(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // p021j$.util.stream.AbstractC0699q1
    /* JADX INFO: renamed from: D */
    protected final Object[] mo12720D() {
        return new long[8][];
    }

    @Override // java.lang.Iterable, p021j$.lang.InterfaceC0305a
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public InterfaceC0731x spliterator() {
        return new C0690n1(this, 0, this.f33404b, 0, this.f33403a);
    }

    @Override // java.util.function.LongConsumer
    public void accept(long j) {
        m12729E();
        long[] jArr = (long[]) this.f33461d;
        int i = this.f33403a;
        this.f33403a = i + 1;
        jArr[i] = j;
    }

    public final LongConsumer andThen(LongConsumer longConsumer) {
        longConsumer.getClass();
        return new C0555g(this, longConsumer);
    }

    @Override // p021j$.util.stream.AbstractC0699q1
    /* JADX INFO: renamed from: e */
    public final Object mo12721e(int i) {
        return new long[i];
    }

    @Override // java.lang.Iterable, p021j$.lang.InterfaceC0305a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            mo12672k((LongConsumer) consumer);
        } else {
            if (AbstractC0651a2.f33376a) {
                AbstractC0651a2.m12681a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
                throw null;
            }
            spliterator().forEachRemaining(consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC0517U.m12518h(spliterator());
    }

    public final String toString() {
        long[] jArr = (long[]) mo12671i();
        return jArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f33404b), Arrays.toString(jArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f33404b), Arrays.toString(Arrays.copyOf(jArr, 200)));
    }

    @Override // p021j$.util.stream.AbstractC0699q1
    /* JADX INFO: renamed from: z */
    protected final void mo12722z(Object obj, int i, int i2, Object obj2) {
        long[] jArr = (long[]) obj;
        LongConsumer longConsumer = (LongConsumer) obj2;
        while (i < i2) {
            longConsumer.accept(jArr[i]);
            i++;
        }
    }
}
