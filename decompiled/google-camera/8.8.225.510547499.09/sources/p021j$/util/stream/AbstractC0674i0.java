package p021j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.i0 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0674i0 implements InterfaceC0613O {
    AbstractC0674i0() {
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: c */
    public InterfaceC0613O mo12597c(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final long count() {
        return 0L;
    }

    /* JADX INFO: renamed from: k */
    public final void m12713k(Object obj) {
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: n */
    public final Object[] mo12601n(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: q */
    public /* synthetic */ InterfaceC0613O mo12602q(long j, long j2, IntFunction intFunction) {
        return AbstractC0586F.m12656r(this, j, j2, intFunction);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: u */
    public final /* synthetic */ int mo12604u() {
        return 0;
    }

    /* JADX INFO: renamed from: y */
    public final void m12714y(int i, Object obj) {
    }
}
