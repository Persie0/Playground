package kotlinx.coroutines.flow;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.SafeCollector;
import p000.C3386nv;
import p000.c83;
import p000.e83;
import p000.kk8;
import p000.xfa;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3221a implements c83 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) throws Throwable {
        AbstractFlow$collect$1 abstractFlow$collect$1;
        SafeCollector safeCollector;
        if (continuation instanceof AbstractFlow$collect$1) {
            abstractFlow$collect$1 = (AbstractFlow$collect$1) continuation;
            int i = abstractFlow$collect$1.f47803d;
            if ((i & Integer.MIN_VALUE) != 0) {
                abstractFlow$collect$1.f47803d = i - Integer.MIN_VALUE;
            } else {
                abstractFlow$collect$1 = new AbstractFlow$collect$1(this, continuation);
            }
        } else {
            abstractFlow$collect$1 = new AbstractFlow$collect$1(this, continuation);
        }
        Object obj = abstractFlow$collect$1.f47801b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = abstractFlow$collect$1.f47803d;
        xfa xfaVar = xfa.f68157a;
        if (i2 != 0) {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            safeCollector = abstractFlow$collect$1.f47800a;
            try {
                AbstractC3193b.m15359b(obj);
                safeCollector.releaseIntercepted();
                return xfaVar;
            } catch (Throwable th) {
                th = th;
                safeCollector.releaseIntercepted();
                throw th;
            }
        }
        AbstractC3193b.m15359b(obj);
        SafeCollector safeCollector2 = new SafeCollector(e83Var, abstractFlow$collect$1.getContext());
        try {
            abstractFlow$collect$1.f47800a = safeCollector2;
            abstractFlow$collect$1.f47803d = 1;
            try {
                Object objInvoke = ((kk8) this).f47456a.invoke(safeCollector2, abstractFlow$collect$1);
                if (objInvoke != coroutineSingletons) {
                    objInvoke = xfaVar;
                }
                if (objInvoke == coroutineSingletons) {
                    return coroutineSingletons;
                }
                safeCollector = safeCollector2;
                safeCollector.releaseIntercepted();
                return xfaVar;
            } catch (Throwable th2) {
                th = th2;
                safeCollector = safeCollector2;
                safeCollector.releaseIntercepted();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
