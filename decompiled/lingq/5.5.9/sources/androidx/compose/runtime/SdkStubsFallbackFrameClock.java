package androidx.compose.runtime;

import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5207g;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C7162l;
import kotlinx.coroutines.scheduling.C7178b;
import no.C7828f;
import no.C7832g0;
import p081e0.InterfaceC5297b0;
import p464wl.InterfaceC9968c;

/* JADX INFO: loaded from: classes.dex */
public final class SdkStubsFallbackFrameClock implements InterfaceC5297b0 {

    /* JADX INFO: renamed from: a */
    public static final SdkStubsFallbackFrameClock f3105a = new SdkStubsFallbackFrameClock();

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: C */
    public final CoroutineContext mo1471C(CoroutineContext coroutineContext) {
        C5207g.m11111f(coroutineContext, "context");
        return CoroutineContext.DefaultImpls.m13470a(this, coroutineContext);
    }

    @Override // p081e0.InterfaceC5297b0
    /* JADX INFO: renamed from: U */
    public final <R> Object mo1581U(InterfaceC2052l<? super Long, ? extends R> interfaceC2052l, InterfaceC9968c<? super R> interfaceC9968c) {
        C7178b c7178b = C7832g0.f42930a;
        return C7828f.m15574h(interfaceC9968c, C7162l.f40438a, new SdkStubsFallbackFrameClock$withFrameNanos$2(interfaceC2052l, null));
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: m0 */
    public final CoroutineContext mo1473m0(CoroutineContext.InterfaceC6758b<?> interfaceC6758b) {
        C5207g.m11111f(interfaceC6758b, "key");
        return CoroutineContext.InterfaceC6757a.a.m13472b(this, interfaceC6758b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: w */
    public final <E extends CoroutineContext.InterfaceC6757a> E mo1474w(CoroutineContext.InterfaceC6758b<E> interfaceC6758b) {
        C5207g.m11111f(interfaceC6758b, "key");
        return (E) CoroutineContext.InterfaceC6757a.a.m13471a(this, interfaceC6758b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: y0 */
    public final <R> R mo1475y0(R r10, InterfaceC2056p<? super R, ? super CoroutineContext.InterfaceC6757a, ? extends R> interfaceC2056p) {
        C5207g.m11111f(interfaceC2056p, "operation");
        return interfaceC2056p.mo1337m0(r10, this);
    }
}
