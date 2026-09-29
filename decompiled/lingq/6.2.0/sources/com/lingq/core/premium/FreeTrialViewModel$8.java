package com.lingq.core.premium;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.li3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.premium.FreeTrialViewModel$8", m4291f = "FreeTrialViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class FreeTrialViewModel$8 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1840b f22339a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreeTrialViewModel$8(C1840b c1840b, Continuation continuation) {
        super(2, continuation);
        this.f22339a = c1840b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FreeTrialViewModel$8(this.f22339a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        FreeTrialViewModel$8 freeTrialViewModel$8 = (FreeTrialViewModel$8) create(bool, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        freeTrialViewModel$8.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f22339a.f22415h;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, li3.m16234a((li3) value, null, null, null, null, false, null, false, new Integer(R$string.upgrade_purchase_server_problem), false, false, null, null, null, null, null, 524159)));
        return xfa.f68157a;
    }
}
