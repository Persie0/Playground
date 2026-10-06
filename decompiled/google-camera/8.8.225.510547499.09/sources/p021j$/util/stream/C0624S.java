package p021j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import p021j$.util.AbstractC0517U;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.S */
/* JADX INFO: loaded from: classes3.dex */
class C0624S implements InterfaceC0613O {

    /* JADX INFO: renamed from: a */
    final Object[] f33348a;

    /* JADX INFO: renamed from: b */
    int f33349b;

    C0624S(long j, IntFunction intFunction) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f33348a = (Object[]) intFunction.apply((int) j);
        this.f33349b = 0;
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: c */
    public final InterfaceC0613O mo12597c(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final long count() {
        return this.f33349b;
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final void forEach(Consumer consumer) {
        for (int i = 0; i < this.f33349b; i++) {
            consumer.accept(this.f33348a[i]);
        }
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: n */
    public final Object[] mo12601n(IntFunction intFunction) {
        Object[] objArr = this.f33348a;
        if (objArr.length == this.f33349b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC0613O mo12602q(long j, long j2, IntFunction intFunction) {
        return AbstractC0586F.m12656r(this, j, j2, intFunction);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: r */
    public final void mo12603r(Object[] objArr, int i) {
        System.arraycopy(this.f33348a, 0, objArr, i, this.f33349b);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final Spliterator spliterator() {
        return AbstractC0517U.m12523m(this.f33348a, 0, this.f33349b);
    }

    public String toString() {
        Object[] objArr = this.f33348a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.f33349b), Arrays.toString(objArr));
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: u */
    public final /* synthetic */ int mo12604u() {
        return 0;
    }

    C0624S(Object[] objArr) {
        this.f33348a = objArr;
        this.f33349b = objArr.length;
    }
}
