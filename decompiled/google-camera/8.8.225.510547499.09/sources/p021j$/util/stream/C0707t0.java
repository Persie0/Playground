package p021j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import p021j$.util.AbstractC0517U;
import p021j$.util.InterfaceC0498A;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.t0 */
/* JADX INFO: loaded from: classes3.dex */
class C0707t0 implements InterfaceC0607M {

    /* JADX INFO: renamed from: a */
    final long[] f33484a;

    /* JADX INFO: renamed from: b */
    int f33485b;

    C0707t0(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f33484a = new long[(int) j];
        this.f33485b = 0;
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void mo12603r(Long[] lArr, int i) {
        AbstractC0586F.m12649k(this, lArr, i);
    }

    @Override // p021j$.util.stream.InterfaceC0610N, p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: c */
    public final InterfaceC0610N mo12597c(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final long count() {
        return this.f33485b;
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0586F.m12652n(this, consumer);
    }

    @Override // p021j$.util.stream.InterfaceC0610N
    /* JADX INFO: renamed from: i */
    public final Object mo12671i() {
        long[] jArr = this.f33484a;
        int length = jArr.length;
        int i = this.f33485b;
        return length == i ? jArr : Arrays.copyOf(jArr, i);
    }

    @Override // p021j$.util.stream.InterfaceC0610N
    /* JADX INFO: renamed from: k */
    public final void mo12672k(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i = 0; i < this.f33485b; i++) {
            longConsumer.accept(this.f33484a[i]);
        }
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object[] mo12601n(IntFunction intFunction) {
        return AbstractC0586F.m12646h(this, intFunction);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC0613O mo12602q(long j, long j2, IntFunction intFunction) {
        return AbstractC0586F.m12655q(this, j, j2);
    }

    @Override // p021j$.util.stream.InterfaceC0610N, p021j$.util.stream.InterfaceC0613O
    public final InterfaceC0498A spliterator() {
        return AbstractC0517U.m12522l(this.f33484a, 0, this.f33485b);
    }

    public String toString() {
        long[] jArr = this.f33484a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.f33485b), Arrays.toString(jArr));
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: u */
    public final /* synthetic */ int mo12604u() {
        return 0;
    }

    @Override // p021j$.util.stream.InterfaceC0610N
    /* JADX INFO: renamed from: y */
    public final void mo12673y(int i, Object obj) {
        int i2 = this.f33485b;
        System.arraycopy(this.f33484a, 0, (long[]) obj, i, i2);
    }

    C0707t0(long[] jArr) {
        this.f33484a = jArr;
        this.f33485b = jArr.length;
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ InterfaceC0613O mo12597c(int i) {
        mo12597c(i);
        throw null;
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final Spliterator spliterator() {
        return AbstractC0517U.m12522l(this.f33484a, 0, this.f33485b);
    }
}
