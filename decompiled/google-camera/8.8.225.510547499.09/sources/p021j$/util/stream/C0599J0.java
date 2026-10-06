package p021j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.J0 */
/* JADX INFO: loaded from: classes3.dex */
final class C0599J0 extends AbstractC0611N0 implements InterfaceC0608M0 {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Supplier f33325b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ BiConsumer f33326c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ BiConsumer f33327d;

    C0599J0(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        this.f33325b = supplier;
        this.f33326c = biConsumer;
        this.f33327d = biConsumer2;
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
    public final /* synthetic */ void mo12598f() {
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: h */
    public final void mo12599h(long j) {
        this.f33333a = this.f33325b.get();
    }

    @Override // p021j$.util.stream.InterfaceC0608M0
    /* JADX INFO: renamed from: l */
    public final void mo12667l(InterfaceC0608M0 interfaceC0608M0) {
        this.f33327d.accept(this.f33333a, ((C0599J0) interfaceC0608M0).f33333a);
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean mo12600m() {
        return false;
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    public final /* synthetic */ void accept(long j) {
        AbstractC0586F.m12645g();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f33326c.accept(this.f33333a, obj);
    }
}
