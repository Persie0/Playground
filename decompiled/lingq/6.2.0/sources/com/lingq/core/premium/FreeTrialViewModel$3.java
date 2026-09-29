package com.lingq.core.premium;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.li3;
import p000.ph3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.premium.FreeTrialViewModel$3", m4291f = "FreeTrialViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class FreeTrialViewModel$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f22332a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1840b f22333b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreeTrialViewModel$3(C1840b c1840b, Continuation continuation) {
        super(2, continuation);
        this.f22333b = c1840b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FreeTrialViewModel$3 freeTrialViewModel$3 = new FreeTrialViewModel$3(this.f22333b, continuation);
        freeTrialViewModel$3.f22332a = obj;
        return freeTrialViewModel$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        FreeTrialViewModel$3 freeTrialViewModel$3 = (FreeTrialViewModel$3) create((ph3) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        freeTrialViewModel$3.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        ph3 ph3Var = (ph3) this.f22332a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f22333b.f22415h;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, li3.m16234a((li3) value, ph3Var.f56213a, ph3Var.f56215c, ph3Var.f56214b, ph3Var.f56218f, ph3Var.f56216d, ph3Var.f56217e, false, null, ph3Var.f56219g, false, null, null, null, null, null, 523968)));
        return xfa.f68157a;
    }
}
