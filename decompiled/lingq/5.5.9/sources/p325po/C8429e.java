package p325po;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.selects.InterfaceC7190b;
import no.AbstractC7813a;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: po.e */
/* JADX INFO: loaded from: classes2.dex */
public class C8429e<E> extends AbstractC7813a<C9072e> implements InterfaceC8428d<E> {

    /* JADX INFO: renamed from: c */
    public final InterfaceC8428d<E> f45565c;

    public C8429e(CoroutineContext coroutineContext, AbstractChannel abstractChannel) {
        super(coroutineContext, true);
        this.f45565c = abstractChannel;
    }

    @Override // no.C7883z0, no.InterfaceC7875v0
    /* JADX INFO: renamed from: a */
    public final void mo15618a(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo15550v(), null, this);
        }
        mo15645s(cancellationException);
    }

    @Override // p325po.InterfaceC8438n
    /* JADX INFO: renamed from: c */
    public final InterfaceC7190b<C8431g<E>> mo14335c() {
        return this.f45565c.mo14335c();
    }

    @Override // p325po.InterfaceC8438n
    /* JADX INFO: renamed from: f */
    public final Object mo14336f() {
        return this.f45565c.mo14336f();
    }

    @Override // p325po.InterfaceC8438n
    /* JADX INFO: renamed from: g */
    public final Object mo14337g(InterfaceC9968c<? super C8431g<? extends E>> interfaceC9968c) {
        Object objMo14337g = this.f45565c.mo14337g(interfaceC9968c);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objMo14337g;
    }

    @Override // p325po.InterfaceC8442r
    /* JADX INFO: renamed from: h */
    public final boolean mo16477h(Throwable th2) {
        return this.f45565c.mo16477h(th2);
    }

    @Override // p325po.InterfaceC8438n
    public final InterfaceC8430f<E> iterator() {
        return this.f45565c.iterator();
    }

    @Override // p325po.InterfaceC8442r
    /* JADX INFO: renamed from: j */
    public final Object mo16479j(E e10) {
        return this.f45565c.mo16479j(e10);
    }

    @Override // p325po.InterfaceC8442r
    /* JADX INFO: renamed from: k */
    public final Object mo16480k(E e10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f45565c.mo16480k(e10, interfaceC9968c);
    }

    @Override // p325po.InterfaceC8438n
    /* JADX INFO: renamed from: m */
    public final Object mo14338m(SuspendLambda suspendLambda) {
        return this.f45565c.mo14338m(suspendLambda);
    }

    @Override // no.C7883z0
    /* JADX INFO: renamed from: s */
    public final void mo15645s(CancellationException cancellationException) {
        this.f45565c.mo14334a(cancellationException);
        m15644p(cancellationException);
    }
}
