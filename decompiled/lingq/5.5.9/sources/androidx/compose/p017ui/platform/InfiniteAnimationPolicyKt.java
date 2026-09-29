package androidx.compose.p017ui.platform;

import cm.InterfaceC2052l;
import dm.C5207g;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p081e0.C5300c0;
import p464wl.InterfaceC9968c;

/* JADX INFO: loaded from: classes.dex */
public final class InfiniteAnimationPolicyKt {
    /* JADX INFO: renamed from: a */
    public static final <R> Object m2310a(InterfaceC2052l<? super Long, ? extends R> interfaceC2052l, InterfaceC9968c<? super R> interfaceC9968c) {
        CoroutineContext coroutineContext = ((ContinuationImpl) interfaceC9968c).f38105b;
        C5207g.m11108c(coroutineContext);
        InterfaceC0655q0 interfaceC0655q0 = (InterfaceC0655q0) coroutineContext.mo1474w(InterfaceC0655q0.a.f4335a);
        if (interfaceC0655q0 == null) {
            return C5300c0.m11449b(interfaceC2052l, interfaceC9968c);
        }
        new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(interfaceC2052l, null);
        return interfaceC0655q0.m2453B0();
    }
}
