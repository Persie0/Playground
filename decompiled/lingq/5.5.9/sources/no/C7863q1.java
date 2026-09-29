package no;

import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.C7166p;
import kotlinx.coroutines.internal.ThreadContextKt;
import p464wl.InterfaceC9968c;
import p464wl.InterfaceC9969d;
import sl.C9072e;

/* JADX INFO: renamed from: no.q1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7863q1<T> extends C7166p<T> {

    /* JADX INFO: renamed from: d */
    public final ThreadLocal<Pair<CoroutineContext, Object>> f42957d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7863q1(InterfaceC9968c interfaceC9968c, CoroutineContext coroutineContext) {
        C7866r1 c7866r1 = C7866r1.f42959a;
        super(interfaceC9968c, coroutineContext.mo1474w(c7866r1) == null ? coroutineContext.mo1471C(c7866r1) : coroutineContext);
        ThreadLocal<Pair<CoroutineContext, Object>> threadLocal = new ThreadLocal<>();
        this.f42957d = threadLocal;
        if (interfaceC9968c.mo2029e().mo1474w(InterfaceC9969d.a.f50692a) instanceof CoroutineDispatcher) {
            return;
        }
        Object objM14435c = ThreadContextKt.m14435c(coroutineContext, null);
        ThreadContextKt.m14433a(coroutineContext, objM14435c);
        threadLocal.set(new Pair<>(coroutineContext, objM14435c));
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m15611l0() {
        ThreadLocal<Pair<CoroutineContext, Object>> threadLocal = this.f42957d;
        if (threadLocal.get() == null) {
            return false;
        }
        threadLocal.set(null);
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlinx.coroutines.internal.C7166p, no.C7883z0
    /* JADX INFO: renamed from: o */
    public final void mo14467o(Object obj) {
        ThreadLocal<Pair<CoroutineContext, Object>> threadLocal = this.f42957d;
        Pair<CoroutineContext, Object> pair = threadLocal.get();
        if (pair != null) {
            ThreadContextKt.m14433a(pair.f38012a, pair.f38013b);
            threadLocal.set(null);
        }
        Object objM15571e = C7828f.m15571e(obj);
        InterfaceC9968c<T> interfaceC9968c = this.f40440c;
        CoroutineContext coroutineContextMo2029e = interfaceC9968c.mo2029e();
        Object objM14435c = ThreadContextKt.m14435c(coroutineContextMo2029e, null);
        C7863q1<?> c7863q1M14309c = objM14435c != ThreadContextKt.f40405a ? CoroutineContextKt.m14309c(interfaceC9968c, coroutineContextMo2029e, objM14435c) : null;
        try {
            interfaceC9968c.mo2031y(objM15571e);
            C9072e c9072e = C9072e.f47360a;
            if (c7863q1M14309c == null || c7863q1M14309c.m15611l0()) {
                ThreadContextKt.m14433a(coroutineContextMo2029e, objM14435c);
            }
        } catch (Throwable th2) {
            if (c7863q1M14309c == null || c7863q1M14309c.m15611l0()) {
                ThreadContextKt.m14433a(coroutineContextMo2029e, objM14435c);
            }
            throw th2;
        }
    }
}
