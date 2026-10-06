package p021j$.util.stream;

import java.util.function.Consumer;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.O0 */
/* JADX INFO: loaded from: classes3.dex */
final class C0614O0 extends AbstractC0611N0 implements InterfaceC0608M0 {

    /* JADX INFO: renamed from: b */
    long f33334b;

    C0614O0() {
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
    public final /* bridge */ /* synthetic */ void mo12598f() {
    }

    @Override // p021j$.util.stream.AbstractC0611N0, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f33334b);
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: h */
    public final void mo12599h(long j) {
        this.f33334b = 0L;
    }

    @Override // p021j$.util.stream.InterfaceC0608M0
    /* JADX INFO: renamed from: l */
    public final void mo12667l(InterfaceC0608M0 interfaceC0608M0) {
        this.f33334b += ((C0614O0) interfaceC0608M0).f33334b;
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ boolean mo12600m() {
        return false;
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    public final /* synthetic */ void accept(long j) {
        AbstractC0586F.m12645g();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f33334b++;
    }
}
