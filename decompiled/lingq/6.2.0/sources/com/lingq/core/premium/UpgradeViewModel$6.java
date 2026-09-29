package com.lingq.core.premium;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.rn7;
import p000.wia;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.premium.UpgradeViewModel$6", m4291f = "UpgradeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class UpgradeViewModel$6 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f22402a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1853l f22403b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeViewModel$6(C1853l c1853l, Continuation continuation) {
        super(2, continuation);
        this.f22403b = c1853l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UpgradeViewModel$6 upgradeViewModel$6 = new UpgradeViewModel$6(this.f22403b, continuation);
        upgradeViewModel$6.f22402a = obj;
        return upgradeViewModel$6;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        UpgradeViewModel$6 upgradeViewModel$6 = (UpgradeViewModel$6) create((rn7) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        upgradeViewModel$6.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        rn7 rn7Var = (rn7) this.f22402a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f22403b.f22544h;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, wia.m23988a((wia) value, null, rn7Var.f59593c.f61065c, null, false, null, null, false, null, null, null, false, false, false, null, false, 2097149)));
        return xfa.f68157a;
    }
}
