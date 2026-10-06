package p021j$.util.stream;

import java.util.function.Consumer;
import p021j$.util.AbstractC0521b;
import p021j$.util.InterfaceC0731x;

/* JADX INFO: renamed from: j$.util.stream.p0 */
/* JADX INFO: loaded from: classes3.dex */
final class C0695p0 extends AbstractC0698q0 implements InterfaceC0731x {
    C0695p0(InterfaceC0607M interfaceC0607M) {
        super(interfaceC0607M);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0521b.m12529c(this, consumer);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0521b.m12538l(this, consumer);
    }
}
