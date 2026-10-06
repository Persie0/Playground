package p021j$.util.stream;

import java.util.ArrayDeque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import p021j$.util.InterfaceC0498A;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.q0 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0698q0 extends AbstractC0704s0 implements InterfaceC0498A {
    AbstractC0698q0(InterfaceC0610N interfaceC0610N) {
        super(interfaceC0610N);
    }

    @Override // p021j$.util.InterfaceC0498A
    public final void forEachRemaining(Object obj) {
        if (this.f33474a == null) {
            return;
        }
        if (this.f33477d != null) {
            while (tryAdvance(obj)) {
            }
            return;
        }
        Spliterator spliterator = this.f33476c;
        if (spliterator != null) {
            ((InterfaceC0498A) spliterator).forEachRemaining(obj);
            return;
        }
        ArrayDeque arrayDequeM12732b = m12732b();
        while (true) {
            InterfaceC0610N interfaceC0610N = (InterfaceC0610N) AbstractC0704s0.m12731a(arrayDequeM12732b);
            if (interfaceC0610N == null) {
                this.f33474a = null;
                return;
            }
            interfaceC0610N.mo12672k(obj);
        }
    }

    @Override // p021j$.util.InterfaceC0498A
    public final boolean tryAdvance(Object obj) {
        InterfaceC0610N interfaceC0610N;
        if (!m12733c()) {
            return false;
        }
        boolean zTryAdvance = ((InterfaceC0498A) this.f33477d).tryAdvance(obj);
        if (!zTryAdvance) {
            if (this.f33476c == null && (interfaceC0610N = (InterfaceC0610N) AbstractC0704s0.m12731a(this.f33478e)) != null) {
                InterfaceC0498A interfaceC0498ASpliterator = interfaceC0610N.spliterator();
                this.f33477d = interfaceC0498ASpliterator;
                return interfaceC0498ASpliterator.tryAdvance(obj);
            }
            this.f33474a = null;
        }
        return zTryAdvance;
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
