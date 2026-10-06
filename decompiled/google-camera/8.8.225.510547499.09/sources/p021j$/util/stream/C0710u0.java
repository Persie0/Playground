package p021j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p021j$.util.function.C0555g;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.u0 */
/* JADX INFO: loaded from: classes3.dex */
final class C0710u0 extends C0707t0 implements InterfaceC0595I {
    C0710u0(long j) {
        super(j);
    }

    @Override // p021j$.util.stream.InterfaceC0595I, p021j$.util.stream.InterfaceC0598J
    /* JADX INFO: renamed from: a */
    public final InterfaceC0607M mo12596a() {
        int i = this.f33485b;
        long[] jArr = this.f33484a;
        if (i >= jArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f33485b), Integer.valueOf(jArr.length)));
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
        int i = this.f33485b;
        long[] jArr = this.f33484a;
        if (i < jArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f33485b), Integer.valueOf(jArr.length)));
        }
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: h */
    public final void mo12599h(long j) {
        long[] jArr = this.f33484a;
        if (j != jArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(jArr.length)));
        }
        this.f33485b = 0;
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean mo12600m() {
        return false;
    }

    @Override // p021j$.util.stream.InterfaceC0643Y0
    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void mo12666s(Long l) {
        AbstractC0586F.m12643e(this, l);
    }

    @Override // p021j$.util.stream.C0707t0
    public final String toString() {
        long[] jArr = this.f33484a;
        return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(jArr.length - this.f33485b), Arrays.toString(jArr));
    }

    @Override // p021j$.util.stream.InterfaceC0598J
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC0613O mo12596a() {
        mo12596a();
        return this;
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    public final void accept(long j) {
        int i = this.f33485b;
        long[] jArr = this.f33484a;
        if (i >= jArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(jArr.length)));
        }
        this.f33485b = i + 1;
        jArr[i] = j;
    }

    public final LongConsumer andThen(LongConsumer longConsumer) {
        longConsumer.getClass();
        return new C0555g(this, longConsumer);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo12666s((Long) obj);
    }
}
