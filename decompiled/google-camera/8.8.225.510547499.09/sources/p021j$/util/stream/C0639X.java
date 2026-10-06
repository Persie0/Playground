package p021j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import p021j$.util.InterfaceC0498A;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.X */
/* JADX INFO: loaded from: classes3.dex */
final class C0639X extends AbstractC0645Z implements InterfaceC0604L {
    C0639X(InterfaceC0604L interfaceC0604L, InterfaceC0604L interfaceC0604L2) {
        super(interfaceC0604L, interfaceC0604L2);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void mo12603r(Integer[] numArr, int i) {
        AbstractC0586F.m12648j(this, numArr, i);
    }

    @Override // p021j$.util.stream.InterfaceC0610N
    /* JADX INFO: renamed from: e */
    public final Object mo12670e(int i) {
        return new int[i];
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0586F.m12651m(this, consumer);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC0613O mo12602q(long j, long j2, IntFunction intFunction) {
        return AbstractC0586F.m12654p(this, j, j2);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final InterfaceC0498A spliterator() {
        return new C0692o0(this);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final Spliterator spliterator() {
        return new C0692o0(this);
    }
}
