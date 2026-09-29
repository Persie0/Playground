package com.lingq.core.premium;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.pha;
import p000.wia;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.premium.UpgradeViewModel$13", m4291f = "UpgradeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class UpgradeViewModel$13 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f22392a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1853l f22393b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeViewModel$13(C1853l c1853l, Continuation continuation) {
        super(2, continuation);
        this.f22393b = c1853l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UpgradeViewModel$13 upgradeViewModel$13 = new UpgradeViewModel$13(this.f22393b, continuation);
        upgradeViewModel$13.f22392a = ((Boolean) obj).booleanValue();
        return upgradeViewModel$13;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        UpgradeViewModel$13 upgradeViewModel$13 = (UpgradeViewModel$13) create(bool, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        upgradeViewModel$13.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        boolean z = this.f22392a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1853l c1853l = this.f22393b;
        pha phaVar = c1853l.f22539c;
        C3244l c3244l = c1853l.f22544h;
        if (z) {
            do {
                value2 = c3244l.getValue();
            } while (!c3244l.m15570h(value2, wia.m23988a((wia) value2, null, null, null, false, null, null, false, null, phaVar.mo8561S0(), phaVar.mo8574o0(), false, false, false, null, false, 2095615)));
        } else {
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, wia.m23988a((wia) value, null, null, null, false, null, null, false, null, phaVar.mo8551H1(), phaVar.mo8555K0(), false, false, false, null, false, 2095615)));
        }
        return xfa.f68157a;
    }
}
