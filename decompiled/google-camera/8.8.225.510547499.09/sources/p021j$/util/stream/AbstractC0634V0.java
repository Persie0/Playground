package p021j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p021j$.util.function.C0553e;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.V0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0634V0 implements InterfaceC0640X0 {

    /* JADX INFO: renamed from: a */
    protected final InterfaceC0646Z0 f33362a;

    public AbstractC0634V0(InterfaceC0646Z0 interfaceC0646Z0) {
        interfaceC0646Z0.getClass();
        this.f33362a = interfaceC0646Z0;
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    public final /* synthetic */ void accept(long j) {
        AbstractC0586F.m12645g();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: f */
    public final void mo12598f() {
        this.f33362a.mo12598f();
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: h */
    public final void mo12599h(long j) {
        this.f33362a.mo12599h(j);
    }

    @Override // p021j$.util.stream.InterfaceC0640X0
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void mo12621j(Integer num) {
        AbstractC0586F.m12641c(this, num);
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: m */
    public final boolean mo12600m() {
        return this.f33362a.mo12600m();
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo12621j((Integer) obj);
    }

    public final IntConsumer andThen(IntConsumer intConsumer) {
        intConsumer.getClass();
        return new C0553e(this, intConsumer);
    }
}
