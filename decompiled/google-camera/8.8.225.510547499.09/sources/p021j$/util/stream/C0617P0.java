package p021j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.P0 */
/* JADX INFO: loaded from: classes3.dex */
final class C0617P0 extends AbstractC0664f {

    /* JADX INFO: renamed from: h */
    private final AbstractC0584E0 f33336h;

    C0617P0(AbstractC0584E0 abstractC0584E0, AbstractC0586F abstractC0586F, Spliterator spliterator) {
        super(abstractC0586F, spliterator);
        this.f33336h = abstractC0584E0;
    }

    @Override // p021j$.util.stream.AbstractC0664f
    /* JADX INFO: renamed from: a */
    protected final Object mo12622a() {
        AbstractC0586F abstractC0586F = this.f33409a;
        InterfaceC0608M0 interfaceC0608M0Mo12637p = this.f33336h.mo12637p();
        abstractC0586F.mo12660A(this.f33410b, interfaceC0608M0Mo12637p);
        return interfaceC0608M0Mo12637p;
    }

    @Override // p021j$.util.stream.AbstractC0664f
    /* JADX INFO: renamed from: e */
    protected final AbstractC0664f mo12623e(Spliterator spliterator) {
        return new C0617P0(this, spliterator);
    }

    @Override // p021j$.util.stream.AbstractC0664f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0664f abstractC0664f = this.f33412d;
        if (!(abstractC0664f == null)) {
            InterfaceC0608M0 interfaceC0608M0 = (InterfaceC0608M0) ((C0617P0) abstractC0664f).mo12698c();
            interfaceC0608M0.mo12667l((InterfaceC0608M0) ((C0617P0) this.f33413e).mo12698c());
            mo12699f(interfaceC0608M0);
        }
        super.onCompletion(countedCompleter);
    }

    C0617P0(C0617P0 c0617p0, Spliterator spliterator) {
        super(c0617p0, spliterator);
        this.f33336h = c0617p0.f33336h;
    }
}
