package p021j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.j0 */
/* JADX INFO: loaded from: classes3.dex */
final class C0677j0 extends C0624S implements InterfaceC0598J {
    C0677j0(long j, IntFunction intFunction) {
        super(j, intFunction);
    }

    @Override // p021j$.util.stream.InterfaceC0598J
    /* JADX INFO: renamed from: a */
    public final InterfaceC0613O mo12596a() {
        int i = this.f33349b;
        Object[] objArr = this.f33348a;
        if (i >= objArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f33349b), Integer.valueOf(objArr.length)));
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    public final /* synthetic */ void accept(int i) {
        AbstractC0586F.m12640b();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: f */
    public final void mo12598f() {
        int i = this.f33349b;
        Object[] objArr = this.f33348a;
        if (i < objArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f33349b), Integer.valueOf(objArr.length)));
        }
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: h */
    public final void mo12599h(long j) {
        Object[] objArr = this.f33348a;
        if (j != objArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(objArr.length)));
        }
        this.f33349b = 0;
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean mo12600m() {
        return false;
    }

    @Override // p021j$.util.stream.C0624S
    public final String toString() {
        Object[] objArr = this.f33348a;
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(objArr.length - this.f33349b), Arrays.toString(objArr));
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    public final /* synthetic */ void accept(long j) {
        AbstractC0586F.m12645g();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f33349b;
        Object[] objArr = this.f33348a;
        if (i >= objArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(objArr.length)));
        }
        this.f33349b = i + 1;
        objArr[i] = obj;
    }
}
