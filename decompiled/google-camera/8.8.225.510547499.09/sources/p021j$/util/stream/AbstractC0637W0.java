package p021j$.util.stream;

import java.util.function.Consumer;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.W0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0637W0 implements InterfaceC0646Z0 {

    /* JADX INFO: renamed from: a */
    protected final InterfaceC0646Z0 f33366a;

    public AbstractC0637W0(InterfaceC0646Z0 interfaceC0646Z0) {
        interfaceC0646Z0.getClass();
        this.f33366a = interfaceC0646Z0;
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
    public void mo12598f() {
        this.f33366a.mo12598f();
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: m */
    public boolean mo12600m() {
        return this.f33366a.mo12600m();
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    public final /* synthetic */ void accept(long j) {
        AbstractC0586F.m12645g();
        throw null;
    }
}
