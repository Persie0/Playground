package p349qo;

import cm.InterfaceC2056p;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: qo.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C8659e implements CoroutineContext {

    /* JADX INFO: renamed from: a */
    public final Throwable f46238a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CoroutineContext f46239b;

    public C8659e(CoroutineContext coroutineContext, Throwable th2) {
        this.f46238a = th2;
        this.f46239b = coroutineContext;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: C */
    public final CoroutineContext mo1471C(CoroutineContext coroutineContext) {
        return this.f46239b.mo1471C(coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: m0 */
    public final CoroutineContext mo1473m0(CoroutineContext.InterfaceC6758b<?> interfaceC6758b) {
        return this.f46239b.mo1473m0(interfaceC6758b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: w */
    public final <E extends CoroutineContext.InterfaceC6757a> E mo1474w(CoroutineContext.InterfaceC6758b<E> interfaceC6758b) {
        return (E) this.f46239b.mo1474w(interfaceC6758b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: y0 */
    public final <R> R mo1475y0(R r10, InterfaceC2056p<? super R, ? super CoroutineContext.InterfaceC6757a, ? extends R> interfaceC2056p) {
        return (R) this.f46239b.mo1475y0(r10, interfaceC2056p);
    }
}
