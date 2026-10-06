package p021j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import p021j$.util.InterfaceC0498A;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.Y */
/* JADX INFO: loaded from: classes3.dex */
final class C0642Y extends AbstractC0645Z implements InterfaceC0607M {
    C0642Y(InterfaceC0607M interfaceC0607M, InterfaceC0607M interfaceC0607M2) {
        super(interfaceC0607M, interfaceC0607M2);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void mo12603r(Long[] lArr, int i) {
        AbstractC0586F.m12649k(this, lArr, i);
    }

    @Override // p021j$.util.stream.InterfaceC0610N
    /* JADX INFO: renamed from: e */
    public final Object mo12670e(int i) {
        return new long[i];
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0586F.m12652n(this, consumer);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC0613O mo12602q(long j, long j2, IntFunction intFunction) {
        return AbstractC0586F.m12655q(this, j, j2);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final InterfaceC0498A spliterator() {
        return new C0695p0(this);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final Spliterator spliterator() {
        return new C0695p0(this);
    }
}
