package p021j$.util;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.u */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0728u extends InterfaceC0498A {
    void forEachRemaining(IntConsumer intConsumer);

    boolean tryAdvance(IntConsumer intConsumer);

    @Override // p021j$.util.InterfaceC0498A, p021j$.util.Spliterator
    InterfaceC0728u trySplit();
}
