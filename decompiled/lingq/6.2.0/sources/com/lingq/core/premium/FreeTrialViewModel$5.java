package com.lingq.core.premium;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.li3;
import p000.wh3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.premium.FreeTrialViewModel$5", m4291f = "FreeTrialViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class FreeTrialViewModel$5 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f22336a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1840b f22337b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreeTrialViewModel$5(C1840b c1840b, Continuation continuation) {
        super(2, continuation);
        this.f22337b = c1840b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FreeTrialViewModel$5 freeTrialViewModel$5 = new FreeTrialViewModel$5(this.f22337b, continuation);
        freeTrialViewModel$5.f22336a = obj;
        return freeTrialViewModel$5;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        FreeTrialViewModel$5 freeTrialViewModel$5 = (FreeTrialViewModel$5) create((wh3) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        freeTrialViewModel$5.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        wh3 wh3Var = (wh3) this.f22336a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f22337b.f22415h;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, li3.m16234a((li3) value, null, null, null, null, false, null, false, null, false, false, null, null, wh3Var.f66816a, wh3Var.f66817b, wh3Var.f66818c, 65535)));
        return xfa.f68157a;
    }
}
