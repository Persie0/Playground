package p021j$.util.stream;

import java.util.function.Consumer;
import p021j$.util.AbstractC0521b;
import p021j$.util.InterfaceC0731x;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.M1 */
/* JADX INFO: loaded from: classes3.dex */
final class C0609M1 extends AbstractC0612N1 implements InterfaceC0731x {
    C0609M1(InterfaceC0731x interfaceC0731x, long j, long j2) {
        super(interfaceC0731x, j, j2);
    }

    @Override // p021j$.util.stream.AbstractC0618P1
    /* JADX INFO: renamed from: a */
    protected final Spliterator mo12668a(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new C0609M1((InterfaceC0731x) spliterator, j, j2, j3, j4);
    }

    @Override // p021j$.util.stream.AbstractC0612N1
    /* JADX INFO: renamed from: b */
    protected final Object mo12669b() {
        return new C0606L1(0);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0521b.m12529c(this, consumer);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0521b.m12538l(this, consumer);
    }

    C0609M1(InterfaceC0731x interfaceC0731x, long j, long j2, long j3, long j4) {
        super(interfaceC0731x, j, j2, j3, j4);
    }
}
