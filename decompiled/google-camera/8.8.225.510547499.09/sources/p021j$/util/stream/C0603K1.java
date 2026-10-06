package p021j$.util.stream;

import java.util.function.Consumer;
import p021j$.util.AbstractC0521b;
import p021j$.util.InterfaceC0728u;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.K1 */
/* JADX INFO: loaded from: classes3.dex */
final class C0603K1 extends AbstractC0612N1 implements InterfaceC0728u {
    C0603K1(InterfaceC0728u interfaceC0728u, long j, long j2) {
        super(interfaceC0728u, j, j2);
    }

    @Override // p021j$.util.stream.AbstractC0618P1
    /* JADX INFO: renamed from: a */
    protected final Spliterator mo12668a(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new C0603K1((InterfaceC0728u) spliterator, j, j2, j3, j4);
    }

    @Override // p021j$.util.stream.AbstractC0612N1
    /* JADX INFO: renamed from: b */
    protected final Object mo12669b() {
        return new C0600J1(0);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0521b.m12528b(this, consumer);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0521b.m12537k(this, consumer);
    }

    C0603K1(InterfaceC0728u interfaceC0728u, long j, long j2, long j3, long j4) {
        super(interfaceC0728u, j, j2, j3, j4);
    }
}
