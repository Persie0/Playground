package p021j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;
import p021j$.util.InterfaceC0569r;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.d0 */
/* JADX INFO: loaded from: classes3.dex */
final class C0659d0 extends AbstractC0681k1 implements InterfaceC0601K, InterfaceC0589G {
    C0659d0() {
    }

    @Override // p021j$.util.stream.AbstractC0681k1
    /* JADX INFO: renamed from: F */
    public final InterfaceC0569r spliterator() {
        return new C0678j1(this, 0, this.f33404b, 0, this.f33403a);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final void accept(Double d) {
        if (AbstractC0651a2.f33376a) {
            AbstractC0651a2.m12681a(C0659d0.class, "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        accept(d.doubleValue());
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void mo12603r(Double[] dArr, int i) {
        AbstractC0586F.m12647i(this, dArr, i);
    }

    @Override // p021j$.util.stream.InterfaceC0589G, p021j$.util.stream.InterfaceC0598J
    /* JADX INFO: renamed from: a */
    public final InterfaceC0601K mo12596a() {
        return this;
    }

    @Override // p021j$.util.stream.AbstractC0681k1, java.util.function.DoubleConsumer
    public final void accept(double d) {
        super.accept(d);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // p021j$.util.stream.InterfaceC0610N, p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: c */
    public final InterfaceC0610N mo12597c(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: f */
    public final void mo12598f() {
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: h */
    public final void mo12599h(long j) {
        clear();
        m12728C(j);
    }

    @Override // p021j$.util.stream.AbstractC0699q1, p021j$.util.stream.InterfaceC0610N
    /* JADX INFO: renamed from: i */
    public final Object mo12671i() {
        return (double[]) super.mo12671i();
    }

    @Override // p021j$.util.stream.AbstractC0699q1, p021j$.util.stream.InterfaceC0610N
    /* JADX INFO: renamed from: k */
    public final void mo12672k(Object obj) {
        super.mo12672k((DoubleConsumer) obj);
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean mo12600m() {
        return false;
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object[] mo12601n(IntFunction intFunction) {
        return AbstractC0586F.m12646h(this, intFunction);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC0613O mo12602q(long j, long j2, IntFunction intFunction) {
        return AbstractC0586F.m12653o(this, j, j2);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: u */
    public final /* synthetic */ int mo12604u() {
        return 0;
    }

    @Override // p021j$.util.stream.AbstractC0699q1, p021j$.util.stream.InterfaceC0610N
    /* JADX INFO: renamed from: y */
    public final void mo12673y(int i, Object obj) {
        super.mo12673y(i, (double[]) obj);
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
    public final /* bridge */ /* synthetic */ InterfaceC0613O mo12597c(int i) {
        mo12597c(i);
        throw null;
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    public final /* synthetic */ void accept(long j) {
        AbstractC0586F.m12645g();
        throw null;
    }
}
