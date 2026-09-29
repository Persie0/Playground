package p213k4;

import cm.InterfaceC2056p;
import dm.C5207g;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.CoroutineContext;
import p464wl.InterfaceC9969d;

/* JADX INFO: renamed from: k4.q */
/* JADX INFO: loaded from: classes.dex */
public final class C6597q implements CoroutineContext.InterfaceC6757a {

    /* JADX INFO: renamed from: c */
    public static final a f37492c = new a();

    /* JADX INFO: renamed from: a */
    public final InterfaceC9969d f37493a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f37494b = new AtomicInteger(0);

    /* JADX INFO: renamed from: k4.q$a */
    public static final class a implements CoroutineContext.InterfaceC6758b<C6597q> {
    }

    public C6597q(InterfaceC9969d interfaceC9969d) {
        this.f37493a = interfaceC9969d;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: C */
    public final CoroutineContext mo1471C(CoroutineContext coroutineContext) {
        C5207g.m11111f(coroutineContext, "context");
        return CoroutineContext.DefaultImpls.m13470a(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.InterfaceC6757a
    public final CoroutineContext.InterfaceC6758b<C6597q> getKey() {
        return f37492c;
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
