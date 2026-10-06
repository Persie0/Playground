package p021j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.A0 */
/* JADX INFO: loaded from: classes3.dex */
final class C0572A0 extends C0702r1 implements InterfaceC0613O, InterfaceC0598J {
    C0572A0() {
    }

    @Override // p021j$.util.stream.InterfaceC0598J
    /* JADX INFO: renamed from: a */
    public final InterfaceC0613O mo12596a() {
        return this;
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    public final /* synthetic */ void accept(int i) {
        AbstractC0586F.m12640b();
        throw null;
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: c */
    public final InterfaceC0613O mo12597c(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: f */
    public final void mo12598f() {
    }

    @Override // p021j$.util.stream.C0702r1, java.lang.Iterable, p021j$.lang.InterfaceC0305a
    public final void forEach(Consumer consumer) {
        super.forEach(consumer);
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: h */
    public final void mo12599h(long j) {
        clear();
        m12730z(j);
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean mo12600m() {
        return false;
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: n */
    public final Object[] mo12601n(IntFunction intFunction) {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        mo12603r(objArr, 0);
        return objArr;
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC0613O mo12602q(long j, long j2, IntFunction intFunction) {
        return AbstractC0586F.m12656r(this, j, j2, intFunction);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: r */
    public final void mo12603r(Object[] objArr, int i) {
        long j = i;
        long jCount = count() + j;
        if (jCount > objArr.length || jCount < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f33404b == 0) {
            System.arraycopy(this.f33464d, 0, objArr, i, this.f33403a);
            return;
        }
        for (int i2 = 0; i2 < this.f33404b; i2++) {
            Object[] objArr2 = this.f33465e[i2];
            System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
            i += this.f33465e[i2].length;
        }
        int i3 = this.f33403a;
        if (i3 > 0) {
            System.arraycopy(this.f33464d, 0, objArr, i, i3);
        }
    }

    @Override // p021j$.util.stream.C0702r1, java.lang.Iterable, p021j$.lang.InterfaceC0305a
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: u */
    public final /* synthetic */ int mo12604u() {
        return 0;
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    public final /* synthetic */ void accept(long j) {
        AbstractC0586F.m12645g();
        throw null;
    }

    @Override // p021j$.util.stream.C0702r1, java.util.function.Consumer
    public final void accept(Object obj) {
        super.accept(obj);
    }
}
