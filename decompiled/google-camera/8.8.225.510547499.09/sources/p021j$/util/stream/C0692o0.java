package p021j$.util.stream;

import java.util.function.Consumer;
import p021j$.util.AbstractC0521b;
import p021j$.util.InterfaceC0728u;

/* JADX INFO: renamed from: j$.util.stream.o0 */
/* JADX INFO: loaded from: classes3.dex */
final class C0692o0 extends AbstractC0698q0 implements InterfaceC0728u {
    C0692o0(InterfaceC0604L interfaceC0604L) {
        super(interfaceC0604L);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0521b.m12528b(this, consumer);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0521b.m12537k(this, consumer);
    }
}
