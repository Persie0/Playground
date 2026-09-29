package androidx.lifecycle;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.AbstractC3572sf;
import p000.c32;
import p000.lb5;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", m4291f = "Lifecycle.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class LifecycleCoroutineScopeImpl$register$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f6317a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lb5 f6318b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScopeImpl$register$1(lb5 lb5Var, Continuation continuation) {
        super(2, continuation);
        this.f6318b = lb5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = new LifecycleCoroutineScopeImpl$register$1(this.f6318b, continuation);
        lifecycleCoroutineScopeImpl$register$1.f6317a = obj;
        return lifecycleCoroutineScopeImpl$register$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = (LifecycleCoroutineScopeImpl$register$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        lifecycleCoroutineScopeImpl$register$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        un1 un1Var = (un1) this.f6317a;
        lb5 lb5Var = this.f6318b;
        AbstractC3572sf abstractC3572sf = lb5Var.f49403a;
        if (abstractC3572sf.mo21327q().compareTo(Lifecycle$State.INITIALIZED) >= 0) {
            abstractC3572sf.mo21323g(lb5Var);
        } else {
            AbstractC3208a.m15436c(un1Var.mo1309x(), null);
        }
        return xfa.f68157a;
    }
}
