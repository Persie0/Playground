package p081e0;

import cm.InterfaceC2052l;
import dm.C5207g;
import kotlin.coroutines.CoroutineContext;
import p464wl.InterfaceC9968c;

/* JADX INFO: renamed from: e0.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5300c0 {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final InterfaceC5297b0 m11448a(CoroutineContext coroutineContext) {
        C5207g.m11111f(coroutineContext, "<this>");
        int i10 = InterfaceC5297b0.f33570z;
        InterfaceC5297b0 interfaceC5297b0 = (InterfaceC5297b0) coroutineContext.mo1474w(InterfaceC5297b0.a.f33571a);
        if (interfaceC5297b0 != null) {
            return interfaceC5297b0;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }

    /* JADX INFO: renamed from: b */
    public static final <R> Object m11449b(InterfaceC2052l<? super Long, ? extends R> interfaceC2052l, InterfaceC9968c<? super R> interfaceC9968c) {
        return m11448a(interfaceC9968c.mo2029e()).mo1581U(interfaceC2052l, interfaceC9968c);
    }
}
