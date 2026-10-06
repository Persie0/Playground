package p021j$.util.stream;

import java.util.function.Consumer;
import p021j$.util.AbstractC0521b;
import p021j$.util.InterfaceC0569r;

/* JADX INFO: renamed from: j$.util.stream.n0 */
/* JADX INFO: loaded from: classes3.dex */
final class C0689n0 extends AbstractC0698q0 implements InterfaceC0569r {
    C0689n0(InterfaceC0601K interfaceC0601K) {
        super(interfaceC0601K);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0521b.m12527a(this, consumer);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0521b.m12536j(this, consumer);
    }
}
