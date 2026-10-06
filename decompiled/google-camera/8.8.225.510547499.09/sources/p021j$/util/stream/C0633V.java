package p021j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.V */
/* JADX INFO: loaded from: classes3.dex */
class C0633V extends AbstractC0664f {

    /* JADX INFO: renamed from: h */
    protected final AbstractC0586F f33359h;

    /* JADX INFO: renamed from: i */
    protected final LongFunction f33360i;

    /* JADX INFO: renamed from: j */
    protected final BinaryOperator f33361j;

    C0633V(AbstractC0586F abstractC0586F, Spliterator spliterator, LongFunction longFunction, C0652b c0652b) {
        super(abstractC0586F, spliterator);
        this.f33359h = abstractC0586F;
        this.f33360i = longFunction;
        this.f33361j = c0652b;
    }

    @Override // p021j$.util.stream.AbstractC0664f
    /* JADX INFO: renamed from: a */
    protected final Object mo12622a() {
        InterfaceC0598J interfaceC0598J = (InterfaceC0598J) this.f33360i.apply(this.f33359h.mo12664w(this.f33410b));
        this.f33359h.mo12660A(this.f33410b, interfaceC0598J);
        return interfaceC0598J.mo12596a();
    }

    @Override // p021j$.util.stream.AbstractC0664f
    /* JADX INFO: renamed from: e */
    protected final AbstractC0664f mo12623e(Spliterator spliterator) {
        return new C0633V(this, spliterator);
    }

    @Override // p021j$.util.stream.AbstractC0664f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0664f abstractC0664f = this.f33412d;
        if (!(abstractC0664f == null)) {
            mo12699f((InterfaceC0613O) this.f33361j.apply((InterfaceC0613O) ((C0633V) abstractC0664f).mo12698c(), (InterfaceC0613O) ((C0633V) this.f33413e).mo12698c()));
        }
        super.onCompletion(countedCompleter);
    }

    C0633V(C0633V c0633v, Spliterator spliterator) {
        super(c0633v, spliterator);
        this.f33359h = c0633v.f33359h;
        this.f33360i = c0633v.f33360i;
        this.f33361j = c0633v.f33361j;
    }
}
