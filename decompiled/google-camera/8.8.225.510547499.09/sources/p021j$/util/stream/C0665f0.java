package p021j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import p021j$.util.AbstractC0517U;
import p021j$.util.InterfaceC0498A;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.f0 */
/* JADX INFO: loaded from: classes3.dex */
final class C0665f0 extends AbstractC0674i0 implements InterfaceC0604L {
    C0665f0() {
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void mo12603r(Integer[] numArr, int i) {
        AbstractC0586F.m12648j(this, numArr, i);
    }

    @Override // p021j$.util.stream.AbstractC0674i0, p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: c */
    public final InterfaceC0610N mo12597c(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0586F.m12651m(this, consumer);
    }

    @Override // p021j$.util.stream.InterfaceC0610N
    /* JADX INFO: renamed from: i */
    public final Object mo12671i() {
        return AbstractC0584E0.f33308e;
    }

    @Override // p021j$.util.stream.AbstractC0674i0, p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC0613O mo12602q(long j, long j2, IntFunction intFunction) {
        return AbstractC0586F.m12654p(this, j, j2);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final InterfaceC0498A spliterator() {
        return AbstractC0517U.m12513c();
    }

    @Override // p021j$.util.stream.AbstractC0674i0, p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ InterfaceC0613O mo12597c(int i) {
        mo12597c(i);
        throw null;
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final Spliterator spliterator() {
        return AbstractC0517U.m12513c();
    }
}
