package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import no.C7869s1;

/* JADX INFO: renamed from: kotlinx.coroutines.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C7093e extends CoroutineDispatcher {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f40035c = 0;

    static {
        new C7093e();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: z1 */
    public final void mo2307z1(CoroutineContext coroutineContext, Runnable runnable) {
        C7869s1 c7869s1 = (C7869s1) coroutineContext.mo1474w(C7869s1.f42966c);
        if (c7869s1 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        c7869s1.f42967b = true;
    }
}
