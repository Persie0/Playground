package p021j$.util;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.r */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0569r extends InterfaceC0498A {
    void forEachRemaining(DoubleConsumer doubleConsumer);

    boolean tryAdvance(DoubleConsumer doubleConsumer);

    @Override // p021j$.util.InterfaceC0498A, p021j$.util.Spliterator
    InterfaceC0569r trySplit();
}
