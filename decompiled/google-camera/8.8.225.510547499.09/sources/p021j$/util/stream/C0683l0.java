package p021j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p021j$.util.function.C0553e;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.l0 */
/* JADX INFO: loaded from: classes3.dex */
final class C0683l0 extends C0680k0 implements InterfaceC0592H {
    C0683l0(long j) {
        super(j);
    }

    @Override // p021j$.util.stream.InterfaceC0592H, p021j$.util.stream.InterfaceC0598J
    /* JADX INFO: renamed from: a */
    public final InterfaceC0604L mo12596a() {
        int i = this.f33442b;
        int[] iArr = this.f33441a;
        if (i >= iArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f33442b), Integer.valueOf(iArr.length)));
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    public final void accept(int i) {
        int i2 = this.f33442b;
        int[] iArr = this.f33441a;
        if (i2 >= iArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(iArr.length)));
        }
        this.f33442b = i2 + 1;
        iArr[i2] = i;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: f */
    public final void mo12598f() {
        int i = this.f33442b;
        int[] iArr = this.f33441a;
        if (i < iArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f33442b), Integer.valueOf(iArr.length)));
        }
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: h */
    public final void mo12599h(long j) {
        int[] iArr = this.f33441a;
        if (j != iArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(iArr.length)));
        }
        this.f33442b = 0;
    }

    @Override // p021j$.util.stream.InterfaceC0640X0
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void mo12621j(Integer num) {
        AbstractC0586F.m12641c(this, num);
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean mo12600m() {
        return false;
    }

    @Override // p021j$.util.stream.C0680k0
    public final String toString() {
        int[] iArr = this.f33441a;
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(iArr.length - this.f33442b), Arrays.toString(iArr));
    }

    @Override // p021j$.util.stream.InterfaceC0598J
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC0613O mo12596a() {
        mo12596a();
        return this;
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    public final /* synthetic */ void accept(long j) {
        AbstractC0586F.m12645g();
        throw null;
    }

    public final IntConsumer andThen(IntConsumer intConsumer) {
        intConsumer.getClass();
        return new C0553e(this, intConsumer);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo12621j((Integer) obj);
    }
}
