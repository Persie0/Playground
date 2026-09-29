package coil.util;

import androidx.lifecycle.Lifecycle$State;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.AbstractC3572sf;
import p000.AbstractC3584sr;
import p000.C0829c;
import p000.C3386nv;
import p000.sm0;
import p000.tb5;
import p000.xfa;

/* JADX INFO: renamed from: coil.util.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0865a {
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m4981a(AbstractC3572sf abstractC3572sf, ContinuationImpl continuationImpl) throws Throwable {
        Lifecycles$awaitStarted$1 lifecycles$awaitStarted$1;
        AbstractC3572sf abstractC3572sf2;
        Ref$ObjectRef ref$ObjectRef;
        Throwable th;
        tb5 tb5Var;
        tb5 tb5Var2;
        if (continuationImpl instanceof Lifecycles$awaitStarted$1) {
            lifecycles$awaitStarted$1 = (Lifecycles$awaitStarted$1) continuationImpl;
            int i = lifecycles$awaitStarted$1.f10575d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lifecycles$awaitStarted$1.f10575d = i - Integer.MIN_VALUE;
            } else {
                lifecycles$awaitStarted$1 = new Lifecycles$awaitStarted$1(continuationImpl);
            }
        } else {
            lifecycles$awaitStarted$1 = new Lifecycles$awaitStarted$1(continuationImpl);
        }
        Object obj = lifecycles$awaitStarted$1.f10574c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = lifecycles$awaitStarted$1.f10575d;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            if (!abstractC3572sf.mo21327q().isAtLeast(Lifecycle$State.STARTED)) {
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                try {
                    lifecycles$awaitStarted$1.f10572a = abstractC3572sf;
                    lifecycles$awaitStarted$1.f10573b = ref$ObjectRef2;
                    lifecycles$awaitStarted$1.f10575d = 1;
                    sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(lifecycles$awaitStarted$1));
                    sm0Var.m21468u();
                    C0829c c0829c = new C0829c(sm0Var);
                    ref$ObjectRef2.f47718a = c0829c;
                    abstractC3572sf.mo21323g(c0829c);
                    if (sm0Var.m21466r() == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    abstractC3572sf2 = abstractC3572sf;
                    ref$ObjectRef = ref$ObjectRef2;
                    tb5Var2 = (tb5) ref$ObjectRef.f47718a;
                    if (tb5Var2 != null) {
                        abstractC3572sf2.mo21331x(tb5Var2);
                    }
                } catch (Throwable th2) {
                    abstractC3572sf2 = abstractC3572sf;
                    ref$ObjectRef = ref$ObjectRef2;
                    th = th2;
                    tb5Var = (tb5) ref$ObjectRef.f47718a;
                    if (tb5Var != null) {
                        abstractC3572sf2.mo21331x(tb5Var);
                    }
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$ObjectRef = lifecycles$awaitStarted$1.f10573b;
            abstractC3572sf2 = lifecycles$awaitStarted$1.f10572a;
            try {
                AbstractC3193b.m15359b(obj);
                tb5Var2 = (tb5) ref$ObjectRef.f47718a;
                if (tb5Var2 != null) {
                    abstractC3572sf2.mo21331x(tb5Var2);
                }
            } catch (Throwable th3) {
                th = th3;
                tb5Var = (tb5) ref$ObjectRef.f47718a;
                if (tb5Var != null) {
                    abstractC3572sf2.mo21331x(tb5Var);
                }
                throw th;
            }
        }
        return xfaVar;
    }
}
