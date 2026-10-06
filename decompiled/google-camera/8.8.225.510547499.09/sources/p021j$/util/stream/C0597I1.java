package p021j$.util.stream;

import java.util.function.Consumer;
import p021j$.util.AbstractC0521b;
import p021j$.util.InterfaceC0569r;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.I1 */
/* JADX INFO: loaded from: classes3.dex */
final class C0597I1 extends AbstractC0612N1 implements InterfaceC0569r {
    C0597I1(InterfaceC0569r interfaceC0569r, long j, long j2) {
        super(interfaceC0569r, j, j2);
    }

    @Override // p021j$.util.stream.AbstractC0618P1
    /* JADX INFO: renamed from: a */
    protected final Spliterator mo12668a(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new C0597I1((InterfaceC0569r) spliterator, j, j2, j3, j4);
    }

    @Override // p021j$.util.stream.AbstractC0612N1
    /* JADX INFO: renamed from: b */
    protected final Object mo12669b() {
        return new C0594H1(0);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0521b.m12527a(this, consumer);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0521b.m12536j(this, consumer);
    }

    C0597I1(InterfaceC0569r interfaceC0569r, long j, long j2, long j3, long j4) {
        super(interfaceC0569r, j, j2, j3, j4);
    }
}
