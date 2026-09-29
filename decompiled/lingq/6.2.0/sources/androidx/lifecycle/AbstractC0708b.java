package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3572sf;
import p000.C3386nv;
import p000.dp5;
import p000.eh0;
import p000.lb5;
import p000.lg3;
import p000.nn9;
import p000.ph2;
import p000.qn3;
import p000.r46;
import p000.ub5;
import p000.v72;
import p000.vz1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.lifecycle.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0708b {
    /* JADX INFO: renamed from: a */
    public static final lb5 m2508a(ub5 ub5Var) {
        ub5Var.getClass();
        AbstractC3572sf abstractC3572sfMo256K = ub5Var.mo256K();
        abstractC3572sfMo256K.getClass();
        qn3 qn3Var = (qn3) abstractC3572sfMo256K.f60774a;
        while (true) {
            lb5 lb5Var = (lb5) ((AtomicReference) qn3Var.f57974a).get();
            if (lb5Var != null) {
                return lb5Var;
            }
            nn9 nn9VarM20384i = r46.m20384i();
            v72 v72Var = ph2.f56212a;
            lb5 lb5Var2 = new lb5(abstractC3572sfMo256K, eh0.m11113J(nn9VarM20384i, dp5.f36000a.f68538f));
            AtomicReference atomicReference = (AtomicReference) qn3Var.f57974a;
            do {
                if (atomicReference.compareAndSet(null, lb5Var2)) {
                    v72 v72Var2 = ph2.f56212a;
                    wfb.m23926u(lb5Var2, dp5.f36000a.f68538f, null, new LifecycleCoroutineScopeImpl$register$1(lb5Var2, null), 2);
                    return lb5Var2;
                }
            } while (atomicReference.get() == null);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Object m2509b(AbstractC3572sf abstractC3572sf, Lifecycle$State lifecycle$State, zi3 zi3Var, Continuation continuation) {
        Object objM23649s;
        if (lifecycle$State != Lifecycle$State.INITIALIZED) {
            return (abstractC3572sf.mo21327q() != Lifecycle$State.DESTROYED && (objM23649s = vz1.m23649s(new RepeatOnLifecycleKt$repeatOnLifecycle$3(abstractC3572sf, lifecycle$State, zi3Var, null), continuation)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objM23649s : xfa.f68157a;
        }
        C3386nv.m17626m("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final Object m2510c(lg3 lg3Var, Lifecycle$State lifecycle$State, zi3 zi3Var, SuspendLambda suspendLambda) {
        lg3Var.m16179b();
        Object objM2509b = m2509b(lg3Var.f49626e, lifecycle$State, zi3Var, suspendLambda);
        return objM2509b == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2509b : xfa.f68157a;
    }
}
