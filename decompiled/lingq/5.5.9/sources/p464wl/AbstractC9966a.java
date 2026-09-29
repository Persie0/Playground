package p464wl;

import cm.InterfaceC2056p;
import dm.C5207g;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: wl.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9966a implements CoroutineContext.InterfaceC6757a {

    /* JADX INFO: renamed from: a */
    public final CoroutineContext.InterfaceC6758b<?> f50688a;

    public AbstractC9966a(CoroutineContext.InterfaceC6758b<?> interfaceC6758b) {
        this.f50688a = interfaceC6758b;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: C */
    public final CoroutineContext mo1471C(CoroutineContext coroutineContext) {
        C5207g.m11111f(coroutineContext, "context");
        return CoroutineContext.DefaultImpls.m13470a(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.InterfaceC6757a
    public final CoroutineContext.InterfaceC6758b<?> getKey() {
        return this.f50688a;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: m0 */
    public CoroutineContext mo1473m0(CoroutineContext.InterfaceC6758b<?> interfaceC6758b) {
        return CoroutineContext.InterfaceC6757a.a.m13472b(this, interfaceC6758b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: w */
    public <E extends CoroutineContext.InterfaceC6757a> E mo1474w(CoroutineContext.InterfaceC6758b<E> interfaceC6758b) {
        return (E) CoroutineContext.InterfaceC6757a.a.m13471a(this, interfaceC6758b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: y0 */
    public final <R> R mo1475y0(R r10, InterfaceC2056p<? super R, ? super CoroutineContext.InterfaceC6757a, ? extends R> interfaceC2056p) {
        C5207g.m11111f(interfaceC2056p, "operation");
        return interfaceC2056p.mo1337m0(r10, this);
    }
}
