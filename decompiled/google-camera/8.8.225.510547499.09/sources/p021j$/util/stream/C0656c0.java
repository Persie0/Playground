package p021j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p021j$.util.function.C0551c;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.c0 */
/* JADX INFO: loaded from: classes3.dex */
final class C0656c0 extends AbstractC0653b0 implements InterfaceC0589G {
    C0656c0(long j) {
        super(j);
    }

    @Override // p021j$.util.stream.InterfaceC0589G, p021j$.util.stream.InterfaceC0598J
    /* JADX INFO: renamed from: a */
    public final InterfaceC0601K mo12596a() {
        int i = this.f33379b;
        double[] dArr = this.f33378a;
        if (i >= dArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f33379b), Integer.valueOf(dArr.length)));
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        int i = this.f33379b;
        double[] dArr = this.f33378a;
        if (i >= dArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(dArr.length)));
        }
        this.f33379b = i + 1;
        dArr[i] = d;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void accept(Double d) {
        if (AbstractC0651a2.f33376a) {
            AbstractC0651a2.m12681a(C0656c0.class, "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        accept(d.doubleValue());
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: f */
    public final void mo12598f() {
        int i = this.f33379b;
        double[] dArr = this.f33378a;
        if (i < dArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f33379b), Integer.valueOf(dArr.length)));
        }
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: h */
    public final void mo12599h(long j) {
        double[] dArr = this.f33378a;
        if (j != dArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(dArr.length)));
        }
        this.f33379b = 0;
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean mo12600m() {
        return false;
    }

    public final String toString() {
        double[] dArr = this.f33378a;
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(dArr.length - this.f33379b), Arrays.toString(dArr));
    }

    @Override // p021j$.util.stream.InterfaceC0598J
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC0613O mo12596a() {
        mo12596a();
        return this;
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    public final /* synthetic */ void accept(int i) {
        AbstractC0586F.m12640b();
        throw null;
    }

    public final DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        return new C0551c(this, doubleConsumer);
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    public final /* synthetic */ void accept(long j) {
        AbstractC0586F.m12645g();
        throw null;
    }
}
