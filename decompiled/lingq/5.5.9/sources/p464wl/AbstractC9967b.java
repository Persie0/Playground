package p464wl;

import cm.InterfaceC2052l;
import dm.C5207g;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.InterfaceC6757a;

/* JADX INFO: renamed from: wl.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9967b<B extends CoroutineContext.InterfaceC6757a, E extends B> implements CoroutineContext.InterfaceC6758b<E> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2052l<CoroutineContext.InterfaceC6757a, E> f50689a;

    /* JADX INFO: renamed from: b */
    public final CoroutineContext.InterfaceC6758b<?> f50690b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.coroutines.CoroutineContext$b<?>] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r7v0, types: [cm.l<? super kotlin.coroutines.CoroutineContext$a, ? extends E extends B>, cm.l<kotlin.coroutines.CoroutineContext$a, E extends B>, java.lang.Object] */
    public AbstractC9967b(CoroutineContext.InterfaceC6758b<B> interfaceC6758b, InterfaceC2052l<? super CoroutineContext.InterfaceC6757a, ? extends E> interfaceC2052l) {
        C5207g.m11111f(interfaceC6758b, "baseKey");
        C5207g.m11111f(interfaceC2052l, "safeCast");
        this.f50689a = interfaceC2052l;
        this.f50690b = interfaceC6758b instanceof AbstractC9967b ? (CoroutineContext.InterfaceC6758b<B>) ((AbstractC9967b) interfaceC6758b).f50690b : interfaceC6758b;
    }
}
