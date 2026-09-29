package androidx.compose.foundation;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.rv3;
import p000.sv3;
import p000.un1;
import p000.v56;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$2", m4291f = "Clickable.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class AbstractClickableNode$onPointerEvent$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0075a f1643a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$onPointerEvent$2(AbstractC0075a abstractC0075a, Continuation continuation) {
        super(2, continuation);
        this.f1643a = abstractC0075a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AbstractClickableNode$onPointerEvent$2(this.f1643a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        AbstractClickableNode$onPointerEvent$2 abstractClickableNode$onPointerEvent$2 = (AbstractClickableNode$onPointerEvent$2) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        abstractClickableNode$onPointerEvent$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        AbstractC0075a abstractC0075a = this.f1643a;
        rv3 rv3Var = abstractC0075a.f1730Y;
        if (rv3Var != null) {
            sv3 sv3Var = new sv3(rv3Var);
            v56 v56Var = abstractC0075a.f1717L;
            if (v56Var != null) {
                wfb.m23926u(abstractC0075a.m9971N0(), null, null, new AbstractClickableNode$emitHoverExit$1$1$1(v56Var, sv3Var, null), 3);
            }
            abstractC0075a.f1730Y = null;
        }
        return xfa.f68157a;
    }
}
