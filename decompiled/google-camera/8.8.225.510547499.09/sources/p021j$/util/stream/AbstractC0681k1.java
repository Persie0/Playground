package p021j$.util.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p021j$.util.AbstractC0517U;
import p021j$.util.AbstractC0521b;
import p021j$.util.InterfaceC0569r;
import p021j$.util.function.C0551c;

/* JADX INFO: renamed from: j$.util.stream.k1 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0681k1 extends AbstractC0699q1 implements DoubleConsumer {
    AbstractC0681k1() {
    }

    @Override // p021j$.util.stream.AbstractC0699q1
    /* JADX INFO: renamed from: A */
    protected final int mo12719A(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // p021j$.util.stream.AbstractC0699q1
    /* JADX INFO: renamed from: D */
    protected final Object[] mo12720D() {
        return new double[8][];
    }

    @Override // java.lang.Iterable, p021j$.lang.InterfaceC0305a
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public abstract InterfaceC0569r spliterator();

    public void accept(double d) {
        m12729E();
        double[] dArr = (double[]) this.f33461d;
        int i = this.f33403a;
        this.f33403a = i + 1;
        dArr[i] = d;
    }

    public final DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        return new C0551c(this, doubleConsumer);
    }

    @Override // p021j$.util.stream.AbstractC0699q1
    /* JADX INFO: renamed from: e */
    public final Object mo12721e(int i) {
        return new double[i];
    }

    @Override // java.lang.Iterable, p021j$.lang.InterfaceC0305a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            mo12672k((DoubleConsumer) consumer);
        } else {
            if (AbstractC0651a2.f33376a) {
                AbstractC0651a2.m12681a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
                throw null;
            }
            AbstractC0521b.m12527a((C0678j1) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC0517U.m12516f(spliterator());
    }

    public final String toString() {
        double[] dArr = (double[]) mo12671i();
        return dArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f33404b), Arrays.toString(dArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f33404b), Arrays.toString(Arrays.copyOf(dArr, 200)));
    }

    @Override // p021j$.util.stream.AbstractC0699q1
    /* JADX INFO: renamed from: z */
    protected final void mo12722z(Object obj, int i, int i2, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        while (i < i2) {
            doubleConsumer.accept(dArr[i]);
            i++;
        }
    }
}
