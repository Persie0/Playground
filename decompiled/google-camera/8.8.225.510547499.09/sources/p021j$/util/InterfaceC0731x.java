package p021j$.util;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.x */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0731x extends InterfaceC0498A {
    void forEachRemaining(LongConsumer longConsumer);

    boolean tryAdvance(LongConsumer longConsumer);

    @Override // p021j$.util.InterfaceC0498A, p021j$.util.Spliterator
    InterfaceC0731x trySplit();
}
