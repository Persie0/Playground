package p021j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import p021j$.util.AbstractC0517U;
import p021j$.util.InterfaceC0498A;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.e0 */
/* JADX INFO: loaded from: classes3.dex */
final class C0662e0 extends AbstractC0674i0 implements InterfaceC0601K {
    C0662e0() {
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void mo12603r(Double[] dArr, int i) {
        AbstractC0586F.m12647i(this, dArr, i);
    }

    @Override // p021j$.util.stream.AbstractC0674i0, p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: c */
    public final InterfaceC0610N mo12597c(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0586F.m12650l(this, consumer);
    }

    @Override // p021j$.util.stream.InterfaceC0610N
    /* JADX INFO: renamed from: i */
    public final Object mo12671i() {
        return AbstractC0584E0.f33310g;
    }

    @Override // p021j$.util.stream.AbstractC0674i0, p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC0613O mo12602q(long j, long j2, IntFunction intFunction) {
        return AbstractC0586F.m12653o(this, j, j2);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final InterfaceC0498A spliterator() {
        return AbstractC0517U.m12512b();
    }

    @Override // p021j$.util.stream.AbstractC0674i0, p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ InterfaceC0613O mo12597c(int i) {
        mo12597c(i);
        throw null;
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final Spliterator spliterator() {
        return AbstractC0517U.m12512b();
    }
}
