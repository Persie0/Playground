package com.lingq.core.premium;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.wia;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.premium.UpgradeViewModel$9", m4291f = "UpgradeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class UpgradeViewModel$9 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f22407a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1853l f22408b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeViewModel$9(C1853l c1853l, Continuation continuation) {
        super(2, continuation);
        this.f22408b = c1853l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UpgradeViewModel$9 upgradeViewModel$9 = new UpgradeViewModel$9(this.f22408b, continuation);
        upgradeViewModel$9.f22407a = ((Boolean) obj).booleanValue();
        return upgradeViewModel$9;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        UpgradeViewModel$9 upgradeViewModel$9 = (UpgradeViewModel$9) create(bool, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        upgradeViewModel$9.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        boolean z = this.f22407a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f22408b.f22544h;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, wia.m23988a((wia) value, null, null, null, false, null, null, false, null, null, null, false, z, false, null, false, 2031615)));
        return xfa.f68157a;
    }
}
