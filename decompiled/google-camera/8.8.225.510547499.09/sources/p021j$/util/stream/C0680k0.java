package p021j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import p021j$.util.AbstractC0517U;
import p021j$.util.InterfaceC0498A;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.k0 */
/* JADX INFO: loaded from: classes3.dex */
class C0680k0 implements InterfaceC0604L {

    /* JADX INFO: renamed from: a */
    final int[] f33441a;

    /* JADX INFO: renamed from: b */
    int f33442b;

    C0680k0(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f33441a = new int[(int) j];
        this.f33442b = 0;
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void mo12603r(Integer[] numArr, int i) {
        AbstractC0586F.m12648j(this, numArr, i);
    }

    @Override // p021j$.util.stream.InterfaceC0610N, p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: c */
    public final InterfaceC0610N mo12597c(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final long count() {
        return this.f33442b;
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0586F.m12651m(this, consumer);
    }

    @Override // p021j$.util.stream.InterfaceC0610N
    /* JADX INFO: renamed from: i */
    public final Object mo12671i() {
        int[] iArr = this.f33441a;
        int length = iArr.length;
        int i = this.f33442b;
        return length == i ? iArr : Arrays.copyOf(iArr, i);
    }

    @Override // p021j$.util.stream.InterfaceC0610N
    /* JADX INFO: renamed from: k */
    public final void mo12672k(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i = 0; i < this.f33442b; i++) {
            intConsumer.accept(this.f33441a[i]);
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
        return AbstractC0586F.m12654p(this, j, j2);
    }

    @Override // p021j$.util.stream.InterfaceC0610N, p021j$.util.stream.InterfaceC0613O
    public final InterfaceC0498A spliterator() {
        return AbstractC0517U.m12521k(this.f33441a, 0, this.f33442b);
    }

    public String toString() {
        int[] iArr = this.f33441a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.f33442b), Arrays.toString(iArr));
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: u */
    public final /* synthetic */ int mo12604u() {
        return 0;
    }

    @Override // p021j$.util.stream.InterfaceC0610N
    /* JADX INFO: renamed from: y */
    public final void mo12673y(int i, Object obj) {
        int i2 = this.f33442b;
        System.arraycopy(this.f33441a, 0, (int[]) obj, i, i2);
    }

    C0680k0(int[] iArr) {
        this.f33441a = iArr;
        this.f33442b = iArr.length;
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ InterfaceC0613O mo12597c(int i) {
        mo12597c(i);
        throw null;
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final Spliterator spliterator() {
        return AbstractC0517U.m12521k(this.f33441a, 0, this.f33442b);
    }
}
