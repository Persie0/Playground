package androidx.compose.foundation;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.rv3;
import p000.un1;
import p000.v56;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$1", m4291f = "Clickable.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class AbstractClickableNode$onPointerEvent$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0075a f1642a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$onPointerEvent$1(AbstractC0075a abstractC0075a, Continuation continuation) {
        super(2, continuation);
        this.f1642a = abstractC0075a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AbstractClickableNode$onPointerEvent$1(this.f1642a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        AbstractClickableNode$onPointerEvent$1 abstractClickableNode$onPointerEvent$1 = (AbstractClickableNode$onPointerEvent$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        abstractClickableNode$onPointerEvent$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        AbstractC0075a abstractC0075a = this.f1642a;
        if (abstractC0075a.f1730Y == null) {
            rv3 rv3Var = new rv3();
            v56 v56Var = abstractC0075a.f1717L;
            if (v56Var != null) {
                wfb.m23926u(abstractC0075a.m9971N0(), null, null, new AbstractClickableNode$emitHoverEnter$1$1(v56Var, rv3Var, null), 3);
            }
            abstractC0075a.f1730Y = rv3Var;
        }
        return xfa.f68157a;
    }
}
