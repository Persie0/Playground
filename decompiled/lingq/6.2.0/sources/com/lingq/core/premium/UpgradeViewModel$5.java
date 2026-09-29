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
@c32(m4290c = "com.lingq.core.premium.UpgradeViewModel$5", m4291f = "UpgradeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class UpgradeViewModel$5 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f22400a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1853l f22401b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeViewModel$5(C1853l c1853l, Continuation continuation) {
        super(2, continuation);
        this.f22401b = c1853l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UpgradeViewModel$5 upgradeViewModel$5 = new UpgradeViewModel$5(this.f22401b, continuation);
        upgradeViewModel$5.f22400a = ((Boolean) obj).booleanValue();
        return upgradeViewModel$5;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        UpgradeViewModel$5 upgradeViewModel$5 = (UpgradeViewModel$5) create(bool, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        upgradeViewModel$5.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        boolean z = this.f22400a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1853l c1853l = this.f22401b;
        C3244l c3244l = c1853l.f22544h;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, wia.m23988a((wia) value, null, null, null, false, null, null, false, null, null, null, false, false, false, null, z && c1853l.f22548l, 1048575)));
        return xfa.f68157a;
    }
}
