package p021j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import p021j$.desugar.sun.nio.p023fs.C0300n;
import p021j$.util.OptionalLong;
import p021j$.util.function.C0555g;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.L0 */
/* JADX INFO: loaded from: classes3.dex */
final class C0605L0 implements InterfaceC0608M0, InterfaceC0643Y0 {

    /* JADX INFO: renamed from: a */
    private boolean f33329a;

    /* JADX INFO: renamed from: b */
    private long f33330b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ LongBinaryOperator f33331c;

    C0605L0(LongBinaryOperator longBinaryOperator) {
        this.f33331c = longBinaryOperator;
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

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f33329a ? OptionalLong.m12506a() : OptionalLong.m12507b(this.f33330b);
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: h */
    public final void mo12599h(long j) {
        this.f33329a = true;
        this.f33330b = 0L;
    }

    @Override // p021j$.util.stream.InterfaceC0608M0
    /* JADX INFO: renamed from: l */
    public final void mo12667l(InterfaceC0608M0 interfaceC0608M0) {
        C0605L0 c0605l0 = (C0605L0) interfaceC0608M0;
        if (c0605l0.f33329a) {
            return;
        }
        accept(c0605l0.f33330b);
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

    @Override // p021j$.util.stream.InterfaceC0646Z0
    public final void accept(long j) {
        if (this.f33329a) {
            this.f33329a = false;
        } else {
            long j2 = this.f33330b;
            ((C0300n) this.f33331c).getClass();
            j = Math.max(j2, j);
        }
        this.f33330b = j;
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
