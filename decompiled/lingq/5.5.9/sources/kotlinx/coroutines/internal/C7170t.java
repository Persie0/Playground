package kotlinx.coroutines.internal;

import cm.InterfaceC2056p;
import dm.C5207g;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import no.InterfaceC7854n1;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C7170t<T> implements InterfaceC7854n1<T> {

    /* JADX INFO: renamed from: a */
    public final T f40444a;

    /* JADX INFO: renamed from: b */
    public final ThreadLocal<T> f40445b;

    /* JADX INFO: renamed from: c */
    public final C7171u f40446c;

    /* JADX WARN: Multi-variable type inference failed */
    public C7170t(Integer num, ThreadLocal threadLocal) {
        this.f40444a = num;
        this.f40445b = threadLocal;
        this.f40446c = new C7171u(threadLocal);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: C */
    public final CoroutineContext mo1471C(CoroutineContext coroutineContext) {
        C5207g.m11111f(coroutineContext, "context");
        return CoroutineContext.DefaultImpls.m13470a(this, coroutineContext);
    }

    @Override // no.InterfaceC7854n1
    /* JADX INFO: renamed from: W0 */
    public final void mo14468W0(Object obj) {
        this.f40445b.set(obj);
    }

    @Override // kotlin.coroutines.CoroutineContext.InterfaceC6757a
    public final CoroutineContext.InterfaceC6758b<?> getKey() {
        return this.f40446c;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: m0 */
    public final CoroutineContext mo1473m0(CoroutineContext.InterfaceC6758b<?> interfaceC6758b) {
        return C5207g.m11106a(this.f40446c, interfaceC6758b) ? EmptyCoroutineContext.f38093a : this;
    }

    @Override // no.InterfaceC7854n1
    /* JADX INFO: renamed from: t1 */
    public final T mo14469t1(CoroutineContext coroutineContext) {
        ThreadLocal<T> threadLocal = this.f40445b;
        T t10 = threadLocal.get();
        threadLocal.set(this.f40444a);
        return t10;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f40444a + ", threadLocal = " + this.f40445b + ')';
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: w */
    public final <E extends CoroutineContext.InterfaceC6757a> E mo1474w(CoroutineContext.InterfaceC6758b<E> interfaceC6758b) {
        if (C5207g.m11106a(this.f40446c, interfaceC6758b)) {
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: y0 */
    public final <R> R mo1475y0(R r10, InterfaceC2056p<? super R, ? super CoroutineContext.InterfaceC6757a, ? extends R> interfaceC2056p) {
        C5207g.m11111f(interfaceC2056p, "operation");
        return interfaceC2056p.mo1337m0(r10, this);
    }
}
