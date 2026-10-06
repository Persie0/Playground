package p021j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import p021j$.util.InterfaceC0498A;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.W */
/* JADX INFO: loaded from: classes3.dex */
final class C0636W extends AbstractC0645Z implements InterfaceC0601K {
    C0636W(InterfaceC0601K interfaceC0601K, InterfaceC0601K interfaceC0601K2) {
        super(interfaceC0601K, interfaceC0601K2);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void mo12603r(Double[] dArr, int i) {
        AbstractC0586F.m12647i(this, dArr, i);
    }

    @Override // p021j$.util.stream.InterfaceC0610N
    /* JADX INFO: renamed from: e */
    public final Object mo12670e(int i) {
        return new double[i];
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0586F.m12650l(this, consumer);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC0613O mo12602q(long j, long j2, IntFunction intFunction) {
        return AbstractC0586F.m12653o(this, j, j2);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final InterfaceC0498A spliterator() {
        return new C0689n0(this);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final Spliterator spliterator() {
        return new C0689n0(this);
    }
}
