package no;

import cm.InterfaceC2056p;
import dm.C5207g;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: no.r1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7866r1 implements CoroutineContext.InterfaceC6757a, CoroutineContext.InterfaceC6758b<C7866r1> {

    /* JADX INFO: renamed from: a */
    public static final C7866r1 f42959a = new C7866r1();

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: C */
    public final CoroutineContext mo1471C(CoroutineContext coroutineContext) {
        C5207g.m11111f(coroutineContext, "context");
        return CoroutineContext.DefaultImpls.m13470a(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.InterfaceC6757a
    public final CoroutineContext.InterfaceC6758b<?> getKey() {
        return this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: m0 */
    public final CoroutineContext mo1473m0(CoroutineContext.InterfaceC6758b<?> interfaceC6758b) {
        return CoroutineContext.InterfaceC6757a.a.m13472b(this, interfaceC6758b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: w */
    public final <E extends CoroutineContext.InterfaceC6757a> E mo1474w(CoroutineContext.InterfaceC6758b<E> interfaceC6758b) {
        return (E) CoroutineContext.InterfaceC6757a.a.m13471a(this, interfaceC6758b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: y0 */
    public final <R> R mo1475y0(R r10, InterfaceC2056p<? super R, ? super CoroutineContext.InterfaceC6757a, ? extends R> interfaceC2056p) {
        C5207g.m11111f(interfaceC2056p, "operation");
        return interfaceC2056p.mo1337m0(r10, this);
    }
}
